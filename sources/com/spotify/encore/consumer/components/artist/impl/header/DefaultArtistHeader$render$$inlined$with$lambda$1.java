package com.spotify.encore.consumer.components.artist.impl.header;

import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.core.content.a;
import com.spotify.encore.consumer.components.artist.api.header.ArtistHeader;
import com.spotify.encore.consumer.components.viewbindings.headers.HeaderViewBindingsExtensions;
import com.spotify.encore.consumer.components.viewbindings.headers.R;
import com.spotify.encore.consumer.components.viewbindings.headers.databinding.FullbleedContentBinding;
import com.spotify.encore.consumer.components.viewbindings.headers.databinding.HeaderLayoutBinding;
import com.spotify.encore.consumer.elements.artwork.Artwork;
import kotlin.f;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final class DefaultArtistHeader$render$$inlined$with$lambda$1 extends Lambda implements nmf<Artwork.Events, f> {
    final /* synthetic */ ArtistHeader.Model $model$inlined;
    final /* synthetic */ FullbleedContentBinding $this_with;
    final /* synthetic */ DefaultArtistHeader this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DefaultArtistHeader$render$$inlined$with$lambda$1(FullbleedContentBinding fullbleedContentBinding, DefaultArtistHeader defaultArtistHeader, ArtistHeader.Model model) {
        super(1);
        this.$this_with = fullbleedContentBinding;
        this.this$0 = defaultArtistHeader;
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
            this.$this_with.actionRowBackground.setBackgroundColor(this.$model$inlined.getArtworkColor());
            HeaderViewBindingsExtensions.setHeaderColor(this.this$0.binding, this.$model$inlined.getArtworkColor());
        } else if (ordinal == 2) {
            HeaderLayoutBinding headerLayoutBinding = this.this$0.binding;
            MotionLayout root = this.$this_with.getRoot();
            h.d(root, "root");
            HeaderViewBindingsExtensions.setHeaderColor(headerLayoutBinding, a.b(root.getContext(), R.color.header_background_default));
        }
    }
}
