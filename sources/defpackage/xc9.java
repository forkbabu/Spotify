package defpackage;

import com.spotify.ubi.specification.factories.r4;

/* renamed from: xc9  reason: default package */
public class xc9 {
    private final f a;
    private final b b;
    private final c c;
    private final d d;
    private final e e;

    /* renamed from: xc9$a */
    public static class a {
        private final ere a;

        a(ere ere, r4.b bVar) {
            this.a = ere;
            bVar.b();
        }
    }

    /* renamed from: xc9$b */
    public static class b {
        private final a a;
        private final C0696b b;

        /* renamed from: xc9$b$a */
        public static class a {
            private final C0694a a;
            private final c b;
            private final C0695b c;

            /* renamed from: xc9$b$a$a  reason: collision with other inner class name */
            public static class C0694a {
                private final ere a;
                private final r4.c.a.b b;

                C0694a(ere ere, r4.c.a.b bVar) {
                    this.a = ere;
                    this.b = bVar;
                }

                public void a() {
                    this.a.a(this.b.a());
                }
            }

            /* renamed from: xc9$b$a$b  reason: collision with other inner class name */
            public static class C0695b {
                private final ere a;
                private final r4.c.a.C0533c b;

                C0695b(ere ere, r4.c.a.C0533c cVar) {
                    this.a = ere;
                    this.b = cVar;
                }

                public void a() {
                    this.a.a(this.b.a());
                }
            }

            /* renamed from: xc9$b$a$c */
            public static class c {
                private final ere a;
                private final r4.c.a.C0532a b;

                c(ere ere, r4.c.a.C0532a aVar) {
                    this.a = ere;
                    this.b = aVar;
                }

                public void a() {
                    this.a.a(this.b.a());
                }

                public void b() {
                    this.a.a(this.b.b());
                }
            }

            a(ere ere, r4.c.a aVar) {
                this.a = new C0694a(ere, aVar.c());
                this.b = new c(ere, aVar.b());
                this.c = new C0695b(ere, aVar.d());
            }

            public c a() {
                return this.b;
            }

            public C0694a b() {
                return this.a;
            }

            public C0695b c() {
                return this.c;
            }
        }

        /* renamed from: xc9$b$b  reason: collision with other inner class name */
        public static class C0696b {
            private final ere a;
            private final r4.c b;

            C0696b(ere ere, r4.c cVar) {
                this.a = ere;
                this.b = cVar;
            }

            public String a(String str) {
                nqe a2 = this.b.c(str).a("spotify:collection:tracks");
                this.a.a(a2);
                return a2.b();
            }
        }

        b(ere ere, r4.c cVar) {
            this.a = new a(ere, cVar.b());
            this.b = new C0696b(ere, cVar);
        }

        public a a() {
            return this.a;
        }

        public C0696b b() {
            return this.b;
        }
    }

    /* renamed from: xc9$c */
    public static class c {
        private final ere a;
        private final a b;
        private final r4.d c;
        private final e d;
        private final wc9 e;

        /* renamed from: xc9$c$a */
        public static class a {
            private final ere a;
            private final r4.d.a b;
            private final C0697a c;

            /* renamed from: xc9$c$a$a  reason: collision with other inner class name */
            public static class C0697a {
                private final ere a;
                private final r4.d.a.b b;

                C0697a(ere ere, r4.d.a.b bVar) {
                    this.a = ere;
                    this.b = bVar;
                }

                public void a() {
                    this.a.a(this.b.a("spotify:collection:tracks"));
                }
            }

            a(ere ere, r4.d.a aVar) {
                this.a = ere;
                this.b = aVar;
                this.c = new C0697a(ere, aVar.c());
                aVar.b();
            }

            public C0697a a() {
                return this.c;
            }

            public void b() {
                this.a.a(this.b.d("spotify:collection:tracks"));
            }
        }

        /* renamed from: xc9$c$b */
        public static class b implements wc9 {
            private final ere a;
            private final r4.d.b b;

            b(ere ere, r4.d.b bVar) {
                this.a = ere;
                this.b = bVar;
            }

            @Override // defpackage.wc9
            public void a() {
                this.a.a(this.b.d());
            }

            @Override // defpackage.wc9
            public void b(String str, int i) {
                this.a.a(this.b.c(str, Integer.valueOf(i)).a());
            }

            @Override // defpackage.wc9
            public void c(String str, int i) {
                this.a.a(this.b.c(str, Integer.valueOf(i)).b());
            }

            @Override // defpackage.wc9
            public void d() {
                this.a.a(this.b.b().a());
            }
        }

        /* renamed from: xc9$c$c  reason: collision with other inner class name */
        public static class C0698c {
            private final ere a;
            private final r4.d.c b;
            private final String c;

            C0698c(ere ere, r4.d.c cVar, String str) {
                this.a = ere;
                this.b = cVar;
                this.c = str;
                cVar.b();
            }

            public String a() {
                nqe c2 = this.b.c(this.c);
                this.a.a(c2);
                return c2.b();
            }

            public void b() {
                this.a.a(this.b.d());
            }
        }

        /* renamed from: xc9$c$d */
        public static class d {
            private final ere a;
            private final r4.d.C0536d b;
            private final String c;
            private final a d;
            private final b e;

            /* renamed from: xc9$c$d$a */
            public static class a {
                private final ere a;
                private final r4.d.C0536d.a b;
                private final String c;

                a(ere ere, r4.d.C0536d.a aVar, String str) {
                    this.a = ere;
                    this.b = aVar;
                    this.c = str;
                }

                public void a() {
                    this.a.a(this.b.a(this.c));
                }
            }

            /* renamed from: xc9$c$d$b */
            public static class b {
                private final ere a;
                private final r4.d.C0536d.c b;
                private final String c;

                b(ere ere, r4.d.C0536d.c cVar, String str) {
                    this.a = ere;
                    this.b = cVar;
                    this.c = str;
                }

                public void a() {
                    this.a.a(this.b.a(this.c));
                }
            }

            d(ere ere, r4.d.C0536d dVar, String str) {
                this.a = ere;
                this.b = dVar;
                this.c = str;
                this.d = new a(ere, dVar.b(), str);
                dVar.c();
                this.e = new b(ere, dVar.d(), str);
            }

            public a a() {
                return this.d;
            }

            public b b() {
                return this.e;
            }

            public void c() {
                this.a.a(this.b.e(this.c));
            }
        }

        /* renamed from: xc9$c$e */
        public static class e {
            private final a a;

            /* renamed from: xc9$c$e$a */
            public static class a {
                private final ere a;
                private final r4.d.e.a b;
                private final C0699a c;

                /* renamed from: xc9$c$e$a$a  reason: collision with other inner class name */
                public static class C0699a {
                    private final ere a;
                    private final r4.d.e.a.C0537a b;

                    C0699a(ere ere, r4.d.e.a.C0537a aVar) {
                        this.a = ere;
                        this.b = aVar;
                    }

                    public void a() {
                        this.a.a(this.b.a());
                    }
                }

                a(ere ere, r4.d.e.a aVar) {
                    this.a = ere;
                    this.b = aVar;
                    this.c = new C0699a(ere, aVar.c());
                }

                public void a() {
                    this.a.a(this.b.b());
                }

                public C0699a b() {
                    return this.c;
                }
            }

            e(ere ere, r4.d.e eVar) {
                this.a = new a(ere, eVar.b());
            }

            public a a() {
                return this.a;
            }
        }

        /* renamed from: xc9$c$f */
        public static class f {
            private final ere a;
            private final r4.d.f b;
            private final String c;
            private final a d;
            private final b e;
            private final C0700c f;

            /* renamed from: xc9$c$f$a */
            public static class a {
                private final ere a;
                private final r4.d.f.a b;
                private final String c;

                a(ere ere, r4.d.f.a aVar, String str) {
                    this.a = ere;
                    this.b = aVar;
                    this.c = str;
                }

                public void a() {
                    this.a.a(this.b.a(this.c));
                }
            }

            /* renamed from: xc9$c$f$b */
            public static class b {
                private final ere a;
                private final r4.d.f.c b;
                private final String c;

                b(ere ere, r4.d.f.c cVar, String str) {
                    this.a = ere;
                    this.b = cVar;
                    this.c = str;
                }

                public void a() {
                    this.a.a(this.b.a(this.c));
                }
            }

            /* renamed from: xc9$c$f$c  reason: collision with other inner class name */
            public static class C0700c {
                private final ere a;
                private final r4.d.f.C0538d b;
                private final String c;

                C0700c(ere ere, r4.d.f.C0538d dVar, String str) {
                    this.a = ere;
                    this.b = dVar;
                    this.c = str;
                }

                public void a() {
                    this.a.a(this.b.a(this.c));
                }
            }

            f(ere ere, r4.d.f fVar, String str) {
                this.a = ere;
                this.b = fVar;
                this.c = str;
                this.d = new a(ere, fVar.b(), str);
                fVar.c();
                this.e = new b(ere, fVar.d(), str);
                this.f = new C0700c(ere, fVar.e(), str);
            }

            public a a() {
                return this.d;
            }

            public b b() {
                return this.e;
            }

            public C0700c c() {
                return this.f;
            }

            public void d() {
                this.a.a(this.b.f(this.c));
            }
        }

        c(ere ere, r4.d dVar) {
            this.a = ere;
            this.b = new a(ere, dVar.b());
            this.c = dVar;
            this.d = new e(ere, dVar.f());
            this.e = new b(ere, dVar.c());
        }

        public a a() {
            return this.b;
        }

        public wc9 b() {
            return this.e;
        }

        public C0698c c(int i, String str, String str2) {
            return new C0698c(this.a, this.c.d(Integer.valueOf(i), str, str2), str);
        }

        public d d(int i, String str) {
            return new d(this.a, this.c.e(Integer.valueOf(i), str), str);
        }

        public e e() {
            return this.d;
        }

        public f f(int i, String str) {
            return new f(this.a, this.c.g(Integer.valueOf(i), str), str);
        }
    }

    /* renamed from: xc9$d */
    public static class d {
        private final ere a;
        private final r4.e b;

        d(ere ere, r4.e eVar) {
            this.a = ere;
            this.b = eVar;
        }

        public void a() {
            this.a.a(this.b.a());
        }

        public void b() {
            this.a.a(this.b.b());
        }

        public void c() {
            this.a.a(this.b.c());
        }
    }

    /* renamed from: xc9$e */
    public static class e {
        private final ere a;
        private final r4.f b;
        private final a c;

        /* renamed from: xc9$e$a */
        public static class a {
            private final ere a;
            private final r4.f.b b;

            a(ere ere, r4.f.b bVar) {
                this.a = ere;
                this.b = bVar;
            }

            public void a() {
                this.a.a(this.b.a());
            }
        }

        /* renamed from: xc9$e$b */
        public static class b {
            private final ere a;
            private final r4.f.c b;

            b(ere ere, r4.f.c cVar) {
                this.a = ere;
                this.b = cVar;
            }

            public void a() {
                this.a.a(this.b.a());
            }
        }

        e(ere ere, r4.f fVar) {
            this.a = ere;
            this.b = fVar;
            fVar.b();
            this.c = new a(ere, fVar.c());
        }

        public a a() {
            return this.c;
        }

        public b b(String str) {
            return new b(this.a, this.b.d(str));
        }
    }

    /* renamed from: xc9$f */
    public static class f {
        private final a a;

        /* renamed from: xc9$f$a */
        public static class a {
            private final ere a;
            private final r4.g.b b;
            private final C0701a c;
            private final b d;

            /* renamed from: xc9$f$a$a  reason: collision with other inner class name */
            public static class C0701a {
                private final ere a;
                private final r4.g.b.a b;

                C0701a(ere ere, r4.g.b.a aVar) {
                    this.a = ere;
                    this.b = aVar;
                }

                public void a() {
                    this.a.a(this.b.a());
                }
            }

            /* renamed from: xc9$f$a$b */
            public static class b {
                private final ere a;
                private final r4.g.b.C0539b b;

                b(ere ere, r4.g.b.C0539b bVar) {
                    this.a = ere;
                    this.b = bVar;
                }

                public void a() {
                    this.a.a(this.b.a());
                }
            }

            a(ere ere, r4.g.b bVar) {
                this.a = ere;
                this.b = bVar;
                this.c = new C0701a(ere, bVar.b());
                this.d = new b(ere, bVar.c());
            }

            public C0701a a() {
                return this.c;
            }

            public b b() {
                return this.d;
            }
        }

        f(ere ere, r4.g gVar) {
            gVar.b();
            this.a = new a(ere, gVar.c());
        }

        public a a() {
            return this.a;
        }
    }

    public xc9(ere ere, r4 r4Var) {
        this.a = new f(ere, r4Var.g());
        this.b = new b(ere, r4Var.c());
        this.c = new c(ere, r4Var.d());
        this.d = new d(ere, r4Var.e());
        new a(ere, r4Var.b());
        this.e = new e(ere, r4Var.f());
    }

    public b a() {
        return this.b;
    }

    public c b() {
        return this.c;
    }

    public d c() {
        return this.d;
    }

    public e d() {
        return this.e;
    }

    public f e() {
        return this.a;
    }
}
