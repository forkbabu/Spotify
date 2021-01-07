package com.spotify.music;

import com.google.common.collect.ImmutableSet;
import com.spotify.feature.speakerdeeplink.SpeakerDeepLinkPlugin;
import java.util.Set;

/* access modifiers changed from: package-private */
public class l0 {
    private final Set<ygb> a;

    l0(SpeakerDeepLinkPlugin speakerDeepLinkPlugin, ir8 ir8, b90 b90) {
        this.a = ImmutableSet.of((b90) speakerDeepLinkPlugin, (b90) ir8, b90);
    }

    /* access modifiers changed from: package-private */
    public Set<ygb> a() {
        return this.a;
    }
}
