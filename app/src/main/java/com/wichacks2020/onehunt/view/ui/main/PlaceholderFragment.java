package com.wichacks2020.onehunt.view.ui.main;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.widget.BaseAdapter;

import com.wichacks2020.onehunt.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class PlaceholderFragment extends Fragment {

    private static final String ARG_SECTION_NUMBER = "section_number";
    private CustomAdapter customAdapter;

    public static PlaceholderFragment newInstance(int index) {
        PlaceholderFragment fragment = new PlaceholderFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(ARG_SECTION_NUMBER, index);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_main, container, false);

        ListView listView = root.findViewById(R.id.list_view);

        customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);

        //getArguments().getInt(ARG_SECTION_NUMBER);
        return root;
    }

    //region CustomAdapter Class
    /*
     * Populate the listView with the values from the database
     */
    class CustomAdapter extends BaseAdapter {

//        Database db = Room.databaseBuilder(getApplicationContext(), Database.class,
//                "database").fallbackToDestructiveMigration().allowMainThreadQueries().build();

//        List<Report> reports = getReports();
//
//
//        /**
//         * Get the list of posts by only favorited users
//         */
//        public List<Report> getReports() {
//            //Get all posts in reverse chronological order
//            List<Report> reports = db.reportDao().selectAllReports();
//            Collections.reverse(reports);
//            return reports;
//        }

        List<String> test = getApplications();

        public List<String> getApplications(){
            List<String> output = new ArrayList<String>();
            output.add("item1");
            output.add("item2");
            output.add("item3");
            output.add("item4");
            output.add("item5");
            output.add("item6");
            output.add("item7");
            output.add("item8");
            output.add("item9");
            output.add("item10");



            return output;
        }

        /**
         * getCount should return the size of the post
         */
        @Override
        public int getCount() {
            return test.size();
        }

        /**
         * getItem(i) should return the post at i
         */
        @Override
        public Object getItem(int i) {
            return test.get(i);
        }

        /*
         * getItemId(i) should return the id of the post at i
         */
        @Override
        public long getItemId(int i) {
            return i;
        }

        public String getItemStringId(int i){
            return test.get(i);
        }

        /**
         * create the view for each post(i)
         */
        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            view = getLayoutInflater().inflate(R.layout.application_list_view, null);

            TextView textView = view.findViewById(R.id.list_text_view);

            textView.setText(test.get(i));
            Log.v("PlaceholderFragment", "Value="+test.get(i));
            return view;
        }

    }
    //endregion
}

