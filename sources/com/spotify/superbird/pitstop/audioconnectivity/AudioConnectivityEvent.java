package com.spotify.superbird.pitstop.audioconnectivity;

import kotlin.Pair;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

public final class AudioConnectivityEvent extends lpe {

    public enum State {
        AUX("aux"),
        BLUETOOTH("bluetooth"),
        NONE("none");
        
        private final String stateString;

        private State(String str) {
            this.stateString = str;
        }

        public final String d() {
            return this.stateString;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AudioConnectivityEvent(State state, String str, long j) {
        super(d.y(new Pair("type", "audio_connectivity"), new Pair("state", state.d()), new Pair("device_name", str), new Pair("timestamp", Long.valueOf(j))));
        h.e(state, "state");
        h.e(str, "deviceName");
    }
}
