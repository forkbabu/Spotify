package defpackage;

import com.spotify.audiorecord.api.e;
import io.reactivex.g;
import java.nio.ByteBuffer;

/* renamed from: m9f  reason: default package */
public final class m9f implements fjf<e> {
    private final wlf<g<ByteBuffer>> a;

    public m9f(wlf<g<ByteBuffer>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new h9f(this.a.get());
    }
}
