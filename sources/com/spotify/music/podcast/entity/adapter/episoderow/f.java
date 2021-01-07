package com.spotify.music.podcast.entity.adapter.episoderow;

import kotlin.jvm.internal.h;

public interface f {

    public static final class a {
        private final String a;
        private final int b;
        private final int c;
        private final int d;
        private final boolean e;
        private final boolean f;

        public a(String str, int i, int i2, int i3, boolean z, boolean z2) {
            h.e(str, "showName");
            this.a = str;
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = z;
            this.f = z2;
        }

        public final int a() {
            return this.c;
        }

        public final int b() {
            return this.d;
        }

        public final int c() {
            return this.b;
        }

        public final String d() {
            return this.a;
        }

        public final boolean e() {
            return this.f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return h.a(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d && this.e == aVar.e && this.f == aVar.f;
        }

        public final boolean f() {
            return this.e;
        }

        public int hashCode() {
            String str = this.a;
            int hashCode = (((((((str != null ? str.hashCode() : 0) * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31;
            boolean z = this.e;
            int i = 1;
            if (z) {
                z = true;
            }
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = (hashCode + i2) * 31;
            boolean z2 = this.f;
            if (!z2) {
                i = z2 ? 1 : 0;
            }
            return i5 + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("InputModel(showName=");
            V0.append(this.a);
            V0.append(", publishDateInSec=");
            V0.append(this.b);
            V0.append(", episodeLengthInSec=");
            V0.append(this.c);
            V0.append(", episodeTimeLeftInSec=");
            V0.append(this.d);
            V0.append(", isFullyPlayed=");
            V0.append(this.e);
            V0.append(", isActive=");
            return je.P0(V0, this.f, ")");
        }
    }

    CharSequence a(a aVar);
}
