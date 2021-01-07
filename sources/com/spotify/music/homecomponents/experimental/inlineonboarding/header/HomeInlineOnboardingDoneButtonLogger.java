package com.spotify.music.homecomponents.experimental.inlineonboarding.header;

import com.spotify.music.libs.viewuri.c;
import com.spotify.music.loggers.ImpressionLogger;
import com.spotify.music.loggers.InteractionLogger;

public class HomeInlineOnboardingDoneButtonLogger {
    private final jz1 a;
    private final ImpressionLogger b;
    private final ifd c;
    private final c d;
    private final cqe e;

    private enum UserIntent {
        DISMISS_ONBOARDING_SHELF("dismiss_onboarding_shelf");
        
        private final String mIntent;

        private UserIntent(String str) {
            this.mIntent = str;
        }

        public String d() {
            return this.mIntent;
        }
    }

    public HomeInlineOnboardingDoneButtonLogger(jz1 jz1, ImpressionLogger impressionLogger, ifd ifd, c cVar, cqe cqe) {
        this.a = jz1;
        this.b = impressionLogger;
        this.c = ifd;
        this.d = cVar;
        this.e = cqe;
    }

    public void a(n61 n61) {
        UserIntent userIntent = UserIntent.DISMISS_ONBOARDING_SHELF;
        p81 logging = n61.d().logging();
        this.a.a(new fa1(logging.string("ui:source"), this.c.getName(), this.d.toString(), logging.string("ui:group"), -1, "", InteractionLogger.InteractionType.HIT.toString(), userIntent.d(), (double) this.e.d()));
    }

    public void b() {
        this.b.a("", "inline-onboarding-group", -1, ImpressionLogger.ImpressionType.BUTTON, ImpressionLogger.RenderType.BANNER);
    }
}
