package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition;
import androidx.transition.a;

public abstract class Visibility extends Transition {
    private static final String[] P = {"android:visibility:visibility", "android:visibility:parent"};
    private int O = 3;

    /* access modifiers changed from: private */
    public static class a extends AnimatorListenerAdapter implements Transition.d, a.AbstractC0048a {
        private final View a;
        private final int b;
        private final ViewGroup c;
        private final boolean f;
        private boolean n;
        boolean o = false;

        a(View view, int i, boolean z) {
            this.a = view;
            this.b = i;
            this.c = (ViewGroup) view.getParent();
            this.f = z;
            g(true);
        }

        private void f() {
            if (!this.o) {
                g0.h(this.a, this.b);
                ViewGroup viewGroup = this.c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            g(false);
        }

        private void g(boolean z) {
            ViewGroup viewGroup;
            if (this.f && this.n != z && (viewGroup = this.c) != null) {
                this.n = z;
                d0.c(viewGroup, z);
            }
        }

        @Override // androidx.transition.Transition.d
        public void a(Transition transition) {
            g(true);
        }

        @Override // androidx.transition.Transition.d
        public void b(Transition transition) {
        }

        @Override // androidx.transition.Transition.d
        public void c(Transition transition) {
            g(false);
        }

        @Override // androidx.transition.Transition.d
        public void d(Transition transition) {
            f();
            transition.P(this);
        }

        @Override // androidx.transition.Transition.d
        public void e(Transition transition) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.o = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            f();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener, androidx.transition.a.AbstractC0048a
        public void onAnimationPause(Animator animator) {
            if (!this.o) {
                g0.h(this.a, this.b);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener, androidx.transition.a.AbstractC0048a
        public void onAnimationResume(Animator animator) {
            if (!this.o) {
                g0.h(this.a, 0);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* access modifiers changed from: private */
    public static class b {
        boolean a;
        boolean b;
        int c;
        int d;
        ViewGroup e;
        ViewGroup f;

        b() {
        }
    }

    public Visibility() {
    }

    private void c0(x xVar) {
        xVar.a.put("android:visibility:visibility", Integer.valueOf(xVar.b.getVisibility()));
        xVar.a.put("android:visibility:parent", xVar.b.getParent());
        int[] iArr = new int[2];
        xVar.b.getLocationOnScreen(iArr);
        xVar.a.put("android:visibility:screenLocation", iArr);
    }

    private b f0(x xVar, x xVar2) {
        b bVar = new b();
        bVar.a = false;
        bVar.b = false;
        if (xVar == null || !xVar.a.containsKey("android:visibility:visibility")) {
            bVar.c = -1;
            bVar.e = null;
        } else {
            bVar.c = ((Integer) xVar.a.get("android:visibility:visibility")).intValue();
            bVar.e = (ViewGroup) xVar.a.get("android:visibility:parent");
        }
        if (xVar2 == null || !xVar2.a.containsKey("android:visibility:visibility")) {
            bVar.d = -1;
            bVar.f = null;
        } else {
            bVar.d = ((Integer) xVar2.a.get("android:visibility:visibility")).intValue();
            bVar.f = (ViewGroup) xVar2.a.get("android:visibility:parent");
        }
        if (xVar != null && xVar2 != null) {
            int i = bVar.c;
            int i2 = bVar.d;
            if (i == i2 && bVar.e == bVar.f) {
                return bVar;
            }
            if (i != i2) {
                if (i == 0) {
                    bVar.b = false;
                    bVar.a = true;
                } else if (i2 == 0) {
                    bVar.b = true;
                    bVar.a = true;
                }
            } else if (bVar.f == null) {
                bVar.b = false;
                bVar.a = true;
            } else if (bVar.e == null) {
                bVar.b = true;
                bVar.a = true;
            }
        } else if (xVar == null && bVar.d == 0) {
            bVar.b = true;
            bVar.a = true;
        } else if (xVar2 == null && bVar.c == 0) {
            bVar.b = false;
            bVar.a = true;
        }
        return bVar;
    }

    @Override // androidx.transition.Transition
    public String[] I() {
        return P;
    }

    @Override // androidx.transition.Transition
    public boolean K(x xVar, x xVar2) {
        if (xVar == null && xVar2 == null) {
            return false;
        }
        if (xVar != null && xVar2 != null && xVar2.a.containsKey("android:visibility:visibility") != xVar.a.containsKey("android:visibility:visibility")) {
            return false;
        }
        b f0 = f0(xVar, xVar2);
        if (!f0.a) {
            return false;
        }
        if (f0.c == 0 || f0.d == 0) {
            return true;
        }
        return false;
    }

    public int e0() {
        return this.O;
    }

    public Animator g0(ViewGroup viewGroup, View view, x xVar, x xVar2) {
        return null;
    }

    public Animator h0(ViewGroup viewGroup, x xVar, x xVar2) {
        if ((this.O & 1) != 1 || xVar2 == null) {
            return null;
        }
        if (xVar == null) {
            View view = (View) xVar2.b.getParent();
            if (f0(C(view, false), J(view, false)).a) {
                return null;
            }
        }
        return g0(viewGroup, xVar2.b, xVar, xVar2);
    }

    public Animator i0(ViewGroup viewGroup, View view, x xVar, x xVar2) {
        return null;
    }

    @Override // androidx.transition.Transition
    public void j(x xVar) {
        c0(xVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008a, code lost:
        if (r17.B != false) goto L_0x008c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.animation.Animator j0(android.view.ViewGroup r18, androidx.transition.x r19, androidx.transition.x r20, int r21) {
        /*
        // Method dump skipped, instructions count: 265
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.Visibility.j0(android.view.ViewGroup, androidx.transition.x, androidx.transition.x, int):android.animation.Animator");
    }

    public void k0(int i) {
        if ((i & -4) == 0) {
            this.O = i;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    @Override // androidx.transition.Transition
    public void n(x xVar) {
        c0(xVar);
    }

    @Override // androidx.transition.Transition
    public Animator r(ViewGroup viewGroup, x xVar, x xVar2) {
        b f0 = f0(xVar, xVar2);
        if (!f0.a) {
            return null;
        }
        if (f0.e == null && f0.f == null) {
            return null;
        }
        if (f0.b) {
            return h0(viewGroup, xVar, xVar2);
        }
        return j0(viewGroup, xVar, xVar2, f0.d);
    }

    public Visibility(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p.d);
        int k = i2.k(obtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionVisibilityMode", 0, 0);
        obtainStyledAttributes.recycle();
        if (k != 0) {
            k0(k);
        }
    }
}
