package defpackage;

import com.fasterxml.jackson.annotation.JsonProperty;

/* access modifiers changed from: package-private */
/* renamed from: p1a  reason: default package */
public final class p1a extends q1a {
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final boolean h;

    p1a(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = z6;
        this.h = z7;
    }

    @Override // defpackage.q1a
    @JsonProperty("artist")
    public boolean artist() {
        return this.c;
    }

    @Override // defpackage.q1a
    @JsonProperty("covers")
    public boolean covers() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q1a)) {
            return false;
        }
        q1a q1a = (q1a) obj;
        if (this.b == q1a.name() && this.c == q1a.artist() && this.d == q1a.link() && this.e == q1a.covers() && this.f == q1a.playable() && this.g == q1a.playabilityRestriction() && this.h == q1a.is19PlusOnly()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = 1231;
        int i2 = ((((((((((((this.b ? 1231 : 1237) ^ 1000003) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003) ^ (this.d ? 1231 : 1237)) * 1000003) ^ (this.e ? 1231 : 1237)) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003) ^ (this.g ? 1231 : 1237)) * 1000003;
        if (!this.h) {
            i = 1237;
        }
        return i2 ^ i;
    }

    @Override // defpackage.q1a
    @JsonProperty("is19PlusOnly")
    public boolean is19PlusOnly() {
        return this.h;
    }

    @Override // defpackage.q1a
    @JsonProperty("link")
    public boolean link() {
        return this.d;
    }

    @Override // defpackage.q1a
    @JsonProperty("name")
    public boolean name() {
        return this.b;
    }

    @Override // defpackage.q1a
    @JsonProperty("playabilityRestriction")
    public boolean playabilityRestriction() {
        return this.g;
    }

    @Override // defpackage.q1a
    @JsonProperty("playable")
    public boolean playable() {
        return this.f;
    }

    public String toString() {
        StringBuilder V0 = je.V0("LikedSongsCardProviderPolicy{name=");
        V0.append(this.b);
        V0.append(", artist=");
        V0.append(this.c);
        V0.append(", link=");
        V0.append(this.d);
        V0.append(", covers=");
        V0.append(this.e);
        V0.append(", playable=");
        V0.append(this.f);
        V0.append(", playabilityRestriction=");
        V0.append(this.g);
        V0.append(", is19PlusOnly=");
        return je.P0(V0, this.h, "}");
    }
}
