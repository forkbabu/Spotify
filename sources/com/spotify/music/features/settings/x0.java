package com.spotify.music.features.settings;

import com.spotify.android.flags.c;
import com.spotify.music.features.settings.adapter.Item;
import com.spotify.music.loggers.InteractionLogger;
import com.spotify.music.ubi.interactions.InteractionAction;
import java.util.Locale;

public class x0 implements w0 {
    private static final String d = InteractionAction.TOGGLE.d();
    private final c a;
    private final cqe b;
    private final jz1 c;

    public x0(c cVar, cqe cqe, jz1 jz1) {
        this.a = cVar;
        this.b = cqe;
        this.c = jz1;
    }

    private String a(Item item) {
        return item.i(this.a).name().toLowerCase(Locale.getDefault());
    }

    public void b(Item item, String str, int i) {
        String lowerCase = item.name().toLowerCase(Locale.getDefault());
        this.c.a(new ga1(null, lowerCase, str, a(item), -1, null, InteractionLogger.InteractionType.DRAG_SLIDER.toString(), lowerCase + "-value-" + i, (double) this.b.d(), null));
    }

    public void c(Item item, String str) {
        this.c.a(new ga1(null, item.name().toLowerCase(Locale.getDefault()), str, a(item), -1, null, InteractionLogger.InteractionType.HIT.toString(), "logout", (double) this.b.d(), null));
    }

    public void d(Item item, String str) {
        this.c.a(new ga1(null, item.name().toLowerCase(Locale.getDefault()), str, a(item), -1, null, InteractionLogger.InteractionType.HIT.toString(), "navigate-forward", (double) this.b.d(), null));
    }

    public void e(Item item, String str, String str2) {
        this.c.a(new ga1(null, item.name().toLowerCase(Locale.getDefault()), str, a(item), -1, str2, InteractionLogger.InteractionType.HIT.toString(), "navigate-forward", (double) this.b.d(), null));
    }

    public void f(String str, String str2, String str3, String str4) {
        this.c.a(new ga1(null, str, str2, null, -1, str4, InteractionLogger.InteractionType.HIT.toString(), "navigate-forward", (double) this.b.d(), null));
    }

    public void g(Item item, String str, String str2) {
        String lowerCase = item.name().toLowerCase(Locale.getDefault());
        StringBuilder Z0 = je.Z0(lowerCase, "-value-");
        Z0.append(str2.toLowerCase(Locale.getDefault()));
        this.c.a(new ga1(null, lowerCase, str, a(item), -1, null, InteractionLogger.InteractionType.HIT.toString(), Z0.toString(), (double) this.b.d(), null));
    }

    public void h(Item item, String str, boolean z) {
        String lowerCase = item.name().toLowerCase(Locale.getDefault());
        StringBuilder sb = new StringBuilder();
        sb.append(lowerCase);
        sb.append('-');
        sb.append(z ? "enable" : "disable");
        this.c.a(new ga1(null, lowerCase, str, a(item), -1, null, InteractionLogger.InteractionType.HIT.toString(), sb.toString(), (double) this.b.d(), d));
    }
}
