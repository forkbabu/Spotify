package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.music.ads.voice.domain.r;
import com.spotify.voice.api.model.m;
import com.spotify.voice.api.n;
import io.reactivex.functions.l;
import io.reactivex.g;
import io.reactivex.internal.operators.observable.o;

/* renamed from: wc2  reason: default package */
public final /* synthetic */ class wc2 implements l {
    public final /* synthetic */ n a;
    public final /* synthetic */ g b;
    public final /* synthetic */ ObjectMapper c;
    public final /* synthetic */ cqe f;

    public /* synthetic */ wc2(n nVar, g gVar, ObjectMapper objectMapper, cqe cqe) {
        this.a = nVar;
        this.b = gVar;
        this.c = objectMapper;
        this.f = cqe;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        n nVar = this.a;
        g gVar = this.b;
        ObjectMapper objectMapper = this.c;
        cqe cqe = this.f;
        r.m mVar = (r.m) obj;
        if (mVar.a().ordinal() != 0) {
            return o.a;
        }
        String b2 = mVar.b();
        g<m> a2 = nVar.a();
        return je.Z(a2, a2).Q(rc2.a).W(new zc2(gVar, cqe), false, Integer.MAX_VALUE).j0(new gc2(objectMapper, b2)).r0(fc2.a);
    }
}
