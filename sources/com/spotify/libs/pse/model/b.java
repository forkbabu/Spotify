package com.spotify.libs.pse.model;

import kotlin.jvm.internal.f;

public abstract class b {

    public static final class a extends b {
        private final int a;

        public a() {
            super(null);
            this.a = 3;
        }

        public final int a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof a) && this.a == ((a) obj).a;
            }
            return true;
        }

        public int hashCode() {
            return this.a;
        }

        public String toString() {
            return je.B0(je.V0("Expandable(minimisedCount="), this.a, ")");
        }

        public a(int i) {
            super(null);
            this.a = i;
        }
    }

    /* renamed from: com.spotify.libs.pse.model.b$b  reason: collision with other inner class name */
    public static final class C0167b extends b {
        public static final C0167b a = new C0167b();

        private C0167b() {
            super(null);
        }
    }

    public b(f fVar) {
    }
}
