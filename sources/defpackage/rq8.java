package defpackage;

import com.spotify.music.features.tasteonboarding.logging.Intent;
import com.spotify.music.loggers.ImpressionLogger;
import com.spotify.music.loggers.InteractionLogger;

/* renamed from: rq8  reason: default package */
public class rq8 {
    private final InteractionLogger a;
    private final ImpressionLogger b;

    public rq8(InteractionLogger interactionLogger, ImpressionLogger impressionLogger) {
        this.a = interactionLogger;
        this.b = impressionLogger;
    }

    public void a() {
        this.a.a(null, "to-skip-dialog", 0, InteractionLogger.InteractionType.HIT, Intent.NAVIGATE_FORWARD.d());
    }

    public void b() {
        this.a.a(null, "to-skip-dialog", 0, InteractionLogger.InteractionType.HIT, Intent.SKIP.d());
    }

    public void c() {
        this.b.a(null, "to-skip-dialog", 0, ImpressionLogger.ImpressionType.DIALOG, ImpressionLogger.RenderType.DIALOG);
    }
}
