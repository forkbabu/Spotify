package com.spotify.music.lyrics.vocalremoval.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.video.model.PlayerError;

/* renamed from: com.spotify.music.lyrics.vocalremoval.model.$AutoValue_KaraokeState  reason: invalid class name */
abstract class C$AutoValue_KaraokeState extends KaraokeState {
    private final Integer errorCode;
    private final String errorMessage;
    private final String eventId;
    private final String trackUri;

    C$AutoValue_KaraokeState(String str, String str2, String str3, Integer num) {
        if (str != null) {
            this.trackUri = str;
            if (str2 != null) {
                this.eventId = str2;
                this.errorMessage = str3;
                this.errorCode = num;
                return;
            }
            throw new NullPointerException("Null eventId");
        }
        throw new NullPointerException("Null trackUri");
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof KaraokeState)) {
            return false;
        }
        KaraokeState karaokeState = (KaraokeState) obj;
        if (this.trackUri.equals(karaokeState.trackUri()) && this.eventId.equals(karaokeState.eventId()) && ((str = this.errorMessage) != null ? str.equals(karaokeState.errorMessage()) : karaokeState.errorMessage() == null)) {
            Integer num = this.errorCode;
            if (num == null) {
                if (karaokeState.errorCode() == null) {
                    return true;
                }
            } else if (num.equals(karaokeState.errorCode())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.spotify.music.lyrics.vocalremoval.model.KaraokeState
    @JsonProperty("error_code")
    public Integer errorCode() {
        return this.errorCode;
    }

    @Override // com.spotify.music.lyrics.vocalremoval.model.KaraokeState
    @JsonProperty("error_message")
    public String errorMessage() {
        return this.errorMessage;
    }

    @Override // com.spotify.music.lyrics.vocalremoval.model.KaraokeState
    @JsonProperty("event_id")
    public String eventId() {
        return this.eventId;
    }

    @Override // java.lang.Object
    public int hashCode() {
        int hashCode = (((this.trackUri.hashCode() ^ 1000003) * 1000003) ^ this.eventId.hashCode()) * 1000003;
        String str = this.errorMessage;
        int i = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        Integer num = this.errorCode;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode2 ^ i;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("KaraokeState{trackUri=");
        V0.append(this.trackUri);
        V0.append(", eventId=");
        V0.append(this.eventId);
        V0.append(", errorMessage=");
        V0.append(this.errorMessage);
        V0.append(", errorCode=");
        V0.append(this.errorCode);
        V0.append("}");
        return V0.toString();
    }

    @Override // com.spotify.music.lyrics.vocalremoval.model.KaraokeState
    @JsonProperty(PlayerError.CONTEXT_PLAYER_ERROR_TRACK_URI_KEY)
    public String trackUri() {
        return this.trackUri;
    }
}
