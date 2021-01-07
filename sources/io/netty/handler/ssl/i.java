package io.netty.handler.ssl;

import io.netty.handler.ssl.h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLEngine;

class i implements h {
    static final h.d e = new a();
    static final h.d f = new b();
    static final h.b g = new c();
    static final h.b h = new d();
    private final List<String> a;
    private final h.d b;
    private final h.b c;
    private final h.e d;

    static class a implements h.d {
        a() {
        }

        @Override // io.netty.handler.ssl.h.d
        public h.c a(SSLEngine sSLEngine, Set<String> set) {
            return new f((o) sSLEngine, set);
        }
    }

    static class b implements h.d {
        b() {
        }

        @Override // io.netty.handler.ssl.h.d
        public h.c a(SSLEngine sSLEngine, Set<String> set) {
            return new h((o) sSLEngine, set);
        }
    }

    static class c implements h.b {
        c() {
        }

        @Override // io.netty.handler.ssl.h.b
        public h.a a(SSLEngine sSLEngine, List<String> list) {
            return new e((o) sSLEngine, list);
        }
    }

    static class d implements h.b {
        d() {
        }

        @Override // io.netty.handler.ssl.h.b
        public h.a a(SSLEngine sSLEngine, List<String> list) {
            return new g((o) sSLEngine, list);
        }
    }

    protected static final class e extends g {
        public e(o oVar, List<String> list) {
            super(oVar, list);
        }
    }

    protected static final class f extends h {
        public f(o oVar, Set<String> set) {
            super(oVar, set);
        }
    }

    protected static class g implements h.a {
        private final List<String> a;

        public g(o oVar, List<String> list) {
            this.a = list;
        }
    }

    protected static class h implements h.c {
        public h(o oVar, Set<String> set) {
        }
    }

    protected i(h.e eVar, h.d dVar, h.b bVar, Iterable<String> iterable) {
        ArrayList arrayList;
        if (iterable == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(2);
            for (String str : iterable) {
                if (str == null || str.isEmpty()) {
                    throw new IllegalArgumentException("protocol cannot be null or empty");
                }
                arrayList2.add(str);
            }
            if (!arrayList2.isEmpty()) {
                arrayList = arrayList2;
            } else {
                throw new IllegalArgumentException("protocols cannot empty");
            }
        }
        if (eVar != null) {
            this.d = eVar;
            if (dVar != null) {
                this.b = dVar;
                if (bVar != null) {
                    this.c = bVar;
                    if (arrayList != null) {
                        this.a = Collections.unmodifiableList(arrayList);
                        return;
                    }
                    throw new NullPointerException("protocols");
                }
                throw new NullPointerException("listenerFactory");
            }
            throw new NullPointerException("selectorFactory");
        }
        throw new NullPointerException("wrapperFactory");
    }

    @Override // io.netty.handler.ssl.a
    public List<String> c() {
        return this.a;
    }

    @Override // io.netty.handler.ssl.h
    public h.b d() {
        return this.c;
    }

    @Override // io.netty.handler.ssl.h
    public h.d f() {
        return this.b;
    }

    @Override // io.netty.handler.ssl.h
    public h.e g() {
        return this.d;
    }
}
