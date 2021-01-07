package defpackage;

import com.google.android.exoplayer2.util.t;
import com.google.android.exoplayer2.util.v;
import defpackage.om;
import java.util.Arrays;

/* renamed from: wl  reason: default package */
public final class wl implements vl {
    private static final double[] q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    private String a;
    private zj b;
    private boolean c;
    private long d;
    private final qm e;
    private final v f;
    private final boolean[] g = new boolean[4];
    private final a h = new a(128);
    private final cm i;
    private long j;
    private boolean k;
    private long l;
    private long m;
    private long n;
    private boolean o;
    private boolean p;

    /* renamed from: wl$a */
    private static final class a {
        private static final byte[] e = {0, 0, 1};
        private boolean a;
        public int b;
        public int c;
        public byte[] d;

        public a(int i) {
            this.d = new byte[i];
        }

        public void a(byte[] bArr, int i, int i2) {
            if (this.a) {
                int i3 = i2 - i;
                byte[] bArr2 = this.d;
                int length = bArr2.length;
                int i4 = this.b;
                if (length < i4 + i3) {
                    this.d = Arrays.copyOf(bArr2, (i4 + i3) * 2);
                }
                System.arraycopy(bArr, i, this.d, this.b, i3);
                this.b += i3;
            }
        }

        public boolean b(int i, int i2) {
            if (this.a) {
                int i3 = this.b - i2;
                this.b = i3;
                if (this.c == 0 && i == 181) {
                    this.c = i3;
                } else {
                    this.a = false;
                    return true;
                }
            } else if (i == 179) {
                this.a = true;
            }
            byte[] bArr = e;
            a(bArr, 0, bArr.length);
            return false;
        }

        public void c() {
            this.a = false;
            this.b = 0;
            this.c = 0;
        }
    }

    wl(qm qmVar) {
        this.e = qmVar;
        if (qmVar != null) {
            this.i = new cm(178, 128);
            this.f = new v();
            return;
        }
        this.i = null;
        this.f = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00cc  */
    @Override // defpackage.vl
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(com.google.android.exoplayer2.util.v r28) {
        /*
        // Method dump skipped, instructions count: 466
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wl.b(com.google.android.exoplayer2.util.v):void");
    }

    @Override // defpackage.vl
    public void c() {
        t.a(this.g);
        this.h.c();
        if (this.e != null) {
            this.i.d();
        }
        this.j = 0;
        this.k = false;
    }

    @Override // defpackage.vl
    public void d(rj rjVar, om.d dVar) {
        dVar.a();
        this.a = dVar.b();
        this.b = rjVar.s(dVar.c(), 2);
        qm qmVar = this.e;
        if (qmVar != null) {
            qmVar.b(rjVar, dVar);
        }
    }

    @Override // defpackage.vl
    public void e() {
    }

    @Override // defpackage.vl
    public void f(long j2, int i2) {
        this.l = j2;
    }
}
