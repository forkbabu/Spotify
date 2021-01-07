package defpackage;

import com.google.common.collect.ImmutableMap;
import java.util.Arrays;
import java.util.Map;

/* renamed from: n61  reason: default package */
public final class n61 {
    private final String a;
    private final s81 b;
    private final Map<String, Object> c;

    private n61(String str, s81 s81, Map<String, Object> map) {
        str.getClass();
        this.a = str;
        s81.getClass();
        this.b = s81;
        this.c = ImmutableMap.copyOf(map);
    }

    public static n61 b(String str, s81 s81) {
        return new n61(str, s81, ImmutableMap.of());
    }

    public static n61 c(String str, s81 s81, Map<String, Object> map) {
        return new n61(str, s81, map);
    }

    public Map<String, Object> a() {
        return this.c;
    }

    public s81 d() {
        return this.b;
    }

    public String e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n61)) {
            return false;
        }
        n61 n61 = (n61) obj;
        if (!rw.equal(this.a, n61.a) || !rw.equal(this.b, n61.b) || !rw.equal(this.c, n61.c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }
}
