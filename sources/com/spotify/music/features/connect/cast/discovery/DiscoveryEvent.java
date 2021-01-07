package com.spotify.music.features.connect.cast.discovery;

public class DiscoveryEvent {
    public final EventType a;
    public final DiscoveredDevice b;

    public enum EventType {
        DISCOVER,
        LOST
    }

    public DiscoveryEvent(EventType eventType, DiscoveredDevice discoveredDevice) {
        this.a = eventType;
        this.b = discoveredDevice;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DiscoveryEvent)) {
            return false;
        }
        DiscoveryEvent discoveryEvent = (DiscoveryEvent) obj;
        if (this.a != discoveryEvent.a || !this.b.equals(discoveryEvent.b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
