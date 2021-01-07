package defpackage;

import io.reactivex.s;
import java.util.Map;

/* renamed from: ju6  reason: default package */
public final class ju6 implements fjf<s<Map<String, String>>> {
    private final wlf<txc> a;

    public ju6(wlf<txc> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        s<Map<String, String>> b = this.a.get().b();
        yif.g(b, "Cannot return null from a non-@Nullable @Provides method");
        return b;
    }
}
