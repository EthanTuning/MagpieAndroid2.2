package com.magpiehunt.magpie.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.magpiehunt.magpie.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link LandmarkFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link LandmarkFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class LandmarkFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER

    //Keys
    private static final String CID = "CID";
    private static final String LID = "LID";
    private static final String LANDMARK_NAME = "LandmarkName";
    private static final String BADGE_ID = "BadgeID";
    private static final String LANDMARK_DESCRIPTION = "LandmarkDescription";
    private static final String LATITUDE = "Latitude";
    private static final String LONGITUDE = "Longitude";
    private static final String PIC_ID = "PicID";
    private static final String QR_CODE = "QRCode";

    public static String TAG = "LandmarkFragment";


    //Members
    //TODO give landmark a subtitle field
    private int cid;
    private int lid;
    private String landmarkName;
    private int badgeID;
    private String landmarkDescription;
    private double latitude;
    private double longitude;
    private int picID;
    private String qrCode;
    private OnFragmentInteractionListener mListener;

    //Views
    private TextView landmarkNameTv;
    private TextView descriptionTv;


    public LandmarkFragment() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static LandmarkFragment newInstance(Bundle args) {
        LandmarkFragment fragment = new LandmarkFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            cid = getArguments().getInt(CID);
            lid = getArguments().getInt(LID);
            landmarkName = getArguments().getString(LANDMARK_NAME);
            landmarkDescription = getArguments().getString(LANDMARK_DESCRIPTION);
            badgeID = getArguments().getInt(BADGE_ID);
            latitude = getArguments().getDouble(LATITUDE);
            longitude = getArguments().getDouble(LONGITUDE);
            picID = getArguments().getInt(PIC_ID);
            qrCode = getArguments().getString(QR_CODE);


        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_landmark, container, false);
        //initialize views

        if (((AppCompatActivity)getActivity()).getSupportActionBar() != null){
            ((AppCompatActivity)getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            ((AppCompatActivity)getActivity()).getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
        this.landmarkNameTv = rootView.findViewById(R.id.landmarkName);
        this.descriptionTv = rootView.findViewById(R.id.landmarkDescription);

        landmarkNameTv.setText(this.landmarkName);
        descriptionTv.setText(this.landmarkDescription);

        //set views
        //change text


        return rootView;
    }

    public void onButtonPressed(Uri uri) {
        //TODO implement this before release, just for testing

        /*if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }*/
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        //TODO implement this before release, just for testing

        /*if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }*/
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
    //TODO implement this before release, just for testing

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
