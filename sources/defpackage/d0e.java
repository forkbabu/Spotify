package defpackage;

import com.spotify.remoteconfig.client.model.resolve.AssignedPropertyValue;
import com.spotify.remoteconfig.client.model.resolve.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.d;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

/* renamed from: d0e  reason: default package */
public final class d0e {
    private static final d0e c = a.a(a.C0384a.a());
    public static final a d = null;
    private final com.spotify.remoteconfig.client.model.resolve.a a;
    private final Map<String, AssignedPropertyValue> b;

    /* renamed from: d0e$a */
    public static final class a {
        public static final d0e a(com.spotify.remoteconfig.client.model.resolve.a aVar) {
            h.f(aVar, "configuration");
            List<AssignedPropertyValue> d = aVar.d();
            int w = d.w(d.e(d, 10));
            if (w < 16) {
                w = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(w);
            for (T t : d) {
                T t2 = t;
                h.f(t2, "property");
                linkedHashMap.put(t2.c() + ':' + t2.g(), t);
            }
            return new d0e(aVar, linkedHashMap, null);
        }
    }

    public d0e(com.spotify.remoteconfig.client.model.resolve.a aVar, Map map, f fVar) {
        this.a = aVar;
        this.b = map;
    }

    public static final d0e b(com.spotify.remoteconfig.client.model.resolve.a aVar) {
        h.f(aVar, "configuration");
        List<AssignedPropertyValue> d2 = aVar.d();
        int w = d.w(d.e(d2, 10));
        if (w < 16) {
            w = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(w);
        for (T t : d2) {
            T t2 = t;
            h.f(t2, "property");
            linkedHashMap.put(t2.c() + ':' + t2.g(), t);
        }
        return new d0e(aVar, linkedHashMap, null);
    }

    public final com.spotify.remoteconfig.client.model.resolve.a c() {
        return this.a;
    }

    public final String d() {
        return this.a.c();
    }

    public final Set<Integer> e() {
        Collection<AssignedPropertyValue> values = this.b.values();
        ArrayList arrayList = new ArrayList(d.e(values, 10));
        Iterator<T> it = values.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf((int) it.next().e()));
        }
        return d.Z(arrayList);
    }

    public final Map<String, AssignedPropertyValue> f() {
        return this.b;
    }

    public final long g() {
        if (h()) {
            return -1;
        }
        return this.a.e();
    }

    public final boolean h() {
        return e().isEmpty();
    }

    public final <T extends n0e> T i(o0e<T> o0e) {
        h.f(o0e, "typeFactory");
        Set Z = d.Z(this.b.values());
        h.f(Z, "properties");
        int w = d.w(d.e(Z, 10));
        if (w < 16) {
            w = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(w);
        for (Object obj : Z) {
            AssignedPropertyValue assignedPropertyValue = (AssignedPropertyValue) obj;
            String c2 = assignedPropertyValue.c();
            String g = assignedPropertyValue.g();
            linkedHashMap.put(c2 + '.' + g, obj);
        }
        return o0e.a(new i0e(linkedHashMap, null));
    }
}
