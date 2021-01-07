package com.spotify.music.features.notificationsettings.channels;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.ui.fragments.r;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.music.C0707R;
import com.spotify.music.features.notificationsettings.common.Channel;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;
import com.spotify.pageloader.PageLoaderView;
import com.spotify.pageloader.t0;
import dagger.android.support.DaggerFragment;
import java.util.List;
import kotlin.jvm.internal.h;

public final class ChannelsFragment extends DaggerFragment implements s, c.a {
    public t0<List<Channel>> h0;
    public PageLoaderView.a<List<Channel>> i0;
    private PageLoaderView<List<Channel>> j0;

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        h.e(context, "context");
        String string = context.getString(C0707R.string.settings_notification_title);
        h.d(string, "context.getString(com.sp…tings_notification_title)");
        return string;
    }

    @Override // androidx.fragment.app.Fragment
    public void O3() {
        super.O3();
        t0<List<Channel>> t0Var = this.h0;
        if (t0Var != null) {
            t0Var.start();
        } else {
            h.k("pageLoader");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void P3() {
        t0<List<Channel>> t0Var = this.h0;
        if (t0Var != null) {
            t0Var.stop();
            super.P3();
            return;
        }
        h.k("pageLoader");
        throw null;
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public /* synthetic */ Fragment e() {
        return r.a(this);
    }

    @Override // com.spotify.music.libs.viewuri.c.a
    public c getViewUri() {
        c cVar = ViewUris.N1;
        h.d(cVar, "ViewUris.NOTIFICATION_SETTINGS_CHANNELS");
        return cVar;
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String i0() {
        return "internal:preferences:notification_settings_channels";
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        ij9 b = ij9.b(PageIdentifiers.SETTINGS_NOTIFICATIONS, null);
        h.d(b, "PageViewObservable.creat…s.SETTINGS_NOTIFICATIONS)");
        return b;
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.e(layoutInflater, "inflater");
        PageLoaderView.a<List<Channel>> aVar = this.i0;
        if (aVar != null) {
            PageLoaderView<List<Channel>> a = aVar.a(l4());
            h.d(a, "pageLoaderViewBuilder.createView(requireContext())");
            this.j0 = a;
            if (a != null) {
                t0<List<Channel>> t0Var = this.h0;
                if (t0Var != null) {
                    a.j0(this, t0Var);
                    PageLoaderView<List<Channel>> pageLoaderView = this.j0;
                    if (pageLoaderView != null) {
                        return pageLoaderView;
                    }
                    h.k("pageLoaderView");
                    throw null;
                }
                h.k("pageLoader");
                throw null;
            }
            h.k("pageLoaderView");
            throw null;
        }
        h.k("pageLoaderViewBuilder");
        throw null;
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        ifd ifd = kfd.H0;
        h.d(ifd, "FeatureIdentifiers.NOTIFICATION_SETTINGS");
        return ifd;
    }
}
