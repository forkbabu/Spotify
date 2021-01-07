package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.e0;
import com.google.android.exoplayer2.t;
import com.google.android.exoplayer2.util.f0;
import defpackage.um;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: an  reason: default package */
public final class an extends t implements Handler.Callback {
    private int A;
    private int B;
    private wm C;
    private boolean D;
    private long E;
    private final xm u;
    private final zm v;
    private final Handler w;
    private final ym x;
    private final um[] y;
    private final long[] z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public an(zm zmVar, Looper looper) {
        super(4);
        Handler handler;
        xm xmVar = xm.a;
        zmVar.getClass();
        this.v = zmVar;
        if (looper == null) {
            handler = null;
        } else {
            int i = f0.a;
            handler = new Handler(looper, this);
        }
        this.w = handler;
        this.u = xmVar;
        this.x = new ym();
        this.y = new um[5];
        this.z = new long[5];
    }

    private void O(um umVar, List<um.b> list) {
        for (int i = 0; i < umVar.e(); i++) {
            d0 O = umVar.c(i).O();
            if (O == null || !this.u.e(O)) {
                list.add(umVar.c(i));
            } else {
                wm a = this.u.a(O);
                byte[] f2 = umVar.c(i).f2();
                f2.getClass();
                this.x.clear();
                this.x.l(f2.length);
                ByteBuffer byteBuffer = this.x.b;
                int i2 = f0.a;
                byteBuffer.put(f2);
                this.x.m();
                um a2 = a.a(this.x);
                if (a2 != null) {
                    O(a2, list);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.t
    public void E() {
        Arrays.fill(this.y, (Object) null);
        this.A = 0;
        this.B = 0;
        this.C = null;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.t
    public void G(long j, boolean z2) {
        Arrays.fill(this.y, (Object) null);
        this.A = 0;
        this.B = 0;
        this.D = false;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.t
    public void K(d0[] d0VarArr, long j) {
        this.C = this.u.a(d0VarArr[0]);
    }

    @Override // com.google.android.exoplayer2.p0
    public boolean b() {
        return this.D;
    }

    @Override // com.google.android.exoplayer2.p0
    public boolean d() {
        return true;
    }

    @Override // com.google.android.exoplayer2.q0
    public int e(d0 d0Var) {
        if (!this.u.e(d0Var)) {
            return 0;
        }
        return (t.N(null, d0Var.u) ? 4 : 2) | 0 | 0;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            this.v.d((um) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.p0
    public void s(long j, long j2) {
        if (!this.D && this.B < 5) {
            this.x.clear();
            e0 z2 = z();
            int L = L(z2, this.x, false);
            if (L == -4) {
                if (this.x.isEndOfStream()) {
                    this.D = true;
                } else if (!this.x.isDecodeOnly()) {
                    ym ymVar = this.x;
                    ymVar.o = this.E;
                    ymVar.m();
                    wm wmVar = this.C;
                    int i = f0.a;
                    um a = wmVar.a(this.x);
                    if (a != null) {
                        ArrayList arrayList = new ArrayList(a.e());
                        O(a, arrayList);
                        if (!arrayList.isEmpty()) {
                            um umVar = new um(arrayList);
                            int i2 = this.A;
                            int i3 = this.B;
                            int i4 = (i2 + i3) % 5;
                            this.y[i4] = umVar;
                            this.z[i4] = this.x.c;
                            this.B = i3 + 1;
                        }
                    }
                }
            } else if (L == -5) {
                d0 d0Var = z2.c;
                d0Var.getClass();
                this.E = d0Var.v;
            }
        }
        if (this.B > 0) {
            long[] jArr = this.z;
            int i5 = this.A;
            if (jArr[i5] <= j) {
                um umVar2 = this.y[i5];
                int i6 = f0.a;
                Handler handler = this.w;
                if (handler != null) {
                    handler.obtainMessage(0, umVar2).sendToTarget();
                } else {
                    this.v.d(umVar2);
                }
                um[] umVarArr = this.y;
                int i7 = this.A;
                umVarArr[i7] = null;
                this.A = (i7 + 1) % 5;
                this.B--;
            }
        }
    }
}
