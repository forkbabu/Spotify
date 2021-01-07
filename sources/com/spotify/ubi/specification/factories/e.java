package com.spotify.ubi.specification.factories;

import defpackage.mqe;
import defpackage.nqe;
import defpackage.qqe;
import defpackage.rqe;

public final class e {
    private final rqe a;

    public final class b {
        private final rqe a;

        b(e eVar, a aVar) {
            rqe.b p = eVar.a.p();
            je.l("add_all_tracks_button", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public nqe a(String str, String str2) {
            nqe.b f = nqe.f();
            f.e(this.a);
            qqe.b b = qqe.b();
            b.c("add_to_playlist");
            b.e(1);
            b.b("hit");
            b.d("playlist", str);
            return (nqe) je.R(b, "item_to_be_added", str2, f);
        }
    }

    public final class c {
        private final rqe a;

        c(e eVar, a aVar) {
            rqe.b p = eVar.a.p();
            je.l("back", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public nqe a() {
            nqe.b f = nqe.f();
            f.e(this.a);
            return (nqe) je.S("ui_hide", 1, "hit", f);
        }
    }

    public final class d {
        private final rqe a;

        d(e eVar, a aVar) {
            rqe.b p = eVar.a.p();
            je.l("create_playlist_button", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public nqe a() {
            nqe.b f = nqe.f();
            f.e(this.a);
            return (nqe) je.S("ui_reveal", 1, "hit", f);
        }
    }

    /* renamed from: com.spotify.ubi.specification.factories.e$e  reason: collision with other inner class name */
    public final class C0423e {
        private final rqe a;

        C0423e(e eVar, a aVar) {
            rqe.b p = eVar.a.p();
            je.l("duplicate_dialog_add_non_duplicates_button", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public nqe a(String str, String str2) {
            nqe.b f = nqe.f();
            f.e(this.a);
            qqe.b b = qqe.b();
            b.c("add_to_playlist");
            b.e(1);
            b.b("hit");
            b.d("playlist", str);
            return (nqe) je.R(b, "item_to_be_added", str2, f);
        }
    }

    public final class f {
        private final rqe a;

        f(e eVar, a aVar) {
            rqe.b p = eVar.a.p();
            je.l("duplicate_dialog_cancel_button", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public nqe a() {
            nqe.b f = nqe.f();
            f.e(this.a);
            return (nqe) je.S("no_action", 1, "hit", f);
        }
    }

    public final class g {
        private final rqe a;

        g(e eVar, a aVar) {
            rqe.b p = eVar.a.p();
            je.l("duplicate_song_dialog", p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public mqe a() {
            mqe.b e = mqe.e();
            e.e(this.a);
            return (mqe) e.c();
        }
    }

    public final class h {
        private final rqe a;

        h(e eVar, a aVar) {
            rqe.b p = eVar.a.p();
            je.l("duplicate_songs_dialog", p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public mqe a() {
            mqe.b e = mqe.e();
            e.e(this.a);
            return (mqe) e.c();
        }
    }

    public final class i {
        private final rqe a;

        i(e eVar, Integer num, String str, a aVar) {
            rqe.b p = eVar.a.p();
            je.o("item", num, str, p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public nqe a(String str, String str2) {
            nqe.b f = nqe.f();
            f.e(this.a);
            qqe.b b = qqe.b();
            b.c("add_to_playlist");
            b.e(1);
            b.b("hit");
            b.d("playlist", str);
            return (nqe) je.R(b, "item_to_be_added", str2, f);
        }

        public nqe b(String str) {
            nqe.b f = nqe.f();
            f.e(this.a);
            nqe.b bVar = f;
            bVar.h(je.W("remove_item_from_playlist", 1, "hit", "item_to_be_removed_from_playlist", str));
            return (nqe) bVar.c();
        }
    }

    public e(String str) {
        rqe.b e = rqe.e();
        e.c("music");
        e.l("mobile-add-to-playlist");
        e.m("3.0.0");
        e.g(str);
        this.a = e.d();
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

    public C0423e e() {
        return new C0423e(this, null);
    }

    public f f() {
        return new f(this, null);
    }

    public g g() {
        return new g(this, null);
    }

    public h h() {
        return new h(this, null);
    }

    public i i(Integer num, String str) {
        return new i(this, num, str, null);
    }
}
