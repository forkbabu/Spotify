package com.spotify.music.features.renameplaylist;

import com.spotify.instrumentation.a;
import com.spotify.music.loggers.InteractionLogger;
import com.spotify.ubi.specification.factories.n3;

public class RenamePlaylistLogger {
    private final String a;
    private final ere b;
    private final InteractionLogger c;
    private final n3 d;

    /* access modifiers changed from: package-private */
    public enum UserIntent {
        CLOSE("close"),
        BACK_NAVIGATION("back-navigation"),
        RENAME("rename");
        
        private final String mStrValue;

        private UserIntent(String str) {
            this.mStrValue = str;
        }

        @Override // java.lang.Enum, java.lang.Object
        public String toString() {
            return this.mStrValue;
        }
    }

    public RenamePlaylistLogger(n48 n48, ere ere, InteractionLogger interactionLogger, a aVar) {
        this.c = interactionLogger;
        this.b = ere;
        String a2 = n48.a();
        this.a = a2;
        this.d = new n3(aVar.path(), a2);
    }

    private void c(String str, String str2, int i, InteractionLogger.InteractionType interactionType, UserIntent userIntent) {
        this.c.a(null, str2, i, interactionType, userIntent.toString());
    }

    public void a() {
        c(null, "view", 0, InteractionLogger.InteractionType.HIT, UserIntent.BACK_NAVIGATION);
        this.b.a(this.d.b().a());
    }

    public void b() {
        c(null, "dialog-buttons", 0, InteractionLogger.InteractionType.HIT, UserIntent.CLOSE);
        this.b.a(this.d.c().a());
    }

    public void d() {
        c(null, "dialog-buttons", 0, InteractionLogger.InteractionType.HIT, UserIntent.RENAME);
        this.b.a(this.d.d().a(this.a));
    }
}
