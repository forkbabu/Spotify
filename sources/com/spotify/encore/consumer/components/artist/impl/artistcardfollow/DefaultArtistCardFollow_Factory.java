package com.spotify.encore.consumer.components.artist.impl.artistcardfollow;

import android.content.Context;
import com.squareup.picasso.Picasso;

public final class DefaultArtistCardFollow_Factory implements fjf<DefaultArtistCardFollow> {
    private final wlf<Context> contextProvider;
    private final wlf<Picasso> picassoProvider;

    public DefaultArtistCardFollow_Factory(wlf<Context> wlf, wlf<Picasso> wlf2) {
        this.contextProvider = wlf;
        this.picassoProvider = wlf2;
    }

    public static DefaultArtistCardFollow_Factory create(wlf<Context> wlf, wlf<Picasso> wlf2) {
        return new DefaultArtistCardFollow_Factory(wlf, wlf2);
    }

    public static DefaultArtistCardFollow newInstance(Context context, Picasso picasso) {
        return new DefaultArtistCardFollow(context, picasso);
    }

    @Override // defpackage.wlf
    public DefaultArtistCardFollow get() {
        return newInstance(this.contextProvider.get(), this.picassoProvider.get());
    }
}
