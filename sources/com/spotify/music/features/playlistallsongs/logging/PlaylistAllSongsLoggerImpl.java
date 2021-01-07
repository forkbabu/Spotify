package com.spotify.music.features.playlistallsongs.logging;

import com.spotify.music.loggers.ImpressionLogger;
import com.spotify.music.loggers.InteractionLogger;
import com.spotify.music.ubi.interactions.InteractionAction;
import com.spotify.ubi.specification.factories.j2;

public final class PlaylistAllSongsLoggerImpl implements a {
    private final InteractionLogger a;
    private final ImpressionLogger b;
    private final j2 c;
    private final ere d;

    /* access modifiers changed from: package-private */
    public enum UserIntent {
        CLOSE("close"),
        ADD_SONGS("add-songs"),
        PLAY_PREVIEW_VIA_ROW("play-preview-via-row"),
        PLAY_PREVIEW_VIA_IMAGE("play-preview-via-image"),
        ITEM_CONTEXT_MENU_CLICKED("item-context-menu-clicked"),
        ITEM_DOWNLOAD_CLICKED("item-download-clicked"),
        BACK_NAVIGATION("back-navigation"),
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

    public PlaylistAllSongsLoggerImpl(InteractionLogger interactionLogger, ImpressionLogger impressionLogger, j2 j2Var, ere ere) {
        this.a = interactionLogger;
        this.b = impressionLogger;
        this.c = j2Var;
        this.d = ere;
    }

    private void a(String str, String str2, int i, InteractionLogger.InteractionType interactionType, UserIntent userIntent, InteractionAction interactionAction) {
        this.a.b(str, str2, i, interactionType, userIntent.toString(), null);
    }

    @Override // com.spotify.music.features.playlistallsongs.logging.a
    public void b(String str, int i, boolean z) {
        a(str, "list", i, InteractionLogger.InteractionType.HIT, UserIntent.ITEM_DOWNLOAD_CLICKED, null);
        if (z) {
            this.d.a(this.c.d(Integer.valueOf(i), str).f().a(str));
        } else {
            this.d.a(this.c.d(Integer.valueOf(i), str).f().b(str));
        }
    }

    @Override // com.spotify.music.features.playlistallsongs.logging.a
    public String c(String str, int i, String str2) {
        nqe a2 = this.c.d(Integer.valueOf(i), str).i().a(str2);
        this.d.a(a2);
        return a2.b();
    }

    @Override // com.spotify.music.features.playlistallsongs.logging.a
    public void d(String str, int i, boolean z) {
        if (z) {
            this.d.a(this.c.d(Integer.valueOf(i), str).b().b(str));
        } else {
            this.d.a(this.c.d(Integer.valueOf(i), str).b().a(str));
        }
    }

    @Override // com.spotify.music.features.playlistallsongs.logging.a
    public void e(String str, int i) {
        a(str, "list", i, InteractionLogger.InteractionType.HIT, UserIntent.PLAY_PREVIEW_VIA_IMAGE, null);
        this.d.a(this.c.d(Integer.valueOf(i), str).d().a(str));
    }

    @Override // com.spotify.music.features.playlistallsongs.logging.a
    public void f(String str, int i, boolean z) {
        this.a.b(str, "list", i, InteractionLogger.InteractionType.HIT, (z ? UserIntent.LIKE_ENABLE : UserIntent.LIKE_DISABLE).toString(), z ? InteractionAction.LIKE : InteractionAction.UNLIKE);
        if (z) {
            this.d.a(this.c.d(Integer.valueOf(i), str).h().a(str));
        } else {
            this.d.a(this.c.d(Integer.valueOf(i), str).h().b(str));
        }
    }

    @Override // com.spotify.music.features.playlistallsongs.logging.a
    public void g(boolean z) {
        a(null, "toolbar", 0, InteractionLogger.InteractionType.HIT, UserIntent.CLOSE, null);
        if (z) {
            this.d.a(this.c.e().b().b());
        } else {
            this.d.a(this.c.e().b().a());
        }
    }

    @Override // com.spotify.music.features.playlistallsongs.logging.a
    public void h(String str, int i) {
        a(str, "list", i, InteractionLogger.InteractionType.HIT, UserIntent.ITEM_CONTEXT_MENU_CLICKED, null);
        this.d.a(this.c.d(Integer.valueOf(i), str).c().a());
    }

    @Override // com.spotify.music.features.playlistallsongs.logging.a
    public void i(String str, int i, boolean z) {
        a(str, "list", i, InteractionLogger.InteractionType.HIT, z ? UserIntent.BAN_ENABLE : UserIntent.BAN_DISABLE, null);
        if (z) {
            this.d.a(this.c.d(Integer.valueOf(i), str).e().a(str));
        } else {
            this.d.a(this.c.d(Integer.valueOf(i), str).e().b(str));
        }
    }

    @Override // com.spotify.music.features.playlistallsongs.logging.a
    public void j(boolean z) {
        a(null, "view", 0, InteractionLogger.InteractionType.HIT, UserIntent.BACK_NAVIGATION, null);
        if (z) {
            this.d.a(this.c.c().b());
        } else {
            this.d.a(this.c.c().a());
        }
    }

    @Override // com.spotify.music.features.playlistallsongs.logging.a
    public void k() {
        a(null, "header", 0, InteractionLogger.InteractionType.HIT, UserIntent.ADD_SONGS, null);
        this.d.a(this.c.b().a("assisted-curation"));
    }

    @Override // com.spotify.music.features.playlistallsongs.logging.a
    public void l() {
        this.b.a(null, "update-confirmation", 0, ImpressionLogger.ImpressionType.DIALOG, ImpressionLogger.RenderType.DIALOG);
        this.d.a(this.c.f().a());
    }

    @Override // com.spotify.music.features.playlistallsongs.logging.a
    public void m(String str, int i) {
        a(str, "list", i, InteractionLogger.InteractionType.HIT, UserIntent.PLAY_PREVIEW_VIA_ROW, null);
        this.d.a(this.c.d(Integer.valueOf(i), str).g(str));
    }
}
