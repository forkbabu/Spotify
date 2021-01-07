package libs.encore.consumer.components.promo.api.wrapped;

import kotlin.jvm.internal.h;

public final class b {
    private final String a;
    private final String b;

    public b(String str, String str2) {
        h.e(str, "title");
        h.e(str2, "description");
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return h.a(this.a, bVar.a) && h.a(this.b, bVar.b);
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("Model(title=");
        V0.append(this.a);
        V0.append(", description=");
        return je.I0(V0, this.b, ")");
    }
}
