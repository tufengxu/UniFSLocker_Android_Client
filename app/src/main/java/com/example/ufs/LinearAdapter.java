package com.example.ufs;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.List;

public class LinearAdapter extends RecyclerView.Adapter<LinearAdapter.LinearViewHolder> {

    private Context mContext;
    private List<String> list = Arrays.asList("FILE #1", "FILE #2", "FILE #3");

    public LinearAdapter(Context context) {
        this.mContext = context;
    }

    @Override
    public LinearAdapter.LinearViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new LinearViewHolder(LayoutInflater.from(mContext).
                   inflate(R.layout.layout_linear_item, parent, false));
    }

    @Override
    public void onBindViewHolder(LinearAdapter.LinearViewHolder holder, int position) {
        for (String s : list)
            holder.textView.setText(s);
//        holder.textView.setText("Hello World!");
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class LinearViewHolder extends RecyclerView.ViewHolder {
        private TextView textView;

        public LinearViewHolder(View itemView) {
            super(itemView);
//            TextView textView = null;
//            for (int ii = 0; ii < list.size(); ii++) {
//                list.get(ii) = new TextView(this);
//            }
            textView = itemView.findViewById(R.id.tv_title);
        }
    }
}
