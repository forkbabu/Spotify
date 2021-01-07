package com.spotify.music.homecomponents.card.search;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.api.searchintentcard.SearchIntentCard;

public final class f implements fjf<EncoreSearchIntentCardComponent> {
    private final wlf<ComponentFactory<Component<SearchIntentCard.Model, SearchIntentCard.Events>, SearchIntentCard.Configuration>> a;
    private final wlf<c> b;

    public f(wlf<ComponentFactory<Component<SearchIntentCard.Model, SearchIntentCard.Events>, SearchIntentCard.Configuration>> wlf, wlf<c> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new EncoreSearchIntentCardComponent(this.a.get(), this.b.get());
    }
}
