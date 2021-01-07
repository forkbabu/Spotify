package defpackage;

import com.spotify.remoteconfig.s7;
import kotlin.jvm.internal.h;

/* renamed from: cz9  reason: default package */
public final class cz9 implements fjf<Boolean> {
    private final wlf<s7> a;

    public cz9(wlf<s7> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        s7 s7Var = this.a.get();
        h.e(s7Var, "properties");
        return Boolean.valueOf(s7Var.a());
    }
}
