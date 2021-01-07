package defpackage;

import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.hubframework.defaults.components.custom.HubsGlueImageSettings;
import com.spotify.mobile.android.util.l0;

/* renamed from: h71  reason: default package */
public final class h71 {
    public static SpotifyIconV2 a(String str) {
        switch (l0.z(str).q().ordinal()) {
            case 6:
                return SpotifyIconV2.ALBUM;
            case 14:
            case 56:
                return SpotifyIconV2.ARTIST;
            case 34:
                return SpotifyIconV2.BROWSE;
            case 185:
            case 210:
                return SpotifyIconV2.PLAYLIST;
            case 205:
                return SpotifyIconV2.USER;
            case 237:
            case 246:
                return SpotifyIconV2.PODCASTS;
            case 258:
                return SpotifyIconV2.RADIO;
            case 273:
                return SpotifyIconV2.TRACK;
            default:
                return SpotifyIconV2.TRACK;
        }
    }

    public static HubsGlueImageSettings.Style b(String str) {
        int ordinal = l0.z(str).q().ordinal();
        if (ordinal == 14 || ordinal == 56 || ordinal == 205) {
            return HubsGlueImageSettings.Style.CIRCULAR;
        }
        if (ordinal == 218 || ordinal == 220 || ordinal == 215) {
            return HubsGlueImageSettings.Style.SQUARE_WITH_RIPPLE;
        }
        if (ordinal != 216) {
            return HubsGlueImageSettings.Style.DEFAULT;
        }
        return HubsGlueImageSettings.Style.CIRCULAR_WITH_RIPPLE;
    }

    public static x81 c(x81 x81, String str) {
        return x81.toBuilder().a(HubsGlueImageSettings.b(b(str))).e(a(str)).c();
    }
}
