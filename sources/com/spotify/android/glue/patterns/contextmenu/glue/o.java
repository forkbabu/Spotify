package com.spotify.android.glue.patterns.contextmenu.glue;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;
import com.spotify.encore.foundation.R;
import com.spotify.music.C0707R;
import java.util.ArrayList;
import java.util.List;

public class o {
    private final ua0 a;
    private final CoordinatorLayout b;
    private final LinearLayout c;
    private final View d;
    private final GlueContextMenuLayout e;
    private View f;
    private int g;
    private final List<View> h = new ArrayList();
    private final List<View> i = new ArrayList();
    private boolean j;
    private boolean k;
    private final Runnable l = new a();
    private final ab0 m;
    private final Handler n;
    private final cb0 o;
    private final db0 p;
    private final Animator q;
    private final Animator r;
    private final Animator s;
    private final Animator t;
    private Animator u;
    private final Animator v;
    private final Animator w;
    private final FadingEdgeScrollView x;
    private final View y;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (o.this.j) {
                o.this.e.setProgressBarVisibility(0);
                o.this.s.start();
            }
        }
    }

    class b implements ab0 {
        b() {
        }

        @Override // defpackage.ab0
        public View A() {
            return o.this.y;
        }

        @Override // defpackage.ab0
        public int B() {
            return o.this.p.b();
        }

        @Override // defpackage.ab0
        public StretchingGradientDrawable C() {
            return (StretchingGradientDrawable) o.this.e.getBackground();
        }

        @Override // defpackage.ab0
        public float D() {
            return (float) o.this.x.getMeasuredHeight();
        }

        @Override // defpackage.ab0
        public void E() {
            GlueContextMenuLayout glueContextMenuLayout = o.this.e;
            int i = q4.g;
            int i2 = Build.VERSION.SDK_INT;
            glueContextMenuLayout.postInvalidateOnAnimation();
        }

        @Override // defpackage.ab0
        public List<View> F() {
            return o.this.h;
        }

        @Override // defpackage.ab0
        public View G() {
            return o.this.x;
        }
    }

    class c implements ViewTreeObserver.OnPreDrawListener {
        c() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            o oVar = o.this;
            oVar.u = uud.a(oVar.o);
            o.this.u.start();
            o.this.w.start();
            o.this.b.getViewTreeObserver().removeOnPreDrawListener(this);
            return true;
        }
    }

    class d extends AnimatorListenerAdapter {
        d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            o.this.a.onDismiss();
        }
    }

    public o(Context context, ua0 ua0) {
        b bVar = new b();
        this.m = bVar;
        this.n = new Handler();
        this.a = ua0;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) LayoutInflater.from(context).inflate(C0707R.layout.glue_context_menu, (ViewGroup) null);
        this.b = coordinatorLayout;
        LinearLayout linearLayout = (LinearLayout) coordinatorLayout.findViewById(C0707R.id.top_bar_menu_layout);
        this.c = linearLayout;
        this.d = coordinatorLayout.findViewById(C0707R.id.top_gradient_background_view);
        GlueContextMenuLayout glueContextMenuLayout = (GlueContextMenuLayout) coordinatorLayout.findViewById(C0707R.id.panel);
        this.e = glueContextMenuLayout;
        this.x = (FadingEdgeScrollView) coordinatorLayout.findViewById(C0707R.id.scroll);
        View findViewById = coordinatorLayout.findViewById(C0707R.id.progress_bar);
        this.y = findViewById;
        glueContextMenuLayout.setSpinner(findViewById);
        glueContextMenuLayout.setOnClickListener(new i(this));
        linearLayout.setOnClickListener(new g(this));
        q4.P(linearLayout, e.a);
        ya0 ya0 = new ya0(bVar);
        za0 za0 = new za0(bVar);
        eb0 eb0 = new eb0(bVar);
        fb0 fb0 = new fb0(bVar);
        this.o = new cb0(bVar);
        db0 db0 = new db0(bVar);
        this.p = db0;
        bb0 bb0 = new bb0(bVar);
        this.q = uud.a(ya0);
        this.r = uud.a(za0);
        this.s = uud.a(eb0);
        this.t = uud.a(fb0);
        this.v = uud.a(db0);
        this.w = uud.a(bb0);
        linearLayout.setBackgroundColor(androidx.core.content.a.b(linearLayout.getContext(), R.color.black));
        linearLayout.getBackground().setAlpha(0);
        u();
    }

    public static void r(o oVar) {
        int height = oVar.g - oVar.c.getHeight();
        oVar.c.getBackground().setAlpha((int) (height != 0 ? (float) (255 - ((Math.max(0, height - oVar.x.getScrollY()) * BitmapRenderer.ALPHA_VISIBLE) / height)) : 255.0f));
    }

    private void u() {
        View view = this.f;
        if (view != null) {
            view.setVisibility(8);
        }
        this.e.setProgressBarVisibility(4);
        this.n.postDelayed(this.l, 1000);
        this.q.start();
        this.j = true;
    }

    public void p() {
        this.k = true;
        d dVar = new d();
        Animator animator = this.u;
        if (animator != null && animator.isRunning()) {
            this.u.cancel();
        }
        if (this.w.isRunning()) {
            this.w.cancel();
        }
        this.v.start();
        if (this.s.isRunning()) {
            this.s.cancel();
        }
        if (this.j) {
            this.t.start();
        }
        if (this.q.isRunning()) {
            this.q.cancel();
        }
        this.r.start();
        this.r.addListener(dVar);
    }

    public View q() {
        return this.b;
    }

    public /* synthetic */ void s() {
        this.e.setMinTopMarginPx(this.c.getPaddingTop() + this.c.getHeight());
    }

    public void t(j jVar, wa0 wa0) {
        LinearLayout.LayoutParams layoutParams;
        if (!this.k) {
            for (View view : this.i) {
                this.c.removeView(view);
            }
            this.i.clear();
            int i2 = 8;
            this.c.setVisibility(8);
            this.d.setVisibility(8);
            if (jVar != null && jVar.b() > 0) {
                this.c.setVisibility(0);
                this.d.setVisibility(0);
                this.x.getViewTreeObserver().addOnScrollChangedListener(new h(this));
                for (int i3 = 0; i3 < jVar.b(); i3++) {
                    View a2 = jVar.a(i3, this.c);
                    this.i.add(a2);
                    this.c.addView(a2);
                }
            }
            n header = wa0.getHeader();
            header.getClass();
            View view2 = header.getView();
            ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams = new LinearLayout.LayoutParams(layoutParams2);
            } else {
                layoutParams = new LinearLayout.LayoutParams(-1, -2);
            }
            if (this.c.getVisibility() == 0) {
                this.c.post(new f(this));
            }
            view2.setLayoutParams(layoutParams);
            if (!this.j) {
                i2 = 0;
            }
            view2.setVisibility(i2);
            this.f = view2;
            this.e.setHeader(header);
            this.f.getViewTreeObserver().addOnGlobalLayoutListener(new q(this));
            this.e.c();
            this.h.clear();
            View view3 = this.f;
            if (view3 != null) {
                this.h.add(view3);
            }
            for (int i4 = 0; i4 < wa0.c(); i4++) {
                View b2 = wa0.b(i4, this.e);
                this.e.a(b2);
                this.h.add(b2);
            }
            this.e.setNumberOfVisibleItems(wa0.a());
            if (this.j) {
                this.b.getViewTreeObserver().addOnPreDrawListener(new c());
            }
            View view4 = this.f;
            if (view4 != null) {
                view4.setVisibility(0);
            }
            p pVar = new p(this);
            if (this.s.isRunning()) {
                this.s.cancel();
            }
            this.t.start();
            this.t.addListener(pVar);
            this.j = false;
        }
    }

    public void v() {
        if (!this.k && !this.j) {
            this.e.c();
            this.h.clear();
            View view = this.f;
            if (view != null) {
                this.h.add(view);
            }
            u();
        }
    }
}
