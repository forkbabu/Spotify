package defpackage;

import kotlin.jvm.internal.h;

/* renamed from: u37  reason: default package */
public abstract class u37 {

    /* renamed from: u37$a */
    public static final class a extends u37 {
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            ((a) obj).getClass();
            return h.a(null, null);
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "SearchFailed(error=null)";
        }
    }

    /* renamed from: u37$b */
    public static final class b extends u37 {
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            ((b) obj).getClass();
            return h.a(null, null);
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "SearchSucceeded(result=null)";
        }
    }

    private u37() {
    }
}
