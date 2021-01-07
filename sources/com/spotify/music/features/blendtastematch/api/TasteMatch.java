package com.spotify.music.features.blendtastematch.api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import kotlin.jvm.internal.h;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class TasteMatch extends d implements JacksonModel {
    private final String playlistUri;
    private final BlendParticipant recipient;
    private final BlendParticipant sender;
    private final String tasteMatch;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TasteMatch(@JsonProperty("taste_match") String str, @JsonProperty("sender") BlendParticipant blendParticipant, @JsonProperty("recipient") BlendParticipant blendParticipant2, @JsonProperty("playlist_uri") String str2) {
        super(null);
        h.e(str, "tasteMatch");
        h.e(blendParticipant, "sender");
        h.e(blendParticipant2, "recipient");
        this.tasteMatch = str;
        this.sender = blendParticipant;
        this.recipient = blendParticipant2;
        this.playlistUri = str2;
    }

    public static /* synthetic */ TasteMatch copy$default(TasteMatch tasteMatch2, String str, BlendParticipant blendParticipant, BlendParticipant blendParticipant2, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tasteMatch2.tasteMatch;
        }
        if ((i & 2) != 0) {
            blendParticipant = tasteMatch2.sender;
        }
        if ((i & 4) != 0) {
            blendParticipant2 = tasteMatch2.recipient;
        }
        if ((i & 8) != 0) {
            str2 = tasteMatch2.playlistUri;
        }
        return tasteMatch2.copy(str, blendParticipant, blendParticipant2, str2);
    }

    public final String component1() {
        return this.tasteMatch;
    }

    public final BlendParticipant component2() {
        return this.sender;
    }

    public final BlendParticipant component3() {
        return this.recipient;
    }

    public final String component4() {
        return this.playlistUri;
    }

    public final TasteMatch copy(@JsonProperty("taste_match") String str, @JsonProperty("sender") BlendParticipant blendParticipant, @JsonProperty("recipient") BlendParticipant blendParticipant2, @JsonProperty("playlist_uri") String str2) {
        h.e(str, "tasteMatch");
        h.e(blendParticipant, "sender");
        h.e(blendParticipant2, "recipient");
        return new TasteMatch(str, blendParticipant, blendParticipant2, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TasteMatch)) {
            return false;
        }
        TasteMatch tasteMatch2 = (TasteMatch) obj;
        return h.a(this.tasteMatch, tasteMatch2.tasteMatch) && h.a(this.sender, tasteMatch2.sender) && h.a(this.recipient, tasteMatch2.recipient) && h.a(this.playlistUri, tasteMatch2.playlistUri);
    }

    public final String getPlaylistUri() {
        return this.playlistUri;
    }

    public final BlendParticipant getRecipient() {
        return this.recipient;
    }

    public final BlendParticipant getSender() {
        return this.sender;
    }

    public final String getTasteMatch() {
        return this.tasteMatch;
    }

    public int hashCode() {
        String str = this.tasteMatch;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        BlendParticipant blendParticipant = this.sender;
        int hashCode2 = (hashCode + (blendParticipant != null ? blendParticipant.hashCode() : 0)) * 31;
        BlendParticipant blendParticipant2 = this.recipient;
        int hashCode3 = (hashCode2 + (blendParticipant2 != null ? blendParticipant2.hashCode() : 0)) * 31;
        String str2 = this.playlistUri;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("TasteMatch(tasteMatch=");
        V0.append(this.tasteMatch);
        V0.append(", sender=");
        V0.append(this.sender);
        V0.append(", recipient=");
        V0.append(this.recipient);
        V0.append(", playlistUri=");
        return je.I0(V0, this.playlistUri, ")");
    }
}
