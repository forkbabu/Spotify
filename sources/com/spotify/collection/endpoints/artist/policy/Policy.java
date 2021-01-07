package com.spotify.collection.endpoints.artist.policy;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

@JsonInclude(JsonInclude.Include.NON_NULL)
public final class Policy implements JacksonModel {
    private final a policy;

    public Policy() {
        this(null, 1, null);
    }

    public Policy(@JsonProperty("policy") a aVar) {
        this.policy = aVar;
    }

    public static /* synthetic */ Policy copy$default(Policy policy2, a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = policy2.policy;
        }
        return policy2.copy(aVar);
    }

    public final a component1() {
        return this.policy;
    }

    public final Policy copy(@JsonProperty("policy") a aVar) {
        return new Policy(aVar);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof Policy) && h.a(this.policy, ((Policy) obj).policy);
        }
        return true;
    }

    public final a getPolicy() {
        return this.policy;
    }

    public int hashCode() {
        a aVar = this.policy;
        if (aVar != null) {
            return aVar.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder V0 = je.V0("Policy(policy=");
        V0.append(this.policy);
        V0.append(")");
        return V0.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Policy(a aVar, int i, f fVar) {
        this((i & 1) != 0 ? null : aVar);
    }
}
