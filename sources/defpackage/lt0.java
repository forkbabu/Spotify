package defpackage;

import com.spotify.libs.connect.instrumentation.c;
import kotlin.jvm.internal.h;

/* renamed from: lt0  reason: default package */
public final class lt0 implements c.b {
    private final ere a;
    private final ft0 b;

    public lt0(ere ere, ft0 ft0) {
        h.e(ere, "userBehaviourEventLogger");
        h.e(ft0, "connectNudgeEventFactory");
        this.a = ere;
        this.b = ft0;
    }

    @Override // com.spotify.libs.connect.instrumentation.c.b
    public void a() {
        this.a.a(this.b.a().b().a("spotify:connect-device-picker"));
    }

    @Override // com.spotify.libs.connect.instrumentation.c.b
    public void b() {
        this.a.a(this.b.a().b().c());
    }
}
