package com.spotify.podcast.endpoints.policy;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.google.common.collect.ImmutableMap;
import com.spotify.podcast.endpoints.policy.KeyValuePolicy;

final class AutoValue_KeyValuePolicy extends KeyValuePolicy {
    private final ImmutableMap<String, Boolean> attributes;

    /* access modifiers changed from: package-private */
    public static final class b implements KeyValuePolicy.a {
        private ImmutableMap<String, Boolean> a;

        b() {
        }

        @Override // com.spotify.podcast.endpoints.policy.KeyValuePolicy.a
        public KeyValuePolicy.a a(ImmutableMap<String, Boolean> immutableMap) {
            this.a = immutableMap;
            return this;
        }

        @Override // com.spotify.podcast.endpoints.policy.KeyValuePolicy.a
        public KeyValuePolicy build() {
            return new AutoValue_KeyValuePolicy(this.a);
        }

        b(KeyValuePolicy keyValuePolicy, a aVar) {
            this.a = keyValuePolicy.attributes();
        }
    }

    @Override // com.spotify.podcast.endpoints.policy.KeyValuePolicy
    @JsonAnyGetter
    public ImmutableMap<String, Boolean> attributes() {
        return this.attributes;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof KeyValuePolicy)) {
            return false;
        }
        ImmutableMap<String, Boolean> immutableMap = this.attributes;
        ImmutableMap<String, Boolean> attributes2 = ((KeyValuePolicy) obj).attributes();
        if (immutableMap != null) {
            return immutableMap.equals(attributes2);
        }
        if (attributes2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        ImmutableMap<String, Boolean> immutableMap = this.attributes;
        return (immutableMap == null ? 0 : immutableMap.hashCode()) ^ 1000003;
    }

    @Override // com.spotify.podcast.endpoints.policy.KeyValuePolicy
    public KeyValuePolicy.a toBuilder() {
        return new b(this, null);
    }

    public String toString() {
        StringBuilder V0 = je.V0("KeyValuePolicy{attributes=");
        V0.append(this.attributes);
        V0.append("}");
        return V0.toString();
    }

    private AutoValue_KeyValuePolicy(ImmutableMap<String, Boolean> immutableMap) {
        this.attributes = immutableMap;
    }
}
