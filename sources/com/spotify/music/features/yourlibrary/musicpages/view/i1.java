package com.spotify.music.features.yourlibrary.musicpages.view;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.base.Optional;
import com.spotify.mobius.g;
import com.spotify.mobius.h;
import com.spotify.music.C0707R;
import com.spotify.music.contentviewstate.view.LoadingView;
import com.spotify.music.features.yourlibrary.musicpages.datasource.x4;
import com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel;
import com.spotify.music.features.yourlibrary.musicpages.domain.s0;
import com.spotify.music.features.yourlibrary.musicpages.e1;
import com.spotify.music.features.yourlibrary.musicpages.filterandsort.d1;
import com.spotify.music.features.yourlibrary.musicpages.item.o;
import com.spotify.music.features.yourlibrary.musicpages.pages.MusicPageId;
import com.spotify.music.features.yourlibrary.musicpages.pages.q;
import com.spotify.music.features.yourlibrary.musicpages.pages.s;
import com.spotify.music.features.yourlibrary.musicpages.pages.y;
import com.spotify.music.libs.debugtools.flags.DebugFlag;
import com.spotify.music.yourlibrary.interfaces.LoadingState;
import com.spotify.music.yourlibrary.interfaces.YourLibraryTabsCollapseState;
import com.spotify.music.yourlibrary.interfaces.c;
import com.spotify.music.yourlibrary.quickscroll.QuickScrollView;
import com.spotify.music.yourlibrary.quickscroll.z;
import com.spotify.paste.widgets.recyclerview.fastscroll.RecyclerViewFastScroller;
import defpackage.qg9;
import defpackage.zf9;

public class i1 implements g1, g<MusicPagesModel, s0> {
    private final MusicPageId a;
    private final e1 b;
    private final FrameLayout c;
    private final RecyclerView f;
    private final a39 n;
    private final d1 o;
    private final k0 p;
    private final c q;
    private final FrameLayout r;
    private final PulldownContainer s;
    private final zf9<MusicPagesModel, s0> t;
    private final zc9 u;
    private int v = -1;

    class a implements h<MusicPagesModel> {
        final /* synthetic */ h a;

        a(h hVar) {
            this.a = hVar;
        }

        @Override // com.spotify.mobius.h, defpackage.da2
        public void accept(Object obj) {
            MusicPagesModel musicPagesModel = (MusicPagesModel) obj;
            i1.this.getClass();
            MusicPagesModel.LoadingState l = musicPagesModel.l();
            if (l == MusicPagesModel.LoadingState.LOADED || l == MusicPagesModel.LoadingState.LOADED_EMPTY) {
                i1.this.q.e(LoadingState.LOADED);
            }
            this.a.accept(musicPagesModel);
        }

        @Override // com.spotify.mobius.h, defpackage.w92
        public void dispose() {
            i1.this.n.g0();
            this.a.dispose();
        }
    }

    public i1(a39 a39, gi9 gi9, q qVar, s sVar, y yVar, x4 x4Var, j79 j79, r0 r0Var, v0 v0Var, e1 e1Var, o oVar, zc9 zc9, hg9 hg9, rg9 rg9, qg9 qg9, LayoutInflater layoutInflater, ViewGroup viewGroup, MusicPageId musicPageId, Bundle bundle, MusicPagesViewLoadingTrackerConnectable musicPagesViewLoadingTrackerConnectable) {
        this.a = musicPageId;
        this.b = e1Var;
        zf9.b a2 = zf9.a();
        this.n = a39;
        this.q = j79.i2().orNull();
        this.u = zc9;
        FrameLayout frameLayout = (FrameLayout) layoutInflater.inflate(C0707R.layout.fragment_your_library_music_page, viewGroup, false);
        this.c = frameLayout;
        this.s = (PulldownContainer) frameLayout.findViewById(C0707R.id.pulldown_container);
        musicPagesViewLoadingTrackerConnectable.c(frameLayout, bundle);
        a2.a(musicPagesViewLoadingTrackerConnectable);
        a2.a(r0Var);
        a2.a(oVar);
        RecyclerView recyclerView = (RecyclerView) frameLayout.findViewById(C0707R.id.recycler_view);
        this.f = recyclerView;
        t0 b2 = v0Var.b(a39, recyclerView);
        b2.h(x4Var);
        a2.a(b2);
        Context context = layoutInflater.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        if (e1Var.v() || e1Var.t()) {
            QuickScrollView quickScrollView = (QuickScrollView) frameLayout.findViewById(C0707R.id.quickscroll_view);
            rg9.c(quickScrollView);
            a2.a(rg9);
            z h = qg9.h(new v(this), new u(this));
            a2.a(qg9);
            hg9.e(musicPageId);
            hg9.h(quickScrollView);
            hg9.i(recyclerView);
            hg9.j(a39);
            hg9.k(h);
            hg9.f();
            quickScrollView.setListener(new h1(this));
            if (musicPageId == MusicPageId.ARTISTS || musicPageId == MusicPageId.ALBUMS) {
                quickScrollView.setShouldDisappearOnBottom(true);
            }
        } else {
            RecyclerViewFastScroller recyclerViewFastScroller = (RecyclerViewFastScroller) frameLayout.findViewById(C0707R.id.recycler_view_fast_scroll);
            recyclerViewFastScroller.setVerticalScrollBarEnabled(true);
            recyclerViewFastScroller.setRecyclerView(recyclerView);
            recyclerViewFastScroller.setEnabled(true);
            recyclerView.setVerticalScrollBarEnabled(false);
        }
        FrameLayout frameLayout2 = (FrameLayout) frameLayout.findViewById(C0707R.id.centered_views);
        this.r = frameLayout2;
        frameLayout2.addView(qVar.b());
        frameLayout2.addView(yVar.a());
        frameLayout2.addView(sVar.a());
        ViewGroup viewGroup2 = (ViewGroup) frameLayout.findViewById(C0707R.id.content_container);
        LoadingView m = LoadingView.m(layoutInflater, context, viewGroup2);
        frameLayout2.addView(m);
        viewGroup2.setVisibility(4);
        k0 k0Var = new k0(m, qVar, yVar, sVar, zc9);
        this.p = k0Var;
        a2.a(k0Var);
        d1 d1Var = new d1(viewGroup2, (ViewGroup) frameLayout.findViewById(C0707R.id.filter_view_container), gi9, true, zc9);
        this.o = d1Var;
        a2.a(d1Var);
        this.t = a2.b();
        DebugFlag debugFlag = DebugFlag.YOUR_LIBRARY_MUSIC_PAGES_ENABLE_DEBUG_OVERLAY;
    }

    public static qg9.b r(i1 i1Var) {
        return qg9.b.b(i1Var.f.getMeasuredHeight(), i1Var.f.computeVerticalScrollRange());
    }

    public static Optional v(i1 i1Var, int i) {
        if (i < i1Var.n.u()) {
            return Optional.of(i1Var.n.X(i, false));
        }
        return Optional.absent();
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.view.g1
    public void a(boolean z) {
        this.q.a(z);
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.view.g1
    public void b(boolean z) {
        this.q.b(z);
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.view.g1
    public void c(YourLibraryTabsCollapseState yourLibraryTabsCollapseState, boolean z) {
        this.q.c(yourLibraryTabsCollapseState, z);
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.view.g1
    public void d(int i) {
        this.v = i;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.view.g1
    public void e(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.r.getLayoutParams();
        marginLayoutParams.topMargin = i;
        this.r.setLayoutParams(marginLayoutParams);
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.view.g1
    public void f() {
        this.o.A();
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.view.g1
    public void g() {
        this.s.post(new x(this));
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.view.g1
    public void h(boolean z) {
        if (z) {
            this.o.z();
            return;
        }
        this.o.q();
        this.o.r();
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.view.g1
    public void i() {
        this.o.p();
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.view.g1
    public /* synthetic */ void j(String str, String str2, String str3) {
        f1.d(this, str, str2, str3);
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.view.g1
    public void k(boolean z) {
        PulldownContainer pulldownContainer = this.s;
        if (pulldownContainer != null) {
            pulldownContainer.setPulldownLock(z);
        }
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.view.g1
    public void l() {
        this.f.post(new w(this));
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.view.g1
    public void m(boolean z) {
        this.f.r(0);
        this.f.r(1);
        if (z) {
            this.f.N0(0);
        } else {
            this.f.I0(0);
        }
    }

    public View q() {
        return this.c;
    }

    public /* synthetic */ void s() {
        this.s.c(0);
    }

    @Override // com.spotify.mobius.g
    public h<MusicPagesModel> t(da2<s0> da2) {
        this.n.f0(da2, this.u);
        return new a(this.t.t(da2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0044, code lost:
        if ((r6.f.getHeight() - r1.a.getBottom()) > r6.v) goto L_0x0046;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void u() {
        /*
            r6 = this;
            com.spotify.music.yourlibrary.interfaces.c r0 = r6.q
            androidx.recyclerview.widget.RecyclerView r1 = r6.f
            androidx.recyclerview.widget.RecyclerView$e r1 = r1.getAdapter()
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L_0x000d
            goto L_0x0047
        L_0x000d:
            int r1 = r1.u()
            if (r1 != 0) goto L_0x0014
            goto L_0x0046
        L_0x0014:
            androidx.recyclerview.widget.RecyclerView r4 = r6.f
            androidx.recyclerview.widget.RecyclerView$m r4 = r4.getLayoutManager()
            androidx.recyclerview.widget.LinearLayoutManager r4 = (androidx.recyclerview.widget.LinearLayoutManager) r4
            r4.getClass()
            int r5 = r4.U1()
            if (r5 != 0) goto L_0x0047
            int r4 = r4.Z1()
            int r1 = r1 - r3
            if (r4 != r1) goto L_0x0047
            androidx.recyclerview.widget.RecyclerView r4 = r6.f
            androidx.recyclerview.widget.RecyclerView$b0 r1 = r4.S(r1)
            r1.getClass()
            androidx.recyclerview.widget.RecyclerView r4 = r6.f
            int r4 = r4.getHeight()
            android.view.View r1 = r1.a
            int r1 = r1.getBottom()
            int r4 = r4 - r1
            int r1 = r6.v
            if (r4 <= r1) goto L_0x0047
        L_0x0046:
            r2 = 1
        L_0x0047:
            r1 = r2 ^ 1
            r0.d(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.features.yourlibrary.musicpages.view.i1.u():void");
    }
}
