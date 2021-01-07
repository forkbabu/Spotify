package defpackage;

import com.google.common.base.Optional;
import java.util.Map;

/* renamed from: n7b  reason: default package */
public class n7b extends s7b {
    private final Optional<Integer> d;

    public n7b(String str, Map<String, String> map, pz0 pz0) {
        super(str, map, pz0);
        this.d = pz0.e(map);
    }

    public Optional<Integer> e() {
        return this.d;
    }
}
