package com.spotify.music.ondemandsharing.shufflebutton;

import com.spotify.music.ondemandsharing.shufflebutton.OnDemandSharingShufflePlayButtonHubsCommandHandler;
import com.spotify.player.model.PlayerState;
import io.reactivex.functions.g;

public final /* synthetic */ class a implements g {
    public final /* synthetic */ OnDemandSharingShufflePlayButtonHubsCommandHandler.AnonymousClass1 a;

    public /* synthetic */ a(OnDemandSharingShufflePlayButtonHubsCommandHandler.AnonymousClass1 r1) {
        this.a = r1;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        OnDemandSharingShufflePlayButtonHubsCommandHandler.c(OnDemandSharingShufflePlayButtonHubsCommandHandler.this, (PlayerState) obj);
    }
}
