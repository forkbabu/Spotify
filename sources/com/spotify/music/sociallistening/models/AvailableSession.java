package com.spotify.music.sociallistening.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class AvailableSession implements JacksonModel {
    private final AvailabilityStatus availabilityStatus;
    private final AvailableSessionType availableSessionType;
    private final String joinToken;
    private final PublicSessionInfo publicSessionInfo;

    public AvailableSession(@JsonProperty("public_session_info") PublicSessionInfo publicSessionInfo2, @JsonProperty("available_session_type") AvailableSessionType availableSessionType2, @JsonProperty("join_token") String str, @JsonProperty("availability_status") AvailabilityStatus availabilityStatus2) {
        h.e(publicSessionInfo2, "publicSessionInfo");
        h.e(availableSessionType2, "availableSessionType");
        h.e(str, "joinToken");
        this.publicSessionInfo = publicSessionInfo2;
        this.availableSessionType = availableSessionType2;
        this.joinToken = str;
        this.availabilityStatus = availabilityStatus2;
    }

    public static /* synthetic */ AvailableSession copy$default(AvailableSession availableSession, PublicSessionInfo publicSessionInfo2, AvailableSessionType availableSessionType2, String str, AvailabilityStatus availabilityStatus2, int i, Object obj) {
        if ((i & 1) != 0) {
            publicSessionInfo2 = availableSession.publicSessionInfo;
        }
        if ((i & 2) != 0) {
            availableSessionType2 = availableSession.availableSessionType;
        }
        if ((i & 4) != 0) {
            str = availableSession.joinToken;
        }
        if ((i & 8) != 0) {
            availabilityStatus2 = availableSession.availabilityStatus;
        }
        return availableSession.copy(publicSessionInfo2, availableSessionType2, str, availabilityStatus2);
    }

    public final PublicSessionInfo component1() {
        return this.publicSessionInfo;
    }

    public final AvailableSessionType component2() {
        return this.availableSessionType;
    }

    public final String component3() {
        return this.joinToken;
    }

    public final AvailabilityStatus component4() {
        return this.availabilityStatus;
    }

    public final AvailableSession copy(@JsonProperty("public_session_info") PublicSessionInfo publicSessionInfo2, @JsonProperty("available_session_type") AvailableSessionType availableSessionType2, @JsonProperty("join_token") String str, @JsonProperty("availability_status") AvailabilityStatus availabilityStatus2) {
        h.e(publicSessionInfo2, "publicSessionInfo");
        h.e(availableSessionType2, "availableSessionType");
        h.e(str, "joinToken");
        return new AvailableSession(publicSessionInfo2, availableSessionType2, str, availabilityStatus2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AvailableSession)) {
            return false;
        }
        AvailableSession availableSession = (AvailableSession) obj;
        return h.a(this.publicSessionInfo, availableSession.publicSessionInfo) && h.a(this.availableSessionType, availableSession.availableSessionType) && h.a(this.joinToken, availableSession.joinToken) && h.a(this.availabilityStatus, availableSession.availabilityStatus);
    }

    public final AvailabilityStatus getAvailabilityStatus() {
        return this.availabilityStatus;
    }

    public final AvailableSessionType getAvailableSessionType() {
        return this.availableSessionType;
    }

    public final String getJoinToken() {
        return this.joinToken;
    }

    public final PublicSessionInfo getPublicSessionInfo() {
        return this.publicSessionInfo;
    }

    public int hashCode() {
        PublicSessionInfo publicSessionInfo2 = this.publicSessionInfo;
        int i = 0;
        int hashCode = (publicSessionInfo2 != null ? publicSessionInfo2.hashCode() : 0) * 31;
        AvailableSessionType availableSessionType2 = this.availableSessionType;
        int hashCode2 = (hashCode + (availableSessionType2 != null ? availableSessionType2.hashCode() : 0)) * 31;
        String str = this.joinToken;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        AvailabilityStatus availabilityStatus2 = this.availabilityStatus;
        if (availabilityStatus2 != null) {
            i = availabilityStatus2.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("AvailableSession(publicSessionInfo=");
        V0.append(this.publicSessionInfo);
        V0.append(", availableSessionType=");
        V0.append(this.availableSessionType);
        V0.append(", joinToken=");
        V0.append(this.joinToken);
        V0.append(", availabilityStatus=");
        V0.append(this.availabilityStatus);
        V0.append(")");
        return V0.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AvailableSession(PublicSessionInfo publicSessionInfo2, AvailableSessionType availableSessionType2, String str, AvailabilityStatus availabilityStatus2, int i, f fVar) {
        this(publicSessionInfo2, availableSessionType2, (i & 4) != 0 ? "" : str, availabilityStatus2);
    }
}
