package com.spotify.music.nowplaying.common.view.ban;

/* access modifiers changed from: package-private */
public final class c extends d {
    private final boolean a;

    c(boolean z) {
        this.a = z;
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.music.nowplaying.common.view.ban.d
    public boolean a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d) || this.a != ((d) obj).a()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.a ? 1231 : 1237) ^ 1000003;
    }

    public String toString() {
        return je.P0(je.V0("BanButtonConfiguration{shouldShowFeedback="), this.a, "}");
    }
}
