package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.util.e0;
import com.google.android.exoplayer2.util.g;
import com.google.android.exoplayer2.util.u;
import com.google.android.exoplayer2.util.v;
import defpackage.om;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: nm  reason: default package */
public final class nm implements qj {
    private final int a;
    private final List<e0> b;
    private final v c;
    private final SparseIntArray d;
    private final om.c e;
    private final SparseArray<om> f;
    private final SparseBooleanArray g;
    private final SparseBooleanArray h;
    private final mm i;
    private lm j;
    private rj k;
    private int l;
    private boolean m;
    private boolean n;
    private boolean o;
    private om p;
    private int q;
    private int r;

    /* renamed from: nm$a */
    private class a implements hm {
        private final u a = new u(new byte[4]);

        public a() {
        }

        @Override // defpackage.hm
        public void a(e0 e0Var, rj rjVar, om.d dVar) {
        }

        @Override // defpackage.hm
        public void b(v vVar) {
            if (vVar.x() == 0) {
                vVar.L(7);
                int a2 = vVar.a() / 4;
                for (int i = 0; i < a2; i++) {
                    vVar.f(this.a, 4);
                    int h = this.a.h(16);
                    this.a.o(3);
                    if (h == 0) {
                        this.a.o(13);
                    } else {
                        int h2 = this.a.h(13);
                        nm.this.f.put(h2, new im(new b(h2)));
                        nm.k(nm.this);
                    }
                }
                if (nm.this.a != 2) {
                    nm.this.f.remove(0);
                }
            }
        }
    }

    /* renamed from: nm$b */
    private class b implements hm {
        private final u a = new u(new byte[5]);
        private final SparseArray<om> b = new SparseArray<>();
        private final SparseIntArray c = new SparseIntArray();
        private final int d;

        public b(int i) {
            this.d = i;
        }

        @Override // defpackage.hm
        public void a(e0 e0Var, rj rjVar, om.d dVar) {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:42:0x015f, code lost:
            if (r26.x() == r14) goto L_0x0161;
         */
        @Override // defpackage.hm
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void b(com.google.android.exoplayer2.util.v r26) {
            /*
            // Method dump skipped, instructions count: 782
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.nm.b.b(com.google.android.exoplayer2.util.v):void");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: android.util.SparseArray<om> */
    /* JADX WARN: Multi-variable type inference failed */
    public nm(int i2, e0 e0Var, om.c cVar) {
        this.e = cVar;
        this.a = i2;
        if (i2 == 1 || i2 == 2) {
            this.b = Collections.singletonList(e0Var);
        } else {
            ArrayList arrayList = new ArrayList();
            this.b = arrayList;
            arrayList.add(e0Var);
        }
        this.c = new v(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.g = sparseBooleanArray;
        this.h = new SparseBooleanArray();
        SparseArray<om> sparseArray = new SparseArray<>();
        this.f = sparseArray;
        this.d = new SparseIntArray();
        this.i = new mm();
        this.r = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.f.put(sparseArray2.keyAt(i3), sparseArray2.valueAt(i3));
        }
        this.f.put(0, new im(new a()));
        this.p = null;
    }

    static /* synthetic */ int k(nm nmVar) {
        int i2 = nmVar.l;
        nmVar.l = i2 + 1;
        return i2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v8, resolved type: android.util.SparseBooleanArray */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r3v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARNING: Unknown variable types count: 2 */
    @Override // defpackage.qj
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int a(defpackage.nj r20, defpackage.wj r21) {
        /*
        // Method dump skipped, instructions count: 519
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nm.a(nj, wj):int");
    }

    @Override // defpackage.qj
    public void b(rj rjVar) {
        this.k = rjVar;
    }

    @Override // defpackage.qj
    public void c(long j2, long j3) {
        lm lmVar;
        g.m(this.a != 2);
        int size = this.b.size();
        for (int i2 = 0; i2 < size; i2++) {
            e0 e0Var = this.b.get(i2);
            if ((e0Var.e() == -9223372036854775807L) || !(e0Var.e() == 0 || e0Var.c() == j3)) {
                e0Var.f();
                e0Var.g(j3);
            }
        }
        if (!(j3 == 0 || (lmVar = this.j) == null)) {
            lmVar.f(j3);
        }
        this.c.F();
        this.d.clear();
        for (int i3 = 0; i3 < this.f.size(); i3++) {
            this.f.valueAt(i3).c();
        }
        this.q = 0;
    }

    @Override // defpackage.qj
    public void d() {
    }

    @Override // defpackage.qj
    public boolean f(nj njVar) {
        boolean z;
        byte[] bArr = this.c.a;
        njVar.f(bArr, 0, 940, false);
        for (int i2 = 0; i2 < 188; i2++) {
            int i3 = 0;
            while (true) {
                if (i3 >= 5) {
                    z = true;
                    break;
                } else if (bArr[(i3 * 188) + i2] != 71) {
                    z = false;
                    break;
                } else {
                    i3++;
                }
            }
            if (z) {
                njVar.l(i2);
                return true;
            }
        }
        return false;
    }
}
