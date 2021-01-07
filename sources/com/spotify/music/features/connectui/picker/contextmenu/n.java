package com.spotify.music.features.connectui.picker.contextmenu;

import android.net.Uri;
import com.spotify.libs.connect.model.GaiaDevice;
import com.spotify.libs.connect.model.GaiaDeviceCapability;
import com.spotify.libs.connect.model.GaiaDeviceIncarnation;
import com.spotify.libs.connect.model.GaiaDeviceRedirectUrisAndroid;
import com.spotify.libs.connect.model.Tech;
import com.spotify.localization.SpotifyLocale;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.C0707R;
import com.spotify.music.features.connectui.picker.contextmenu.entries.DeviceContextMenuEntry;
import com.spotify.music.features.connectui.picker.contextmenu.entries.a;
import com.spotify.music.features.connectui.picker.contextmenu.entries.b;
import com.spotify.music.features.connectui.picker.contextmenu.entries.c;
import com.spotify.music.features.connectui.picker.legacy.util.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* access modifiers changed from: package-private */
public class n {
    private final k a;
    private final d b;
    private final f c;
    private final wr0 d;
    private final i e;

    n(k kVar, d dVar, f fVar, wr0 wr0, i iVar) {
        this.a = kVar;
        this.b = dVar;
        this.c = fVar;
        this.d = wr0;
        this.e = iVar;
    }

    public void a(GaiaDevice gaiaDevice, int i) {
        boolean z;
        this.e.a(gaiaDevice.getLoggingIdentifier(), i);
        this.a.b();
        this.a.e(gaiaDevice.getName());
        this.a.setIcon(this.b.d(gaiaDevice));
        this.c.Y(gaiaDevice.getLoggingIdentifier(), i);
        f fVar = this.c;
        ArrayList arrayList = new ArrayList();
        Iterator<GaiaDeviceCapability> it = gaiaDevice.getCapabilities().iterator();
        while (true) {
            z = false;
            if (!it.hasNext()) {
                break;
            }
            GaiaDeviceCapability next = it.next();
            Map<String, String> localizedTitles = next.getLocalizedTitles();
            String str = localizedTitles.get(SpotifyLocale.c());
            if (str == null) {
                String e2 = SpotifyLocale.e();
                Iterator<Map.Entry<String, String>> it2 = localizedTitles.entrySet().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        str = next.getDefaultTitle();
                        break;
                    }
                    Map.Entry<String, String> next2 = it2.next();
                    if (e2.equalsIgnoreCase(next2.getKey().substring(0, 2))) {
                        str = next2.getValue();
                        break;
                    }
                }
            }
            String iconUrl = next.getIconUrl();
            String cosmosIdentifier = gaiaDevice.getCosmosIdentifier();
            GaiaDeviceRedirectUrisAndroid androidUris = next.getGaiaDeviceRedirectUris().getAndroidUris();
            s52 a2 = t52.a(LinkType.PLAY_DEVICEPICKER);
            a2.getClass();
            arrayList.add(new c(str, iconUrl, Uri.parse(androidUris.getUri()).buildUpon().appendQueryParameter(androidUris.getRedirectBackAppParam(), a2.b().get(0)).appendQueryParameter(androidUris.getDeviceNameParam(), cosmosIdentifier).build(), Uri.parse(next.getGaiaDeviceRedirectUris().getAndroidUris().getFallbackUrl())));
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        ArrayList arrayList3 = new ArrayList();
        List<GaiaDeviceIncarnation> incarnations = gaiaDevice.getIncarnations();
        if (incarnations != null) {
            Iterator<GaiaDeviceIncarnation> it3 = incarnations.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                GaiaDeviceIncarnation next3 = it3.next();
                if (!z) {
                    z = next3.isPreferred();
                } else if (next3.isPreferred()) {
                    Assertion.g("There is cannot be more than one incarnation selected as preferred at the same time");
                    arrayList3.clear();
                    break;
                }
                arrayList3.add(new b(next3.getCosmosIdentifier(), Tech.isCast(next3.getTech()), next3.isPreferred()));
            }
            if (!arrayList3.isEmpty() && !z) {
                arrayList3.clear();
                Assertion.g("An incarnation must be selected as preferred");
            }
        }
        arrayList2.addAll(arrayList3);
        if (gaiaDevice.supportsLogout()) {
            arrayList2.add(new a());
        }
        fVar.Z(arrayList2);
        this.c.b0(new e(this, gaiaDevice));
        this.a.c(this.c);
    }

    public void b(GaiaDevice gaiaDevice, DeviceContextMenuEntry deviceContextMenuEntry) {
        int ordinal = deviceContextMenuEntry.getType().ordinal();
        if (ordinal == 0) {
            this.d.b(gaiaDevice.getCosmosIdentifier());
            this.e.b();
            this.a.f(C0707R.string.device_picker_message_forgot_device);
        } else if (ordinal == 1) {
            b bVar = (b) deviceContextMenuEntry;
            if (!bVar.c()) {
                this.d.a(bVar.a());
                this.e.c(bVar.b());
                this.a.f(C0707R.string.connect_device_connection_updated);
            }
        } else if (ordinal == 2) {
            c cVar = (c) deviceContextMenuEntry;
            boolean d2 = this.a.d(cVar.a());
            this.e.d(cVar.a().toString(), cVar.b().toString(), d2);
            if (d2) {
                this.a.a(cVar.a());
            } else {
                this.a.a(cVar.b());
            }
            this.a.close();
        }
    }
}
