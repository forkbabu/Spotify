package defpackage;

import android.util.SparseArray;
import com.google.android.exoplayer2.util.t;
import com.google.android.exoplayer2.util.v;
import com.google.android.exoplayer2.util.w;
import defpackage.om;

/* renamed from: xl  reason: default package */
public final class xl implements vl {
    private final jm a;
    private final boolean b;
    private final boolean c;
    private final cm d = new cm(7, 128);
    private final cm e = new cm(8, 128);
    private final cm f = new cm(6, 128);
    private long g;
    private final boolean[] h = new boolean[3];
    private String i;
    private zj j;
    private b k;
    private boolean l;
    private long m;
    private boolean n;
    private final v o = new v();

    /* access modifiers changed from: private */
    /* renamed from: xl$b */
    public static final class b {
        private final zj a;
        private final boolean b;
        private final boolean c;
        private final SparseArray<t.b> d = new SparseArray<>();
        private final SparseArray<t.a> e = new SparseArray<>();
        private final w f;
        private byte[] g;
        private int h;
        private int i;
        private long j;
        private boolean k;
        private long l;
        private a m = new a(null);
        private a n = new a(null);
        private boolean o;
        private long p;
        private long q;
        private boolean r;

        /* access modifiers changed from: private */
        /* renamed from: xl$b$a */
        public static final class a {
            private boolean a;
            private boolean b;
            private t.b c;
            private int d;
            private int e;
            private int f;
            private int g;
            private boolean h;
            private boolean i;
            private boolean j;
            private boolean k;
            private int l;
            private int m;
            private int n;
            private int o;
            private int p;

            a(a aVar) {
            }

            static boolean a(a aVar, a aVar2) {
                boolean z;
                boolean z2;
                if (aVar.a) {
                    if (!aVar2.a || aVar.f != aVar2.f || aVar.g != aVar2.g || aVar.h != aVar2.h) {
                        return true;
                    }
                    if (aVar.i && aVar2.i && aVar.j != aVar2.j) {
                        return true;
                    }
                    int i2 = aVar.d;
                    int i3 = aVar2.d;
                    if (i2 != i3 && (i2 == 0 || i3 == 0)) {
                        return true;
                    }
                    int i4 = aVar.c.k;
                    if (i4 == 0 && aVar2.c.k == 0 && (aVar.m != aVar2.m || aVar.n != aVar2.n)) {
                        return true;
                    }
                    if ((i4 == 1 && aVar2.c.k == 1 && (aVar.o != aVar2.o || aVar.p != aVar2.p)) || (z = aVar.k) != (z2 = aVar2.k)) {
                        return true;
                    }
                    if (z && z2 && aVar.l != aVar2.l) {
                        return true;
                    }
                }
                return false;
            }

            public void b() {
                this.b = false;
                this.a = false;
            }

            public boolean c() {
                int i2;
                return this.b && ((i2 = this.e) == 7 || i2 == 2);
            }

            public void d(t.b bVar, int i2, int i3, int i4, int i5, boolean z, boolean z2, boolean z3, boolean z4, int i6, int i7, int i8, int i9, int i10) {
                this.c = bVar;
                this.d = i2;
                this.e = i3;
                this.f = i4;
                this.g = i5;
                this.h = z;
                this.i = z2;
                this.j = z3;
                this.k = z4;
                this.l = i6;
                this.m = i7;
                this.n = i8;
                this.o = i9;
                this.p = i10;
                this.a = true;
                this.b = true;
            }

            public void e(int i2) {
                this.e = i2;
                this.b = true;
            }
        }

        public b(zj zjVar, boolean z, boolean z2) {
            this.a = zjVar;
            this.b = z;
            this.c = z2;
            byte[] bArr = new byte[128];
            this.g = bArr;
            this.f = new w(bArr, 0, 0);
            this.k = false;
            this.o = false;
            this.n.b();
        }

        /* JADX WARNING: Removed duplicated region for block: B:51:0x00ff  */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x0102  */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x0106  */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x0118  */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x011e  */
        /* JADX WARNING: Removed duplicated region for block: B:72:0x014e  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a(byte[] r24, int r25, int r26) {
            /*
            // Method dump skipped, instructions count: 408
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.xl.b.a(byte[], int, int):void");
        }

        public boolean b(long j2, int i2, boolean z, boolean z2) {
            boolean z3 = false;
            if (this.i == 9 || (this.c && a.a(this.n, this.m))) {
                if (z && this.o) {
                    long j3 = this.j;
                    boolean z4 = this.r;
                    this.a.d(this.q, z4 ? 1 : 0, (int) (j3 - this.p), i2 + ((int) (j2 - j3)), null);
                }
                this.p = this.j;
                this.q = this.l;
                this.r = false;
                this.o = true;
            }
            boolean c2 = this.b ? this.n.c() : z2;
            boolean z5 = this.r;
            int i3 = this.i;
            if (i3 == 5 || (c2 && i3 == 1)) {
                z3 = true;
            }
            boolean z6 = z5 | z3;
            this.r = z6;
            return z6;
        }

        public boolean c() {
            return this.c;
        }

        public void d(t.a aVar) {
            this.e.append(aVar.a, aVar);
        }

        public void e(t.b bVar) {
            this.d.append(bVar.d, bVar);
        }

        public void f() {
            this.k = false;
            this.o = false;
            this.n.b();
        }

        public void g(long j2, int i2, long j3) {
            this.i = i2;
            this.l = j3;
            this.j = j2;
            if (!this.b || i2 != 1) {
                if (!this.c) {
                    return;
                }
                if (!(i2 == 5 || i2 == 1 || i2 == 2)) {
                    return;
                }
            }
            a aVar = this.m;
            this.m = this.n;
            this.n = aVar;
            aVar.b();
            this.h = 0;
            this.k = true;
        }
    }

    public xl(jm jmVar, boolean z, boolean z2) {
        this.a = jmVar;
        this.b = z;
        this.c = z2;
    }

    private void a(byte[] bArr, int i2, int i3) {
        if (!this.l || this.k.c()) {
            this.d.a(bArr, i2, i3);
            this.e.a(bArr, i2, i3);
        }
        this.f.a(bArr, i2, i3);
        this.k.a(bArr, i2, i3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x019b  */
    @Override // defpackage.vl
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(com.google.android.exoplayer2.util.v r32) {
        /*
        // Method dump skipped, instructions count: 464
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xl.b(com.google.android.exoplayer2.util.v):void");
    }

    @Override // defpackage.vl
    public void c() {
        t.a(this.h);
        this.d.d();
        this.e.d();
        this.f.d();
        this.k.f();
        this.g = 0;
        this.n = false;
    }

    @Override // defpackage.vl
    public void d(rj rjVar, om.d dVar) {
        dVar.a();
        this.i = dVar.b();
        zj s = rjVar.s(dVar.c(), 2);
        this.j = s;
        this.k = new b(s, this.b, this.c);
        this.a.b(rjVar, dVar);
    }

    @Override // defpackage.vl
    public void e() {
    }

    @Override // defpackage.vl
    public void f(long j2, int i2) {
        this.m = j2;
        this.n |= (i2 & 2) != 0;
    }
}
