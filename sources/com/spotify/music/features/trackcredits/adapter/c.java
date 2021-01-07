package com.spotify.music.features.trackcredits.adapter;

import com.google.common.base.Optional;
import com.spotify.music.features.trackcredits.adapter.TrackCreditsAdapter;

/* access modifiers changed from: package-private */
public final class c extends d {
    private final String a;
    private final Optional<String> b;
    private final TrackCreditsAdapter.ViewType c;

    c(String str, Optional<String> optional, TrackCreditsAdapter.ViewType viewType) {
        if (str != null) {
            this.a = str;
            this.b = optional;
            if (viewType != null) {
                this.c = viewType;
                return;
            }
            throw new NullPointerException("Null viewType");
        }
        throw new NullPointerException("Null text");
    }

    @Override // com.spotify.music.features.trackcredits.adapter.d
    public Optional<String> c() {
        return this.b;
    }

    @Override // com.spotify.music.features.trackcredits.adapter.d
    public String d() {
        return this.a;
    }

    @Override // com.spotify.music.features.trackcredits.adapter.d
    public TrackCreditsAdapter.ViewType e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (!this.a.equals(dVar.d()) || !this.b.equals(dVar.c()) || !this.c.equals(dVar.e())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("CreditRowModel{text=");
        V0.append(this.a);
        V0.append(", externalUrl=");
        V0.append(this.b);
        V0.append(", viewType=");
        V0.append(this.c);
        V0.append("}");
        return V0.toString();
    }
}
