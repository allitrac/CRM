package com.crm.sharepointevo.crm.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.crm.sharepointevo.crm.Models.BacklogsModel;
import com.crm.sharepointevo.crm.Models.PendingModel;
import com.crm.sharepointevo.crm.R;

import java.util.ArrayList;

/**
 * Created by ksfgh on 29/08/2017.
 */

public class BacklogsCellAdapter extends RecyclerView.Adapter<BacklogsCellAdapter.ViewHolder> {

    private ArrayList<BacklogsModel> backlogsModels;

    public BacklogsCellAdapter(ArrayList<BacklogsModel> backlogsModels) {
        this.backlogsModels = backlogsModels;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout, parent, false);
        BacklogsCellAdapter.ViewHolder viewHolder = new BacklogsCellAdapter.ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.mFirstCell.setText(backlogsModels.get(position).getmActivities());
        holder.mSecondCell.setText(backlogsModels.get(position).getmPriority());
        holder.mThirdCell.setText(backlogsModels.get(position).getmStatus());
    }

    @Override
    public int getItemCount() {
        return backlogsModels.size();
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
