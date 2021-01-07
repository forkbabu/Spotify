package com.spotify.encore.consumer.components.album.impl.header;

import androidx.core.content.a;
import com.spotify.encore.consumer.components.album.api.header.AlbumHeader;
import com.spotify.encore.consumer.components.viewbindings.headers.HeaderMotionBindingsExtensions;
import com.spotify.encore.consumer.components.viewbindings.headers.R;
import com.spotify.encore.consumer.elements.artwork.Artwork;
import kotlin.f;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final class MotionAlbumHeader$render$$inlined$with$lambda$1 extends Lambda implements nmf<Artwork.Events, f> {
    final /* synthetic */ AlbumHeader.Model $model$inlined;
    final /* synthetic */ MotionAlbumHeader this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    MotionAlbumHeader$render$$inlined$with$lambda$1(MotionAlbumHeader motionAlbumHeader, AlbumHeader.Model model) {
        super(1);
        this.this$0 = motionAlbumHeader;
        this.$model$inlined = model;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public /* bridge */ /* synthetic */ f invoke(Artwork.Events events) {
        invoke(events);
        return f.a;
    }

    public final void invoke(Artwork.Events events) {
        h.e(events, "it");
        int ordinal = events.ordinal();
        if (ordinal == 0) {
            HeaderMotionBindingsExtensions.setHeaderColor(this.this$0.binding, this.$model$inlined.getArtworkColor());
        } else if (ordinal == 2) {
            HeaderMotionBindingsExtensions.setHeaderColor(this.this$0.binding, a.b(this.this$0.getView().getContext(), R.color.header_background_default));
        }
    }
}
