package com.spotify.libs.connect.picker.view;

import com.spotify.libs.connect.ConnectManager;
import com.spotify.libs.connect.model.GaiaDevice;
import com.spotify.libs.connect.model.Tech;
import java.util.EnumSet;

public abstract class d {
    public static final d a = new b(ConnectManager.ConnectState.UNKNOWN, EnumSet.noneOf(Tech.class), null, null);

    public static d d(ConnectManager.ConnectState connectState, EnumSet<Tech> enumSet, GaiaDevice gaiaDevice, GaiaDevice gaiaDevice2) {
        return new b(connectState, enumSet, gaiaDevice, gaiaDevice2);
    }

    public abstract GaiaDevice a();

    public abstract ConnectManager.ConnectState b();

    public abstract GaiaDevice c();

    public abstract EnumSet<Tech> e();
}
