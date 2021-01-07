package com.spotify.mobile.android.ui.activity.upsell.premiumdestination;

import com.spotify.mobile.android.util.LinkType;

public class s implements blb {
    private final r a;

    public s(r rVar) {
        this.a = rVar;
    }

    @Override // defpackage.blb
    public void b(glb glb) {
        xkb xkb = (xkb) glb;
        xkb.i(LinkType.PREMIUM_IN_APP_DESTINATION, "Premium Destination", this.a);
        xkb.i(LinkType.PREMIUM_DESTINATION_DRILLDOWN, "Premium Destination with page id", this.a);
    }
}
