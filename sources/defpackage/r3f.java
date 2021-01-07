package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.voice.api.model.m;
import com.spotify.voice.api.n;
import com.spotify.voice.experiments.experience.view.e1;
import defpackage.p2f;
import io.reactivex.functions.l;
import io.reactivex.g;

/* renamed from: r3f  reason: default package */
public final /* synthetic */ class r3f implements l {
    public final /* synthetic */ n a;
    public final /* synthetic */ e1 b;
    public final /* synthetic */ ObjectMapper c;
    public final /* synthetic */ com.spotify.voice.api.l f;

    public /* synthetic */ r3f(n nVar, e1 e1Var, ObjectMapper objectMapper, com.spotify.voice.api.l lVar) {
        this.a = nVar;
        this.b = e1Var;
        this.c = objectMapper;
        this.f = lVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        n nVar = this.a;
        e1 e1Var = this.b;
        ObjectMapper objectMapper = this.c;
        com.spotify.voice.api.l lVar = this.f;
        p2f.a0 a0Var = (p2f.a0) obj;
        g<m> a2 = nVar.a();
        return je.Z(a2, a2).W(new t5f(e1Var), false, Integer.MAX_VALUE).j0(new l3f(objectMapper, lVar)).r0(y2f.a);
    }
}
