package com.spotify.encore.consumer.components.artist.impl.artistcardfollow;

import android.view.View;
import com.spotify.encore.consumer.components.artist.api.artistcardfollow.ArtistCardFollow;

final class DefaultArtistCardFollow$onEvent$2 implements View.OnClickListener {
    final /* synthetic */ nmf $event;
    final /* synthetic */ DefaultArtistCardFollow this$0;

    DefaultArtistCardFollow$onEvent$2(DefaultArtistCardFollow defaultArtistCardFollow, nmf nmf) {
        this.this$0 = defaultArtistCardFollow;
        this.$event = nmf;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.this$0.currentStatus != ArtistCardFollow.FollowingStatus.Error) {
            this.$event.invoke(ArtistCardFollow.Events.ButtonClicked);
        }
    }
}
