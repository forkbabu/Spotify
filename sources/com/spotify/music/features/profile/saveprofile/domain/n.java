package com.spotify.music.features.profile.saveprofile.domain;

import kotlin.jvm.internal.h;

public abstract class n {

    public static final class a extends n {
        private final boolean a;

        public a(boolean z) {
            super(null);
            this.a = z;
        }

        public final boolean a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof a) && this.a == ((a) obj).a;
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
            return je.P0(je.V0("ConfirmChangesTimeout(setTimeout="), this.a, ")");
        }
    }

    public static final class b extends n {
        private final String a;
        private final boolean b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(String str, boolean z) {
            super(null);
            h.e(str, "username");
            this.a = str;
            this.b = z;
        }

        public final boolean a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return h.a(this.a, bVar.a) && this.b == bVar.b;
        }

        public int hashCode() {
            String str = this.a;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            boolean z = this.b;
            if (z) {
                z = true;
            }
            int i = z ? 1 : 0;
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            return hashCode + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("LoadCoreProfileData(username=");
            V0.append(this.a);
            V0.append(", subscribe=");
            return je.P0(V0, this.b, ")");
        }
    }

    public static final class c extends n {
        public static final c a = new c();

        private c() {
            super(null);
        }
    }

    public static final class d extends n {
        private final String a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(null);
            h.e(str, "username");
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof d) && h.a(this.a, ((d) obj).a);
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
            return je.I0(je.V0("RemoveImage(username="), this.a, ")");
        }
    }

    public static final class e extends n {
        private final String a;
        private final String b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(String str, String str2) {
            super(null);
            h.e(str, "username");
            h.e(str2, "displayName");
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
            return h.a(this.a, eVar.a) && h.a(this.b, eVar.b);
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
            StringBuilder V0 = je.V0("SetDisplayName(username=");
            V0.append(this.a);
            V0.append(", displayName=");
            return je.I0(V0, this.b, ")");
        }
    }

    public static final class f extends n {
        private final String a;
        private final String b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(String str, String str2) {
            super(null);
            h.e(str, "username");
            h.e(str2, "uploadToken");
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
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return h.a(this.a, fVar.a) && h.a(this.b, fVar.b);
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
            StringBuilder V0 = je.V0("SetImage(username=");
            V0.append(this.a);
            V0.append(", uploadToken=");
            return je.I0(V0, this.b, ")");
        }
    }

    public static final class g extends n {
        private final String a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(String str) {
            super(null);
            h.e(str, "imagePath");
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof g) && h.a(this.a, ((g) obj).a);
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
            return je.I0(je.V0("UploadImage(imagePath="), this.a, ")");
        }
    }

    public n(kotlin.jvm.internal.f fVar) {
    }
}
