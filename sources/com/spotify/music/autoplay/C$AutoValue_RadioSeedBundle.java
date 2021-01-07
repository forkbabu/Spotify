package com.spotify.music.autoplay;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.player.v2.PlayOrigin;
import com.spotify.mobile.android.video.model.PlayerError;

/* renamed from: com.spotify.music.autoplay.$AutoValue_RadioSeedBundle  reason: invalid class name */
abstract class C$AutoValue_RadioSeedBundle extends RadioSeedBundle {
    private final PlayOrigin playOrigin;
    private final String playbackId;
    private final String radioSeed;

    C$AutoValue_RadioSeedBundle(String str, String str2, PlayOrigin playOrigin2) {
        if (str != null) {
            this.radioSeed = str;
            if (str2 != null) {
                this.playbackId = str2;
                if (playOrigin2 != null) {
                    this.playOrigin = playOrigin2;
                    return;
                }
                throw new NullPointerException("Null playOrigin");
            }
            throw new NullPointerException("Null playbackId");
        }
        throw new NullPointerException("Null radioSeed");
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RadioSeedBundle)) {
            return false;
        }
        RadioSeedBundle radioSeedBundle = (RadioSeedBundle) obj;
        if (!this.radioSeed.equals(radioSeedBundle.getRadioSeed()) || !this.playbackId.equals(radioSeedBundle.getPlaybackId()) || !this.playOrigin.equals(radioSeedBundle.getPlayOrigin())) {
            return false;
        }
        return true;
    }

    @Override // com.spotify.music.autoplay.RadioSeedBundle
    @JsonProperty("play_origin")
    public PlayOrigin getPlayOrigin() {
        return this.playOrigin;
    }

    @Override // com.spotify.music.autoplay.RadioSeedBundle
    @JsonProperty(PlayerError.CONTEXT_PLAYER_ERROR_PLAYBACK_ID_KEY)
    public String getPlaybackId() {
        return this.playbackId;
    }

    @Override // com.spotify.music.autoplay.RadioSeedBundle
    @JsonProperty("radio_seed")
    public String getRadioSeed() {
        return this.radioSeed;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return ((((this.radioSeed.hashCode() ^ 1000003) * 1000003) ^ this.playbackId.hashCode()) * 1000003) ^ this.playOrigin.hashCode();
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("RadioSeedBundle{radioSeed=");
        V0.append(this.radioSeed);
        V0.append(", playbackId=");
        V0.append(this.playbackId);
        V0.append(", playOrigin=");
        V0.append(this.playOrigin);
        V0.append("}");
        return V0.toString();
    }
}
