package com.example.cs374.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by cs374 on 10/19/16.
 */
public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment(){
        return new CrimeListFragment();

    }
}
