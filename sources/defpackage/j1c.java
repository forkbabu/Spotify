package defpackage;

import android.content.Context;
import com.adjust.sdk.Constants;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

/* renamed from: j1c  reason: default package */
public abstract class j1c {

    /* renamed from: j1c$a */
    public static abstract class a extends j1c {
        private final float a;
        private final int b;

        /* renamed from: j1c$a$a  reason: collision with other inner class name */
        public static abstract class AbstractC0624a extends a {

            /* renamed from: j1c$a$a$a  reason: collision with other inner class name */
            public static final class C0625a extends AbstractC0624a {
                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C0625a(Context context, float f) {
                    super(context, f, null);
                    h.e(context, "context");
                }
            }

            /* renamed from: j1c$a$a$b */
            public static final class b extends AbstractC0624a {
                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public b(Context context, float f) {
                    super(context, f, null);
                    h.e(context, "context");
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public AbstractC0624a(Context context, float f, f fVar) {
                super(f, nud.g(f, context.getResources()), null);
                h.e(context, "$this$dpToPx");
            }
        }

        /* renamed from: j1c$a$b */
        public static abstract class b extends a {

            /* renamed from: j1c$a$b$a  reason: collision with other inner class name */
            public static final class C0626a extends b {
                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C0626a(Context context, int i) {
                    super(context, i, null);
                    h.e(context, "context");
                }
            }

            /* renamed from: j1c$a$b$b  reason: collision with other inner class name */
            public static final class C0627b extends b {
                private final Context c;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C0627b(Context context, int i) {
                    super(context, i, null);
                    h.e(context, "context");
                    this.c = context;
                }

                public final C0627b d() {
                    return new C0627b(this.c, -b());
                }
            }

            /* renamed from: j1c$a$b$c */
            public static final class c extends b {
                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public c(Context context, int i) {
                    super(context, i, null);
                    h.e(context, "context");
                }
            }

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public b(android.content.Context r2, int r3, kotlin.jvm.internal.f r4) {
                /*
                    r1 = this;
                    java.lang.String r4 = "$this$pxToDp"
                    kotlin.jvm.internal.h.e(r2, r4)
                    float r4 = (float) r3
                    android.content.res.Resources r2 = r2.getResources()
                    java.lang.String r0 = "resources"
                    kotlin.jvm.internal.h.d(r2, r0)
                    android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
                    float r2 = r2.density
                    float r4 = r4 / r2
                    r2 = 0
                    r1.<init>(r4, r3, r2)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.j1c.a.b.<init>(android.content.Context, int, kotlin.jvm.internal.f):void");
            }
        }

        /* renamed from: j1c$a$c */
        public static final class c extends a {
            public static final c c = new c();

            private c() {
                super(0.0f, 0, null);
            }
        }

        public a(float f, int i, f fVar) {
            super(null);
            this.a = f;
            this.b = i;
        }

        public final float a() {
            return this.a;
        }

        public final int b() {
            return this.b;
        }

        public final double c() {
            float f = this.a;
            if (f == 0.0f) {
                return 0.0d;
            }
            double d = (double) f;
            Double.isNaN(d);
            return 1.0d / d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!h.a(getClass(), obj != null ? obj.getClass() : null)) {
                return false;
            }
            if (obj != null) {
                a aVar = (a) obj;
                return this.a == aVar.a && this.b == aVar.b;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.timeline.helpers.Dimension.Physical");
        }

        public int hashCode() {
            return (Float.floatToIntBits(this.a) * 31) + this.b;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Physical(dp=");
            V0.append(this.a);
            V0.append(", px=");
            return je.A0(V0, this.b, ')');
        }
    }

    /* renamed from: j1c$b */
    public static abstract class b extends j1c {
        private final int a;
        private final int b;

        /* renamed from: j1c$b$a */
        public static final class a extends b {
            public a(int i) {
                super(i, null);
            }
        }

        /* renamed from: j1c$b$b  reason: collision with other inner class name */
        public static final class C0628b extends b {
            private final boolean c;

            public C0628b(int i, boolean z) {
                super(i, null);
                this.c = z;
            }

            public final boolean c() {
                return this.c;
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0628b(int i, boolean z, int i2) {
                super(i, null);
                z = (i2 & 2) != 0 ? false : z;
                this.c = z;
            }
        }

        /* renamed from: j1c$b$c */
        public static final class c extends b {
            public c(int i) {
                super(i, null);
            }
        }

        public b(int i, f fVar) {
            super(null);
            this.b = i;
            this.a = i / Constants.ONE_SECOND;
        }

        public final int a() {
            return this.b;
        }

        public final int b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!h.a(getClass(), obj != null ? obj.getClass() : null)) {
                return false;
            }
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.timeline.helpers.Dimension.Time");
            } else if (this.b == ((b) obj).b) {
                return true;
            } else {
                return false;
            }
        }

        public int hashCode() {
            return this.b;
        }

        public String toString() {
            return je.A0(je.V0("Time(ms="), this.b, ')');
        }
    }

    public j1c(f fVar) {
    }
}
