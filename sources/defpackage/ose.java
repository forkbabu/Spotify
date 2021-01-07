package defpackage;

import com.spotify.audiorecord.api.e;
import com.spotify.voice.api.model.m;
import io.netty.channel.d;
import io.reactivex.functions.l;
import io.reactivex.g;
import io.reactivex.schedulers.a;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;

/* renamed from: ose  reason: default package */
public final /* synthetic */ class ose implements l {
    public final /* synthetic */ e a;

    public /* synthetic */ ose(e eVar) {
        this.a = eVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        e eVar = this.a;
        d dVar = (d) obj;
        if (dVar.isActive()) {
            g<ByteBuffer> i = eVar.i();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            i.getClass();
            return m.d(i.X(16, timeUnit, a.a()).S(qse.a).O(eVar.f()).i0(new ise(dVar)));
        }
        throw new IllegalStateException("Connection closed");
    }
}
