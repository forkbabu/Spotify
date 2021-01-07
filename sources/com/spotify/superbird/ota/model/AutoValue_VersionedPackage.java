package com.spotify.superbird.ota.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/* access modifiers changed from: package-private */
public final class AutoValue_VersionedPackage extends VersionedPackage {
    private final String packageName;
    private final String version;

    AutoValue_VersionedPackage(String str, String str2) {
        if (str != null) {
            this.packageName = str;
            if (str2 != null) {
                this.version = str2;
                return;
            }
            throw new NullPointerException("Null version");
        }
        throw new NullPointerException("Null packageName");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VersionedPackage)) {
            return false;
        }
        VersionedPackage versionedPackage = (VersionedPackage) obj;
        if (!this.packageName.equals(versionedPackage.packageName()) || !this.version.equals(versionedPackage.version())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.packageName.hashCode() ^ 1000003) * 1000003) ^ this.version.hashCode();
    }

    @Override // com.spotify.superbird.ota.model.VersionedPackage
    @JsonProperty("name")
    public String packageName() {
        return this.packageName;
    }

    public String toString() {
        StringBuilder V0 = je.V0("VersionedPackage{packageName=");
        V0.append(this.packageName);
        V0.append(", version=");
        return je.I0(V0, this.version, "}");
    }

    @Override // com.spotify.superbird.ota.model.VersionedPackage
    @JsonProperty("version")
    public String version() {
        return this.version;
    }
}
