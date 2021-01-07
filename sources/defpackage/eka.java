package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.h;

/* renamed from: eka  reason: default package */
public final class eka {
    private final Map<String, yda> a = new LinkedHashMap();

    public final yda a(String str) {
        h.e(str, "packageName");
        return this.a.get(str);
    }

    public final void b(String str, yda yda) {
        h.e(str, "packageName");
        h.e(yda, "description");
        this.a.put(str, yda);
    }
}
