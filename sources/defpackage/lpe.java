package defpackage;

import com.spotify.mobile.android.util.Assertion;
import java.util.Map;
import kotlin.jvm.internal.h;

/* renamed from: lpe  reason: default package */
public class lpe {
    private final Map<Object, Object> a;

    public lpe(Map<Object, ? extends Object> map) {
        h.e(map, "params");
        this.a = map;
        if (!map.containsKey("timestamp")) {
            Assertion.g("Required timestamp is null");
        }
        if (!map.containsKey("type")) {
            Assertion.g("Required type is null");
        }
    }

    public final Map<Object, Object> a() {
        return this.a;
    }
}
