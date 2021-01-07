package defpackage;

import com.spotify.mobile.android.ui.contextmenu.b4;
import com.spotify.music.features.playlistentity.itemlist.adapter.ContextMenuItem;
import com.spotify.music.libs.viewuri.c;
import com.squareup.picasso.Picasso;

/* renamed from: zd6  reason: default package */
public class zd6 {
    private final wlf<Picasso> a;
    private final wlf<me6> b;
    private final wlf<String> c;

    public zd6(wlf<Picasso> wlf, wlf<me6> wlf2, wlf<String> wlf3) {
        a(wlf, 1);
        this.a = wlf;
        a(wlf2, 2);
        this.b = wlf2;
        a(wlf3, 3);
        this.c = wlf3;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    public yd6 b(ajf<b4<ContextMenuItem>> ajf, c cVar) {
        Picasso picasso = this.a.get();
        a(picasso, 1);
        Picasso picasso2 = picasso;
        me6 me6 = this.b.get();
        a(me6, 2);
        me6 me62 = me6;
        String str = this.c.get();
        a(str, 3);
        a(ajf, 4);
        a(cVar, 5);
        return new yd6(picasso2, me62, str, ajf, cVar);
    }
}
