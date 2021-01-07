package defpackage;

import com.spotify.libs.connect.model.DeviceState;
import com.spotify.libs.connect.model.GaiaDevice;
import io.reactivex.functions.n;

/* renamed from: waa  reason: default package */
public final /* synthetic */ class waa implements n {
    public static final /* synthetic */ waa a = new waa();

    private /* synthetic */ waa() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        GaiaDevice gaiaDevice = (GaiaDevice) obj;
        int i = hba.h;
        return gaiaDevice.isBeingActivated() || gaiaDevice.getState() == DeviceState.GaiaDeviceState.CONNECTING;
    }
}
