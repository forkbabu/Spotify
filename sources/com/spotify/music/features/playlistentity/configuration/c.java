package com.spotify.music.features.playlistentity.configuration;

import kotlin.jvm.internal.h;

public final class c {
    public static final c b = null;
    private final b66 a;

    public static final class a {
        private b66 a = null;

        public a() {
        }

        public final c a() {
            b66 b66 = this.a;
            h.c(b66);
            return new c(b66);
        }

        public final a b(b66 b66) {
            this.a = b66;
            return this;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof a) && h.a(this.a, ((a) obj).a);
            }
            return true;
        }

        public int hashCode() {
            b66 b66 = this.a;
            if (b66 != null) {
                return b66.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Builder(playButtonBehavior=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }

        public a(b66 b66, int i) {
            int i2 = i & 1;
        }
    }

    static {
        h.e(new b66(false, false, false, false, 15), "playButtonBehavior");
    }

    public c(b66 b66) {
        h.e(b66, "playButtonBehavior");
        this.a = b66;
    }

    public final b66 a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof c) && h.a(this.a, ((c) obj).a);
        }
        return true;
    }

    public int hashCode() {
        b66 b66 = this.a;
        if (b66 != null) {
            return b66.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder V0 = je.V0("InlinePlayButtonConfiguration(playButtonBehavior=");
        V0.append(this.a);
        V0.append(")");
        return V0.toString();
    }
}
