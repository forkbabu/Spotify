package defpackage;

import io.netty.channel.d;
import io.reactivex.h;
import io.reactivex.i;

/* renamed from: ire  reason: default package */
public final /* synthetic */ class ire implements i {
    public final /* synthetic */ sre a;
    public final /* synthetic */ d b;

    public /* synthetic */ ire(sre sre, d dVar) {
        this.a = sre;
        this.b = dVar;
    }

    @Override // io.reactivex.i
    public final void subscribe(h hVar) {
        sre sre = this.a;
        d dVar = this.b;
        sre.getClass();
        dVar.o().A0(new rre(sre, hVar));
    }
}
