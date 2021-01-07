package defpackage;

import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.jvm.internal.h;

/* renamed from: k35  reason: default package */
public final class k35 {
    private final o35 a;

    public k35(@JsonProperty("mutations") o35 o35) {
        h.e(o35, "mutations");
        this.a = o35;
    }

    public final o35 a() {
        return this.a;
    }

    public final k35 copy(@JsonProperty("mutations") o35 o35) {
        h.e(o35, "mutations");
        return new k35(o35);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof k35) && h.a(this.a, ((k35) obj).a);
        }
        return true;
    }

    public int hashCode() {
        o35 o35 = this.a;
        if (o35 != null) {
            return o35.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder V0 = je.V0("FeedResponse(mutations=");
        V0.append(this.a);
        V0.append(")");
        return V0.toString();
    }
}
