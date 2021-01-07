package defpackage;

import com.spotify.inappmessaging.InAppMessagingLogger;
import com.spotify.music.slate.container.view.card.CardInteractionHandler;

/* access modifiers changed from: package-private */
/* renamed from: u08  reason: default package */
public class u08 extends CardInteractionHandler.c {
    final /* synthetic */ v08 a;

    u08(v08 v08) {
        this.a = v08;
    }

    @Override // com.spotify.music.slate.container.view.card.CardInteractionHandler.b
    public void a(CardInteractionHandler.SwipeDirection swipeDirection) {
        if (this.a.c != null) {
            this.a.c.L4(InAppMessagingLogger.DismissType.SWIPE);
        }
        this.a.l();
    }
}
