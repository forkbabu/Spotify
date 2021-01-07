package com.spotify.music.features.showentity;

import android.os.Bundle;
import com.google.common.base.Optional;

public abstract class r {

    public static final class a extends r {
        a() {
        }

        public boolean equals(Object obj) {
            return obj instanceof a;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "LoadTimeoutTimer{}";
        }
    }

    public static final class b extends r {
        private final String a;

        b(String str) {
            str.getClass();
            this.a = str;
        }

        public final String a() {
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
            return je.H0(je.V0("LookupMetadata{uri="), this.a, '}');
        }
    }

    public static final class c extends r {
        private final String a;
        private final Optional<Bundle> b;

        c(String str, Optional<Bundle> optional) {
            str.getClass();
            this.a = str;
            optional.getClass();
            this.b = optional;
        }

        public final Optional<Bundle> a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (!cVar.a.equals(this.a) || !cVar.b.equals(this.b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.b.hashCode() + je.Y0(this.a, 0, 31);
        }

        public String toString() {
            StringBuilder V0 = je.V0("Navigate{uri=");
            V0.append(this.a);
            V0.append(", extras=");
            V0.append(this.b);
            V0.append('}');
            return V0.toString();
        }
    }

    public static final class d extends r {
        private final String a;
        private final Throwable b;

        d(String str, Throwable th) {
            str.getClass();
            this.a = str;
            th.getClass();
            this.b = th;
        }

        public final Throwable a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (!dVar.a.equals(this.a) || !dVar.b.equals(this.b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.b.hashCode() + je.Y0(this.a, 0, 31);
        }

        public String toString() {
            StringBuilder V0 = je.V0("ShowError{uri=");
            V0.append(this.a);
            V0.append(", error=");
            return je.K0(V0, this.b, '}');
        }
    }

    r() {
    }
}
