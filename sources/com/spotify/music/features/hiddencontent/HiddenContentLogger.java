package com.spotify.music.features.hiddencontent;

import com.spotify.music.loggers.InteractionLogger;
import com.spotify.ubi.specification.factories.f1;

public class HiddenContentLogger {
    private final InteractionLogger a;
    private final f1 b;
    private final ere c;

    /* access modifiers changed from: package-private */
    public enum UserIntent {
        SONGS_TAB_CLICKED("songs-tab-clicked"),
        ARTISTS_TAB_CLICKED("artists-tab-clicked"),
        TRACK_CONTEXT_MENU_CLICKED("track-context-menu-clicked"),
        ARTIST_CONTEXT_MENU_CLICKED("artist-context-menu-clicked"),
        ARTIST_CLICKED("artist-clicked"),
        PLAY_PREVIEW_VIA_ROW("play-preview-via-row"),
        PLAY_PREVIEW_VIA_IMAGE("play-preview-via-image");
        
        private final String mStrValue;

        private UserIntent(String str) {
            this.mStrValue = str;
        }

        @Override // java.lang.Enum, java.lang.Object
        public String toString() {
            return this.mStrValue;
        }
    }

    public HiddenContentLogger(InteractionLogger interactionLogger, f1 f1Var, ere ere) {
        this.a = interactionLogger;
        this.b = f1Var;
        this.c = ere;
    }

    private void e(String str, String str2, int i, InteractionLogger.InteractionType interactionType, UserIntent userIntent) {
        this.a.a(str, str2, i, interactionType, userIntent.toString());
    }

    public void a(String str, int i) {
        e(str, "list-of-artists", i, InteractionLogger.InteractionType.HIT, UserIntent.ARTIST_CLICKED);
        this.c.a(this.b.b("artists").b(Integer.valueOf(i), str).c(str));
    }

    public void b(String str, int i) {
        e(str, "list-of-artists", i, InteractionLogger.InteractionType.HIT, UserIntent.ARTIST_CONTEXT_MENU_CLICKED);
        this.c.a(this.b.b("artists").b(Integer.valueOf(i), str).b().a());
    }

    public void c() {
        e(null, "tabs", 0, InteractionLogger.InteractionType.HIT, UserIntent.ARTISTS_TAB_CLICKED);
        this.c.a(this.b.c().b("artists").a());
    }

    public void d() {
        this.c.a(this.b.b("artists").c());
    }

    public void f(String str, int i) {
        e(str, "list-of-tracks", i, InteractionLogger.InteractionType.HIT, UserIntent.PLAY_PREVIEW_VIA_IMAGE);
        this.c.a(this.b.b("songs").d(Integer.valueOf(i), str).b().a(str));
    }

    public void g(String str, int i) {
        e(str, "list-of-tracks", i, InteractionLogger.InteractionType.HIT, UserIntent.PLAY_PREVIEW_VIA_ROW);
        this.c.a(this.b.b("songs").d(Integer.valueOf(i), str).d(str));
    }

    public void h(String str, int i) {
        e(str, "list-of-tracks", i, InteractionLogger.InteractionType.HIT, UserIntent.PLAY_PREVIEW_VIA_IMAGE);
        this.c.a(this.b.b("songs").d(Integer.valueOf(i), str).b().b(str));
    }

    public void i(String str, int i) {
        e(str, "list-of-tracks", i, InteractionLogger.InteractionType.HIT, UserIntent.PLAY_PREVIEW_VIA_ROW);
        this.c.a(this.b.b("songs").d(Integer.valueOf(i), str).e(str));
    }

    public void j() {
        e(null, "tabs", 0, InteractionLogger.InteractionType.HIT, UserIntent.SONGS_TAB_CLICKED);
        this.c.a(this.b.c().b("songs").a());
    }

    public void k() {
        this.c.a(this.b.b("songs").c());
    }

    public void l(String str, int i) {
        e(str, "list-of-tracks", i, InteractionLogger.InteractionType.HIT, UserIntent.TRACK_CONTEXT_MENU_CLICKED);
        this.c.a(this.b.b("songs").d(Integer.valueOf(i), str).c().a());
    }

    public void m(String str) {
        this.c.a(this.b.d(str).b().a(str));
    }
}
