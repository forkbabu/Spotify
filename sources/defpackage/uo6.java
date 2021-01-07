package defpackage;

import kotlin.jvm.internal.h;

/* renamed from: uo6  reason: default package */
public final class uo6 {
    private final String a;
    private final cfc b;
    private final boolean c;

    /* renamed from: uo6$a */
    public static final class a {
        private String a;
        private cfc b;
        private boolean c;

        public a() {
            this(null, null, false, 7);
        }

        public a(String str, cfc cfc, boolean z, int i) {
            int i2 = i & 1;
            int i3 = i & 2;
            z = (i & 4) != 0 ? false : z;
            this.a = null;
            this.b = null;
            this.c = z;
        }

        public final uo6 a() {
            String str = this.a;
            boolean z = this.c;
            cfc cfc = this.b;
            h.c(cfc);
            return new uo6(str, cfc, z);
        }

        public final a b(cfc cfc) {
            h.e(cfc, "contextUri");
            this.b = cfc;
            return this;
        }

        public final a c(boolean z) {
            this.c = z;
            return this;
        }

        public final a d(String str) {
            this.a = str;
            return this;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return h.a(this.a, aVar.a) && h.a(this.b, aVar.b) && this.c == aVar.c;
        }

        public int hashCode() {
            String str = this.a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            cfc cfc = this.b;
            if (cfc != null) {
                i = cfc.hashCode();
            }
            int i2 = (hashCode + i) * 31;
            boolean z = this.c;
            if (z) {
                z = true;
            }
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = z ? 1 : 0;
            return i2 + i3;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Builder(itemId=");
            V0.append(this.a);
            V0.append(", contextUri=");
            V0.append(this.b);
            V0.append(", isPlaying=");
            return je.P0(V0, this.c, ")");
        }
    }

    public uo6(String str, cfc cfc, boolean z) {
        h.e(cfc, "contextUri");
        this.a = str;
        this.b = cfc;
        this.c = z;
    }

    public final boolean a() {
        return this.c;
    }

    public final String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uo6)) {
            return false;
        }
        uo6 uo6 = (uo6) obj;
        return h.a(this.a, uo6.a) && h.a(this.b, uo6.b) && this.c == uo6.c;
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        cfc cfc = this.b;
        if (cfc != null) {
            i = cfc.hashCode();
        }
        int i2 = (hashCode + i) * 31;
        boolean z = this.c;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        return i2 + i3;
    }

    public String toString() {
        StringBuilder V0 = je.V0("PlaylistPlayerState(itemId=");
        V0.append(this.a);
        V0.append(", contextUri=");
        V0.append(this.b);
        V0.append(", isPlaying=");
        return je.P0(V0, this.c, ")");
    }
}
