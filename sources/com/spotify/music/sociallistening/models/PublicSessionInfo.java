package com.spotify.music.sociallistening.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class PublicSessionInfo implements JacksonModel {
    public static final a Companion = new a(null);
    public static final PublicSessionInfo EMPTY = new PublicSessionInfo(0, null, 0, null, null, null, null, 127, null);
    private final String hostActiveDeviceId;
    private final String hostDisplayName;
    private final String hostImageUrl;
    private final String hostUserName;
    private final int memberCount;
    private final String sessionId;
    private final long timestamp;

    public static final class a {
        public a(f fVar) {
        }
    }

    public PublicSessionInfo() {
        this(0, null, 0, null, null, null, null, 127, null);
    }

    public PublicSessionInfo(@JsonProperty("timestamp") long j, @JsonProperty("session_id") String str, @JsonProperty("member_count") int i, @JsonProperty("host_user_name") String str2, @JsonProperty("host_display_name") String str3, @JsonProperty("host_image_url") String str4, @JsonProperty("host_active_device_id") String str5) {
        h.e(str, "sessionId");
        h.e(str2, "hostUserName");
        h.e(str3, "hostDisplayName");
        h.e(str4, "hostImageUrl");
        h.e(str5, "hostActiveDeviceId");
        this.timestamp = j;
        this.sessionId = str;
        this.memberCount = i;
        this.hostUserName = str2;
        this.hostDisplayName = str3;
        this.hostImageUrl = str4;
        this.hostActiveDeviceId = str5;
    }

    public static /* synthetic */ PublicSessionInfo copy$default(PublicSessionInfo publicSessionInfo, long j, String str, int i, String str2, String str3, String str4, String str5, int i2, Object obj) {
        return publicSessionInfo.copy((i2 & 1) != 0 ? publicSessionInfo.timestamp : j, (i2 & 2) != 0 ? publicSessionInfo.sessionId : str, (i2 & 4) != 0 ? publicSessionInfo.memberCount : i, (i2 & 8) != 0 ? publicSessionInfo.hostUserName : str2, (i2 & 16) != 0 ? publicSessionInfo.hostDisplayName : str3, (i2 & 32) != 0 ? publicSessionInfo.hostImageUrl : str4, (i2 & 64) != 0 ? publicSessionInfo.hostActiveDeviceId : str5);
    }

    public final long component1() {
        return this.timestamp;
    }

    public final String component2() {
        return this.sessionId;
    }

    public final int component3() {
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

    public final PublicSessionInfo copy(@JsonProperty("timestamp") long j, @JsonProperty("session_id") String str, @JsonProperty("member_count") int i, @JsonProperty("host_user_name") String str2, @JsonProperty("host_display_name") String str3, @JsonProperty("host_image_url") String str4, @JsonProperty("host_active_device_id") String str5) {
        h.e(str, "sessionId");
        h.e(str2, "hostUserName");
        h.e(str3, "hostDisplayName");
        h.e(str4, "hostImageUrl");
        h.e(str5, "hostActiveDeviceId");
        return new PublicSessionInfo(j, str, i, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PublicSessionInfo)) {
            return false;
        }
        PublicSessionInfo publicSessionInfo = (PublicSessionInfo) obj;
        return this.timestamp == publicSessionInfo.timestamp && h.a(this.sessionId, publicSessionInfo.sessionId) && this.memberCount == publicSessionInfo.memberCount && h.a(this.hostUserName, publicSessionInfo.hostUserName) && h.a(this.hostDisplayName, publicSessionInfo.hostDisplayName) && h.a(this.hostImageUrl, publicSessionInfo.hostImageUrl) && h.a(this.hostActiveDeviceId, publicSessionInfo.hostActiveDeviceId);
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

    public final int getMemberCount() {
        return this.memberCount;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int a2 = e.a(this.timestamp) * 31;
        String str = this.sessionId;
        int i = 0;
        int hashCode = (((a2 + (str != null ? str.hashCode() : 0)) * 31) + this.memberCount) * 31;
        String str2 = this.hostUserName;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.hostDisplayName;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.hostImageUrl;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.hostActiveDeviceId;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode4 + i;
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

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ PublicSessionInfo(long r10, java.lang.String r12, int r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, int r18, kotlin.jvm.internal.f r19) {
        /*
            r9 = this;
            r0 = r18 & 1
            if (r0 == 0) goto L_0x0007
            r0 = 0
            goto L_0x0008
        L_0x0007:
            r0 = r10
        L_0x0008:
            r2 = r18 & 2
            java.lang.String r3 = ""
            if (r2 == 0) goto L_0x0010
            r2 = r3
            goto L_0x0011
        L_0x0010:
            r2 = r12
        L_0x0011:
            r4 = r18 & 4
            if (r4 == 0) goto L_0x0017
            r4 = 0
            goto L_0x0018
        L_0x0017:
            r4 = r13
        L_0x0018:
            r5 = r18 & 8
            if (r5 == 0) goto L_0x001e
            r5 = r3
            goto L_0x001f
        L_0x001e:
            r5 = r14
        L_0x001f:
            r6 = r18 & 16
            if (r6 == 0) goto L_0x0025
            r6 = r3
            goto L_0x0026
        L_0x0025:
            r6 = r15
        L_0x0026:
            r7 = r18 & 32
            if (r7 == 0) goto L_0x002c
            r7 = r3
            goto L_0x002e
        L_0x002c:
            r7 = r16
        L_0x002e:
            r8 = r18 & 64
            if (r8 == 0) goto L_0x0033
            goto L_0x0035
        L_0x0033:
            r3 = r17
        L_0x0035:
            r10 = r9
            r11 = r0
            r13 = r2
            r14 = r4
            r15 = r5
            r16 = r6
            r17 = r7
            r18 = r3
            r10.<init>(r11, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.sociallistening.models.PublicSessionInfo.<init>(long, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.f):void");
    }
}
