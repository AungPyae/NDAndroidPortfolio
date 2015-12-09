package net.aung.portfolio.fragments;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import net.aung.portfolio.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * A placeholder fragment containing a simple view.
 */
public class PortfolioFragment extends Fragment {

    public static PortfolioFragment newInstance() {
        PortfolioFragment fragment = new PortfolioFragment();
        return fragment;
    }

    public PortfolioFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_portfolio, container, false);
        ButterKnife.bind(this, view);

        return view;
    }

    @OnClick(R.id.btn_spotify_streamer)
    public void onTapSpotifyStreamer() {
        String msg = String.format(getContext().getString(R.string.format_msg_err_open_app), getContext().getString(R.string.button_spotify_streamer));
        Toast.makeText(getContext(), msg, Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.btn_scores_app)
    public void onTapScoresApp() {
        String msg = String.format(getContext().getString(R.string.format_msg_err_open_app), getContext().getString(R.string.button_scores_app));
        Toast.makeText(getContext(), msg, Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.btn_library_app)
    public void onTapLibrary() {
        String msg = String.format(getContext().getString(R.string.format_msg_err_open_app), getContext().getString(R.string.button_library_app));
        Toast.makeText(getContext(), msg, Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.btn_build_it_bigger)
    public void onTapBuildItBigger() {
        String msg = String.format(getContext().getString(R.string.format_msg_err_open_app), getContext().getString(R.string.button_build_it_bigger));
        Toast.makeText(getContext(), msg, Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.btn_xyz_reader)
    public void onTapXYZReader() {
        String msg = String.format(getContext().getString(R.string.format_msg_err_open_app), getContext().getString(R.string.button_xyz_reader));
        Toast.makeText(getContext(), msg, Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.btn_capstone_my_own_app)
    public void onTapCapstoneMyOwnApp() {
        String msg = String.format(getContext().getString(R.string.format_msg_err_open_app), getContext().getString(R.string.button_capstone_my_own_app));
        Toast.makeText(getContext(), msg, Toast.LENGTH_SHORT).show();
    }
}
