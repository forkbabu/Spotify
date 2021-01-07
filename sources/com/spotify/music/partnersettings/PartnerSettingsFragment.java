package com.spotify.music.partnersettings;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.spotify.androidx.fragment.app.LifecycleListenableFragment;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.ui.fragments.r;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobius.MobiusLoop;
import com.spotify.music.C0707R;
import com.spotify.music.libs.viewuri.c;
import dagger.android.support.a;

public class PartnerSettingsFragment extends LifecycleListenableFragment implements s, c.a {
    public static final String j0;
    private final c h0 = c.a(j0);
    MobiusLoop.g<ddc, bdc> i0;

    static {
        s52 a = t52.a(LinkType.NAVIGATION_APPS_SETTINGS);
        a.getClass();
        j0 = a.b().get(0);
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        return context.getResources().getString(C0707R.string.partner_settings_title);
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void H3() {
        super.H3();
        this.i0.stop();
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void M3() {
        super.M3();
        if (!this.i0.isRunning()) {
            this.i0.start();
        }
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public /* synthetic */ Fragment e() {
        return r.a(this);
    }

    @Override // com.spotify.music.libs.viewuri.c.a
    public c getViewUri() {
        return this.h0;
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String i0() {
        return "navigation_apps_settings";
    }

    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        a.a(this);
        super.p3(context);
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.SETTINGS_APPS, null);
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        aec aec = new aec(layoutInflater, viewGroup);
        this.i0.c(aec);
        return aec.h();
    }

    @Override // androidx.fragment.app.Fragment
    public void y3() {
        super.y3();
        this.i0.d();
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        return kfd.c;
    }
}
