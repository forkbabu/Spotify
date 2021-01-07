package com.spotify.music.sociallistening.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.List;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class SessionUpdate implements JacksonModel {
    public static final a Companion = new a(null);
    public static final SessionUpdate EMPTY = new SessionUpdate(null, null, null, 7, null);
    private final SessionUpdateReason reason;
    private final Session session;
    private final List<SessionMember> updateSessionMembers;

    public static final class a {
        public a(f fVar) {
        }
    }

    public SessionUpdate() {
        this(null, null, null, 7, null);
    }

    public SessionUpdate(@JsonProperty("session") Session session2, @JsonProperty("reason") SessionUpdateReason sessionUpdateReason, @JsonProperty("update_session_members") List<SessionMember> list) {
        this.session = session2;
        this.reason = sessionUpdateReason;
        this.updateSessionMembers = list;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.spotify.music.sociallistening.models.SessionUpdate */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SessionUpdate copy$default(SessionUpdate sessionUpdate, Session session2, SessionUpdateReason sessionUpdateReason, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            session2 = sessionUpdate.session;
        }
        if ((i & 2) != 0) {
            sessionUpdateReason = sessionUpdate.reason;
        }
        if ((i & 4) != 0) {
            list = sessionUpdate.updateSessionMembers;
        }
        return sessionUpdate.copy(session2, sessionUpdateReason, list);
    }

    public final Session component1() {
        return this.session;
    }

    public final SessionUpdateReason component2() {
        return this.reason;
    }

    public final List<SessionMember> component3() {
        return this.updateSessionMembers;
    }

    public final SessionUpdate copy(@JsonProperty("session") Session session2, @JsonProperty("reason") SessionUpdateReason sessionUpdateReason, @JsonProperty("update_session_members") List<SessionMember> list) {
        return new SessionUpdate(session2, sessionUpdateReason, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionUpdate)) {
            return false;
        }
        SessionUpdate sessionUpdate = (SessionUpdate) obj;
        return h.a(this.session, sessionUpdate.session) && h.a(this.reason, sessionUpdate.reason) && h.a(this.updateSessionMembers, sessionUpdate.updateSessionMembers);
    }

    public final SessionUpdateReason getReason() {
        return this.reason;
    }

    public final Session getSession() {
        return this.session;
    }

    public final List<SessionMember> getUpdateSessionMembers() {
        return this.updateSessionMembers;
    }

    public int hashCode() {
        Session session2 = this.session;
        int i = 0;
        int hashCode = (session2 != null ? session2.hashCode() : 0) * 31;
        SessionUpdateReason sessionUpdateReason = this.reason;
        int hashCode2 = (hashCode + (sessionUpdateReason != null ? sessionUpdateReason.hashCode() : 0)) * 31;
        List<SessionMember> list = this.updateSessionMembers;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("SessionUpdate(session=");
        V0.append(this.session);
        V0.append(", reason=");
        V0.append(this.reason);
        V0.append(", updateSessionMembers=");
        return je.L0(V0, this.updateSessionMembers, ")");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SessionUpdate(Session session2, SessionUpdateReason sessionUpdateReason, List list, int i, f fVar) {
        this((i & 1) != 0 ? null : session2, (i & 2) != 0 ? null : sessionUpdateReason, (i & 4) != 0 ? null : list);
    }
}
