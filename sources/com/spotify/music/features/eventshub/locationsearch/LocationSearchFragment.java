package com.spotify.music.features.eventshub.locationsearch;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;
import com.google.common.base.MoreObjects;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.ui.fragments.r;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.music.C0707R;
import com.spotify.music.contentviewstate.ContentViewManager;
import com.spotify.music.contentviewstate.view.LoadingView;
import com.spotify.music.contentviewstate.view.b;
import com.spotify.music.features.eventshub.eventshub.h;
import com.spotify.music.features.eventshub.locationsearch.model.Location;
import com.spotify.music.libs.search.view.ToolbarSearchFieldView;
import com.spotify.music.libs.search.view.l;
import com.spotify.music.libs.search.view.n;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.navigation.t;
import defpackage.ys2;
import io.reactivex.BackpressureStrategy;
import io.reactivex.g;
import io.reactivex.internal.operators.flowable.FlowableDebounce;
import io.reactivex.y;
import java.util.concurrent.TimeUnit;

public class LocationSearchFragment extends ListFragment implements s, j, AbsListView.OnScrollListener, ToolbarConfig.a, ys2.a {
    public static final String E0 = ViewUris.m0.toString();
    private LoadingView A0;
    private final f4b B0 = new a();
    private gb0 C0;
    private ToolbarSearchFieldView D0;
    l q0;
    ContentViewManager r0;
    h s0;
    e t0;
    ys2 u0;
    h v0;
    p05 w0;
    f x0;
    y y0;
    t z0;

    class a implements f4b {
        a() {
        }

        @Override // defpackage.f4b
        public void f(String str) {
            LocationSearchFragment.this.s0.g();
        }
    }

    private void P4() {
        l lVar = this.q0;
        this.s0.i(new FlowableDebounce(g.p(new g2b(this.B0, lVar), BackpressureStrategy.LATEST), new h2b(this.y0)).q(100, TimeUnit.MILLISECONDS, io.reactivex.schedulers.a.a()));
        if (MoreObjects.isNullOrEmpty(this.q0.h())) {
            this.q0.l(100);
        }
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        return "";
    }

    @Override // androidx.fragment.app.Fragment
    public void H3() {
        super.H3();
        this.s0.h();
        this.u0.A0(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void M3() {
        super.M3();
        P4();
        this.u0.t2(this);
    }

    @Override // androidx.fragment.app.ListFragment
    public void M4(ListView listView, View view, int i, long j) {
        this.s0.e((Location) view.getTag());
    }

    @Override // androidx.fragment.app.ListFragment, androidx.fragment.app.Fragment
    public void Q3(View view, Bundle bundle) {
        super.Q3(view, bundle);
        this.D0 = (ToolbarSearchFieldView) view.findViewById(C0707R.id.search_toolbar);
        n nVar = new n(B2(), this.D0, false);
        nVar.B(C0707R.string.concerts_location_hint);
        this.q0 = nVar;
        e eVar = new e(B2());
        this.t0 = eVar;
        N4(eVar);
        ContentViewManager.b bVar = new ContentViewManager.b(B2(), this.C0, L4());
        bVar.a(SpotifyIconV2.SEARCH, C0707R.string.concerts_location_nux_title, C0707R.string.concerts_location_nux_subtitle);
        bVar.c(C0707R.string.concerts_location_error_title, C0707R.string.concerts_location_error_subtitle);
        this.r0 = bVar.f();
        L4().setOnScrollListener(this);
    }

    public void Q4() {
        if (e3()) {
            this.r0.e(null);
            this.r0.i(true);
        }
    }

    public void R4() {
        if (e3()) {
            this.r0.g(this.A0);
        }
    }

    @Override // defpackage.ys2.a
    public void T0() {
        String h = this.q0.h();
        boolean f = this.q0.f();
        this.s0.h();
        this.q0.o();
        n nVar = new n(B2(), this.D0, false);
        nVar.B(C0707R.string.concerts_location_hint);
        this.q0 = nVar;
        P4();
        this.q0.j(h);
        if (f) {
            this.q0.m();
        }
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public /* synthetic */ Fragment e() {
        return r.a(this);
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String i0() {
        return E0;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i) {
        if (i == 1) {
            this.s0.f();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        dagger.android.support.a.a(this);
        super.p3(context);
    }

    @Override // androidx.fragment.app.Fragment
    public void s3(Bundle bundle) {
        super.s3(bundle);
        this.s0 = new h(this, this.w0, this.x0, this.v0);
        B4(true);
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.CONCERTS_CITYSEARCH, null);
    }

    @Override // androidx.fragment.app.ListFragment, androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(C0707R.layout.fragment_location, viewGroup, false);
        ViewGroup viewGroup3 = (ViewGroup) viewGroup2.findViewById(C0707R.id.content);
        gb0 a2 = e90.c().a(F2(), viewGroup2);
        this.C0 = a2;
        viewGroup3.addView(a2.getView());
        b bVar = LoadingView.y;
        LoadingView loadingView = (LoadingView) layoutInflater.inflate(C0707R.layout.loading_view, (ViewGroup) null);
        this.A0 = loadingView;
        viewGroup3.addView(loadingView);
        return viewGroup2;
    }

    @Override // androidx.fragment.app.ListFragment, androidx.fragment.app.Fragment
    public void y3() {
        super.y3();
        this.q0.o();
    }

    @Override // com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig.a
    public ToolbarConfig.Visibility z0() {
        return ToolbarConfig.Visibility.HIDE;
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        return kfd.H;
    }
}
