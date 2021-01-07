package com.spotify.music.features.topic;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.n;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig;
import com.spotify.android.glue.patterns.toolbarmenu.a0;
import com.spotify.android.glue.patterns.toolbarmenu.d0;
import com.spotify.androidx.fragment.app.LifecycleListenableFragment;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.instrumentation.a;
import com.spotify.mobile.android.ui.fragments.r;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;
import com.spotify.pageloader.PageLoaderView;
import com.spotify.pageloader.t0;
import kotlin.jvm.internal.h;

public final class TopicFragment extends LifecycleListenableFragment implements s, mfd, ToolbarConfig.b, d0 {
    public String h0;
    public t0<b91> i0;
    public PageLoaderView.a<b91> j0;
    private PageLoaderView<b91> k0;
    public wlf<a> l0;

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        h.e(context, "context");
        return "";
    }

    @Override // com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig.b
    public boolean G() {
        return true;
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void O3() {
        super.O3();
        PageLoaderView<b91> pageLoaderView = this.k0;
        if (pageLoaderView != null) {
            n b3 = b3();
            t0<b91> t0Var = this.i0;
            if (t0Var != null) {
                pageLoaderView.j0(b3, t0Var);
                t0<b91> t0Var2 = this.i0;
                if (t0Var2 != null) {
                    t0Var2.start();
                } else {
                    h.k("pageLoader");
                    throw null;
                }
            } else {
                h.k("pageLoader");
                throw null;
            }
        } else {
            h.k("pageLoaderView");
            throw null;
        }
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void P3() {
        super.P3();
        t0<b91> t0Var = this.i0;
        if (t0Var != null) {
            t0Var.stop();
        } else {
            h.k("pageLoader");
            throw null;
        }
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public /* synthetic */ Fragment e() {
        return r.a(this);
    }

    @Override // com.spotify.android.glue.patterns.toolbarmenu.d0
    public void g(a0 a0Var) {
        h.e(a0Var, "toolbarMenu");
    }

    @Override // defpackage.mfd
    public a g1() {
        return PageIdentifiers.TOPIC;
    }

    @Override // com.spotify.music.libs.viewuri.c.a
    public c getViewUri() {
        c.b bVar = ViewUris.F2;
        String str = this.h0;
        if (str != null) {
            c b = bVar.b(str);
            h.d(b, "ViewUris.TOPIC.verify(topicUri)");
            return b;
        }
        h.k("topicUri");
        throw null;
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String i0() {
        String bVar = ViewUris.F2.toString();
        h.d(bVar, "ViewUris.TOPIC.toString()");
        return bVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        h.e(context, "context");
        dagger.android.support.a.a(this);
        super.p3(context);
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        ij9 b = ij9.b(PageIdentifiers.TOPIC, null);
        h.d(b, "PageViewObservable.create(PageIdentifiers.TOPIC)");
        return b;
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.e(layoutInflater, "inflater");
        PageLoaderView.a<b91> aVar = this.j0;
        if (aVar != null) {
            PageLoaderView<b91> a = aVar.a(l4());
            h.d(a, "pageLoaderViewBuilder.createView(requireContext())");
            this.k0 = a;
            if (a != null) {
                return a;
            }
            h.k("pageLoaderView");
            throw null;
        }
        h.k("pageLoaderViewBuilder");
        throw null;
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        ifd ifd = kfd.t1;
        h.d(ifd, "FeatureIdentifiers.TOPIC");
        return ifd;
    }
}
