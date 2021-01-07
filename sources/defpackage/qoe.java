package defpackage;

/* renamed from: qoe  reason: default package */
public abstract class qoe {

    /* renamed from: qoe$a */
    public static final class a extends qoe {
        a() {
        }

        public boolean equals(Object obj) {
            return obj instanceof a;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "Init{}";
        }
    }

    qoe() {
    }

    public static qoe a() {
        return new a();
    }
}
