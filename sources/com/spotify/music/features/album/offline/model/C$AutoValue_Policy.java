package com.spotify.music.features.album.offline.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.music.features.album.offline.model.Policy;

/* access modifiers changed from: package-private */
/* renamed from: com.spotify.music.features.album.offline.model.$AutoValue_Policy  reason: invalid class name */
public abstract class C$AutoValue_Policy extends Policy {
    private final DecorationPolicy policy;

    /* access modifiers changed from: package-private */
    /* renamed from: com.spotify.music.features.album.offline.model.$AutoValue_Policy$b */
    public static class b implements Policy.a {
        private DecorationPolicy a;

        b() {
        }

        @Override // com.spotify.music.features.album.offline.model.Policy.a
        public Policy.a a(DecorationPolicy decorationPolicy) {
            this.a = decorationPolicy;
            return this;
        }

        @Override // com.spotify.music.features.album.offline.model.Policy.a
        public Policy build() {
            String str = this.a == null ? " policy" : "";
            if (str.isEmpty()) {
                return new AutoValue_Policy(this.a);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        b(Policy policy, a aVar) {
            this.a = policy.policy();
        }
    }

    C$AutoValue_Policy(DecorationPolicy decorationPolicy) {
        if (decorationPolicy != null) {
            this.policy = decorationPolicy;
            return;
        }
        throw new NullPointerException("Null policy");
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Policy) {
            return this.policy.equals(((Policy) obj).policy());
        }
        return false;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return this.policy.hashCode() ^ 1000003;
    }

    @Override // com.spotify.music.features.album.offline.model.Policy
    @JsonProperty("policy")
    public DecorationPolicy policy() {
        return this.policy;
    }

    @Override // com.spotify.music.features.album.offline.model.Policy
    public Policy.a toBuilder() {
        return new b(this, null);
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("Policy{policy=");
        V0.append(this.policy);
        V0.append("}");
        return V0.toString();
    }
}
