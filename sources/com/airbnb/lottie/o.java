package com.airbnb.lottie;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class o {
    private boolean a = false;
    private final Set<a> b = new o1();
    private final Map<String, ce> c = new HashMap();

    public interface a {
        void a(float f);
    }

    public void a(String str, float f) {
        if (this.a) {
            ce ceVar = this.c.get(str);
            if (ceVar == null) {
                ceVar = new ce();
                this.c.put(str, ceVar);
            }
            ceVar.a(f);
            if (str.equals("__container")) {
                for (a aVar : this.b) {
                    aVar.a(f);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void b(boolean z) {
        this.a = z;
    }
}
