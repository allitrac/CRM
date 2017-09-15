package com.crm.sharepointevo.crm.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.crm.sharepointevo.crm.Models.InProgressModel;
import com.crm.sharepointevo.crm.Models.MyTasksModel;
import com.crm.sharepointevo.crm.R;

import java.util.ArrayList;

/**
 * Created by ksfgh on 29/08/2017.
 */

public class MyTasksCellAdapter extends RecyclerView.Adapter<MyTasksCellAdapter.ViewHolder> {

    private ArrayList<MyTasksModel> myTasksModels;

    public MyTasksCellAdapter(ArrayList<MyTasksModel> expensesModels) {
        this.myTasksModels = expensesModels;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout, parent, false);
        MyTasksCellAdapter.ViewHolder viewHolder = new MyTasksCellAdapter.ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.mFirstCell.setText(myTasksModels.get(position).getmActivities());
        holder.mSecondCell.setText(myTasksModels.get(position).getmPriority());
        holder.mThirdCell.setText(myTasksModels.get(position).getmStatus());
    }

    @Override
    public int getItemCount() {
        return myTasksModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView mFirstCell, mSecondCell, mThirdCell;

        public ViewHolder(View itemView) {
            super(itemView);
            mFirstCell = (TextView) itemView.findViewById(R.id.tvFirstCell);
            mSecondCell = (TextView) itemView.findViewById(R.id.tvSecondCell);
            mThirdCell = (TextView) itemView.findViewById(R.id.tvThirdCell);
        }
    }
}
