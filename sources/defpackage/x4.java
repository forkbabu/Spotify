package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* renamed from: x4  reason: default package */
public final class x4 {
    private WeakReference<View> a;
    int b = -1;

    /* access modifiers changed from: package-private */
    /* renamed from: x4$a */
    public class a extends AnimatorListenerAdapter {
        final /* synthetic */ y4 a;
        final /* synthetic */ View b;

        a(x4 x4Var, y4 y4Var, View view) {
            this.a = y4Var;
            this.b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.a.a(this.b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.a.b(this.b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.a.c(this.b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x4$b */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ a5 a;
        final /* synthetic */ View b;

        b(x4 x4Var, a5 a5Var, View view) {
            this.a = a5Var;
            this.b = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.a.a(this.b);
        }
    }

    x4(View view) {
        this.a = new WeakReference<>(view);
    }

    private void g(View view, y4 y4Var) {
        if (y4Var != null) {
            view.animate().setListener(new a(this, y4Var, view));
        } else {
            view.animate().setListener(null);
        }
    }

    public x4 a(float f) {
        View view = this.a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    public void b() {
        View view = this.a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long c() {
        View view = this.a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0;
    }

    public x4 d(long j) {
        View view = this.a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    public x4 e(Interpolator interpolator) {
        View view = this.a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public x4 f(y4 y4Var) {
        View view = this.a.get();
        if (view != null) {
            int i = Build.VERSION.SDK_INT;
            g(view, y4Var);
        }
        return this;
    }

    public x4 h(long j) {
        View view = this.a.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
        return this;
    }

    public x4 i(a5 a5Var) {
        View view = this.a.get();
        if (view != null && Build.VERSION.SDK_INT >= 19) {
            b bVar = null;
            if (a5Var != null) {
                bVar = new b(this, a5Var, view);
            }
            view.animate().setUpdateListener(bVar);
        }
        return this;
    }

    public void j() {
        View view = this.a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public x4 k(float f) {
        View view = this.a.get();
        if (view != null) {
            view.animate().translationX(f);
        }
        return this;
    }

    public x4 l(float f) {
        View view = this.a.get();
        if (view != null) {
            view.animate().translationXBy(f);
        }
        return this;
    }

    public x4 m(float f) {
        View view = this.a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }

    public x4 n(Runnable runnable) {
        View view = this.a.get();
        if (view != null) {
            int i = Build.VERSION.SDK_INT;
            view.animate().withEndAction(runnable);
        }
        return this;
    }

    public x4 o(Runnable runnable) {
        View view = this.a.get();
        if (view != null) {
            int i = Build.VERSION.SDK_INT;
            view.animate().withStartAction(runnable);
        }
        return this;
    }
}
