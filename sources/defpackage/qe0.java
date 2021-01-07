package defpackage;

import java.util.UUID;
import kotlin.jvm.internal.h;

/* renamed from: qe0  reason: default package */
public final class qe0 implements pe0 {
    @Override // defpackage.pe0
    public String a() {
        String uuid = UUID.randomUUID().toString();
        h.d(uuid, "UUID.randomUUID().toString()");
        return uuid;
    }
}
