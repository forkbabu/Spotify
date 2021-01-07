package com.spotify.encore.consumer.components.yourepisodes.impl.yourepisodesheader;

import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.yourepisodes.api.yourepisodesheader.YourEpisodesHeader;
import com.spotify.player.model.ContextTrack;
import kotlin.jvm.internal.h;

public final class YourEpisodesHeaderFactory implements ComponentFactory<YourEpisodesHeader, YourEpisodesHeader.Configuration> {
    private final wlf<DefaultYourEpisodesHeader> provider;

    public YourEpisodesHeaderFactory(wlf<DefaultYourEpisodesHeader> wlf) {
        h.e(wlf, ContextTrack.Metadata.KEY_PROVIDER);
        this.provider = wlf;
    }

    @Override // com.spotify.encore.ComponentFactory
    public YourEpisodesHeader make() {
        return (YourEpisodesHeader) ComponentFactory.DefaultImpls.make(this);
    }

    public YourEpisodesHeader make(YourEpisodesHeader.Configuration configuration) {
        if (configuration instanceof YourEpisodesHeader.Configuration.DefaultYourEpisodesHeaderConfiguration) {
            DefaultYourEpisodesHeader defaultYourEpisodesHeader = this.provider.get();
            h.d(defaultYourEpisodesHeader, "provider.get()");
            return defaultYourEpisodesHeader;
        }
        DefaultYourEpisodesHeader defaultYourEpisodesHeader2 = this.provider.get();
        h.d(defaultYourEpisodesHeader2, "provider.get()");
        return defaultYourEpisodesHeader2;
    }
}
