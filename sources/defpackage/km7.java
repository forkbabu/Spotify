package defpackage;

import com.google.common.base.Optional;

/* renamed from: km7  reason: default package */
public abstract class km7 {

    /* renamed from: km7$a */
    public static final class a extends km7 {
        public static final a a = new a();

        private a() {
            super(null);
        }
    }

    /* renamed from: km7$b */
    public static final class b extends km7 {
        public static final b a = new b();

        private b() {
            super(null);
        }
    }

    /* renamed from: km7$c */
    public static final class c extends km7 {
        public static final c a = new c();

        private c() {
            super(null);
        }
    }

    /* renamed from: km7$d */
    public static final class d extends km7 {
        public static final d a = new d();

        private d() {
            super(null);
        }
    }

    /* renamed from: km7$e */
    public static final class e extends km7 {
        public static final e a = new e();

        private e() {
            super(null);
        }
    }

    /* renamed from: km7$f */
    public static final class f extends km7 {
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
            return je.P0(je.V0("OpenChangeImage(usingCamera="), this.a, ")");
        }
    }

    /* renamed from: km7$g */
    public static final class g extends km7 {
        public static final g a = new g();

        private g() {
            super(null);
        }
    }

    /* renamed from: km7$h */
    public static final class h extends km7 {
        public static final h a = new h();

        private h() {
            super(null);
        }
    }

    /* renamed from: km7$i */
    public static final class i extends km7 {
        private final String a;
        private final Optional<String> b;
        private final Optional<String> c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(String str, Optional<String> optional, Optional<String> optional2) {
            super(null);
            kotlin.jvm.internal.h.e(str, "username");
            kotlin.jvm.internal.h.e(optional, "displayName");
            kotlin.jvm.internal.h.e(optional2, "imageUri");
            this.a = str;
            this.b = optional;
            this.c = optional2;
        }

        public final Optional<String> a() {
            return this.b;
        }

        public final Optional<String> b() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return kotlin.jvm.internal.h.a(this.a, iVar.a) && kotlin.jvm.internal.h.a(this.b, iVar.b) && kotlin.jvm.internal.h.a(this.c, iVar.c);
        }

        public int hashCode() {
            String str = this.a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            Optional<String> optional = this.b;
            int hashCode2 = (hashCode + (optional != null ? optional.hashCode() : 0)) * 31;
            Optional<String> optional2 = this.c;
            if (optional2 != null) {
                i = optional2.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Save(username=");
            V0.append(this.a);
            V0.append(", displayName=");
            V0.append(this.b);
            V0.append(", imageUri=");
            return je.F0(V0, this.c, ")");
        }
    }

    /* renamed from: km7$j */
    public static final class j extends km7 {
        public static final j a = new j();

        private j() {
            super(null);
        }
    }

    /* renamed from: km7$k */
    public static final class k extends km7 {
        private final boolean a;

        public k(boolean z) {
            super(null);
            this.a = z;
        }

        public final boolean a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof k) && this.a == ((k) obj).a;
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
            return je.P0(je.V0("ShowChangePhotoDialog(currentPhotoExists="), this.a, ")");
        }
    }

    /* renamed from: km7$l */
    public static final class l extends km7 {
        public static final l a = new l();

        private l() {
            super(null);
        }
    }

    /* renamed from: km7$m */
    public static final class m extends km7 {
        public static final m a = new m();

        private m() {
            super(null);
        }
    }

    /* renamed from: km7$n */
    public static final class n extends km7 {
        public static final n a = new n();

        private n() {
            super(null);
        }
    }

    public km7(kotlin.jvm.internal.f fVar) {
    }
}
