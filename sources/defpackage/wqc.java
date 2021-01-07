package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.h;

/* renamed from: wqc  reason: default package */
public final class wqc {
    private final Map<Class<? extends uqc>, Map<Class<? extends uqc>, krc>> a;

    /* renamed from: wqc$a */
    public static final class a {
        private final Map<Class<? extends uqc>, Map<Class<? extends uqc>, krc>> a = new LinkedHashMap();

        public final a a(Class<? extends uqc> cls, Class<? extends uqc> cls2, krc krc) {
            h.e(cls, "fromState");
            h.e(cls2, "toState");
            h.e(krc, "transition");
            Map<Class<? extends uqc>, krc> map = this.a.get(cls);
            if (map == null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put(cls2, krc);
                this.a.put(cls, linkedHashMap);
            } else {
                map.put(cls2, krc);
            }
            return this;
        }

        public final Map<Class<? extends uqc>, Map<Class<? extends uqc>, krc>> b() {
            return this.a;
        }
    }

    public wqc(a aVar) {
        h.e(aVar, "builder");
        this.a = aVar.b();
    }

    public final krc a(uqc uqc, uqc uqc2) {
        h.e(uqc, "fromState");
        h.e(uqc2, "toState");
        Map<Class<? extends uqc>, krc> map = this.a.get(uqc.getClass());
        if (map != null) {
            return map.get(uqc2.getClass());
        }
        return null;
    }
}
