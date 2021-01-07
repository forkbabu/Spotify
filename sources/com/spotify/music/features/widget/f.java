package com.spotify.music.features.widget;

import android.content.Intent;

public abstract class f {

    public static final class a extends f {
        a() {
        }

        public boolean equals(Object obj) {
            return obj instanceof a;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "Disabled{}";
        }
    }

    public static final class b extends f {
        private final Intent a;

        b(Intent intent) {
            intent.getClass();
            this.a = intent;
        }

        public final Intent a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            return ((b) obj).a.equals(this.a);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Enabled{intent=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    f() {
    }
}
