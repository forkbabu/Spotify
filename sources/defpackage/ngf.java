package defpackage;

import com.spotify.mobile.android.util.l0;

/* renamed from: ngf  reason: default package */
public final class ngf {
    public static boolean a(String str) {
        int ordinal = l0.z(str).q().ordinal();
        if (ordinal == 67 || ordinal == 75 || ordinal == 115 || ordinal == 196 || ordinal == 240 || ordinal == 237 || ordinal == 238) {
            return false;
        }
        switch (ordinal) {
            case 273:
            case 274:
            case 275:
                return false;
            default:
                return true;
        }
    }
}
