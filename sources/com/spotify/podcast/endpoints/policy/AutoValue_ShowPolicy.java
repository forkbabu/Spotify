package com.spotify.podcast.endpoints.policy;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.podcast.endpoints.policy.ShowPolicy;

final class AutoValue_ShowPolicy extends ShowPolicy {
    private final ShowDecorationPolicy listDecorationPolicy;

    /* access modifiers changed from: package-private */
    public static final class b implements ShowPolicy.a {
        private ShowDecorationPolicy a;

        b() {
        }

        @Override // com.spotify.podcast.endpoints.policy.ShowPolicy.a
        public ShowPolicy.a a(ShowDecorationPolicy showDecorationPolicy) {
            this.a = showDecorationPolicy;
            return this;
        }

        @Override // com.spotify.podcast.endpoints.policy.ShowPolicy.a
        public ShowPolicy build() {
            return new AutoValue_ShowPolicy(this.a);
        }

        b(ShowPolicy showPolicy, a aVar) {
            this.a = showPolicy.listDecorationPolicy();
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ShowPolicy)) {
            return false;
        }
        ShowDecorationPolicy showDecorationPolicy = this.listDecorationPolicy;
        ShowDecorationPolicy listDecorationPolicy2 = ((ShowPolicy) obj).listDecorationPolicy();
        if (showDecorationPolicy != null) {
            return showDecorationPolicy.equals(listDecorationPolicy2);
        }
        if (listDecorationPolicy2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        ShowDecorationPolicy showDecorationPolicy = this.listDecorationPolicy;
        return (showDecorationPolicy == null ? 0 : showDecorationPolicy.hashCode()) ^ 1000003;
    }

    @Override // com.spotify.podcast.endpoints.policy.ShowPolicy
    @JsonProperty("policy")
    public ShowDecorationPolicy listDecorationPolicy() {
        return this.listDecorationPolicy;
    }

    @Override // com.spotify.podcast.endpoints.policy.ShowPolicy
    public ShowPolicy.a toBuilder() {
        return new b(this, null);
    }

    public String toString() {
        StringBuilder V0 = je.V0("ShowPolicy{listDecorationPolicy=");
        V0.append(this.listDecorationPolicy);
        V0.append("}");
        return V0.toString();
    }

    private AutoValue_ShowPolicy(ShowDecorationPolicy showDecorationPolicy) {
        this.listDecorationPolicy = showDecorationPolicy;
    }
}
