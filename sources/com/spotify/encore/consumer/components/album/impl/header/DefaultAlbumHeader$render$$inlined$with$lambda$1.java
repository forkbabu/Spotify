package com.spotify.encore.consumer.components.album.impl.header;

import com.spotify.encore.consumer.components.album.api.header.AlbumHeader;
import com.spotify.encore.consumer.components.viewbindings.headers.HeaderViewBindingsExtensions;
import com.spotify.encore.consumer.components.viewbindings.headers.databinding.HeaderLayoutBinding;
import com.spotify.encore.consumer.elements.artwork.Artwork;
import com.spotify.encore.consumer.elements.artwork.ArtworkView;
import kotlin.f;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final class DefaultAlbumHeader$render$$inlined$with$lambda$1 extends Lambda implements nmf<Artwork.Events, f> {
    final /* synthetic */ AlbumHeader.Model $model$inlined;
    final /* synthetic */ DefaultAlbumHeader this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DefaultAlbumHeader$render$$inlined$with$lambda$1(DefaultAlbumHeader defaultAlbumHeader, AlbumHeader.Model model) {
        super(1);
        this.this$0 = defaultAlbumHeader;
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
        if (ordinal == 1) {
            HeaderLayoutBinding headerLayoutBinding = this.this$0.binding;
            ArtworkView artworkView = this.this$0.content.artwork;
            h.d(artworkView, "content.artwork");
            HeaderViewBindingsExtensions.setHeaderColor(headerLayoutBinding, artworkView.getExtractedColor());
        } else if (ordinal == 2) {
            HeaderViewBindingsExtensions.setHeaderColor(this.this$0.binding, this.this$0.defaultHeaderColor);
        }
    }
}
