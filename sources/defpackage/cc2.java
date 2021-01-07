package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.voice.api.n;
import io.reactivex.g;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;

/* renamed from: cc2  reason: default package */
public final /* synthetic */ class cc2 implements w {
    public final /* synthetic */ n a;
    public final /* synthetic */ g b;
    public final /* synthetic */ ObjectMapper c;
    public final /* synthetic */ cqe d;

    public /* synthetic */ cc2(n nVar, g gVar, ObjectMapper objectMapper, cqe cqe) {
        this.a = nVar;
        this.b = gVar;
        this.c = objectMapper;
        this.d = cqe;
    }

    @Override // io.reactivex.w
    public final v apply(s sVar) {
        return sVar.J0(new wc2(this.a, this.b, this.c, this.d));
    }
}
