package defpackage;

import java.util.IdentityHashMap;

/* renamed from: r61  reason: default package */
public class r61 {
    private final w51 a;
    private final IdentityHashMap<s81, v61> b = new IdentityHashMap<>();
    private final IdentityHashMap<s81, s81> c = new IdentityHashMap<>();

    r61(w51 w51) {
        this.a = w51;
    }

    public void a() {
        this.b.clear();
        this.c.clear();
    }

    public v61 b(s81 s81) {
        IdentityHashMap<s81, v61> identityHashMap = this.b;
        s81.getClass();
        v61 v61 = identityHashMap.get(s81);
        if (v61 != null) {
            return v61;
        }
        v61 c2 = v61.c(s81, this.a);
        this.b.put(s81, c2);
        this.c.put(c2.b(), s81);
        return c2;
    }

    public s81 c(s81 s81) {
        IdentityHashMap<s81, s81> identityHashMap = this.c;
        s81.getClass();
        return identityHashMap.get(s81);
    }

    public s81 d(s81 s81) {
        IdentityHashMap<s81, s81> identityHashMap = this.c;
        s81.getClass();
        s81 s812 = identityHashMap.get(s81);
        if (s812 != null) {
            return s812;
        }
        throw new IllegalArgumentException(je.y0("Model ", s81.id() != null ? s81.id() : s81.toString(), " not resolved"));
    }
}
