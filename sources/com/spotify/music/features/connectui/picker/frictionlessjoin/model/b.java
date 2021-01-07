package com.spotify.music.features.connectui.picker.frictionlessjoin.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.List;
import kotlin.jvm.internal.h;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonSerialize(as = b.class)
public final class b {
    private final List<AvailableSession> a;

    public b(@JsonProperty("available_sessions") List<AvailableSession> list) {
        this.a = list;
    }

    public final List<AvailableSession> a() {
        return this.a;
    }

    public final b copy(@JsonProperty("available_sessions") List<AvailableSession> list) {
        return new b(list);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof b) && h.a(this.a, ((b) obj).a);
        }
        return true;
    }

    public int hashCode() {
        List<AvailableSession> list = this.a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public String toString() {
        return je.L0(je.V0("AvailableSessionsResponse(availableSessions="), this.a, ")");
    }

    public b() {
        this(null);
    }
}
