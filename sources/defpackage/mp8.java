package defpackage;

import com.google.protobuf.u;
import com.spotify.messages.TasteOnboardingSearchInteraction;
import com.spotify.music.features.tasteonboarding.logging.Intent;
import com.spotify.music.features.tasteonboarding.logging.b;
import com.spotify.music.loggers.ImpressionLogger;

/* renamed from: mp8  reason: default package */
public class mp8 implements lp8 {
    private final ImpressionLogger a;
    private final gl0<u> b;
    private final b c;
    private final b d;

    mp8(ImpressionLogger impressionLogger, gl0<u> gl0, b bVar, b bVar2) {
        this.a = impressionLogger;
        this.b = gl0;
        this.c = bVar;
        this.d = bVar2;
    }

    @Override // defpackage.lp8
    public void a(String str, int i) {
        this.a.a(str, "to-artist-search", i, ImpressionLogger.ImpressionType.ITEM, ImpressionLogger.RenderType.GRID);
    }

    @Override // defpackage.lp8
    public void b(int i, int i2, String str, String str2, String str3, String str4, String str5) {
        Intent intent = Intent.SELECT_ENABLE;
        this.b.c(wl8.j(i, i2, str, intent.d(), this.d.a(), str2, str3, str4, str5));
        TasteOnboardingSearchInteraction.b p = TasteOnboardingSearchInteraction.p();
        p.q(this.d.a());
        p.p(this.c.a());
        p.n(intent.d());
        p.m("item");
        p.r(str2);
        if (str != null) {
            p.o(str);
        }
        this.b.c(p.build());
    }

    @Override // defpackage.lp8
    public void c() {
        TasteOnboardingSearchInteraction.b p = TasteOnboardingSearchInteraction.p();
        p.q(this.d.a());
        p.p(this.c.a());
        p.n(Intent.NAVIGATE_BACK.d());
        p.m("device-back-button");
        this.b.c(p.build());
    }

    @Override // defpackage.lp8
    public void d(String str) {
        TasteOnboardingSearchInteraction.b p = TasteOnboardingSearchInteraction.p();
        p.q(this.d.a());
        p.p(this.c.a());
        p.n(Intent.CLEAR.d());
        p.m("clear-button");
        if (str != null) {
            p.o(str);
        }
        this.b.c(p.build());
    }

    @Override // defpackage.lp8
    public void e(String str) {
        TasteOnboardingSearchInteraction.b p = TasteOnboardingSearchInteraction.p();
        p.q(this.d.a());
        p.p(this.c.a());
        p.n(Intent.NAVIGATE_BACK.d());
        p.m("search-back-button");
        if (str != null) {
            p.o(str);
        }
        this.b.c(p.build());
    }

    @Override // defpackage.lp8
    public void f(String str, int i) {
        this.a.a(str, "to-artist-search", i, ImpressionLogger.ImpressionType.EXTENDED_SEARCH_ITEM, ImpressionLogger.RenderType.GRID);
    }
}
