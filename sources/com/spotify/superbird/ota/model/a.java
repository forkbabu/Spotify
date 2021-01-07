package com.spotify.superbird.ota.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

final class a extends e {
    private final boolean a;
    private final List<g> b;
    private final List<String> c;

    a(boolean z, List<g> list, List<String> list2) {
        this.a = z;
        if (list != null) {
            this.b = list;
            if (list2 != null) {
                this.c = list2;
                return;
            }
            throw new NullPointerException("Null errors");
        }
        throw new NullPointerException("Null results");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.a != eVar.success() || !this.b.equals(eVar.results()) || !this.c.equals(eVar.errors())) {
            return false;
        }
        return true;
    }

    @Override // com.spotify.superbird.ota.model.e
    @JsonProperty("errors")
    public List<String> errors() {
        return this.c;
    }

    public int hashCode() {
        return (((((this.a ? 1231 : 1237) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    @Override // com.spotify.superbird.ota.model.e
    @JsonProperty("result")
    public List<g> results() {
        return this.b;
    }

    @Override // com.spotify.superbird.ota.model.e
    @JsonProperty("success")
    public boolean success() {
        return this.a;
    }

    public String toString() {
        StringBuilder V0 = je.V0("CheckForUpdatesResponse{success=");
        V0.append(this.a);
        V0.append(", results=");
        V0.append(this.b);
        V0.append(", errors=");
        return je.L0(V0, this.c, "}");
    }
}
