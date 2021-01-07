package defpackage;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/* renamed from: r9e  reason: default package */
final class r9e extends t9e {
    private final String a;
    private final List<String> b;

    r9e(String str, List<String> list) {
        if (str != null) {
            this.a = str;
            if (list != null) {
                this.b = list;
                return;
            }
            throw new NullPointerException("Null capabilities");
        }
        throw new NullPointerException("Null id");
    }

    @Override // defpackage.t9e
    @JsonProperty("capabilities")
    public List<String> capabilities() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t9e)) {
            return false;
        }
        t9e t9e = (t9e) obj;
        if (!this.a.equals(t9e.id()) || !this.b.equals(t9e.capabilities())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    @Override // defpackage.t9e
    @JsonProperty("id")
    public String id() {
        return this.a;
    }

    public String toString() {
        StringBuilder V0 = je.V0("DestinationResponse{id=");
        V0.append(this.a);
        V0.append(", capabilities=");
        return je.L0(V0, this.b, "}");
    }
}
