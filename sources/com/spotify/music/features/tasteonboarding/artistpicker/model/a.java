package com.spotify.music.features.tasteonboarding.artistpicker.model;

public abstract class a {

    /* renamed from: com.spotify.music.features.tasteonboarding.artistpicker.model.a$a  reason: collision with other inner class name */
    public static final class C0254a extends a {
        private final Throwable a;

        C0254a(Throwable th) {
            th.getClass();
            this.a = th;
        }

        @Override // com.spotify.music.features.tasteonboarding.artistpicker.model.a
        public final void c(si0<b> si0, si0<g> si02, si0<f> si03, si0<e> si04, si0<c> si05, si0<d> si06, si0<C0254a> si07) {
            ((mm8) si07).a.M2(this);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C0254a)) {
                return false;
            }
            return ((C0254a) obj).a.equals(this.a);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final Throwable i() {
            return this.a;
        }

        public String toString() {
            return je.K0(je.V0("Failed{throwable="), this.a, '}');
        }
    }

    public static final class b extends a {
        b() {
        }

        @Override // com.spotify.music.features.tasteonboarding.artistpicker.model.a
        public final void c(si0<b> si0, si0<g> si02, si0<f> si03, si0<e> si04, si0<c> si05, si0<d> si06, si0<C0254a> si07) {
            ((km8) si0).a.H2(this);
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

    public static final class c extends a {
        c() {
        }

        @Override // com.spotify.music.features.tasteonboarding.artistpicker.model.a
        public final void c(si0<b> si0, si0<g> si02, si0<f> si03, si0<e> si04, si0<c> si05, si0<d> si06, si0<C0254a> si07) {
            ((hm8) si05).a.K2(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof c;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "OfflineWithLikedContent{}";
        }
    }

    public static final class d extends a {
        d() {
        }

        @Override // com.spotify.music.features.tasteonboarding.artistpicker.model.a
        public final void c(si0<b> si0, si0<g> si02, si0<f> si03, si0<e> si04, si0<c> si05, si0<d> si06, si0<C0254a> si07) {
            ((pm8) si06).a.L2(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof d;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "OfflineWithoutLikedContent{}";
        }
    }

    public static final class e extends a {
        e() {
        }

        @Override // com.spotify.music.features.tasteonboarding.artistpicker.model.a
        public final void c(si0<b> si0, si0<g> si02, si0<f> si03, si0<e> si04, si0<c> si05, si0<d> si06, si0<C0254a> si07) {
            ((qm8) si04).a.J2(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof e;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "OnlineWithLoadedContent{}";
        }
    }

    public static final class f extends a {
        f() {
        }

        @Override // com.spotify.music.features.tasteonboarding.artistpicker.model.a
        public final void c(si0<b> si0, si0<g> si02, si0<f> si03, si0<e> si04, si0<c> si05, si0<d> si06, si0<C0254a> si07) {
        }

        public boolean equals(Object obj) {
            return obj instanceof f;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "ShowedPickerView{}";
        }
    }

    public static final class g extends a {
        private final ArtistPickerResponse a;

        g(ArtistPickerResponse artistPickerResponse) {
            artistPickerResponse.getClass();
            this.a = artistPickerResponse;
        }

        @Override // com.spotify.music.features.tasteonboarding.artistpicker.model.a
        public final void c(si0<b> si0, si0<g> si02, si0<f> si03, si0<e> si04, si0<c> si05, si0<d> si06, si0<C0254a> si07) {
            ((nm8) si02).a.I2(this);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            return ((g) obj).a.equals(this.a);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final ArtistPickerResponse i() {
            return this.a;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Successful{response=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    a() {
    }

    public static a a(Throwable th) {
        return new C0254a(th);
    }

    public static a b() {
        return new b();
    }

    public static a d() {
        return new c();
    }

    public static a e() {
        return new d();
    }

    public static a f() {
        return new e();
    }

    public static a g() {
        return new f();
    }

    public static a h(ArtistPickerResponse artistPickerResponse) {
        return new g(artistPickerResponse);
    }

    public abstract void c(si0<b> si0, si0<g> si02, si0<f> si03, si0<e> si04, si0<c> si05, si0<d> si06, si0<C0254a> si07);
}
