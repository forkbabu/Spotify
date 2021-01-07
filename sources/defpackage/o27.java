package defpackage;

import io.reactivex.s;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

/* renamed from: o27  reason: default package */
public interface o27 {

    /* renamed from: o27$a */
    public static final class a {
        private final AbstractC0653a a;
        private final c b;
        private final b c;

        /* renamed from: o27$a$a  reason: collision with other inner class name */
        public static abstract class AbstractC0653a {

            /* renamed from: o27$a$a$a  reason: collision with other inner class name */
            public static final class C0654a extends AbstractC0653a {
                public static final C0654a a = new C0654a();

                private C0654a() {
                    super(null);
                }
            }

            /* renamed from: o27$a$a$b */
            public static final class b extends AbstractC0653a {
                public static final b a = new b();

                private b() {
                    super(null);
                }
            }

            /* renamed from: o27$a$a$c */
            public static final class c extends AbstractC0653a {
                public static final c a = new c();

                private c() {
                    super(null);
                }
            }

            public AbstractC0653a(f fVar) {
            }
        }

        /* renamed from: o27$a$b */
        public static final class b {
            private final int a;

            public b(int i, int i2) {
                this.a = i2;
            }

            public final int a() {
                return 0;
            }

            public final int b() {
                return this.a;
            }
        }

        /* renamed from: o27$a$c */
        public static abstract class c {

            /* renamed from: o27$a$c$a  reason: collision with other inner class name */
            public static final class C0655a extends c {
                public static final C0655a a = new C0655a();

                private C0655a() {
                    super(null);
                }
            }

            /* renamed from: o27$a$c$b */
            public static final class b extends c {
                public static final b a = new b();

                private b() {
                    super(null);
                }
            }

            /* renamed from: o27$a$c$c  reason: collision with other inner class name */
            public static final class C0656c extends c {
                public static final C0656c a = new C0656c();

                private C0656c() {
                    super(null);
                }
            }

            public c(f fVar) {
            }
        }

        public a(AbstractC0653a aVar, c cVar, b bVar) {
            h.e(aVar, "filter");
            h.e(cVar, "sort");
            h.e(bVar, "paginationRange");
            this.a = aVar;
            this.b = cVar;
            this.c = bVar;
        }

        public final AbstractC0653a a() {
            return this.a;
        }

        public final b b() {
            return this.c;
        }

        public final c c() {
            return this.b;
        }
    }

    s<qyd> a(a aVar);
}
