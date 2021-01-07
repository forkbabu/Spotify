package com.spotify.music.features.connectui.picker.frictionlessjoin.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.Map;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonSerialize(as = DevicesExposure.class)
public final class DevicesExposure implements JacksonModel {
    private final Map<String, DeviceExposureStatus> devicesExposure;
    private final Long timestamp;

    public DevicesExposure() {
        this(null, null, 3, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Map<java.lang.String, ? extends com.spotify.music.features.connectui.picker.frictionlessjoin.model.DeviceExposureStatus> */
    /* JADX WARN: Multi-variable type inference failed */
    public DevicesExposure(@JsonProperty("timestamp") Long l, @JsonProperty("devices_exposure") Map<String, ? extends DeviceExposureStatus> map) {
        this.timestamp = l;
        this.devicesExposure = map;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.spotify.music.features.connectui.picker.frictionlessjoin.model.DevicesExposure */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DevicesExposure copy$default(DevicesExposure devicesExposure2, Long l, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            l = devicesExposure2.timestamp;
        }
        if ((i & 2) != 0) {
            map = devicesExposure2.devicesExposure;
        }
        return devicesExposure2.copy(l, map);
    }

    public final Long component1() {
        return this.timestamp;
    }

    public final Map<String, DeviceExposureStatus> component2() {
        return this.devicesExposure;
    }

    public final DevicesExposure copy(@JsonProperty("timestamp") Long l, @JsonProperty("devices_exposure") Map<String, ? extends DeviceExposureStatus> map) {
        return new DevicesExposure(l, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DevicesExposure)) {
            return false;
        }
        DevicesExposure devicesExposure2 = (DevicesExposure) obj;
        return h.a(this.timestamp, devicesExposure2.timestamp) && h.a(this.devicesExposure, devicesExposure2.devicesExposure);
    }

    public final Map<String, DeviceExposureStatus> getDevicesExposure() {
        return this.devicesExposure;
    }

    public final Long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        Long l = this.timestamp;
        int i = 0;
        int hashCode = (l != null ? l.hashCode() : 0) * 31;
        Map<String, DeviceExposureStatus> map = this.devicesExposure;
        if (map != null) {
            i = map.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("DevicesExposure(timestamp=");
        V0.append(this.timestamp);
        V0.append(", devicesExposure=");
        return je.M0(V0, this.devicesExposure, ")");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DevicesExposure(Long l, Map map, int i, f fVar) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : map);
    }
}
