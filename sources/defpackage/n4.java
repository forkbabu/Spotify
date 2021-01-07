package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: n4  reason: default package */
public final class n4 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    private final View a;
    private ViewTreeObserver b;
    private final Runnable c;

    private n4(View view, Runnable runnable) {
        this.a = view;
        this.b = view.getViewTreeObserver();
        this.c = runnable;
    }

    public static n4 a(View view, Runnable runnable) {
        if (view != null) {
            n4 n4Var = new n4(view, runnable);
            view.getViewTreeObserver().addOnPreDrawListener(n4Var);
            view.addOnAttachStateChangeListener(n4Var);
            return n4Var;
        }
        throw new NullPointerException("view == null");
    }

    public void b() {
        if (this.b.isAlive()) {
            this.b.removeOnPreDrawListener(this);
        } else {
            this.a.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.a.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        b();
        this.c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        b();
    }
}
