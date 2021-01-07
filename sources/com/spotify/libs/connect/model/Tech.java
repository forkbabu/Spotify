package com.spotify.libs.connect.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.music.features.connect.cast.discovery.DiscoveredDevice;
import java.util.Locale;

public enum Tech implements JacksonModel {
    CONNECT,
    CAST_JS,
    CAST;

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean isCast(com.spotify.libs.connect.model.GaiaDevice r4) {
        /*
            com.spotify.libs.connect.model.DeviceType r0 = r4.getType()
            com.spotify.libs.connect.model.DeviceType$GaiaTypes r1 = com.spotify.libs.connect.model.DeviceType.GaiaTypes.CAST_VIDEO
            if (r0 == r1) goto L_0x0013
            com.spotify.libs.connect.model.DeviceType r0 = r4.getType()
            com.spotify.libs.connect.model.DeviceType$GaiaTypes r1 = com.spotify.libs.connect.model.DeviceType.GaiaTypes.CAST_AUDIO
            if (r0 != r1) goto L_0x0011
            goto L_0x0013
        L_0x0011:
            r0 = 0
            goto L_0x0014
        L_0x0013:
            r0 = 1
        L_0x0014:
            if (r0 != 0) goto L_0x003f
            java.util.List r4 = r4.getIncarnations()
            java.util.Iterator r4 = r4.iterator()
        L_0x001e:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x003f
            java.lang.Object r1 = r4.next()
            com.spotify.libs.connect.model.GaiaDeviceIncarnation r1 = (com.spotify.libs.connect.model.GaiaDeviceIncarnation) r1
            com.spotify.libs.connect.model.Tech r2 = com.spotify.libs.connect.model.Tech.CAST
            com.spotify.libs.connect.model.Tech r3 = r1.getTech()
            if (r2 == r3) goto L_0x003a
            com.spotify.libs.connect.model.Tech r2 = com.spotify.libs.connect.model.Tech.CAST_JS
            com.spotify.libs.connect.model.Tech r3 = r1.getTech()
            if (r2 != r3) goto L_0x001e
        L_0x003a:
            boolean r4 = r1.isPreferred()
            return r4
        L_0x003f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.libs.connect.model.Tech.isCast(com.spotify.libs.connect.model.GaiaDevice):boolean");
    }

    public static Tech of(GaiaDevice gaiaDevice) {
        if (gaiaDevice == null) {
            return CONNECT;
        }
        return isCast(gaiaDevice) ? CAST : CONNECT;
    }

    @JsonCreator
    public static Tech valueOfSafe(@JsonProperty("name") String str) {
        String lowerCase = str.toLowerCase(Locale.ENGLISH);
        lowerCase.hashCode();
        char c = 65535;
        switch (lowerCase.hashCode()) {
            case 3046207:
                if (lowerCase.equals("cast")) {
                    c = 0;
                    break;
                }
                break;
            case 555286167:
                if (lowerCase.equals(DiscoveredDevice.CLASS_JS_CAST)) {
                    c = 1;
                    break;
                }
                break;
            case 951351530:
                if (lowerCase.equals("connect")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return CAST;
            case 1:
                return CAST_JS;
            case 2:
                return CONNECT;
            default:
                Logger.b("Unable to map tech '%s' to a valid enum, fall back to connect", str);
                return CONNECT;
        }
    }

    public static boolean isCast(Tech tech) {
        return tech == CAST || tech == CAST_JS;
    }
}
