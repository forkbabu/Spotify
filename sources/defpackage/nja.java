package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.spotify.image.provider.MediaUriUtil;
import com.spotify.music.libs.mediabrowserservice.d2;
import com.spotify.player.model.PlayerState;

/* renamed from: nja  reason: default package */
public class nja {
    private final wlf<MediaUriUtil> a;
    private final wlf<d2> b;
    private final wlf<kja> c;
    private final wlf<c4e> d;

    public nja(wlf<MediaUriUtil> wlf, wlf<d2> wlf2, wlf<kja> wlf3, wlf<c4e> wlf4) {
        a(wlf, 1);
        this.a = wlf;
        a(wlf2, 2);
        this.b = wlf2;
        a(wlf3, 3);
        this.c = wlf3;
        a(wlf4, 4);
        this.d = wlf4;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    public mja b(PlayerState playerState, ImmutableMap<String, String> immutableMap, Optional<pja> optional) {
        MediaUriUtil mediaUriUtil = this.a.get();
        a(mediaUriUtil, 1);
        MediaUriUtil mediaUriUtil2 = mediaUriUtil;
        d2 d2Var = this.b.get();
        a(d2Var, 2);
        d2 d2Var2 = d2Var;
        kja kja = this.c.get();
        a(kja, 3);
        kja kja2 = kja;
        c4e c4e = this.d.get();
        a(c4e, 4);
        a(playerState, 5);
        a(immutableMap, 6);
        a(optional, 7);
        return new mja(mediaUriUtil2, d2Var2, kja2, c4e, playerState, immutableMap, optional);
    }
}
