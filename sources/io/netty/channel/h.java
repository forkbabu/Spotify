package io.netty.channel;

import io.netty.util.concurrent.s;

public interface h extends s<g> {
    public static final h a = new a();
    public static final h b = new b();

    static class a implements h {
        a() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [io.netty.util.concurrent.r] */
        @Override // io.netty.util.concurrent.s
        public void a(g gVar) {
            gVar.h().close();
        }
    }

    static class b implements h {
        b() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [io.netty.util.concurrent.r] */
        @Override // io.netty.util.concurrent.s
        public void a(g gVar) {
            g gVar2 = gVar;
            if (!gVar2.x()) {
                gVar2.h().close();
            }
        }
    }
}
