package defpackage;

import com.spotify.music.loggers.InteractionLogger;
import kotlin.jvm.internal.h;

/* renamed from: g67  reason: default package */
public final class g67 implements u57 {
    private final InteractionLogger a;
    private final String b;

    public g67(InteractionLogger interactionLogger, String str) {
        h.e(interactionLogger, "mInteractionLogger");
        h.e(str, "mShowUri");
        this.a = interactionLogger;
        this.b = str;
    }

    @Override // defpackage.u57
    public void g() {
        this.a.a(this.b, null, -1, InteractionLogger.InteractionType.HIT, "clear-podcast-filter");
    }
}
