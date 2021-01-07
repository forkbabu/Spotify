package com.spotify.libs.connect;

import com.google.common.base.Optional;
import com.spotify.libs.connect.ConnectManager;
import com.spotify.libs.connect.model.GaiaDevice;
import io.reactivex.g;
import io.reactivex.s;
import java.util.List;

public interface j {
    boolean e();

    s<ConnectManager.ConnectManagerState> f();

    g<Boolean> g();

    s<ConnectManager.ConnectState> h(String str);

    GaiaDevice i(String str);

    s<Optional<GaiaDevice>> j(String str);

    void k(ConnectManager.b bVar);

    void l(ConnectManager.b bVar);

    s<List<GaiaDevice>> m(String str);

    @Deprecated
    GaiaDevice o();

    s<GaiaDevice> p(String str);

    boolean q();
}
