package defpackage;

import com.google.common.base.Optional;
import com.spotify.music.features.nowplayingbar.view.t;
import com.spotify.music.features.nowplayingbar.view.y;

/* renamed from: ju5  reason: default package */
public abstract class ju5 {

    /* renamed from: ju5$a */
    public static final class a extends ju5 {
        private final Optional<String> a;

        a(Optional<String> optional) {
            optional.getClass();
            this.a = optional;
        }

        @Override // defpackage.ju5
        public final void b(si0<a> si0, si0<b> si02) {
            ((y) si0).a.C(this);
        }

        public final Optional<String> d() {
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
            StringBuilder V0 = je.V0("Cover{uri=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: ju5$b */
    public static final class b extends ju5 {
        b() {
        }

        @Override // defpackage.ju5
        public final void b(si0<a> si0, si0<b> si02) {
            ((t) si02).a.D(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof b;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "Video{}";
        }
    }

    ju5() {
    }

    public static ju5 a(Optional<String> optional) {
        return new a(optional);
    }

    public static ju5 c() {
        return new b();
    }

    public abstract void b(si0<a> si0, si0<b> si02);
}
