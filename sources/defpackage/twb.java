package defpackage;

import com.spotify.nowplaying.ui.components.overlay.OverlayDisplayMode;
import com.spotify.nowplaying.ui.components.overlay.j;
import io.reactivex.functions.l;

/* renamed from: twb  reason: default package */
public final /* synthetic */ class twb implements l {
    public static final /* synthetic */ twb a = new twb();

    private /* synthetic */ twb() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        return j.a(booleanValue ? OverlayDisplayMode.HIDE_ENABLED : OverlayDisplayMode.HIDE_DISABLED, booleanValue);
    }
}
