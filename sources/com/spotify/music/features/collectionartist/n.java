package com.spotify.music.features.collectionartist;

import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PreparePlayOptions;
import io.reactivex.functions.l;

public final /* synthetic */ class n implements l {
    public final /* synthetic */ CollectionArtistFragment a;
    public final /* synthetic */ PreparePlayOptions b;
    public final /* synthetic */ LoggingParams c;

    public /* synthetic */ n(CollectionArtistFragment collectionArtistFragment, PreparePlayOptions preparePlayOptions, LoggingParams loggingParams) {
        this.a = collectionArtistFragment;
        this.b = preparePlayOptions;
        this.c = loggingParams;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.q5(this.b, this.c, (Boolean) obj);
    }
}
