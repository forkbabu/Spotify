package com.spotify.music.features.pinpairing;

import android.webkit.CookieManager;
import com.spotify.mobile.android.sso.bakery.e;
import io.reactivex.y;

public final class g {
    public static void a(PinPairingFragment pinPairingFragment, CookieManager cookieManager) {
        pinPairingFragment.y0 = cookieManager;
    }

    public static void b(PinPairingFragment pinPairingFragment, y yVar) {
        pinPairingFragment.x0 = yVar;
    }

    public static void c(PinPairingFragment pinPairingFragment, i iVar) {
        pinPairingFragment.w0 = iVar;
    }

    public static i d(e eVar) {
        return new i(eVar);
    }
}
