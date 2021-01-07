package com.spotify.superbird.ota.model;

import java.util.List;

/* access modifiers changed from: package-private */
public final class d extends h {
    private final String a;
    private final List<g> b;
    private final boolean c;

    d(String str, List<g> list, boolean z) {
        if (str != null) {
            this.a = str;
            if (list != null) {
                this.b = list;
                this.c = z;
                return;
            }
            throw new NullPointerException("Null updatableItems");
        }
        throw new NullPointerException("Null serial");
    }

    @Override // com.spotify.superbird.ota.model.h
    public boolean b() {
        return this.c;
    }

    @Override // com.spotify.superbird.ota.model.h
    public String c() {
        return this.a;
    }

    @Override // com.spotify.superbird.ota.model.h
    public List<g> d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (!this.a.equals(hVar.c()) || !this.b.equals(hVar.d()) || this.c != hVar.b()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (this.c ? 1231 : 1237);
    }

    public String toString() {
        StringBuilder V0 = je.V0("UpdatableItemAutoDownloadable{serial=");
        V0.append(this.a);
        V0.append(", updatableItems=");
        V0.append(this.b);
        V0.append(", isAutoUpdatable=");
        return je.P0(V0, this.c, "}");
    }
}
