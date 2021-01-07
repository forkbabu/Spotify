package io.netty.channel;

import io.netty.channel.f0;
import io.netty.channel.m0;
import io.netty.util.Recycler;
import io.netty.util.internal.logging.c;
import io.netty.util.n;

public final class o0 {
    private static final io.netty.util.internal.logging.b h = c.b(o0.class.getName());
    private final k a;
    private final q b;
    private final m0.a c;
    private b d;
    private b e;
    private int f;
    private long g;

    /* access modifiers changed from: package-private */
    public static final class b {
        private static final Recycler<b> f = new a();
        private final Recycler.e<b> a;
        private b b;
        private long c;
        private v d;
        private Object e;

        static class a extends Recycler<b> {
            a() {
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [io.netty.util.Recycler$e] */
            /* access modifiers changed from: protected */
            @Override // io.netty.util.Recycler
            public b k(Recycler.e<b> eVar) {
                return new b(eVar, null);
            }
        }

        b(Recycler.e eVar, a aVar) {
            this.a = eVar;
        }

        static void f(b bVar) {
            bVar.c = 0;
            bVar.b = null;
            bVar.e = null;
            bVar.d = null;
            bVar.a.a(bVar);
        }

        static b g(Object obj, int i, v vVar) {
            b j = f.j();
            j.c = (long) i;
            j.e = obj;
            j.d = vVar;
            return j;
        }
    }

    static {
        int i = c.b;
    }

    public o0(k kVar) {
        if (kVar != null) {
            this.a = kVar;
            this.b = kVar.h().l0().A();
            this.c = ((y) kVar.h().X()).f().a();
            return;
        }
        throw new NullPointerException("ctx");
    }

    private void d(b bVar, boolean z) {
        b bVar2 = bVar.b;
        long j = bVar.c;
        if (z) {
            if (bVar2 == null) {
                this.e = null;
                this.d = null;
                this.f = 0;
                this.g = 0;
            } else {
                this.d = bVar2;
                this.f--;
                this.g -= j;
            }
        }
        b.f(bVar);
        q qVar = this.b;
        if (qVar != null) {
            qVar.f(j);
        }
    }

    public void a(Object obj, v vVar) {
        if (obj == null) {
            throw new NullPointerException("msg");
        } else if (vVar != null) {
            int a2 = ((f0.b) this.c).a(obj);
            if (a2 < 0) {
                a2 = 0;
            }
            b g2 = b.g(obj, a2, vVar);
            b bVar = this.e;
            if (bVar == null) {
                this.d = g2;
                this.e = g2;
            } else {
                bVar.b = g2;
                this.e = g2;
            }
            this.f++;
            this.g += (long) a2;
            q qVar = this.b;
            if (qVar != null) {
                qVar.j(g2.c);
            }
        } else {
            throw new NullPointerException("promise");
        }
    }

    public Object b() {
        b bVar = this.d;
        if (bVar == null) {
            return null;
        }
        return bVar.e;
    }

    public boolean c() {
        return this.d == null;
    }

    public v e() {
        b bVar = this.d;
        if (bVar == null) {
            return null;
        }
        v vVar = bVar.d;
        n.b(bVar.e);
        d(bVar, true);
        return vVar;
    }

    public void f(Throwable th) {
        if (th == null) {
            throw new NullPointerException("cause");
        }
        while (true) {
            b bVar = this.d;
            if (bVar != null) {
                this.e = null;
                this.d = null;
                this.f = 0;
                this.g = 0;
                while (bVar != null) {
                    b bVar2 = bVar.b;
                    n.b(bVar.e);
                    v vVar = bVar.d;
                    d(bVar, false);
                    if (!(vVar instanceof w0) && !vVar.n(th)) {
                        h.g("Failed to mark a promise as failure because it's done already: {}", vVar, th);
                    }
                    bVar = bVar2;
                }
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003d A[EDGE_INSN: B:14:0x003d->B:10:0x003d ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0017 A[Catch:{ all -> 0x0041 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public io.netty.channel.g g() {
        /*
            r8 = this;
            boolean r0 = r8.c()
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            io.netty.channel.k r0 = r8.a
            io.netty.channel.v r0 = r0.q()
            io.netty.util.concurrent.z r2 = new io.netty.util.concurrent.z
            r2.<init>()
        L_0x0013:
            io.netty.channel.o0$b r3 = r8.d     // Catch:{ all -> 0x0041 }
            if (r3 == 0) goto L_0x003d
            r8.e = r1     // Catch:{ all -> 0x0041 }
            r8.d = r1     // Catch:{ all -> 0x0041 }
            r4 = 0
            r8.f = r4     // Catch:{ all -> 0x0041 }
            r5 = 0
            r8.g = r5     // Catch:{ all -> 0x0041 }
        L_0x0022:
            if (r3 == 0) goto L_0x0013
            io.netty.channel.o0$b r5 = io.netty.channel.o0.b.a(r3)     // Catch:{ all -> 0x0041 }
            java.lang.Object r6 = io.netty.channel.o0.b.d(r3)     // Catch:{ all -> 0x0041 }
            io.netty.channel.v r7 = io.netty.channel.o0.b.e(r3)     // Catch:{ all -> 0x0041 }
            r8.d(r3, r4)     // Catch:{ all -> 0x0041 }
            r2.h(r7)     // Catch:{ all -> 0x0041 }
            io.netty.channel.k r3 = r8.a     // Catch:{ all -> 0x0041 }
            r3.x(r6, r7)     // Catch:{ all -> 0x0041 }
            r3 = r5
            goto L_0x0022
        L_0x003d:
            r2.i(r0)     // Catch:{ all -> 0x0041 }
            goto L_0x0045
        L_0x0041:
            r1 = move-exception
            r0.mo85g(r1)
        L_0x0045:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.netty.channel.o0.g():io.netty.channel.g");
    }
}
