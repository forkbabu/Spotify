package defpackage;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: m35  reason: default package */
public final class m35 {
    private final boolean a;

    public m35(@JsonProperty("has_new_items") boolean z) {
        this.a = z;
    }

    public final boolean a() {
        return this.a;
    }

    public final m35 copy(@JsonProperty("has_new_items") boolean z) {
        return new m35(z);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof m35) && this.a == ((m35) obj).a;
        }
        return true;
    }

    public int hashCode() {
        boolean z = this.a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        return je.P0(je.V0("HasNewItemsResponse(hasNewItems="), this.a, ")");
    }
}
