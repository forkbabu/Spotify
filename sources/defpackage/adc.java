package defpackage;

import com.spotify.mobile.android.sso.AuthorizationRequest;
import com.spotify.music.libs.partnerapps.PartnerType;
import java.net.HttpCookie;

/* renamed from: adc  reason: default package */
public abstract class adc {

    /* renamed from: adc$a */
    public static final class a extends adc {
        private final PartnerType a;
        private final AuthorizationRequest b;
        private final HttpCookie c;

        a(PartnerType partnerType, AuthorizationRequest authorizationRequest, HttpCookie httpCookie) {
            partnerType.getClass();
            this.a = partnerType;
            authorizationRequest.getClass();
            this.b = authorizationRequest;
            httpCookie.getClass();
            this.c = httpCookie;
        }

        public final AuthorizationRequest a() {
            return this.b;
        }

        public final PartnerType b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (aVar.a != this.a || !aVar.b.equals(this.b) || !aVar.c.equals(this.c)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            return this.c.hashCode() + ((hashCode + ((this.a.hashCode() + 0) * 31)) * 31);
        }

        public String toString() {
            StringBuilder V0 = je.V0("AuthorizePartnerIntegration{partner=");
            V0.append(this.a);
            V0.append(", authorizationRequest=");
            V0.append(this.b);
            V0.append(", cookie=");
            V0.append(this.c);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: adc$b */
    public static final class b extends adc {
        private final PartnerType a;

        b(PartnerType partnerType) {
            partnerType.getClass();
            this.a = partnerType;
        }

        public final PartnerType a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if ((obj instanceof b) && ((b) obj).a == this.a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("ConnectAccount{partnerType=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: adc$c */
    public static final class c extends adc {
        private final PartnerType a;

        c(PartnerType partnerType) {
            partnerType.getClass();
            this.a = partnerType;
        }

        public final PartnerType a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if ((obj instanceof c) && ((c) obj).a == this.a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("InstallApp{partnerType=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: adc$d */
    public static final class d extends adc {
        private final PartnerType a;

        d(PartnerType partnerType) {
            partnerType.getClass();
            this.a = partnerType;
        }

        public final PartnerType a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if ((obj instanceof d) && ((d) obj).a == this.a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("LaunchApp{partner=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: adc$e */
    public static final class e extends adc {
        private final boolean a;

        e(boolean z) {
            this.a = z;
        }

        public final boolean a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if ((obj instanceof e) && ((e) obj).a == this.a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return je.n(this.a, 0);
        }

        public String toString() {
            return je.O0(je.V0("SaveMasterTogglePreference{enabled="), this.a, '}');
        }
    }

    /* renamed from: adc$f */
    public static final class f extends adc {
        f() {
        }

        public boolean equals(Object obj) {
            return obj instanceof f;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "StopPartnerService{}";
        }
    }

    adc() {
    }
}
