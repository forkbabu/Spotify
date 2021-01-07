package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.util.connectivity.ConnectionType;
import com.spotify.mobile.android.video.d0;

/* renamed from: t72  reason: default package */
public final class t72 {
    public static String a(ConnectionType connectionType) {
        switch (connectionType.ordinal()) {
            case 1:
                return "none";
            case 2:
                return "gprs";
            case 3:
                return "edge";
            case 4:
                return "3g";
            case 5:
                return "4g";
            case 6:
                return "wlan";
            case 7:
                return "ethernet";
            case 8:
                return "companion_proxy";
            default:
                return "unknown";
        }
    }

    public static Optional<String> b(d0 d0Var) {
        if (d0Var.c().containsKey("betamax_override_feature_identifier")) {
            return Optional.of(d0Var.c().get("betamax_override_feature_identifier"));
        }
        return Optional.absent();
    }
}
