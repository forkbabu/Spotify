package defpackage;

import android.os.Build;
import com.spotify.localization.SpotifyLocale;
import com.spotify.music.libs.debugtools.flags.DebugFlag;
import com.spotify.remoteconfig.nb;

/* renamed from: oab  reason: default package */
public final class oab implements fjf<Boolean> {
    private final wlf<nb> a;

    public oab(wlf<nb> wlf) {
        this.a = wlf;
    }

    public static boolean a(nb nbVar) {
        boolean z;
        if (!nbVar.a()) {
            return false;
        }
        if ("en".equals(SpotifyLocale.e()) || nbVar.b()) {
            z = true;
        } else {
            DebugFlag debugFlag = DebugFlag.VOICE_DISABLE_LANGUAGE_RESTRICTION;
            z = false;
        }
        if (!z || Build.VERSION.SDK_INT < 23) {
            return false;
        }
        return true;
    }

    @Override // defpackage.wlf
    public Object get() {
        return Boolean.valueOf(a(this.a.get()));
    }
}
