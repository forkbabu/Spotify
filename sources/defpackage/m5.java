package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import defpackage.n5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: m5  reason: default package */
public abstract class m5 extends z3 {
    private static final Rect k = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    private static final n5.a<d5> l = new a();
    private static final n5.b<u1<d5>, d5> m = new b();
    private final Rect a = new Rect();
    private final Rect b = new Rect();
    private final Rect c = new Rect();
    private final int[] d = new int[2];
    private final AccessibilityManager e;
    private final View f;
    private c g;
    int h = Integer.MIN_VALUE;
    int i = Integer.MIN_VALUE;
    private int j = Integer.MIN_VALUE;

    /* access modifiers changed from: package-private */
    /* renamed from: m5$a */
    public class a implements n5.a<d5> {
        a() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m5$b */
    public class b implements n5.b<u1<d5>, d5> {
        b() {
        }
    }

    /* renamed from: m5$c */
    private class c extends e5 {
        c() {
        }

        @Override // defpackage.e5
        public d5 a(int i) {
            return d5.G(m5.this.m(i));
        }

        @Override // defpackage.e5
        public d5 b(int i) {
            int i2 = i == 2 ? m5.this.h : m5.this.i;
            if (i2 == Integer.MIN_VALUE) {
                return null;
            }
            return d5.G(m5.this.m(i2));
        }

        @Override // defpackage.e5
        public boolean d(int i, int i2, Bundle bundle) {
            return m5.this.s(i, i2, bundle);
        }
    }

    public m5(View view) {
        if (view != null) {
            this.f = view;
            this.e = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            if (q4.n(view) == 0) {
                q4.O(view, 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    private boolean a(int i2) {
        if (this.h != i2) {
            return false;
        }
        this.h = Integer.MIN_VALUE;
        this.f.invalidate();
        u(i2, 65536);
        return true;
    }

    private AccessibilityEvent c(int i2, int i3) {
        if (i2 != -1) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain(i3);
            d5 m2 = m(i2);
            obtain.getText().add(m2.r());
            obtain.setContentDescription(m2.n());
            obtain.setScrollable(m2.A());
            obtain.setPassword(m2.z());
            obtain.setEnabled(m2.v());
            obtain.setChecked(m2.t());
            if (!obtain.getText().isEmpty() || obtain.getContentDescription() != null) {
                obtain.setClassName(m2.l());
                View view = this.f;
                int i4 = Build.VERSION.SDK_INT;
                obtain.setSource(view, i2);
                obtain.setPackageName(this.f.getContext().getPackageName());
                return obtain;
            }
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        AccessibilityEvent obtain2 = AccessibilityEvent.obtain(i3);
        this.f.onInitializeAccessibilityEvent(obtain2);
        return obtain2;
    }

    private d5 d(int i2) {
        d5 E = d5.E();
        E.X(true);
        E.Z(true);
        E.R("android.view.View");
        Rect rect = k;
        E.M(rect);
        E.N(rect);
        E.i0(this.f);
        q(i2, E);
        if (E.r() == null && E.n() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        E.i(this.b);
        if (!this.b.equals(rect)) {
            int h2 = E.h();
            if ((h2 & 64) != 0) {
                throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            } else if ((h2 & 128) == 0) {
                E.g0(this.f.getContext().getPackageName());
                E.r0(this.f, i2);
                boolean z = false;
                if (this.h == i2) {
                    E.K(true);
                    E.a(128);
                } else {
                    E.K(false);
                    E.a(64);
                }
                boolean z2 = this.i == i2;
                if (z2) {
                    E.a(2);
                } else if (E.w()) {
                    E.a(1);
                }
                E.a0(z2);
                this.f.getLocationOnScreen(this.d);
                E.j(this.a);
                if (this.a.equals(rect)) {
                    E.i(this.a);
                    if (E.b != -1) {
                        d5 E2 = d5.E();
                        for (int i3 = E.b; i3 != -1; i3 = E2.b) {
                            E2.j0(this.f, -1);
                            E2.M(k);
                            q(i3, E2);
                            E2.i(this.b);
                            Rect rect2 = this.a;
                            Rect rect3 = this.b;
                            rect2.offset(rect3.left, rect3.top);
                        }
                        E2.I();
                    }
                    this.a.offset(this.d[0] - this.f.getScrollX(), this.d[1] - this.f.getScrollY());
                }
                if (this.f.getLocalVisibleRect(this.c)) {
                    this.c.offset(this.d[0] - this.f.getScrollX(), this.d[1] - this.f.getScrollY());
                    if (this.a.intersect(this.c)) {
                        E.N(this.a);
                        Rect rect4 = this.a;
                        if (rect4 != null && !rect4.isEmpty() && this.f.getWindowVisibility() == 0) {
                            ViewParent parent = this.f.getParent();
                            while (true) {
                                if (parent instanceof View) {
                                    View view = (View) parent;
                                    if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                                        break;
                                    }
                                    parent = view.getParent();
                                } else if (parent != null) {
                                    z = true;
                                }
                            }
                        }
                        if (z) {
                            E.t0(true);
                        }
                    }
                }
                return E;
            } else {
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
        } else {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
    }

    private boolean l(int i2, Rect rect) {
        d5 d5Var;
        ArrayList arrayList = new ArrayList();
        j(arrayList);
        u1 u1Var = new u1(10);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            u1Var.n(((Integer) arrayList.get(i3)).intValue(), d(((Integer) arrayList.get(i3)).intValue()));
        }
        int i4 = this.i;
        Object obj = null;
        int i5 = Integer.MIN_VALUE;
        d5 d5Var2 = i4 == Integer.MIN_VALUE ? null : (d5) u1Var.f(i4);
        int i6 = -1;
        if (i2 == 1 || i2 == 2) {
            boolean z = q4.o(this.f) == 1;
            n5.b<u1<d5>, d5> bVar = m;
            n5.a<d5> aVar = l;
            ((b) bVar).getClass();
            int q = u1Var.q();
            ArrayList arrayList2 = new ArrayList(q);
            for (int i7 = 0; i7 < q; i7++) {
                arrayList2.add((d5) u1Var.r(i7));
            }
            Collections.sort(arrayList2, new n5.c(z, aVar));
            if (i2 == 1) {
                int size = arrayList2.size();
                if (d5Var2 != null) {
                    size = arrayList2.indexOf(d5Var2);
                }
                int i8 = size - 1;
                if (i8 >= 0) {
                    obj = arrayList2.get(i8);
                }
            } else if (i2 == 2) {
                int size2 = arrayList2.size();
                if (d5Var2 != null) {
                    i6 = arrayList2.lastIndexOf(d5Var2);
                }
                int i9 = i6 + 1;
                if (i9 < size2) {
                    obj = arrayList2.get(i9);
                }
            } else {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
            }
            d5Var = (d5) obj;
        } else if (i2 == 17 || i2 == 33 || i2 == 66 || i2 == 130) {
            Rect rect2 = new Rect();
            int i10 = this.i;
            if (i10 != Integer.MIN_VALUE) {
                m(i10).i(rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                View view = this.f;
                int width = view.getWidth();
                int height = view.getHeight();
                if (i2 == 17) {
                    rect2.set(width, 0, width, height);
                } else if (i2 == 33) {
                    rect2.set(0, height, width, height);
                } else if (i2 == 66) {
                    rect2.set(-1, 0, -1, height);
                } else if (i2 == 130) {
                    rect2.set(0, -1, width, -1);
                } else {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                }
            }
            d5Var = (d5) n5.c(u1Var, m, l, d5Var2, rect2, i2);
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        if (d5Var != null) {
            i5 = u1Var.m(u1Var.k(d5Var));
        }
        return t(i5);
    }

    private void v(int i2) {
        int i3 = this.j;
        if (i3 != i2) {
            this.j = i2;
            u(i2, 128);
            u(i3, 256);
        }
    }

    public final boolean b(int i2) {
        if (this.i != i2) {
            return false;
        }
        this.i = Integer.MIN_VALUE;
        r(i2, false);
        u(i2, 8);
        return true;
    }

    public final boolean e(MotionEvent motionEvent) {
        int i2;
        if (this.e.isEnabled() && this.e.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                int i3 = i(motionEvent.getX(), motionEvent.getY());
                int i4 = this.j;
                if (i4 != i3) {
                    this.j = i3;
                    u(i3, 128);
                    u(i4, 256);
                }
                if (i3 != Integer.MIN_VALUE) {
                    return true;
                }
            } else if (action != 10 || (i2 = this.j) == Integer.MIN_VALUE) {
                return false;
            } else {
                if (i2 != Integer.MIN_VALUE) {
                    this.j = Integer.MIN_VALUE;
                    u(Integer.MIN_VALUE, 128);
                    u(i2, 256);
                }
                return true;
            }
        }
        return false;
    }

    public final boolean f(KeyEvent keyEvent) {
        int i2 = 0;
        if (keyEvent.getAction() == 1) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 61) {
            int i3 = 66;
            if (keyCode != 66) {
                switch (keyCode) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                        if (!keyEvent.hasNoModifiers()) {
                            return false;
                        }
                        if (keyCode == 19) {
                            i3 = 33;
                        } else if (keyCode == 21) {
                            i3 = 17;
                        } else if (keyCode != 22) {
                            i3 = 130;
                        }
                        int repeatCount = keyEvent.getRepeatCount() + 1;
                        boolean z = false;
                        while (i2 < repeatCount && l(i3, null)) {
                            i2++;
                            z = true;
                        }
                        return z;
                    case 23:
                        break;
                    default:
                        return false;
                }
            }
            if (!keyEvent.hasNoModifiers() || keyEvent.getRepeatCount() != 0) {
                return false;
            }
            int i4 = this.i;
            if (i4 != Integer.MIN_VALUE) {
                o(i4, 16, null);
            }
            return true;
        } else if (keyEvent.hasNoModifiers()) {
            return l(2, null);
        } else {
            if (keyEvent.hasModifiers(1)) {
                return l(1, null);
            }
            return false;
        }
    }

    public final int g() {
        return this.h;
    }

    @Override // defpackage.z3
    public e5 getAccessibilityNodeProvider(View view) {
        if (this.g == null) {
            this.g = new c();
        }
        return this.g;
    }

    public final int h() {
        return this.i;
    }

    /* access modifiers changed from: protected */
    public abstract int i(float f2, float f3);

    /* access modifiers changed from: protected */
    public abstract void j(List<Integer> list);

    public final void k(int i2) {
        ViewParent parent;
        if (i2 != Integer.MIN_VALUE && this.e.isEnabled() && (parent = this.f.getParent()) != null) {
            AccessibilityEvent c2 = c(i2, 2048);
            if (Build.VERSION.SDK_INT >= 19) {
                c2.setContentChangeTypes(0);
            }
            parent.requestSendAccessibilityEvent(this.f, c2);
        }
    }

    /* access modifiers changed from: package-private */
    public d5 m(int i2) {
        if (i2 != -1) {
            return d(i2);
        }
        d5 F = d5.F(this.f);
        View view = this.f;
        int i3 = q4.g;
        view.onInitializeAccessibilityNodeInfo(F.u0());
        ArrayList arrayList = new ArrayList();
        j(arrayList);
        if (F.k() <= 0 || arrayList.size() <= 0) {
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                F.d(this.f, ((Integer) arrayList.get(i4)).intValue());
            }
            return F;
        }
        throw new RuntimeException("Views cannot have both real and virtual children");
    }

    public final void n(boolean z, int i2, Rect rect) {
        int i3 = this.i;
        if (i3 != Integer.MIN_VALUE) {
            b(i3);
        }
        if (z) {
            l(i2, rect);
        }
    }

    /* access modifiers changed from: protected */
    public abstract boolean o(int i2, int i3, Bundle bundle);

    @Override // defpackage.z3
    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // defpackage.z3
    public void onInitializeAccessibilityNodeInfo(View view, d5 d5Var) {
        super.onInitializeAccessibilityNodeInfo(view, d5Var);
        p(d5Var);
    }

    /* access modifiers changed from: protected */
    public void p(d5 d5Var) {
    }

    /* access modifiers changed from: protected */
    public abstract void q(int i2, d5 d5Var);

    /* access modifiers changed from: protected */
    public void r(int i2, boolean z) {
    }

    /* access modifiers changed from: package-private */
    public boolean s(int i2, int i3, Bundle bundle) {
        int i4;
        if (i2 != -1) {
            boolean z = true;
            if (i3 == 1) {
                return t(i2);
            }
            if (i3 == 2) {
                return b(i2);
            }
            if (i3 == 64) {
                if (!this.e.isEnabled() || !this.e.isTouchExplorationEnabled() || (i4 = this.h) == i2) {
                    z = false;
                } else {
                    if (i4 != Integer.MIN_VALUE) {
                        a(i4);
                    }
                    this.h = i2;
                    this.f.invalidate();
                    u(i2, 32768);
                }
                return z;
            } else if (i3 != 128) {
                return o(i2, i3, bundle);
            } else {
                return a(i2);
            }
        } else {
            View view = this.f;
            int i5 = q4.g;
            int i6 = Build.VERSION.SDK_INT;
            return view.performAccessibilityAction(i3, bundle);
        }
    }

    public final boolean t(int i2) {
        int i3;
        if ((!this.f.isFocused() && !this.f.requestFocus()) || (i3 = this.i) == i2) {
            return false;
        }
        if (i3 != Integer.MIN_VALUE) {
            b(i3);
        }
        if (i2 == Integer.MIN_VALUE) {
            return false;
        }
        this.i = i2;
        r(i2, true);
        u(i2, 8);
        return true;
    }

    public final boolean u(int i2, int i3) {
        ViewParent parent;
        if (i2 == Integer.MIN_VALUE || !this.e.isEnabled() || (parent = this.f.getParent()) == null) {
            return false;
        }
        return parent.requestSendAccessibilityEvent(this.f, c(i2, i3));
    }
}
