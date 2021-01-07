package com.spotify.music.libs.branchintegration.network;

import com.fasterxml.jackson.annotation.JsonGetter;

final class AutoValue_BranchFlag extends BranchFlag {
    private final Boolean branchEnabled;
    private final Boolean branchEnabledAndroid;
    private final Boolean branchEnabledIos;

    AutoValue_BranchFlag(Boolean bool, Boolean bool2, Boolean bool3) {
        if (bool != null) {
            this.branchEnabled = bool;
            if (bool2 != null) {
                this.branchEnabledIos = bool2;
                if (bool3 != null) {
                    this.branchEnabledAndroid = bool3;
                    return;
                }
                throw new NullPointerException("Null branchEnabledAndroid");
            }
            throw new NullPointerException("Null branchEnabledIos");
        }
        throw new NullPointerException("Null branchEnabled");
    }

    @Override // com.spotify.music.libs.branchintegration.network.BranchFlag
    @JsonGetter("branch_enabled")
    public Boolean branchEnabled() {
        return this.branchEnabled;
    }

    @Override // com.spotify.music.libs.branchintegration.network.BranchFlag
    @JsonGetter("branch_enabled_android")
    public Boolean branchEnabledAndroid() {
        return this.branchEnabledAndroid;
    }

    @Override // com.spotify.music.libs.branchintegration.network.BranchFlag
    @JsonGetter("branch_enabled_ios")
    public Boolean branchEnabledIos() {
        return this.branchEnabledIos;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BranchFlag)) {
            return false;
        }
        BranchFlag branchFlag = (BranchFlag) obj;
        if (!this.branchEnabled.equals(branchFlag.branchEnabled()) || !this.branchEnabledIos.equals(branchFlag.branchEnabledIos()) || !this.branchEnabledAndroid.equals(branchFlag.branchEnabledAndroid())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((this.branchEnabled.hashCode() ^ 1000003) * 1000003) ^ this.branchEnabledIos.hashCode()) * 1000003) ^ this.branchEnabledAndroid.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("BranchFlag{branchEnabled=");
        V0.append(this.branchEnabled);
        V0.append(", branchEnabledIos=");
        V0.append(this.branchEnabledIos);
        V0.append(", branchEnabledAndroid=");
        V0.append(this.branchEnabledAndroid);
        V0.append("}");
        return V0.toString();
    }
}
