package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.voice.api.model.m;
import io.reactivex.functions.l;

/* renamed from: uve  reason: default package */
public final /* synthetic */ class uve implements l {
    public final /* synthetic */ ObjectMapper a;
    public final /* synthetic */ com.spotify.voice.api.l b;

    public /* synthetic */ uve(ObjectMapper objectMapper, com.spotify.voice.api.l lVar) {
        this.a = objectMapper;
        this.b = lVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return (vue) ((m) obj).e(wwe.a, bye.a, xxe.a, fwe.a, new aye(this.a, this.b));
    }
}
