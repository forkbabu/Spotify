package com.google.android.exoplayer2.text;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.e0;
import com.google.android.exoplayer2.t;
import com.google.android.exoplayer2.text.f;
import com.google.android.exoplayer2.util.f0;
import com.google.android.exoplayer2.util.s;
import java.util.Collections;
import java.util.List;

public final class j extends t implements Handler.Callback {
    private int A;
    private d0 B;
    private e C;
    private g D;
    private h E;
    private h F;
    private int G;
    private final Handler u;
    private final i v;
    private final f w;
    private final e0 x;
    private boolean y;
    private boolean z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(i iVar, Looper looper) {
        super(3);
        Handler handler;
        f fVar = f.a;
        iVar.getClass();
        this.v = iVar;
        if (looper == null) {
            handler = null;
        } else {
            int i = f0.a;
            handler = new Handler(looper, this);
        }
        this.u = handler;
        this.w = fVar;
        this.x = new e0();
    }

    private void O() {
        List<a> emptyList = Collections.emptyList();
        Handler handler = this.u;
        if (handler != null) {
            handler.obtainMessage(0, emptyList).sendToTarget();
        } else {
            this.v.a(emptyList);
        }
    }

    private long P() {
        int i = this.G;
        if (i == -1 || i >= this.E.i()) {
            return Long.MAX_VALUE;
        }
        return this.E.h(this.G);
    }

    private void Q() {
        this.D = null;
        this.G = -1;
        h hVar = this.E;
        if (hVar != null) {
            hVar.release();
            this.E = null;
        }
        h hVar2 = this.F;
        if (hVar2 != null) {
            hVar2.release();
            this.F = null;
        }
    }

    private void R() {
        Q();
        this.C.d();
        this.C = null;
        this.A = 0;
        this.C = ((f.a) this.w).a(this.B);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.t
    public void E() {
        this.B = null;
        O();
        Q();
        this.C.d();
        this.C = null;
        this.A = 0;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.t
    public void G(long j, boolean z2) {
        O();
        this.y = false;
        this.z = false;
        if (this.A != 0) {
            R();
            return;
        }
        Q();
        this.C.flush();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.t
    public void K(d0[] d0VarArr, long j) {
        d0 d0Var = d0VarArr[0];
        this.B = d0Var;
        if (this.C != null) {
            this.A = 1;
        } else {
            this.C = ((f.a) this.w).a(d0Var);
        }
    }

    @Override // com.google.android.exoplayer2.p0
    public boolean b() {
        return this.z;
    }

    @Override // com.google.android.exoplayer2.p0
    public boolean d() {
        return true;
    }

    @Override // com.google.android.exoplayer2.q0
    public int e(d0 d0Var) {
        ((f.a) this.w).getClass();
        String str = d0Var.r;
        if (!("text/vtt".equals(str) || "text/x-ssa".equals(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-subrip".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/cea-608".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/cea-708".equals(str) || "application/dvbsubs".equals(str) || "application/pgs".equals(str))) {
            return s.i(d0Var.r) ? 1 : 0;
        }
        return (t.N(null, d0Var.u) ? 4 : 2) | 0 | 0;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            this.v.a((List) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.p0
    public void s(long j, long j2) {
        boolean z2;
        if (!this.z) {
            if (this.F == null) {
                this.C.a(j);
                try {
                    this.F = (h) this.C.b();
                } catch (SubtitleDecoderException e) {
                    throw x(e, this.B);
                }
            }
            if (getState() == 2) {
                if (this.E != null) {
                    long P = P();
                    z2 = false;
                    while (P <= j) {
                        this.G++;
                        P = P();
                        z2 = true;
                    }
                } else {
                    z2 = false;
                }
                h hVar = this.F;
                if (hVar != null) {
                    if (hVar.isEndOfStream()) {
                        if (!z2 && P() == Long.MAX_VALUE) {
                            if (this.A == 2) {
                                R();
                            } else {
                                Q();
                                this.z = true;
                            }
                        }
                    } else if (this.F.timeUs <= j) {
                        h hVar2 = this.E;
                        if (hVar2 != null) {
                            hVar2.release();
                        }
                        h hVar3 = this.F;
                        this.E = hVar3;
                        this.F = null;
                        this.G = hVar3.d(j);
                        z2 = true;
                    }
                }
                if (z2) {
                    List<a> g = this.E.g(j);
                    Handler handler = this.u;
                    if (handler != null) {
                        handler.obtainMessage(0, g).sendToTarget();
                    } else {
                        this.v.a(g);
                    }
                }
                if (this.A != 2) {
                    while (!this.y) {
                        try {
                            if (this.D == null) {
                                g gVar = (g) this.C.e();
                                this.D = gVar;
                                if (gVar == null) {
                                    return;
                                }
                            }
                            if (this.A == 1) {
                                this.D.setFlags(4);
                                this.C.c(this.D);
                                this.D = null;
                                this.A = 2;
                                return;
                            }
                            int L = L(this.x, this.D, false);
                            if (L == -4) {
                                if (this.D.isEndOfStream()) {
                                    this.y = true;
                                } else {
                                    g gVar2 = this.D;
                                    gVar2.o = this.x.c.v;
                                    gVar2.m();
                                }
                                this.C.c(this.D);
                                this.D = null;
                            } else if (L == -3) {
                                return;
                            }
                        } catch (SubtitleDecoderException e2) {
                            throw x(e2, this.B);
                        }
                    }
                }
            }
        }
    }
}
