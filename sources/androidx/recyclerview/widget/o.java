package androidx.recyclerview.widget;

import androidx.core.os.h;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* access modifiers changed from: package-private */
public final class o implements Runnable {
    static final ThreadLocal<o> n = new ThreadLocal<>();
    static Comparator<c> o = new a();
    ArrayList<RecyclerView> a = new ArrayList<>();
    long b;
    long c;
    private ArrayList<c> f = new ArrayList<>();

    static class a implements Comparator<c> {
        a() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
            if (r0 == null) goto L_0x0023;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
            if (r0 != false) goto L_0x0022;
         */
        @Override // java.util.Comparator
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int compare(androidx.recyclerview.widget.o.c r7, androidx.recyclerview.widget.o.c r8) {
            /*
                r6 = this;
                androidx.recyclerview.widget.o$c r7 = (androidx.recyclerview.widget.o.c) r7
                androidx.recyclerview.widget.o$c r8 = (androidx.recyclerview.widget.o.c) r8
                androidx.recyclerview.widget.RecyclerView r0 = r7.d
                r1 = 1
                r2 = 0
                if (r0 != 0) goto L_0x000c
                r3 = 1
                goto L_0x000d
            L_0x000c:
                r3 = 0
            L_0x000d:
                androidx.recyclerview.widget.RecyclerView r4 = r8.d
                if (r4 != 0) goto L_0x0013
                r4 = 1
                goto L_0x0014
            L_0x0013:
                r4 = 0
            L_0x0014:
                r5 = -1
                if (r3 == r4) goto L_0x001a
                if (r0 != 0) goto L_0x0022
                goto L_0x0023
            L_0x001a:
                boolean r0 = r7.a
                boolean r3 = r8.a
                if (r0 == r3) goto L_0x0025
                if (r0 == 0) goto L_0x0023
            L_0x0022:
                r1 = -1
            L_0x0023:
                r2 = r1
                goto L_0x0036
            L_0x0025:
                int r0 = r8.b
                int r1 = r7.b
                int r0 = r0 - r1
                if (r0 == 0) goto L_0x002e
                r2 = r0
                goto L_0x0036
            L_0x002e:
                int r7 = r7.c
                int r8 = r8.c
                int r7 = r7 - r8
                if (r7 == 0) goto L_0x0036
                r2 = r7
            L_0x0036:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.o.a.compare(java.lang.Object, java.lang.Object):int");
        }
    }

    /* access modifiers changed from: package-private */
    public static class b implements RecyclerView.m.c {
        int a;
        int b;
        int[] c;
        int d;

        b() {
        }

        public void a(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            } else if (i2 >= 0) {
                int i3 = this.d * 2;
                int[] iArr = this.c;
                if (iArr == null) {
                    int[] iArr2 = new int[4];
                    this.c = iArr2;
                    Arrays.fill(iArr2, -1);
                } else if (i3 >= iArr.length) {
                    int[] iArr3 = new int[(i3 * 2)];
                    this.c = iArr3;
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                }
                int[] iArr4 = this.c;
                iArr4[i3] = i;
                iArr4[i3 + 1] = i2;
                this.d++;
            } else {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
        }

        /* access modifiers changed from: package-private */
        public void b(RecyclerView recyclerView, boolean z) {
            this.d = 0;
            int[] iArr = this.c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.m mVar = recyclerView.v;
            if (recyclerView.u != null && mVar != null && mVar.z0()) {
                if (z) {
                    if (!recyclerView.f.h()) {
                        mVar.G(recyclerView.u.u(), this);
                    }
                } else if (!recyclerView.g0()) {
                    mVar.F(this.a, this.b, recyclerView.q0, this);
                }
                int i = this.d;
                if (i > mVar.v) {
                    mVar.v = i;
                    mVar.w = z;
                    recyclerView.b.r();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public boolean c(int i) {
            if (this.c != null) {
                int i2 = this.d * 2;
                for (int i3 = 0; i3 < i2; i3 += 2) {
                    if (this.c[i3] == i) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public static class c {
        public boolean a;
        public int b;
        public int c;
        public RecyclerView d;
        public int e;

        c() {
        }
    }

    o() {
    }

    private RecyclerView.b0 c(RecyclerView recyclerView, int i, long j) {
        boolean z;
        int h = recyclerView.n.h();
        int i2 = 0;
        while (true) {
            if (i2 >= h) {
                z = false;
                break;
            }
            RecyclerView.b0 b0 = RecyclerView.b0(recyclerView.n.g(i2));
            if (b0.c == i && !b0.J()) {
                z = true;
                break;
            }
            i2++;
        }
        if (z) {
            return null;
        }
        RecyclerView.s sVar = recyclerView.b;
        try {
            recyclerView.q0();
            RecyclerView.b0 p = sVar.p(i, false, j);
            if (p != null) {
                if (!p.G() || p.J()) {
                    sVar.a(p, false);
                } else {
                    sVar.k(p.a);
                }
            }
            return p;
        } finally {
            recyclerView.r0(false);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.b == 0) {
            this.b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        b bVar = recyclerView.p0;
        bVar.a = i;
        bVar.b = i2;
    }

    /* access modifiers changed from: package-private */
    public void b(long j) {
        c cVar;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        c cVar2;
        int size = this.a.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView3 = this.a.get(i2);
            if (recyclerView3.getWindowVisibility() == 0) {
                recyclerView3.p0.b(recyclerView3, false);
                i += recyclerView3.p0.d;
            }
        }
        this.f.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView4 = this.a.get(i4);
            if (recyclerView4.getWindowVisibility() == 0) {
                b bVar = recyclerView4.p0;
                int abs = Math.abs(bVar.b) + Math.abs(bVar.a);
                for (int i5 = 0; i5 < bVar.d * 2; i5 += 2) {
                    if (i3 >= this.f.size()) {
                        cVar2 = new c();
                        this.f.add(cVar2);
                    } else {
                        cVar2 = this.f.get(i3);
                    }
                    int[] iArr = bVar.c;
                    int i6 = iArr[i5 + 1];
                    cVar2.a = i6 <= abs;
                    cVar2.b = abs;
                    cVar2.c = i6;
                    cVar2.d = recyclerView4;
                    cVar2.e = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(this.f, o);
        int i7 = 0;
        while (i7 < this.f.size() && (recyclerView = (cVar = this.f.get(i7)).d) != null) {
            RecyclerView.b0 c2 = c(recyclerView, cVar.e, cVar.a ? Long.MAX_VALUE : j);
            if (!(c2 == null || c2.b == null || !c2.G() || c2.J() || (recyclerView2 = c2.b.get()) == null)) {
                if (recyclerView2.M && recyclerView2.n.h() != 0) {
                    recyclerView2.z0();
                }
                b bVar2 = recyclerView2.p0;
                bVar2.b(recyclerView2, true);
                if (bVar2.d != 0) {
                    try {
                        h.a("RV Nested Prefetch");
                        RecyclerView.y yVar = recyclerView2.q0;
                        RecyclerView.e eVar = recyclerView2.u;
                        yVar.d = 1;
                        yVar.e = eVar.u();
                        yVar.g = false;
                        yVar.h = false;
                        yVar.i = false;
                        for (int i8 = 0; i8 < bVar2.d * 2; i8 += 2) {
                            c(recyclerView2, bVar2.c[i8], j);
                        }
                    } finally {
                        h.b();
                    }
                }
            }
            cVar.a = false;
            cVar.b = 0;
            cVar.c = 0;
            cVar.d = null;
            cVar.e = 0;
            i7++;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            h.a("RV Prefetch");
            if (!this.a.isEmpty()) {
                int size = this.a.size();
                long j = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView = this.a.get(i);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j = Math.max(recyclerView.getDrawingTime(), j);
                    }
                }
                if (j != 0) {
                    b(TimeUnit.MILLISECONDS.toNanos(j) + this.c);
                    this.b = 0;
                    h.b();
                }
            }
        } finally {
            this.b = 0;
            h.b();
        }
    }
}
