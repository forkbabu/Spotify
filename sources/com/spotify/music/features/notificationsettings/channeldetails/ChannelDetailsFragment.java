package com.spotify.music.features.notificationsettings.channeldetails;

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
import com.spotify.music.features.notificationsettings.common.a;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;
import com.spotify.pageloader.PageLoaderView;
import com.spotify.pageloader.t0;
import dagger.android.support.DaggerFragment;
import java.io.Serializable;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.h;

public final class ChannelDetailsFragment extends DaggerFragment implements s, c.a {
    public zac h0;
    public PageLoaderView.a<Pair<List<a>, Channel>> i0;
    public m j0;
    private t0<Pair<List<a>, Channel>> k0;
    private PageLoaderView<Pair<List<a>, Channel>> l0;

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        h.e(context, "context");
        Bundle D2 = D2();
        Serializable serializable = D2 != null ? D2.getSerializable("SELECTED_CHANNEL") : null;
        if (serializable != null) {
            int ordinal = ((Channel) serializable).ordinal();
            if (ordinal == 0) {
                String string = context.getString(C0707R.string.push_notifications);
                h.d(string, "context.getString(R.string.push_notifications)");
                return string;
            } else if (ordinal == 1) {
                String string2 = context.getString(C0707R.string.email_notifications);
                h.d(string2, "context.getString(R.string.email_notifications)");
                return string2;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            throw new NullPointerException("null cannot be cast to non-null type com.spotify.music.features.notificationsettings.common.Channel");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void O3() {
        super.O3();
        t0<Pair<List<a>, Channel>> t0Var = this.k0;
        if (t0Var != null) {
            t0Var.start();
        } else {
            h.k("pageLoader");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void P3() {
        t0<Pair<List<a>, Channel>> t0Var = this.k0;
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
        c cVar = ViewUris.O1;
        h.d(cVar, "ViewUris.NOTIFICATION_SETTINGS_CHANNEL_DETAILS");
        return cVar;
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String i0() {
        return "internal:preferences:notification_settings_channel_details";
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        ij9 b = ij9.b(PageIdentifiers.SETTINGS_NOTIFICATIONS_CHANNEL_DETAILS, null);
        h.d(b, "PageViewObservable.creat…ICATIONS_CHANNEL_DETAILS)");
        return b;
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.e(layoutInflater, "inflater");
        Bundle D2 = D2();
        Serializable serializable = D2 != null ? D2.getSerializable("SELECTED_CHANNEL") : null;
        if (serializable != null) {
            Channel channel = (Channel) serializable;
            zac zac = this.h0;
            if (zac != null) {
                m mVar = this.j0;
                if (mVar != null) {
                    t0<Pair<List<a>, Channel>> a = zac.a(mVar.a(channel));
                    h.d(a, "pageLoaderFactory.create…oadable(selectedChannel))");
                    this.k0 = a;
                    PageLoaderView.a<Pair<List<a>, Channel>> aVar = this.i0;
                    if (aVar != null) {
                        PageLoaderView<Pair<List<a>, Channel>> a2 = aVar.a(l4());
                        h.d(a2, "pageLoaderViewBuilder.createView(requireContext())");
                        this.l0 = a2;
                        if (a2 != null) {
                            t0<Pair<List<a>, Channel>> t0Var = this.k0;
                            if (t0Var != null) {
                                a2.j0(this, t0Var);
                                PageLoaderView<Pair<List<a>, Channel>> pageLoaderView = this.l0;
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
                h.k("loadableFactory");
                throw null;
            }
            h.k("pageLoaderFactory");
            throw null;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.spotify.music.features.notificationsettings.common.Channel");
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        ifd ifd = kfd.H0;
        h.d(ifd, "FeatureIdentifiers.NOTIFICATION_SETTINGS");
        return ifd;
    }
}
