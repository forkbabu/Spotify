package com.spotify.music.features.premiumdestination.debug;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.C0707R;
import dagger.android.support.DaggerFragment;
import dagger.android.support.a;

public class PremiumPageDebugFragment extends DaggerFragment {
    @Override // dagger.android.support.DaggerFragment, androidx.fragment.app.Fragment
    public void p3(Context context) {
        a.a(this);
        super.p3(context);
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(C0707R.layout.debug_preview_cta, viewGroup, false);
        viewGroup2.findViewById(C0707R.id.btn_preview).setOnClickListener(new a(this));
        return viewGroup2;
    }
}
