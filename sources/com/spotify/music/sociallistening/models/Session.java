package com.spotify.music.sociallistening.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.List;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class Session implements JacksonModel {
    public static final a Companion = new a(null);
    public static final Session EMPTY = new Session(null, null, null, null, null, null, 63, null);
    private final String joinSessionToken;
    private final String joinSessionUrl;
    private final String sessionId;
    private final List<SessionMember> sessionMembers;
    private final String sessionOwnerId;
    private final Long timestamp;

    public static final class a {
        public a(f fVar) {
        }
    }

    public Session() {
        this(null, null, null, null, null, null, 63, null);
    }

    public Session(@JsonProperty("timestamp") Long l, @JsonProperty("session_id") String str, @JsonProperty("join_session_token") String str2, @JsonProperty("join_session_url") String str3, @JsonProperty("session_owner_id") String str4, @JsonProperty("session_members") List<SessionMember> list) {
        this.timestamp = l;
        this.sessionId = str;
        this.joinSessionToken = str2;
        this.joinSessionUrl = str3;
        this.sessionOwnerId = str4;
        this.sessionMembers = list;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.spotify.music.sociallistening.models.Session */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Session copy$default(Session session, Long l, String str, String str2, String str3, String str4, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            l = session.timestamp;
        }
        if ((i & 2) != 0) {
            str = session.sessionId;
        }
        if ((i & 4) != 0) {
            str2 = session.joinSessionToken;
        }
        if ((i & 8) != 0) {
            str3 = session.joinSessionUrl;
        }
        if ((i & 16) != 0) {
            str4 = session.sessionOwnerId;
        }
        if ((i & 32) != 0) {
            list = session.sessionMembers;
        }
        return session.copy(l, str, str2, str3, str4, list);
    }

    public final Long component1() {
        return this.timestamp;
    }

    public final String component2() {
        return this.sessionId;
    }

    public final String component3() {
        return this.joinSessionToken;
    }

    public final String component4() {
        return this.joinSessionUrl;
    }

    public final String component5() {
        return this.sessionOwnerId;
    }

    public final List<SessionMember> component6() {
        return this.sessionMembers;
    }

    public final Session copy(@JsonProperty("timestamp") Long l, @JsonProperty("session_id") String str, @JsonProperty("join_session_token") String str2, @JsonProperty("join_session_url") String str3, @JsonProperty("session_owner_id") String str4, @JsonProperty("session_members") List<SessionMember> list) {
        return new Session(l, str, str2, str3, str4, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Session)) {
            return false;
        }
        Session session = (Session) obj;
        return h.a(this.timestamp, session.timestamp) && h.a(this.sessionId, session.sessionId) && h.a(this.joinSessionToken, session.joinSessionToken) && h.a(this.joinSessionUrl, session.joinSessionUrl) && h.a(this.sessionOwnerId, session.sessionOwnerId) && h.a(this.sessionMembers, session.sessionMembers);
    }

    public final String getJoinSessionToken() {
        return this.joinSessionToken;
    }

    public final String getJoinSessionUrl() {
        return this.joinSessionUrl;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final List<SessionMember> getSessionMembers() {
        return this.sessionMembers;
    }

    public final String getSessionOwnerId() {
        return this.sessionOwnerId;
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
        String str2 = this.joinSessionToken;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.joinSessionUrl;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.sessionOwnerId;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        List<SessionMember> list = this.sessionMembers;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode5 + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("Session(timestamp=");
        V0.append(this.timestamp);
        V0.append(", sessionId=");
        V0.append(this.sessionId);
        V0.append(", joinSessionToken=");
        V0.append(this.joinSessionToken);
        V0.append(", joinSessionUrl=");
        V0.append(this.joinSessionUrl);
        V0.append(", sessionOwnerId=");
        V0.append(this.sessionOwnerId);
        V0.append(", sessionMembers=");
        return je.L0(V0, this.sessionMembers, ")");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Session(Long l, String str, String str2, String str3, String str4, List list, int i, f fVar) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : list);
    }
}
