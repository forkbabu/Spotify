package com.spotify.nowplaying.ui.components.overlay;

/* access modifiers changed from: package-private */
public final class f extends j {
    private final OverlayDisplayMode a;
    private final boolean b;

    f(OverlayDisplayMode overlayDisplayMode, boolean z) {
        if (overlayDisplayMode != null) {
            this.a = overlayDisplayMode;
            this.b = z;
            return;
        }
        throw new NullPointerException("Null overlayDisplayMode");
    }

    @Override // com.spotify.nowplaying.ui.components.overlay.j
    public OverlayDisplayMode b() {
        return this.a;
    }

    @Override // com.spotify.nowplaying.ui.components.overlay.j
    public boolean c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (!this.a.equals(jVar.b()) || this.b != jVar.c()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237);
    }

    public String toString() {
        StringBuilder V0 = je.V0("OverlayConfiguration{overlayDisplayMode=");
        V0.append(this.a);
        V0.append(", shouldShowBackground=");
        return je.P0(V0, this.b, "}");
    }
}
