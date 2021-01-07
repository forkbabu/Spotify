package com.spotify.music.features.wrapped2020.stories.templates.storyofyoursong;

import com.spotify.player.model.ContextTrack;
import kotlin.jvm.internal.h;

public final class a {
    private final yz8 a;
    private final yz8 b;

    public a(yz8 yz8, yz8 yz82) {
        h.e(yz8, "title");
        h.e(yz82, ContextTrack.Metadata.KEY_SUBTITLE);
        this.a = yz8;
        this.b = yz82;
    }

    public final yz8 a() {
        return this.b;
    }

    public final yz8 b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return h.a(this.a, aVar.a) && h.a(this.b, aVar.b);
    }

    public int hashCode() {
        yz8 yz8 = this.a;
        int i = 0;
        int hashCode = (yz8 != null ? yz8.hashCode() : 0) * 31;
        yz8 yz82 = this.b;
        if (yz82 != null) {
            i = yz82.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("Statistic(title=");
        V0.append(this.a);
        V0.append(", subtitle=");
        V0.append(this.b);
        V0.append(")");
        return V0.toString();
    }
}
