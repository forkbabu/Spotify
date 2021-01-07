package androidx.appcompat.widget;

import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;

/* access modifiers changed from: package-private */
public class l0 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    private static l0 s;
    private static l0 t;
    private final View a;
    private final CharSequence b;
    private final int c;
    private final Runnable f = new a();
    private final Runnable n = new b();
    private int o;
    private int p;
    private m0 q;
    private boolean r;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            l0.this.e(false);
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            l0.this.b();
        }
    }

    private l0(View view, CharSequence charSequence) {
        int i;
        this.a = view;
        this.b = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        int i2 = u4.b;
        if (Build.VERSION.SDK_INT >= 28) {
            i = viewConfiguration.getScaledHoverSlop();
        } else {
            i = viewConfiguration.getScaledTouchSlop() / 2;
        }
        this.c = i;
        a();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    private void a() {
        this.o = Integer.MAX_VALUE;
        this.p = Integer.MAX_VALUE;
    }

    private static void c(l0 l0Var) {
        l0 l0Var2 = s;
        if (l0Var2 != null) {
            l0Var2.a.removeCallbacks(l0Var2.f);
        }
        s = l0Var;
        if (l0Var != null) {
            l0Var.a.postDelayed(l0Var.f, (long) ViewConfiguration.getLongPressTimeout());
        }
    }

    public static void d(View view, CharSequence charSequence) {
        l0 l0Var = s;
        if (l0Var != null && l0Var.a == view) {
            c(null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            l0 l0Var2 = t;
            if (l0Var2 != null && l0Var2.a == view) {
                l0Var2.b();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new l0(view, charSequence);
    }

    /* access modifiers changed from: package-private */
    public void b() {
        if (t == this) {
            t = null;
            m0 m0Var = this.q;
            if (m0Var != null) {
                m0Var.a();
                this.q = null;
                a();
                this.a.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (s == this) {
            c(null);
        }
        this.a.removeCallbacks(this.n);
    }

    /* access modifiers changed from: package-private */
    public void e(boolean z) {
        long j;
        int i;
        long j2;
        if (q4.v(this.a)) {
            c(null);
            l0 l0Var = t;
            if (l0Var != null) {
                l0Var.b();
            }
            t = this;
            this.r = z;
            m0 m0Var = new m0(this.a.getContext());
            this.q = m0Var;
            m0Var.b(this.a, this.o, this.p, this.r, this.b);
            this.a.addOnAttachStateChangeListener(this);
            if (this.r) {
                j = 2500;
            } else {
                if ((q4.t(this.a) & 1) == 1) {
                    j2 = 3000;
                    i = ViewConfiguration.getLongPressTimeout();
                } else {
                    j2 = 15000;
                    i = ViewConfiguration.getLongPressTimeout();
                }
                j = j2 - ((long) i);
            }
            this.a.removeCallbacks(this.n);
            this.a.postDelayed(this.n, j);
        }
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        boolean z;
        if (this.q != null && this.r) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.a.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                a();
                b();
            }
        } else if (this.a.isEnabled() && this.q == null) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (Math.abs(x - this.o) > this.c || Math.abs(y - this.p) > this.c) {
                this.o = x;
                this.p = y;
                z = true;
            } else {
                z = false;
            }
            if (z) {
                c(this);
            }
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.o = view.getWidth() / 2;
        this.p = view.getHeight() / 2;
        e(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        b();
    }
}
