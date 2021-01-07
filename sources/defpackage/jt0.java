package defpackage;

import com.spotify.libs.connect.instrumentation.c;
import kotlin.jvm.internal.h;

/* renamed from: jt0  reason: default package */
public final class jt0 implements c {
    private final ht0 a;
    private final lt0 b;

    public jt0(ht0 ht0, lt0 lt0) {
        h.e(ht0, "impression");
        h.e(lt0, "interaction");
        this.a = ht0;
        this.b = lt0;
    }

    @Override // com.spotify.libs.connect.instrumentation.c
    public c.b a() {
        return this.b;
    }

    @Override // com.spotify.libs.connect.instrumentation.c
    public c.a b() {
        return this.a;
    }
}
