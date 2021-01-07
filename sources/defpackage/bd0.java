package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.view.inputmethod.InputMethodManager;
import com.google.common.base.MoreObjects;
import com.spotify.mobile.android.util.Assertion;

/* renamed from: bd0  reason: default package */
public final class bd0 {

    /* renamed from: bd0$a */
    static class a implements Runnable {
        final /* synthetic */ View a;

        a(View view) {
            this.a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            View view = this.a;
            ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 1);
        }
    }

    /* renamed from: bd0$b */
    static class b extends AnimatorListenerAdapter {
        final /* synthetic */ View a;
        final /* synthetic */ View b;

        b(View view, View view2) {
            this.a = view;
            this.b = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.a.setAlpha(1.0f);
            this.a.setVisibility(4);
            this.b.setVisibility(0);
            this.b.setAlpha(0.0f);
            this.b.animate().setListener(null).alpha(1.0f).start();
        }
    }

    /* renamed from: bd0$c */
    static class c implements ViewTreeObserver.OnPreDrawListener {
        final /* synthetic */ qg0 a;
        final /* synthetic */ View b;
        final /* synthetic */ ViewTreeObserver c;
        final /* synthetic */ boolean f;

        c(qg0 qg0, View view, ViewTreeObserver viewTreeObserver, boolean z) {
            this.a = qg0;
            this.b = view;
            this.c = viewTreeObserver;
            this.f = z;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.a.accept(this.b);
            if (this.c.isAlive()) {
                this.c.removeOnPreDrawListener(this);
            } else {
                this.b.getViewTreeObserver().removeOnPreDrawListener(this);
            }
            return this.f;
        }
    }

    public static void a(View view, View view2) {
        view.animate().alpha(0.0f).setListener(new b(view, view2)).start();
    }

    public static <V extends View> void b(V v, qg0<V> qg0, boolean z) {
        v.getClass();
        ViewTreeObserver viewTreeObserver = v.getViewTreeObserver();
        viewTreeObserver.addOnPreDrawListener(new c(qg0, v, viewTreeObserver, z));
    }

    public static void c(View view) {
        d(view, 400);
    }

    private static void d(View view, long j) {
        if (view.getVisibility() != 0) {
            view.clearAnimation();
            view.setVisibility(0);
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setInterpolator(ta0.d);
            alphaAnimation.setDuration(j);
            view.startAnimation(alphaAnimation);
        }
    }

    public static void e(View view) {
        d(view, 125);
    }

    public static void f(View view, int i) {
        MoreObjects.checkArgument(i == 4 || i == 8);
        if (view.getVisibility() != i) {
            view.clearAnimation();
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setInterpolator(ta0.d);
            alphaAnimation.setDuration(400);
            alphaAnimation.setAnimationListener(new ad0(view, i));
            view.startAnimation(alphaAnimation);
        }
    }

    public static boolean g(View view) {
        return ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public static boolean h(View view) {
        return view.isEnabled() && view.isClickable() && view.performClick();
    }

    public static void i(View view) {
        ViewParent parent = view.getParent();
        if (parent == null) {
            return;
        }
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(view);
            return;
        }
        Assertion.p("Parent is not a ViewGroup: " + parent);
    }

    public static void j(View view, long j) {
        view.postDelayed(new a(view), j);
    }
}
