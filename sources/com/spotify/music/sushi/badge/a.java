package com.spotify.music.sushi.badge;

import com.spotify.encore.Element;
import kotlin.f;

public interface a extends Element<C0351a, f> {

    /* renamed from: com.spotify.music.sushi.badge.a$a  reason: collision with other inner class name */
    public static final class C0351a {
        private final boolean a;
        private final boolean b;

        public C0351a(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }

        public final boolean a() {
            return this.b;
        }

        public final boolean b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0351a)) {
                return false;
            }
            C0351a aVar = (C0351a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public int hashCode() {
            boolean z = this.a;
            int i = 1;
            if (z) {
                z = true;
            }
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = i2 * 31;
            boolean z2 = this.b;
            if (!z2) {
                i = z2 ? 1 : 0;
            }
            return i5 + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Model(isVisible=");
            V0.append(this.a);
            V0.append(", isActivated=");
            return je.P0(V0, this.b, ")");
        }
    }
}
