package com.spotify.music.features.profile.saveprofile.domain;

import com.google.common.base.Optional;

public abstract class o {

    public static final class a extends o {
        public static final a a = new a();

        private a() {
            super(null);
        }
    }

    public static final class b extends o {
        private final boolean a;

        public b(boolean z) {
            super(null);
            this.a = z;
        }

        public final boolean a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof b) && this.a == ((b) obj).a;
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
            return je.P0(je.V0("ConfirmChanges(timeout="), this.a, ")");
        }
    }

    public static final class c extends o {
        private final boolean a;
        private final String b;
        private final String c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(boolean z, String str, String str2) {
            super(null);
            kotlin.jvm.internal.h.e(str, "displayName");
            kotlin.jvm.internal.h.e(str2, "imageUrl");
            this.a = z;
            this.b = str;
            this.c = str2;
        }

        public final String a() {
            return this.b;
        }

        public final String b() {
            return this.c;
        }

        public final boolean c() {
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
            return this.a == cVar.a && kotlin.jvm.internal.h.a(this.b, cVar.b) && kotlin.jvm.internal.h.a(this.c, cVar.c);
        }

        public int hashCode() {
            boolean z = this.a;
            if (z) {
                z = true;
            }
            int i = z ? 1 : 0;
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            int i4 = i * 31;
            String str = this.b;
            int i5 = 0;
            int hashCode = (i4 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.c;
            if (str2 != null) {
                i5 = str2.hashCode();
            }
            return hashCode + i5;
        }

        public String toString() {
            StringBuilder V0 = je.V0("CoreProfileData(success=");
            V0.append(this.a);
            V0.append(", displayName=");
            V0.append(this.b);
            V0.append(", imageUrl=");
            return je.I0(V0, this.c, ")");
        }
    }

    public static final class d extends o {
        private final boolean a;

        public d(boolean z) {
            super(null);
            this.a = z;
        }

        public final boolean a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof d) && this.a == ((d) obj).a;
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
            return je.P0(je.V0("RemoveImageStatus(success="), this.a, ")");
        }
    }

    public static final class e extends o {
        private final Optional<String> a;
        private final Optional<String> b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(Optional<String> optional, Optional<String> optional2) {
            super(null);
            kotlin.jvm.internal.h.e(optional, "displayName");
            kotlin.jvm.internal.h.e(optional2, "imagePath");
            this.a = optional;
            this.b = optional2;
        }

        public final Optional<String> a() {
            return this.a;
        }

        public final Optional<String> b() {
            return this.b;
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
            Optional<String> optional = this.a;
            int i = 0;
            int hashCode = (optional != null ? optional.hashCode() : 0) * 31;
            Optional<String> optional2 = this.b;
            if (optional2 != null) {
                i = optional2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Save(displayName=");
            V0.append(this.a);
            V0.append(", imagePath=");
            return je.F0(V0, this.b, ")");
        }
    }

    public static final class f extends o {
        private final boolean a;

        public f(boolean z) {
            super(null);
            this.a = z;
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
            return je.P0(je.V0("SetDisplayNameStatus(success="), this.a, ")");
        }
    }

    public static final class g extends o {
        private final boolean a;

        public g(boolean z) {
            super(null);
            this.a = z;
        }

        public final boolean a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof g) && this.a == ((g) obj).a;
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
            return je.P0(je.V0("SetImageStatus(success="), this.a, ")");
        }
    }

    public static final class h extends o {
        private final boolean a;
        private final Optional<String> b;
        private final float c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(boolean z, Optional<String> optional, float f) {
            super(null);
            kotlin.jvm.internal.h.e(optional, "uploadToken");
            this.a = z;
            this.b = optional;
            this.c = f;
        }

        public final float a() {
            return this.c;
        }

        public final boolean b() {
            return this.a;
        }

        public final Optional<String> c() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return this.a == hVar.a && kotlin.jvm.internal.h.a(this.b, hVar.b) && Float.compare(this.c, hVar.c) == 0;
        }

        public int hashCode() {
            boolean z = this.a;
            if (z) {
                z = true;
            }
            int i = z ? 1 : 0;
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            int i4 = i * 31;
            Optional<String> optional = this.b;
            return Float.floatToIntBits(this.c) + ((i4 + (optional != null ? optional.hashCode() : 0)) * 31);
        }

        public String toString() {
            StringBuilder V0 = je.V0("UploadImageStatus(success=");
            V0.append(this.a);
            V0.append(", uploadToken=");
            V0.append(this.b);
            V0.append(", progress=");
            V0.append(this.c);
            V0.append(")");
            return V0.toString();
        }
    }

    public static final class i extends o {
        private final String a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(String str) {
            super(null);
            kotlin.jvm.internal.h.e(str, "username");
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof i) && kotlin.jvm.internal.h.a(this.a, ((i) obj).a);
            }
            return true;
        }

        public int hashCode() {
            String str = this.a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            return je.I0(je.V0("Username(username="), this.a, ")");
        }
    }

    private o() {
    }

    public o(kotlin.jvm.internal.f fVar) {
    }
}
