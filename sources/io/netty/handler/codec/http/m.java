package io.netty.handler.codec.http;

import io.netty.buffer.j;
import io.netty.channel.k;
import io.netty.channel.x;
import io.netty.handler.codec.PrematureChannelClosureException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;

public final class m extends x<a0, y> {
    private final Queue<u> p = new ArrayDeque();
    private boolean q;
    private final AtomicLong r = new AtomicLong();

    private final class b extends a0 {
        b(int i, int i2, int i3, boolean z) {
            super(i, i2, i3, z);
        }

        @Override // io.netty.handler.codec.a, io.netty.channel.m, io.netty.channel.l
        public void G(k kVar) {
            super.G(kVar);
            if (m.this.getClass()) {
                long j = m.this.r.get();
                if (j > 0) {
                    kVar.v(new PrematureChannelClosureException("channel gone inactive with " + j + " missing response(s)"));
                }
            }
        }

        /* access modifiers changed from: protected */
        @Override // io.netty.handler.codec.http.HttpObjectDecoder, io.netty.handler.codec.a
        public void h(k kVar, j jVar, List<Object> list) {
            if (m.this.q) {
                int b = b();
                if (b != 0) {
                    list.add(jVar.e1(b));
                    return;
                }
                return;
            }
            super.h(kVar, jVar, list);
            if (m.this.getClass()) {
                int size = list.size();
                for (int size2 = list.size(); size2 < size; size2++) {
                    Object obj = list.get(size2);
                    if (obj != null && (obj instanceof e0)) {
                        m.this.r.decrementAndGet();
                    }
                }
            }
        }

        /* access modifiers changed from: protected */
        @Override // io.netty.handler.codec.http.HttpObjectDecoder
        public boolean x(t tVar) {
            int d = ((z) tVar).b().d();
            if (d == 100) {
                return true;
            }
            u uVar = (u) m.this.p.poll();
            char charAt = uVar.g().charAt(0);
            if (charAt != 'C') {
                if (charAt == 'H' && u.f.equals(uVar)) {
                    return true;
                }
            } else if (d == 200 && u.s.equals(uVar)) {
                m.this.q = true;
                m.this.p.clear();
                return true;
            }
            return super.x(tVar);
        }
    }

    private final class c extends y {
        c(a aVar) {
        }

        /* access modifiers changed from: protected */
        @Override // io.netty.handler.codec.http.w, io.netty.handler.codec.i
        public void c(k kVar, Object obj, List<Object> list) {
            if ((obj instanceof x) && !m.this.q) {
                m.this.p.offer(((x) obj).method());
            }
            super.c(kVar, obj, list);
            if (m.this.getClass() && (obj instanceof e0)) {
                m.this.r.incrementAndGet();
            }
        }
    }

    public m() {
        f(new b(4096, 8192, 8192, true), new c(null));
    }
}
