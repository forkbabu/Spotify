package com.spotify.music.inappmessaging;

public abstract class a {

    /* renamed from: com.spotify.music.inappmessaging.a$a  reason: collision with other inner class name */
    public static final class C0278a extends a {
        private final String a;

        C0278a(String str) {
            str.getClass();
            this.a = str;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C0278a)) {
                return false;
            }
            return ((C0278a) obj).a.equals(this.a);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            return je.H0(je.V0("MessageAborted{pattern="), this.a, '}');
        }
    }

    public static final class b extends a {
        private final String a;

        b(String str) {
            str.getClass();
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            return ((b) obj).a.equals(this.a);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            return je.H0(je.V0("MessageRequested{pattern="), this.a, '}');
        }
    }

    a() {
    }
}
