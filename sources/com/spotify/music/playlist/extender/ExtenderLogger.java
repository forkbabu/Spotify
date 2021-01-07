package com.spotify.music.playlist.extender;

import com.spotify.instrumentation.a;
import com.spotify.music.libs.viewuri.c;
import com.spotify.music.loggers.InteractionLogger;
import com.spotify.ubi.specification.factories.l2;

public class ExtenderLogger {
    private final InteractionLogger a;
    private final l2 b;
    private final ere c;

    /* access modifiers changed from: package-private */
    public enum UserIntent {
        ADD_TRACK_CLICKED("add-track-clicked"),
        COLLAPSE_CLICKED("collapse-clicked"),
        EXPAND_CLICKED("expand-clicked"),
        REFRESH_CLICKED("refresh-clicked"),
        TRACK_CLICKED("track-clicked"),
        TRACK_CLICKED_MUTED("track-click-muted");
        
        private final String mStrValue;

        private UserIntent(String str) {
            this.mStrValue = str;
        }

        @Override // java.lang.Enum, java.lang.Object
        public String toString() {
            return this.mStrValue;
        }
    }

    public ExtenderLogger(ere ere, c cVar, InteractionLogger interactionLogger, a aVar) {
        this.a = interactionLogger;
        this.b = new l2(aVar.path(), cVar.toString());
        this.c = ere;
    }

    private void c(String str, String str2, int i, InteractionLogger.InteractionType interactionType, UserIntent userIntent) {
        this.a.a(str, str2, i, interactionType, userIntent.toString());
    }

    public void a(String str, String str2, int i) {
        c(str2, "playlist-extender", i, InteractionLogger.InteractionType.HIT, UserIntent.ADD_TRACK_CLICKED);
        this.c.a(this.b.b().c(str2).b().a(str, str2));
    }

    public void b(boolean z) {
        c(null, "playlist-extender", -1, InteractionLogger.InteractionType.HIT, z ? UserIntent.EXPAND_CLICKED : UserIntent.COLLAPSE_CLICKED);
        if (z) {
            this.c.a(this.b.b().b().b());
        } else {
            this.c.a(this.b.b().b().a());
        }
    }

    public void d() {
        c(null, "playlist-extender", -1, InteractionLogger.InteractionType.HIT, UserIntent.REFRESH_CLICKED);
        this.c.a(this.b.b().d().a());
    }

    public String e(String str, int i) {
        c(str, "playlist-extender", i, InteractionLogger.InteractionType.HIT, UserIntent.TRACK_CLICKED);
        nqe c2 = this.b.b().c(str).c(str);
        this.c.a(c2);
        return c2.b();
    }

    public void f(String str, int i) {
        c(str, "playlist-extender", i, InteractionLogger.InteractionType.HIT, UserIntent.TRACK_CLICKED_MUTED);
        this.c.a(this.b.b().c(str).c(str));
    }
}
