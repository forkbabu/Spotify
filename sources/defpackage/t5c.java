package defpackage;

import com.google.common.base.Optional;
import com.spotify.nowplaying.ui.components.overlay.OverlayDisplayMode;
import com.spotify.nowplaying.ui.components.overlay.j;
import io.reactivex.functions.i;

/* renamed from: t5c  reason: default package */
public final /* synthetic */ class t5c implements i {
    public static final /* synthetic */ t5c a = new t5c();

    private /* synthetic */ t5c() {
    }

    @Override // io.reactivex.functions.i
    public final Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        OverlayDisplayMode overlayDisplayMode;
        Boolean bool = (Boolean) obj2;
        Optional optional = (Optional) obj3;
        Boolean bool2 = (Boolean) obj4;
        if (!((Boolean) obj).booleanValue() || !bool2.booleanValue()) {
            overlayDisplayMode = OverlayDisplayMode.HIDE_DISABLED;
        } else if (!bool.booleanValue() || (optional.isPresent() && ((Long) optional.get()).longValue() <= 0)) {
            overlayDisplayMode = OverlayDisplayMode.AUTO_HIDE;
        } else {
            overlayDisplayMode = OverlayDisplayMode.HIDE_ENABLED;
        }
        return j.a(overlayDisplayMode, false);
    }
}
