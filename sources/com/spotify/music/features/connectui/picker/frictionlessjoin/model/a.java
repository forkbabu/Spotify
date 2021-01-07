package com.spotify.music.features.connectui.picker.frictionlessjoin.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.jvm.internal.h;

public final class a {
    private final List<AvailableSessionDevice> a;

    public a(List<AvailableSessionDevice> list) {
        h.e(list, "discoveredDevices");
        this.a = list;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof a) && h.a(this.a, ((a) obj).a);
        }
        return true;
    }

    @JsonProperty("discovered_devices")
    public final List<AvailableSessionDevice> getDiscoveredDevices() {
        return this.a;
    }

    public int hashCode() {
        List<AvailableSessionDevice> list = this.a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public String toString() {
        return je.L0(je.V0("AvailableSessionsRequest(discoveredDevices="), this.a, ")");
    }
}
