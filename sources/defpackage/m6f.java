package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.voice.api.l;
import com.spotify.voice.api.n;
import com.spotify.voice.experiments.experience.view.e1;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;

/* renamed from: m6f  reason: default package */
public final /* synthetic */ class m6f implements w {
    public final /* synthetic */ n a;
    public final /* synthetic */ ObjectMapper b;
    public final /* synthetic */ e1 c;
    public final /* synthetic */ l d;

    public /* synthetic */ m6f(n nVar, ObjectMapper objectMapper, e1 e1Var, l lVar) {
        this.a = nVar;
        this.b = objectMapper;
        this.c = e1Var;
        this.d = lVar;
    }

    @Override // io.reactivex.w
    public final v apply(s sVar) {
        return sVar.W(new r3f(this.a, this.c, this.b, this.d), false, Integer.MAX_VALUE);
    }
}
