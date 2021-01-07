package com.spotify.music.features.remoteconfig.fragments;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.spotify.androidx.fragment.app.LifecycleListenableFragment;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.instrumentation.a;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.music.C0707R;
import com.spotify.remoteconfig.AppsMusicFeaturesRemoteconfigurationProperties;

public class RemoteConfigurationFragment extends LifecycleListenableFragment implements s, mfd {
    private Button h0;
    private TextView i0;
    e0e j0;
    AppsMusicFeaturesRemoteconfigurationProperties k0;

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        return context.getString(C0707R.string.remoteconfiguration_fragment_title);
    }

    public void K4(View view) {
        this.h0.setBackgroundColor(Color.parseColor(this.k0.b().toString()));
        int i = this.k0.a() ? 50 : 0;
        this.h0.setPadding(i, i, i, i);
        this.i0.setText(this.k0.c().toString());
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public Fragment e() {
        return this;
    }

    @Override // defpackage.mfd
    public a g1() {
        return PageIdentifiers.REMOTECONFIGURATION_DEBUG;
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String i0() {
        return "fragment_remoteconfiguration";
    }

    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        dagger.android.support.a.a(this);
        super.p3(context);
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.REMOTECONFIGURATION_DEBUG, null);
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(C0707R.layout.fragment_remoteconfiguration, viewGroup, false);
        this.h0 = (Button) viewGroup2.findViewById(C0707R.id.remote_config_button);
        this.i0 = (TextView) viewGroup2.findViewById(C0707R.id.remote_config_text);
        ((Button) viewGroup2.findViewById(C0707R.id.remote_config_button_refresh)).setOnClickListener(new c(this));
        ((Button) viewGroup2.findViewById(C0707R.id.remote_config_button_activate)).setOnClickListener(new a(this));
        ((Button) viewGroup2.findViewById(C0707R.id.remote_config_button_fetch)).setOnClickListener(new b(this));
        return viewGroup2;
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        return kfd.b1;
    }
}
