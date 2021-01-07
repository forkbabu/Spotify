package com.spotify.mobile.android.hubframework.defaults.components.common;

import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;
import com.spotify.mobile.android.util.ui.BadgesFactory;

public final class a {
    public static BadgesFactory.BadgeSize a(HubsGlueImageDelegate.ImageConfig.ImageSize imageSize) {
        int ordinal = imageSize.ordinal();
        if (ordinal == 0) {
            return BadgesFactory.BadgeSize.SMALL;
        }
        if (ordinal != 1) {
            return BadgesFactory.BadgeSize.LARGE;
        }
        return BadgesFactory.BadgeSize.MEDIUM;
    }
}
