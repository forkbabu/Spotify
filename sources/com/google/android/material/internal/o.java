package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.material.internal.l;

public class o {

    static class a implements c {
        final /* synthetic */ boolean a;
        final /* synthetic */ boolean b;
        final /* synthetic */ boolean c;
        final /* synthetic */ c d;

        a(boolean z, boolean z2, boolean z3, c cVar) {
            this.a = z;
            this.b = z2;
            this.c = z3;
            this.d = cVar;
        }

        @Override // com.google.android.material.internal.o.c
        public b5 a(View view, b5 b5Var, d dVar) {
            if (this.a) {
                dVar.d = b5Var.g() + dVar.d;
            }
            boolean g = o.g(view);
            if (this.b) {
                if (g) {
                    dVar.c = b5Var.h() + dVar.c;
                } else {
                    dVar.a = b5Var.h() + dVar.a;
                }
            }
            if (this.c) {
                if (g) {
                    dVar.a = b5Var.i() + dVar.a;
                } else {
                    dVar.c = b5Var.i() + dVar.c;
                }
            }
            q4.Q(view, dVar.a, dVar.b, dVar.c, dVar.d);
            c cVar = this.d;
            return cVar != null ? cVar.a(view, b5Var, dVar) : b5Var;
        }
    }

    /* access modifiers changed from: package-private */
    public static class b implements m4 {
        final /* synthetic */ c a;
        final /* synthetic */ d b;

        b(c cVar, d dVar) {
            this.a = cVar;
            this.b = dVar;
        }

        @Override // defpackage.m4
        public b5 onApplyWindowInsets(View view, b5 b5Var) {
            return this.a.a(view, b5Var, new d(this.b));
        }
    }

    public interface c {
        b5 a(View view, b5 b5Var, d dVar);
    }

    public static void a(View view, AttributeSet attributeSet, int i, int i2, c cVar) {
        TypedArray obtainStyledAttributes = view.getContext().obtainStyledAttributes(attributeSet, pw.r, i, i2);
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        boolean z2 = obtainStyledAttributes.getBoolean(1, false);
        boolean z3 = obtainStyledAttributes.getBoolean(2, false);
        obtainStyledAttributes.recycle();
        b(view, new a(z, z2, z3, cVar));
    }

    public static void b(View view, c cVar) {
        q4.P(view, new b(cVar, new d(q4.r(view), view.getPaddingTop(), q4.q(view), view.getPaddingBottom())));
        if (q4.v(view)) {
            q4.F(view);
        } else {
            view.addOnAttachStateChangeListener(new p());
        }
    }

    public static float c(Context context, int i) {
        return TypedValue.applyDimension(1, (float) i, context.getResources().getDisplayMetrics());
    }

    public static ViewGroup d(View view) {
        if (view == null) {
            return null;
        }
        View rootView = view.getRootView();
        ViewGroup viewGroup = (ViewGroup) rootView.findViewById(16908290);
        if (viewGroup != null) {
            return viewGroup;
        }
        if (rootView == view || !(rootView instanceof ViewGroup)) {
            return null;
        }
        return (ViewGroup) rootView;
    }

    public static n e(View view) {
        ViewGroup d2 = d(view);
        if (d2 != null) {
            if (Build.VERSION.SDK_INT >= 18) {
                return new m(d2);
            }
            ViewGroup d3 = d(d2);
            if (d3 != null) {
                int childCount = d3.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = d3.getChildAt(i);
                    if (childAt instanceof l.a) {
                        return ((l.a) childAt).f;
                    }
                }
                return new k(d3.getContext(), d3, d2);
            }
        }
        return null;
    }

    public static float f(View view) {
        float f = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            f += q4.k((View) parent);
        }
        return f;
    }

    public static boolean g(View view) {
        return q4.o(view) == 1;
    }

    public static PorterDuff.Mode h(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static class d {
        public int a;
        public int b;
        public int c;
        public int d;

        public d(int i, int i2, int i3, int i4) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
        }

        public d(d dVar) {
            this.a = dVar.a;
            this.b = dVar.b;
            this.c = dVar.c;
            this.d = dVar.d;
        }
    }
}
