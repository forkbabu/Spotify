package com.spotify.music.nowplaying.scroll.widgets.podcastmoreforyou.network;

import kotlin.jvm.internal.f;

public abstract class h {

    public static final class a extends h {
        private final String a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(null);
            kotlin.jvm.internal.h.e(str, "failure");
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof a) && kotlin.jvm.internal.h.a(this.a, ((a) obj).a);
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
            return je.I0(je.V0("Failure(failure="), this.a, ")");
        }
    }

    public static final class b extends h {
        private final b91 a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(b91 b91) {
            super(null);
            kotlin.jvm.internal.h.e(b91, "hubsViewModel");
            this.a = b91;
        }

        public final b91 a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof b) && kotlin.jvm.internal.h.a(this.a, ((b) obj).a);
            }
            return true;
        }

        public int hashCode() {
            b91 b91 = this.a;
            if (b91 != null) {
                return b91.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Success(hubsViewModel=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    private h() {
    }

    public h(f fVar) {
    }
}
