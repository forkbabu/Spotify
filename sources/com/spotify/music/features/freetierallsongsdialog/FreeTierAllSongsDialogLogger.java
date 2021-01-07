package com.spotify.music.features.freetierallsongsdialog;

import com.spotify.music.loggers.ImpressionLogger;
import com.spotify.music.loggers.InteractionLogger;
import com.spotify.music.ubi.interactions.a;
import com.spotify.ubi.specification.factories.d1;

public class FreeTierAllSongsDialogLogger {
    private final InteractionLogger a;
    private final ere b;
    private final d1 c;

    /* access modifiers changed from: package-private */
    public enum UserIntent {
        CLOSE("close"),
        BACK_NAVIGATION("back-navigation"),
        PLAY_PREVIEW_VIA_ROW("play-preview-via-row"),
        PLAY_PREVIEW_VIA_IMAGE("play-preview-via-image"),
        TRACK_CONTEXT_MENU_CLICKED("track-context-menu-clicked"),
        ADD_SONGS("add-songs"),
        LIKE_ENABLE("like-enable"),
        LIKE_DISABLE("like-disable"),
        BAN_ENABLE("ban-enable"),
        BAN_DISABLE("ban-disable");
        
        private final String mStrValue;

        private UserIntent(String str) {
            this.mStrValue = str;
        }

        @Override // java.lang.Enum, java.lang.Object
        public String toString() {
            return this.mStrValue;
        }
    }

    public FreeTierAllSongsDialogLogger(InteractionLogger interactionLogger, ImpressionLogger impressionLogger, ere ere, d1 d1Var) {
        this.a = interactionLogger;
        this.b = ere;
        this.c = d1Var;
    }

    private void c(String str, String str2, int i, InteractionLogger.InteractionType interactionType, UserIntent userIntent) {
        this.a.a(str, str2, i, interactionType, userIntent.toString());
    }

    public void a() {
        c(null, "view", 0, InteractionLogger.InteractionType.HIT, UserIntent.BACK_NAVIGATION);
    }

    public void b() {
        c(null, "toolbar", 0, InteractionLogger.InteractionType.HIT, UserIntent.CLOSE);
        this.b.a(this.c.c().b().a());
    }

    public void d(String str, int i) {
        c(str, "list-of-tracks", i, InteractionLogger.InteractionType.HIT, UserIntent.PLAY_PREVIEW_VIA_IMAGE);
        this.b.a(this.c.b().b(Integer.valueOf(i), str).b().a(str));
    }

    public void e(String str, int i) {
        c(str, "list-of-tracks", i, InteractionLogger.InteractionType.HIT, UserIntent.PLAY_PREVIEW_VIA_ROW);
        this.b.a(this.c.b().b(Integer.valueOf(i), str).f(str));
    }

    public void f(String str, int i, boolean z) {
        c(str, "list-of-tracks", i, InteractionLogger.InteractionType.HIT, z ? UserIntent.BAN_DISABLE : UserIntent.BAN_ENABLE);
        d1.b.a.d e = this.c.b().b(Integer.valueOf(i), str).e();
        this.b.a(z ? e.b(str) : e.a(str));
    }

    public void g(String str, int i) {
        c(str, "list-of-tracks", i, InteractionLogger.InteractionType.HIT, UserIntent.TRACK_CONTEXT_MENU_CLICKED);
        this.b.a(this.c.b().b(Integer.valueOf(i), str).c().a());
    }

    public void h(String str, int i, boolean z) {
        this.a.b(str, "list-of-tracks", i, InteractionLogger.InteractionType.HIT, (z ? UserIntent.LIKE_DISABLE : UserIntent.LIKE_ENABLE).toString(), z ? a.b(str) : a.a(str));
        d1.b.a.c d = this.c.b().b(Integer.valueOf(i), str).d();
        this.b.a(z ? d.b(str) : d.a(str));
    }
}
