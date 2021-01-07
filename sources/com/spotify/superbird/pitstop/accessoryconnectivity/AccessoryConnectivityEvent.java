package com.spotify.superbird.pitstop.accessoryconnectivity;

import kotlin.Pair;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

public final class AccessoryConnectivityEvent extends lpe {

    public enum Event {
        CONNECTED("connected"),
        DISCONNECTED("disconnected");
        
        private final String eventString;

        private Event(String str) {
            this.eventString = str;
        }

        public final String d() {
            return this.eventString;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccessoryConnectivityEvent(Event event, String str, long j) {
        super(d.y(new Pair("type", "accessory_connectivity"), new Pair("event", event.d()), new Pair("user_agent", str), new Pair("timestamp", Long.valueOf(j))));
        h.e(event, "event");
        h.e(str, "userAgent");
    }
}
