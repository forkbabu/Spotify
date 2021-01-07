package defpackage;

import com.spotify.music.features.playlistentity.itemlist.adapter.g;
import defpackage.wh6;

/* renamed from: yh6  reason: default package */
final class yh6 implements wh6.a {
    yh6() {
    }

    @Override // defpackage.wh6.a
    public wh6 a(g gVar) {
        if (gVar != null) {
            return new xh6(gVar);
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", 1));
    }
}
