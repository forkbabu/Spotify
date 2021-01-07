package com.spotify.music.features.eventshub.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: com.spotify.music.features.eventshub.model.$AutoValue_ConcertPartner  reason: invalid class name */
abstract class C$AutoValue_ConcertPartner extends ConcertPartner {
    private final String concertId;
    private final String partnerId;

    C$AutoValue_ConcertPartner(String str, String str2) {
        if (str != null) {
            this.partnerId = str;
            if (str2 != null) {
                this.concertId = str2;
                return;
            }
            throw new NullPointerException("Null concertId");
        }
        throw new NullPointerException("Null partnerId");
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConcertPartner)) {
            return false;
        }
        ConcertPartner concertPartner = (ConcertPartner) obj;
        if (!this.partnerId.equals(concertPartner.getPartnerId()) || !this.concertId.equals(concertPartner.getConcertId())) {
            return false;
        }
        return true;
    }

    @Override // com.spotify.music.features.eventshub.model.ConcertPartner
    @JsonProperty("concertId")
    public String getConcertId() {
        return this.concertId;
    }

    @Override // com.spotify.music.features.eventshub.model.ConcertPartner
    @JsonProperty("partnerId")
    public String getPartnerId() {
        return this.partnerId;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return ((this.partnerId.hashCode() ^ 1000003) * 1000003) ^ this.concertId.hashCode();
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("ConcertPartner{partnerId=");
        V0.append(this.partnerId);
        V0.append(", concertId=");
        return je.I0(V0, this.concertId, "}");
    }
}
