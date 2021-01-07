package defpackage;

import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

/* renamed from: onc  reason: default package */
public abstract class onc {

    /* renamed from: onc$a */
    public static final class a extends onc {
        public static final a a = new a();

        private a() {
            super(null);
        }
    }

    /* renamed from: onc$b */
    public static final class b extends onc {
        public static final b a = new b();

        private b() {
            super(null);
        }
    }

    /* renamed from: onc$c */
    public static final class c extends onc {
        private final String a;
        private final String b;
        private final String c;
        private final String d;
        private final boolean e;
        private final long f;
        private final long g;

        public c() {
            this("", "", "", "", false, 0, 0);
        }

        public final String a() {
            return this.d;
        }

        public final String b() {
            return this.b;
        }

        public final String c() {
            return this.c;
        }

        public final String d() {
            return this.a;
        }

        public final long e() {
            return this.f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return h.a(this.a, cVar.a) && h.a(this.b, cVar.b) && h.a(this.c, cVar.c) && h.a(this.d, cVar.d) && this.e == cVar.e && this.f == cVar.f && this.g == cVar.g;
        }

        public final boolean f() {
            return this.e;
        }

        public int hashCode() {
            String str = this.a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.c;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.d;
            if (str4 != null) {
                i = str4.hashCode();
            }
            int i2 = (hashCode3 + i) * 31;
            boolean z = this.e;
            if (z) {
                z = true;
            }
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = z ? 1 : 0;
            return ((((i2 + i3) * 31) + e.a(this.f)) * 31) + e.a(this.g);
        }

        public String toString() {
            StringBuilder V0 = je.V0("Update(episodeUri=");
            V0.append(this.a);
            V0.append(", episodeContextUri=");
            V0.append(this.b);
            V0.append(", episodeProvider=");
            V0.append(this.c);
            V0.append(", contextUri=");
            V0.append(this.d);
            V0.append(", isPlaying=");
            V0.append(this.e);
            V0.append(", progress=");
            V0.append(this.f);
            V0.append(", length=");
            return je.E0(V0, this.g, ")");
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, String str3, String str4, boolean z, long j, long j2) {
            super(null);
            h.e(str, "episodeUri");
            h.e(str2, "episodeContextUri");
            h.e(str3, "episodeProvider");
            h.e(str4, "contextUri");
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = z;
            this.f = j;
            this.g = j2;
        }
    }

    private onc() {
    }

    public onc(f fVar) {
    }
}
