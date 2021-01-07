package com.spotify.encore.mobile.utils.picassocolorextractor;

import com.squareup.picasso.g;
import defpackage.kvd;
import kotlin.jvm.internal.h;

final class SpotifyPicassoTarget$extractColor$1 implements kvd.d {
    final /* synthetic */ SpotifyPicassoTarget this$0;

    SpotifyPicassoTarget$extractColor$1(SpotifyPicassoTarget spotifyPicassoTarget) {
        this.this$0 = spotifyPicassoTarget;
    }

    @Override // defpackage.kvd.d
    public final void onGenerated(kvd kvd) {
        if (SpotifyPicassoTarget.access$getCallback$p(this.this$0) instanceof ColorCallback) {
            g access$getCallback$p = SpotifyPicassoTarget.access$getCallback$p(this.this$0);
            if (access$getCallback$p != null) {
                h.d(kvd, "palette");
                ((ColorCallback) access$getCallback$p).onPaletteGenerated(kvd);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.spotify.encore.mobile.utils.picassocolorextractor.ColorCallback");
        }
    }
}
