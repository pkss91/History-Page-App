package com.example.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder>{

    private Context c;
    private List<Data> dataList;

    public RecyclerAdapter(Context c, List<Data> dataList) {
        this.c = c;
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public RecyclerAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(c).inflate(R.layout.recycler_view, parent, false);
        return new MyViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter.MyViewHolder holder, int position) {

        holder.name.setText("" + dataList.get(position).getSensorName());
        holder.time.setText("" + dataList.get(position).getEventTime());
        holder.date.setText("" + dataList.get(position).getEventDate());

    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView name;
        TextView time;
        TextView date;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            name = (TextView)itemView.findViewById(R.id.dataSensorName);
            time = (TextView)itemView.findViewById(R.id.dataEventTime);
            date = (TextView)itemView.findViewById(R.id.dataEventDate);

        }
    }
}