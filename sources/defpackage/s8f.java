package defpackage;

/* renamed from: s8f  reason: default package */
public abstract class s8f {

    /* renamed from: s8f$a */
    public static final class a extends s8f {
        a() {
        }

        public boolean equals(Object obj) {
            return obj instanceof a;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "Unsupported{}";
        }
    }

    /* renamed from: s8f$b */
    public static final class b extends s8f {
        b() {
        }

        public boolean equals(Object obj) {
            return obj instanceof b;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "VoiceInput{}";
        }
    }

    s8f() {
    }

    public static s8f a() {
        return new a();
    }

    public static s8f b() {
        return new b();
    }
}
