package defpackage;

import com.spotify.music.loggers.InteractionLogger;

/* renamed from: dlc  reason: default package */
public class dlc implements alc {
    private final InteractionLogger a;
    private final String b;

    dlc(InteractionLogger interactionLogger, String str) {
        this.a = interactionLogger;
        this.b = str;
    }

    @Override // defpackage.alc
    public void a(String str, int i) {
        this.a.a(str, this.b, i, InteractionLogger.InteractionType.HIT, "navigate-to-show-page");
    }
}
