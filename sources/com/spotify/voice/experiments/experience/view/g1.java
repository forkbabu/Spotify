package com.spotify.voice.experiments.experience.view;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.d0;
import com.spotify.mobius.g;
import com.spotify.mobius.h;
import com.spotify.music.C0707R;
import com.spotify.voice.experiments.experience.view.listening.ListeningView;
import defpackage.u8f;
import io.reactivex.disposables.d;
import java.util.Locale;

public class g1 implements g<t8f, q2f> {
    private final TextView a;
    private final TextView b;
    private final ImageView c;
    private final AnimatorSet f;
    private final AnimatorSet n;
    private final ListeningView o;
    private final x7f p;
    private t8f q = t8f.a(u8f.e(true), "", "");
    private final int r;
    private final d s = new d();

    class a implements h<t8f> {
        private boolean a = true;

        a() {
        }

        @Override // com.spotify.mobius.h, defpackage.da2
        public void accept(Object obj) {
            t8f t8f = (t8f) obj;
            g1.this.q = t8f;
            u8f c = t8f.c();
            Logger.g("Processing %s", t8f);
            c.g(new e(this), new l(this), new n(this), new d(this), new k(this), h.a, c.a, m.a, new g(this), new i(this));
        }

        public /* synthetic */ void b(u8f.f fVar) {
            if (this.a) {
                this.a = false;
                g1.this.p.b(g1.this.q.b(), g1.this.q.d());
            }
            g1.e(g1.this, d0.a(fVar.l(), Locale.getDefault()));
        }

        @Override // com.spotify.mobius.h, defpackage.w92
        public void dispose() {
            g1.this.s.dispose();
            g1.this.n.cancel();
            g1.this.f.cancel();
            g1.this.c.setOnClickListener(null);
        }
    }

    public g1(ViewGroup viewGroup, x7f x7f) {
        this.a = (TextView) q4.G(viewGroup, C0707R.id.title);
        this.b = (TextView) q4.G(viewGroup, C0707R.id.description);
        ImageView imageView = (ImageView) q4.G(viewGroup, 16908294);
        this.c = imageView;
        Resources resources = viewGroup.getResources();
        this.r = resources.getInteger(C0707R.integer.title_max_lines);
        int integer = resources.getInteger(17694720);
        this.f = p(1.0f, integer);
        this.n = p(0.0f, integer);
        ListeningView listeningView = (ListeningView) q4.G(viewGroup, C0707R.id.listeningView);
        this.o = listeningView;
        this.p = x7f;
        View findViewById = viewGroup.findViewById(C0707R.id.bottom_sheet_content);
        d9f d9f = new d9f(resources.getDimensionPixelSize(C0707R.dimen.std_72dp), imageView, listeningView);
        d9f.c(new p(this));
        BottomSheetBehavior.o(findViewById).i(d9f);
    }

    static void d(g1 g1Var, String str) {
        g1Var.a.setText(str);
        g1Var.c.setVisibility(8);
        g1Var.o.d(0.0f);
        g1Var.o.setVisibility(0);
    }

    static void e(g1 g1Var, String str) {
        g1Var.a.setText(str);
        g1Var.b.setText("");
        g1Var.a.setMaxLines(g1Var.r);
        g1Var.c.setVisibility(8);
        g1Var.o.setVisibility(0);
    }

    static void f(g1 g1Var) {
        g1Var.a.setMaxLines(g1Var.r);
        g1Var.c.setVisibility(8);
        g1Var.o.setVisibility(0);
    }

    static void g(g1 g1Var) {
        g1Var.s.b(null);
        g1Var.a.setText("");
        g1Var.b.setText("");
        g1Var.c.setVisibility(8);
        g1Var.o.d(0.0f);
        g1Var.o.setVisibility(8);
    }

    static void l(g1 g1Var, Runnable runnable) {
        g1Var.n.addListener(new h1(g1Var, runnable));
        g1Var.n.start();
    }

    static void m(g1 g1Var, String str, String str2, int i) {
        g1Var.p.c(g1Var.q.b(), g1Var.q.d());
        g1Var.a.setText(str);
        g1Var.b.setText(str2);
        g1Var.c.setVisibility(0);
        g1Var.c.setImageResource(i);
        g1Var.c.setClickable(false);
        g1Var.o.d(0.0f);
        g1Var.o.setVisibility(8);
    }

    static void n(g1 g1Var, String str, String str2, int i) {
        g1Var.a.setText(str);
        g1Var.b.setText(str2);
        g1Var.c.setVisibility(0);
        g1Var.c.setImageResource(i);
        g1Var.c.setClickable(true);
        g1Var.o.d(0.0f);
        g1Var.o.setVisibility(8);
    }

    static void o(g1 g1Var, u8f.a aVar) {
        g1Var.getClass();
        if (aVar.o() != null) {
            g1Var.a.setText(d0.a(aVar.o(), Locale.getDefault()));
        }
        if (aVar.m() != null) {
            g1Var.b.setText(aVar.m());
        }
    }

    private AnimatorSet p(float f2, int i) {
        AnimatorSet duration = new AnimatorSet().setDuration((long) i);
        duration.playTogether(ObjectAnimator.ofFloat(this.a, "alpha", f2), ObjectAnimator.ofFloat(this.b, "alpha", f2), ObjectAnimator.ofFloat(this.o, "alpha", f2), ObjectAnimator.ofFloat(this.c, "alpha", f2));
        return duration;
    }

    public /* synthetic */ void q() {
        this.p.e(this.q.b(), this.q.d());
    }

    @Override // com.spotify.mobius.g
    public h<t8f> t(da2<q2f> da2) {
        this.c.setOnClickListener(new q(da2));
        return new a();
    }
}
