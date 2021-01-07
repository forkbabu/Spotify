package com.spotify.libs.connect;

import android.content.Context;
import android.os.Build;
import com.spotify.libs.connect.model.DeviceType;
import com.spotify.mobile.android.util.x;
import java.util.regex.Pattern;

public class r {
    private static final Pattern b = Pattern.compile(".+_cheets|cheets_.+");
    private final DeviceType a;

    public r(Context context) {
        String str = Build.DEVICE;
        if ((str != null && b.matcher(str).matches()) || context.getPackageManager().hasSystemFeature("org.chromium.arc.device_management")) {
            this.a = DeviceType.GaiaTypes.CHROMEBOOK;
        } else if (x.g(context)) {
            this.a = DeviceType.GaiaTypes.TABLET;
        } else {
            this.a = DeviceType.GaiaTypes.SMARTPHONE;
        }
    }

    public DeviceType a() {
        return this.a;
    }
}
