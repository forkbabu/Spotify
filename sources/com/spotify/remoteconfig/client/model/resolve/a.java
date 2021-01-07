package com.spotify.remoteconfig.client.model.resolve;

import com.spotify.rcs.model.GranularConfiguration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.d;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public final class a {
    private final String a;
    private final long b;
    private final List<AssignedPropertyValue> c;

    /* renamed from: com.spotify.remoteconfig.client.model.resolve.a$a  reason: collision with other inner class name */
    public static final class C0384a {
        public static final a a() {
            return new a((String) null, 0, (List) null, 7);
        }
    }

    public a(String str, long j, List list, f fVar) {
        this.a = str;
        this.b = j;
        this.c = list;
    }

    public static final a a(List<AssignedPropertyValue> list) {
        h.f(list, "properties");
        return new a((String) null, 0, list, 3);
    }

    public static final a b(GranularConfiguration granularConfiguration) {
        h.f(granularConfiguration, "protoConfiguration");
        List<GranularConfiguration.AssignedPropertyValue> n = granularConfiguration.n();
        h.b(n, "protoConfiguration.propertiesList");
        ArrayList arrayList = new ArrayList(d.e(n, 10));
        for (T t : n) {
            h.b(t, "it");
            arrayList.add(AssignedPropertyValue.a(t));
        }
        String m = granularConfiguration.m();
        h.b(m, "protoConfiguration.configurationAssignmentId");
        return new a(m, granularConfiguration.o(), arrayList, (f) null);
    }

    public final String c() {
        return this.a;
    }

    public final List<AssignedPropertyValue> d() {
        return this.c;
    }

    public final long e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return h.a(this.a, aVar.a) && this.b == aVar.b && h.a(this.c, aVar.c);
    }

    public final byte[] f() {
        GranularConfiguration.b p = GranularConfiguration.p();
        p.n(this.a);
        p.o(this.b);
        List<AssignedPropertyValue> list = this.c;
        ArrayList arrayList = new ArrayList(d.e(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().i());
        }
        p.m(arrayList);
        byte[] byteArray = ((GranularConfiguration) p.build()).toByteArray();
        h.b(byteArray, "GranularConfigurationPro…()\n        .toByteArray()");
        return byteArray;
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + e.a(this.b)) * 31;
        List<AssignedPropertyValue> list = this.c;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("GranularConfiguration(configurationAssignmentId=");
        V0.append(this.a);
        V0.append(", rcsFetchTime=");
        V0.append(this.b);
        V0.append(", propertiesList=");
        return je.L0(V0, this.c, ")");
    }

    a(String str, long j, List list, int i) {
        String str2 = (i & 1) != 0 ? "" : null;
        j = (i & 2) != 0 ? -1 : j;
        list = (i & 4) != 0 ? EmptyList.a : list;
        this.a = str2;
        this.b = j;
        this.c = list;
    }
}
