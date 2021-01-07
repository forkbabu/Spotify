package com.google.firebase.crashlytics.internal.model;

import com.adjust.sdk.Constants;
import com.google.firebase.crashlytics.internal.model.b;
import com.google.firebase.crashlytics.internal.model.c;
import com.google.firebase.crashlytics.internal.model.d;
import com.google.firebase.crashlytics.internal.model.e;
import com.google.firebase.crashlytics.internal.model.f;
import com.google.firebase.crashlytics.internal.model.g;
import com.google.firebase.crashlytics.internal.model.i;
import com.google.firebase.crashlytics.internal.model.j;
import com.google.firebase.crashlytics.internal.model.k;
import com.google.firebase.crashlytics.internal.model.l;
import com.google.firebase.crashlytics.internal.model.m;
import com.google.firebase.crashlytics.internal.model.n;
import com.google.firebase.crashlytics.internal.model.o;
import com.google.firebase.crashlytics.internal.model.p;
import com.google.firebase.crashlytics.internal.model.q;
import com.google.firebase.crashlytics.internal.model.r;
import com.google.firebase.crashlytics.internal.model.s;
import com.google.firebase.crashlytics.internal.model.t;
import com.google.firebase.crashlytics.internal.model.u;
import java.nio.charset.Charset;

public abstract class CrashlyticsReport {
    private static final Charset a = Charset.forName(Constants.ENCODING);

    public enum Type {
        INCOMPLETE,
        JAVA,
        NATIVE
    }

    public static abstract class a {
        public abstract CrashlyticsReport a();

        public abstract a b(String str);

        public abstract a c(String str);

        public abstract a d(String str);

        public abstract a e(String str);

        public abstract a f(c cVar);

        public abstract a g(int i);

        public abstract a h(String str);

        public abstract a i(d dVar);
    }

    public static abstract class b {

        public static abstract class a {
            public abstract b a();

            public abstract a b(String str);

            public abstract a c(String str);
        }

        public static a a() {
            return new c.b();
        }

        public abstract String b();

        public abstract String c();
    }

    public static abstract class c {

        public static abstract class a {
            public abstract c a();

            public abstract a b(v<b> vVar);

            public abstract a c(String str);
        }

        public static abstract class b {

            public static abstract class a {
                public abstract b a();

                public abstract a b(byte[] bArr);

                public abstract a c(String str);
            }

            public static a a() {
                return new e.b();
            }

            public abstract byte[] b();

            public abstract String c();
        }

        public static a a() {
            return new d.b();
        }

        public abstract v<b> b();

        public abstract String c();
    }

    public static abstract class d {

        public static abstract class a {

            /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$d$a$a  reason: collision with other inner class name */
            public static abstract class AbstractC0116a {
                public abstract a a();

                public abstract AbstractC0116a b(String str);

                public abstract AbstractC0116a c(String str);

                public abstract AbstractC0116a d(String str);

                public abstract AbstractC0116a e(String str);
            }

            public static abstract class b {
                public abstract String a();
            }

            public static AbstractC0116a a() {
                return new g.b();
            }

            public abstract String b();

            public abstract String c();

            public abstract String d();

            public abstract b e();

            public abstract String f();
        }

        public static abstract class b {
            public abstract d a();

            public abstract b b(a aVar);

            public abstract b c(boolean z);

            public abstract b d(c cVar);

            public abstract b e(Long l);

            public abstract b f(v<AbstractC0117d> vVar);

            public abstract b g(String str);

            public abstract b h(int i);

            public abstract b i(String str);

            public b j(byte[] bArr) {
                i(new String(bArr, CrashlyticsReport.a));
                return this;
            }

            public abstract b k(e eVar);

            public abstract b l(long j);

            public abstract b m(f fVar);
        }

        public static abstract class c {

            public static abstract class a {
                public abstract c a();

                public abstract a b(int i);

                public abstract a c(int i);

                public abstract a d(long j);

                public abstract a e(String str);

                public abstract a f(String str);

                public abstract a g(String str);

                public abstract a h(long j);

                public abstract a i(boolean z);

                public abstract a j(int i);
            }

            public static a a() {
                return new i.b();
            }

            public abstract int b();

            public abstract int c();

            public abstract long d();

            public abstract String e();

            public abstract String f();

            public abstract String g();

            public abstract long h();

            public abstract int i();

            public abstract boolean j();
        }

        /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$d$d  reason: collision with other inner class name */
        public static abstract class AbstractC0117d {

            /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$d$d$a */
            public static abstract class a {

                /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$d$d$a$a  reason: collision with other inner class name */
                public static abstract class AbstractC0118a {
                    public abstract a a();

                    public abstract AbstractC0118a b(Boolean bool);

                    public abstract AbstractC0118a c(v<b> vVar);

                    public abstract AbstractC0118a d(b bVar);

                    public abstract AbstractC0118a e(int i);
                }

                /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$d$d$a$b */
                public static abstract class b {

                    /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$d$d$a$b$a  reason: collision with other inner class name */
                    public static abstract class AbstractC0119a {

                        /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$d$d$a$b$a$a  reason: collision with other inner class name */
                        public static abstract class AbstractC0120a {
                            public abstract AbstractC0119a a();

                            public abstract AbstractC0120a b(long j);

                            public abstract AbstractC0120a c(String str);

                            public abstract AbstractC0120a d(long j);

                            public abstract AbstractC0120a e(String str);

                            public AbstractC0120a f(byte[] bArr) {
                                e(new String(bArr, CrashlyticsReport.a));
                                return this;
                            }
                        }

                        public static AbstractC0120a a() {
                            return new m.b();
                        }

                        public abstract long b();

                        public abstract String c();

                        public abstract long d();

                        public abstract String e();
                    }

                    /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$d$d$a$b$b  reason: collision with other inner class name */
                    public static abstract class AbstractC0121b {
                        public abstract b a();

                        public abstract AbstractC0121b b(v<AbstractC0119a> vVar);

                        public abstract AbstractC0121b c(c cVar);

                        public abstract AbstractC0121b d(AbstractC0123d dVar);

                        public abstract AbstractC0121b e(v<e> vVar);
                    }

                    /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$d$d$a$b$c */
                    public static abstract class c {

                        /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$d$d$a$b$c$a  reason: collision with other inner class name */
                        public static abstract class AbstractC0122a {
                            public abstract c a();

                            public abstract AbstractC0122a b(c cVar);

                            public abstract AbstractC0122a c(v<e.AbstractC0126b> vVar);

                            public abstract AbstractC0122a d(int i);

                            public abstract AbstractC0122a e(String str);

                            public abstract AbstractC0122a f(String str);
                        }

                        public static AbstractC0122a a() {
                            return new n.b();
                        }

                        public abstract c b();

                        public abstract v<e.AbstractC0126b> c();

                        public abstract int d();

                        public abstract String e();

                        public abstract String f();
                    }

                    /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$d$d$a$b$d  reason: collision with other inner class name */
                    public static abstract class AbstractC0123d {

                        /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$d$d$a$b$d$a  reason: collision with other inner class name */
                        public static abstract class AbstractC0124a {
                            public abstract AbstractC0123d a();

                            public abstract AbstractC0124a b(long j);

                            public abstract AbstractC0124a c(String str);

                            public abstract AbstractC0124a d(String str);
                        }

                        public static AbstractC0124a a() {
                            return new o.b();
                        }

                        public abstract long b();

                        public abstract String c();

                        public abstract String d();
                    }

                    /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$d$d$a$b$e */
                    public static abstract class e {

                        /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$d$d$a$b$e$a  reason: collision with other inner class name */
                        public static abstract class AbstractC0125a {
                            public abstract e a();

                            public abstract AbstractC0125a b(v<AbstractC0126b> vVar);

                            public abstract AbstractC0125a c(int i);

                            public abstract AbstractC0125a d(String str);
                        }

                        /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$d$d$a$b$e$b  reason: collision with other inner class name */
                        public static abstract class AbstractC0126b {

                            /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$d$d$a$b$e$b$a  reason: collision with other inner class name */
                            public static abstract class AbstractC0127a {
                                public abstract AbstractC0126b a();

                                public abstract AbstractC0127a b(String str);

                                public abstract AbstractC0127a c(int i);

                                public abstract AbstractC0127a d(long j);

                                public abstract AbstractC0127a e(long j);

                                public abstract AbstractC0127a f(String str);
                            }

                            public static AbstractC0127a a() {
                                return new q.b();
                            }

                            public abstract String b();

                            public abstract int c();

                            public abstract long d();

                            public abstract long e();

                            public abstract String f();
                        }

                        public static AbstractC0125a a() {
                            return new p.b();
                        }

                        public abstract v<AbstractC0126b> b();

                        public abstract int c();

                        public abstract String d();
                    }

                    public static AbstractC0121b a() {
                        return new l.b();
                    }

                    public abstract v<AbstractC0119a> b();

                    public abstract c c();

                    public abstract AbstractC0123d d();

                    public abstract v<e> e();
                }

                public static AbstractC0118a a() {
                    return new k.b();
                }

                public abstract Boolean b();

                public abstract v<b> c();

                public abstract b d();

                public abstract int e();

                public abstract AbstractC0118a f();
            }

            /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$d$d$b */
            public static abstract class b {
                public abstract AbstractC0117d a();

                public abstract b b(a aVar);

                public abstract b c(c cVar);

                public abstract b d(AbstractC0128d dVar);

                public abstract b e(long j);

                public abstract b f(String str);
            }

            /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$d$d$c */
            public static abstract class c {

                /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$d$d$c$a */
                public static abstract class a {
                    public abstract c a();

                    public abstract a b(Double d);

                    public abstract a c(int i);

                    public abstract a d(long j);

                    public abstract a e(int i);

                    public abstract a f(boolean z);

                    public abstract a g(long j);
                }

                public static a a() {
                    return new r.b();
                }

                public abstract Double b();

                public abstract int c();

                public abstract long d();

                public abstract int e();

                public abstract long f();

                public abstract boolean g();
            }

            /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$d$d$d  reason: collision with other inner class name */
            public static abstract class AbstractC0128d {

                /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$d$d$d$a */
                public static abstract class a {
                    public abstract AbstractC0128d a();

                    public abstract a b(String str);
                }

                public static a a() {
                    return new s.b();
                }

                public abstract String b();
            }

            public static b a() {
                return new j.b();
            }

            public abstract a b();

            public abstract c c();

            public abstract AbstractC0128d d();

            public abstract long e();

            public abstract String f();

            public abstract b g();
        }

        public static abstract class e {

            public static abstract class a {
                public abstract e a();

                public abstract a b(String str);

                public abstract a c(boolean z);

                public abstract a d(int i);

                public abstract a e(String str);
            }

            public static a a() {
                return new t.b();
            }

            public abstract String b();

            public abstract int c();

            public abstract String d();

            public abstract boolean e();
        }

        public static abstract class f {

            public static abstract class a {
                public abstract f a();

                public abstract a b(String str);
            }

            public static a a() {
                return new u.b();
            }

            public abstract String b();
        }

        public static b a() {
            f.b bVar = new f.b();
            bVar.c(false);
            return bVar;
        }

        public abstract a b();

        public abstract c c();

        public abstract Long d();

        public abstract v<AbstractC0117d> e();

        public abstract String f();

        public abstract int g();

        public abstract String h();

        public abstract e i();

        public abstract long j();

        public abstract f k();

        public abstract boolean l();

        public abstract b m();
    }

    public static a b() {
        return new b.C0130b();
    }

    public abstract String c();

    public abstract String d();

    public abstract String e();

    public abstract String f();

    public abstract c g();

    public abstract int h();

    public abstract String i();

    public abstract d j();

    /* access modifiers changed from: protected */
    public abstract a k();

    public CrashlyticsReport l(v<d.AbstractC0117d> vVar) {
        if (j() != null) {
            a k = k();
            d.b m = j().m();
            m.f(vVar);
            k.i(m.a());
            return k.a();
        }
        throw new IllegalStateException("Reports without sessions cannot have events added to them.");
    }

    public CrashlyticsReport m(c cVar) {
        a k = k();
        k.i(null);
        k.f(cVar);
        return k.a();
    }

    public CrashlyticsReport n(long j, boolean z, String str) {
        a k = k();
        if (j() != null) {
            d.b m = j().m();
            m.e(Long.valueOf(j));
            m.c(z);
            if (str != null) {
                u.b bVar = new u.b();
                bVar.b(str);
                m.m(bVar.a());
                m.a();
            }
            k.i(m.a());
        }
        return k.a();
    }
}
