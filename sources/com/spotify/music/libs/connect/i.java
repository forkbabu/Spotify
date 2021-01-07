package com.spotify.music.libs.connect;

import com.spotify.libs.connect.ConnectManager;
import com.spotify.libs.connect.model.GaiaDevice;
import com.spotify.libs.connect.model.Tech;
import com.spotify.libs.connect.picker.view.e;
import com.spotify.music.sociallistening.models.b;
import java.util.EnumSet;

public interface i extends e.a {
    void b(boolean z);

    void c(ConnectManager.ConnectState connectState, GaiaDevice gaiaDevice, GaiaDevice gaiaDevice2, EnumSet<Tech> enumSet, b bVar);
}
