package defpackage;

import io.netty.channel.d;
import io.reactivex.functions.l;
import java.nio.ByteBuffer;

/* renamed from: lse  reason: default package */
public final /* synthetic */ class lse implements l {
    public final /* synthetic */ d a;

    public /* synthetic */ lse(d dVar) {
        this.a = dVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return new u3(this.a, (ByteBuffer) obj);
    }
}
