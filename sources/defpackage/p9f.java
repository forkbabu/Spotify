package defpackage;

import io.reactivex.BackpressureStrategy;
import io.reactivex.g;
import io.reactivex.subjects.c;
import java.nio.ByteBuffer;

/* renamed from: p9f  reason: default package */
public final class p9f implements fjf<g<ByteBuffer>> {
    private final wlf<c<ByteBuffer>> a;

    public p9f(wlf<c<ByteBuffer>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return this.a.get().Y0(BackpressureStrategy.BUFFER);
    }
}
