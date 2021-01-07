package defpackage;

import com.spotify.libs.connect.model.DeviceState;
import com.spotify.libs.connect.model.GaiaDevice;
import io.reactivex.functions.n;

/* renamed from: oca  reason: default package */
public final /* synthetic */ class oca implements n {
    public static final /* synthetic */ oca a = new oca();

    private /* synthetic */ oca() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        return DeviceState.GaiaDeviceState.LOGGED_IN == ((GaiaDevice) obj).getState();
    }
}
