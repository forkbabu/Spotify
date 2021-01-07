package com.spotify.music.features.ads.rules;

import com.spotify.music.features.ads.rules.AdRules;

public class j {
    AdRules.StateType a;
    boolean b;

    public j(AdRules.StateType stateType, boolean z) {
        this.a = stateType;
        this.b = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.b == jVar.b && this.a == jVar.a;
    }

    public int hashCode() {
        AdRules.StateType stateType = this.a;
        return ((stateType != null ? stateType.hashCode() : 0) * 31) + (this.b ? 1 : 0);
    }

    public String toString() {
        StringBuilder V0 = je.V0("BooleanAdState{mState=");
        V0.append(this.a);
        V0.append(", mActive=");
        return je.O0(V0, this.b, '}');
    }
}
