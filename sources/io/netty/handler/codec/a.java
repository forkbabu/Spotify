package io.netty.handler.codec;

import io.netty.buffer.j;
import io.netty.buffer.j0;
import io.netty.buffer.k;
import io.netty.buffer.p;
import io.netty.channel.m;
import io.netty.channel.y;
import io.netty.util.internal.r;
import java.util.List;

public abstract class a extends m {
    public static final c p = new C0603a();
    public static final c q = new b();
    j b;
    private c c = p;
    private boolean f;
    private boolean n;
    private int o;

    /* renamed from: io.netty.handler.codec.a$a  reason: collision with other inner class name */
    static class C0603a implements c {
        C0603a() {
        }

        @Override // io.netty.handler.codec.a.c
        public j a(k kVar, j jVar, j jVar2) {
            if (jVar.Z1() > jVar.M0() - jVar2.m1() || jVar.n() > 1) {
                j j = kVar.j(jVar.m1() + jVar2.m1());
                j.R1(jVar);
                jVar.d();
                jVar = j;
            }
            jVar.R1(jVar2);
            jVar2.d();
            return jVar;
        }
    }

    static class b implements c {
        b() {
        }

        @Override // io.netty.handler.codec.a.c
        public j a(k kVar, j jVar, j jVar2) {
            p pVar;
            if (jVar.n() > 1) {
                j j = kVar.j(jVar.m1() + jVar2.m1());
                j.R1(jVar);
                jVar.d();
                j.R1(jVar2);
                jVar2.d();
                return j;
            }
            if (jVar instanceof p) {
                pVar = (p) jVar;
            } else {
                pVar = kVar.k(Integer.MAX_VALUE);
                pVar.D2(true, jVar);
            }
            pVar.D2(true, jVar2);
            return pVar;
        }
    }

    public interface c {
        j a(k kVar, j jVar, j jVar2);
    }

    protected a() {
        if (a()) {
            throw new IllegalStateException("@Sharable annotation is not allowed");
        }
    }

    private void f(io.netty.channel.k kVar, boolean z) {
        c h = c.h();
        try {
            e(kVar, h);
            try {
                j jVar = this.b;
                if (jVar != null) {
                    jVar.d();
                    this.b = null;
                }
                int size = h.size();
                k(kVar, h, size);
                if (size > 0) {
                    kVar.A();
                }
                if (z) {
                    kVar.m0();
                }
            } finally {
                h.i();
            }
        } catch (DecoderException e) {
            throw e;
        } catch (Exception e2) {
            throw new DecoderException(e2);
        } catch (Throwable th) {
            h.i();
            throw th;
        }
    }

    static void k(io.netty.channel.k kVar, c cVar, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            kVar.N(cVar.d(i2));
        }
    }

    @Override // io.netty.channel.m, io.netty.channel.l
    public void B(io.netty.channel.k kVar) {
        this.o = 0;
        j();
        if (this.f) {
            this.f = false;
            if (!((y) kVar.h().X()).l()) {
                kVar.read();
            }
        }
        kVar.A();
    }

    @Override // io.netty.channel.m, io.netty.channel.l
    public void G(io.netty.channel.k kVar) {
        f(kVar, true);
    }

    @Override // io.netty.channel.m, io.netty.channel.l
    public void S(io.netty.channel.k kVar, Object obj) {
        if (obj instanceof j) {
            c h = c.h();
            try {
                j jVar = (j) obj;
                boolean z = this.b == null;
                this.n = z;
                if (z) {
                    this.b = jVar;
                } else {
                    this.b = this.c.a(kVar.t(), this.b, jVar);
                }
                c(kVar, this.b, h);
                j jVar2 = this.b;
                if (jVar2 == null || jVar2.K0()) {
                    int i = this.o + 1;
                    this.o = i;
                    if (i >= 16) {
                        this.o = 0;
                        j();
                    }
                } else {
                    this.o = 0;
                    this.b.d();
                    this.b = null;
                }
                int size = h.size();
                this.f = !h.f();
                k(kVar, h, size);
                h.i();
            } catch (DecoderException e) {
                throw e;
            } catch (Throwable th) {
                j jVar3 = this.b;
                if (jVar3 == null || jVar3.K0()) {
                    int i2 = this.o + 1;
                    this.o = i2;
                    if (i2 >= 16) {
                        this.o = 0;
                        j();
                    }
                } else {
                    this.o = 0;
                    this.b.d();
                    this.b = null;
                }
                int size2 = h.size();
                this.f = !h.f();
                k(kVar, h, size2);
                h.i();
                throw th;
            }
        } else {
            kVar.N(obj);
        }
    }

    /* access modifiers changed from: protected */
    public int b() {
        j jVar = this.b;
        if (jVar == null) {
            jVar = j0.b;
        }
        return jVar.m1();
    }

    /* access modifiers changed from: protected */
    public void c(io.netty.channel.k kVar, j jVar, List<Object> list) {
        while (jVar.K0()) {
            try {
                int size = list.size();
                if (size > 0) {
                    if (list instanceof c) {
                        k(kVar, (c) list, size);
                    } else {
                        for (int i = 0; i < size; i++) {
                            kVar.N(list.get(i));
                        }
                    }
                    list.clear();
                    if (!kVar.d0()) {
                        size = 0;
                    } else {
                        return;
                    }
                }
                int m1 = jVar.m1();
                h(kVar, jVar, list);
                if (kVar.d0()) {
                    return;
                }
                if (size == list.size()) {
                    if (m1 == jVar.m1()) {
                        return;
                    }
                } else if (m1 == jVar.m1()) {
                    throw new DecoderException(r.e(getClass()) + ".decode() did not read anything but decoded a message.");
                }
            } catch (DecoderException e) {
                throw e;
            } catch (Throwable th) {
                throw new DecoderException(th);
            }
        }
    }

    @Override // io.netty.channel.m, io.netty.channel.l
    public void c0(io.netty.channel.k kVar, Object obj) {
        if (obj instanceof okf) {
            f(kVar, false);
        }
        kVar.s(obj);
    }

    /* access modifiers changed from: package-private */
    public void e(io.netty.channel.k kVar, List<Object> list) {
        j jVar = this.b;
        if (jVar != null) {
            c(kVar, jVar, list);
            i(kVar, this.b, list);
            return;
        }
        i(kVar, j0.b, list);
    }

    /* access modifiers changed from: protected */
    public abstract void h(io.netty.channel.k kVar, j jVar, List<Object> list);

    /* access modifiers changed from: protected */
    public void i(io.netty.channel.k kVar, j jVar, List<Object> list) {
        if (jVar.K0()) {
            h(kVar, jVar, list);
        }
    }

    /* access modifiers changed from: protected */
    public final void j() {
        j jVar = this.b;
        if (jVar != null && !this.n && jVar.n() == 1) {
            this.b.N();
        }
    }

    /* access modifiers changed from: protected */
    public void l(io.netty.channel.k kVar) {
    }

    public void m(c cVar) {
        this.c = cVar;
    }

    @Override // io.netty.channel.j, io.netty.channel.i
    public final void r(io.netty.channel.k kVar) {
        j jVar = this.b;
        if (jVar != null) {
            this.b = null;
            int m1 = jVar.m1();
            if (m1 > 0) {
                j e1 = jVar.e1(m1);
                jVar.d();
                kVar.N(e1);
            } else {
                jVar.d();
            }
            this.o = 0;
            kVar.A();
        }
        l(kVar);
    }
}
