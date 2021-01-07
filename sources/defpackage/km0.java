package defpackage;

import android.content.Context;
import android.content.Intent;
import com.spotify.libs.connect.model.GaiaDevice;
import com.spotify.music.features.connect.dialogs.SwitchDeviceActivity;

/* renamed from: km0  reason: default package */
public class km0 {
    private final Context a;

    public km0(Context context) {
        this.a = context;
    }

    public void a(GaiaDevice gaiaDevice) {
        Intent intent = new Intent(this.a, SwitchDeviceActivity.class);
        intent.putExtra("active_device", gaiaDevice);
        this.a.startActivity(intent);
    }
}
