package amp.applications.com.amplifier.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTabHost;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import amp.applications.com.amplifier.R;

public class FrontPanelFragment extends Fragment {

    private FragmentTabHost fragmentTabHost;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        fragmentTabHost = new FragmentTabHost(getActivity());
        fragmentTabHost.setup(getActivity(), getChildFragmentManager(), R.layout.fragment_front_panel);

        Bundle bundle = new Bundle();
        bundle.putInt("Arg for Frag1", 1);
        fragmentTabHost.addTab(fragmentTabHost.newTabSpec("Normal").setIndicator("Normal"), NormalFragment.class, bundle);

        Bundle bundle1 = new Bundle();
        bundle1.putInt("Arg for Frag2", 2);
        fragmentTabHost.addTab(fragmentTabHost.newTabSpec("Vibrato").setIndicator("Vibrato"), VibratoFragment.class, bundle1);

        return fragmentTabHost;
    }
}
