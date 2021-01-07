package com.spotify.effortlesslogin.prerequisites;

import com.google.common.base.Optional;

/* access modifiers changed from: package-private */
public final class AutoValue_EffortlessLoginPrerequisitesResult extends EffortlessLoginPrerequisitesResult {
    private final boolean enabled;
    private final Optional<String> fullName;

    AutoValue_EffortlessLoginPrerequisitesResult(boolean z, Optional<String> optional) {
        this.enabled = z;
        if (optional != null) {
            this.fullName = optional;
            return;
        }
        throw new NullPointerException("Null fullName");
    }

    @Override // com.spotify.effortlesslogin.prerequisites.EffortlessLoginPrerequisitesResult
    public boolean enabled() {
        return this.enabled;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EffortlessLoginPrerequisitesResult)) {
            return false;
        }
        EffortlessLoginPrerequisitesResult effortlessLoginPrerequisitesResult = (EffortlessLoginPrerequisitesResult) obj;
        if (this.enabled != effortlessLoginPrerequisitesResult.enabled() || !this.fullName.equals(effortlessLoginPrerequisitesResult.fullName())) {
            return false;
        }
        return true;
    }

    @Override // com.spotify.effortlesslogin.prerequisites.EffortlessLoginPrerequisitesResult
    public Optional<String> fullName() {
        return this.fullName;
    }

    public int hashCode() {
        return (((this.enabled ? 1231 : 1237) ^ 1000003) * 1000003) ^ this.fullName.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("EffortlessLoginPrerequisitesResult{enabled=");
        V0.append(this.enabled);
        V0.append(", fullName=");
        return je.F0(V0, this.fullName, "}");
    }
}
