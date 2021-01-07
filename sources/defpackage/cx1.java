package defpackage;

import com.spotify.android.glue.patterns.contextmenu.model.ContextMenuViewModel;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.mobile.android.ui.activity.upsell.Reason;
import com.spotify.mobile.android.ui.contextmenu.r3;
import com.spotify.mobile.android.ui.contextmenu.x3;
import com.spotify.voiceassistant.player.models.metadata.ErrorMetadata;
import java.util.Arrays;

/* renamed from: cx1  reason: default package */
public final class cx1 {
    public static boolean a(Reason reason, String str, String str2) {
        if (!Arrays.asList("cross-promo", AppProtocol.LogMessage.SEVERITY_INFO, "paywall").contains(str)) {
            Logger.b("Attempted to log invalid offer promotional display type: %s", str);
        }
        if (!Arrays.asList("add-to-queue", "play-on-demand", "enable-extreme-quality", "disable-shuffle", "ad-is-playing", "content-unavailable", ErrorMetadata.ERROR_SKIP_LIMIT_REACHED, "cap-limit-reached", "offline-sync-content", "offline-sync-quality", "offline-sync-cellular", "offline-mode", "listen-offline", "trial-ended", "user-initiated").contains(reason.d())) {
            Logger.b("Attempted to log invalid reason type for upsell: %s", reason.d());
        }
        if (!Arrays.asList("banner", "full-page", "inline", "popup", "tooltip").contains(str2)) {
            Logger.b("Attempted to log invalid style for upsell: %s", str2);
        }
        return true;
    }

    public static r3 b(ContextMenuViewModel contextMenuViewModel) {
        return r3.f(new x3.b(contextMenuViewModel));
    }
}
