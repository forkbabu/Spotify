package com.spotify.music.sociallistening.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.Map;
import kotlin.jvm.internal.h;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class DevicesExposure implements JacksonModel {
    private final Map<String, Object> devicesExposure;
    private final long timestamp;

    public DevicesExposure(@JsonProperty("timestamp") long j, @JsonProperty("devices_exposure") Map<String, ? extends Object> map) {
        this.timestamp = j;
        this.devicesExposure = map;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.spotify.music.sociallistening.models.DevicesExposure */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DevicesExposure copy$default(DevicesExposure devicesExposure2, long j, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            j = devicesExposure2.timestamp;
        }
        if ((i & 2) != 0) {
            map = devicesExposure2.devicesExposure;
        }
        return devicesExposure2.copy(j, map);
    }

    public final long component1() {
        return this.timestamp;
    }

    public final Map<String, Object> component2() {
        return this.devicesExposure;
    }

    public final DevicesExposure copy(@JsonProperty("timestamp") long j, @JsonProperty("devices_exposure") Map<String, ? extends Object> map) {
        return new DevicesExposure(j, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DevicesExposure)) {
            return false;
        }
        DevicesExposure devicesExposure2 = (DevicesExposure) obj;
        return this.timestamp == devicesExposure2.timestamp && h.a(this.devicesExposure, devicesExposure2.devicesExposure);
    }

    public final Map<String, Object> getDevicesExposure() {
        return this.devicesExposure;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int a = e.a(this.timestamp) * 31;
        Map<String, Object> map = this.devicesExposure;
        return a + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        StringBuilder V0 = je.V0("DevicesExposure(timestamp=");
        V0.append(this.timestamp);
        V0.append(", devicesExposure=");
        return je.M0(V0, this.devicesExposure, ")");
    }
}
