package com.spotify.music.connection;

import com.spotify.mobile.android.ui.fragments.l;
import com.spotify.mobile.android.ui.fragments.n;
import com.spotify.mobile.android.ui.fragments.o;

public abstract class g {

    public static final class a extends g {
        a() {
        }

        @Override // com.spotify.music.connection.g
        public final <R_> R_ a(ti0<c, R_> ti0, ti0<b, R_> ti02, ti0<a, R_> ti03) {
            return ti03.apply(this);
        }

        @Override // com.spotify.music.connection.g
        public final void b(si0<c> si0, si0<b> si02, si0<a> si03) {
            ((l) si03).a.N4(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof a;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "Connecting{}";
        }
    }

    public static final class b extends g {
        private final OfflineReason a;

        b(OfflineReason offlineReason) {
            offlineReason.getClass();
            this.a = offlineReason;
        }

        @Override // com.spotify.music.connection.g
        public final <R_> R_ a(ti0<c, R_> ti0, ti0<b, R_> ti02, ti0<a, R_> ti03) {
            return ti02.apply(this);
        }

        @Override // com.spotify.music.connection.g
        public final void b(si0<c> si0, si0<b> si02, si0<a> si03) {
            ((o) si02).a.M4(this);
        }

        public final OfflineReason d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if ((obj instanceof b) && ((b) obj).a == this.a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Offline{reason=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    public static final class c extends g {
        c() {
        }

        @Override // com.spotify.music.connection.g
        public final <R_> R_ a(ti0<c, R_> ti0, ti0<b, R_> ti02, ti0<a, R_> ti03) {
            return ti0.apply(this);
        }

        @Override // com.spotify.music.connection.g
        public final void b(si0<c> si0, si0<b> si02, si0<a> si03) {
            ((n) si0).a.L4(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof c;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "Online{}";
        }
    }

    g() {
    }

    public static g c() {
        return new c();
    }

    public abstract <R_> R_ a(ti0<c, R_> ti0, ti0<b, R_> ti02, ti0<a, R_> ti03);

    public abstract void b(si0<c> si0, si0<b> si02, si0<a> si03);
}
