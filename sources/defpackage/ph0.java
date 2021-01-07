package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

/* renamed from: ph0  reason: default package */
public final class ph0 {
    private final Map<String, String> a;
    private final Boolean b;
    private final Boolean c;
    private final int d;

    public ph0(Boolean bool, Boolean bool2, int i) {
        this.b = bool;
        this.c = bool2;
        this.d = i;
        ArrayList arrayList = new ArrayList();
        a(arrayList, "playable", bool);
        a(arrayList, "availableOffline", bool2);
        this.a = d.s(new Pair("updateThrottling", String.valueOf(i)), new Pair("responseFormat", "protobuf"), new Pair("filter", d.p(arrayList, ",", null, null, 0, null, null, 62, null)));
    }

    private final <T> void a(List<String> list, String str, T t) {
        if (t != null) {
            list.add(str + " eq " + ((Object) t));
        }
    }

    public final Map<String, String> b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ph0)) {
            return false;
        }
        ph0 ph0 = (ph0) obj;
        return h.a(this.b, ph0.b) && h.a(this.c, ph0.c) && this.d == ph0.d;
    }

    public int hashCode() {
        Boolean bool = this.b;
        int i = 0;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        Boolean bool2 = this.c;
        if (bool2 != null) {
            i = bool2.hashCode();
        }
        return ((hashCode + i) * 31) + this.d;
    }

    public String toString() {
        StringBuilder V0 = je.V0("CollectionMetadataEndpointConfiguration(isPlayableOnly=");
        V0.append(this.b);
        V0.append(", isAvailableOfflineOnly=");
        V0.append(this.c);
        V0.append(", updateThrottling=");
        return je.B0(V0, this.d, ")");
    }

    public ph0() {
        this(null, null, 500);
    }
}
