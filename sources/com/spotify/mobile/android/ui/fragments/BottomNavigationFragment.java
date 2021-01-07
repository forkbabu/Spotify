package com.spotify.mobile.android.ui.fragments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.spotify.android.flags.c;
import com.spotify.androidx.fragment.app.LifecycleListenableFragment;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.rx.w;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.features.navigation.BottomNavigationLabelVisibility;
import com.spotify.music.features.navigation.BottomNavigationView;
import com.spotify.music.features.navigation.BottomTab;
import com.spotify.music.features.navigation.d;
import com.spotify.music.features.navigation.g;
import com.spotify.music.features.premiumdestination.e;
import com.spotify.music.features.premiumdestination.f;
import com.spotify.music.features.premiumdestination.l0;
import com.spotify.music.libs.voice.VoiceSourceElement;
import com.spotify.music.navigation.NavigationItem;
import com.spotify.music.navigation.b;
import com.spotify.music.navigation.x;
import com.spotify.music.sociallistening.participantlist.impl.m;
import com.spotify.music.z0;
import com.spotify.remoteconfig.cb;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.s;
import io.reactivex.y;

public class BottomNavigationFragment extends LifecycleListenableFragment implements com.spotify.music.features.navigation.a {
    public static final /* synthetic */ int H0 = 0;
    b A0;
    boolean B0;
    z0 C0;
    BottomNavigationLabelVisibility D0;
    boolean E0;
    y3<Integer> F0;
    private final xs2 G0 = new a();
    private String h0;
    private c i0;
    private Fragment j0;
    io.reactivex.disposables.b k0;
    private io.reactivex.disposables.b l0 = EmptyDisposable.INSTANCE;
    private g m0;
    io.reactivex.g<c> n0;
    y o0;
    fm9 p0;
    vwc q0;
    cb r0;
    l0 s0;
    w t0;
    d u0;
    com.spotify.music.libs.voice.b v0;
    ys2 w0;
    int x0;
    int y0;
    boolean z0;

    class a implements xs2 {
        a() {
        }

        @Override // defpackage.xs2
        public void a(Fragment fragment, String str) {
            BottomNavigationFragment.this.j0 = fragment;
            BottomTab M4 = BottomNavigationFragment.M4(fragment);
            if (M4 != BottomTab.UNKNOWN) {
                BottomNavigationFragment.this.m0.g(M4);
            }
        }
    }

    public static BottomTab M4(Fragment fragment) {
        BottomTab bottomTab;
        BottomTab bottomTab2;
        if (fragment == null) {
            return BottomTab.UNKNOWN;
        }
        if (fragment instanceof NavigationItem) {
            NavigationItem.NavigationGroup k02 = ((NavigationItem) fragment).k0();
            BottomTab bottomTab3 = BottomTab.HOME;
            switch (k02.ordinal()) {
                case 1:
                    bottomTab2 = BottomTab.HOME;
                    break;
                case 2:
                    bottomTab2 = BottomTab.FIND;
                    break;
                case 3:
                    bottomTab2 = BottomTab.LIBRARY;
                    break;
                case 4:
                    bottomTab2 = BottomTab.FREE_TIER_YOUR_PLAYLISTS;
                    break;
                case 5:
                    bottomTab2 = BottomTab.FREE_TIER_PREMIUM;
                    break;
                case 6:
                default:
                    Logger.n("Couldn't resolve tab item from navigation group. Navigation group: %s", k02.name());
                    bottomTab2 = BottomTab.UNKNOWN;
                    break;
                case 7:
                    bottomTab2 = BottomTab.STATIONS_PROMO;
                    break;
                case 8:
                    bottomTab2 = BottomTab.VOICE;
                    break;
            }
            if (bottomTab2 != BottomTab.UNKNOWN) {
                return bottomTab2;
            }
            Assertion.g(String.format("Couldn't map Fragment : %s with navigation group %s, to any Navigation Tab.Ensure that the fragment's getNavigationGroup() returns the right NavigationGroup", fragment, k02));
            return bottomTab2;
        }
        ifd a2 = kfd.a(fragment);
        BottomTab bottomTab4 = BottomTab.HOME;
        if (a2.equals(kfd.o)) {
            bottomTab = BottomTab.FIND;
        } else if (a2.equals(kfd.q0)) {
            bottomTab = BottomTab.HOME;
        } else if (a2.equals(kfd.f1)) {
            bottomTab = BottomTab.FIND;
        } else if (a2.equals(kfd.a1)) {
            bottomTab = BottomTab.FIND;
        } else if (a2.equals(kfd.u) || a2.equals(kfd.w) || a2.equals(kfd.v) || a2.equals(kfd.x) || a2.equals(kfd.y) || a2.equals(kfd.z) || a2.equals(kfd.A) || a2.equals(kfd.C) || a2.equals(kfd.D) || a2.equals(kfd.E) || a2.equals(kfd.F) || a2.equals(kfd.B) || a2.equals(kfd.v1) || a2.equals(kfd.h0)) {
            bottomTab = BottomTab.LIBRARY;
        } else if (a2.equals(kfd.a0)) {
            bottomTab = BottomTab.FIND;
        } else if (a2.equals(kfd.X0)) {
            bottomTab = BottomTab.FREE_TIER_PREMIUM;
        } else if (a2.equals(kfd.p1)) {
            bottomTab = BottomTab.STATIONS_PROMO;
        } else if (a2.equals(kfd.B1)) {
            bottomTab = BottomTab.VOICE;
        } else {
            bottomTab = BottomTab.UNKNOWN;
        }
        return bottomTab;
    }

    private s<Boolean> N4() {
        vwc vwc = this.q0;
        w wVar = this.t0;
        vwc.getClass();
        wVar.getClass();
        s<R> W = wVar.c("type").W(rwc.a, false, Integer.MAX_VALUE);
        vwc vwc2 = this.q0;
        w wVar2 = this.t0;
        vwc2.getClass();
        s<R> W2 = wVar2.c("payment-state").W(twc.a, false, Integer.MAX_VALUE);
        vwc vwc3 = this.q0;
        w wVar3 = this.t0;
        vwc3.getClass();
        s<R> W3 = wVar3.c(uwc.c.d()).W(swc.a, false, Integer.MAX_VALUE);
        l0 l0Var = this.s0;
        w wVar4 = this.t0;
        l0Var.getClass();
        return s.l(W, W2, W3, wVar4.b().j0(e.a).j0(com.spotify.music.features.premiumdestination.g.a).E().j0(new f(l0Var)), new f(this)).o0(this.o0);
    }

    public static void O4(BottomNavigationFragment bottomNavigationFragment, c cVar) {
        bottomNavigationFragment.getClass();
        cVar.getClass();
        bottomNavigationFragment.i0 = cVar;
        io.reactivex.disposables.b bVar = bottomNavigationFragment.k0;
        if (bVar != null) {
            bVar.dispose();
        }
        bottomNavigationFragment.k0 = bottomNavigationFragment.N4().subscribe(d.a, e.a);
    }

    @Override // com.spotify.music.features.navigation.a
    public void D1(View view) {
        if ((this.j0 instanceof s) && B2() != null) {
            this.v0.b(B2(), VoiceSourceElement.LONG_PRESS_SEARCH_ICON, ((s) this.j0).z1());
        }
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void N3(Bundle bundle) {
        super.N3(bundle);
        bundle.putString("key_current_product", this.h0);
        c cVar = this.i0;
        if (cVar != null) {
            bundle.putParcelable("key_current_flags_config", cVar);
        }
        this.m0.getClass();
        bundle.putInt("key_current_tab", this.m0.b().ordinal());
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void O3() {
        super.O3();
        this.u0.d(this.m0);
        this.l0 = this.n0.Q(this.o0).subscribe(new g(this));
        io.reactivex.disposables.b bVar = this.k0;
        if (bVar == null || bVar.d()) {
            this.k0 = N4().subscribe(h.a, b.a);
        }
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void P3() {
        super.P3();
        io.reactivex.disposables.b bVar = this.k0;
        if (bVar != null) {
            bVar.dispose();
        }
        this.l0.dispose();
        this.u0.a();
    }

    public /* synthetic */ Boolean P4(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        g gVar = this.m0;
        c cVar = this.i0;
        BottomTab M4 = M4(this.j0);
        bool.booleanValue();
        gVar.h(cVar, M4, bool2.booleanValue(), bool3.booleanValue(), bool4.booleanValue());
        if (this.m0.f(BottomTab.FREE_TIER_PREMIUM)) {
            this.u0.f();
        }
        return bool;
    }

    public void Q4(Bundle bundle, Boolean bool) {
        if (bundle != null) {
            if (bundle.containsKey("key_current_product")) {
                this.h0 = bundle.getString("key_current_product");
            }
            if (bundle.containsKey("key_current_flags_config")) {
                this.i0 = (c) bundle.getParcelable("key_current_flags_config");
            }
            if (bundle.containsKey("key_current_tab")) {
                Logger.g("State restored for current tab. Value : %s ", Integer.valueOf(bundle.getInt("key_current_tab")));
                this.m0.g(BottomTab.values()[bundle.getInt("key_current_tab")]);
            }
        }
    }

    @Override // com.spotify.music.features.navigation.a
    public void R0(BottomTab bottomTab) {
        Fragment fragment = this.j0;
        if (!(fragment instanceof x) || !((x) fragment).C0()) {
            n2(bottomTab);
        }
    }

    @Override // com.spotify.music.features.navigation.a
    public void n2(BottomTab bottomTab) {
        z0.b b = this.C0.b(B2(), bottomTab.d());
        b.b();
        Intent a2 = b.a();
        m.c(a2, bu9.w);
        this.A0.b(a2);
    }

    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        dagger.android.support.a.a(this);
        super.p3(context);
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void s3(Bundle bundle) {
        super.s3(bundle);
        this.i0 = com.spotify.android.flags.d.c(this);
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.i0 = com.spotify.android.flags.d.c(this);
        BottomNavigationView bottomNavigationView = (BottomNavigationView) layoutInflater.inflate(this.x0, viewGroup, false);
        bottomNavigationView.setAdaptiveUiEnabled(this.z0);
        this.m0 = new g(this.u0, bottomNavigationView, this.p0, this.r0.a(), this.y0, this.B0, this.F0, com.spotify.mobile.android.util.x.g(l4()) || com.spotify.mobile.android.util.x.f(l4()) || this.D0 == BottomNavigationLabelVisibility.VISIBLE, com.spotify.mobile.android.util.x.g(l4()) || com.spotify.mobile.android.util.x.f(l4()) || this.E0, this.D0);
        this.w0.q1(this.G0);
        this.k0 = N4().subscribe(new c(this, bundle), a.a);
        return bottomNavigationView;
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void x3() {
        super.x3();
        this.w0.x2(this.G0);
    }
}
