package com.spotify.music.features.home.premium;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig;
import com.spotify.android.glue.patterns.toolbarmenu.a0;
import com.spotify.android.glue.patterns.toolbarmenu.b0;
import com.spotify.android.glue.patterns.toolbarmenu.d0;
import com.spotify.android.glue.patterns.toolbarmenu.e0;
import com.spotify.androidx.fragment.app.LifecycleListenableFragment;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.ui.fragments.r;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.music.C0707R;
import com.spotify.music.features.followfeed.entrypoint.FollowFeedButtonManagerImpl;
import com.spotify.music.features.home.common.viewbinder.u;
import com.spotify.music.features.home.common.viewbinder.v;
import com.spotify.music.libs.followfeed.entrypoint.a;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;
import com.spotify.music.navigation.NavigationItem;
import com.spotify.music.navigation.t;
import com.spotify.music.navigation.x;
import com.spotify.pageloader.PageLoaderView;
import com.spotify.pageloader.t0;
import java.lang.ref.WeakReference;

public class PremiumHomeFragment extends LifecycleListenableFragment implements NavigationItem, s, ToolbarConfig.c, ToolbarConfig.d, ToolbarConfig.a, x, mfd, d0 {
    PageLoaderView.a<io.reactivex.s<b91>> h0;
    t0<io.reactivex.s<b91>> i0;
    fi5 j0;
    v k0;
    t l0;
    e0 m0;
    com.spotify.music.features.home.common.viewbinder.t n0;
    a o0;
    boolean p0;
    boolean q0;
    boolean r0;
    boolean s0;
    protected zi5 t0;
    protected bg5 u0;
    protected bj5 v0;
    boolean w0;
    private c x0;

    @Override // com.spotify.music.navigation.x
    public boolean C0() {
        this.k0.M();
        return true;
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        return "";
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void N3(Bundle bundle) {
        super.N3(bundle);
        this.j0.f(bundle);
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void O3() {
        super.O3();
        this.i0.start();
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void P3() {
        super.P3();
        this.i0.stop();
        ((FollowFeedButtonManagerImpl) this.o0).e();
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void Q3(View view, Bundle bundle) {
        super.Q3(view, bundle);
        if (this.w0) {
            if (this.q0) {
                ((u) this.n0).b(this.x0, this.k0, this.l0);
            }
            if (this.p0) {
                a aVar = this.o0;
                ((FollowFeedButtonManagerImpl) aVar).d(((u) this.n0).a(this.x0, this.k0, aVar));
            }
            if (this.r0) {
                ((u) this.n0).c(this.x0, this.k0, this.l0);
                if (this.t0.d(Q2().b0())) {
                    this.t0.e(this.k0.b().findViewById(C0707R.id.home_toolbar_listening_history), new WeakReference<>(B2()), new b(this), new e(this));
                }
            }
            if (!this.s0) {
                ((u) this.n0).d(this.x0, this.k0, this.l0);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void R3(Bundle bundle) {
        super.R3(bundle);
        this.j0.e(bundle);
    }

    @Override // com.spotify.music.navigation.x
    public boolean Y() {
        return true;
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public /* synthetic */ Fragment e() {
        return r.a(this);
    }

    @Override // com.spotify.android.glue.patterns.toolbarmenu.d0
    public void g(a0 a0Var) {
        c cVar = this.x0;
        if (this.q0) {
            this.m0.e(a0Var, this.l0);
        }
        if (this.p0) {
            a aVar = this.o0;
            ((FollowFeedButtonManagerImpl) aVar).d(this.m0.d(cVar, a0Var, aVar));
        }
        if (this.r0) {
            b0 f = this.m0.f(a0Var, new a(this));
            if (this.t0.d(Q2().b0())) {
                this.t0.e(f.getActionView(), new WeakReference<>(B2()), new c(this), new d(this));
            }
        }
        if (!this.s0) {
            this.m0.j(cVar, a0Var, this.l0);
        }
    }

    @Override // defpackage.mfd
    public com.spotify.instrumentation.a g1() {
        return PageIdentifiers.HOME;
    }

    @Override // com.spotify.music.libs.viewuri.c.a
    public c getViewUri() {
        return this.x0;
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String i0() {
        return PageIdentifiers.HOME.name();
    }

    @Override // com.spotify.music.navigation.NavigationItem
    public NavigationItem.NavigationGroup k0() {
        return NavigationItem.NavigationGroup.HOME;
    }

    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        this.x0 = ViewUris.d;
        dagger.android.support.a.a(this);
        super.p3(context);
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.HOME, null);
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void v3(Menu menu, MenuInflater menuInflater) {
        ToolbarConfig.c(this, menu);
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        u4(!this.w0);
        PageLoaderView<io.reactivex.s<b91>> a = this.h0.a(l4());
        a.j0(b3(), this.i0);
        View J = this.k0.J(viewGroup, a);
        this.j0.g();
        return J;
    }

    @Override // com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig.a
    public ToolbarConfig.Visibility z0() {
        return this.w0 ? ToolbarConfig.Visibility.HIDE : ToolbarConfig.Visibility.SHOW;
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        return kfd.q0;
    }
}
