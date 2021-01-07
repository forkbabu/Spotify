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
@JsonSerialize(as = AvailableSession.class)
public final class AvailableSession implements JacksonModel {
    private final AvailabilityStatus availabilityStatus;
    private final AvailableSessionType availableSessionType;
    private final String joinToken;
    private final PublicSessionInfo publicSessionInfo;

    public AvailableSession(@JsonProperty("join_token") String str, @JsonProperty("public_session_info") PublicSessionInfo publicSessionInfo2, @JsonProperty("available_session_type") AvailableSessionType availableSessionType2, @JsonProperty("availability_status") AvailabilityStatus availabilityStatus2) {
        h.e(str, "joinToken");
        this.joinToken = str;
        this.publicSessionInfo = publicSessionInfo2;
        this.availableSessionType = availableSessionType2;
        this.availabilityStatus = availabilityStatus2;
    }

    public static /* synthetic */ AvailableSession copy$default(AvailableSession availableSession, String str, PublicSessionInfo publicSessionInfo2, AvailableSessionType availableSessionType2, AvailabilityStatus availabilityStatus2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = availableSession.joinToken;
        }
        if ((i & 2) != 0) {
            publicSessionInfo2 = availableSession.publicSessionInfo;
        }
        if ((i & 4) != 0) {
            availableSessionType2 = availableSession.availableSessionType;
        }
        if ((i & 8) != 0) {
            availabilityStatus2 = availableSession.availabilityStatus;
        }
        return availableSession.copy(str, publicSessionInfo2, availableSessionType2, availabilityStatus2);
    }

    public final String component1() {
        return this.joinToken;
    }

    public final PublicSessionInfo component2() {
        return this.publicSessionInfo;
    }

    public final AvailableSessionType component3() {
        return this.availableSessionType;
    }

    public final AvailabilityStatus component4() {
        return this.availabilityStatus;
    }

    public final AvailableSession copy(@JsonProperty("join_token") String str, @JsonProperty("public_session_info") PublicSessionInfo publicSessionInfo2, @JsonProperty("available_session_type") AvailableSessionType availableSessionType2, @JsonProperty("availability_status") AvailabilityStatus availabilityStatus2) {
        h.e(str, "joinToken");
        return new AvailableSession(str, publicSessionInfo2, availableSessionType2, availabilityStatus2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AvailableSession)) {
            return false;
        }
        AvailableSession availableSession = (AvailableSession) obj;
        return h.a(this.joinToken, availableSession.joinToken) && h.a(this.publicSessionInfo, availableSession.publicSessionInfo) && h.a(this.availableSessionType, availableSession.availableSessionType) && h.a(this.availabilityStatus, availableSession.availabilityStatus);
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
        String str = this.joinToken;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        PublicSessionInfo publicSessionInfo2 = this.publicSessionInfo;
        int hashCode2 = (hashCode + (publicSessionInfo2 != null ? publicSessionInfo2.hashCode() : 0)) * 31;
        AvailableSessionType availableSessionType2 = this.availableSessionType;
        int hashCode3 = (hashCode2 + (availableSessionType2 != null ? availableSessionType2.hashCode() : 0)) * 31;
        AvailabilityStatus availabilityStatus2 = this.availabilityStatus;
        if (availabilityStatus2 != null) {
            i = availabilityStatus2.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("AvailableSession(joinToken=");
        V0.append(this.joinToken);
        V0.append(", publicSessionInfo=");
        V0.append(this.publicSessionInfo);
        V0.append(", availableSessionType=");
        V0.append(this.availableSessionType);
        V0.append(", availabilityStatus=");
        V0.append(this.availabilityStatus);
        V0.append(")");
        return V0.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AvailableSession(String str, PublicSessionInfo publicSessionInfo2, AvailableSessionType availableSessionType2, AvailabilityStatus availabilityStatus2, int i, f fVar) {
        this(str, (i & 2) != 0 ? null : publicSessionInfo2, (i & 4) != 0 ? null : availableSessionType2, (i & 8) != 0 ? null : availabilityStatus2);
    }
}
