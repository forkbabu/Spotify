package com.spotify.music.features.connect.plugins;

import android.content.Context;
import android.content.Intent;
import com.spotify.base.java.logging.Logger;
import com.spotify.libs.connect.ConnectManager;
import com.spotify.libs.connect.model.GaiaDevice;
import com.spotify.libs.connect.model.GaiaState;
import com.spotify.libs.connect.model.GaiaTransferError;

public class c {
    private final Context a;
    private final ConnectManager b;
    private final String c;

    public c(Context context, ConnectManager connectManager, String str) {
        this.a = context;
        this.b = connectManager;
        this.c = str;
    }

    /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x006f: APUT  (r4v1 java.lang.Object[]), (0 ??[int, short, byte, char]), (r9v2 java.lang.String) */
    public void a(GaiaState gaiaState) {
        GaiaTransferError transferError = gaiaState.getTransferError();
        if (!(transferError == null || transferError.getErrorCode() == GaiaTransferError.DeviceTransferError.SUCCESS)) {
            GaiaDevice i = this.b.i(transferError.getDeviceId());
            Logger.b("Got transfer error from core: %s", transferError.toString());
            if (i != null) {
                Intent intent = new Intent("com.spotify.mobile.android.service.broadcast.connect.CONNECT_TRANSFER_ERROR");
                intent.putExtra("error_code", transferError.getErrorCode().g());
                intent.putExtra("connect_device", i);
                Context context = this.a;
                context.sendBroadcast(intent, this.c + ".permission.INTERNAL_BROADCAST");
            }
        }
        String onboardingDevice = gaiaState.getOnboardingDevice();
        if (onboardingDevice != null) {
            GaiaDevice i2 = this.b.i(onboardingDevice);
            Object[] objArr = new Object[1];
            if (i2 != null) {
                onboardingDevice = i2.toString();
            }
            objArr[0] = onboardingDevice;
            Logger.b("Got onboarding request from core: %s", objArr);
            if (i2 != null) {
                Intent intent2 = new Intent("com.spotify.mobile.android.service.broadcast.connect.CONNECT_ONBOARDING");
                intent2.putExtra("connect_device", i2);
                Context context2 = this.a;
                context2.sendBroadcast(intent2, this.c + ".permission.INTERNAL_BROADCAST");
            }
        }
    }
}
