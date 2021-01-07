package com.spotify.music.features.home.freetier;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.spotify.android.flags.c;
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
import com.spotify.music.navigation.NavigationItem;
import com.spotify.music.navigation.t;
import com.spotify.music.navigation.x;
import com.spotify.pageloader.PageLoaderView;
import com.spotify.pageloader.t0;
import java.lang.ref.WeakReference;

public class FreeTierHomeFragment extends LifecycleListenableFragment implements NavigationItem, s, ToolbarConfig.d, ToolbarConfig.c, ToolbarConfig.a, x, mfd, d0 {
    protected PageLoaderView.a<io.reactivex.s<b91>> h0;
    protected t0<io.reactivex.s<b91>> i0;
    protected c j0;
    protected fi5 k0;
    protected v l0;
    protected m9b m0;
    protected t n0;
    protected e0 o0;
    protected com.spotify.music.features.home.common.viewbinder.t p0;
    protected a q0;
    protected zi5 r0;
    protected bg5 s0;
    protected bj5 t0;
    boolean u0;
    boolean v0;
    boolean w0;
    boolean x0;
    boolean y0;
    private final com.spotify.music.libs.viewuri.c z0 = ViewUris.d;

    @Override // com.spotify.music.navigation.x
    public boolean C0() {
        this.l0.M();
        return true;
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        return "";
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void H3() {
        super.H3();
        this.m0.pause();
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void M3() {
        super.M3();
        this.m0.resume();
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void N3(Bundle bundle) {
        super.N3(bundle);
        this.k0.f(bundle);
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
        ((FollowFeedButtonManagerImpl) this.q0).e();
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void Q3(View view, Bundle bundle) {
        super.Q3(view, bundle);
        if (this.y0) {
            if (this.v0) {
                ((u) this.p0).b(this.z0, this.l0, this.n0);
            }
            if (this.u0) {
                a aVar = this.q0;
                ((FollowFeedButtonManagerImpl) aVar).d(((u) this.p0).a(this.z0, this.l0, aVar));
            }
            if (this.w0) {
                ((u) this.p0).c(this.z0, this.l0, this.n0);
                if (this.r0.d(Q2().b0())) {
                    this.r0.e(this.l0.b().findViewById(C0707R.id.home_toolbar_listening_history), new WeakReference<>(B2()), new e(this), new c(this));
                }
            }
            if (!this.x0) {
                ((u) this.p0).d(this.z0, this.l0, this.n0);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void R3(Bundle bundle) {
        super.R3(bundle);
        this.k0.e(bundle);
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
        com.spotify.music.libs.viewuri.c cVar = this.z0;
        if (this.v0) {
            this.o0.e(a0Var, this.n0);
        }
        if (this.u0) {
            a aVar = this.q0;
            ((FollowFeedButtonManagerImpl) aVar).d(this.o0.d(cVar, a0Var, aVar));
        }
        if (this.w0) {
            b0 f = this.o0.f(a0Var, new d(this));
            if (this.r0.d(Q2().b0())) {
                this.r0.e(f.getActionView(), new WeakReference<>(B2()), new a(this), new b(this));
            }
        }
        if (!this.x0) {
            this.o0.j(cVar, a0Var, this.n0);
        }
    }

    @Override // defpackage.mfd
    public com.spotify.instrumentation.a g1() {
        return PageIdentifiers.HOME;
    }

    @Override // com.spotify.music.libs.viewuri.c.a
    public com.spotify.music.libs.viewuri.c getViewUri() {
        return this.z0;
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
        u4(!this.y0);
        PageLoaderView<io.reactivex.s<b91>> a = this.h0.a(l4());
        a.j0(b3(), this.i0);
        View J = this.l0.J(viewGroup, a);
        this.k0.g();
        return J;
    }

    @Override // com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig.a
    public ToolbarConfig.Visibility z0() {
        return this.y0 ? ToolbarConfig.Visibility.HIDE : ToolbarConfig.Visibility.SHOW;
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        return kfd.q0;
    }
}
