package com.spotify.music.features.createplaylist.logger;

import com.spotify.instrumentation.a;
import com.spotify.music.loggers.InteractionLogger;
import com.spotify.ubi.specification.factories.t0;

public class CreatePlaylistLoggerImpl implements a {
    private final ere a;
    private final InteractionLogger b;
    private final t0 c;

    /* access modifiers changed from: package-private */
    public enum UserIntent {
        CLOSE("close"),
        BACK_NAVIGATION("back-navigation"),
        CREATE("create"),
        CREATE_DEFAULT_NAME_PLAYLIST("create-default-name-playlist");
        
        private final String mStrValue;

        private UserIntent(String str) {
            this.mStrValue = str;
        }

        @Override // java.lang.Enum, java.lang.Object
        public String toString() {
            return this.mStrValue;
        }
    }

    public CreatePlaylistLoggerImpl(ere ere, InteractionLogger interactionLogger, a aVar) {
        this.b = interactionLogger;
        this.a = ere;
        this.c = new t0(aVar.path());
    }

    private void d(String str, UserIntent userIntent) {
        this.b.a(null, str, 0, InteractionLogger.InteractionType.HIT, userIntent.toString());
    }

    @Override // com.spotify.music.features.createplaylist.logger.a
    public void a() {
        d("view", UserIntent.BACK_NAVIGATION);
        this.a.a(this.c.b().a());
    }

    @Override // com.spotify.music.features.createplaylist.logger.a
    public void b() {
        d("dialog-buttons", UserIntent.CLOSE);
        this.a.a(this.c.c().a());
    }

    @Override // com.spotify.music.features.createplaylist.logger.a
    public String c(boolean z) {
        nqe nqe;
        d("dialog-buttons", z ? UserIntent.CREATE : UserIntent.CREATE_DEFAULT_NAME_PLAYLIST);
        if (z) {
            nqe = this.c.e().a();
        } else {
            nqe = this.c.d().a();
        }
        this.a.a(nqe);
        return nqe.b();
    }
}
