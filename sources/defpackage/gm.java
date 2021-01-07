package defpackage;

import android.util.SparseArray;
import com.google.android.exoplayer2.util.e0;
import com.google.android.exoplayer2.util.u;
import com.google.android.exoplayer2.util.v;

/* renamed from: gm  reason: default package */
public final class gm implements qj {
    private final e0 a = new e0(0);
    private final SparseArray<a> b = new SparseArray<>();
    private final v c = new v(4096);
    private final fm d = new fm();
    private boolean e;
    private boolean f;
    private boolean g;
    private long h;
    private em i;
    private rj j;
    private boolean k;

    /* renamed from: gm$a */
    private static final class a {
        private final vl a;
        private final e0 b;
        private final u c = new u(new byte[64]);
        private boolean d;
        private boolean e;
        private boolean f;
        private int g;
        private long h;

        public a(vl vlVar, e0 e0Var) {
            this.a = vlVar;
            this.b = e0Var;
        }

        public void a(v vVar) {
            vVar.g(this.c.a, 0, 3);
            this.c.m(0);
            this.c.o(8);
            this.d = this.c.g();
            this.e = this.c.g();
            this.c.o(6);
            int h2 = this.c.h(8);
            this.g = h2;
            vVar.g(this.c.a, 0, h2);
            this.c.m(0);
            this.h = 0;
            if (this.d) {
                this.c.o(4);
                this.c.o(1);
                this.c.o(1);
                long h3 = (((long) this.c.h(3)) << 30) | ((long) (this.c.h(15) << 15)) | ((long) this.c.h(15));
                this.c.o(1);
                if (!this.f && this.e) {
                    this.c.o(4);
                    this.c.o(1);
                    this.c.o(1);
                    this.c.o(1);
                    this.b.b((((long) this.c.h(3)) << 30) | ((long) (this.c.h(15) << 15)) | ((long) this.c.h(15)));
                    this.f = true;
                }
                this.h = this.b.b(h3);
            }
            this.a.f(this.h, 4);
            this.a.b(vVar);
            this.a.e();
        }

        public void b() {
            this.f = false;
            this.a.c();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:62:0x0144  */
    @Override // defpackage.qj
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int a(defpackage.nj r14, defpackage.wj r15) {
        /*
        // Method dump skipped, instructions count: 438
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gm.a(nj, wj):int");
    }

    @Override // defpackage.qj
    public void b(rj rjVar) {
        this.j = rjVar;
    }

    @Override // defpackage.qj
    public void c(long j2, long j3) {
        if ((this.a.e() == -9223372036854775807L) || !(this.a.c() == 0 || this.a.c() == j3)) {
            this.a.f();
            this.a.g(j3);
        }
        em emVar = this.i;
        if (emVar != null) {
            emVar.f(j3);
        }
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            this.b.valueAt(i2).b();
        }
    }

    @Override // defpackage.qj
    public void d() {
    }

    @Override // defpackage.qj
    public boolean f(nj njVar) {
        byte[] bArr = new byte[14];
        njVar.f(bArr, 0, 14, false);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        njVar.a(bArr[13] & 7, false);
        njVar.f(bArr, 0, 3, false);
        if (1 == (((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255))) {
            return true;
        }
        return false;
    }
}
