package defpackage;

import io.netty.buffer.j;
import io.netty.buffer.o;
import io.netty.channel.k;
import io.netty.handler.codec.CorruptedFrameException;
import io.netty.handler.codec.TooLongFrameException;
import io.netty.handler.codec.a;
import java.util.List;

/* renamed from: wkf  reason: default package */
public class wkf extends a {
    private int r;
    private int s;
    private int t;
    private boolean u;
    private final int v = 1048576;

    private void n(byte b, j jVar, int i) {
        if ((b == 123 || b == 91) && !this.u) {
            this.r++;
        } else if ((b == 125 || b == 93) && !this.u) {
            this.r--;
        } else if (b != 34) {
        } else {
            if (!this.u) {
                this.u = true;
                return;
            }
            int i2 = i - 1;
            int i3 = 0;
            while (i2 >= 0 && jVar.S(i2) == 92) {
                i3++;
                i2--;
            }
            if (i3 % 2 == 0) {
                this.u = false;
            }
        }
    }

    private void o() {
        this.u = false;
        this.t = 0;
        this.r = 0;
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.handler.codec.a
    public void h(k kVar, j jVar, List<Object> list) {
        int i;
        if (this.t == -1) {
            jVar.I1(jVar.m1());
            return;
        }
        int i2 = this.s;
        int Z1 = jVar.Z1();
        if (Z1 <= this.v) {
            while (i2 < Z1) {
                byte S = jVar.S(i2);
                int i3 = this.t;
                if (i3 == 1) {
                    n(S, jVar, i2);
                    if (this.r == 0) {
                        int i4 = i2 + 1;
                        j v1 = jVar.v1(jVar.n1(), i4 - jVar.n1());
                        if (v1 != null) {
                            list.add(v1);
                        }
                        jVar.p1(i4);
                        o();
                    }
                } else if (i3 == 2) {
                    n(S, jVar, i2);
                    if (!this.u && (((i = this.r) == 1 && S == 44) || (i == 0 && S == 93))) {
                        for (int n1 = jVar.n1(); Character.isWhitespace(jVar.S(n1)); n1++) {
                            jVar.I1(1);
                        }
                        int i5 = i2 - 1;
                        while (i5 >= jVar.n1() && Character.isWhitespace(jVar.S(i5))) {
                            i5--;
                        }
                        j v12 = jVar.v1(jVar.n1(), (i5 + 1) - jVar.n1());
                        if (v12 != null) {
                            list.add(v12);
                        }
                        jVar.p1(i2 + 1);
                        if (S == 93) {
                            o();
                        }
                    }
                } else if (S == 123 || S == 91) {
                    this.r = 1;
                    this.t = 1;
                } else if (Character.isWhitespace(S)) {
                    jVar.I1(1);
                } else {
                    this.t = -1;
                    StringBuilder W0 = je.W0("invalid JSON received at byte position ", i2, ": ");
                    W0.append(o.g(jVar));
                    throw new CorruptedFrameException(W0.toString());
                }
                i2++;
            }
            if (jVar.m1() == 0) {
                this.s = 0;
            } else {
                this.s = i2;
            }
        } else {
            jVar.I1(jVar.m1());
            o();
            StringBuilder V0 = je.V0("object length exceeds ");
            V0.append(this.v);
            V0.append(": ");
            V0.append(Z1);
            V0.append(" bytes discarded");
            throw new TooLongFrameException(V0.toString());
        }
    }
}
