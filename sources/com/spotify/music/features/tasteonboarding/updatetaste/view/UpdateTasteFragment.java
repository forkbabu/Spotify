package com.spotify.music.features.tasteonboarding.updatetaste.view;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.spotify.androidx.fragment.app.LifecycleListenableFragment;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.instrumentation.a;
import com.spotify.mobile.android.ui.fragments.r;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.music.C0707R;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;

public class UpdateTasteFragment extends LifecycleListenableFragment implements wq8, c.a, s, mfd, ws2 {
    vq8 h0;
    private TextView i0;

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        return "";
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void O3() {
        super.O3();
        this.h0.b(this);
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void P3() {
        super.P3();
        this.h0.a();
    }

    @Override // defpackage.ws2
    public boolean b() {
        return true;
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public /* synthetic */ Fragment e() {
        return r.a(this);
    }

    @Override // defpackage.mfd
    public a g1() {
        return PageIdentifiers.FREETIER_TASTEONBOARDING_UPDATETASTE;
    }

    @Override // com.spotify.music.libs.viewuri.c.a
    public c getViewUri() {
        return ViewUris.T;
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String i0() {
        return kfd.k0.getName();
    }

    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        dagger.android.support.a.a(this);
        super.p3(context);
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.FREETIER_TASTEONBOARDING_UPDATETASTE, ViewUris.T.toString());
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C0707R.layout.fragment_free_tier_taste_onboarding_update_taste_stockholm_black, viewGroup, false);
        this.i0 = (TextView) inflate.findViewById(C0707R.id.textview);
        inflate.addOnLayoutChangeListener(new b(this, inflate));
        return inflate;
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        return kfd.k0;
    }
}
