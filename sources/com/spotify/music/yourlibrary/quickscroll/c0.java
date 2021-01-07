package com.spotify.music.yourlibrary.quickscroll;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.drawable.a;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;
import com.spotify.music.C0707R;

/* access modifiers changed from: package-private */
public class c0 implements n, View.OnTouchListener {
    private k a;
    private final s b;
    private final p c;
    private final g f;
    private final FrameLayout n;
    private final d0<FrameLayout> o;
    private final ConstraintLayout p;
    private final ImageView q;
    private final ImageView r;
    private final d0<FrameLayout> s;
    private final ConstraintLayout t;
    private final TextView u;
    private final m v;
    private boolean w = false;
    private boolean x;

    public c0(k kVar, s sVar, p pVar, g gVar, FrameLayout frameLayout, FrameLayout frameLayout2, ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, FrameLayout frameLayout3, ConstraintLayout constraintLayout2, TextView textView, m mVar) {
        this.a = kVar;
        this.b = sVar;
        this.c = pVar;
        this.f = gVar;
        this.n = frameLayout;
        d0<FrameLayout> d0Var = new d0<>(frameLayout2);
        this.o = d0Var;
        this.p = constraintLayout;
        this.q = imageView;
        this.r = imageView2;
        d0<FrameLayout> d0Var2 = new d0<>(frameLayout3);
        this.s = d0Var2;
        this.t = constraintLayout2;
        this.u = textView;
        this.v = mVar;
        sVar.b(d0Var2.b(), kVar.g());
        h(this.a);
        i(this.a);
        d0Var.b().setOnTouchListener(this);
    }

    private static int[] c(View view) {
        return new int[]{Math.max(view.getMeasuredWidth(), view.getLayoutParams().width), view.getPaddingBottom() + view.getPaddingTop() + Math.max(view.getMeasuredHeight(), view.getLayoutParams().height)};
    }

    private static void g(View view, int i) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop() + i, view.getPaddingRight(), view.getPaddingBottom() + i);
    }

    private void h(k kVar) {
        this.q.setImageDrawable(this.c.a(SpotifyIconV2.CHART_UP, C0707R.dimen.quickscroll_arrow_size, kVar.b()));
        this.r.setImageDrawable(this.c.a(SpotifyIconV2.CHART_DOWN, C0707R.dimen.quickscroll_arrow_size, kVar.b()));
    }

    private void i(k kVar) {
        ConstraintLayout constraintLayout = this.p;
        a.h(constraintLayout.getBackground(), kVar.c());
        ConstraintLayout constraintLayout2 = this.t;
        a.h(constraintLayout2.getBackground(), kVar.e());
        this.u.setTextColor(kVar.f());
    }

    public static void k(c0 c0Var) {
        int[] c2 = c(c0Var.s.b());
        FrameLayout b2 = c0Var.o.b();
        ViewGroup.LayoutParams layoutParams = b2.getLayoutParams();
        layoutParams.height = c2[1];
        b2.setLayoutParams(layoutParams);
        int i = (c2[0] - c(b2)[0]) / 2;
        b2.setPadding(b2.getPaddingLeft() + i, b2.getPaddingTop(), b2.getPaddingRight() + i, b2.getPaddingBottom());
    }

    public static void l(c0 c0Var) {
        int i = c(c0Var.s.b())[1];
        int i2 = c(c0Var.o.b())[1];
        if (i > i2) {
            g(c0Var.o.b(), (i - i2) / 2);
        } else if (i2 > i) {
            g(c0Var.s.b(), (i2 - i) / 2);
        }
    }

    public static void m(c0 c0Var) {
        FrameLayout b2 = c0Var.s.b();
        b2.setPadding(b2.getPaddingLeft(), 0, b2.getPaddingRight(), 0);
    }

    private void q(View view, float f2) {
        float paddingTop = (float) this.n.getPaddingTop();
        v(view, paddingTop, f2, new r(paddingTop, (float) (this.n.getMeasuredHeight() - this.n.getPaddingBottom())));
    }

    private static float v(View view, float f2, float f3, r rVar) {
        float f4 = f3 + f2;
        float a2 = r.a(rVar);
        float b2 = r.b(rVar) - ((float) view.getMeasuredHeight());
        if (f4 < a2 || f4 > b2) {
            f4 = f4 > a2 ? b2 : a2;
        }
        view.animate().y(f4).setDuration(0).start();
        return f4;
    }

    public void A(k kVar) {
        if (kVar.g() != this.a.g()) {
            this.b.b(this.s.b(), kVar.g());
        }
        if (kVar.b() != this.a.b()) {
            h(kVar);
        }
        if (!(kVar.c() == this.a.c() && kVar.e() == this.a.e() && kVar.f() == this.a.f())) {
            i(kVar);
        }
        this.a = kVar;
    }

    public void B(String str) {
        this.u.setText(str);
    }

    public void a() {
        this.x = false;
    }

    public void b() {
        this.x = true;
    }

    public int d() {
        return (this.n.getMeasuredHeight() - (this.n.getPaddingBottom() + this.n.getPaddingTop())) - this.o.b().getMeasuredHeight();
    }

    public void e() {
        this.f.c(this.p);
    }

    public void f() {
        this.f.c(this.s.b());
    }

    public boolean j() {
        return this.w;
    }

    public void n() {
        this.n.post(new d(this));
    }

    public void o(float f2) {
        q(this.o.b(), f2);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (view != this.o.b() || !this.x) {
            return false;
        }
        int action = motionEvent.getAction() & BitmapRenderer.ALPHA_VISIBLE;
        if (action == 0) {
            this.w = true;
            float rawY = motionEvent.getRawY();
            d0<FrameLayout> d0Var = this.o;
            d0Var.c(d0Var.b().getY() - rawY);
            d0<FrameLayout> d0Var2 = this.s;
            d0Var2.c(d0Var2.b().getY() - rawY);
            ((t) this.v).h();
        } else if (action == 1) {
            this.w = false;
            ((t) this.v).i();
        } else if (action == 2) {
            float rawY2 = motionEvent.getRawY();
            r rVar = new r(0.0f, (float) (this.n.getMeasuredHeight() - this.n.getPaddingBottom()));
            float v2 = v(this.o.b(), this.o.a(), rawY2, rVar);
            v(this.s.b(), this.s.a(), rawY2, rVar);
            ((t) this.v).k(v2);
        }
        this.n.invalidate();
        return true;
    }

    public void p(float f2) {
        q(this.s.b(), f2);
    }

    public void r() {
        this.f.b(this.s.b(), this.a.j());
    }

    public void s() {
        this.n.post(new e(this));
    }

    public void t() {
        this.n.post(new c(this));
    }

    public void u() {
        this.f.b(this.s.b(), this.a.g());
    }

    public void w(boolean z) {
        ConstraintLayout constraintLayout = this.p;
        if (z) {
            constraintLayout.setVisibility(0);
        } else {
            constraintLayout.setVisibility(4);
        }
    }

    public void x(boolean z) {
        FrameLayout b2 = this.s.b();
        if (z) {
            b2.setVisibility(0);
        } else {
            b2.setVisibility(4);
        }
    }

    public void y() {
        this.f.f(this.p);
    }

    public void z() {
        this.f.f(this.s.b());
    }
}
