package com.spotify.player.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.ImmutableSet;

/* access modifiers changed from: package-private */
public final class AutoValue_Suppressions extends Suppressions {
    private final ImmutableSet<String> providers;

    AutoValue_Suppressions(ImmutableSet<String> immutableSet) {
        if (immutableSet != null) {
            this.providers = immutableSet;
            return;
        }
        throw new NullPointerException("Null providers");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Suppressions) {
            return this.providers.equals(((Suppressions) obj).providers());
        }
        return false;
    }

    public int hashCode() {
        return this.providers.hashCode() ^ 1000003;
    }

    @Override // com.spotify.player.model.Suppressions
    @JsonProperty("providers")
    public ImmutableSet<String> providers() {
        return this.providers;
    }

    public String toString() {
        StringBuilder V0 = je.V0("Suppressions{providers=");
        V0.append(this.providers);
        V0.append("}");
        return V0.toString();
    }
}
