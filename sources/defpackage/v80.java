package defpackage;

import com.spotify.android.dac.api.view.helpers.a;
import java.util.Map;

/* renamed from: v80  reason: default package */
public final class v80 implements fjf<u80> {
    private final wlf<Map<String, a<?>>> a;

    public v80(wlf<Map<String, a<?>>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new u80(this.a.get());
    }
}
