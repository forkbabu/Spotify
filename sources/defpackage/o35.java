package defpackage;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.jvm.internal.h;

/* renamed from: o35  reason: default package */
public final class o35 {
    private final List<j35> a;
    private final List<String> b;

    public o35(@JsonProperty("insertions") List<j35> list, @JsonProperty("delete_item_ids") List<String> list2) {
        h.e(list, "insertions");
        this.a = list;
        this.b = list2;
    }

    public final List<j35> a() {
        return this.a;
    }

    public final o35 copy(@JsonProperty("insertions") List<j35> list, @JsonProperty("delete_item_ids") List<String> list2) {
        h.e(list, "insertions");
        return new o35(list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o35)) {
            return false;
        }
        o35 o35 = (o35) obj;
        return h.a(this.a, o35.a) && h.a(this.b, o35.b);
    }

    public int hashCode() {
        List<j35> list = this.a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<String> list2 = this.b;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("Mutations(insertions=");
        V0.append(this.a);
        V0.append(", deleteItemIds=");
        return je.L0(V0, this.b, ")");
    }
}
