package defpackage;

import com.google.common.collect.ImmutableSet;
import com.spotify.libs.connect.model.DeviceState;
import com.spotify.libs.connect.model.DeviceType;
import com.spotify.libs.connect.model.a;
import com.spotify.libs.connect.r;

/* renamed from: zp4  reason: default package */
public class zp4 {
    private static final ImmutableSet<DeviceState> b = ImmutableSet.of(DeviceState.GaiaDeviceState.CONNECTING, DeviceState.GaiaDeviceState.LOGGED_IN);
    private static final ImmutableSet<DeviceType> c = ImmutableSet.of(DeviceType.GaiaTypes.COMPUTER, DeviceType.GaiaTypes.SMARTPHONE, DeviceType.GaiaTypes.TABLET);
    private final r a;

    public zp4(r rVar) {
        this.a = rVar;
    }

    public DeviceType a() {
        return this.a.a();
    }

    /* access modifiers changed from: package-private */
    public boolean b(a aVar) {
        DeviceType type = aVar.getType();
        return type == DeviceType.GaiaTypes.CAST_VIDEO || type == DeviceType.GaiaTypes.CAST_AUDIO;
    }

    public boolean c(a aVar) {
        if (!aVar.isDisabled()) {
            if ((b.contains(aVar.getState()) && (c.contains(aVar.getType()) ^ true) && aVar.supportsLogout()) || aVar.hasIncarnations()) {
                return true;
            }
            if (aVar.getCapabilities() != null && !aVar.getCapabilities().isEmpty()) {
                return true;
            }
        }
        return false;
    }
}
