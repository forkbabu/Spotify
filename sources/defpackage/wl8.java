package defpackage;

import com.google.protobuf.u;
import com.spotify.messages.TasteOnboardingInteraction;
import com.spotify.music.features.tasteonboarding.logging.Intent;
import com.spotify.music.features.tasteonboarding.logging.b;
import com.spotify.music.loggers.ImpressionLogger;
import com.spotify.music.loggers.InteractionLogger;

/* renamed from: wl8  reason: default package */
public class wl8 implements vl8 {
    private final InteractionLogger a;
    private final ImpressionLogger b;
    private final gl0<u> c;
    private final b d;

    wl8(InteractionLogger interactionLogger, ImpressionLogger impressionLogger, gl0<u> gl0, b bVar) {
        this.a = interactionLogger;
        this.b = impressionLogger;
        this.c = gl0;
        this.d = bVar;
    }

    public static u j(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        TasteOnboardingInteraction.b s = TasteOnboardingInteraction.s();
        s.t(str3);
        s.u(str4);
        s.r(i);
        s.q(i2);
        s.o(str2);
        if (str5 != null) {
            s.m(str5);
        }
        if (str6 != null) {
            s.n(str6);
        }
        if (str7 != null) {
            s.s(str7);
        }
        if (str != null) {
            s.p(str);
        }
        return s.build();
    }

    private void k(String str, String str2, int i, ImpressionLogger.ImpressionType impressionType, ImpressionLogger.RenderType renderType) {
        this.b.a(str, str2, i, impressionType, renderType);
    }

    private void l(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6) {
        this.c.c(j(i, i2, str, str2, this.d.a(), str3, str4, str5, str6));
    }

    @Override // defpackage.vl8
    public void a(String str, int i) {
        k(str, "to-artist-picker", i, ImpressionLogger.ImpressionType.ITEM, ImpressionLogger.RenderType.GRID);
    }

    @Override // defpackage.vl8
    public void b(int i, int i2, String str, String str2, String str3, String str4, String str5) {
        l(i, i2, str, Intent.SELECT_ENABLE.d(), str2, str3, str4, str5);
    }

    @Override // defpackage.vl8
    public void c() {
        this.a.a(null, "to-artist-picker", 0, InteractionLogger.InteractionType.HIT, Intent.NAVIGATE_FORWARD.d());
    }

    @Override // defpackage.vl8
    public void d() {
        k(null, "to-artist-picker", 0, ImpressionLogger.ImpressionType.BUTTON, ImpressionLogger.RenderType.PAGE);
    }

    @Override // defpackage.vl8
    public void e() {
        this.a.a(null, "to-artist-picker", 0, InteractionLogger.InteractionType.HIT, Intent.SEARCH.d());
    }

    @Override // defpackage.vl8
    public void f(int i, int i2, String str, String str2, String str3, String str4, String str5) {
        l(i, i2, str, Intent.SELECT_GENRE.d(), str2, str3, str4, str5);
    }

    @Override // defpackage.vl8
    public void g(int i, int i2, String str, String str2, String str3, String str4, String str5) {
        l(i, i2, str, Intent.SELECT_DISABLE.d(), str2, str3, str4, str5);
    }

    @Override // defpackage.vl8
    public void h(String str, int i) {
        k(str, "to-artist-picker", i, ImpressionLogger.ImpressionType.ITEM, ImpressionLogger.RenderType.CAROUSEL);
    }

    @Override // defpackage.vl8
    public void i() {
        k(null, "to-artist-picker", 0, ImpressionLogger.ImpressionType.ERROR, ImpressionLogger.RenderType.PAGE);
    }
}
