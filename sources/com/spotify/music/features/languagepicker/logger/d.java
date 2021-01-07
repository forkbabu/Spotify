package com.spotify.music.features.languagepicker.logger;

import com.spotify.music.loggers.ImpressionLogger;
import com.spotify.music.loggers.InteractionLogger;

public class d {
    private final InteractionLogger a;
    private final ImpressionLogger b;

    public d(InteractionLogger interactionLogger, ImpressionLogger impressionLogger) {
        this.a = interactionLogger;
        this.b = impressionLogger;
    }

    public void a() {
        this.b.a("no-skip-dialog", "language-picker-no-skip-dialog", 0, ImpressionLogger.ImpressionType.DIALOG, ImpressionLogger.RenderType.DIALOG);
    }

    public void b() {
        LogInfo$Button.GOT_IT.d(this.a);
    }

    public void c() {
        LogInfo$Button.GOT_IT.g(this.b);
    }
}
