package com.spotify.music.features.followfeed;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.n;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.ui.fragments.r;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.music.features.followfeed.persistence.a;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;
import com.spotify.pageloader.PageLoaderView;
import defpackage.a35;
import defpackage.u25;
import kotlin.jvm.internal.h;

public final class FollowFeedFragment extends Fragment implements s, mfd, c.a, ToolbarConfig.d, ToolbarConfig.c, ToolbarConfig.a, ws2 {
    public c25 g0;
    public a h0;
    public ys2 i0;
    public cbc<r25> j0;
    public PageLoaderView.a<r25> k0;

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        h.e(context, "context");
        return "";
    }

    @Override // androidx.fragment.app.Fragment
    public void O3() {
        super.O3();
        ys2 ys2 = this.i0;
        if (ys2 != null) {
            ys2.I1(this);
        } else {
            h.k("fragmentContainer");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void P3() {
        super.P3();
        ys2 ys2 = this.i0;
        if (ys2 != null) {
            ys2.I1(null);
        } else {
            h.k("fragmentContainer");
            throw null;
        }
    }

    @Override // defpackage.ws2
    public boolean b() {
        c25 c25 = this.g0;
        if (c25 != null) {
            c25.b(u25.b.a);
            c25 c252 = this.g0;
            if (c252 != null) {
                c252.a(a35.d.a);
                a aVar = this.h0;
                if (aVar != null) {
                    aVar.e();
                    return false;
                }
                h.k("cacheManager");
                throw null;
            }
            h.k("followFeedLogger");
            throw null;
        }
        h.k("followFeedLogger");
        throw null;
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public /* synthetic */ Fragment e() {
        return r.a(this);
    }

    @Override // defpackage.mfd
    public com.spotify.instrumentation.a g1() {
        return PageIdentifiers.FOLLOWFEED;
    }

    @Override // com.spotify.music.libs.viewuri.c.a
    public c getViewUri() {
        c cVar = ViewUris.e;
        h.d(cVar, "ViewUris.FOLLOWFEED");
        return cVar;
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String i0() {
        return "spotify:followfeed";
    }

    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        h.e(context, "context");
        super.p3(context);
        dagger.android.support.a.a(this);
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        ij9 b = ij9.b(PageIdentifiers.FOLLOWFEED, null);
        h.d(b, "PageViewObservable.create(pageIdentifier)");
        return b;
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.e(layoutInflater, "inflater");
        PageLoaderView.a<r25> aVar = this.k0;
        if (aVar != null) {
            PageLoaderView<r25> a = aVar.a(l4());
            h.d(a, "pageLoaderViewBuilder.createView(requireContext())");
            n b3 = b3();
            cbc<r25> cbc = this.j0;
            if (cbc != null) {
                a.j0(b3, cbc.get());
                return a;
            }
            h.k("pageLoaderScope");
            throw null;
        }
        h.k("pageLoaderViewBuilder");
        throw null;
    }

    @Override // com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig.a
    public ToolbarConfig.Visibility z0() {
        return ToolbarConfig.Visibility.HIDE;
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        ifd ifd = kfd.d0;
        h.d(ifd, "FeatureIdentifiers.FOLLOW_FEED");
        return ifd;
    }
}
