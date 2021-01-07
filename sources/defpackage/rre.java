package defpackage;

import com.fasterxml.jackson.databind.JsonNode;
import defpackage.zre;
import io.netty.channel.k;
import io.netty.channel.t0;
import io.reactivex.h;
import java.util.concurrent.TimeoutException;

/* renamed from: rre  reason: default package */
class rre extends t0<JsonNode> {
    final /* synthetic */ h f;

    rre(sre sre, h hVar) {
        this.f = hVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [io.netty.channel.k, java.lang.Object] */
    /* access modifiers changed from: protected */
    @Override // io.netty.channel.t0
    public void b(k kVar, JsonNode jsonNode) {
        this.f.onNext(jsonNode);
    }

    @Override // io.netty.channel.m, io.netty.channel.l
    public void c0(k kVar, Object obj) {
        if (obj instanceof zre.a) {
            this.f.onError(new TimeoutException("Timeout from server connection"));
        }
    }
}
