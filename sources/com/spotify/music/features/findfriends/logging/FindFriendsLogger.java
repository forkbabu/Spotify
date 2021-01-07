package com.spotify.music.features.findfriends.logging;

import com.spotify.music.loggers.InteractionLogger;
import com.spotify.ubi.specification.factories.b1;

public class FindFriendsLogger {
    private final InteractionLogger a;
    private final ere b;
    private final b1 c = new b1();

    public enum UserIntent {
        FOCUS("focus"),
        FOLLOW("follow"),
        NAVIGATE_FORWARD("navigate-forward"),
        UNFOLLOW("unfollow");
        
        private final String mStrValue;

        private UserIntent(String str) {
            this.mStrValue = str;
        }

        @Override // java.lang.Enum, java.lang.Object
        public String toString() {
            return this.mStrValue;
        }
    }

    public FindFriendsLogger(InteractionLogger interactionLogger, ere ere) {
        this.a = interactionLogger;
        this.b = ere;
    }

    public void a() {
        this.b.a(this.c.b().a());
    }

    public void b() {
        this.b.a(this.c.c().a());
        this.a.a(null, "filter-friends", -1, InteractionLogger.InteractionType.HIT, UserIntent.FOCUS.toString());
    }

    public void c() {
        this.b.a(this.c.d().a("all"));
        this.a.a(null, "follow-all-button", -1, InteractionLogger.InteractionType.HIT, UserIntent.FOLLOW.toString());
    }

    public void d(int i, String str) {
        this.b.a(this.c.e().b(Integer.valueOf(i), str).c(str));
    }

    public void e(int i, String str, boolean z) {
        if (z) {
            this.b.a(this.c.e().b(Integer.valueOf(i), str).b().a(str));
        } else {
            this.b.a(this.c.e().b(Integer.valueOf(i), str).b().b(str));
        }
    }
}
