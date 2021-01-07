package defpackage;

import io.netty.channel.d;
import io.netty.channel.g;
import io.netty.channel.h;
import io.netty.util.concurrent.r;
import io.netty.util.concurrent.s;

/* renamed from: ure  reason: default package */
class ure implements h {
    final /* synthetic */ d c;

    ure(vre vre, d dVar) {
        this.c = dVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [io.netty.util.concurrent.r] */
    @Override // io.netty.util.concurrent.s
    public void a(g gVar) {
        if (!gVar.x() && this.c.isActive()) {
            this.c.close().mo86d((s<? extends r<? super Void>>) jre.c);
        }
    }
}
