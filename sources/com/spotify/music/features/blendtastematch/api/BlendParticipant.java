package com.spotify.music.features.blendtastematch.api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import kotlin.jvm.internal.h;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class BlendParticipant implements JacksonModel {
    private final String hash;
    private final String imageUrl;
    private final String name;

    public BlendParticipant(@JsonProperty("hash") String str, @JsonProperty("name") String str2, @JsonProperty("image_url") String str3) {
        h.e(str, "hash");
        this.hash = str;
        this.name = str2;
        this.imageUrl = str3;
    }

    public static /* synthetic */ BlendParticipant copy$default(BlendParticipant blendParticipant, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = blendParticipant.hash;
        }
        if ((i & 2) != 0) {
            str2 = blendParticipant.name;
        }
        if ((i & 4) != 0) {
            str3 = blendParticipant.imageUrl;
        }
        return blendParticipant.copy(str, str2, str3);
    }

    public final String component1() {
        return this.hash;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.imageUrl;
    }

    public final BlendParticipant copy(@JsonProperty("hash") String str, @JsonProperty("name") String str2, @JsonProperty("image_url") String str3) {
        h.e(str, "hash");
        return new BlendParticipant(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BlendParticipant)) {
            return false;
        }
        BlendParticipant blendParticipant = (BlendParticipant) obj;
        return h.a(this.hash, blendParticipant.hash) && h.a(this.name, blendParticipant.name) && h.a(this.imageUrl, blendParticipant.imageUrl);
    }

    public final String getHash() {
        return this.hash;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        String str = this.hash;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.name;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.imageUrl;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("BlendParticipant(hash=");
        V0.append(this.hash);
        V0.append(", name=");
        V0.append(this.name);
        V0.append(", imageUrl=");
        return je.I0(V0, this.imageUrl, ")");
    }
}
