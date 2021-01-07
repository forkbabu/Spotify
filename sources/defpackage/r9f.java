package defpackage;

import io.reactivex.subjects.c;
import io.reactivex.x;
import java.nio.ByteBuffer;

/* renamed from: r9f  reason: default package */
public final class r9f implements fjf<x<ByteBuffer>> {
    private final wlf<c<ByteBuffer>> a;

    public r9f(wlf<c<ByteBuffer>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        c<ByteBuffer> cVar = this.a.get();
        if (cVar != null) {
            return cVar;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
