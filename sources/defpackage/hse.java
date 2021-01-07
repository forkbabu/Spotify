package defpackage;

import com.spotify.audiorecord.api.e;
import io.netty.channel.d;
import io.reactivex.functions.l;
import io.reactivex.g;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.operators.flowable.FlowableTakeUntil;
import java.nio.ByteBuffer;

/* renamed from: hse  reason: default package */
public final /* synthetic */ class hse implements l {
    public final /* synthetic */ e a;
    public final /* synthetic */ com.spotify.voice.api.model.l b;
    public final /* synthetic */ sse c;
    public final /* synthetic */ mte f;
    public final /* synthetic */ g n;

    public /* synthetic */ hse(e eVar, com.spotify.voice.api.model.l lVar, sse sse, mte mte, g gVar) {
        this.a = eVar;
        this.b = lVar;
        this.c = sse;
        this.f = mte;
        this.n = gVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        g<ByteBuffer> gVar;
        e eVar = this.a;
        com.spotify.voice.api.model.l lVar = this.b;
        sse sse = this.c;
        mte mte = this.f;
        g gVar2 = this.n;
        d dVar = (d) obj;
        if (eVar.b()) {
            gVar = eVar.e();
        } else {
            gVar = eVar.i();
        }
        return new FlowableTakeUntil(gVar.S(qse.a).O(new lse(dVar)).z(new ese(lVar, sse, mte, eVar), Functions.f, Functions.c), gVar2.C(bse.a).h0(1));
    }
}
