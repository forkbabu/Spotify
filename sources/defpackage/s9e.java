package defpackage;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/* renamed from: s9e  reason: default package */
final class s9e extends u9e {
    private final List<t9e> a;

    s9e(List<t9e> list) {
        if (list != null) {
            this.a = list;
            return;
        }
        throw new NullPointerException("Null destinations");
    }

    @Override // defpackage.u9e
    @JsonProperty("destinations")
    public List<t9e> destinations() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof u9e) {
            return this.a.equals(((u9e) obj).destinations());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        return je.L0(je.V0("ShareDestinationsResponse{destinations="), this.a, "}");
    }
}
