package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.voice.api.model.m;
import io.reactivex.functions.l;

/* renamed from: l3f  reason: default package */
public final /* synthetic */ class l3f implements l {
    public final /* synthetic */ ObjectMapper a;
    public final /* synthetic */ com.spotify.voice.api.l b;

    public /* synthetic */ l3f(ObjectMapper objectMapper, com.spotify.voice.api.l lVar) {
        this.a = objectMapper;
        this.b = lVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return (q2f) ((m) obj).e(y5f.a, y3f.a, q6f.a, w5f.a, new s6f(this.a, this.b));
    }
}
