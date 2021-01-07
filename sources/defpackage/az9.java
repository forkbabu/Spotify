package defpackage;

import com.spotify.music.slate.container.view.card.CardInteractionHandler;

/* access modifiers changed from: package-private */
/* renamed from: az9  reason: default package */
public class az9 extends CardInteractionHandler.c {
    final /* synthetic */ bz9 a;

    az9(bz9 bz9) {
        this.a = bz9;
    }

    @Override // com.spotify.music.slate.container.view.card.CardInteractionHandler.b
    public void a(CardInteractionHandler.SwipeDirection swipeDirection) {
        bz9.b(this.a);
    }
}
