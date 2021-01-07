package com.spotify.remoteconfig;

import com.spotify.remoteconfig.AndroidFeaturePodcastEntityProperties;
import com.spotify.remoteconfig.be;

public final /* synthetic */ class u3 implements o0e {
    public static final /* synthetic */ u3 a = new u3();

    private /* synthetic */ u3() {
    }

    @Override // defpackage.o0e
    public final n0e a(p0e p0e) {
        boolean a2 = p0e.a("android-feature-podcast-entity", "enable_share_icon", false);
        boolean a3 = p0e.a("android-feature-podcast-entity", "rollout_new_episode_notifications", false);
        AndroidFeaturePodcastEntityProperties.RolloutPodcastShowpageHeader rolloutPodcastShowpageHeader = AndroidFeaturePodcastEntityProperties.RolloutPodcastShowpageHeader.LEGACY;
        be.b bVar = new be.b();
        bVar.b(false);
        bVar.c(false);
        bVar.d(rolloutPodcastShowpageHeader);
        bVar.b(a2);
        bVar.c(a3);
        bVar.d((AndroidFeaturePodcastEntityProperties.RolloutPodcastShowpageHeader) p0e.b("android-feature-podcast-entity", "rollout_podcast_showpage_header", rolloutPodcastShowpageHeader));
        return bVar.a();
    }
}
