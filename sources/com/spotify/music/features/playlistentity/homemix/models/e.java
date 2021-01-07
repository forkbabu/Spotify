package com.spotify.music.features.playlistentity.homemix.models;

/* access modifiers changed from: package-private */
public final class e extends i {
    private final boolean a;
    private final boolean b;
    private final boolean c;

    e(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    @Override // com.spotify.music.features.playlistentity.homemix.models.i
    public boolean b() {
        return this.b;
    }

    @Override // com.spotify.music.features.playlistentity.homemix.models.i
    public boolean c() {
        return this.c;
    }

    @Override // com.spotify.music.features.playlistentity.homemix.models.i
    public boolean d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.a == iVar.d() && this.b == iVar.b() && this.c == iVar.c()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = 1231;
        int i2 = ((((this.a ? 1231 : 1237) ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237)) * 1000003;
        if (!this.c) {
            i = 1237;
        }
        return i2 ^ i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("HomeMixUserSettings{userEnabled=");
        V0.append(this.a);
        V0.append(", includeExplicit=");
        V0.append(this.b);
        V0.append(", isFamilyMember=");
        return je.P0(V0, this.c, "}");
    }
}
