package defpackage;

import com.spotify.music.loggers.InteractionLogger;
import com.spotify.music.ubi.interactions.InteractionAction;

/* renamed from: i67  reason: default package */
public class i67 implements v57 {
    private final InteractionLogger a;
    private final String b;

    public i67(InteractionLogger interactionLogger, String str) {
        this.a = interactionLogger;
        this.b = str;
    }

    @Override // defpackage.v57
    public void a() {
        InteractionLogger interactionLogger = this.a;
        String str = this.b;
        InteractionLogger.InteractionType interactionType = InteractionLogger.InteractionType.HIT;
        InteractionAction interactionAction = InteractionAction.FOLLOW;
        interactionLogger.b(str, null, -1, interactionType, interactionAction.d(), interactionAction);
    }

    @Override // defpackage.v57
    public void b() {
        InteractionLogger interactionLogger = this.a;
        String str = this.b;
        InteractionLogger.InteractionType interactionType = InteractionLogger.InteractionType.HIT;
        InteractionAction interactionAction = InteractionAction.UNFOLLOW;
        interactionLogger.b(str, null, -1, interactionType, interactionAction.d(), interactionAction);
    }
}
