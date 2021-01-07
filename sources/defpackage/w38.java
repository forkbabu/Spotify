package defpackage;

/* renamed from: w38  reason: default package */
public abstract class w38 {

    /* renamed from: w38$a */
    public static final class a extends w38 {
        private final b91 a;

        a(b91 b91) {
            b91.getClass();
            this.a = b91;
        }

        @Override // defpackage.w38
        public final void a(si0<b> si0, si0<a> si02, si0<c> si03) {
            ((com.spotify.music.features.radiohub.view.c) si02).accept(this);
        }

        public final b91 c() {
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
            StringBuilder V0 = je.V0("Error{hubsViewModel=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: w38$b */
    public static final class b extends w38 {
        b() {
        }

        @Override // defpackage.w38
        public final void a(si0<b> si0, si0<a> si02, si0<c> si03) {
            ((com.spotify.music.features.radiohub.view.a) si0).accept(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof b;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "Loading{}";
        }
    }

    /* renamed from: w38$c */
    public static final class c extends w38 {
        private final b91 a;

        c(b91 b91) {
            b91.getClass();
            this.a = b91;
        }

        @Override // defpackage.w38
        public final void a(si0<b> si0, si0<a> si02, si0<c> si03) {
            ((com.spotify.music.features.radiohub.view.b) si03).accept(this);
        }

        public final b91 c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            return ((c) obj).a.equals(this.a);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("WithData{hubsViewModel=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    w38() {
    }

    public static w38 b(b91 b91) {
        return new c(b91);
    }

    public abstract void a(si0<b> si0, si0<a> si02, si0<c> si03);
}
