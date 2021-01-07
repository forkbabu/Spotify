package com.spotify.music.ondemandsharing.shufflebutton;

import com.google.common.base.Predicate;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import java.util.Map;

public final /* synthetic */ class b implements Predicate {
    public static final /* synthetic */ b a = new b();

    private /* synthetic */ b() {
    }

    @Override // com.google.common.base.Predicate
    public final boolean apply(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        int i = OnDemandSharingShufflePlayButtonHubsCommandHandler.o;
        return entry != null && !PlayerTrack.Metadata.MFT_UNPLAYABLE_POLICY.equals(entry.getKey());
    }
}
