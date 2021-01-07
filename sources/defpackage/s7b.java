package defpackage;

import com.google.common.base.Optional;
import java.util.Map;

/* renamed from: s7b  reason: default package */
public class s7b {
    private final String a;
    protected final Map<String, String> b;
    private final pz0 c;

    s7b(String str, Map<String, String> map, pz0 pz0) {
        this.a = str;
        this.b = map;
        this.c = pz0;
    }

    public String a() {
        return yz0.a(this.a);
    }

    public Map<String, String> b() {
        return this.b;
    }

    public String c() {
        return this.a;
    }

    public String d() {
        return this.c.a(this.b).or((Optional<String>) "");
    }
}
