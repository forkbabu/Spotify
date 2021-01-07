package defpackage;

import com.spotify.nowplaying.ui.components.overlay.OverlayDisplayMode;
import com.spotify.nowplaying.ui.components.overlay.j;
import io.reactivex.functions.l;

/* renamed from: atb  reason: default package */
public final /* synthetic */ class atb implements l {
    public static final /* synthetic */ atb a = new atb();

    private /* synthetic */ atb() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        return j.a(booleanValue ? OverlayDisplayMode.HIDE_ENABLED : OverlayDisplayMode.HIDE_DISABLED, booleanValue);
    }
}
