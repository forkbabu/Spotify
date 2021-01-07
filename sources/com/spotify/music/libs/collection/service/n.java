package com.spotify.music.libs.collection.service;

import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.libs.collection.service.CollectionService;
import io.reactivex.functions.a;

public final /* synthetic */ class n implements a {
    public final /* synthetic */ LinkType a;
    public final /* synthetic */ CollectionService.Items b;

    public /* synthetic */ n(LinkType linkType, CollectionService.Items items) {
        this.a = linkType;
        this.b = items;
    }

    @Override // io.reactivex.functions.a
    public final void run() {
        LinkType linkType = this.a;
        CollectionService.Items items = this.b;
        int i = CollectionService.p;
        if (linkType != LinkType.TRACK) {
            StringBuilder V0 = je.V0("Messaging for unban is only supported for tracks. sourceUri: ");
            V0.append(items.source);
            V0.append(", contextSourceUri: ");
            V0.append(items.contextSource);
            throw new Assertion.RecoverableAssertionError(V0.toString());
        }
    }
}
