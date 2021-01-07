package com.spotify.mobile.android.ui.activity.upsell.premiumdestination;

import android.content.Intent;
import android.os.Bundle;
import com.google.common.base.Optional;
import com.spotify.android.flags.c;
import com.spotify.android.flags.d;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.features.premiumdestination.PremiumPageFragment;
import com.spotify.music.navigation.k;

public class r implements k {
    private final mi7 a;

    public r(mi7 mi7) {
        this.a = mi7;
    }

    @Override // com.spotify.music.navigation.k
    public s a(Intent intent, l0 l0Var, String str, c cVar, SessionState sessionState) {
        if (l0Var.q() == LinkType.PREMIUM_DESTINATION_DRILLDOWN) {
            return b(Optional.of(l0Var.i()), cVar);
        }
        return b(Optional.absent(), cVar);
    }

    public s b(Optional<String> optional, c cVar) {
        if (this.a.a()) {
            PremiumPageFragment premiumPageFragment = new PremiumPageFragment();
            Bundle bundle = new Bundle();
            if (optional.isPresent()) {
                bundle.putString("page_id", optional.get());
            }
            premiumPageFragment.r4(bundle);
            d.a(premiumPageFragment, cVar);
            return premiumPageFragment;
        }
        PremiumDestinationFragment premiumDestinationFragment = new PremiumDestinationFragment();
        d.a(premiumDestinationFragment, cVar);
        return premiumDestinationFragment;
    }
}
