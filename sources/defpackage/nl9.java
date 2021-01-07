package defpackage;

import com.spotify.music.freetiercommon.models.RemainingSkips;
import io.reactivex.g;
import io.reactivex.internal.functions.Functions;
import io.reactivex.k;
import io.reactivex.y;

/* renamed from: nl9  reason: default package */
public class nl9 implements k<Object, RemainingSkips> {
    private final mk9 a;
    private final y b;

    public nl9(mk9 mk9, y yVar) {
        this.a = mk9;
        this.b = yVar;
    }

    /* Return type fixed from 'tpf' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [io.reactivex.g] */
    @Override // io.reactivex.k
    public tpf<RemainingSkips> a(g<Object> gVar) {
        return gVar.F(new cl9(this));
    }

    public tpf b(Object obj) {
        g<RemainingSkips> u = this.a.a().P().o0(this.b).T().r(bl9.a).u();
        int i = g.b;
        return u.S(Functions.j(io.reactivex.internal.operators.flowable.k.c));
    }
}
