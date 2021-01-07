package com.spotify.collection.endpoints.artist.policy;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.jvm.internal.h;

@JsonInclude(JsonInclude.Include.NON_NULL)
public final class a {
    private final ListPolicy a;

    public a(@JsonProperty("list") ListPolicy listPolicy) {
        h.e(listPolicy, "list");
        this.a = listPolicy;
    }

    public final a copy(@JsonProperty("list") ListPolicy listPolicy) {
        h.e(listPolicy, "list");
        return new a(listPolicy);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof a) && h.a(this.a, ((a) obj).a);
        }
        return true;
    }

    public int hashCode() {
        ListPolicy listPolicy = this.a;
        if (listPolicy != null) {
            return listPolicy.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder V0 = je.V0("DecorationPolicy(list=");
        V0.append(this.a);
        V0.append(")");
        return V0.toString();
    }
}
