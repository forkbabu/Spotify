package com.spotify.music.newplaying.scroll.container;

import com.spotify.music.newplaying.scroll.NowPlayingWidget;

/* access modifiers changed from: package-private */
public final class z extends a0 {
    private final NowPlayingWidget.Type a;
    private final int b;
    private final float c;

    z(NowPlayingWidget.Type type, int i, float f) {
        if (type != null) {
            this.a = type;
            this.b = i;
            this.c = f;
            return;
        }
        throw new NullPointerException("Null widgetType");
    }

    @Override // com.spotify.music.newplaying.scroll.container.a0
    public float a() {
        return this.c;
    }

    @Override // com.spotify.music.newplaying.scroll.container.a0
    public int b() {
        return this.b;
    }

    @Override // com.spotify.music.newplaying.scroll.container.a0
    public NowPlayingWidget.Type c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        if (this.a.equals(a0Var.c()) && this.b == a0Var.b() && Float.floatToIntBits(this.c) == Float.floatToIntBits(a0Var.a())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ Float.floatToIntBits(this.c);
    }

    public String toString() {
        StringBuilder V0 = je.V0("WidgetVisibilityEvent{widgetType=");
        V0.append(this.a);
        V0.append(", widgetIndex=");
        V0.append(this.b);
        V0.append(", globalVisibilityRatio=");
        V0.append(this.c);
        V0.append("}");
        return V0.toString();
    }
}
