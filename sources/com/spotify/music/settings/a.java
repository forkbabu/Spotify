package com.spotify.music.settings;

import com.spotify.cosmos.android.FireAndForgetResolver;
import io.reactivex.s;

public class a {
    public static final C0340a<Boolean> d = new C0340a<>("offline_mode");
    public static final C0340a<Boolean> e = new C0340a<>("play_explicit_content");
    public static final C0340a<Boolean> f = new C0340a<>("private_session");
    public static final C0340a<Boolean> g = new C0340a<>("download_over_3g");
    public static final C0340a<Integer> h = new C0340a<>("download_quality");
    public static final C0340a<Integer> i = new C0340a<>("stream_quality");
    public static final C0340a<Integer> j = new C0340a<>("stream_non_metered_quality");
    public static final C0340a<Boolean> k = new C0340a<>("gapless");
    public static final C0340a<Boolean> l = new C0340a<>("automix");
    public static final C0340a<Boolean> m = new C0340a<>("normalize");
    public static final C0340a<Integer> n = new C0340a<>("loudness_environment");
    public static final C0340a<Boolean> o = new C0340a<>("crossfade");
    public static final C0340a<Integer> p = new C0340a<>("crossfade_time_seconds");
    public static final C0340a<Boolean> q = new C0340a<>("show_unavailable_tracks");
    public static final C0340a<Integer> r = new C0340a<>("download_preferred_resource_type");
    public static final C0340a<Boolean> s = new C0340a<>("trim_silence");
    private final s<SettingsState> a;
    private final FireAndForgetResolver b;
    private final d c;

    /* renamed from: com.spotify.music.settings.a$a  reason: collision with other inner class name */
    public static class C0340a<T> {
        private final String a;

        public C0340a(String str) {
            this.a = str;
        }
    }

    public a(d dVar, FireAndForgetResolver fireAndForgetResolver) {
        this.c = dVar;
        this.a = dVar.a().E().v0(1).h1();
        this.b = fireAndForgetResolver;
    }

    public s<SettingsState> a() {
        return this.a;
    }

    public <T> void b(C0340a<T> aVar, T t) {
        this.b.detached(this.c.b(((C0340a) aVar).a, String.valueOf(t)));
    }
}
