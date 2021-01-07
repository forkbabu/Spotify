package com.spotify.ubi.specification.factories;

import com.spotify.player.model.ContextTrack;
import defpackage.nqe;
import defpackage.rqe;

public final class m3 {
    private final rqe a = je.X("music", "mobile-queue", "4.0.0");

    public final class b {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(b bVar, a aVar) {
                rqe.b p = bVar.a.p();
                je.l("add_track_button", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a(Integer num) {
                nqe.b f = nqe.f();
                if (num.intValue() < 0) {
                    f.g("Input parameter is negative");
                }
                f.e(this.a);
                nqe.b bVar = f;
                bVar.h(je.U("add_items_to_queue", 1, "hit", "number_of_items_to_add_to_queue", num));
                return (nqe) bVar.c();
            }
        }

        /* renamed from: com.spotify.ubi.specification.factories.m3$b$b  reason: collision with other inner class name */
        public final class C0485b {
            private final rqe a;

            C0485b(b bVar, a aVar) {
                rqe.b p = bVar.a.p();
                je.l("remove_track_button", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a(Integer num) {
                nqe.b f = nqe.f();
                if (num.intValue() < 0) {
                    f.g("Input parameter is negative");
                }
                f.e(this.a);
                nqe.b bVar = f;
                bVar.h(je.U("remove_items_from_queue", 1, "hit", "number_of_items_to_remove_from_queue", num));
                return (nqe) bVar.c();
            }
        }

        b(m3 m3Var, a aVar) {
            rqe.b p = m3Var.a.p();
            je.l("edit_queue_bar", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public a b() {
            return new a(this, null);
        }

        public C0485b c() {
            return new C0485b(this, null);
        }
    }

    public final class c {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(c cVar, a aVar) {
                rqe.b p = cVar.a.p();
                je.l("play_button", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a(String str) {
                nqe.b f = nqe.f();
                f.e(this.a);
                nqe.b bVar = f;
                bVar.h(je.W(ContextTrack.TrackAction.PAUSE, 1, "hit", "item_to_be_paused", str));
                return (nqe) bVar.c();
            }

            public nqe b(String str) {
                nqe.b f = nqe.f();
                f.e(this.a);
                nqe.b bVar = f;
                bVar.h(je.W(ContextTrack.TrackAction.RESUME, 1, "hit", "item_to_be_resumed", str));
                return (nqe) bVar.c();
            }
        }

        public final class b {
            private final rqe a;

            b(c cVar, a aVar) {
                rqe.b p = cVar.a.p();
                je.l("repeat_mode_button", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("repeat_disable", 1, "hit", f);
            }

            public nqe b() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("repeat_enable", 1, "hit", f);
            }

            public nqe c() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("repeat_one_enable", 1, "hit", f);
            }
        }

        /* renamed from: com.spotify.ubi.specification.factories.m3$c$c  reason: collision with other inner class name */
        public final class C0486c {
            private final rqe a;

            C0486c(c cVar, a aVar) {
                rqe.b p = cVar.a.p();
                je.l("shuffle_mode_button", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("shuffle_disable", 1, "hit", f);
            }

            public nqe b() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("shuffle_enable", 1, "hit", f);
            }
        }

        public final class d {
            private final rqe a;

            d(c cVar, a aVar) {
                rqe.b p = cVar.a.p();
                je.l("skip_next_button", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a(String str) {
                nqe.b f = nqe.f();
                f.e(this.a);
                nqe.b bVar = f;
                bVar.h(je.W("skip_to_next", 1, "hit", "item_to_be_skipped", str));
                return (nqe) bVar.c();
            }
        }

        public final class e {
            private final rqe a;

            e(c cVar, a aVar) {
                rqe.b p = cVar.a.p();
                je.l("skip_previous_button", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a(String str) {
                nqe.b f = nqe.f();
                f.e(this.a);
                nqe.b bVar = f;
                bVar.h(je.W("skip_to_previous", 1, "hit", "item_to_be_skipped", str));
                return (nqe) bVar.c();
            }
        }

        c(m3 m3Var, a aVar) {
            rqe.b p = m3Var.a.p();
            je.l("main_controls", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public a b() {
            return new a(this, null);
        }

        public b c() {
            return new b(this, null);
        }

        public C0486c d() {
            return new C0486c(this, null);
        }

        public d e() {
            return new d(this, null);
        }

        public e f() {
            return new e(this, null);
        }
    }

    public final class d {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(d dVar, String str, a aVar) {
                rqe.b p = dVar.a.p();
                je.s("now_playing_track", str, p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a(String str) {
                nqe.b f = nqe.f();
                f.e(this.a);
                nqe.b bVar = f;
                bVar.h(je.W("ui_navigate", 1, "hit", "destination", str));
                return (nqe) bVar.c();
            }
        }

        d(m3 m3Var, a aVar) {
            rqe.b p = m3Var.a.p();
            je.l("now_playing", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public a b(String str) {
            return new a(this, str, null);
        }
    }

    public final class e {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(e eVar, a aVar) {
                rqe.b p = eVar.a.p();
                je.l("clear_button", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a(Integer num) {
                nqe.b f = nqe.f();
                if (num.intValue() < 0) {
                    f.g("Input parameter is negative");
                }
                f.e(this.a);
                nqe.b bVar = f;
                bVar.h(je.U("remove_items_from_queue", 1, "hit", "number_of_items_to_remove_from_queue", num));
                return (nqe) bVar.c();
            }
        }

        public final class b {
            private final rqe a;

            b(e eVar, Integer num, String str, a aVar) {
                rqe.b p = eVar.a.p();
                je.o("queued_track", num, str, p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("sort", 1, "drag", f);
            }

            public nqe b(String str) {
                nqe.b f = nqe.f();
                f.e(this.a);
                nqe.b bVar = f;
                bVar.h(je.W("deselect_entity_in_list", 1, "hit", "entity_to_be_deselected", str));
                return (nqe) bVar.c();
            }

            public nqe c(String str) {
                nqe.b f = nqe.f();
                f.e(this.a);
                nqe.b bVar = f;
                bVar.h(je.W("play", 1, "hit", "item_to_be_played", str));
                return (nqe) bVar.c();
            }

            public nqe d(String str) {
                nqe.b f = nqe.f();
                f.e(this.a);
                nqe.b bVar = f;
                bVar.h(je.W("select_entity_in_list", 1, "hit", "entity_to_be_selected", str));
                return (nqe) bVar.c();
            }
        }

        e(m3 m3Var, a aVar) {
            rqe.b p = m3Var.a.p();
            je.l("queue_up_next", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public a b() {
            return new a(this, null);
        }

        public b c(Integer num, String str) {
            return new b(this, num, str, null);
        }
    }

    public final class f {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(f fVar, a aVar) {
                rqe.b p = fVar.a.p();
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

        public final class b {
            private final rqe a;

            b(f fVar, a aVar) {
                rqe.b p = fVar.a.p();
                je.l("playback_source_label", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a(String str) {
                nqe.b f = nqe.f();
                f.e(this.a);
                nqe.b bVar = f;
                bVar.h(je.W("ui_navigate", 1, "hit", "destination", str));
                return (nqe) bVar.c();
            }
        }

        f(m3 m3Var, a aVar) {
            rqe.b p = m3Var.a.p();
            je.l("top_bar", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public a b() {
            return new a(this, null);
        }

        public b c() {
            return new b(this, null);
        }
    }

    public b b() {
        return new b(this, null);
    }

    public c c() {
        return new c(this, null);
    }

    public d d() {
        return new d(this, null);
    }

    public e e() {
        return new e(this, null);
    }

    public f f() {
        return new f(this, null);
    }
}
