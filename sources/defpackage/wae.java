package defpackage;

import com.spotify.signup.splitflow.g1;
import com.spotify.signup.splitflow.j0;
import com.spotify.signup.splitflow.z;

/* renamed from: wae  reason: default package */
public abstract class wae {

    /* renamed from: wae$a */
    public static final class a extends wae {
        a() {
        }

        @Override // defpackage.wae
        public final void b(si0<c> si0, si0<b> si02, si0<a> si03) {
            ((g1) si03).a.u(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof a;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "BadAge{}";
        }
    }

    /* renamed from: wae$b */
    public static final class b extends wae {
        b() {
        }

        @Override // defpackage.wae
        public final void b(si0<c> si0, si0<b> si02, si0<a> si03) {
            ((z) si02).a.s(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof b;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "TooYoung{}";
        }
    }

    /* renamed from: wae$c */
    public static final class c extends wae {
        c() {
        }

        @Override // defpackage.wae
        public final void b(si0<c> si0, si0<b> si02, si0<a> si03) {
            ((j0) si0).a.r(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof c;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "Unknown{}";
        }
    }

    wae() {
    }

    public static wae a() {
        return new a();
    }

    public static wae c() {
        return new b();
    }

    public static wae d() {
        return new c();
    }

    public abstract void b(si0<c> si0, si0<b> si02, si0<a> si03);
}
