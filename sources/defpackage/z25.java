package defpackage;

import java.util.List;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
/* renamed from: z25  reason: default package */
public final class z25 {
    private final int a;
    private final List<j25> b;

    public z25(int i, List<j25> list) {
        h.e(list, "updatedArtists");
        this.a = i;
        this.b = list;
    }

    public final int a() {
        return this.a;
    }

    public final List<j25> b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z25)) {
            return false;
        }
        z25 z25 = (z25) obj;
        return this.a == z25.a && h.a(this.b, z25.b);
    }

    public int hashCode() {
        int i = this.a * 31;
        List<j25> list = this.b;
        return i + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder V0 = je.V0("RemoveArtistResult(removedArtistPosition=");
        V0.append(this.a);
        V0.append(", updatedArtists=");
        return je.L0(V0, this.b, ")");
    }
}
