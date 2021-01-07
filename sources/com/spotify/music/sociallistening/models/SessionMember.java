package com.spotify.music.sociallistening.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class SessionMember implements JacksonModel {
    public static final a Companion = new a(null);
    public static final SessionMember EMPTY = new SessionMember(null, null, null, null, null, null, 63, null);
    private final String displayName;
    private final String id;
    private final String imageUrl;
    private final Long joinedTimestamp;
    private final String largeImageUrl;
    private final String username;

    public static final class a {
        public a(f fVar) {
        }
    }

    public SessionMember() {
        this(null, null, null, null, null, null, 63, null);
    }

    public SessionMember(@JsonProperty("joined_timestamp") Long l, @JsonProperty("id") String str, @JsonProperty("username") String str2, @JsonProperty("display_name") String str3, @JsonProperty("image_url") String str4, @JsonProperty("large_image_url") String str5) {
        this.joinedTimestamp = l;
        this.id = str;
        this.username = str2;
        this.displayName = str3;
        this.imageUrl = str4;
        this.largeImageUrl = str5;
    }

    public static /* synthetic */ SessionMember copy$default(SessionMember sessionMember, Long l, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            l = sessionMember.joinedTimestamp;
        }
        if ((i & 2) != 0) {
            str = sessionMember.id;
        }
        if ((i & 4) != 0) {
            str2 = sessionMember.username;
        }
        if ((i & 8) != 0) {
            str3 = sessionMember.displayName;
        }
        if ((i & 16) != 0) {
            str4 = sessionMember.imageUrl;
        }
        if ((i & 32) != 0) {
            str5 = sessionMember.largeImageUrl;
        }
        return sessionMember.copy(l, str, str2, str3, str4, str5);
    }

    public final Long component1() {
        return this.joinedTimestamp;
    }

    public final String component2() {
        return this.id;
    }

    public final String component3() {
        return this.username;
    }

    public final String component4() {
        return this.displayName;
    }

    public final String component5() {
        return this.imageUrl;
    }

    public final String component6() {
        return this.largeImageUrl;
    }

    public final SessionMember copy(@JsonProperty("joined_timestamp") Long l, @JsonProperty("id") String str, @JsonProperty("username") String str2, @JsonProperty("display_name") String str3, @JsonProperty("image_url") String str4, @JsonProperty("large_image_url") String str5) {
        return new SessionMember(l, str, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionMember)) {
            return false;
        }
        SessionMember sessionMember = (SessionMember) obj;
        return h.a(this.joinedTimestamp, sessionMember.joinedTimestamp) && h.a(this.id, sessionMember.id) && h.a(this.username, sessionMember.username) && h.a(this.displayName, sessionMember.displayName) && h.a(this.imageUrl, sessionMember.imageUrl) && h.a(this.largeImageUrl, sessionMember.largeImageUrl);
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

    public final Long getJoinedTimestamp() {
        return this.joinedTimestamp;
    }

    public final String getLargeImageUrl() {
        return this.largeImageUrl;
    }

    public final String getUsername() {
        return this.username;
    }

    public int hashCode() {
        Long l = this.joinedTimestamp;
        int i = 0;
        int hashCode = (l != null ? l.hashCode() : 0) * 31;
        String str = this.id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.username;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.displayName;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.imageUrl;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.largeImageUrl;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode5 + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("SessionMember(joinedTimestamp=");
        V0.append(this.joinedTimestamp);
        V0.append(", id=");
        V0.append(this.id);
        V0.append(", username=");
        V0.append(this.username);
        V0.append(", displayName=");
        V0.append(this.displayName);
        V0.append(", imageUrl=");
        V0.append(this.imageUrl);
        V0.append(", largeImageUrl=");
        return je.I0(V0, this.largeImageUrl, ")");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SessionMember(Long l, String str, String str2, String str3, String str4, String str5, int i, f fVar) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5);
    }
}
