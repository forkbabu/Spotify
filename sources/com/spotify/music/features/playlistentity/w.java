package com.spotify.music.features.playlistentity;

import io.reactivex.s;

public interface w {

    public interface a {
        int a(int i);
    }

    public static final class b {
        private final int a;
        private final int b;

        public b(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public final int a() {
            return this.b;
        }

        public final int b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b;
        }

        public int hashCode() {
            return (this.a * 31) + this.b;
        }

        public String toString() {
            StringBuilder V0 = je.V0("SectionAndPosition(sectionId=");
            V0.append(this.a);
            V0.append(", positionWithinSection=");
            return je.B0(V0, this.b, ")");
        }
    }

    s<b> b();

    void c(int i, int i2);

    int d(b bVar);

    void e(a aVar);
}
