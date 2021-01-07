package com.spotify.music.features.addtoplaylist.logger;

import com.spotify.instrumentation.a;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.loggers.ImpressionLogger;
import com.spotify.music.loggers.InteractionLogger;
import com.spotify.ubi.specification.factories.e;

public class AddToPlaylistLoggerImpl implements c {
    private static final String e = t52.a(LinkType.COLLECTION_YOUR_EPISODES).b().get(0);
    private final InteractionLogger a;
    private final ImpressionLogger b;
    private final ere c;
    private final e d;

    /* access modifiers changed from: package-private */
    public enum UserIntent {
        ADD("add"),
        UP(PlayerTrack.TRACK_THUMB_STATE_UP),
        BACK_NAVIGATION("back-navigation"),
        CREATE("create"),
        NAVIGATE("navigate"),
        CANCEL("cancel"),
        ADD_NON_DUPLICATE_TRACKS("add-non-duplicate-tracks"),
        DONT_ADD_NON_DUPLICATE_TRACKS("dont-add-non-duplicate-tracks"),
        ADD_ALL_TRACKS("add-all-tracks");
        
        private final String mStrValue;

        private UserIntent(String str) {
            this.mStrValue = str;
        }

        @Override // java.lang.Enum, java.lang.Object
        public String toString() {
            return this.mStrValue;
        }
    }

    public AddToPlaylistLoggerImpl(InteractionLogger interactionLogger, ImpressionLogger impressionLogger, ere ere, a aVar) {
        this.a = interactionLogger;
        this.b = impressionLogger;
        this.c = ere;
        this.d = new e(aVar.path());
    }

    private void m(String str, String str2, int i, InteractionLogger.InteractionType interactionType, UserIntent userIntent) {
        this.a.a(str, str2, i, interactionType, userIntent.toString());
    }

    @Override // com.spotify.music.features.addtoplaylist.logger.c
    public void a() {
        m(null, "view", 0, InteractionLogger.InteractionType.HIT, UserIntent.BACK_NAVIGATION);
        this.c.a(this.d.c().a());
    }

    @Override // com.spotify.music.features.addtoplaylist.logger.c
    public void b(String str) {
        m(str, "duplicate-song-dialog", 0, InteractionLogger.InteractionType.HIT, UserIntent.CANCEL);
        this.c.a(this.d.f().a());
    }

    @Override // com.spotify.music.features.addtoplaylist.logger.c
    public void c(String str, String str2) {
        m(str, "duplicate-song-dialog", 0, InteractionLogger.InteractionType.HIT, UserIntent.ADD_NON_DUPLICATE_TRACKS);
        this.c.a(this.d.e().a(str, str2));
    }

    @Override // com.spotify.music.features.addtoplaylist.logger.c
    public void d() {
    }

    @Override // com.spotify.music.features.addtoplaylist.logger.c
    public void e(String str) {
        this.b.a(str, "duplicate-songs-dialog", 0, ImpressionLogger.ImpressionType.DIALOG, ImpressionLogger.RenderType.DIALOG);
        this.c.a(this.d.h().a());
    }

    @Override // com.spotify.music.features.addtoplaylist.logger.c
    public void f(String str, String str2) {
        m(str, "duplicate-song-dialog", 0, InteractionLogger.InteractionType.HIT, UserIntent.ADD_ALL_TRACKS);
        this.c.a(this.d.b().a(str, str2));
    }

    @Override // com.spotify.music.features.addtoplaylist.logger.c
    public void g(String str) {
        ere ere = this.c;
        e eVar = this.d;
        String str2 = e;
        ere.a(eVar.i(0, str2).a(str2, str));
    }

    @Override // com.spotify.music.features.addtoplaylist.logger.c
    public void h() {
        m(null, "create-new-playlist-button", 0, InteractionLogger.InteractionType.HIT, UserIntent.CREATE);
        this.c.a(this.d.d().a());
    }

    @Override // com.spotify.music.features.addtoplaylist.logger.c
    public void i(String str) {
        this.b.a(str, "duplicate-song-dialog", 0, ImpressionLogger.ImpressionType.DIALOG, ImpressionLogger.RenderType.DIALOG);
        this.c.a(this.d.g().a());
    }

    @Override // com.spotify.music.features.addtoplaylist.logger.c
    public void j(String str) {
        this.c.a(this.d.i(0, e).b(str));
    }

    @Override // com.spotify.music.features.addtoplaylist.logger.c
    public void k(String str, int i, String str2) {
        m(str, "list-of-playlists", i, InteractionLogger.InteractionType.HIT, UserIntent.ADD);
        this.c.a(this.d.i(Integer.valueOf(i), str).a(str, str2));
    }

    @Override // com.spotify.music.features.addtoplaylist.logger.c
    public void l(String str) {
        m(str, "duplicate-song-dialog", 0, InteractionLogger.InteractionType.HIT, UserIntent.DONT_ADD_NON_DUPLICATE_TRACKS);
        this.c.a(this.d.f().a());
    }
}
