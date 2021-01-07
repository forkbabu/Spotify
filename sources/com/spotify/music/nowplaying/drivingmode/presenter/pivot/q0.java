package com.spotify.music.nowplaying.drivingmode.presenter.pivot;

import com.spotify.music.nowplaying.drivingmode.view.pivot.n;

public abstract class q0 {

    public static final class a extends q0 {
        private final Throwable a;

        a(Throwable th) {
            th.getClass();
            this.a = th;
        }

        @Override // com.spotify.music.nowplaying.drivingmode.presenter.pivot.q0
        public final void a(si0<b> si0, si0<d> si02, si0<c> si03, si0<a> si04) {
            ((o) si04).accept(this);
        }

        public final Throwable b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            return ((a) obj).a.equals(this.a);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            return je.K0(je.V0("Error{throwable="), this.a, '}');
        }
    }

    public static final class b extends q0 {
        b() {
        }

        @Override // com.spotify.music.nowplaying.drivingmode.presenter.pivot.q0
        public final void a(si0<b> si0, si0<d> si02, si0<c> si03, si0<a> si04) {
            ((v) si0).a.e(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof b;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "InProgress{}";
        }
    }

    public static final class c extends q0 {
        c() {
        }

        @Override // com.spotify.music.nowplaying.drivingmode.presenter.pivot.q0
        public final void a(si0<b> si0, si0<d> si02, si0<c> si03, si0<a> si04) {
            ((w) si03).a.g(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof c;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "Offline{}";
        }
    }

    public static final class d extends q0 {
        private final n a;

        d(n nVar) {
            nVar.getClass();
            this.a = nVar;
        }

        @Override // com.spotify.music.nowplaying.drivingmode.presenter.pivot.q0
        public final void a(si0<b> si0, si0<d> si02, si0<c> si03, si0<a> si04) {
            ((t) si02).a.f(this);
        }

        public final n b() {
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
            StringBuilder V0 = je.V0("Successful{pivotItemList=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    q0() {
    }

    public abstract void a(si0<b> si0, si0<d> si02, si0<c> si03, si0<a> si04);
}
