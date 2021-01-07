package defpackage;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.jvm.internal.h;

/* renamed from: hrd  reason: default package */
public final class hrd {
    private final List<grd> a;

    public hrd(@JsonProperty("resources") List<grd> list) {
        h.e(list, "resources");
        this.a = list;
    }

    public final List<grd> a() {
        return this.a;
    }

    public final hrd copy(@JsonProperty("resources") List<grd> list) {
        h.e(list, "resources");
        return new hrd(list);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof hrd) && h.a(this.a, ((hrd) obj).a);
        }
        return true;
    }

    public int hashCode() {
        List<grd> list = this.a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public String toString() {
        return je.L0(je.V0("OfflineResourcesResponse(resources="), this.a, ")");
    }
}
