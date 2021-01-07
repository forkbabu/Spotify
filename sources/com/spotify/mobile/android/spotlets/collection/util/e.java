package com.spotify.mobile.android.spotlets.collection.util;

import com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider;

final class e extends CollectionStateProvider.a {
    private final boolean a;
    private final boolean b;

    e(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    @Override // com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider.a
    public boolean a() {
        return this.b;
    }

    @Override // com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider.a
    public boolean b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CollectionStateProvider.a)) {
            return false;
        }
        CollectionStateProvider.a aVar = (CollectionStateProvider.a) obj;
        if (this.a == aVar.b() && this.b == aVar.a()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = 1231;
        int i2 = ((this.a ? 1231 : 1237) ^ 1000003) * 1000003;
        if (!this.b) {
            i = 1237;
        }
        return i2 ^ i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("CollectionState{inCollection=");
        V0.append(this.a);
        V0.append(", banned=");
        return je.P0(V0, this.b, "}");
    }
}
