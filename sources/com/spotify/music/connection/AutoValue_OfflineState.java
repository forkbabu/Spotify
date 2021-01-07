package com.spotify.music.connection;

import com.spotify.music.connection.OfflineState;

/* access modifiers changed from: package-private */
public final class AutoValue_OfflineState extends OfflineState {
    private final OfflineState.State offlineState;

    AutoValue_OfflineState(OfflineState.State state) {
        if (state != null) {
            this.offlineState = state;
            return;
        }
        throw new NullPointerException("Null offlineState");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof OfflineState) {
            return this.offlineState.equals(((OfflineState) obj).offlineState());
        }
        return false;
    }

    public int hashCode() {
        return this.offlineState.hashCode() ^ 1000003;
    }

    @Override // com.spotify.music.connection.OfflineState
    public OfflineState.State offlineState() {
        return this.offlineState;
    }

    public String toString() {
        StringBuilder V0 = je.V0("OfflineState{offlineState=");
        V0.append(this.offlineState);
        V0.append("}");
        return V0.toString();
    }
}
