package com.spotify.podcast.endpoints.policy;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.podcast.endpoints.policy.Policy;

final class AutoValue_Policy extends Policy {
    private final DecorationPolicy decorationPolicy;

    /* access modifiers changed from: package-private */
    public static final class b implements Policy.a {
        private DecorationPolicy a;

        b() {
        }

        @Override // com.spotify.podcast.endpoints.policy.Policy.a
        public Policy.a a(DecorationPolicy decorationPolicy) {
            this.a = decorationPolicy;
            return this;
        }

        @Override // com.spotify.podcast.endpoints.policy.Policy.a
        public Policy build() {
            return new AutoValue_Policy(this.a);
        }

        b(Policy policy, a aVar) {
            this.a = policy.decorationPolicy();
        }
    }

    @Override // com.spotify.podcast.endpoints.policy.Policy
    @JsonProperty("policy")
    public DecorationPolicy decorationPolicy() {
        return this.decorationPolicy;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Policy)) {
            return false;
        }
        DecorationPolicy decorationPolicy2 = this.decorationPolicy;
        DecorationPolicy decorationPolicy3 = ((Policy) obj).decorationPolicy();
        if (decorationPolicy2 != null) {
            return decorationPolicy2.equals(decorationPolicy3);
        }
        if (decorationPolicy3 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        DecorationPolicy decorationPolicy2 = this.decorationPolicy;
        return (decorationPolicy2 == null ? 0 : decorationPolicy2.hashCode()) ^ 1000003;
    }

    @Override // com.spotify.podcast.endpoints.policy.Policy
    public Policy.a toBuilder() {
        return new b(this, null);
    }

    public String toString() {
        StringBuilder V0 = je.V0("Policy{decorationPolicy=");
        V0.append(this.decorationPolicy);
        V0.append("}");
        return V0.toString();
    }

    private AutoValue_Policy(DecorationPolicy decorationPolicy2) {
        this.decorationPolicy = decorationPolicy2;
    }
}
