package com.spotify.music.features.yourlibrary.musicpages.filterandsort;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.spotify.music.C0707R;
import com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel;
import com.spotify.music.features.yourlibrary.musicpages.domain.s0;
import com.spotify.rxjava2.q;
import defpackage.di9;
import defpackage.gi9;
import io.reactivex.s;
import io.reactivex.subjects.PublishSubject;

public class d1 implements com.spotify.mobius.g<MusicPagesModel, s0> {
    private final gi9 a;
    private final boolean b;
    private final zc9 c;
    private final ViewGroup f;
    private final ViewGroup n;
    private final gi9.a o = new a();
    private h p = o.a;
    private i q = a0.a;
    private j r = r.a;
    private k s = f0.a;
    private f t = q.a;
    private e u = d0.a;
    private g v = b0.a;
    private boolean w;

    /* access modifiers changed from: package-private */
    public class a implements gi9.a {
        a() {
        }

        @Override // defpackage.gi9.a
        public void a(String str) {
            d1.this.r.a(str);
        }

        @Override // defpackage.gi9.a
        public void b() {
            d1.this.q.b();
        }

        @Override // defpackage.gi9.a
        public void c() {
            d1.this.v.c();
        }

        @Override // defpackage.gi9.a
        public void d(ane ane) {
            d1.this.p.a(ane);
        }

        @Override // defpackage.gi9.a
        public void e(di9.b bVar) {
            d1.this.u.a(bVar);
        }

        @Override // defpackage.gi9.a
        public void f(boolean z) {
            d1.this.s.a(z);
        }
    }

    class b implements com.spotify.mobius.h<MusicPagesModel> {
        final /* synthetic */ PublishSubject a;
        final /* synthetic */ q b;

        b(PublishSubject publishSubject, q qVar) {
            this.a = publishSubject;
            this.b = qVar;
        }

        @Override // com.spotify.mobius.h, defpackage.da2
        public void accept(Object obj) {
            this.a.onNext((MusicPagesModel) obj);
        }

        @Override // com.spotify.mobius.h, defpackage.w92
        public void dispose() {
            this.b.c();
            d1.this.p = i.a;
            d1.this.r = l.a;
            d1.this.q = j.a;
            d1.this.s = h.a;
            d1.this.t = m.a;
            d1.this.u = k.a;
            d1.this.v = g.a;
        }
    }

    static abstract class c {
        c() {
        }

        /* access modifiers changed from: package-private */
        public abstract ImmutableMap<String, Boolean> a();

        /* access modifiers changed from: package-private */
        public abstract di9 b();
    }

    /* access modifiers changed from: private */
    public class d extends AnimatorListenerAdapter {
        d(a aVar) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            d1.this.n.setVisibility(8);
            d1.this.t.a(false);
        }
    }

    /* access modifiers changed from: private */
    public interface e {
        void a(di9.b bVar);
    }

    /* access modifiers changed from: private */
    public interface f {
        void a(boolean z);
    }

    /* access modifiers changed from: private */
    public interface g {
        void c();
    }

    /* access modifiers changed from: private */
    public interface h {
        void a(ane ane);
    }

    /* access modifiers changed from: private */
    public interface i {
        void b();
    }

    /* access modifiers changed from: private */
    public interface j {
        void a(String str);
    }

    /* access modifiers changed from: private */
    public interface k {
        void a(boolean z);
    }

    public d1(ViewGroup viewGroup, ViewGroup viewGroup2, gi9 gi9, boolean z, zc9 zc9) {
        this.f = viewGroup;
        this.n = viewGroup2;
        this.a = gi9;
        this.b = z;
        this.c = zc9;
    }

    public static void s(d1 d1Var, boolean z) {
        d1Var.getClass();
        if (z) {
            d1Var.t.a(z);
            d1Var.a.g(true);
            d1Var.c.g();
        }
    }

    public static void u(d1 d1Var) {
        d1Var.c.n();
    }

    public static void v(d1 d1Var, MusicPagesModel musicPagesModel) {
        d1Var.getClass();
        di9 h2 = musicPagesModel.m().h();
        if (!d1Var.b) {
            di9.a j2 = h2.j();
            j2.b(ImmutableList.of());
            h2 = j2.a();
        }
        View h3 = d1Var.a.h(LayoutInflater.from(d1Var.f.getContext()), d1Var.n, d1Var.f, h2, d1Var.o);
        Resources resources = h3.getContext().getResources();
        h3.setPadding(0, resources.getDimensionPixelSize(C0707R.dimen.music_pages_tabs_filter_top_padding), 0, resources.getDimensionPixelSize(C0707R.dimen.music_pages_tabs_filter_bottom_padding));
        d1Var.n.addView(h3);
        d1Var.a.e(musicPagesModel.t());
        if (musicPagesModel.u()) {
            d1Var.w = true;
            d1Var.n.setVisibility(0);
            d1Var.a.b();
        }
    }

    public void A() {
        this.a.c();
    }

    public void p() {
        this.a.e("");
        this.a.f();
        if (this.b) {
            this.a.g(false);
        }
    }

    public void q() {
        this.a.e("");
    }

    public void r() {
        if (this.w) {
            if (this.b) {
                this.t.a(false);
                return;
            }
            this.w = false;
            this.n.clearAnimation();
            this.n.animate().alpha(0.0f).setDuration(200).setListener(new d(null)).start();
        }
    }

    @Override // com.spotify.mobius.g
    public com.spotify.mobius.h<MusicPagesModel> t(da2<s0> da2) {
        this.p = new g0(da2);
        this.r = new w(this, da2);
        this.q = new p(this, da2);
        this.c.getClass();
        this.t = new x(this, da2);
        this.u = new t(da2);
        this.s = new s(this);
        this.v = new u(this);
        q qVar = new q();
        PublishSubject h1 = PublishSubject.h1();
        qVar.a(h1.T().subscribe(new y(this), z.a));
        s E = h1.Q(n.a).j0(h0.a).j0(u0.a).j0(p0.a).j0(r0.a).E();
        gi9 gi9 = this.a;
        gi9.getClass();
        qVar.a(E.subscribe(new a(gi9), c0.a));
        if (this.b) {
            s j0 = h1.Q(new e0(this)).j0(q0.a).E().j0(new f(this));
            gi9 gi92 = this.a;
            gi92.getClass();
            qVar.a(j0.subscribe(new s0(gi92), v.a));
        }
        return new b(h1, qVar);
    }

    public /* synthetic */ void w(da2 da2, boolean z) {
        if (this.b && z) {
            da2.accept(s0.C());
        }
        da2.accept(s0.I(z));
    }

    public /* synthetic */ void x(da2 da2) {
        da2.accept(s0.G());
        this.c.c();
        p();
    }

    public /* synthetic */ void y(da2 da2, String str) {
        da2.accept(s0.H(str));
        this.c.m();
    }

    public void z() {
        if (!this.w) {
            this.w = true;
            this.n.clearAnimation();
            this.n.setVisibility(0);
            this.n.animate().alpha(1.0f).setDuration(300).setListener(null).start();
            this.a.b();
            this.t.a(true);
        }
    }
}
