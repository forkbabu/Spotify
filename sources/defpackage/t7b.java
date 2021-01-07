package defpackage;

import com.google.common.base.Optional;
import java.util.Map;

/* renamed from: t7b  reason: default package */
public class t7b extends s7b {
    private final String d;
    private final Optional<Integer> e;

    public t7b(String str, Map<String, String> map, pz0 pz0, String str2) {
        super(str, map, pz0);
        this.d = str2;
        this.e = pz0.e(map);
    }

    public String e() {
        return this.d;
    }

    public Optional<Integer> f() {
        return this.e;
    }
}
