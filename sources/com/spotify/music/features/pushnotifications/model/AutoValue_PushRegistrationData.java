package com.spotify.music.features.pushnotifications.model;

/* access modifiers changed from: package-private */
public final class AutoValue_PushRegistrationData extends PushRegistrationData {
    private final String appId;
    private final String environment;
    private final boolean firebase;
    private final String osVersion;
    private final String platform;
    private final String token;

    AutoValue_PushRegistrationData(String str, String str2, String str3, boolean z, String str4, String str5) {
        if (str != null) {
            this.environment = str;
            if (str2 != null) {
                this.platform = str2;
                if (str3 != null) {
                    this.token = str3;
                    this.firebase = z;
                    if (str4 != null) {
                        this.appId = str4;
                        if (str5 != null) {
                            this.osVersion = str5;
                            return;
                        }
                        throw new NullPointerException("Null osVersion");
                    }
                    throw new NullPointerException("Null appId");
                }
                throw new NullPointerException("Null token");
            }
            throw new NullPointerException("Null platform");
        }
        throw new NullPointerException("Null environment");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PushRegistrationData)) {
            return false;
        }
        PushRegistrationData pushRegistrationData = (PushRegistrationData) obj;
        if (!this.environment.equals(pushRegistrationData.getEnvironment()) || !this.platform.equals(pushRegistrationData.getPlatform()) || !this.token.equals(pushRegistrationData.getToken()) || this.firebase != pushRegistrationData.isFirebase() || !this.appId.equals(pushRegistrationData.getAppId()) || !this.osVersion.equals(pushRegistrationData.getOsVersion())) {
            return false;
        }
        return true;
    }

    @Override // com.spotify.music.features.pushnotifications.model.PushRegistrationData
    public String getAppId() {
        return this.appId;
    }

    @Override // com.spotify.music.features.pushnotifications.model.PushRegistrationData
    public String getEnvironment() {
        return this.environment;
    }

    @Override // com.spotify.music.features.pushnotifications.model.PushRegistrationData
    public String getOsVersion() {
        return this.osVersion;
    }

    @Override // com.spotify.music.features.pushnotifications.model.PushRegistrationData
    public String getPlatform() {
        return this.platform;
    }

    @Override // com.spotify.music.features.pushnotifications.model.PushRegistrationData
    public String getToken() {
        return this.token;
    }

    public int hashCode() {
        return ((((((((((this.environment.hashCode() ^ 1000003) * 1000003) ^ this.platform.hashCode()) * 1000003) ^ this.token.hashCode()) * 1000003) ^ (this.firebase ? 1231 : 1237)) * 1000003) ^ this.appId.hashCode()) * 1000003) ^ this.osVersion.hashCode();
    }

    @Override // com.spotify.music.features.pushnotifications.model.PushRegistrationData
    public boolean isFirebase() {
        return this.firebase;
    }

    public String toString() {
        StringBuilder V0 = je.V0("PushRegistrationData{environment=");
        V0.append(this.environment);
        V0.append(", platform=");
        V0.append(this.platform);
        V0.append(", token=");
        V0.append(this.token);
        V0.append(", firebase=");
        V0.append(this.firebase);
        V0.append(", appId=");
        V0.append(this.appId);
        V0.append(", osVersion=");
        return je.I0(V0, this.osVersion, "}");
    }
}
