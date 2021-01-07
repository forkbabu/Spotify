package com.spotify.packagevalidator.denylist.data;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Set;

/* access modifiers changed from: package-private */
public final class AutoValue_AndroidDenylist extends AndroidDenylist {
    private final Set<String> appSignatures;
    private final Set<String> packageNames;

    AutoValue_AndroidDenylist(Set<String> set, Set<String> set2) {
        if (set != null) {
            this.packageNames = set;
            if (set2 != null) {
                this.appSignatures = set2;
                return;
            }
            throw new NullPointerException("Null appSignatures");
        }
        throw new NullPointerException("Null packageNames");
    }

    @Override // com.spotify.packagevalidator.denylist.data.AndroidDenylist
    @JsonProperty("app_signatures")
    public Set<String> appSignatures() {
        return this.appSignatures;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AndroidDenylist)) {
            return false;
        }
        AndroidDenylist androidDenylist = (AndroidDenylist) obj;
        if (!this.packageNames.equals(androidDenylist.packageNames()) || !this.appSignatures.equals(androidDenylist.appSignatures())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.packageNames.hashCode() ^ 1000003) * 1000003) ^ this.appSignatures.hashCode();
    }

    @Override // com.spotify.packagevalidator.denylist.data.AndroidDenylist
    @JsonProperty("package_names")
    public Set<String> packageNames() {
        return this.packageNames;
    }

    public String toString() {
        StringBuilder V0 = je.V0("AndroidDenylist{packageNames=");
        V0.append(this.packageNames);
        V0.append(", appSignatures=");
        V0.append(this.appSignatures);
        V0.append("}");
        return V0.toString();
    }
}
