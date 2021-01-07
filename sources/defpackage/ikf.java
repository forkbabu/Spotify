package defpackage;

import defpackage.jkf;
import io.netty.buffer.j;
import io.netty.buffer.j0;
import io.netty.buffer.k;
import io.netty.channel.d;
import io.netty.channel.g;
import io.netty.channel.k0;
import io.netty.channel.o;
import io.netty.channel.p;
import io.netty.channel.q;
import io.netty.channel.t;
import io.netty.channel.y;
import io.netty.util.internal.r;
import io.netty.util.n;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;

/* renamed from: ikf  reason: default package */
public abstract class ikf extends jkf {
    private static final o O = new o(false, 16);
    private static final String P;
    private Runnable N;

    /* access modifiers changed from: package-private */
    /* renamed from: ikf$a */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ikf.this.K0();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: ikf$b */
    public class b extends jkf.b {
        protected b() {
            super();
        }

        private void G(t tVar) {
            if (ikf.this.isOpen()) {
                if (Boolean.TRUE.equals(((pkf) ((vkf) ikf.this).X()).b(p.x))) {
                    ikf.this.k1();
                    SelectionKey selectionKey = ikf.this.F;
                    selectionKey.interestOps(selectionKey.interestOps() & (ikf.this.E ^ -1));
                    tVar.s(okf.a);
                    return;
                }
                k(l());
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:28:0x0075 A[SYNTHETIC, Splitter:B:28:0x0075] */
        @Override // defpackage.jkf.c
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void read() {
            /*
                r9 = this;
                ikf r0 = defpackage.ikf.this
                vkf r0 = (defpackage.vkf) r0
                io.netty.channel.e r0 = r0.X()
                ikf r1 = defpackage.ikf.this
                io.netty.channel.t r1 = r1.o()
                io.netty.channel.y r0 = (io.netty.channel.y) r0
                io.netty.buffer.k r2 = r0.d()
                io.netty.channel.p0$a r3 = r9.y()
                io.netty.channel.e0$a r3 = (io.netty.channel.e0.a) r3
                r3.i(r0)
            L_0x001d:
                r4 = 0
                r5 = 0
                io.netty.buffer.j r6 = r3.b(r2)     // Catch:{ all -> 0x0071 }
                ikf r7 = defpackage.ikf.this     // Catch:{ all -> 0x006e }
                int r7 = r7.g1(r6)     // Catch:{ all -> 0x006e }
                r3.h(r7)     // Catch:{ all -> 0x006e }
                int r7 = r3.g()     // Catch:{ all -> 0x006e }
                r8 = 1
                if (r7 > 0) goto L_0x003d
                r6.d()     // Catch:{ all -> 0x006e }
                int r2 = r3.g()
                if (r2 >= 0) goto L_0x0050
                goto L_0x0051
            L_0x003d:
                r3.f(r8)
                ikf r7 = defpackage.ikf.this
                r7.G = r5
                r7 = r1
                io.netty.channel.a0 r7 = (io.netty.channel.a0) r7
                r7.a0(r6)
                boolean r6 = r3.e()
                if (r6 != 0) goto L_0x001d
            L_0x0050:
                r8 = 0
            L_0x0051:
                r3.a()     // Catch:{ all -> 0x006c }
                r2 = r1
                io.netty.channel.a0 r2 = (io.netty.channel.a0) r2
                r2.e0()
                if (r8 == 0) goto L_0x005f
                r9.G(r2)
            L_0x005f:
                ikf r1 = defpackage.ikf.this
                boolean r1 = r1.G
                if (r1 != 0) goto L_0x00af
                boolean r0 = r0.l()
                if (r0 != 0) goto L_0x00af
                goto L_0x00ac
            L_0x006c:
                r2 = move-exception
                goto L_0x0073
            L_0x006e:
                r2 = move-exception
                r4 = r6
                goto L_0x0072
            L_0x0071:
                r2 = move-exception
            L_0x0072:
                r8 = 0
            L_0x0073:
                if (r4 == 0) goto L_0x008b
                boolean r6 = r4.K0()     // Catch:{ all -> 0x0086 }
                if (r6 == 0) goto L_0x0088
                ikf r6 = defpackage.ikf.this     // Catch:{ all -> 0x0086 }
                r6.G = r5     // Catch:{ all -> 0x0086 }
                r5 = r1
                io.netty.channel.a0 r5 = (io.netty.channel.a0) r5
                r5.a0(r4)
                goto L_0x008b
            L_0x0086:
                r1 = move-exception
                goto L_0x00b0
            L_0x0088:
                r4.d()
            L_0x008b:
                r3.a()
                r3 = r1
                io.netty.channel.a0 r3 = (io.netty.channel.a0) r3
                r3.e0()
                r3.v(r2)
                if (r8 != 0) goto L_0x009d
                boolean r2 = r2 instanceof java.io.IOException
                if (r2 == 0) goto L_0x00a0
            L_0x009d:
                r9.G(r1)
            L_0x00a0:
                ikf r1 = defpackage.ikf.this
                boolean r1 = r1.G
                if (r1 != 0) goto L_0x00af
                boolean r0 = r0.l()
                if (r0 != 0) goto L_0x00af
            L_0x00ac:
                r9.F()
            L_0x00af:
                return
            L_0x00b0:
                ikf r2 = defpackage.ikf.this
                boolean r2 = r2.G
                if (r2 != 0) goto L_0x00bf
                boolean r0 = r0.l()
                if (r0 != 0) goto L_0x00bf
                r9.F()
            L_0x00bf:
                goto L_0x00c1
            L_0x00c0:
                throw r1
            L_0x00c1:
                goto L_0x00c0
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ikf.b.read():void");
        }
    }

    static {
        StringBuilder V0 = je.V0(" (expected: ");
        V0.append(r.e(j.class));
        V0.append(", ");
        V0.append(r.e(k0.class));
        V0.append(')');
        P = V0.toString();
    }

    protected ikf(d dVar, SelectableChannel selectableChannel) {
        super(dVar, selectableChannel, 1);
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.channel.AbstractChannel
    public void I0(q qVar) {
        int i = -1;
        boolean z = false;
        while (true) {
            Object e = qVar.e();
            if (e == null) {
                f1();
                return;
            }
            long j = 0;
            boolean z2 = true;
            if (e instanceof j) {
                j jVar = (j) e;
                if (jVar.m1() != 0) {
                    if (i == -1) {
                        i = ((y) ((vkf) this).X()).j();
                    }
                    int i2 = i - 1;
                    while (true) {
                        if (i2 < 0) {
                            break;
                        }
                        int h1 = h1(jVar);
                        if (h1 == 0) {
                            z = true;
                            break;
                        }
                        j += (long) h1;
                        if (!jVar.K0()) {
                            break;
                        }
                        i2--;
                    }
                    z2 = false;
                    qVar.q(j);
                    if (!z2) {
                        break;
                    }
                    qVar.r();
                } else {
                    qVar.r();
                }
            } else if (e instanceof k0) {
                k0 k0Var = (k0) e;
                boolean z3 = k0Var.i() >= k0Var.l();
                if (!z3) {
                    if (i == -1) {
                        i = ((y) ((vkf) this).X()).j();
                    }
                    int i3 = i - 1;
                    long j2 = 0;
                    while (true) {
                        if (i3 < 0) {
                            z2 = z3;
                            break;
                        }
                        long i1 = i1(k0Var);
                        if (i1 == 0) {
                            z2 = z3;
                            z = true;
                            break;
                        }
                        j2 += i1;
                        if (k0Var.i() >= k0Var.l()) {
                            break;
                        }
                        i3--;
                    }
                    qVar.q(j2);
                    z3 = z2;
                }
                if (!z3) {
                    break;
                }
                qVar.r();
            } else {
                throw new Error();
            }
        }
        j1(z);
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.channel.AbstractChannel
    public final Object J0(Object obj) {
        j i;
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (jVar.I0()) {
                return obj;
            }
            int m1 = jVar.m1();
            if (m1 == 0) {
                n.b(jVar);
                return j0.b;
            }
            k t = t();
            if (t.g()) {
                i = t.h(m1);
                i.S1(jVar, jVar.n1(), m1);
                n.b(jVar);
            } else {
                i = io.netty.buffer.o.i();
                if (i == null) {
                    return jVar;
                }
                i.S1(jVar, jVar.n1(), m1);
                n.b(jVar);
            }
            return i;
        } else if (obj instanceof k0) {
            return obj;
        } else {
            StringBuilder V0 = je.V0("unsupported message type: ");
            V0.append(r.f(obj));
            V0.append(P);
            throw new UnsupportedOperationException(V0.toString());
        }
    }

    /* access modifiers changed from: protected */
    public final void f1() {
        SelectionKey selectionKey = this.F;
        if (selectionKey.isValid()) {
            int interestOps = selectionKey.interestOps();
            if ((interestOps & 4) != 0) {
                selectionKey.interestOps(interestOps & -5);
            }
        }
    }

    /* access modifiers changed from: protected */
    public abstract int g1(j jVar);

    /* access modifiers changed from: protected */
    public abstract int h1(j jVar);

    /* access modifiers changed from: protected */
    public abstract long i1(k0 k0Var);

    /* access modifiers changed from: protected */
    public final void j1(boolean z) {
        if (z) {
            SelectionKey selectionKey = this.F;
            if (selectionKey.isValid()) {
                int interestOps = selectionKey.interestOps();
                if ((interestOps & 4) == 0) {
                    selectionKey.interestOps(interestOps | 4);
                    return;
                }
                return;
            }
            return;
        }
        Runnable runnable = this.N;
        if (runnable == null) {
            runnable = new a();
            this.N = runnable;
        }
        V().execute(runnable);
    }

    /* access modifiers changed from: protected */
    public abstract g k1();

    @Override // io.netty.channel.d
    public o metadata() {
        return O;
    }
}
