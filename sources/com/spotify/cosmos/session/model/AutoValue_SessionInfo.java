package com.spotify.cosmos.session.model;

final class AutoValue_SessionInfo extends SessionInfo {
    private final String accessToken;
    private final String locale;
    private final String storedCredentials;
    private final String username;

    AutoValue_SessionInfo(String str, String str2, String str3, String str4) {
        if (str != null) {
            this.username = str;
            this.storedCredentials = str2;
            this.locale = str3;
            this.accessToken = str4;
            return;
        }
        throw new NullPointerException("Null username");
    }

    @Override // com.spotify.cosmos.session.model.SessionInfo
    public String accessToken() {
        return this.accessToken;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SessionInfo)) {
            return false;
        }
        SessionInfo sessionInfo = (SessionInfo) obj;
        if (this.username.equals(sessionInfo.username()) && ((str = this.storedCredentials) != null ? str.equals(sessionInfo.storedCredentials()) : sessionInfo.storedCredentials() == null) && ((str2 = this.locale) != null ? str2.equals(sessionInfo.locale()) : sessionInfo.locale() == null)) {
            String str3 = this.accessToken;
            if (str3 == null) {
                if (sessionInfo.accessToken() == null) {
                    return true;
                }
            } else if (str3.equals(sessionInfo.accessToken())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.username.hashCode() ^ 1000003) * 1000003;
        String str = this.storedCredentials;
        int i = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.locale;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.accessToken;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode3 ^ i;
    }

    @Override // com.spotify.cosmos.session.model.SessionInfo
    public String locale() {
        return this.locale;
    }

    @Override // com.spotify.cosmos.session.model.SessionInfo
    public String storedCredentials() {
        return this.storedCredentials;
    }

    public String toString() {
        StringBuilder V0 = je.V0("SessionInfo{username=");
        V0.append(this.username);
        V0.append(", storedCredentials=");
        V0.append(this.storedCredentials);
        V0.append(", locale=");
        V0.append(this.locale);
        V0.append(", accessToken=");
        return je.I0(V0, this.accessToken, "}");
    }

    @Override // com.spotify.cosmos.session.model.SessionInfo
    public String username() {
        return this.username;
    }
}
