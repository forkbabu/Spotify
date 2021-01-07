package defpackage;

import io.reactivex.z;
import java.util.Map;
import kotlin.jvm.internal.h;

/* renamed from: eld  reason: default package */
public final class eld implements dld {
    private final fld a;

    public eld(fld fld) {
        h.e(fld, "remoteConfigEndpoint");
        this.a = fld;
    }

    @Override // defpackage.dld
    public z<Map<String, Object>> a() {
        return this.a.a();
    }
}
