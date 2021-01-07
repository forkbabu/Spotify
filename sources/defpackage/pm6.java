package defpackage;

import com.spotify.mobile.android.ui.contextmenu.b4;
import com.spotify.music.features.playlistentity.itemlist.adapter.ContextMenuItem;
import com.spotify.music.libs.viewuri.c;
import com.spotify.music.offlinetrials.limited.uicomponents.u;

/* renamed from: pm6  reason: default package */
public class pm6 {
    private final wlf<u> a;

    public pm6(wlf<u> wlf) {
        a(wlf, 1);
        this.a = wlf;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    public om6 b(ajf<b4<ContextMenuItem>> ajf, c cVar) {
        u uVar = this.a.get();
        a(uVar, 1);
        a(ajf, 2);
        a(cVar, 3);
        return new om6(uVar, ajf, cVar);
    }
}
