package com.spotify.music.nowplaying.common.view.heart;

/* access modifiers changed from: package-private */
public final class e extends f {
    private final boolean a;
    private final boolean b;

    e(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.music.nowplaying.common.view.heart.f
    public boolean a() {
        return this.b;
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.music.nowplaying.common.view.heart.f
    public boolean b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.a == fVar.b() && this.b == fVar.a()) {
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
        StringBuilder V0 = je.V0("HeartButtonConfiguration{shouldShowFeedback=");
        V0.append(this.a);
        V0.append(", shouldAnimateHeart=");
        return je.P0(V0, this.b, "}");
    }
}
