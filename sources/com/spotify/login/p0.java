package com.spotify.login;

import com.spotify.login.AuthenticationMetadata;
import defpackage.khd;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

public final class p0 implements o0 {
    private final List<khd> a = d.u(khd.a.c, khd.b.c, khd.l.b.c, khd.l.a.c, khd.c.c, khd.d.c, khd.g.c, khd.h.c, khd.i.c, khd.k.c, khd.j.c, khd.f.c, khd.e.c);
    private final xhd b;

    private static final class a {
        private final String a;
        private final boolean b;
        private final AuthenticationMetadata.AuthSource c;

        public a(String str, boolean z, AuthenticationMetadata.AuthSource authSource) {
            h.e(str, "authType");
            this.a = str;
            this.b = z;
            this.c = authSource;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return h.a(this.a, aVar.a) && this.b == aVar.b && h.a(this.c, aVar.c);
        }

        public int hashCode() {
            String str = this.a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            boolean z = this.b;
            if (z) {
                z = true;
            }
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = (hashCode + i2) * 31;
            AuthenticationMetadata.AuthSource authSource = this.c;
            if (authSource != null) {
                i = authSource.hashCode();
            }
            return i5 + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("AuthMatcher(authType=");
            V0.append(this.a);
            V0.append(", isRegistration=");
            V0.append(this.b);
            V0.append(", authSource=");
            V0.append(this.c);
            V0.append(")");
            return V0.toString();
        }
    }

    public p0(xhd xhd) {
        h.e(xhd, "mUserTracker");
        this.b = xhd;
    }

    @Override // com.spotify.login.o0
    public void a(AuthenticationMetadata authenticationMetadata) {
        T t;
        List list;
        h.e(authenticationMetadata, "authenticationMetadata");
        String b2 = authenticationMetadata.b();
        h.d(b2, "authenticationMetadata.authType");
        a aVar = new a(b2, authenticationMetadata.d(), authenticationMetadata.a());
        Iterator<T> it = this.a.iterator();
        while (true) {
            t = null;
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            T t2 = next;
            AuthenticationMetadata.AuthSource authSource = AuthenticationMetadata.AuthSource.GOOGLE;
            AuthenticationMetadata.AuthSource authSource2 = AuthenticationMetadata.AuthSource.SAMSUNG;
            AuthenticationMetadata.AuthSource authSource3 = AuthenticationMetadata.AuthSource.EMAIL;
            if (h.a(t2, khd.a.c)) {
                list = d.t(new a("password", false, authSource3));
            } else if (h.a(t2, khd.b.c)) {
                list = d.t(new a("password", true, authSource3));
            } else if (h.a(t2, khd.l.b.c)) {
                list = d.t(new a("password", false, AuthenticationMetadata.AuthSource.AUTOSMARTLOCK));
            } else if (h.a(t2, khd.l.a.c)) {
                list = d.t(new a("password", false, AuthenticationMetadata.AuthSource.ASSISTEDSMARTLOCK));
            } else if (h.a(t2, khd.c.c)) {
                list = d.t(new a("facebook", false, null));
            } else if (h.a(t2, khd.d.c)) {
                list = d.t(new a("facebook", true, null));
            } else if (h.a(t2, khd.g.c)) {
                list = d.t(new a("oneTimeToken", false, AuthenticationMetadata.AuthSource.MAGICLINK));
            } else if (h.a(t2, khd.h.c)) {
                list = d.t(new a("phoneNumber", false, null));
            } else if (h.a(t2, khd.i.c)) {
                list = d.t(new a("oneTimeToken", true, AuthenticationMetadata.AuthSource.PHONENUMBER));
            } else if (h.a(t2, khd.k.c)) {
                list = d.u(new a("oneTimeToken", true, authSource2), new a("samsungsignin", true, null));
            } else if (h.a(t2, khd.j.c)) {
                list = d.u(new a("oneTimeToken", false, authSource2), new a("samsungsignin", false, null));
            } else if (h.a(t2, khd.f.c)) {
                list = d.t(new a("oneTimeToken", true, authSource));
            } else if (h.a(t2, khd.e.c)) {
                list = d.t(new a("googleSignIn", false, authSource));
            } else {
                throw new NoWhenBranchMatchedException();
            }
            if (list.contains(aVar)) {
                t = next;
                break;
            }
        }
        T t3 = t;
        if (t3 != null) {
            this.b.h(t3);
        }
    }
}
