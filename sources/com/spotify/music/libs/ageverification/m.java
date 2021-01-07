package com.spotify.music.libs.ageverification;

import com.spotify.music.loggers.ImpressionLogger;
import com.spotify.music.loggers.InteractionLogger;
import com.spotify.ubi.specification.factories.k;

public class m {
    private final ImpressionLogger a;
    private final InteractionLogger b;
    private final ere c;
    private final k d;

    public m(ImpressionLogger impressionLogger, InteractionLogger interactionLogger, ere ere, k kVar) {
        this.a = impressionLogger;
        this.b = interactionLogger;
        this.c = ere;
        this.d = kVar;
    }

    private void i(String str, String str2, InteractionLogger.InteractionType interactionType, String str3) {
        this.b.c(str, null, str2, 0, interactionType, str3);
    }

    public void a(String str) {
        this.a.b(str, null, "bad-connection-popup", 0, ImpressionLogger.ImpressionType.DIALOG, ImpressionLogger.RenderType.DIALOG);
        this.c.a(this.d.c(str).c());
    }

    public void b(String str) {
        this.a.b(str, null, "age-verification-popup", 0, ImpressionLogger.ImpressionType.DIALOG, ImpressionLogger.RenderType.DIALOG);
        this.c.a(this.d.b(str).c());
    }

    public void c(String str) {
        i(str, "age-verification-popup", InteractionLogger.InteractionType.HIT, "verify-age");
        this.c.a(this.d.b(str).d().a(""));
    }

    public void d(String str) {
        i(str, "bad-connection-popup", InteractionLogger.InteractionType.HIT, "verify-age-unavailable-try-again");
        this.c.a(this.d.c(str).e().a());
    }

    public void e(String str) {
        i(str, "age-verification-popup", InteractionLogger.InteractionType.HIT, "verify-age-dismiss");
        this.c.a(this.d.b(str).b().a());
    }

    public void f(String str) {
        i(str, "age-verification-popup", InteractionLogger.InteractionType.SWIPE_LEFT, "verify-age-dismiss");
        this.c.a(this.d.b(str).e());
    }

    public void g(String str) {
        i(str, "bad-connection-popup", InteractionLogger.InteractionType.HIT, "verify-age-unavailable-dismiss");
        this.c.a(this.d.c(str).b().a());
    }

    public void h(String str) {
        i(str, "bad-connection-popup", InteractionLogger.InteractionType.SWIPE_LEFT, "verify-age-unavailable-dismiss");
        this.c.a(this.d.c(str).d());
    }
}
