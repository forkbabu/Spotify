package com.spotify.libs.connect.volume;

import kotlin.f;
import kotlin.jvm.internal.h;

public interface c {

    public static abstract class a {

        /* renamed from: com.spotify.libs.connect.volume.c$a$a  reason: collision with other inner class name */
        public static final class C0163a extends a {
            private final float a;
            private final cmf<f> b;

            public C0163a(float f, cmf<f> cmf) {
                super(null);
                this.a = f;
                this.b = cmf;
            }

            public final cmf<f> a() {
                return this.b;
            }

            public final float b() {
                return this.a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0163a)) {
                    return false;
                }
                C0163a aVar = (C0163a) obj;
                return Float.compare(this.a, aVar.a) == 0 && h.a(this.b, aVar.b);
            }

            public int hashCode() {
                int floatToIntBits = Float.floatToIntBits(this.a) * 31;
                cmf<f> cmf = this.b;
                return floatToIntBits + (cmf != null ? cmf.hashCode() : 0);
            }

            public String toString() {
                StringBuilder V0 = je.V0("Set(volume=");
                V0.append(this.a);
                V0.append(", callback=");
                V0.append(this.b);
                V0.append(")");
                return V0.toString();
            }
        }

        private a() {
        }

        public a(kotlin.jvm.internal.f fVar) {
        }
    }

    void b(float f, cmf<f> cmf);
}
