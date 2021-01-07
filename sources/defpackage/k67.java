package defpackage;

import com.spotify.music.loggers.InteractionLogger;

/* renamed from: k67  reason: default package */
public class k67 implements w57 {
    private final InteractionLogger a;

    public k67(InteractionLogger interactionLogger) {
        this.a = interactionLogger;
    }

    @Override // defpackage.w57
    public void f(String str, int i) {
        this.a.a(str, null, i, InteractionLogger.InteractionType.HIT, "open-topic-page");
    }
}
