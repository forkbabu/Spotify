package defpackage;

import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

/* renamed from: t25  reason: default package */
public abstract class t25 {

    /* renamed from: t25$a */
    public static final class a extends t25 {
        private final int a;
        private final String b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(int i, String str) {
            super(null);
            h.e(str, "entityUri");
            this.a = i;
            this.b = str;
        }

        public final String a() {
            return this.b;
        }

        public final int b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && h.a(this.b, aVar.b);
        }

        public int hashCode() {
            int i = this.a * 31;
            String str = this.b;
            return i + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            StringBuilder V0 = je.V0("AutomatedMessagingItem(feedItemPosition=");
            V0.append(this.a);
            V0.append(", entityUri=");
            return je.I0(V0, this.b, ")");
        }
    }

    /* renamed from: t25$b */
    public static final class b extends t25 {
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
            return je.P0(je.V0("EntryPoint(isBadged="), this.a, ")");
        }
    }

    /* renamed from: t25$c */
    public static final class c extends t25 {
        private final int a;
        private final int b;
        private final String c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(int i, int i2, String str) {
            super(null);
            h.e(str, "artistUri");
            this.a = i;
            this.b = i2;
            this.c = str;
        }

        public final int a() {
            return this.b;
        }

        public final String b() {
            return this.c;
        }

        public final int c() {
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
            return this.a == cVar.a && this.b == cVar.b && h.a(this.c, cVar.c);
        }

        public int hashCode() {
            int i = ((this.a * 31) + this.b) * 31;
            String str = this.c;
            return i + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            StringBuilder V0 = je.V0("FollowRecsArtistItem(feedItemPosition=");
            V0.append(this.a);
            V0.append(", artistItemPosition=");
            V0.append(this.b);
            V0.append(", artistUri=");
            return je.I0(V0, this.c, ")");
        }
    }

    /* renamed from: t25$d */
    public static final class d extends t25 {
        private final int a;

        public d(int i) {
            super(null);
            this.a = i;
        }

        public final int a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof d) && this.a == ((d) obj).a;
            }
            return true;
        }

        public int hashCode() {
            return this.a;
        }

        public String toString() {
            return je.B0(je.V0("FollowRecsItem(feedItemPosition="), this.a, ")");
        }
    }

    /* renamed from: t25$e */
    public static final class e extends t25 {
        private final int a;
        private final String b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(int i, String str) {
            super(null);
            h.e(str, "releaseUri");
            this.a = i;
            this.b = str;
        }

        public final int a() {
            return this.a;
        }

        public final String b() {
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
            return this.a == eVar.a && h.a(this.b, eVar.b);
        }

        public int hashCode() {
            int i = this.a * 31;
            String str = this.b;
            return i + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            StringBuilder V0 = je.V0("MusicReleaseItem(feedItemPosition=");
            V0.append(this.a);
            V0.append(", releaseUri=");
            return je.I0(V0, this.b, ")");
        }
    }

    public t25(f fVar) {
    }
}
