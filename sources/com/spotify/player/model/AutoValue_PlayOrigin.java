package com.spotify.player.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.ImmutableSet;
import com.spotify.player.model.PlayOrigin;
import java.util.Collection;
import java.util.Set;

final class AutoValue_PlayOrigin extends PlayOrigin {
    private final String deviceIdentifier;
    private final String externalReferrer;
    private final ImmutableSet<String> featureClasses;
    private final String featureIdentifier;
    private final String featureVersion;
    private final String referrerIdentifier;
    private final String viewUri;

    /* access modifiers changed from: package-private */
    public static final class Builder extends PlayOrigin.Builder {
        private String deviceIdentifier;
        private String externalReferrer;
        private ImmutableSet<String> featureClasses;
        private String featureIdentifier;
        private String featureVersion;
        private String referrerIdentifier;
        private String viewUri;

        @Override // com.spotify.player.model.PlayOrigin.Builder
        public PlayOrigin build() {
            String str = this.featureIdentifier == null ? " featureIdentifier" : "";
            if (this.featureVersion == null) {
                str = je.x0(str, " featureVersion");
            }
            if (this.viewUri == null) {
                str = je.x0(str, " viewUri");
            }
            if (this.externalReferrer == null) {
                str = je.x0(str, " externalReferrer");
            }
            if (this.referrerIdentifier == null) {
                str = je.x0(str, " referrerIdentifier");
            }
            if (this.deviceIdentifier == null) {
                str = je.x0(str, " deviceIdentifier");
            }
            if (this.featureClasses == null) {
                str = je.x0(str, " featureClasses");
            }
            if (str.isEmpty()) {
                return new AutoValue_PlayOrigin(this.featureIdentifier, this.featureVersion, this.viewUri, this.externalReferrer, this.referrerIdentifier, this.deviceIdentifier, this.featureClasses);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.player.model.PlayOrigin.Builder
        public PlayOrigin.Builder deviceIdentifier(String str) {
            if (str != null) {
                this.deviceIdentifier = str;
                return this;
            }
            throw new NullPointerException("Null deviceIdentifier");
        }

        @Override // com.spotify.player.model.PlayOrigin.Builder
        public PlayOrigin.Builder externalReferrer(String str) {
            if (str != null) {
                this.externalReferrer = str;
                return this;
            }
            throw new NullPointerException("Null externalReferrer");
        }

        @Override // com.spotify.player.model.PlayOrigin.Builder
        public PlayOrigin.Builder featureClasses(Set<String> set) {
            this.featureClasses = ImmutableSet.copyOf((Collection) set);
            return this;
        }

        @Override // com.spotify.player.model.PlayOrigin.Builder
        public PlayOrigin.Builder featureIdentifier(String str) {
            if (str != null) {
                this.featureIdentifier = str;
                return this;
            }
            throw new NullPointerException("Null featureIdentifier");
        }

        @Override // com.spotify.player.model.PlayOrigin.Builder
        public PlayOrigin.Builder featureVersion(String str) {
            if (str != null) {
                this.featureVersion = str;
                return this;
            }
            throw new NullPointerException("Null featureVersion");
        }

        @Override // com.spotify.player.model.PlayOrigin.Builder
        public PlayOrigin.Builder referrerIdentifier(String str) {
            if (str != null) {
                this.referrerIdentifier = str;
                return this;
            }
            throw new NullPointerException("Null referrerIdentifier");
        }

        @Override // com.spotify.player.model.PlayOrigin.Builder
        public PlayOrigin.Builder viewUri(String str) {
            if (str != null) {
                this.viewUri = str;
                return this;
            }
            throw new NullPointerException("Null viewUri");
        }

        Builder() {
        }

        private Builder(PlayOrigin playOrigin) {
            this.featureIdentifier = playOrigin.featureIdentifier();
            this.featureVersion = playOrigin.featureVersion();
            this.viewUri = playOrigin.viewUri();
            this.externalReferrer = playOrigin.externalReferrer();
            this.referrerIdentifier = playOrigin.referrerIdentifier();
            this.deviceIdentifier = playOrigin.deviceIdentifier();
            this.featureClasses = playOrigin.featureClasses();
        }
    }

    @Override // com.spotify.player.model.PlayOrigin
    @JsonProperty("device_identifier")
    public String deviceIdentifier() {
        return this.deviceIdentifier;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PlayOrigin)) {
            return false;
        }
        PlayOrigin playOrigin = (PlayOrigin) obj;
        if (!this.featureIdentifier.equals(playOrigin.featureIdentifier()) || !this.featureVersion.equals(playOrigin.featureVersion()) || !this.viewUri.equals(playOrigin.viewUri()) || !this.externalReferrer.equals(playOrigin.externalReferrer()) || !this.referrerIdentifier.equals(playOrigin.referrerIdentifier()) || !this.deviceIdentifier.equals(playOrigin.deviceIdentifier()) || !this.featureClasses.equals(playOrigin.featureClasses())) {
            return false;
        }
        return true;
    }

    @Override // com.spotify.player.model.PlayOrigin
    @JsonProperty("external_referrer")
    public String externalReferrer() {
        return this.externalReferrer;
    }

    @Override // com.spotify.player.model.PlayOrigin
    @JsonProperty("feature_classes")
    public ImmutableSet<String> featureClasses() {
        return this.featureClasses;
    }

    @Override // com.spotify.player.model.PlayOrigin
    @JsonProperty("feature_identifier")
    public String featureIdentifier() {
        return this.featureIdentifier;
    }

    @Override // com.spotify.player.model.PlayOrigin
    @JsonProperty("feature_version")
    public String featureVersion() {
        return this.featureVersion;
    }

    public int hashCode() {
        return ((((((((((((this.featureIdentifier.hashCode() ^ 1000003) * 1000003) ^ this.featureVersion.hashCode()) * 1000003) ^ this.viewUri.hashCode()) * 1000003) ^ this.externalReferrer.hashCode()) * 1000003) ^ this.referrerIdentifier.hashCode()) * 1000003) ^ this.deviceIdentifier.hashCode()) * 1000003) ^ this.featureClasses.hashCode();
    }

    @Override // com.spotify.player.model.PlayOrigin
    @JsonProperty("referrer_identifier")
    public String referrerIdentifier() {
        return this.referrerIdentifier;
    }

    @Override // com.spotify.player.model.PlayOrigin
    public PlayOrigin.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        StringBuilder V0 = je.V0("PlayOrigin{featureIdentifier=");
        V0.append(this.featureIdentifier);
        V0.append(", featureVersion=");
        V0.append(this.featureVersion);
        V0.append(", viewUri=");
        V0.append(this.viewUri);
        V0.append(", externalReferrer=");
        V0.append(this.externalReferrer);
        V0.append(", referrerIdentifier=");
        V0.append(this.referrerIdentifier);
        V0.append(", deviceIdentifier=");
        V0.append(this.deviceIdentifier);
        V0.append(", featureClasses=");
        V0.append(this.featureClasses);
        V0.append("}");
        return V0.toString();
    }

    @Override // com.spotify.player.model.PlayOrigin
    @JsonProperty("view_uri")
    public String viewUri() {
        return this.viewUri;
    }

    private AutoValue_PlayOrigin(String str, String str2, String str3, String str4, String str5, String str6, ImmutableSet<String> immutableSet) {
        this.featureIdentifier = str;
        this.featureVersion = str2;
        this.viewUri = str3;
        this.externalReferrer = str4;
        this.referrerIdentifier = str5;
        this.deviceIdentifier = str6;
        this.featureClasses = immutableSet;
    }
}
