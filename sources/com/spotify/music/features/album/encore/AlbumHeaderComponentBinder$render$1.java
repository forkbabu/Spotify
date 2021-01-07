package com.spotify.music.features.album.encore;

import com.spotify.encore.consumer.components.album.api.header.AlbumHeader;
import kotlin.f;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class AlbumHeaderComponentBinder$render$1 extends Lambda implements nmf<AlbumHeader.Events, f> {
    final /* synthetic */ s81 $data;
    final /* synthetic */ AlbumHeader.Model $model;
    final /* synthetic */ AlbumHeaderComponentBinder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AlbumHeaderComponentBinder$render$1(AlbumHeaderComponentBinder albumHeaderComponentBinder, s81 s81, AlbumHeader.Model model) {
        super(1);
        this.this$0 = albumHeaderComponentBinder;
        this.$data = s81;
        this.$model = model;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public f invoke(AlbumHeader.Events events) {
        AlbumHeader.Events events2 = events;
        h.e(events2, "event");
        i f = AlbumHeaderComponentBinder.f(this.this$0);
        int ordinal = events2.ordinal();
        if (ordinal == 0) {
            f.f(this.$data);
        } else if (ordinal == 1) {
            f.c(this.$model.getDownloadButtonModel());
        } else if (ordinal == 2) {
            f.e(this.$model.isLiked());
        } else if (ordinal == 3) {
            f.b();
        } else if (ordinal == 4) {
            f.a(this.$data);
        } else if (ordinal == 5) {
            f.d();
        }
        return f.a;
    }
}
