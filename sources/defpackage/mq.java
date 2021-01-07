package defpackage;

import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.t;
import com.google.android.exoplayer2.util.f0;
import com.google.android.exoplayer2.util.v;
import java.nio.ByteBuffer;

/* renamed from: mq  reason: default package */
public class mq extends t {
    private final fj u = new fj(1);
    private final v v = new v();
    private long w;
    private lq x;
    private long y;

    public mq() {
        super(5);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.t
    public void E() {
        this.y = 0;
        lq lqVar = this.x;
        if (lqVar != null) {
            lqVar.b();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.t
    public void G(long j, boolean z) {
        this.y = 0;
        lq lqVar = this.x;
        if (lqVar != null) {
            lqVar.b();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.t
    public void K(d0[] d0VarArr, long j) {
        this.w = j;
    }

    @Override // com.google.android.exoplayer2.p0
    public boolean b() {
        return i();
    }

    @Override // com.google.android.exoplayer2.p0
    public boolean d() {
        return true;
    }

    @Override // com.google.android.exoplayer2.q0
    public int e(d0 d0Var) {
        return "application/x-camera-motion".equals(d0Var.r) ? 4 : 0;
    }

    @Override // com.google.android.exoplayer2.t, com.google.android.exoplayer2.n0.b
    public void l(int i, Object obj) {
        if (i == 7) {
            this.x = (lq) obj;
        }
    }

    @Override // com.google.android.exoplayer2.p0
    public void s(long j, long j2) {
        float[] fArr;
        while (!i() && this.y < 100000 + j) {
            this.u.clear();
            if (L(z(), this.u, false) == -4 && !this.u.isEndOfStream()) {
                this.u.m();
                fj fjVar = this.u;
                this.y = fjVar.c;
                if (this.x != null) {
                    ByteBuffer byteBuffer = fjVar.b;
                    int i = f0.a;
                    if (byteBuffer.remaining() != 16) {
                        fArr = null;
                    } else {
                        this.v.I(byteBuffer.array(), byteBuffer.limit());
                        this.v.K(byteBuffer.arrayOffset() + 4);
                        float[] fArr2 = new float[3];
                        for (int i2 = 0; i2 < 3; i2++) {
                            fArr2[i2] = Float.intBitsToFloat(this.v.k());
                        }
                        fArr = fArr2;
                    }
                    if (fArr != null) {
                        this.x.a(this.y - this.w, fArr);
                    }
                }
            } else {
                return;
            }
        }
    }
}
