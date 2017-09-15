package com.crm.sharepointevo.crm.Models;

/**
 * Created by ksfgh on 29/08/2017.
 */

public class MyTasksModel {
    private String mActivities, mPriority, mStatus;

    public MyTasksModel(String mActivities, String mPriority, String mStatus) {
        this.mActivities = mActivities;
        this.mPriority = mPriority;
        this.mStatus = mStatus;
    }

    public String getmActivities() {
        return mActivities;
    }

    public void setmActivities(String mActivities) {
        this.mActivities = mActivities;
    }

    public String getmPriority() {
        return mPriority;
    }

    public void setmPriority(String mPriority) {
        this.mPriority = mPriority;
    }

    public String getmStatus() {
        return mStatus;
    }

    public void setmStatus(String mStatus) {
        this.mStatus = mStatus;
    }
}
