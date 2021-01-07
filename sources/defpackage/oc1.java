package defpackage;

import com.spotify.libs.connect.model.DeviceType;
import com.spotify.libs.connect.model.GaiaDevice;

/* renamed from: oc1  reason: default package */
public class oc1 {
    public boolean a(GaiaDevice gaiaDevice) {
        return gaiaDevice != null && gaiaDevice.getType() == DeviceType.GaiaTypes.AUTOMOBILE;
    }
}
