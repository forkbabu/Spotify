package com.spotify.page.hosting;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.spotify.mobile.android.ui.fragments.r;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.page.lifetime.PageLifetimeHolder;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.a;
import kotlin.d;
import kotlin.jvm.internal.h;

public final class PageHostingFragment extends Fragment implements s, zsd {
    private final d g0;
    private final d h0;
    private final d i0;
    private final PageLifetimeHolder j0;
    private final d k0;
    private final d l0;
    private btd m0;
    private final Map<String, usd<Parcelable>> n0;

    public PageHostingFragment(Map<String, usd<Parcelable>> map) {
        h.e(map, "pageRegistry");
        this.n0 = map;
        this.g0 = a.b(new PageHostingFragment$pageKey$2(this));
        this.h0 = a.b(new PageHostingFragment$pageParameters$2(this));
        this.i0 = a.b(new PageHostingFragment$pageProvider$2(this));
        this.j0 = new PageLifetimeHolder(this, new PageHostingFragment$pageLifetimeHolder$1(this));
        this.k0 = a.b(new PageHostingFragment$pageMetadata$2(this));
        this.l0 = a.b(new PageHostingFragment$pageCapabilities$2(this));
    }

    public static final psd K4(PageHostingFragment pageHostingFragment) {
        return pageHostingFragment.j0.e().a();
    }

    public static final usd L4(PageHostingFragment pageHostingFragment) {
        return (usd) pageHostingFragment.i0.getValue();
    }

    private final qsd P4() {
        return (qsd) this.k0.getValue();
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        h.e(context, "context");
        vsd a = P4().a();
        if (a instanceof ysd) {
            return ((ysd) a).a();
        }
        if (a instanceof xsd) {
            String string = context.getString(((xsd) a).a());
            h.d(string, "context.getString(resourceId)");
            return string;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void N4() {
        this.j0.d();
    }

    public final String O4() {
        return (String) this.g0.getValue();
    }

    public final Parcelable Q4() {
        return (Parcelable) this.h0.getValue();
    }

    @Override // defpackage.zsd
    public <T extends atd> T U1(Class<T> cls) {
        h.e(cls, "capability");
        return (T) ((atd) kotlin.collections.d.l(kotlin.collections.d.i((Set) this.l0.getValue(), cls)));
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public /* synthetic */ Fragment e() {
        return r.a(this);
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String i0() {
        return P4().c();
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        return P4().d();
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.e(layoutInflater, "inflater");
        btd b = this.j0.e().a().b().b();
        this.m0 = b;
        Context l4 = l4();
        h.d(l4, "requireContext()");
        h.c(viewGroup);
        LayoutInflater M2 = M2();
        h.d(M2, "layoutInflater");
        b.c(l4, viewGroup, M2, new ftd(this));
        return b.b();
    }

    @Override // androidx.fragment.app.Fragment
    public void y3() {
        btd btd = this.m0;
        if (btd != null) {
            btd.a();
        }
        this.m0 = null;
        super.y3();
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        return P4().b();
    }

    public PageHostingFragment() {
        throw new IllegalStateException("Your FragmentManager doesn't have PageHostingFragmentFactory set as its fragment factory".toString());
    }
}
