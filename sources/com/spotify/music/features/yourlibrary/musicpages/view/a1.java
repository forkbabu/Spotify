package com.spotify.music.features.yourlibrary.musicpages.view;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.base.Optional;
import com.spotify.android.glue.patterns.toolbarmenu.d0;
import com.spotify.mobius.g;
import com.spotify.mobius.h;
import com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel;
import com.spotify.music.features.yourlibrary.musicpages.domain.s0;
import com.spotify.music.features.yourlibrary.musicpages.e1;
import com.spotify.music.features.yourlibrary.musicpages.filterandsort.d1;
import com.spotify.music.features.yourlibrary.musicpages.k1;
import com.spotify.music.yourlibrary.interfaces.YourLibraryTabsCollapseState;
import defpackage.qg9;

public class a1 implements g1, g<MusicPagesModel, s0> {
    private final xc9 a;
    private final lg9 b;
    private final FrameLayout c;
    private final RecyclerView f;
    private final ViewGroup n;
    private final x29 o;
    private final q79 p;
    private final p79 q;
    private final k1 r;
    private final e1 s;
    private final d1 t;
    private final Context u;
    private final zf9<MusicPagesModel, s0> v;

    class a implements h<MusicPagesModel> {
        boolean a;
        final /* synthetic */ h b;

        a(h hVar) {
            this.b = hVar;
        }

        @Override // com.spotify.mobius.h, defpackage.da2
        public void accept(Object obj) {
            MusicPagesModel musicPagesModel = (MusicPagesModel) obj;
            if (!this.a) {
                a1.this.b.setTitle(musicPagesModel.m().r());
                this.a = true;
            }
            a1.this.getClass();
            this.b.accept(musicPagesModel);
        }

        @Override // com.spotify.mobius.h, defpackage.w92
        public void dispose() {
            a1.this.o.g0();
            this.b.dispose();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0149, code lost:
        if ((r36.u() || r36.s()) == false) goto L_0x014b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x015f, code lost:
        if ((r36.v() || r36.t()) != false) goto L_0x0161;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0161, code lost:
        r14 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a1(defpackage.xc9 r23, defpackage.y29 r24, defpackage.gi9 r25, com.spotify.music.features.yourlibrary.musicpages.pages.q r26, com.spotify.music.features.yourlibrary.musicpages.pages.s r27, com.spotify.music.features.yourlibrary.musicpages.pages.y r28, com.spotify.music.features.yourlibrary.musicpages.datasource.x4 r29, defpackage.q79 r30, com.spotify.music.features.yourlibrary.musicpages.view.h0 r31, com.spotify.music.features.yourlibrary.musicpages.view.r0 r32, com.spotify.music.features.yourlibrary.musicpages.k1 r33, com.spotify.music.features.yourlibrary.musicpages.view.d1 r34, com.spotify.music.features.yourlibrary.musicpages.view.v0 r35, com.spotify.music.features.yourlibrary.musicpages.e1 r36, com.spotify.music.features.yourlibrary.musicpages.item.o r37, com.spotify.libs.glue.custom.playbutton.c.a r38, defpackage.hg9 r39, defpackage.rg9 r40, defpackage.qg9 r41, defpackage.zc9 r42, com.spotify.music.features.yourlibrary.musicpages.MusicPagesLogger r43, defpackage.lg9 r44, android.view.LayoutInflater r45, android.view.ViewGroup r46, com.spotify.music.features.yourlibrary.musicpages.pages.MusicPageId r47, android.os.Bundle r48, com.spotify.music.features.yourlibrary.musicpages.view.MusicPagesViewLoadingTrackerConnectable r49) {
        /*
        // Method dump skipped, instructions count: 449
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.features.yourlibrary.musicpages.view.a1.<init>(xc9, y29, gi9, com.spotify.music.features.yourlibrary.musicpages.pages.q, com.spotify.music.features.yourlibrary.musicpages.pages.s, com.spotify.music.features.yourlibrary.musicpages.pages.y, com.spotify.music.features.yourlibrary.musicpages.datasource.x4, q79, com.spotify.music.features.yourlibrary.musicpages.view.h0, com.spotify.music.features.yourlibrary.musicpages.view.r0, com.spotify.music.features.yourlibrary.musicpages.k1, com.spotify.music.features.yourlibrary.musicpages.view.d1, com.spotify.music.features.yourlibrary.musicpages.view.v0, com.spotify.music.features.yourlibrary.musicpages.e1, com.spotify.music.features.yourlibrary.musicpages.item.o, com.spotify.libs.glue.custom.playbutton.c$a, hg9, rg9, qg9, zc9, com.spotify.music.features.yourlibrary.musicpages.MusicPagesLogger, lg9, android.view.LayoutInflater, android.view.ViewGroup, com.spotify.music.features.yourlibrary.musicpages.pages.MusicPageId, android.os.Bundle, com.spotify.music.features.yourlibrary.musicpages.view.MusicPagesViewLoadingTrackerConnectable):void");
    }

    public static Optional s(a1 a1Var, int i) {
        if (i < a1Var.o.u()) {
            return Optional.of(a1Var.o.X(i, false));
        }
        return Optional.absent();
    }

    public static qg9.b u(a1 a1Var) {
        return qg9.b.b(a1Var.f.getMeasuredHeight(), a1Var.f.computeVerticalScrollRange());
    }

    private void v(boolean z) {
        this.f.setPadding(0, nud.q((float) ((z ? 24 : 0) + (this.s.y() ? 16 : 0)), this.u.getResources()), 0, 0);
        this.f.setClipToPadding(false);
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.view.g1
    public /* synthetic */ void a(boolean z) {
        f1.e(this, z);
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.view.g1
    public /* synthetic */ void b(boolean z) {
        f1.f(this, z);
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.view.g1
    public /* synthetic */ void c(YourLibraryTabsCollapseState yourLibraryTabsCollapseState, boolean z) {
        f1.g(this, yourLibraryTabsCollapseState, z);
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.view.g1
    public /* synthetic */ void d(int i) {
        f1.i(this, i);
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.view.g1
    public /* synthetic */ void e(int i) {
        f1.h(this, i);
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.view.g1
    public void f() {
        this.t.A();
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.view.g1
    public /* synthetic */ void g() {
        f1.b(this);
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.view.g1
    public void h(boolean z) {
        if (z) {
            this.t.z();
            v(!this.s.l());
            this.n.setTop(0);
            this.n.setAlpha(1.0f);
            return;
        }
        this.t.r();
        v(true);
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.view.g1
    public /* synthetic */ void i() {
        f1.a(this);
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.view.g1
    public void j(String str, String str2, String str3) {
        q79 q79 = this.p;
        p79 p79 = this.q;
        p79.getClass();
        q79.c(str, str2, str3, new a0(p79));
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.view.g1
    public /* synthetic */ void k(boolean z) {
        f1.j(this, z);
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.view.g1
    public /* synthetic */ void l() {
        f1.c(this);
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.view.g1
    public void m(boolean z) {
        if (z) {
            this.f.N0(0);
        } else {
            this.f.I0(0);
        }
    }

    public d0 q() {
        return this.r.j();
    }

    public View r() {
        return this.c;
    }

    @Override // com.spotify.mobius.g
    public h<MusicPagesModel> t(da2<s0> da2) {
        this.o.f0(da2);
        return new a(this.v.t(da2));
    }
}
