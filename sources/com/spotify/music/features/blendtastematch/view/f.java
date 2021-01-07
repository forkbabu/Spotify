package com.spotify.music.features.blendtastematch.view;

import com.spotify.music.slate.container.view.card.CardInteractionHandler;
import kotlin.jvm.internal.h;

final class f extends CardInteractionHandler.c {
    private final da2<t44> a;

    public f(da2<t44> da2) {
        h.e(da2, "eventConsumer");
        this.a = da2;
    }

    @Override // com.spotify.music.slate.container.view.card.CardInteractionHandler.b
    public void a(CardInteractionHandler.SwipeDirection swipeDirection) {
        this.a.accept(k54.a);
    }
}
