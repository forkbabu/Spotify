package defpackage;

import com.spotify.nowplaying.ui.components.overlay.OverlayDisplayMode;
import com.spotify.nowplaying.ui.components.overlay.j;
import io.reactivex.functions.l;

/* renamed from: d3c  reason: default package */
public final /* synthetic */ class d3c implements l {
    public static final /* synthetic */ d3c a = new d3c();

    private /* synthetic */ d3c() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        return j.a(booleanValue ? OverlayDisplayMode.HIDE_ENABLED : OverlayDisplayMode.HIDE_DISABLED, booleanValue);
    }
}
