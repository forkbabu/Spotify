package defpackage;

import com.spotify.instrumentation.a;
import com.spotify.music.libs.viewuri.c;
import com.spotify.music.loggers.ImpressionLogger;
import com.spotify.music.loggers.InteractionLogger;
import com.spotify.music.ubi.interactions.InteractionAction;

/* renamed from: ozb  reason: default package */
public final class ozb {
    private final InteractionLogger a;
    private final jz1 b;
    private final cqe c;
    private final c d;
    private final String e;
    private final String f;

    public ozb(InteractionLogger interactionLogger, cqe cqe, c cVar, a aVar, String str, jz1 jz1) {
        this.a = interactionLogger;
        this.b = jz1;
        this.c = cqe;
        this.d = cVar;
        this.f = str;
        this.e = aVar.path();
    }

    public void a(String str, String str2) {
        this.b.a(new da1(str, this.e, this.d.toString(), je.I0(new StringBuilder(), this.f, "toggle_button"), 0, str2, ImpressionLogger.ImpressionType.BUTTON.toString(), "", (double) this.c.d()));
    }

    public void b(String str, String str2) {
        this.a.d(str, str2, je.I0(new StringBuilder(), this.f, "toggle_button"), 0, InteractionLogger.InteractionType.HIT, "off", InteractionAction.TOGGLE);
    }

    public void c(String str, String str2) {
        this.a.d(str, str2, je.I0(new StringBuilder(), this.f, "toggle_button"), 0, InteractionLogger.InteractionType.HIT, "on", InteractionAction.TOGGLE);
    }
}
