package defpackage;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.h;

/* renamed from: e06  reason: default package */
public final class e06 implements fjf<String> {
    private final wlf<Fragment> a;

    public e06(wlf<Fragment> wlf) {
        this.a = wlf;
    }

    public static String a(Fragment fragment) {
        h.e(fragment, "fragment");
        Bundle D2 = fragment.D2();
        String string = D2 != null ? D2.getString("PLAYLIST_URI_KEY") : null;
        if (string != null) {
            return string;
        }
        throw new IllegalArgumentException("Playlist uri is not set".toString());
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get());
    }
}
