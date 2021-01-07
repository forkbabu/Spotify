package defpackage;

import com.spotify.music.features.login.c0;
import com.spotify.music.features.login.j;
import com.spotify.music.features.login.k;
import com.spotify.music.features.login.k0;
import com.spotify.music.features.login.l0;
import com.spotify.music.features.login.r1;
import com.spotify.music.features.login.s0;

/* renamed from: i11  reason: default package */
public abstract class i11 {

    /* renamed from: i11$a */
    public static final class a extends i11 {
        private final p11 a;
        private final j11 b;
        private final k11 c;

        a(p11 p11, j11 j11, k11 k11) {
            p11.getClass();
            this.a = p11;
            j11.getClass();
            this.b = j11;
            k11.getClass();
            this.c = k11;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!aVar.a.equals(this.a) || !aVar.b.equals(this.b) || !aVar.c.equals(this.c)) {
                return false;
            }
            return true;
        }

        @Override // defpackage.i11
        public final void f(si0<f> si0, si0<e> si02, si0<a> si03, si0<c> si04, si0<b> si05, si0<d> si06) {
            r1.e(((k0) si03).a, this);
        }

        public final j11 h() {
            return this.b;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            return this.c.hashCode() + ((hashCode + ((this.a.hashCode() + 0) * 31)) * 31);
        }

        public final k11 i() {
            return this.c;
        }

        public final p11 j() {
            return this.a;
        }

        public String toString() {
            StringBuilder V0 = je.V0("ButtonInteraction{screen=");
            V0.append(this.a);
            V0.append(", button=");
            V0.append(this.b);
            V0.append(", dialog=");
            V0.append(this.c);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: i11$b */
    public static final class b extends i11 {
        private final p11 a;
        private final k11 b;

        b(p11 p11, k11 k11) {
            p11.getClass();
            this.a = p11;
            k11.getClass();
            this.b = k11;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (!bVar.a.equals(this.a) || !bVar.b.equals(this.b)) {
                return false;
            }
            return true;
        }

        @Override // defpackage.i11
        public final void f(si0<f> si0, si0<e> si02, si0<a> si03, si0<c> si04, si0<b> si05, si0<d> si06) {
            r1.d(((c0) si05).a, this);
        }

        public final k11 h() {
            return this.b;
        }

        public int hashCode() {
            return this.b.hashCode() + ((this.a.hashCode() + 0) * 31);
        }

        public final p11 i() {
            return this.a;
        }

        public String toString() {
            StringBuilder V0 = je.V0("DialogImpression{screen=");
            V0.append(this.a);
            V0.append(", dialog=");
            V0.append(this.b);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: i11$c */
    public static final class c extends i11 {
        private final p11 a;
        private final l11 b;
        private final n11 c;
        private final String d;

        c(p11 p11, l11 l11, n11 n11, String str) {
            p11.getClass();
            this.a = p11;
            l11.getClass();
            this.b = l11;
            n11.getClass();
            this.c = n11;
            str.getClass();
            this.d = str;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (!cVar.a.equals(this.a) || !cVar.b.equals(this.b) || !cVar.c.equals(this.c) || !cVar.d.equals(this.d)) {
                return false;
            }
            return true;
        }

        @Override // defpackage.i11
        public final void f(si0<f> si0, si0<e> si02, si0<a> si03, si0<c> si04, si0<b> si05, si0<d> si06) {
            r1.b(((j) si04).a, this);
        }

        public final String h() {
            return this.d;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            int hashCode2 = this.c.hashCode();
            return this.d.hashCode() + ((hashCode2 + ((hashCode + ((this.a.hashCode() + 0) * 31)) * 31)) * 31);
        }

        public final l11 i() {
            return this.b;
        }

        public final n11 j() {
            return this.c;
        }

        public final p11 k() {
            return this.a;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Error{screen=");
            V0.append(this.a);
            V0.append(", errorType=");
            V0.append(this.b);
            V0.append(", input=");
            V0.append(this.c);
            V0.append(", errorCode=");
            return je.H0(V0, this.d, '}');
        }
    }

    /* renamed from: i11$d */
    public static final class d extends i11 {
        private final p11 a;
        private final m11 b;

        d(p11 p11, m11 m11) {
            p11.getClass();
            this.a = p11;
            m11.getClass();
            this.b = m11;
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

        @Override // defpackage.i11
        public final void f(si0<f> si0, si0<e> si02, si0<a> si03, si0<c> si04, si0<b> si05, si0<d> si06) {
            r1.c(((k) si06).a, this);
        }

        public final m11 h() {
            return this.b;
        }

        public int hashCode() {
            return this.b.hashCode() + ((this.a.hashCode() + 0) * 31);
        }

        public final p11 i() {
            return this.a;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Generic{screen=");
            V0.append(this.a);
            V0.append(", event=");
            V0.append(this.b);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: i11$e */
    public static final class e extends i11 {
        private final p11 a;
        private final n11 b;

        e(p11 p11, n11 n11) {
            p11.getClass();
            this.a = p11;
            n11.getClass();
            this.b = n11;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            if (!eVar.a.equals(this.a) || !eVar.b.equals(this.b)) {
                return false;
            }
            return true;
        }

        @Override // defpackage.i11
        public final void f(si0<f> si0, si0<e> si02, si0<a> si03, si0<c> si04, si0<b> si05, si0<d> si06) {
            r1.f(((l0) si02).a, this);
        }

        public final n11 h() {
            return this.b;
        }

        public int hashCode() {
            return this.b.hashCode() + ((this.a.hashCode() + 0) * 31);
        }

        public final p11 i() {
            return this.a;
        }

        public String toString() {
            StringBuilder V0 = je.V0("InputInteraction{screen=");
            V0.append(this.a);
            V0.append(", input=");
            V0.append(this.b);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: i11$f */
    public static final class f extends i11 {
        private final p11 a;

        f(p11 p11) {
            p11.getClass();
            this.a = p11;
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

        @Override // defpackage.i11
        public final void f(si0<f> si0, si0<e> si02, si0<a> si03, si0<c> si04, si0<b> si05, si0<d> si06) {
            r1.g(((s0) si0).a, this);
        }

        public final p11 h() {
            return this.a;
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("ScreenImpression{screen=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    i11() {
    }

    public static i11 a(p11 p11, j11 j11, k11 k11) {
        return new a(p11, j11, k11);
    }

    public static i11 b(p11 p11, k11 k11) {
        return new b(p11, k11);
    }

    public static i11 c(p11 p11, l11 l11, n11 n11, String str) {
        return new c(p11, l11, n11, str);
    }

    public static i11 d(p11 p11, m11 m11) {
        return new d(p11, m11);
    }

    public static i11 e(p11 p11, n11 n11) {
        return new e(p11, n11);
    }

    public static i11 g(p11 p11) {
        return new f(p11);
    }

    public abstract void f(si0<f> si0, si0<e> si02, si0<a> si03, si0<c> si04, si0<b> si05, si0<d> si06);
}
