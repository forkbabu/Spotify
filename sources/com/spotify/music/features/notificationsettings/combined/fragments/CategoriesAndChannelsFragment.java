package com.spotify.music.features.notificationsettings.combined.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.spotify.androidx.fragment.app.LifecycleListenableFragment;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.ui.fragments.r;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.mobile.android.util.o0;
import com.spotify.music.C0707R;
import com.spotify.music.features.notificationsettings.combined.e;
import com.spotify.music.features.notificationsettings.combined.f;
import com.spotify.music.features.notificationsettings.combined.h;
import dagger.android.support.a;

public class CategoriesAndChannelsFragment extends LifecycleListenableFragment implements s {
    e h0;
    o0 i0;
    private f j0;

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        return context.getString(C0707R.string.settings_notification_title);
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void N3(Bundle bundle) {
        super.N3(bundle);
        ((h) this.j0).d(bundle);
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public /* synthetic */ Fragment e() {
        return r.a(this);
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String i0() {
        return "internal:preferences_push_notification";
    }

    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        a.a(this);
        super.p3(context);
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void s3(Bundle bundle) {
        super.s3(bundle);
        B4(true);
        u4(true);
        h hVar = new h(l4(), R2(), this.i0);
        this.j0 = hVar;
        hVar.g(this.h0, bundle);
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.SETTINGS_NOTIFICATIONS, null);
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void v3(Menu menu, MenuInflater menuInflater) {
        menu.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return ((h) this.j0).a(layoutInflater, viewGroup);
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void x3() {
        super.x3();
        ((h) this.j0).h();
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        return kfd.H0;
    }
}
