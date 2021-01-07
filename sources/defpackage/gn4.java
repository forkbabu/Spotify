package defpackage;

import android.net.Uri;
import com.spotify.base.java.logging.Logger;
import com.spotify.libs.connect.model.GaiaDeviceCapability;
import com.spotify.libs.connect.model.GaiaDeviceRedirectUrisAndroid;
import com.spotify.localization.SpotifyLocale;
import com.spotify.mobile.android.util.l0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: gn4  reason: default package */
public final class gn4 {
    public static ArrayList<vm4> a(List<GaiaDeviceCapability> list, String str) {
        ArrayList<vm4> arrayList = new ArrayList<>();
        if (list != null) {
            for (GaiaDeviceCapability gaiaDeviceCapability : list) {
                try {
                    arrayList.add(b(gaiaDeviceCapability, str));
                } catch (NullPointerException unused) {
                    Logger.n("Capability not added", new Object[0]);
                }
            }
        }
        return arrayList;
    }

    private static vm4 b(GaiaDeviceCapability gaiaDeviceCapability, String str) {
        String id = gaiaDeviceCapability.getId();
        Map<String, String> localizedTitles = gaiaDeviceCapability.getLocalizedTitles();
        String defaultTitle = gaiaDeviceCapability.getDefaultTitle();
        String str2 = localizedTitles.get(SpotifyLocale.c());
        if (str2 == null) {
            Iterator<Map.Entry<String, String>> it = localizedTitles.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<String, String> next = it.next();
                if (SpotifyLocale.e().equalsIgnoreCase(next.getKey().substring(0, 2))) {
                    defaultTitle = next.getValue();
                    break;
                }
            }
        } else {
            defaultTitle = str2;
        }
        String iconUrl = gaiaDeviceCapability.getIconUrl();
        gaiaDeviceCapability.getGaiaDeviceRedirectUris().getClass();
        gaiaDeviceCapability.getGaiaDeviceRedirectUris().getAndroidUris().getClass();
        GaiaDeviceRedirectUrisAndroid androidUris = gaiaDeviceCapability.getGaiaDeviceRedirectUris().getAndroidUris();
        Uri build = Uri.parse(androidUris.getUri()).buildUpon().appendQueryParameter(androidUris.getRedirectBackAppParam(), l0.z("spotify:connect-device-picker").B()).appendQueryParameter(androidUris.getDeviceNameParam(), str).build();
        gaiaDeviceCapability.getGaiaDeviceRedirectUris().getClass();
        gaiaDeviceCapability.getGaiaDeviceRedirectUris().getAndroidUris().getClass();
        gaiaDeviceCapability.getGaiaDeviceRedirectUris().getAndroidUris().getFallbackUrl().getClass();
        return new vm4(id, defaultTitle, iconUrl, build, Uri.parse(gaiaDeviceCapability.getGaiaDeviceRedirectUris().getAndroidUris().getFallbackUrl()));
    }
}
