package defpackage;

import com.spotify.libs.connect.instrumentation.c;
import kotlin.jvm.internal.h;

/* renamed from: ht0  reason: default package */
public final class ht0 implements c.a {
    private final ere a;
    private final ft0 b;

    public ht0(ere ere, ft0 ft0) {
        h.e(ere, "userBehaviourEventLogger");
        h.e(ft0, "connectNudgeEventFactory");
        this.a = ere;
        this.b = ft0;
    }

    @Override // com.spotify.libs.connect.instrumentation.c.a
    public void a() {
        this.a.a(this.b.a().b().b());
    }
}
