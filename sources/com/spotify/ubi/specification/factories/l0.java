package com.spotify.ubi.specification.factories;

import defpackage.mqe;
import defpackage.nqe;
import defpackage.rqe;

public final class l0 {
    private final rqe a = je.X("music", "mobile-connect-device-picker", "5.0.0");

    public final class b {
        private final rqe a;

        public final class a {
            private final rqe a;

            /* renamed from: com.spotify.ubi.specification.factories.l0$b$a$a  reason: collision with other inner class name */
            public final class C0474a {
                private final rqe a;

                /* renamed from: com.spotify.ubi.specification.factories.l0$b$a$a$a  reason: collision with other inner class name */
                public final class C0475a {
                    private final rqe a;

                    /* renamed from: com.spotify.ubi.specification.factories.l0$b$a$a$a$a  reason: collision with other inner class name */
                    public final class C0476a {
                        private final rqe a;

                        C0476a(C0475a aVar, a aVar2) {
                            rqe.b p = aVar.a.p();
                            je.l("cast_incarnation_action", p);
                            p.f(Boolean.TRUE);
                            this.a = p.d();
                        }

                        public nqe a(String str) {
                            nqe.b f = nqe.f();
                            f.e(this.a);
                            nqe.b bVar = f;
                            bVar.h(je.W("change_remote_device_incarnation", 1, "hit", "remote_device_id", str));
                            return (nqe) bVar.c();
                        }

                        public mqe b() {
                            mqe.b e = mqe.e();
                            e.e(this.a);
                            return (mqe) e.c();
                        }
                    }

                    /* renamed from: com.spotify.ubi.specification.factories.l0$b$a$a$a$b  reason: collision with other inner class name */
                    public final class C0477b {
                        private final rqe a;

                        C0477b(C0475a aVar, a aVar2) {
                            rqe.b p = aVar.a.p();
                            je.l("connect_incarnation_action", p);
                            p.f(Boolean.TRUE);
                            this.a = p.d();
                        }

                        public nqe a(String str) {
                            nqe.b f = nqe.f();
                            f.e(this.a);
                            nqe.b bVar = f;
                            bVar.h(je.W("change_remote_device_incarnation", 1, "hit", "remote_device_id", str));
                            return (nqe) bVar.c();
                        }

                        public mqe b() {
                            mqe.b e = mqe.e();
                            e.e(this.a);
                            return (mqe) e.c();
                        }
                    }

                    /* renamed from: com.spotify.ubi.specification.factories.l0$b$a$a$a$c */
                    public final class c {
                        private final rqe a;

                        c(C0475a aVar, a aVar2) {
                            rqe.b p = aVar.a.p();
                            je.l("forget_device_action", p);
                            p.f(Boolean.TRUE);
                            this.a = p.d();
                        }

                        public nqe a(String str) {
                            nqe.b f = nqe.f();
                            f.e(this.a);
                            nqe.b bVar = f;
                            bVar.h(je.W("logout_from_remote_device", 1, "hit", "remote_device_id", str));
                            return (nqe) bVar.c();
                        }

                        public mqe b() {
                            mqe.b e = mqe.e();
                            e.e(this.a);
                            return (mqe) e.c();
                        }
                    }

                    /* renamed from: com.spotify.ubi.specification.factories.l0$b$a$a$a$d */
                    public final class d {
                        private final rqe a;

                        d(C0475a aVar, a aVar2) {
                            rqe.b p = aVar.a.p();
                            je.l("group_rooms_action", p);
                            p.f(Boolean.TRUE);
                            this.a = p.d();
                        }

                        public nqe a(String str) {
                            nqe.b f = nqe.f();
                            f.e(this.a);
                            nqe.b bVar = f;
                            bVar.h(je.W("navigate_to_external_uri", 1, "hit", "destination", str));
                            return (nqe) bVar.c();
                        }

                        public mqe b() {
                            mqe.b e = mqe.e();
                            e.e(this.a);
                            return (mqe) e.c();
                        }
                    }

                    C0475a(C0474a aVar, a aVar2) {
                        rqe.b p = aVar.a.p();
                        je.l("context_menu_button", p);
                        p.f(Boolean.FALSE);
                        this.a = p.d();
                    }

                    public C0476a b() {
                        return new C0476a(this, null);
                    }

                    public C0477b c() {
                        return new C0477b(this, null);
                    }

                    public c d() {
                        return new c(this, null);
                    }

                    public d e() {
                        return new d(this, null);
                    }

                    public nqe f() {
                        nqe.b f = nqe.f();
                        f.e(this.a);
                        return (nqe) je.S("ui_reveal", 1, "hit", f);
                    }
                }

                /* renamed from: com.spotify.ubi.specification.factories.l0$b$a$a$b  reason: collision with other inner class name */
                public final class C0478b {
                    private final rqe a;

                    C0478b(C0474a aVar, String str, a aVar2) {
                        rqe.b p = aVar.a.p();
                        je.q("participant_join_button", str, p);
                        p.f(Boolean.TRUE);
                        this.a = p.d();
                    }

                    public nqe a() {
                        nqe.b f = nqe.f();
                        f.e(this.a);
                        return (nqe) je.S("join_social_listening_session", 1, "hit", f);
                    }

                    public mqe b() {
                        mqe.b e = mqe.e();
                        e.e(this.a);
                        return (mqe) e.c();
                    }
                }

                C0474a(a aVar, String str, Integer num, a aVar2) {
                    rqe.b p = aVar.a.p();
                    je.t("connect_device", str, num, p);
                    p.f(Boolean.TRUE);
                    this.a = p.d();
                }

                public C0475a b() {
                    return new C0475a(this, null);
                }

                public nqe c(String str) {
                    nqe.b f = nqe.f();
                    f.e(this.a);
                    nqe.b bVar = f;
                    bVar.h(je.W("connect_to_remote_device", 1, "hit", "remote_device_id", str));
                    return (nqe) bVar.c();
                }

                public mqe d() {
                    mqe.b e = mqe.e();
                    e.e(this.a);
                    return (mqe) e.c();
                }

                public C0478b e(String str) {
                    return new C0478b(this, str, null);
                }
            }

            /* renamed from: com.spotify.ubi.specification.factories.l0$b$a$b  reason: collision with other inner class name */
            public final class C0479b {
                private final rqe a;

                C0479b(a aVar, a aVar2) {
                    rqe.b p = aVar.a.p();
                    je.l("local_device", p);
                    p.f(Boolean.TRUE);
                    this.a = p.d();
                }

                public nqe a() {
                    nqe.b f = nqe.f();
                    f.e(this.a);
                    return (nqe) je.S("no_action", 1, "hit", f);
                }

                public mqe b() {
                    mqe.b e = mqe.e();
                    e.e(this.a);
                    return (mqe) e.c();
                }
            }

            public final class c {
                private final rqe a;

                c(a aVar, a aVar2) {
                    rqe.b p = aVar.a.p();
                    je.l("social_listening", p);
                    p.f(Boolean.TRUE);
                    this.a = p.d();
                }

                public mqe a() {
                    mqe.b e = mqe.e();
                    e.e(this.a);
                    return (mqe) e.c();
                }
            }

            a(b bVar, a aVar) {
                rqe.b p = bVar.a.p();
                je.l("device_list", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public C0474a b(String str, Integer num) {
                return new C0474a(this, str, num, null);
            }

            public C0479b c() {
                return new C0479b(this, null);
            }

            public c d() {
                return new c(this, null);
            }
        }

        /* renamed from: com.spotify.ubi.specification.factories.l0$b$b  reason: collision with other inner class name */
        public final class C0480b {
            private final rqe a;

            /* renamed from: com.spotify.ubi.specification.factories.l0$b$b$a */
            public final class a {
                private final rqe a;

                a(C0480b bVar, String str, a aVar) {
                    rqe.b p = bVar.a.p();
                    je.r("education_item", str, p);
                    p.f(Boolean.TRUE);
                    this.a = p.d();
                }

                public nqe a(String str) {
                    nqe.b f = nqe.f();
                    f.e(this.a);
                    nqe.b bVar = f;
                    bVar.h(je.W("ui_navigate", 1, "hit", "destination", str));
                    return (nqe) bVar.c();
                }

                public mqe b() {
                    mqe.b e = mqe.e();
                    e.e(this.a);
                    return (mqe) e.c();
                }
            }

            C0480b(b bVar, a aVar) {
                rqe.b p = bVar.a.p();
                je.l("education_list", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public a b(String str) {
                return new a(this, str, null);
            }
        }

        public final class c {
            private final rqe a;

            c(b bVar, a aVar) {
                rqe.b p = bVar.a.p();
                je.l("error_view", p);
                p.f(Boolean.TRUE);
                this.a = p.d();
            }

            public mqe a() {
                mqe.b e = mqe.e();
                e.e(this.a);
                return (mqe) e.c();
            }
        }

        public final class d {
            private final rqe a;

            public final class a {
                private final rqe a;

                a(d dVar, a aVar) {
                    rqe.b p = dVar.a.p();
                    je.l("host_allow_switch", p);
                    p.f(Boolean.TRUE);
                    this.a = p.d();
                }

                public nqe a() {
                    nqe.b f = nqe.f();
                    f.e(this.a);
                    return (nqe) je.S("no_action", 1, "hit", f);
                }

                public nqe b() {
                    nqe.b f = nqe.f();
                    f.e(this.a);
                    return (nqe) je.S("stop_hosting_social_listening_session", 1, "hit", f);
                }

                public mqe c() {
                    mqe.b e = mqe.e();
                    e.e(this.a);
                    return (mqe) e.c();
                }
            }

            /* renamed from: com.spotify.ubi.specification.factories.l0$b$d$b  reason: collision with other inner class name */
            public final class C0481b {
                private final rqe a;

                C0481b(d dVar, String str, a aVar) {
                    rqe.b p = dVar.a.p();
                    je.q("participant_leave_button", str, p);
                    p.f(Boolean.TRUE);
                    this.a = p.d();
                }

                public nqe a() {
                    nqe.b f = nqe.f();
                    f.e(this.a);
                    return (nqe) je.S("leave_social_listening_session", 1, "hit", f);
                }

                public mqe b() {
                    mqe.b e = mqe.e();
                    e.e(this.a);
                    return (mqe) e.c();
                }
            }

            d(b bVar, String str, a aVar) {
                rqe.b p = bVar.a.p();
                je.q("group_session_view", str, p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public a b() {
                return new a(this, null);
            }

            public C0481b c(String str) {
                return new C0481b(this, str, null);
            }
        }

        public final class e {
            private final rqe a;

            public final class a {
                private final rqe a;

                a(e eVar, a aVar) {
                    rqe.b p = eVar.a.p();
                    je.l("close_button", p);
                    p.f(Boolean.FALSE);
                    this.a = p.d();
                }

                public nqe a() {
                    nqe.b f = nqe.f();
                    f.e(this.a);
                    return (nqe) je.S("ui_hide", 1, "hit", f);
                }
            }

            /* renamed from: com.spotify.ubi.specification.factories.l0$b$e$b  reason: collision with other inner class name */
            public final class C0482b {
                private final rqe a;

                C0482b(e eVar, a aVar) {
                    rqe.b p = eVar.a.p();
                    je.l("help_button", p);
                    p.f(Boolean.FALSE);
                    this.a = p.d();
                }

                public nqe a(String str) {
                    nqe.b f = nqe.f();
                    f.e(this.a);
                    nqe.b bVar = f;
                    bVar.h(je.W("navigate_to_webview_uri", 1, "hit", "destination", str));
                    return (nqe) bVar.c();
                }
            }

            e(b bVar, a aVar) {
                rqe.b p = bVar.a.p();
                je.l("navigation_bar", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public a b() {
                return new a(this, null);
            }

            public C0482b c() {
                return new C0482b(this, null);
            }
        }

        public final class f {
            private final rqe a;

            f(b bVar, a aVar) {
                rqe.b p = bVar.a.p();
                je.l("no_devices_view", p);
                p.f(Boolean.TRUE);
                this.a = p.d();
            }

            public mqe a() {
                mqe.b e = mqe.e();
                e.e(this.a);
                return (mqe) e.c();
            }
        }

        public final class g {
            private final rqe a;

            g(b bVar, a aVar) {
                rqe.b p = bVar.a.p();
                je.l("volume_slider_view", p);
                p.f(Boolean.TRUE);
                this.a = p.d();
            }

            public mqe a() {
                mqe.b e = mqe.e();
                e.e(this.a);
                return (mqe) e.c();
            }
        }

        b(l0 l0Var, a aVar) {
            rqe.b p = l0Var.a.p();
            je.l("container_view", p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public a b() {
            return new a(this, null);
        }

        public C0480b c() {
            return new C0480b(this, null);
        }

        public c d() {
            return new c(this, null);
        }

        public d e(String str) {
            return new d(this, str, null);
        }

        public e f() {
            return new e(this, null);
        }

        public f g() {
            return new f(this, null);
        }

        public g h() {
            return new g(this, null);
        }
    }

    public b b() {
        return new b(this, null);
    }
}
