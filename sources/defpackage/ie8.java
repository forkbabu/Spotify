package defpackage;

import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import io.reactivex.g;
import io.reactivex.k;

/* renamed from: ie8  reason: default package */
public class ie8 implements k<b91, b91> {
    private static boolean b(s81 s81) {
        String h = rqa.h(s81);
        if (h == null) {
            return false;
        }
        if (LinkType.TRACK == l0.z(h).q()) {
            return true;
        }
        return false;
    }

    static s81 c(s81 s81) {
        if (!b(s81) || ((o81) s81.events().get("click")) == null) {
            return null;
        }
        o81 a = ge8.a(rqa.h(s81));
        if (!(SpotifyIconV2.X == s81.custom().get("secondary_icon"))) {
            return s81.toBuilder().f("click", a).d("secondary_icon", "none").l();
        }
        if (b(s81)) {
            return s81;
        }
        return s81.toBuilder().f("click", a).l();
    }

    /* Return type fixed from 'tpf' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [io.reactivex.g] */
    @Override // io.reactivex.k
    public tpf<b91> a(g<b91> gVar) {
        return gVar.O(new be8(ae8.a));
    }
}
