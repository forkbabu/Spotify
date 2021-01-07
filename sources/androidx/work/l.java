package androidx.work;

import com.spotify.voiceassistant.player.models.SearchResponse;

public interface l {
    public static final b.c a = new b.c(null);
    public static final b.C0055b b = new b.C0055b(null);

    public static abstract class b {

        public static final class a extends b {
            private final Throwable a;

            public a(Throwable th) {
                this.a = th;
            }

            public Throwable a() {
                return this.a;
            }

            public String toString() {
                return String.format("FAILURE (%s)", this.a.getMessage());
            }
        }

        /* renamed from: androidx.work.l$b$b  reason: collision with other inner class name */
        public static final class C0055b extends b {
            C0055b(a aVar) {
            }

            public String toString() {
                return "IN_PROGRESS";
            }
        }

        public static final class c extends b {
            private c() {
            }

            public String toString() {
                return SearchResponse.RESULT_SUCCESS;
            }

            c(a aVar) {
            }
        }

        b() {
        }
    }
}
