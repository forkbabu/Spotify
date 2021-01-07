package com.spotify.music.features.quicksilver.qa;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.androidx.fragment.app.LifecycleListenableFragment;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.music.features.quicksilver.utils.g;
import dagger.android.support.a;

public class QuicksilverDebugFragment extends LifecycleListenableFragment {
    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        a.a(this);
        super.p3(context);
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        SpSharedPreferences.b<Object, Boolean> bVar = g.a;
        throw null;
    }
}
