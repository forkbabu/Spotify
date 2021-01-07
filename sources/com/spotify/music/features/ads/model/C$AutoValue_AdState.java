package com.spotify.music.features.ads.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: com.spotify.music.features.ads.model.$AutoValue_AdState  reason: invalid class name */
abstract class C$AutoValue_AdState extends AdState {
    private final State state;

    C$AutoValue_AdState(State state2) {
        if (state2 != null) {
            this.state = state2;
            return;
        }
        throw new NullPointerException("Null state");
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AdState) {
            return this.state.equals(((AdState) obj).getState());
        }
        return false;
    }

    @Override // com.spotify.music.features.ads.model.AdState
    @JsonProperty("state")
    public State getState() {
        return this.state;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return this.state.hashCode() ^ 1000003;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("AdState{state=");
        V0.append(this.state);
        V0.append("}");
        return V0.toString();
    }
}
