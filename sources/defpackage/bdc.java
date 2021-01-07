package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.sso.AuthorizationRequest;
import com.spotify.music.libs.partnerapps.PartnerType;
import java.net.HttpCookie;

/* renamed from: bdc  reason: default package */
public abstract class bdc {

    /* renamed from: bdc$a */
    public static final class a extends bdc {
        private final PartnerType a;
        private final boolean b;

        a(PartnerType partnerType, boolean z) {
            partnerType.getClass();
            this.a = partnerType;
            this.b = z;
        }

        @Override // defpackage.bdc
        public final <R_> R_ e(ti0<d, R_> ti0, ti0<g, R_> ti02, ti0<f, R_> ti03, ti0<h, R_> ti04, ti0<i, R_> ti05, ti0<j, R_> ti06, ti0<c, R_> ti07, ti0<b, R_> ti08, ti0<e, R_> ti09, ti0<a, R_> ti010) {
            return (R_) cdc.c(((wcc) ti010).a, this);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (aVar.a == this.a && aVar.b == this.b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return je.n(this.b, (this.a.hashCode() + 0) * 31);
        }

        public final boolean k() {
            return this.b;
        }

        public final PartnerType l() {
            return this.a;
        }

        public String toString() {
            StringBuilder V0 = je.V0("AccountConnectedResult{partner=");
            V0.append(this.a);
            V0.append(", didConnect=");
            return je.O0(V0, this.b, '}');
        }
    }

    /* renamed from: bdc$b */
    public static final class b extends bdc {
        private final ImmutableMap<PartnerType, bla> a;

        b(ImmutableMap<PartnerType, bla> immutableMap) {
            immutableMap.getClass();
            this.a = immutableMap;
        }

        @Override // defpackage.bdc
        public final <R_> R_ e(ti0<d, R_> ti0, ti0<g, R_> ti02, ti0<f, R_> ti03, ti0<h, R_> ti04, ti0<i, R_> ti05, ti0<j, R_> ti06, ti0<c, R_> ti07, ti0<b, R_> ti08, ti0<e, R_> ti09, ti0<a, R_> ti010) {
            return (R_) cdc.b(((qcc) ti08).a, this);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            return ((b) obj).a.equals(this.a);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final ImmutableMap<PartnerType, bla> k() {
            return this.a;
        }

        public String toString() {
            StringBuilder V0 = je.V0("AccountLinkingDataReceived{integrationEntries=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: bdc$c */
    public static final class c extends bdc {
    }

    /* renamed from: bdc$d */
    public static final class d extends bdc {
        private final Optional<PartnerType> a;

        d(Optional<PartnerType> optional) {
            optional.getClass();
            this.a = optional;
        }

        @Override // defpackage.bdc
        public final <R_> R_ e(ti0<d, R_> ti0, ti0<g, R_> ti02, ti0<f, R_> ti03, ti0<h, R_> ti04, ti0<i, R_> ti05, ti0<j, R_> ti06, ti0<c, R_> ti07, ti0<b, R_> ti08, ti0<e, R_> ti09, ti0<a, R_> ti010) {
            return (R_) ((vcc) ti0).apply(this);
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

        public final Optional<PartnerType> k() {
            return this.a;
        }

        public String toString() {
            StringBuilder V0 = je.V0("AuthStartRequested{partnerType=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: bdc$e */
    public static final class e extends bdc {
        private final PartnerType a;
        private final AuthorizationRequest b;
        private final HttpCookie c;

        e(PartnerType partnerType, AuthorizationRequest authorizationRequest, HttpCookie httpCookie) {
            partnerType.getClass();
            this.a = partnerType;
            authorizationRequest.getClass();
            this.b = authorizationRequest;
            httpCookie.getClass();
            this.c = httpCookie;
        }

        @Override // defpackage.bdc
        public final <R_> R_ e(ti0<d, R_> ti0, ti0<g, R_> ti02, ti0<f, R_> ti03, ti0<h, R_> ti04, ti0<i, R_> ti05, ti0<j, R_> ti06, ti0<c, R_> ti07, ti0<b, R_> ti08, ti0<e, R_> ti09, ti0<a, R_> ti010) {
            return (R_) ((tcc) ti09).apply(this);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            if (eVar.a != this.a || !eVar.b.equals(this.b) || !eVar.c.equals(this.c)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            return this.c.hashCode() + ((hashCode + ((this.a.hashCode() + 0) * 31)) * 31);
        }

        public final AuthorizationRequest k() {
            return this.b;
        }

        public final HttpCookie l() {
            return this.c;
        }

        public final PartnerType m() {
            return this.a;
        }

        public String toString() {
            StringBuilder V0 = je.V0("AuthorizationRequired{partner=");
            V0.append(this.a);
            V0.append(", authorizationRequest=");
            V0.append(this.b);
            V0.append(", cookie=");
            V0.append(this.c);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: bdc$f */
    public static final class f extends bdc {
        private final boolean a;

        f(boolean z) {
            this.a = z;
        }

        @Override // defpackage.bdc
        public final <R_> R_ e(ti0<d, R_> ti0, ti0<g, R_> ti02, ti0<f, R_> ti03, ti0<h, R_> ti04, ti0<i, R_> ti05, ti0<j, R_> ti06, ti0<c, R_> ti07, ti0<b, R_> ti08, ti0<e, R_> ti09, ti0<a, R_> ti010) {
            return (R_) ((scc) ti03).apply(this);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if ((obj instanceof f) && ((f) obj).a == this.a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return je.n(this.a, 0);
        }

        public final boolean k() {
            return this.a;
        }

        public String toString() {
            return je.O0(je.V0("MasterToggleChanged{enabled="), this.a, '}');
        }
    }

    /* renamed from: bdc$g */
    public static final class g extends bdc {
        private final boolean a;

        g(boolean z) {
            this.a = z;
        }

        @Override // defpackage.bdc
        public final <R_> R_ e(ti0<d, R_> ti0, ti0<g, R_> ti02, ti0<f, R_> ti03, ti0<h, R_> ti04, ti0<i, R_> ti05, ti0<j, R_> ti06, ti0<c, R_> ti07, ti0<b, R_> ti08, ti0<e, R_> ti09, ti0<a, R_> ti010) {
            return (R_) ((rcc) ti02).apply(this);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if ((obj instanceof g) && ((g) obj).a == this.a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return je.n(this.a, 0);
        }

        public final boolean k() {
            return this.a;
        }

        public String toString() {
            return je.O0(je.V0("MasterTogglePropertyRead{enabled="), this.a, '}');
        }
    }

    /* renamed from: bdc$h */
    public static final class h extends bdc {
        private final PartnerType a;

        h(PartnerType partnerType) {
            partnerType.getClass();
            this.a = partnerType;
        }

        @Override // defpackage.bdc
        public final <R_> R_ e(ti0<d, R_> ti0, ti0<g, R_> ti02, ti0<f, R_> ti03, ti0<h, R_> ti04, ti0<i, R_> ti05, ti0<j, R_> ti06, ti0<c, R_> ti07, ti0<b, R_> ti08, ti0<e, R_> ti09, ti0<a, R_> ti010) {
            return (R_) ((pcc) ti04).apply(this);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if ((obj instanceof h) && ((h) obj).a == this.a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final PartnerType k() {
            return this.a;
        }

        public String toString() {
            StringBuilder V0 = je.V0("PartnerConnectRequested{partner=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: bdc$i */
    public static final class i extends bdc {
        private final PartnerType a;

        i(PartnerType partnerType) {
            partnerType.getClass();
            this.a = partnerType;
        }

        @Override // defpackage.bdc
        public final <R_> R_ e(ti0<d, R_> ti0, ti0<g, R_> ti02, ti0<f, R_> ti03, ti0<h, R_> ti04, ti0<i, R_> ti05, ti0<j, R_> ti06, ti0<c, R_> ti07, ti0<b, R_> ti08, ti0<e, R_> ti09, ti0<a, R_> ti010) {
            return (R_) ((ucc) ti05).apply(this);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if ((obj instanceof i) && ((i) obj).a == this.a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final PartnerType k() {
            return this.a;
        }

        public String toString() {
            StringBuilder V0 = je.V0("PartnerInstallRequested{partner=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: bdc$j */
    public static final class j extends bdc {
        private final PartnerType a;

        j(PartnerType partnerType) {
            partnerType.getClass();
            this.a = partnerType;
        }

        @Override // defpackage.bdc
        public final <R_> R_ e(ti0<d, R_> ti0, ti0<g, R_> ti02, ti0<f, R_> ti03, ti0<h, R_> ti04, ti0<i, R_> ti05, ti0<j, R_> ti06, ti0<c, R_> ti07, ti0<b, R_> ti08, ti0<e, R_> ti09, ti0<a, R_> ti010) {
            return (R_) cdc.a(((xcc) ti06).a, this);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if ((obj instanceof j) && ((j) obj).a == this.a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final PartnerType k() {
            return this.a;
        }

        public String toString() {
            StringBuilder V0 = je.V0("PartnerLaunchRequested{partnerType=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    bdc() {
    }

    public static bdc a(PartnerType partnerType, boolean z) {
        return new a(partnerType, z);
    }

    public static bdc b(ImmutableMap<PartnerType, bla> immutableMap) {
        return new b(immutableMap);
    }

    public static bdc c(Optional<PartnerType> optional) {
        return new d(optional);
    }

    public static bdc d(PartnerType partnerType, AuthorizationRequest authorizationRequest, HttpCookie httpCookie) {
        return new e(partnerType, authorizationRequest, httpCookie);
    }

    public static bdc f(boolean z) {
        return new f(z);
    }

    public static bdc g(boolean z) {
        return new g(z);
    }

    public static bdc h(PartnerType partnerType) {
        return new h(partnerType);
    }

    public static bdc i(PartnerType partnerType) {
        return new i(partnerType);
    }

    public static bdc j(PartnerType partnerType) {
        return new j(partnerType);
    }

    public abstract <R_> R_ e(ti0<d, R_> ti0, ti0<g, R_> ti02, ti0<f, R_> ti03, ti0<h, R_> ti04, ti0<i, R_> ti05, ti0<j, R_> ti06, ti0<c, R_> ti07, ti0<b, R_> ti08, ti0<e, R_> ti09, ti0<a, R_> ti010);
}
