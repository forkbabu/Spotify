package defpackage;

import io.netty.channel.h;
import io.netty.channel.k;
import io.netty.handler.codec.http.j;
import io.netty.util.concurrent.r;
import io.netty.util.concurrent.s;
import io.reactivex.functions.f;

/* renamed from: nre  reason: default package */
public final /* synthetic */ class nre implements f {
    public final /* synthetic */ k a;

    public /* synthetic */ nre(k kVar) {
        this.a = kVar;
    }

    @Override // io.reactivex.functions.f
    public final void cancel() {
        this.a.h().z(new j()).mo86d((s<? extends r<? super Void>>) h.a);
    }
}
