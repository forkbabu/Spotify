package defpackage;

import com.google.common.base.Optional;
import java.util.Arrays;

/* renamed from: r1f  reason: default package */
public abstract class r1f {

    /* renamed from: r1f$a */
    public static final class a extends r1f {
        private final o1f a;

        a(o1f o1f) {
            o1f.getClass();
            this.a = o1f;
        }

        @Override // defpackage.r1f
        public final void e(si0<c> si0, si0<g> si02, si0<d> si03, si0<h> si04, si0<f> si05, si0<b> si06, si0<a> si07, si0<e> si08) {
            ((ize) si07).accept(this);
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

        public final o1f j() {
            return this.a;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Error{voiceErrorState=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: r1f$b */
    public static final class b extends r1f {
        private final String[] a;

        b(String[] strArr) {
            strArr.getClass();
            this.a = strArr;
        }

        @Override // defpackage.r1f
        public final void e(si0<c> si0, si0<g> si02, si0<d> si03, si0<h> si04, si0<f> si05, si0<b> si06, si0<a> si07, si0<e> si08) {
            ((jze) si06).accept(this);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            return Arrays.equals(((b) obj).a, this.a);
        }

        public int hashCode() {
            return 0 + Arrays.hashCode(this.a);
        }

        public final String[] j() {
            return this.a;
        }

        public String toString() {
            return je.H0(je.V0("Idle{suggestions="), Arrays.toString(this.a), '}');
        }
    }

    /* renamed from: r1f$c */
    public static final class c extends r1f {
        c() {
        }

        @Override // defpackage.r1f
        public final void e(si0<c> si0, si0<g> si02, si0<d> si03, si0<h> si04, si0<f> si05, si0<b> si06, si0<a> si07, si0<e> si08) {
            ((lze) si0).accept(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof c;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "Init{}";
        }
    }

    /* renamed from: r1f$d */
    public static final class d extends r1f {
        private final String a;

        d(String str) {
            str.getClass();
            this.a = str;
        }

        @Override // defpackage.r1f
        public final void e(si0<c> si0, si0<g> si02, si0<d> si03, si0<h> si04, si0<f> si05, si0<b> si06, si0<a> si07, si0<e> si08) {
            ((nze) si03).accept(this);
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

        public final String j() {
            return this.a;
        }

        public String toString() {
            return je.H0(je.V0("Listening{transcription="), this.a, '}');
        }
    }

    /* renamed from: r1f$e */
    public static final class e extends r1f {
        e() {
        }

        @Override // defpackage.r1f
        public final void e(si0<c> si0, si0<g> si02, si0<d> si03, si0<h> si04, si0<f> si05, si0<b> si06, si0<a> si07, si0<e> si08) {
        }

        public boolean equals(Object obj) {
            return obj instanceof e;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "NoChange{}";
        }
    }

    /* renamed from: r1f$f */
    public static final class f extends r1f {
        private final com.spotify.voice.results.model.e a;

        f(com.spotify.voice.results.model.e eVar) {
            eVar.getClass();
            this.a = eVar;
        }

        @Override // defpackage.r1f
        public final void e(si0<c> si0, si0<g> si02, si0<d> si03, si0<h> si04, si0<f> si05, si0<b> si06, si0<a> si07, si0<e> si08) {
            ((mze) si05).accept(this);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            return ((f) obj).a.equals(this.a);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final com.spotify.voice.results.model.e j() {
            return this.a;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Results{model=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: r1f$g */
    public static final class g extends r1f {
        private final Optional<String> a;

        g(Optional<String> optional) {
            optional.getClass();
            this.a = optional;
        }

        @Override // defpackage.r1f
        public final void e(si0<c> si0, si0<g> si02, si0<d> si03, si0<h> si04, si0<f> si05, si0<b> si06, si0<a> si07, si0<e> si08) {
            ((tze) si02).accept(this);
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

        public final Optional<String> j() {
            return this.a;
        }

        public String toString() {
            StringBuilder V0 = je.V0("StartListening{suggestion=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: r1f$h */
    public static final class h extends r1f {
        private final String a;

        h(String str) {
            str.getClass();
            this.a = str;
        }

        @Override // defpackage.r1f
        public final void e(si0<c> si0, si0<g> si02, si0<d> si03, si0<h> si04, si0<f> si05, si0<b> si06, si0<a> si07, si0<e> si08) {
            ((wze) si04).accept(this);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            return ((h) obj).a.equals(this.a);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String j() {
            return this.a;
        }

        public String toString() {
            return je.H0(je.V0("Thinking{transcription="), this.a, '}');
        }
    }

    r1f() {
    }

    public static r1f a(o1f o1f) {
        return new a(o1f);
    }

    public static r1f b(String[] strArr) {
        return new b(strArr);
    }

    public static r1f c() {
        return new c();
    }

    public static r1f d(String str) {
        return new d(str);
    }

    public static r1f f() {
        return new e();
    }

    public static r1f g(com.spotify.voice.results.model.e eVar) {
        return new f(eVar);
    }

    public static r1f h(Optional<String> optional) {
        return new g(optional);
    }

    public static r1f i(String str) {
        return new h(str);
    }

    public abstract void e(si0<c> si0, si0<g> si02, si0<d> si03, si0<h> si04, si0<f> si05, si0<b> si06, si0<a> si07, si0<e> si08);
}
