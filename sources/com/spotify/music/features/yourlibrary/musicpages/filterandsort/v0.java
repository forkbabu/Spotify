package com.spotify.music.features.yourlibrary.musicpages.filterandsort;

import com.google.common.collect.ImmutableMap;
import com.spotify.music.features.yourlibrary.musicpages.filterandsort.d1;

final class v0 extends d1.c {
    private final di9 a;
    private final ImmutableMap<String, Boolean> b;

    v0(di9 di9, ImmutableMap<String, Boolean> immutableMap) {
        if (di9 != null) {
            this.a = di9;
            if (immutableMap != null) {
                this.b = immutableMap;
                return;
            }
            throw new NullPointerException("Null activeFilterStates");
        }
        throw new NullPointerException("Null filterAndSortConfiguration");
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.music.features.yourlibrary.musicpages.filterandsort.d1.c
    public ImmutableMap<String, Boolean> a() {
        return this.b;
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.music.features.yourlibrary.musicpages.filterandsort.d1.c
    public di9 b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d1.c)) {
            return false;
        }
        d1.c cVar = (d1.c) obj;
        if (!this.a.equals(cVar.b()) || !this.b.equals(cVar.a())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("FilterUpdateParams{filterAndSortConfiguration=");
        V0.append(this.a);
        V0.append(", activeFilterStates=");
        V0.append(this.b);
        V0.append("}");
        return V0.toString();
    }
}
