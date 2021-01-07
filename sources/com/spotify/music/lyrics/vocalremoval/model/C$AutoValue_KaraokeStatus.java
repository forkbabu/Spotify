package com.spotify.music.lyrics.vocalremoval.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: com.spotify.music.lyrics.vocalremoval.model.$AutoValue_KaraokeStatus  reason: invalid class name */
abstract class C$AutoValue_KaraokeStatus extends KaraokeStatus {
    private final String status;

    C$AutoValue_KaraokeStatus(String str) {
        if (str != null) {
            this.status = str;
            return;
        }
        throw new NullPointerException("Null status");
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof KaraokeStatus) {
            return this.status.equals(((KaraokeStatus) obj).status());
        }
        return false;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return this.status.hashCode() ^ 1000003;
    }

    @Override // com.spotify.music.lyrics.vocalremoval.model.KaraokeStatus
    @JsonProperty("status")
    public String status() {
        return this.status;
    }

    @Override // java.lang.Object
    public String toString() {
        return je.I0(je.V0("KaraokeStatus{status="), this.status, "}");
    }
}
