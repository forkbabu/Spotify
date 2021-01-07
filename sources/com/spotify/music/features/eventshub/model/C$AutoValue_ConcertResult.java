package com.spotify.music.features.eventshub.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: com.spotify.music.features.eventshub.model.$AutoValue_ConcertResult  reason: invalid class name */
abstract class C$AutoValue_ConcertResult extends ConcertResult {
    private final String clickThroughUrl;
    private final Concert concert;
    private final Boolean discovery;
    private final Boolean nearUser;
    private final String source;

    C$AutoValue_ConcertResult(Concert concert2, String str, String str2, Boolean bool, Boolean bool2) {
        if (concert2 != null) {
            this.concert = concert2;
            this.clickThroughUrl = str;
            this.source = str2;
            this.nearUser = bool;
            this.discovery = bool2;
            return;
        }
        throw new NullPointerException("Null concert");
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        String str;
        String str2;
        Boolean bool;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConcertResult)) {
            return false;
        }
        ConcertResult concertResult = (ConcertResult) obj;
        if (this.concert.equals(concertResult.getConcert()) && ((str = this.clickThroughUrl) != null ? str.equals(concertResult.getClickThroughUrl()) : concertResult.getClickThroughUrl() == null) && ((str2 = this.source) != null ? str2.equals(concertResult.getSource()) : concertResult.getSource() == null) && ((bool = this.nearUser) != null ? bool.equals(concertResult.getNearUser()) : concertResult.getNearUser() == null)) {
            Boolean bool2 = this.discovery;
            if (bool2 == null) {
                if (concertResult.getDiscovery() == null) {
                    return true;
                }
            } else if (bool2.equals(concertResult.getDiscovery())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.spotify.music.features.eventshub.model.ConcertResult
    @JsonProperty("clickThruUrl")
    public String getClickThroughUrl() {
        return this.clickThroughUrl;
    }

    @Override // com.spotify.music.features.eventshub.model.ConcertResult
    @JsonProperty("concert")
    public Concert getConcert() {
        return this.concert;
    }

    @Override // com.spotify.music.features.eventshub.model.ConcertResult
    @JsonProperty("discovery")
    public Boolean getDiscovery() {
        return this.discovery;
    }

    @Override // com.spotify.music.features.eventshub.model.ConcertResult
    @JsonProperty("nearUser")
    public Boolean getNearUser() {
        return this.nearUser;
    }

    @Override // com.spotify.music.features.eventshub.model.ConcertResult
    @JsonProperty("source")
    public String getSource() {
        return this.source;
    }

    @Override // java.lang.Object
    public int hashCode() {
        int hashCode = (this.concert.hashCode() ^ 1000003) * 1000003;
        String str = this.clickThroughUrl;
        int i = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.source;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        Boolean bool = this.nearUser;
        int hashCode4 = (hashCode3 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        Boolean bool2 = this.discovery;
        if (bool2 != null) {
            i = bool2.hashCode();
        }
        return hashCode4 ^ i;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("ConcertResult{concert=");
        V0.append(this.concert);
        V0.append(", clickThroughUrl=");
        V0.append(this.clickThroughUrl);
        V0.append(", source=");
        V0.append(this.source);
        V0.append(", nearUser=");
        V0.append(this.nearUser);
        V0.append(", discovery=");
        V0.append(this.discovery);
        V0.append("}");
        return V0.toString();
    }
}
