package defpackage;

import com.google.android.exoplayer2.util.t;
import com.google.android.exoplayer2.util.v;
import defpackage.om;

/* renamed from: yl  reason: default package */
public final class yl implements vl {
    private final jm a;
    private String b;
    private zj c;
    private a d;
    private boolean e;
    private final boolean[] f = new boolean[3];
    private final cm g = new cm(32, 128);
    private final cm h = new cm(33, 128);
    private final cm i = new cm(34, 128);
    private final cm j = new cm(39, 128);
    private final cm k = new cm(40, 128);
    private long l;
    private long m;
    private final v n = new v();

    /* access modifiers changed from: private */
    /* renamed from: yl$a */
    public static final class a {
        private final zj a;
        private long b;
        private boolean c;
        private int d;
        private long e;
        private boolean f;
        private boolean g;
        private boolean h;
        private boolean i;
        private boolean j;
        private long k;
        private long l;
        private boolean m;

        public a(zj zjVar) {
            this.a = zjVar;
        }

        private void b(int i2) {
            boolean z = this.m;
            this.a.d(this.l, z ? 1 : 0, (int) (this.b - this.k), i2, null);
        }

        public void a(long j2, int i2) {
            if (this.j && this.g) {
                this.m = this.c;
                this.j = false;
            } else if (this.h || this.g) {
                if (this.i) {
                    b(i2 + ((int) (j2 - this.b)));
                }
                this.k = this.b;
                this.l = this.e;
                this.i = true;
                this.m = this.c;
            }
        }

        public void c(byte[] bArr, int i2, int i3) {
            if (this.f) {
                int i4 = this.d;
                int i5 = (i2 + 2) - i4;
                if (i5 < i3) {
                    this.g = (bArr[i5] & 128) != 0;
                    this.f = false;
                    return;
                }
                this.d = (i3 - i2) + i4;
            }
        }

        public void d() {
            this.f = false;
            this.g = false;
            this.h = false;
            this.i = false;
            this.j = false;
        }

        public void e(long j2, int i2, int i3, long j3) {
            boolean z = false;
            this.g = false;
            this.h = false;
            this.e = j3;
            this.d = 0;
            this.b = j2;
            if (i3 >= 32) {
                if (!this.j && this.i) {
                    b(i2);
                    this.i = false;
                }
                if (i3 <= 34) {
                    this.h = !this.j;
                    this.j = true;
                }
            }
            boolean z2 = i3 >= 16 && i3 <= 21;
            this.c = z2;
            if (z2 || i3 <= 9) {
                z = true;
            }
            this.f = z;
        }
    }

    public yl(jm jmVar) {
        this.a = jmVar;
    }

    private void a(byte[] bArr, int i2, int i3) {
        if (this.e) {
            this.d.c(bArr, i2, i3);
        } else {
            this.g.a(bArr, i2, i3);
            this.h.a(bArr, i2, i3);
            this.i.a(bArr, i2, i3);
        }
        this.j.a(bArr, i2, i3);
        this.k.a(bArr, i2, i3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:129:0x02b7  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x02de  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0303  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x030f  */
    @Override // defpackage.vl
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(com.google.android.exoplayer2.util.v r33) {
        /*
        // Method dump skipped, instructions count: 821
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yl.b(com.google.android.exoplayer2.util.v):void");
    }

    @Override // defpackage.vl
    public void c() {
        t.a(this.f);
        this.g.d();
        this.h.d();
        this.i.d();
        this.j.d();
        this.k.d();
        this.d.d();
        this.l = 0;
    }

    @Override // defpackage.vl
    public void d(rj rjVar, om.d dVar) {
        dVar.a();
        this.b = dVar.b();
        zj s = rjVar.s(dVar.c(), 2);
        this.c = s;
        this.d = new a(s);
        this.a.b(rjVar, dVar);
    }

    @Override // defpackage.vl
    public void e() {
    }

    @Override // defpackage.vl
    public void f(long j2, int i2) {
        this.m = j2;
    }
}
