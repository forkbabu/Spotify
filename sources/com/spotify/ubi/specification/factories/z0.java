package com.spotify.ubi.specification.factories;

import com.spotify.player.model.ContextTrack;
import defpackage.nqe;
import defpackage.qqe;

public final class z0 {
    private final rqe a = je.X("music", "mobile-external-accessory", "2.0.0");

    public nqe a(String str) {
        nqe.b f = nqe.f();
        return (nqe) je.R(je.T(f, this.a, "add_item_to_queue", 1, "hit"), "item_to_add_to_queue", str, f);
    }

    public nqe b(String str) {
        nqe.b f = nqe.f();
        return (nqe) je.R(je.T(f, this.a, "create_radio", 1, "hit"), "based_on_item", str, f);
    }

    public nqe c() {
        nqe.b f = nqe.f();
        f.e(this.a);
        return (nqe) je.S("decrease_volume", 1, "hit", f);
    }

    public nqe d(String str) {
        nqe.b f = nqe.f();
        return (nqe) je.R(je.T(f, this.a, "disconnect_from_remote_device", 1, "hit"), "remote_device_id", str, f);
    }

    public nqe e() {
        nqe.b f = nqe.f();
        f.e(this.a);
        return (nqe) je.S("increase_volume", 1, "hit", f);
    }

    public nqe f(String str) {
        nqe.b f = nqe.f();
        return (nqe) je.R(je.T(f, this.a, "like", 1, "hit"), "item_to_be_liked", str, f);
    }

    public nqe g(String str) {
        nqe.b f = nqe.f();
        return (nqe) je.R(je.T(f, this.a, ContextTrack.TrackAction.PAUSE, 1, "hit"), "item_to_be_paused", str, f);
    }

    public nqe h(String str) {
        nqe.b f = nqe.f();
        return (nqe) je.R(je.T(f, this.a, "play", 1, "hit"), "item_to_be_played", str, f);
    }

    public nqe i() {
        nqe.b f = nqe.f();
        f.e(this.a);
        return (nqe) je.S("play_something", 1, "hit", f);
    }

    public nqe j(String str) {
        nqe.b f = nqe.f();
        return (nqe) je.R(je.T(f, this.a, "remove_like", 1, "hit"), "item_no_longer_liked", str, f);
    }

    public nqe k() {
        nqe.b f = nqe.f();
        f.e(this.a);
        return (nqe) je.S("repeat_disable", 1, "hit", f);
    }

    public nqe l() {
        nqe.b f = nqe.f();
        f.e(this.a);
        return (nqe) je.S("repeat_enable", 1, "hit", f);
    }

    public nqe m() {
        nqe.b f = nqe.f();
        f.e(this.a);
        return (nqe) je.S("repeat_one_enable", 1, "hit", f);
    }

    public nqe n(String str) {
        nqe.b f = nqe.f();
        return (nqe) je.R(je.T(f, this.a, ContextTrack.TrackAction.RESUME, 1, "hit"), "item_to_be_resumed", str, f);
    }

    public nqe o() {
        nqe.b f = nqe.f();
        f.e(this.a);
        return (nqe) je.S("search", 1, "hit", f);
    }

    public nqe p(Integer num) {
        nqe.b f = nqe.f();
        f.e(this.a);
        nqe.b bVar = f;
        bVar.h(je.U("seek_by_time", 1, "hit", "ms_seeked_offset", num));
        return (nqe) bVar.c();
    }

    public nqe q(Integer num) {
        nqe.b f = nqe.f();
        f.e(this.a);
        nqe.b bVar = f;
        bVar.h(je.U("seek_to_time", 1, "hit", "ms_to_seek_to", num));
        return (nqe) bVar.c();
    }

    public nqe r(String str, Integer num) {
        nqe.b f = nqe.f();
        if (num.intValue() < 0) {
            f.g("Input parameter is negative");
        }
        qqe.b T = je.T(f, this.a, "set_playback_speed", 1, "hit");
        T.d("currently_played_item", str);
        T.d(ContextTrack.Metadata.KEY_PLAYBACK_SPEED, num);
        f.h(T.a());
        return (nqe) f.c();
    }

    public nqe s(Integer num) {
        nqe.b f = nqe.f();
        f.e(this.a);
        nqe.b bVar = f;
        bVar.h(je.U("set_volume", 1, "hit", "new_volume_percentage", num));
        return (nqe) bVar.c();
    }

    public nqe t() {
        nqe.b f = nqe.f();
        f.e(this.a);
        return (nqe) je.S("shuffle_disable", 1, "hit", f);
    }

    public nqe u() {
        nqe.b f = nqe.f();
        f.e(this.a);
        return (nqe) je.S("shuffle_enable", 1, "hit", f);
    }

    public nqe v(String str) {
        nqe.b f = nqe.f();
        return (nqe) je.R(je.T(f, this.a, "skip_to_next", 1, "hit"), "item_to_be_skipped", str, f);
    }

    public nqe w(String str) {
        nqe.b f = nqe.f();
        return (nqe) je.R(je.T(f, this.a, "skip_to_previous", 1, "hit"), "item_to_be_skipped", str, f);
    }

    public nqe x(String str) {
        nqe.b f = nqe.f();
        return (nqe) je.R(je.T(f, this.a, "ui_navigate", 1, "hit"), "destination", str, f);
    }
}
