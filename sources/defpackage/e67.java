package defpackage;

import com.spotify.music.loggers.InteractionLogger;

/* renamed from: e67  reason: default package */
public class e67 implements t57 {
    private final InteractionLogger a;
    private final String b;

    public e67(InteractionLogger interactionLogger, String str) {
        this.a = interactionLogger;
        this.b = str;
    }

    @Override // defpackage.t57
    public void c(String str) {
        this.a.a(str, "show-description", -1, InteractionLogger.InteractionType.HIT, "open-show-description-url");
    }

    @Override // defpackage.t57
    public void e() {
        this.a.a(this.b, "show-description", -1, InteractionLogger.InteractionType.HIT, "expand-show-description");
    }

    @Override // defpackage.t57
    public void h() {
    }
}
