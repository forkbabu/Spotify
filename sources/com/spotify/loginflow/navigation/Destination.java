package com.spotify.loginflow.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.login.AuthenticationMetadata;

public abstract class Destination {

    public static final class BlueprintActions extends Destination {
        private final Mode a;

        public enum Mode implements Parcelable {
            INTENT_LED_SIGNUP,
            INTENT_LED_LOGIN,
            METHOD_LED;
            
            public static final Parcelable.Creator CREATOR = new a();

            public static class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    kotlin.jvm.internal.h.e(parcel, "in");
                    return (Mode) Enum.valueOf(Mode.class, parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Mode[i];
                }
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                kotlin.jvm.internal.h.e(parcel, "parcel");
                parcel.writeString(name());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public BlueprintActions(Mode mode) {
            super(null);
            kotlin.jvm.internal.h.e(mode, "mode");
            this.a = mode;
        }

        public final Mode a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof BlueprintActions) && kotlin.jvm.internal.h.a(this.a, ((BlueprintActions) obj).a);
            }
            return true;
        }

        public int hashCode() {
            Mode mode = this.a;
            if (mode != null) {
                return mode.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("BlueprintActions(mode=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    public static final class Google extends Destination {
        private final SupportedSourceScreen a;

        public enum SupportedSourceScreen {
            Start,
            Chooser
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Google(SupportedSourceScreen supportedSourceScreen) {
            super(null);
            kotlin.jvm.internal.h.e(supportedSourceScreen, "launchedFrom");
            this.a = supportedSourceScreen;
        }

        public final SupportedSourceScreen a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof Google) && kotlin.jvm.internal.h.a(this.a, ((Google) obj).a);
            }
            return true;
        }

        public int hashCode() {
            SupportedSourceScreen supportedSourceScreen = this.a;
            if (supportedSourceScreen != null) {
                return supportedSourceScreen.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Google(launchedFrom=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    public static final class a extends Destination {
        private final String a;
        private final boolean b;
        private final String c;

        public a() {
            this(null, false, null);
        }

        public final String a() {
            return this.a;
        }

        public final String b() {
            return this.c;
        }

        public final boolean c() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.h.a(this.a, aVar.a) && this.b == aVar.b && kotlin.jvm.internal.h.a(this.c, aVar.c);
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
            String str2 = this.c;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return i5 + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("AccountRecovery(emailOrUsername=");
            V0.append(this.a);
            V0.append(", showDone=");
            V0.append(this.b);
            V0.append(", errorMessage=");
            return je.I0(V0, this.c, ")");
        }

        public a(String str, boolean z, String str2) {
            super(null);
            this.a = str;
            this.b = z;
            this.c = str2;
        }
    }

    public static final class b extends Destination {
        private final a a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(a aVar) {
            super(null);
            kotlin.jvm.internal.h.e(aVar, "facebookUser");
            this.a = aVar;
        }

        public final a a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof b) && kotlin.jvm.internal.h.a(this.a, ((b) obj).a);
            }
            return true;
        }

        public int hashCode() {
            a aVar = this.a;
            if (aVar != null) {
                return aVar.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("FacebookCreateAccount(facebookUser=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    public static final class c extends Destination {
        public static final c a = new c();

        private c() {
            super(null);
        }
    }

    public static final class d extends Destination {
        public static final d a = new d();

        private d() {
            super(null);
        }
    }

    public static final class e extends Destination {
        private final String a;
        private final String b;

        public e() {
            this(null, null, 3);
        }

        public e(String str, String str2) {
            super(null);
            this.a = str;
            this.b = str2;
        }

        public final String a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return kotlin.jvm.internal.h.a(this.a, eVar.a) && kotlin.jvm.internal.h.a(this.b, eVar.b);
        }

        public int hashCode() {
            String str = this.a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.b;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Login(username=");
            V0.append(this.a);
            V0.append(", displayName=");
            return je.I0(V0, this.b, ")");
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ e(String str, String str2, int i) {
            this((i & 1) != 0 ? null : str, null);
            int i2 = i & 2;
        }
    }

    public static final class f extends Destination {
        private final boolean a;

        public f() {
            this(false);
        }

        public final boolean a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof f) && this.a == ((f) obj).a;
            }
            return true;
        }

        public int hashCode() {
            boolean z = this.a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public String toString() {
            return je.P0(je.V0("Onboarding(languageOnboarding="), this.a, ")");
        }

        public f(boolean z) {
            super(null);
            this.a = z;
        }
    }

    public static final class g extends Destination {
        public static final g a = new g();

        private g() {
            super(null);
        }
    }

    public static abstract class h extends Destination {

        public static final class a extends h {
            public static final a a = new a();

            private a() {
                super(null);
            }
        }

        public static final class b extends h {
            private final a a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(a aVar) {
                super(null);
                kotlin.jvm.internal.h.e(aVar, "facebookUser");
                this.a = aVar;
            }

            public final a a() {
                return this.a;
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    return (obj instanceof b) && kotlin.jvm.internal.h.a(this.a, ((b) obj).a);
                }
                return true;
            }

            public int hashCode() {
                a aVar = this.a;
                if (aVar != null) {
                    return aVar.hashCode();
                }
                return 0;
            }

            public String toString() {
                StringBuilder V0 = je.V0("Facebook(facebookUser=");
                V0.append(this.a);
                V0.append(")");
                return V0.toString();
            }
        }

        public static final class c extends h {
            private final String a;
            private final String b;
            private final AuthenticationMetadata.AuthSource c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public c(String str, String str2, AuthenticationMetadata.AuthSource authSource) {
                super(null);
                kotlin.jvm.internal.h.e(str, "token");
                kotlin.jvm.internal.h.e(authSource, "authSource");
                this.a = str;
                this.b = str2;
                this.c = authSource;
            }

            public final AuthenticationMetadata.AuthSource a() {
                return this.c;
            }

            public final String b() {
                return this.b;
            }

            public final String c() {
                return this.a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return kotlin.jvm.internal.h.a(this.a, cVar.a) && kotlin.jvm.internal.h.a(this.b, cVar.b) && kotlin.jvm.internal.h.a(this.c, cVar.c);
            }

            public int hashCode() {
                String str = this.a;
                int i = 0;
                int hashCode = (str != null ? str.hashCode() : 0) * 31;
                String str2 = this.b;
                int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
                AuthenticationMetadata.AuthSource authSource = this.c;
                if (authSource != null) {
                    i = authSource.hashCode();
                }
                return hashCode2 + i;
            }

            public String toString() {
                StringBuilder V0 = je.V0("IdentifierToken(token=");
                V0.append(this.a);
                V0.append(", email=");
                V0.append(this.b);
                V0.append(", authSource=");
                V0.append(this.c);
                V0.append(")");
                return V0.toString();
            }
        }

        public h(kotlin.jvm.internal.f fVar) {
            super(null);
        }
    }

    public static final class i extends Destination {
        public static final i a = new i();

        private i() {
            super(null);
        }
    }

    public static final class j extends Destination {
        public static final j a = new j();

        private j() {
            super(null);
        }
    }

    private Destination() {
    }

    public Destination(kotlin.jvm.internal.f fVar) {
    }
}
