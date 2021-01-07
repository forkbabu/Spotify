package com.spotify.music.homecomponents.card.artistcardfollow;

import com.spotify.encore.consumer.components.artist.api.artistcardfollow.ArtistCardFollow;
import com.spotify.music.homecomponents.card.artistcardfollow.EncoreArtistCardFollowComponent;
import kotlin.f;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class EncoreArtistCardFollowComponent$Holder$onBind$1 extends Lambda implements nmf<ArtistCardFollow.Events, f> {
    final /* synthetic */ s81 $hubsModel;
    final /* synthetic */ EncoreArtistCardFollowComponent.Holder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    EncoreArtistCardFollowComponent$Holder$onBind$1(EncoreArtistCardFollowComponent.Holder holder, s81 s81) {
        super(1);
        this.this$0 = holder;
        this.$hubsModel = s81;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public f invoke(ArtistCardFollow.Events events) {
        ArtistCardFollow.Events events2 = events;
        h.e(events2, "event");
        int ordinal = events2.ordinal();
        if (ordinal == 0) {
            EncoreArtistCardFollowComponent.Holder.E(this.this$0).a(this.$hubsModel);
        } else if (ordinal == 1) {
            EncoreArtistCardFollowComponent.Holder.E(this.this$0).b(this.$hubsModel, EncoreArtistCardFollowComponent.Holder.C(this.this$0), EncoreArtistCardFollowComponent.Holder.D(this.this$0), EncoreArtistCardFollowComponent.Holder.B(this.this$0));
        }
        return f.a;
    }
}
