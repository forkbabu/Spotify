package com.spotify.music.features.languagepicker.logger;

import com.spotify.music.features.languagepicker.model.g;
import com.spotify.music.loggers.ImpressionLogger;
import com.spotify.music.loggers.InteractionLogger;

public class b implements a {
    private final ImpressionLogger a;
    private final InteractionLogger b;

    public b(ImpressionLogger impressionLogger, InteractionLogger interactionLogger) {
        impressionLogger.getClass();
        this.a = impressionLogger;
        interactionLogger.getClass();
        this.b = interactionLogger;
    }

    public void a() {
        LogInfo$View.ERROR.d(this.b);
    }

    public void b() {
        LogInfo$View.LANGUAGES.d(this.b);
    }

    public void c() {
        LogInfo$View.LOADING.d(this.b);
    }

    public void d() {
        LogInfo$View.NO_CONNECTION.d(this.b);
    }

    public void e() {
        LogInfo$View.ERROR.g(this.a);
    }

    public void f(g gVar, int i) {
        this.a.a(gVar.e(), "language-picker", i, ImpressionLogger.ImpressionType.ITEM, ImpressionLogger.RenderType.GRID);
    }

    public void g(g gVar, int i) {
        this.b.a(gVar.e(), "language-picker", i, InteractionLogger.InteractionType.HIT, (gVar.f() ? LogInfo$UserIntent.SELECT : LogInfo$UserIntent.DESELECT).toString());
    }

    public void h() {
        LogInfo$View.LANGUAGES.h(this.b);
    }

    public void i() {
        LogInfo$View.LANGUAGES.g(this.a);
    }

    public void j() {
        LogInfo$View.LOADING.g(this.a);
    }

    public void k() {
        LogInfo$Button.NEXT.g(this.a);
    }

    public void l() {
        LogInfo$Button.NEXT.d(this.b);
    }

    public void m() {
        LogInfo$View.NO_CONNECTION.g(this.a);
    }

    public void n() {
        LogInfo$Button.RETRY.g(this.a);
    }

    public void o() {
        LogInfo$Button.RETRY.d(this.b);
    }
}
