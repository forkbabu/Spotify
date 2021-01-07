package defpackage;

import com.spotify.music.features.nowplayingbar.view.j;
import com.spotify.music.features.nowplayingbar.view.k;

/* renamed from: lu5  reason: default package */
public abstract class lu5 {

    /* renamed from: lu5$a */
    public static final class a extends lu5 {
        a() {
        }

        @Override // defpackage.lu5
        public final void b(si0<a> si0, si0<b> si02) {
            ((k) si0).accept(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof a;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "Hidden{}";
        }
    }

    /* renamed from: lu5$b */
    public static final class b extends lu5 {
        private final pu5 a;
        private final ju5 b;
        private final mu5 c;
        private final ku5 d;
        private final iu5 e;
        private final nu5 f;
        private final vt5 g;

        b(pu5 pu5, ju5 ju5, mu5 mu5, ku5 ku5, iu5 iu5, nu5 nu5, vt5 vt5) {
            pu5.getClass();
            this.a = pu5;
            ju5.getClass();
            this.b = ju5;
            mu5.getClass();
            this.c = mu5;
            ku5.getClass();
            this.d = ku5;
            iu5.getClass();
            this.e = iu5;
            nu5.getClass();
            this.f = nu5;
            vt5.getClass();
            this.g = vt5;
        }

        @Override // defpackage.lu5
        public final void b(si0<a> si0, si0<b> si02) {
            ((j) si02).accept(this);
        }

        public final iu5 d() {
            return this.e;
        }

        public final ju5 e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (!bVar.a.equals(this.a) || !bVar.b.equals(this.b) || !bVar.c.equals(this.c) || !bVar.d.equals(this.d) || !bVar.e.equals(this.e) || !bVar.f.equals(this.f) || !bVar.g.equals(this.g)) {
                return false;
            }
            return true;
        }

        public final ku5 f() {
            return this.d;
        }

        public final vt5 g() {
            return this.g;
        }

        public final mu5 h() {
            return this.c;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            int hashCode2 = this.c.hashCode();
            int hashCode3 = this.d.hashCode();
            int hashCode4 = this.e.hashCode();
            int hashCode5 = this.f.hashCode();
            return this.g.hashCode() + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + ((this.a.hashCode() + 0) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
        }

        public final nu5 i() {
            return this.f;
        }

        public final pu5 j() {
            return this.a;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Visible{tracksCarouselViewData=");
            V0.append(this.a);
            V0.append(", contentViewData=");
            V0.append(this.b);
            V0.append(", playPauseViewData=");
            V0.append(this.c);
            V0.append(", heartButtonViewData=");
            V0.append(this.d);
            V0.append(", connectViewData=");
            V0.append(this.e);
            V0.append(", progressBarViewData=");
            V0.append(this.f);
            V0.append(", loggingData=");
            V0.append(this.g);
            V0.append('}');
            return V0.toString();
        }
    }

    lu5() {
    }

    public static lu5 a() {
        return new a();
    }

    public static lu5 c(pu5 pu5, ju5 ju5, mu5 mu5, ku5 ku5, iu5 iu5, nu5 nu5, vt5 vt5) {
        return new b(pu5, ju5, mu5, ku5, iu5, nu5, vt5);
    }

    public abstract void b(si0<a> si0, si0<b> si02);
}
