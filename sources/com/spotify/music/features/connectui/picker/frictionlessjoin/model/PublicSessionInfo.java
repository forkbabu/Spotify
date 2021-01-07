package com.spotify.music.features.connectui.picker.frictionlessjoin.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.spotify.mobile.android.cosmos.JacksonModel;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonSerialize(as = PublicSessionInfo.class)
public final class PublicSessionInfo implements JacksonModel {
    private final String hostActiveDeviceId;
    private final String hostDisplayName;
    private final String hostImageUrl;
    private final String hostUserName;
    private final String memberCount;
    private final String sessionId;
    private final Long timestamp;

    public PublicSessionInfo() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public PublicSessionInfo(@JsonProperty("timestamp") Long l, @JsonProperty("session_id") String str, @JsonProperty("member_count") String str2, @JsonProperty("host_user_name") String str3, @JsonProperty("host_display_name") String str4, @JsonProperty("host_image_url") String str5, @JsonProperty("host_active_device_id") String str6) {
        this.timestamp = l;
        this.sessionId = str;
        this.memberCount = str2;
        this.hostUserName = str3;
        this.hostDisplayName = str4;
        this.hostImageUrl = str5;
        this.hostActiveDeviceId = str6;
    }

    public static /* synthetic */ PublicSessionInfo copy$default(PublicSessionInfo publicSessionInfo, Long l, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            l = publicSessionInfo.timestamp;
        }
        if ((i & 2) != 0) {
            str = publicSessionInfo.sessionId;
        }
        if ((i & 4) != 0) {
            str2 = publicSessionInfo.memberCount;
        }
        if ((i & 8) != 0) {
            str3 = publicSessionInfo.hostUserName;
        }
        if ((i & 16) != 0) {
            str4 = publicSessionInfo.hostDisplayName;
        }
        if ((i & 32) != 0) {
            str5 = publicSessionInfo.hostImageUrl;
        }
        if ((i & 64) != 0) {
            str6 = publicSessionInfo.hostActiveDeviceId;
        }
        return publicSessionInfo.copy(l, str, str2, str3, str4, str5, str6);
    }

    public final Long component1() {
        return this.timestamp;
    }

    public final String component2() {
        return this.sessionId;
    }

    public final String component3() {
        return this.memberCount;
    }

    public final String component4() {
        return this.hostUserName;
    }

    public final String component5() {
        return this.hostDisplayName;
    }

    public final String component6() {
        return this.hostImageUrl;
    }

    public final String component7() {
        return this.hostActiveDeviceId;
    }

    public final PublicSessionInfo copy(@JsonProperty("timestamp") Long l, @JsonProperty("session_id") String str, @JsonProperty("member_count") String str2, @JsonProperty("host_user_name") String str3, @JsonProperty("host_display_name") String str4, @JsonProperty("host_image_url") String str5, @JsonProperty("host_active_device_id") String str6) {
        return new PublicSessionInfo(l, str, str2, str3, str4, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PublicSessionInfo)) {
            return false;
        }
        PublicSessionInfo publicSessionInfo = (PublicSessionInfo) obj;
        return h.a(this.timestamp, publicSessionInfo.timestamp) && h.a(this.sessionId, publicSessionInfo.sessionId) && h.a(this.memberCount, publicSessionInfo.memberCount) && h.a(this.hostUserName, publicSessionInfo.hostUserName) && h.a(this.hostDisplayName, publicSessionInfo.hostDisplayName) && h.a(this.hostImageUrl, publicSessionInfo.hostImageUrl) && h.a(this.hostActiveDeviceId, publicSessionInfo.hostActiveDeviceId);
    }

    public final String getHostActiveDeviceId() {
        return this.hostActiveDeviceId;
    }

    public final String getHostDisplayName() {
        return this.hostDisplayName;
    }

    public final String getHostImageUrl() {
        return this.hostImageUrl;
    }

    public final String getHostUserName() {
        return this.hostUserName;
    }

    public final String getMemberCount() {
        return this.memberCount;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final Long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        Long l = this.timestamp;
        int i = 0;
        int hashCode = (l != null ? l.hashCode() : 0) * 31;
        String str = this.sessionId;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.memberCount;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.hostUserName;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.hostDisplayName;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.hostImageUrl;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.hostActiveDeviceId;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return hashCode6 + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("PublicSessionInfo(timestamp=");
        V0.append(this.timestamp);
        V0.append(", sessionId=");
        V0.append(this.sessionId);
        V0.append(", memberCount=");
        V0.append(this.memberCount);
        V0.append(", hostUserName=");
        V0.append(this.hostUserName);
        V0.append(", hostDisplayName=");
        V0.append(this.hostDisplayName);
        V0.append(", hostImageUrl=");
        V0.append(this.hostImageUrl);
        V0.append(", hostActiveDeviceId=");
        return je.I0(V0, this.hostActiveDeviceId, ")");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PublicSessionInfo(Long l, String str, String str2, String str3, String str4, String str5, String str6, int i, f fVar) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6);
    }
}
