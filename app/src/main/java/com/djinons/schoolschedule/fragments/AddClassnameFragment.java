package com.djinons.schoolschedule.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.djinons.schoolschedule.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AddClassnameFragment extends Fragment {

    private static final String KEY_TITLE = "title";


    public AddClassnameFragment() {
        // Required empty public constructor
    }

    public static Fragment newInstance(String title) {
        AddClassnameFragment f = new AddClassnameFragment();
        Bundle args = new Bundle();
        args.putString(KEY_TITLE, title);
        f.setArguments(args);
        return (f);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_add_classname, container, false);
    }

}
