package com.spotify.ubi.specification.factories;

import defpackage.nqe;
import defpackage.rqe;

public final class s0 {
    private final rqe a;

    public final class a0 {
        private final rqe a;

        a0(s0 s0Var, a aVar) {
            rqe.b p = s0Var.a.p();
            je.l("toggle_hide_artist_item", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public nqe a(String str) {
            nqe.b f = nqe.f();
            f.e(this.a);
            nqe.b bVar = f;
            bVar.h(je.W("hide_artist", 1, "hit", "item_to_hide", str));
            return (nqe) bVar.c();
        }

        public nqe b(String str) {
            nqe.b f = nqe.f();
            f.e(this.a);
            nqe.b bVar = f;
            bVar.h(je.W("remove_hide_artist", 1, "hit", "item_no_longer_hidden", str));
            return (nqe) bVar.c();
        }
    }

    public final class b {
        private final rqe a;

        b(s0 s0Var, a aVar) {
            rqe.b p = s0Var.a.p();
            je.l("add_app_shortcut_item", p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public nqe a(String str) {
            nqe.b f = nqe.f();
            f.e(this.a);
            nqe.b bVar = f;
            bVar.h(je.W("add_app_shortcut", 1, "hit", "destination", str));
            return (nqe) bVar.c();
        }
    }

    public final class b0 {
        private final rqe a;

        b0(s0 s0Var, a aVar) {
            rqe.b p = s0Var.a.p();
            je.l("toggle_hide_song_item", p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public nqe a(String str) {
            nqe.b f = nqe.f();
            f.e(this.a);
            nqe.b bVar = f;
            bVar.h(je.W("hide_song", 1, "hit", "item_to_hide", str));
            return (nqe) bVar.c();
        }

        public nqe b(String str) {
            nqe.b f = nqe.f();
            f.e(this.a);
            nqe.b bVar = f;
            bVar.h(je.W("remove_hide_song", 1, "hit", "item_no_longer_hidden", str));
            return (nqe) bVar.c();
        }
    }

    public final class c {
        private final rqe a;

        c(s0 s0Var, a aVar) {
            rqe.b p = s0Var.a.p();
            je.l("add_item_to_queue", p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public nqe a(String str) {
            nqe.b f = nqe.f();
            f.e(this.a);
            nqe.b bVar = f;
            bVar.h(je.W("add_item_to_queue", 1, "hit", "item_to_add_to_queue", str));
            return (nqe) bVar.c();
        }
    }

    public final class c0 {
        private final rqe a;

        c0(s0 s0Var, a aVar) {
            rqe.b p = s0Var.a.p();
            je.l("toggle_like_item", p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public nqe a(String str) {
            nqe.b f = nqe.f();
            f.e(this.a);
            nqe.b bVar = f;
            bVar.h(je.W("like", 1, "hit", "item_to_be_liked", str));
            return (nqe) bVar.c();
        }

        public nqe b(String str) {
            nqe.b f = nqe.f();
            f.e(this.a);
            nqe.b bVar = f;
            bVar.h(je.W("remove_like", 1, "hit", "item_no_longer_liked", str));
            return (nqe) bVar.c();
        }
    }

    public final class d {
        private final rqe a;

        d(s0 s0Var, a aVar) {
            rqe.b p = s0Var.a.p();
            je.l("add_show_lyrics_item", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public nqe a() {
            nqe.b f = nqe.f();
            f.e(this.a);
            return (nqe) je.S("no_action", 1, "hit", f);
        }
    }

    public final class d0 {
        private final rqe a;

        d0(s0 s0Var, a aVar) {
            rqe.b p = s0Var.a.p();
            je.l("toggle_mark_as_played_item", p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public nqe a(String str) {
            nqe.b f = nqe.f();
            f.e(this.a);
            nqe.b bVar = f;
            bVar.h(je.W("mark_as_played", 1, "hit", "item_played", str));
            return (nqe) bVar.c();
        }

        public nqe b(String str) {
            nqe.b f = nqe.f();
            f.e(this.a);
            nqe.b bVar = f;
            bVar.h(je.W("mark_as_unplayed", 1, "hit", "item_unplayed", str));
            return (nqe) bVar.c();
        }
    }

    public final class e {
        private final rqe a;

        e(s0 s0Var, a aVar) {
            rqe.b p = s0Var.a.p();
            je.l("add_to_playlist_item", p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public nqe a() {
            nqe.b f = nqe.f();
            f.e(this.a);
            return (nqe) je.S("ui_reveal", 1, "hit", f);
        }
    }

    public final class e0 {
        private final rqe a;

        e0(s0 s0Var, a aVar) {
            rqe.b p = s0Var.a.p();
            je.l("toggle_playlist_collaborative_item", p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public nqe a(String str) {
            nqe.b f = nqe.f();
            f.e(this.a);
            nqe.b bVar = f;
            bVar.h(je.W("make_playlist_collaborative", 1, "hit", "playlist_to_be_made_collaborative", str));
            return (nqe) bVar.c();
        }

        public nqe b(String str) {
            nqe.b f = nqe.f();
            f.e(this.a);
            nqe.b bVar = f;
            bVar.h(je.W("make_playlist_non_collaborative", 1, "hit", "playlist_to_be_made_non_collaborative", str));
            return (nqe) bVar.c();
        }
    }

    public final class f {
        private final rqe a;

        f(s0 s0Var, a aVar) {
            rqe.b p = s0Var.a.p();
            je.l("browse_album_item", p);
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
    }

    public final class f0 {
        private final rqe a;

        f0(s0 s0Var, a aVar) {
            rqe.b p = s0Var.a.p();
            je.l("toggle_playlist_public", p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public nqe a(String str) {
            nqe.b f = nqe.f();
            f.e(this.a);
            nqe.b bVar = f;
            bVar.h(je.W("make_playlist_public", 1, "hit", "playlist_to_be_made_public", str));
            return (nqe) bVar.c();
        }

        public nqe b(String str) {
            nqe.b f = nqe.f();
            f.e(this.a);
            nqe.b bVar = f;
            bVar.h(je.W("make_playlist_secret", 1, "hit", "playlist_to_be_made_secret", str));
            return (nqe) bVar.c();
        }
    }

    public final class g {
        private final rqe a;

        g(s0 s0Var, a aVar) {
            rqe.b p = s0Var.a.p();
            je.l("browse_artist_item", p);
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
    }

    public final class g0 {
        private final rqe a;

        g0(s0 s0Var, a aVar) {
            rqe.b p = s0Var.a.p();
            je.l("toggle_repeat_mode_item", p);
            p.f(Boolean.TRUE);
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

    public final class h {
        private final rqe a;

        h(s0 s0Var, a aVar) {
            rqe.b p = s0Var.a.p();
            je.l("browse_artists_item", p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public nqe a() {
            nqe.b f = nqe.f();
            f.e(this.a);
            return (nqe) je.S("ui_reveal", 1, "hit", f);
        }
    }

    public final class h0 {
        private final rqe a;

        h0(s0 s0Var, a aVar) {
            rqe.b p = s0Var.a.p();
            je.l("toggle_shuffle_mode_item", p);
            p.f(Boolean.TRUE);
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

    public final class i {
        private final rqe a;

        i(s0 s0Var, a aVar) {
            rqe.b p = s0Var.a.p();
            je.l("browse_episode_item", p);
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
    }

    public final class j {
        private final rqe a;

        j(s0 s0Var, a aVar) {
            rqe.b p = s0Var.a.p();
            je.l("browse_podcast_item", p);
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
    }

    public final class k {
        private final rqe a;

        k(s0 s0Var, a aVar) {
            rqe.b p = s0Var.a.p();
            je.l("browse_queue_item", p);
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
    }

    public final class l {
        private final rqe a;

        l(s0 s0Var, a aVar) {
            rqe.b p = s0Var.a.p();
            je.l("create_radio_item", p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public nqe a(String str) {
            nqe.b f = nqe.f();
            f.e(this.a);
            nqe.b bVar = f;
            bVar.h(je.W("create_radio", 1, "hit", "based_on_item", str));
            return (nqe) bVar.c();
        }
    }

    public final class m {
        private final rqe a;

        m(s0 s0Var, a aVar) {
            rqe.b p = s0Var.a.p();
            je.l("delete_playlist_item", p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public nqe a(String str) {
            nqe.b f = nqe.f();
            f.e(this.a);
            nqe.b bVar = f;
            bVar.h(je.W("delete_playlist", 1, "hit", "playlist_to_be_deleted", str));
            return (nqe) bVar.c();
        }
    }

    public final class n {
        private final rqe a;

        n(s0 s0Var, a aVar) {
            rqe.b p = s0Var.a.p();
            je.l("edit_playlist_item", p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public nqe a() {
            nqe.b f = nqe.f();
            f.e(this.a);
            return (nqe) je.S("ui_reveal", 1, "hit", f);
        }
    }

    public final class o {
        private final rqe a;

        o(s0 s0Var, a aVar) {
            rqe.b p = s0Var.a.p();
            je.l("find_in_show_item", p);
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

    public final class p {
        private final rqe a;

        p(s0 s0Var, a aVar) {
            rqe.b p = s0Var.a.p();
            je.l("hide_song_item", p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public nqe a(String str) {
            nqe.b f = nqe.f();
            f.e(this.a);
            nqe.b bVar = f;
            bVar.h(je.W("hide_song", 1, "hit", "item_to_hide", str));
            return (nqe) bVar.c();
        }
    }

    public final class q {
        private final rqe a;

        q(s0 s0Var, a aVar) {
            rqe.b p = s0Var.a.p();
            je.l("open_sleep_timer_item", p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public nqe a() {
            nqe.b f = nqe.f();
            f.e(this.a);
            return (nqe) je.S("ui_reveal", 1, "hit", f);
        }
    }

    public final class r {
        private final rqe a;

        r(s0 s0Var, a aVar) {
            rqe.b p = s0Var.a.p();
            je.l("remove_from_playlist_item", p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public nqe a(String str) {
            nqe.b f = nqe.f();
            f.e(this.a);
            nqe.b bVar = f;
            bVar.h(je.W("remove_item_from_playlist", 1, "hit", "item_to_be_removed_from_playlist", str));
            return (nqe) bVar.c();
        }
    }

    public final class s {
        private final rqe a;

        s(s0 s0Var, a aVar) {
            rqe.b p = s0Var.a.p();
            je.l("rename_playlist_item", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public nqe a(String str) {
            nqe.b f = nqe.f();
            f.e(this.a);
            nqe.b bVar = f;
            bVar.h(je.W("rename_playlist", 1, "hit", "playlist_to_be_renamed", str));
            return (nqe) bVar.c();
        }
    }

    public final class t {
        private final rqe a;

        t(s0 s0Var, a aVar) {
            rqe.b p = s0Var.a.p();
            je.l("report_abuse_item", p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public nqe a(String str) {
            nqe.b f = nqe.f();
            f.e(this.a);
            nqe.b bVar = f;
            bVar.h(je.W("report_abuse", 1, "hit", "item_to_report", str));
            return (nqe) bVar.c();
        }
    }

    public final class u {
        private final rqe a;

        u(s0 s0Var, a aVar) {
            rqe.b p = s0Var.a.p();
            je.l("share_item", p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public nqe a() {
            nqe.b f = nqe.f();
            f.e(this.a);
            return (nqe) je.S("ui_reveal", 1, "hit", f);
        }
    }

    public final class v {
        private final rqe a;

        v(s0 s0Var, a aVar) {
            rqe.b p = s0Var.a.p();
            je.l("show_credits_item", p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public nqe a() {
            nqe.b f = nqe.f();
            f.e(this.a);
            return (nqe) je.S("ui_reveal", 1, "hit", f);
        }
    }

    public final class w {
        private final rqe a;

        w(s0 s0Var, a aVar) {
            rqe.b p = s0Var.a.p();
            je.l("show_subtitles_item", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public nqe a() {
            nqe.b f = nqe.f();
            f.e(this.a);
            return (nqe) je.S("no_action", 1, "hit", f);
        }
    }

    public final class x {
        private final rqe a;

        x(s0 s0Var, a aVar) {
            rqe.b p = s0Var.a.p();
            je.l("toggle_download_item", p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public nqe a(String str) {
            nqe.b f = nqe.f();
            f.e(this.a);
            nqe.b bVar = f;
            bVar.h(je.W("download", 1, "hit", "item_to_download", str));
            return (nqe) bVar.c();
        }

        public nqe b(String str) {
            nqe.b f = nqe.f();
            f.e(this.a);
            nqe.b bVar = f;
            bVar.h(je.W("remove_download", 1, "hit", "item_to_remove_from_downloads", str));
            return (nqe) bVar.c();
        }
    }

    public final class y {
        private final rqe a;

        y(s0 s0Var, a aVar) {
            rqe.b p = s0Var.a.p();
            je.l("toggle_explicit_content_item", p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public nqe a(String str) {
            nqe.b f = nqe.f();
            f.e(this.a);
            nqe.b bVar = f;
            bVar.h(je.W("report_explicit_content", 1, "hit", "item_to_report", str));
            return (nqe) bVar.c();
        }
    }

    public final class z {
        private final rqe a;

        z(s0 s0Var, a aVar) {
            rqe.b p = s0Var.a.p();
            je.l("toggle_follow_item", p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public nqe a(String str) {
            nqe.b f = nqe.f();
            f.e(this.a);
            nqe.b bVar = f;
            bVar.h(je.W("follow", 1, "hit", "item_to_be_followed", str));
            return (nqe) bVar.c();
        }

        public nqe b(String str) {
            nqe.b f = nqe.f();
            f.e(this.a);
            nqe.b bVar = f;
            bVar.h(je.W("unfollow", 1, "hit", "item_to_be_unfollowed", str));
            return (nqe) bVar.c();
        }
    }

    public s0(String str) {
        rqe.b e2 = rqe.e();
        e2.c("music");
        e2.l("mobile-context-menu");
        e2.m("13.0.0");
        e2.j(str);
        this.a = e2.d();
    }

    public a0 A() {
        return new a0(this, null);
    }

    public b0 B() {
        return new b0(this, null);
    }

    public c0 C() {
        return new c0(this, null);
    }

    public d0 D() {
        return new d0(this, null);
    }

    public e0 E() {
        return new e0(this, null);
    }

    public f0 F() {
        return new f0(this, null);
    }

    public g0 G() {
        return new g0(this, null);
    }

    public h0 H() {
        return new h0(this, null);
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

    public g g() {
        return new g(this, null);
    }

    public h h() {
        return new h(this, null);
    }

    public i i() {
        return new i(this, null);
    }

    public j j() {
        return new j(this, null);
    }

    public k k() {
        return new k(this, null);
    }

    public l l() {
        return new l(this, null);
    }

    public m m() {
        return new m(this, null);
    }

    public n n() {
        return new n(this, null);
    }

    public o o() {
        return new o(this, null);
    }

    public p p() {
        return new p(this, null);
    }

    public q q() {
        return new q(this, null);
    }

    public r r() {
        return new r(this, null);
    }

    public s s() {
        return new s(this, null);
    }

    public t t() {
        return new t(this, null);
    }

    public u u() {
        return new u(this, null);
    }

    public v v() {
        return new v(this, null);
    }

    public w w() {
        return new w(this, null);
    }

    public x x() {
        return new x(this, null);
    }

    public y y() {
        return new y(this, null);
    }

    public z z() {
        return new z(this, null);
    }
}
