package com.google.android.material.behavior;

import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.d5;
import defpackage.o5;

public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {
    o5 a;
    b b;
    private boolean c;
    int d = 2;
    float e = 0.5f;
    float f = 0.0f;
    float g = 0.5f;
    private final o5.c h = new a();

    class a extends o5.c {
        private int a;
        private int b = -1;

        a() {
        }

        @Override // defpackage.o5.c
        public int a(View view, int i, int i2) {
            int i3;
            int i4;
            int width;
            boolean z = q4.o(view) == 1;
            int i5 = SwipeDismissBehavior.this.d;
            if (i5 != 0) {
                if (i5 != 1) {
                    i3 = this.a - view.getWidth();
                    i4 = view.getWidth() + this.a;
                } else if (z) {
                    i3 = this.a;
                    width = view.getWidth();
                } else {
                    i3 = this.a - view.getWidth();
                    i4 = this.a;
                }
                return Math.min(Math.max(i3, i), i4);
            } else if (z) {
                i3 = this.a - view.getWidth();
                i4 = this.a;
                return Math.min(Math.max(i3, i), i4);
            } else {
                i3 = this.a;
                width = view.getWidth();
            }
            i4 = width + i3;
            return Math.min(Math.max(i3, i), i4);
        }

        @Override // defpackage.o5.c
        public int b(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // defpackage.o5.c
        public int c(View view) {
            return view.getWidth();
        }

        @Override // defpackage.o5.c
        public void h(View view, int i) {
            this.b = i;
            this.a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        @Override // defpackage.o5.c
        public void i(int i) {
            b bVar = SwipeDismissBehavior.this.b;
            if (bVar != null) {
                bVar.b(i);
            }
        }

        @Override // defpackage.o5.c
        public void j(View view, int i, int i2, int i3, int i4) {
            float width = (((float) view.getWidth()) * SwipeDismissBehavior.this.f) + ((float) this.a);
            float width2 = (((float) view.getWidth()) * SwipeDismissBehavior.this.g) + ((float) this.a);
            float f = (float) i;
            if (f <= width) {
                view.setAlpha(1.0f);
            } else if (f >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.b(0.0f, 1.0f - ((f - width) / (width2 - width)), 1.0f));
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0058, code lost:
            if (java.lang.Math.abs(r7.getLeft() - r6.a) >= java.lang.Math.round(((float) r7.getWidth()) * r6.c.e)) goto L_0x002c;
         */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x005d  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x006a  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x007a  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x0089  */
        @Override // defpackage.o5.c
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void k(android.view.View r7, float r8, float r9) {
            /*
                r6 = this;
                r9 = -1
                r6.b = r9
                int r9 = r7.getWidth()
                r0 = 0
                r1 = 0
                r2 = 1
                int r3 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r3 == 0) goto L_0x003e
                int r3 = defpackage.q4.o(r7)
                if (r3 != r2) goto L_0x0016
                r3 = 1
                goto L_0x0017
            L_0x0016:
                r3 = 0
            L_0x0017:
                com.google.android.material.behavior.SwipeDismissBehavior r4 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r4 = r4.d
                r5 = 2
                if (r4 != r5) goto L_0x001f
                goto L_0x002c
            L_0x001f:
                if (r4 != 0) goto L_0x0030
                if (r3 == 0) goto L_0x0028
                int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r8 >= 0) goto L_0x002e
                goto L_0x002c
            L_0x0028:
                int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r8 <= 0) goto L_0x002e
            L_0x002c:
                r8 = 1
                goto L_0x005b
            L_0x002e:
                r8 = 0
                goto L_0x005b
            L_0x0030:
                if (r4 != r2) goto L_0x002e
                if (r3 == 0) goto L_0x0039
                int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r8 <= 0) goto L_0x002e
                goto L_0x003d
            L_0x0039:
                int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r8 >= 0) goto L_0x002e
            L_0x003d:
                goto L_0x002c
            L_0x003e:
                int r8 = r7.getLeft()
                int r0 = r6.a
                int r8 = r8 - r0
                int r0 = r7.getWidth()
                float r0 = (float) r0
                com.google.android.material.behavior.SwipeDismissBehavior r3 = com.google.android.material.behavior.SwipeDismissBehavior.this
                float r3 = r3.e
                float r0 = r0 * r3
                int r0 = java.lang.Math.round(r0)
                int r8 = java.lang.Math.abs(r8)
                if (r8 < r0) goto L_0x002e
                goto L_0x002c
            L_0x005b:
                if (r8 == 0) goto L_0x006a
                int r8 = r7.getLeft()
                int r0 = r6.a
                if (r8 >= r0) goto L_0x0067
                int r0 = r0 - r9
                goto L_0x0068
            L_0x0067:
                int r0 = r0 + r9
            L_0x0068:
                r1 = 1
                goto L_0x006c
            L_0x006a:
                int r0 = r6.a
            L_0x006c:
                com.google.android.material.behavior.SwipeDismissBehavior r8 = com.google.android.material.behavior.SwipeDismissBehavior.this
                o5 r8 = r8.a
                int r9 = r7.getTop()
                boolean r8 = r8.H(r0, r9)
                if (r8 == 0) goto L_0x0089
                com.google.android.material.behavior.SwipeDismissBehavior$c r8 = new com.google.android.material.behavior.SwipeDismissBehavior$c
                com.google.android.material.behavior.SwipeDismissBehavior r9 = com.google.android.material.behavior.SwipeDismissBehavior.this
                r8.<init>(r7, r1)
                int r9 = defpackage.q4.g
                int r9 = android.os.Build.VERSION.SDK_INT
                r7.postOnAnimation(r8)
                goto L_0x0094
            L_0x0089:
                if (r1 == 0) goto L_0x0094
                com.google.android.material.behavior.SwipeDismissBehavior r8 = com.google.android.material.behavior.SwipeDismissBehavior.this
                com.google.android.material.behavior.SwipeDismissBehavior$b r8 = r8.b
                if (r8 == 0) goto L_0x0094
                r8.a(r7)
            L_0x0094:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.a.k(android.view.View, float, float):void");
        }

        @Override // defpackage.o5.c
        public boolean l(View view, int i) {
            int i2 = this.b;
            return (i2 == -1 || i2 == i) && SwipeDismissBehavior.this.a(view);
        }
    }

    public interface b {
        void a(View view);

        void b(int i);
    }

    private class c implements Runnable {
        private final View a;
        private final boolean b;

        c(View view, boolean z) {
            this.a = view;
            this.b = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            b bVar;
            o5 o5Var = SwipeDismissBehavior.this.a;
            if (o5Var != null && o5Var.k(true)) {
                View view = this.a;
                int i = q4.g;
                int i2 = Build.VERSION.SDK_INT;
                view.postOnAnimation(this);
            } else if (this.b && (bVar = SwipeDismissBehavior.this.b) != null) {
                bVar.a(this.a);
            }
        }
    }

    static float b(float f2, float f3, float f4) {
        return Math.min(Math.max(f2, f3), f4);
    }

    public boolean a(View view) {
        return true;
    }

    public void c(float f2) {
        this.g = b(0.0f, f2, 1.0f);
    }

    public void d(b bVar) {
        this.b = bVar;
    }

    public void e(float f2) {
        this.f = b(0.0f, f2, 1.0f);
    }

    public void f(int i) {
        this.d = i;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z = this.c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z = coordinatorLayout.o(v, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.c = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.c = false;
        }
        if (!z) {
            return false;
        }
        if (this.a == null) {
            this.a = o5.m(coordinatorLayout, this.h);
        }
        return this.a.I(motionEvent);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v, int i) {
        boolean onLayoutChild = super.onLayoutChild(coordinatorLayout, v, i);
        if (q4.n(v) == 0) {
            q4.O(v, 1);
            q4.C(v, 1048576);
            if (a(v)) {
                q4.E(v, d5.a.l, null, new a(this));
            }
        }
        return onLayoutChild;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        o5 o5Var = this.a;
        if (o5Var == null) {
            return false;
        }
        o5Var.y(motionEvent);
        return true;
    }
}
