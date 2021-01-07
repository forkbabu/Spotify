package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

/* renamed from: jh0  reason: default package */
public final class jh0 {
    private final Map<String, String> a;
    private final int b;
    private final gh0 c;

    public jh0(int i, gh0 gh0) {
        this.b = i;
        this.c = gh0;
        LinkedHashMap s = d.s(new Pair("updateThrottling", String.valueOf(i)), new Pair("responseFormat", "protobuf"));
        if (gh0 != null) {
            gh0.a(s);
        }
        this.a = s;
    }

    public final Map<String, String> a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jh0)) {
            return false;
        }
        jh0 jh0 = (jh0) obj;
        return this.b == jh0.b && h.a(this.c, jh0.c);
    }

    public int hashCode() {
        int i = this.b * 31;
        gh0 gh0 = this.c;
        return i + (gh0 != null ? gh0.hashCode() : 0);
    }

    public String toString() {
        StringBuilder V0 = je.V0("ListenLaterEndpointConfiguration(updateThrottling=");
        V0.append(this.b);
        V0.append(", range=");
        V0.append(this.c);
        V0.append(")");
        return V0.toString();
    }

    public jh0() {
        this(500, null);
    }
}
