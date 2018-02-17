package com.magpiehunt.magpie.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.magpiehunt.magpie.Adapters.CollectionAdapter;
import com.magpiehunt.magpie.Database.MagpieDatabase;
import com.magpiehunt.magpie.Entities.Collection;
import com.magpiehunt.magpie.R;

import java.util.ArrayList;
import java.util.List;

public class CollectionFragment extends Fragment {

    private static final String TAG = "CollectionFragment";

    protected RecyclerView mRecyclerView;
    protected CollectionAdapter mModelAdapter;
    protected RecyclerView.LayoutManager mLayoutManager;
    protected List<Collection> mDataset;
    protected MagpieDatabase magpieDatabase;


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public CollectionFragment() {
        // Required empty public constructor
    }


//    // TODO: Rename and change types and number of parameters
    public static CollectionFragment newInstance() {
        CollectionFragment fragment = new CollectionFragment();
        Bundle args = new Bundle();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        magpieDatabase = MagpieDatabase.getMagpieDatabase(this.getActivity());
        initializeData();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View rootView = inflater.inflate(R.layout.fragment_my_collections, container, false);
        rootView.setTag(TAG);

        Toolbar toolbar = getActivity().findViewById(R.id.my_toolbar);
        toolbar.setTitle("My Collections");

        mRecyclerView = rootView.findViewById(R.id.recyclerView);

        mLayoutManager = new LinearLayoutManager(getActivity());

        setRecyclerViewLayoutManager();

        MagpieDatabase db = MagpieDatabase.getMagpieDatabase(getActivity());
        //List<Collection> collections = db.collectionDao().getCollections();
        mModelAdapter = new CollectionAdapter(mDataset, CollectionFragment.TAG, this.getActivity());
        // Set the adapter for RecyclerView.
        mRecyclerView.setAdapter(mModelAdapter);

        mRecyclerView.setItemAnimator(new DefaultItemAnimator());

        return rootView;

    }
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        if (savedInstanceState != null) {
            //TODO: restore state of fragment
        }//end if
    }//end

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);

        //TODO: saved state of fragment here
    }//end

    public void setRecyclerViewLayoutManager() {
        int scrollPosition = 0;

        // If a layout manager has already been set, get current scroll position.
        if (mRecyclerView.getLayoutManager() != null) {
            scrollPosition = ((LinearLayoutManager) mRecyclerView.getLayoutManager()).findFirstCompletelyVisibleItemPosition();
        }//end if

        mLayoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.scrollToPosition(scrollPosition);
    }//end

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        void onFragmentInteraction(Uri uri);
    }

    // TODO: Replace the test data within this with data from room DB
    private void initializeData() {
        mDataset = new ArrayList<>();

        mDataset.addAll(MagpieDatabase.getMagpieDatabase(this.getActivity()).collectionDao().getCollections());
/*
        Collection testCollection = new Collection();
        testCollection.setName("Test Walk Talk");
        testCollection.setAbbreviation("TWT");
        mDataset.add(testCollection);

        testCollection = new Collection();
        testCollection.setName("Walk Test Mag");
        testCollection.setAbbreviation("WTM");
        mDataset.add(testCollection);

        testCollection = new Collection();
        testCollection.setName("Card Walk Test");
        testCollection.setAbbreviation("CWT");
        mDataset.add(testCollection);

        testCollection = new Collection();
        testCollection.setName("Walk onthe Wildside");
        testCollection.setAbbreviation("WOW");
        mDataset.add(testCollection);

        testCollection = new Collection();
        testCollection.setName("No Skipping Allowed");
        testCollection.setAbbreviation("NSA");
        mDataset.add(testCollection);

        testCollection = new Collection();
        testCollection.setName("Cards Are Easy");
        testCollection.setAbbreviation("CAE");
        mDataset.add(testCollection);

        testCollection = new Collection();
        testCollection.setName("Walk With Me");
        testCollection.setAbbreviation("WWM");
        mDataset.add(testCollection);

        testCollection = new Collection();
        testCollection.setName("The Last Walk");
        testCollection.setAbbreviation("TLW");
        mDataset.add(testCollection);
*/
    }//end
}