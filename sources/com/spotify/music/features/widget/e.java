package com.spotify.music.features.widget;

import android.content.Intent;

public abstract class e {

    public static final class a extends e {
        a() {
        }

        public boolean equals(Object obj) {
            return obj instanceof a;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "PauseDisabled{}";
        }
    }

    public static final class b extends e {
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
            StringBuilder V0 = je.V0("PauseEnabled{intent=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    public static final class c extends e {
        c() {
        }

        public boolean equals(Object obj) {
            return obj instanceof c;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "PlayDisabled{}";
        }
    }

    public static final class d extends e {
        private final Intent a;

        d(Intent intent) {
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
            if (!(obj instanceof d)) {
                return false;
            }
            return ((d) obj).a.equals(this.a);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("PlayEnabled{intent=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    e() {
    }
}
