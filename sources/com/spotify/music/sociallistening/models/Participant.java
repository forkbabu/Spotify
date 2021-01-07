package com.spotify.music.sociallistening.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class Participant implements JacksonModel {
    public static final a Companion = new a(null);
    public static final Participant DEFAULT = new Participant(null, null, null, null, false, null, 63, null);
    private final String displayName;
    private final String id;
    private final String imageUrl;
    private final boolean isHost;
    private final String largeImageUrl;
    private final String username;

    public static final class a {
        public a(f fVar) {
        }
    }

    public Participant() {
        this(null, null, null, null, false, null, 63, null);
    }

    public Participant(@JsonProperty("id") String str, @JsonProperty("display_name") String str2, @JsonProperty("image_url") String str3, @JsonProperty("large_image_url") String str4, @JsonProperty("is_host") boolean z, @JsonProperty("username") String str5) {
        je.x(str, "id", str2, "displayName", str5, "username");
        this.id = str;
        this.displayName = str2;
        this.imageUrl = str3;
        this.largeImageUrl = str4;
        this.isHost = z;
        this.username = str5;
    }

    public static /* synthetic */ Participant copy$default(Participant participant, String str, String str2, String str3, String str4, boolean z, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = participant.id;
        }
        if ((i & 2) != 0) {
            str2 = participant.displayName;
        }
        if ((i & 4) != 0) {
            str3 = participant.imageUrl;
        }
        if ((i & 8) != 0) {
            str4 = participant.largeImageUrl;
        }
        if ((i & 16) != 0) {
            z = participant.isHost;
        }
        if ((i & 32) != 0) {
            str5 = participant.username;
        }
        return participant.copy(str, str2, str3, str4, z, str5);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.displayName;
    }

    public final String component3() {
        return this.imageUrl;
    }

    public final String component4() {
        return this.largeImageUrl;
    }

    public final boolean component5() {
        return this.isHost;
    }

    public final String component6() {
        return this.username;
    }

    public final Participant copy(@JsonProperty("id") String str, @JsonProperty("display_name") String str2, @JsonProperty("image_url") String str3, @JsonProperty("large_image_url") String str4, @JsonProperty("is_host") boolean z, @JsonProperty("username") String str5) {
        h.e(str, "id");
        h.e(str2, "displayName");
        h.e(str5, "username");
        return new Participant(str, str2, str3, str4, z, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Participant)) {
            return false;
        }
        Participant participant = (Participant) obj;
        return h.a(this.id, participant.id) && h.a(this.displayName, participant.displayName) && h.a(this.imageUrl, participant.imageUrl) && h.a(this.largeImageUrl, participant.largeImageUrl) && this.isHost == participant.isHost && h.a(this.username, participant.username);
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getId() {
        return this.id;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getLargeImageUrl() {
        return this.largeImageUrl;
    }

    public final String getUsername() {
        return this.username;
    }

    public int hashCode() {
        String str = this.id;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.displayName;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.imageUrl;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.largeImageUrl;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        boolean z = this.isHost;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (hashCode4 + i2) * 31;
        String str5 = this.username;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return i5 + i;
    }

    public final boolean isHost() {
        return this.isHost;
    }

    public String toString() {
        StringBuilder V0 = je.V0("Participant(id=");
        V0.append(this.id);
        V0.append(", displayName=");
        V0.append(this.displayName);
        V0.append(", imageUrl=");
        V0.append(this.imageUrl);
        V0.append(", largeImageUrl=");
        V0.append(this.largeImageUrl);
        V0.append(", isHost=");
        V0.append(this.isHost);
        V0.append(", username=");
        return je.I0(V0, this.username, ")");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Participant(String str, String str2, String str3, String str4, boolean z, String str5, int i, f fVar) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? false : z, (i & 32) != 0 ? "" : str5);
    }
}
