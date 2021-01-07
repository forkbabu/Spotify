package com.spotify.music.lyrics.core.experience.rx;

import com.spotify.music.lyrics.core.experience.model.Lyrics;
import io.reactivex.s;
import io.reactivex.subjects.c;
import kotlin.Pair;
import kotlin.jvm.internal.h;

public final class a {
    private final c<Pair<Integer, Integer>> a;
    private final c<Lyrics> b;
    private final c<Boolean> c;
    private final c<Pair<Integer, Integer>> d;
    private final c<Integer> e;
    private final c<Integer> f;
    private final c<Integer> g;
    private final c<jdb> h;

    public a() {
        io.reactivex.subjects.a h1 = io.reactivex.subjects.a.h1();
        h.d(h1, "BehaviorSubject.create()");
        this.a = h1;
        io.reactivex.subjects.a h12 = io.reactivex.subjects.a.h1();
        h.d(h12, "BehaviorSubject.create()");
        this.b = h12;
        io.reactivex.subjects.a h13 = io.reactivex.subjects.a.h1();
        h.d(h13, "BehaviorSubject.create()");
        this.c = h13;
        io.reactivex.subjects.a h14 = io.reactivex.subjects.a.h1();
        h.d(h14, "BehaviorSubject.create()");
        this.d = h14;
        io.reactivex.subjects.a h15 = io.reactivex.subjects.a.h1();
        h.d(h15, "BehaviorSubject.create()");
        this.e = h15;
        io.reactivex.subjects.a h16 = io.reactivex.subjects.a.h1();
        h.d(h16, "BehaviorSubject.create()");
        this.f = h16;
        io.reactivex.subjects.a h17 = io.reactivex.subjects.a.h1();
        h.d(h17, "BehaviorSubject.create()");
        this.g = h17;
        io.reactivex.subjects.a h18 = io.reactivex.subjects.a.h1();
        h.d(h18, "BehaviorSubject.create()");
        this.h = h18;
    }

    public final s<Pair<Integer, Integer>> a() {
        s<Pair<Integer, Integer>> E = this.d.E();
        h.d(E, "colorsSubject.distinctUntilChanged()");
        return E;
    }

    public final s<Lyrics> b() {
        s<Lyrics> E = this.b.E();
        h.d(E, "lyricsSubject.distinctUntilChanged()");
        return E;
    }

    public final s<jdb> c() {
        s<jdb> E = this.h.E();
        h.d(E, "lyricsLineSelectionChang…ct.distinctUntilChanged()");
        return E;
    }

    public final s<Integer> d() {
        s<Integer> E = this.e.E();
        h.d(E, "progressSubject.distinctUntilChanged()");
        return E;
    }

    public final s<Integer> e() {
        s<Integer> E = this.f.E();
        h.d(E, "scrollSubject.distinctUntilChanged()");
        return E;
    }

    public final s<Boolean> f() {
        s<Boolean> E = this.c.E();
        h.d(E, "showExtraSubject.distinctUntilChanged()");
        return E;
    }

    public final s<Pair<Integer, Integer>> g() {
        s<Pair<Integer, Integer>> E = this.a.E();
        h.d(E, "sizeSubject.distinctUntilChanged()");
        return E;
    }

    public final s<Integer> h() {
        s<Integer> E = this.g.E();
        h.d(E, "startYSubject.distinctUntilChanged()");
        return E;
    }

    public final void i(int i, int i2) {
        this.a.onNext(new Pair<>(Integer.valueOf(i), Integer.valueOf(i2)));
    }

    public final void j(int i) {
        this.e.onNext(Integer.valueOf(i));
    }

    public final void k(jdb jdb) {
        h.e(jdb, "event");
        this.h.onNext(jdb);
    }

    public final void l(int i, int i2) {
        this.d.onNext(new Pair<>(Integer.valueOf(i), Integer.valueOf(i2)));
    }

    public final void m(Lyrics lyrics, boolean z) {
        h.e(lyrics, "lyrics");
        this.b.onNext(lyrics);
        this.c.onNext(Boolean.valueOf(z));
    }

    public final void n(int i) {
        this.g.onNext(Integer.valueOf(i));
    }

    public final void o(int i) {
        this.f.onNext(Integer.valueOf(i));
    }
}
