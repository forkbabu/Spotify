package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Locale;

/* access modifiers changed from: package-private */
public final class g extends RecyclerView.q {
    private ViewPager2.g a;
    private final ViewPager2 b;
    private final RecyclerView c;
    private final LinearLayoutManager d;
    private int e;
    private int f;
    private a g = new a();
    private int h;
    private int i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;

    /* access modifiers changed from: private */
    public static final class a {
        int a;
        float b;
        int c;

        a() {
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.a = -1;
            this.b = 0.0f;
            this.c = 0;
        }
    }

    g(ViewPager2 viewPager2) {
        this.b = viewPager2;
        RecyclerView recyclerView = viewPager2.s;
        this.c = recyclerView;
        this.d = (LinearLayoutManager) recyclerView.getLayoutManager();
        n();
    }

    private void e(int i2) {
        ViewPager2.g gVar = this.a;
        if (gVar != null) {
            gVar.c(i2);
        }
    }

    private void f(int i2) {
        if ((this.e != 3 || this.f != 0) && this.f != i2) {
            this.f = i2;
            ViewPager2.g gVar = this.a;
            if (gVar != null) {
                gVar.a(i2);
            }
        }
    }

    private void n() {
        this.e = 0;
        this.f = 0;
        this.g.a();
        this.h = -1;
        this.i = -1;
        this.j = false;
        this.k = false;
        this.m = false;
        this.l = false;
    }

    private void p() {
        int i2;
        a aVar = this.g;
        int Y1 = this.d.Y1();
        aVar.a = Y1;
        if (Y1 == -1) {
            aVar.a();
            return;
        }
        View Q = this.d.Q(Y1);
        if (Q == null) {
            aVar.a();
            return;
        }
        int l0 = this.d.l0(Q);
        int q0 = this.d.q0(Q);
        int t0 = this.d.t0(Q);
        int U = this.d.U(Q);
        ViewGroup.LayoutParams layoutParams = Q.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            l0 += marginLayoutParams.leftMargin;
            q0 += marginLayoutParams.rightMargin;
            t0 += marginLayoutParams.topMargin;
            U += marginLayoutParams.bottomMargin;
        }
        int height = Q.getHeight() + t0 + U;
        int width = Q.getWidth() + l0 + q0;
        if (this.d.j2() == 0) {
            i2 = (Q.getLeft() - l0) - this.c.getPaddingLeft();
            if (this.b.c()) {
                i2 = -i2;
            }
            height = width;
        } else {
            i2 = (Q.getTop() - t0) - this.c.getPaddingTop();
        }
        int i3 = -i2;
        aVar.c = i3;
        if (i3 >= 0) {
            aVar.b = height == 0 ? 0.0f : ((float) i3) / ((float) height);
        } else if (new b(this.d).b()) {
            throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
        } else {
            throw new IllegalStateException(String.format(Locale.US, "Page can only be offset by a positive amount, not by %d", Integer.valueOf(aVar.c)));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void a(RecyclerView recyclerView, int i2) {
        ViewPager2.g gVar;
        int i3 = this.e;
        boolean z = true;
        if (!(i3 == 1 && this.f == 1) && i2 == 1) {
            this.m = false;
            this.e = 1;
            int i4 = this.i;
            if (i4 != -1) {
                this.h = i4;
                this.i = -1;
            } else if (this.h == -1) {
                this.h = this.d.Y1();
            }
            f(1);
            return;
        }
        if (!(i3 == 1 || i3 == 4) || i2 != 2) {
            if ((i3 == 1 || i3 == 4) && i2 == 0) {
                p();
                if (!this.k) {
                    int i5 = this.g.a;
                    if (!(i5 == -1 || (gVar = this.a) == null)) {
                        gVar.b(i5, 0.0f, 0);
                    }
                } else {
                    a aVar = this.g;
                    if (aVar.c == 0) {
                        int i6 = this.h;
                        int i7 = aVar.a;
                        if (i6 != i7) {
                            e(i7);
                        }
                    } else {
                        z = false;
                    }
                }
                if (z) {
                    f(0);
                    n();
                }
            }
            if (this.e == 2 && i2 == 0 && this.l) {
                p();
                a aVar2 = this.g;
                if (aVar2.c == 0) {
                    int i8 = this.i;
                    int i9 = aVar2.a;
                    if (i8 != i9) {
                        if (i9 == -1) {
                            i9 = 0;
                        }
                        e(i9);
                    }
                    f(0);
                    n();
                }
            }
        } else if (this.k) {
            f(2);
            this.j = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        if ((r6 < 0) == r4.b.c()) goto L_0x0022;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0039  */
    @Override // androidx.recyclerview.widget.RecyclerView.q
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(androidx.recyclerview.widget.RecyclerView r5, int r6, int r7) {
        /*
            r4 = this;
            r5 = 1
            r4.k = r5
            r4.p()
            boolean r0 = r4.j
            r1 = 0
            r2 = -1
            if (r0 == 0) goto L_0x003d
            r4.j = r1
            if (r7 > 0) goto L_0x0022
            if (r7 != 0) goto L_0x0020
            if (r6 >= 0) goto L_0x0016
            r6 = 1
            goto L_0x0017
        L_0x0016:
            r6 = 0
        L_0x0017:
            androidx.viewpager2.widget.ViewPager2 r7 = r4.b
            boolean r7 = r7.c()
            if (r6 != r7) goto L_0x0020
            goto L_0x0022
        L_0x0020:
            r6 = 0
            goto L_0x0023
        L_0x0022:
            r6 = 1
        L_0x0023:
            if (r6 == 0) goto L_0x002f
            androidx.viewpager2.widget.g$a r6 = r4.g
            int r7 = r6.c
            if (r7 == 0) goto L_0x002f
            int r6 = r6.a
            int r6 = r6 + r5
            goto L_0x0033
        L_0x002f:
            androidx.viewpager2.widget.g$a r6 = r4.g
            int r6 = r6.a
        L_0x0033:
            r4.i = r6
            int r7 = r4.h
            if (r7 == r6) goto L_0x004b
            r4.e(r6)
            goto L_0x004b
        L_0x003d:
            int r6 = r4.e
            if (r6 != 0) goto L_0x004b
            androidx.viewpager2.widget.g$a r6 = r4.g
            int r6 = r6.a
            if (r6 != r2) goto L_0x0048
            r6 = 0
        L_0x0048:
            r4.e(r6)
        L_0x004b:
            androidx.viewpager2.widget.g$a r6 = r4.g
            int r7 = r6.a
            if (r7 != r2) goto L_0x0052
            r7 = 0
        L_0x0052:
            float r0 = r6.b
            int r6 = r6.c
            androidx.viewpager2.widget.ViewPager2$g r3 = r4.a
            if (r3 == 0) goto L_0x005d
            r3.b(r7, r0, r6)
        L_0x005d:
            androidx.viewpager2.widget.g$a r6 = r4.g
            int r7 = r6.a
            int r0 = r4.i
            if (r7 == r0) goto L_0x0067
            if (r0 != r2) goto L_0x0075
        L_0x0067:
            int r6 = r6.c
            if (r6 != 0) goto L_0x0075
            int r6 = r4.f
            if (r6 == r5) goto L_0x0075
            r4.f(r1)
            r4.n()
        L_0x0075:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager2.widget.g.c(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }

    /* access modifiers changed from: package-private */
    public double g() {
        p();
        a aVar = this.g;
        double d2 = (double) aVar.a;
        double d3 = (double) aVar.b;
        Double.isNaN(d2);
        Double.isNaN(d3);
        return d2 + d3;
    }

    /* access modifiers changed from: package-private */
    public int h() {
        return this.f;
    }

    /* access modifiers changed from: package-private */
    public boolean i() {
        return this.m;
    }

    /* access modifiers changed from: package-private */
    public boolean j() {
        return this.f == 0;
    }

    /* access modifiers changed from: package-private */
    public void k() {
        this.l = true;
    }

    /* access modifiers changed from: package-private */
    public void m(int i2, boolean z) {
        this.e = z ? 2 : 3;
        boolean z2 = false;
        this.m = false;
        if (this.i != i2) {
            z2 = true;
        }
        this.i = i2;
        f(2);
        if (z2) {
            e(i2);
        }
    }

    /* access modifiers changed from: package-private */
    public void o(ViewPager2.g gVar) {
        this.a = gVar;
    }
}
