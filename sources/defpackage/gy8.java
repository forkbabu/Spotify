package defpackage;

import java.util.HashMap;

/* renamed from: gy8  reason: default package */
class gy8 {
    private final HashMap<String, yda> a = new HashMap<>(1);

    gy8() {
    }

    public yda a(String str) {
        return this.a.get(str);
    }

    public void b(String str, yda yda) {
        this.a.put(str, yda);
    }
}
