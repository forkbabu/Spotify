package com.spotify.music.features.browse.localcache;

import io.reactivex.g;
import io.reactivex.internal.functions.Functions;
import io.reactivex.k;
import okhttp3.e0;
import retrofit2.v;

class d implements k<v<e0>, b91> {
    private final f a;
    private final i b;

    public d(f fVar, i iVar) {
        this.a = fVar;
        this.b = iVar;
    }

    /* Return type fixed from 'tpf' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [io.reactivex.g] */
    @Override // io.reactivex.k
    public tpf<b91> a(g<v<e0>> gVar) {
        g<R> l = gVar.A(new a(this)).l(this.b);
        g<b91> u = this.a.read().u();
        if (l != null) {
            g m = g.m(u, l);
            g<R> l2 = gVar.l(this.b);
            if (l2 != null) {
                return m.S(Functions.j(l2));
            }
            throw new NullPointerException("next is null");
        }
        throw new NullPointerException("other is null");
    }

    public /* synthetic */ void b(v vVar) {
        e0 e0Var = (e0) vVar.a();
        if (e0Var != null) {
            okio.g l = e0Var.l();
            l.n(2147483647L);
            byte[] B = l.c().C().B();
            if (B.length > 0) {
                this.a.write(B);
            }
        }
    }
}
