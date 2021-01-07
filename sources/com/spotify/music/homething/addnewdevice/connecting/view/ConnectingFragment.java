package com.spotify.music.homething.addnewdevice.connecting.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.content.a;
import androidx.fragment.app.Fragment;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.androidx.fragment.app.LifecycleListenableFragment;
import com.spotify.encore.foundation.R;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.ui.fragments.r;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.music.C0707R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

public class ConnectingFragment extends LifecycleListenableFragment implements s, vr9 {
    ur9 h0;
    private SpotifyIconDrawable i0;
    private TextView j0;
    private TextView k0;
    private TextView l0;
    private ProgressBar m0;

    private SpotifyIconDrawable K4(int i) {
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(F2(), SpotifyIconV2.CHECK, (float) nud.g(16.0f, F2().getResources()));
        spotifyIconDrawable.r(a.b(F2(), i));
        return spotifyIconDrawable;
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        return "Home Thing";
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void H3() {
        super.H3();
        ((wr9) this.h0).g();
    }

    public void L4() {
        this.j0.setCompoundDrawablesWithIntrinsicBounds(this.i0, (Drawable) null, (Drawable) null, (Drawable) null);
        this.j0.setTextColor(R2().getColor(R.color.white));
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void M3() {
        super.M3();
        ((wr9) this.h0).f(this);
    }

    public void M4() {
        this.k0.setCompoundDrawablesWithIntrinsicBounds(this.i0, (Drawable) null, (Drawable) null, (Drawable) null);
        this.k0.setTextColor(R2().getColor(R.color.white));
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void N3(Bundle bundle) {
        super.N3(bundle);
        ((wr9) this.h0).e(bundle);
    }

    public void N4() {
        this.l0.setCompoundDrawablesWithIntrinsicBounds(this.i0, (Drawable) null, (Drawable) null, (Drawable) null);
        this.l0.setTextColor(R2().getColor(R.color.white));
    }

    public void O4(int i) {
        this.m0.setProgress(i);
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void Q3(View view, Bundle bundle) {
        super.Q3(view, bundle);
        this.m0 = (ProgressBar) view.findViewById(C0707R.id.progress_bar);
        this.j0 = (TextView) view.findViewById(C0707R.id.transferring_spotify);
        this.k0 = (TextView) view.findViewById(C0707R.id.transferring_wifi);
        this.l0 = (TextView) view.findViewById(C0707R.id.waiting_for_reboot);
        this.i0 = K4(R.color.green);
        SpotifyIconDrawable K4 = K4(R.color.gray_50);
        this.l0.setCompoundDrawablesWithIntrinsicBounds(K4, (Drawable) null, (Drawable) null, (Drawable) null);
        this.k0.setCompoundDrawablesWithIntrinsicBounds(K4, (Drawable) null, (Drawable) null, (Drawable) null);
        this.j0.setCompoundDrawablesWithIntrinsicBounds(K4, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public /* synthetic */ Fragment e() {
        return r.a(this);
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String i0() {
        return "homething-connecting-fragment";
    }

    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        dagger.android.support.a.a(this);
        super.p3(context);
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void s3(Bundle bundle) {
        super.s3(bundle);
        ((wr9) this.h0).d(bundle);
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.HOMETHING_ACTIVATION_CONNECTING, null);
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C0707R.layout.fragment_connecting, viewGroup, false);
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        return kfd.r0;
    }
}
