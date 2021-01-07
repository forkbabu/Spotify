package com.spotify.music.nowplaying.drivingmode.view.connectionlabel;

public class BluetoothConnectionState {
    private final String a;
    private final State b;

    public enum State {
        CONNECTED,
        CONNECTED_UNKNOWN_DEVICE,
        DISCONNECTED
    }

    public BluetoothConnectionState(State state) {
        this.a = null;
        this.b = state;
    }

    public String a() {
        return this.a;
    }

    public State b() {
        return this.b;
    }

    public BluetoothConnectionState(State state, String str) {
        this.a = str;
        this.b = state;
    }
}
