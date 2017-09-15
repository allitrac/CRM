package com.crm.sharepointevo.crm.Models;

/**
 * Created by ksfgh on 25/08/2017.
 */

public class ExpensesModel {

    private String mActivity, mOrderNo, mStatus;

    public ExpensesModel(String mActivity, String mOrderNo, String mStatus) {
        this.mActivity = mActivity;
        this.mOrderNo = mOrderNo;
        this.mStatus = mStatus;
    }

    public String getmActivity() {
        return mActivity;
    }

    public void setmActivity(String mActivity) {
        this.mActivity = mActivity;
    }

    public String getmOrderNo() {
        return mOrderNo;
    }

    public void setmOrderNo(String mOrderNo) {
        this.mOrderNo = mOrderNo;
    }

    public String getmStatus() {
        return mStatus;
    }

    public void setmStatus(String mStatus) {
        this.mStatus = mStatus;
    }
}
