package defpackage;

import com.spotify.nowplaying.ui.components.overlay.OverlayDisplayMode;
import com.spotify.nowplaying.ui.components.overlay.j;
import io.reactivex.functions.c;

/* renamed from: mmb  reason: default package */
public final /* synthetic */ class mmb implements c {
    public static final /* synthetic */ mmb a = new mmb();

    private /* synthetic */ mmb() {
    }

    @Override // io.reactivex.functions.c
    public final Object a(Object obj, Object obj2) {
        j jVar = (j) obj;
        return ((Boolean) obj2).booleanValue() ? j.a(OverlayDisplayMode.HIDE_DISABLED, jVar.c()) : jVar;
    }
}
