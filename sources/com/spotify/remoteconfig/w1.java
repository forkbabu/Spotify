package com.spotify.remoteconfig;

import com.spotify.remoteconfig.AndroidLibsPodcastInteractivityProperties;
import com.spotify.remoteconfig.kg;

public final /* synthetic */ class w1 implements o0e {
    public static final /* synthetic */ w1 a = new w1();

    private /* synthetic */ w1() {
    }

    @Override // defpackage.o0e
    public final n0e a(p0e p0e) {
        AndroidLibsPodcastInteractivityProperties.PollsFeatureInEpisodePage pollsFeatureInEpisodePage = AndroidLibsPodcastInteractivityProperties.PollsFeatureInEpisodePage.NO_POLLS;
        AndroidLibsPodcastInteractivityProperties.PollsFeatureInNpv pollsFeatureInNpv = AndroidLibsPodcastInteractivityProperties.PollsFeatureInNpv.NO_POLLS;
        kg.b bVar = new kg.b();
        bVar.b(pollsFeatureInEpisodePage);
        bVar.c(pollsFeatureInNpv);
        bVar.b((AndroidLibsPodcastInteractivityProperties.PollsFeatureInEpisodePage) p0e.b("android-libs-podcast-interactivity", "polls_feature_in_episode_page", pollsFeatureInEpisodePage));
        bVar.c((AndroidLibsPodcastInteractivityProperties.PollsFeatureInNpv) p0e.b("android-libs-podcast-interactivity", "polls_feature_in_npv", pollsFeatureInNpv));
        return bVar.a();
    }
}
