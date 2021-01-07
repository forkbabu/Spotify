package com.spotify.music.features.album.encore;

import com.spotify.encore.consumer.components.album.api.trackrow.TrackRowAlbum;
import com.spotify.music.features.album.encore.TrackRowAlbumComponentBinder;
import kotlin.f;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class TrackRowAlbumComponentBinder$Holder$onBind$1 extends Lambda implements nmf<TrackRowAlbum.Events, f> {
    final /* synthetic */ s81 $data;
    final /* synthetic */ Integer $position;
    final /* synthetic */ String $trackUri;
    final /* synthetic */ TrackRowAlbumComponentBinder.Holder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TrackRowAlbumComponentBinder$Holder$onBind$1(TrackRowAlbumComponentBinder.Holder holder, s81 s81, String str, Integer num) {
        super(1);
        this.this$0 = holder;
        this.$data = s81;
        this.$trackUri = str;
        this.$position = num;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public f invoke(TrackRowAlbum.Events events) {
        TrackRowAlbum.Events events2 = events;
        h.e(events2, "event");
        if (h.a(events2, TrackRowAlbum.Events.RowClicked.INSTANCE)) {
            TrackRowAlbumComponentBinder.Holder.C(this.this$0).c(this.$data);
            TrackRowAlbumComponentBinder.Holder.B(this.this$0).b(this.$trackUri, this.$position);
        } else if (h.a(events2, TrackRowAlbum.Events.RowLongClicked.INSTANCE)) {
            TrackRowAlbumComponentBinder.Holder.C(this.this$0).b();
        } else if (h.a(events2, TrackRowAlbum.Events.ContextMenuClicked.INSTANCE)) {
            TrackRowAlbumComponentBinder.Holder.C(this.this$0).a(this.$data);
            TrackRowAlbumComponentBinder.Holder.B(this.this$0).a(this.$trackUri, this.$position);
        }
        return f.a;
    }
}
