package com.spotify.music.sociallistening.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.List;
import kotlin.jvm.internal.h;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class AvailableSessionsResponse implements JacksonModel {
    private final List<AvailableSession> availableSessions;

    public AvailableSessionsResponse(@JsonProperty("available_sessions") List<AvailableSession> list) {
        h.e(list, "availableSessions");
        this.availableSessions = list;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.spotify.music.sociallistening.models.AvailableSessionsResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AvailableSessionsResponse copy$default(AvailableSessionsResponse availableSessionsResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = availableSessionsResponse.availableSessions;
        }
        return availableSessionsResponse.copy(list);
    }

    public final List<AvailableSession> component1() {
        return this.availableSessions;
    }

    public final AvailableSessionsResponse copy(@JsonProperty("available_sessions") List<AvailableSession> list) {
        h.e(list, "availableSessions");
        return new AvailableSessionsResponse(list);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof AvailableSessionsResponse) && h.a(this.availableSessions, ((AvailableSessionsResponse) obj).availableSessions);
        }
        return true;
    }

    public final List<AvailableSession> getAvailableSessions() {
        return this.availableSessions;
    }

    public int hashCode() {
        List<AvailableSession> list = this.availableSessions;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public String toString() {
        return je.L0(je.V0("AvailableSessionsResponse(availableSessions="), this.availableSessions, ")");
    }
}
