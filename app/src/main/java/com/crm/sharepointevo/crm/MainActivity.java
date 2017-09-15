package com.crm.sharepointevo.crm;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.crm.sharepointevo.crm.Fragments.BacklogsFragment;
import com.crm.sharepointevo.crm.Fragments.CalendarFragment;
import com.crm.sharepointevo.crm.Fragments.ExpensesFragment;
import com.crm.sharepointevo.crm.Fragments.InProgressFragment;
import com.crm.sharepointevo.crm.Fragments.MyTasksFragment;
import com.crm.sharepointevo.crm.Fragments.PendingFragment;

public class MainActivity extends AppCompatActivity {

    DrawerLayout drawer;
    private CalendarFragment calendarFragment = new CalendarFragment();
    private ExpensesFragment expensesFragment = new ExpensesFragment();
    private InProgressFragment inProgressFragment = new InProgressFragment();
    private MyTasksFragment myTasksFragment = new MyTasksFragment();
    private PendingFragment pendingFragment = new PendingFragment();
    private BacklogsFragment backlogsFragment = new BacklogsFragment();
    private RelativeLayout mSearchbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        itemClick(findViewById(R.id.llActivities));

        mSearchbar = (RelativeLayout) findViewById(R.id.searchbar);
    }

    Fragment oldFragment;
    private void switchFragment(Fragment fragment){

        if(oldFragment == fragment)
            return;

        oldFragment = fragment;

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .commit();


    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    TextView itemText;
    LinearLayout navItemBackground;
    public void itemClick(View view) {

        if(itemText != null)
            itemText.setTypeface(Typeface.DEFAULT);

        if(navItemBackground != null)
            navItemBackground.setBackgroundColor(Color.WHITE);

        switch (view.getId()){
            case R.id.llActivities:
                navItemBackground = (LinearLayout) findViewById(R.id.llActivities);
                itemText = (TextView) findViewById(R.id.tvActivities);
                getSupportActionBar().setTitle("Activities");
                break;
            case R.id.llMyTasks:
                navItemBackground = (LinearLayout) findViewById(R.id.llMyTasks);
                itemText = (TextView) findViewById(R.id.tvMyTasks);
                getSupportActionBar().setTitle("My Tasks");
                switchFragment(myTasksFragment);
                if(mSearchbar.getVisibility() == View.GONE)
                    mSearchbar.setVisibility(View.VISIBLE);
                break;
            case R.id.llBacklogs:
                navItemBackground = (LinearLayout) findViewById(R.id.llBacklogs);
                itemText = (TextView) findViewById(R.id.tvBacklogs);
                getSupportActionBar().setTitle("Backlogs");
                switchFragment(backlogsFragment);
                if(mSearchbar.getVisibility() == View.GONE)
                    mSearchbar.setVisibility(View.VISIBLE);
                break;
            case R.id.llPending:
                navItemBackground = (LinearLayout) findViewById(R.id.llPending);
                itemText = (TextView) findViewById(R.id.tvPending);
                getSupportActionBar().setTitle("Pending");
                switchFragment(pendingFragment);
                if(mSearchbar.getVisibility() == View.GONE)
                    mSearchbar.setVisibility(View.VISIBLE);
                break;
            case R.id.llInProgress:
                navItemBackground = (LinearLayout) findViewById(R.id.llInProgress);
                itemText = (TextView) findViewById(R.id.tvInProgress);
                getSupportActionBar().setTitle("In Progress");
                switchFragment(inProgressFragment);
                if(mSearchbar.getVisibility() == View.GONE)
                    mSearchbar.setVisibility(View.VISIBLE);
                break;
            case R.id.llCompleted:
                navItemBackground = (LinearLayout) findViewById(R.id.llCompleted);
                itemText = (TextView) findViewById(R.id.tvCompleted);
                getSupportActionBar().setTitle("Completed");
                break;
            case R.id.llExpenses:
                navItemBackground = (LinearLayout) findViewById(R.id.llExpenses);
                itemText = (TextView) findViewById(R.id.tvExpenses);
                getSupportActionBar().setTitle("Expenses");
                switchFragment(expensesFragment);
                if(mSearchbar.getVisibility() == View.GONE)
                    mSearchbar.setVisibility(View.VISIBLE);
                break;
            case R.id.llCalendar:
                navItemBackground = (LinearLayout) findViewById(R.id.llCalendar);
                itemText = (TextView) findViewById(R.id.tvCalendar);
                getSupportActionBar().setTitle("Calendar");
                switchFragment(calendarFragment);
                if(mSearchbar.getVisibility() == View.VISIBLE)
                    mSearchbar.setVisibility(View.GONE);
                break;
        }

        navItemBackground.setBackgroundColor(Color.parseColor("#eeeeee"));
        itemText.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
        drawer.closeDrawer(GravityCompat.START);
    }
}
