package defpackage;

import android.content.Context;
import com.spotify.libs.connect.model.DeviceState;
import com.spotify.libs.connect.model.DeviceType;
import com.spotify.libs.connect.model.a;
import com.spotify.music.C0707R;

/* renamed from: dq4  reason: default package */
public class dq4 {
    private final Context a;
    private final zp4 b;

    public dq4(Context context, zp4 zp4) {
        this.a = context;
        this.b = zp4;
    }

    public String a(boolean z) {
        return this.a.getString(z ? C0707R.string.connect_device_playing_on_video : C0707R.string.connect_device_playing_on_audio);
    }

    public String b(a aVar) {
        int i;
        DeviceState state = aVar.getState();
        if (state == DeviceState.GaiaDeviceState.CONNECTING) {
            return this.a.getString(C0707R.string.connect_device_connecting);
        }
        if (state == DeviceState.GaiaDeviceState.UNAVAILABLE) {
            return this.a.getString(C0707R.string.connect_device_unavailable_for_playback);
        }
        if (state == DeviceState.GaiaDeviceState.PREMIUM_REQUIRED) {
            return this.a.getString(C0707R.string.connect_device_premium_only);
        }
        if (state == DeviceState.GaiaDeviceState.INCOMPATIBLE) {
            return this.a.getString(C0707R.string.connect_device_incompatible);
        }
        if (state == DeviceState.GaiaDeviceState.NOT_INSTALLED) {
            return this.a.getString(C0707R.string.connect_device_not_installed);
        }
        if (state == DeviceState.GaiaDeviceState.UNSUPPORTED_URI || state == DeviceState.GaiaDeviceState.NOT_AUTHORIZED) {
            return this.a.getString(C0707R.string.connect_device_unsupported_uri);
        }
        if (aVar.isActive()) {
            return aVar.getName();
        }
        if (this.b.b(aVar)) {
            i = C0707R.string.connect_device_tech_cast;
        } else {
            this.b.getClass();
            i = aVar.getType() == DeviceType.BluetoothTypes.BLUETOOTH ? C0707R.string.connect_device_tech_bluetooth : C0707R.string.connect_device_tech_connect;
        }
        return this.a.getString(i);
    }

    public String c() {
        DeviceType a2 = this.b.a();
        if (DeviceType.GaiaTypes.CHROMEBOOK == a2) {
            return this.a.getString(C0707R.string.connect_chromebook_is_self);
        }
        if (DeviceType.GaiaTypes.TABLET == a2) {
            return this.a.getString(C0707R.string.connect_tablet_is_self);
        }
        return this.a.getString(C0707R.string.connect_phone_is_self);
    }
}
