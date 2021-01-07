package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.music.features.premiumdestination.j;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;

/* renamed from: di7  reason: default package */
public final /* synthetic */ class di7 implements w {
    public final /* synthetic */ j a;
    public final /* synthetic */ ObjectMapper b;

    public /* synthetic */ di7(j jVar, ObjectMapper objectMapper) {
        this.a = jVar;
        this.b = objectMapper;
    }

    @Override // io.reactivex.w
    public final v apply(s sVar) {
        return sVar.a0(new fi7(this.a, this.b));
    }
}
