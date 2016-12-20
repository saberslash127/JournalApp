package com.bustamante.journalapp;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private SectionsPagerAdapter mSectionsPagerAdapter;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //create intent instance
        Intent i = new Intent(this, MyIntentService.class);
        startService(i);




        //create tabs

        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);
        //mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager(), 3);

        // Set up the ViewPager with the sections adapter.
        //mViewPager = (ViewPager) findViewById(R.id.container);
        //mViewPager.setAdapter(mSectionsPagerAdapter);

        //TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        //tabLayout.setupWithViewPager(mViewPager);

        //FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        //fab.setOnClickListener(new View.OnClickListener() {
            //@Override
            //public void onClick(View view) {
                //Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        //.setAction("Action", null).show();
            //}
        //});

    }

    public void newClick(View view) {
        Intent i = new Intent(this, WritingActivity.class);
        startActivity(i);
    }


    public class SectionsPagerAdapter extends FragmentPagerAdapter {
        int mNumOfTabs;

        public SectionsPagerAdapter(FragmentManager fm, int numOfTabs) {
            super(fm);
            this.mNumOfTabs = numOfTabs;
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case  0:
                    //PhotosFragment photos = new PhotosFragment();
                    //return photos;
                case  1:
                    //SongsFragment songs = new SongsFragment();
                    //return songs;
                case  2:
                    //VideosFragment videos = new VideosFragment();
                    //return videos;
                default:
                    return null;
            }
        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return mNumOfTabs;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "PHOTOS";
                case 1:
                    return "SONGS";
                case 2:
                    return "VIDEOS";
            }
            return null;
        }
    }
}