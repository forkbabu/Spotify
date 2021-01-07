package com.spotify.libs.connect;

import com.google.common.base.Optional;
import com.spotify.libs.connect.ConnectManager;
import com.spotify.libs.connect.model.GaiaDevice;
import com.spotify.libs.connect.model.Tech;
import com.spotify.libs.connect.picker.view.d;
import io.reactivex.functions.i;
import java.util.EnumSet;
import java.util.List;

public final /* synthetic */ class a implements i {
    public static final /* synthetic */ a a = new a();

    private /* synthetic */ a() {
    }

    @Override // io.reactivex.functions.i
    public final Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        Optional optional = (Optional) obj;
        Optional optional2 = (Optional) obj2;
        List<GaiaDevice> list = (List) obj3;
        ConnectManager.ConnectState connectState = (ConnectManager.ConnectState) obj4;
        int i = h.b;
        if (ConnectManager.ConnectState.CONNECTING == connectState && !optional2.isPresent()) {
            connectState = ConnectManager.ConnectState.DETECTED;
        }
        EnumSet noneOf = EnumSet.noneOf(Tech.class);
        for (GaiaDevice gaiaDevice : list) {
            if (!gaiaDevice.isSelf()) {
                noneOf.add(Tech.of(gaiaDevice));
            }
        }
        return d.d(connectState, noneOf, (GaiaDevice) optional.orNull(), (GaiaDevice) optional2.orNull());
    }
}
