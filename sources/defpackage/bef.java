package defpackage;

import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.nlu.slimo.proto.SlimoProto$ParsedQuery$Intent;
import com.spotify.voice.external.experience.domain.model.b;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: bef  reason: default package */
public final class bef {
    private static final Map<SlimoProto$ParsedQuery$Intent, sg0<b, Set<kef>>> a;
    public static final /* synthetic */ int b = 0;

    static {
        HashMap hashMap = new HashMap();
        a = hashMap;
        SlimoProto$ParsedQuery$Intent slimoProto$ParsedQuery$Intent = SlimoProto$ParsedQuery$Intent.ADD_TO_COLLECTION;
        bdf bdf = bdf.a;
        hashMap.put(slimoProto$ParsedQuery$Intent, bdf);
        hashMap.put(SlimoProto$ParsedQuery$Intent.THUMBS_UP, bdf);
        hashMap.put(SlimoProto$ParsedQuery$Intent.FOLLOW, bdf);
        hashMap.put(SlimoProto$ParsedQuery$Intent.NO_INTENT, pdf.a);
        hashMap.put(SlimoProto$ParsedQuery$Intent.RESUME, rdf.a);
        hashMap.put(SlimoProto$ParsedQuery$Intent.PLAY, jdf.a);
        hashMap.put(SlimoProto$ParsedQuery$Intent.SHUFFLE_ON, idf.a);
        hashMap.put(SlimoProto$ParsedQuery$Intent.SHUFFLE_OFF, mdf.a);
        hashMap.put(SlimoProto$ParsedQuery$Intent.REPEAT_ON, zcf.a);
        hashMap.put(SlimoProto$ParsedQuery$Intent.REPEAT_ONE, ldf.a);
        hashMap.put(SlimoProto$ParsedQuery$Intent.REPEAT_OFF, odf.a);
        hashMap.put(SlimoProto$ParsedQuery$Intent.NEXT, hdf.a);
        hashMap.put(SlimoProto$ParsedQuery$Intent.PREVIOUS, cdf.a);
        hashMap.put(SlimoProto$ParsedQuery$Intent.STOP, adf.a);
        hashMap.put(SlimoProto$ParsedQuery$Intent.VOLUME_UP, ddf.a);
        hashMap.put(SlimoProto$ParsedQuery$Intent.VOLUME_DOWN, ndf.a);
        hashMap.put(SlimoProto$ParsedQuery$Intent.VOLUME_ABSOLUTE, fdf.a);
        hashMap.put(SlimoProto$ParsedQuery$Intent.MUTE_MIC, ycf.a);
        hashMap.put(SlimoProto$ParsedQuery$Intent.WHATS_PLAYING, gdf.a);
        hashMap.put(SlimoProto$ParsedQuery$Intent.SHOW, edf.a);
        hashMap.put(SlimoProto$ParsedQuery$Intent.HELP, qdf.a);
        hashMap.put(SlimoProto$ParsedQuery$Intent.SAVE_TO_PRESET, kdf.a);
    }

    private static Set<kef> a(b bVar) {
        return z42.l(kef.j(bVar.k().metadata().get("album_uri")));
    }

    private static Set<kef> b(b bVar) {
        return z42.l(kef.k(bVar.a()));
    }

    public static sg0<b, Set<kef>> c(SlimoProto$ParsedQuery$Intent slimoProto$ParsedQuery$Intent) {
        return a.get(slimoProto$ParsedQuery$Intent);
    }

    private static Set<kef> d(b bVar) {
        return z42.l(kef.a(bVar.k().metadata().get("artist_uri")));
    }

    private static Set<kef> e(b bVar) {
        return z42.l(kef.b(bVar.a()));
    }

    private static boolean f(b bVar) {
        return (bVar.k() == null || bVar.k().metadata().get("album_uri") == null) ? false : true;
    }

    private static boolean g(b bVar) {
        return (bVar.k() == null || bVar.k().metadata().get("artist_uri") == null) ? false : true;
    }

    private static boolean h(b bVar) {
        return l0.c(bVar.a(), LinkType.PLAYLIST_V2, LinkType.PROFILE_PLAYLIST);
    }

    public static boolean i(SlimoProto$ParsedQuery$Intent slimoProto$ParsedQuery$Intent) {
        return a.containsKey(slimoProto$ParsedQuery$Intent);
    }

    static Set j(b bVar) {
        String d = bVar.d();
        if (d != null) {
            char c = 65535;
            switch (d.hashCode()) {
                case -1897135820:
                    if (d.equals("station")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1544438277:
                    if (d.equals("episode")) {
                        c = 6;
                        break;
                    }
                    break;
                case -1409097913:
                    if (d.equals("artist")) {
                        c = 5;
                        break;
                    }
                    break;
                case -405568764:
                    if (d.equals("podcast")) {
                        c = 4;
                        break;
                    }
                    break;
                case 3536149:
                    if (d.equals("song")) {
                        c = '\b';
                        break;
                    }
                    break;
                case 92896879:
                    if (d.equals("album")) {
                        c = 0;
                        break;
                    }
                    break;
                case 108270587:
                    if (d.equals("radio")) {
                        c = 2;
                        break;
                    }
                    break;
                case 110621003:
                    if (d.equals(AppProtocol.TrackData.TYPE_TRACK)) {
                        c = 7;
                        break;
                    }
                    break;
                case 1879474642:
                    if (d.equals("playlist")) {
                        c = 1;
                        break;
                    }
                    break;
            }
            if (c != 0) {
                if (c == 1 || c == 2 || c == 3) {
                    if (h(bVar)) {
                        return b(bVar);
                    }
                    if (f(bVar)) {
                        return a(bVar);
                    }
                    if (g(bVar)) {
                        return d(bVar);
                    }
                    return k(bVar);
                } else if (c != 4) {
                    if (c != 5) {
                        return k(bVar);
                    }
                    if (g(bVar)) {
                        return d(bVar);
                    }
                    if (h(bVar)) {
                        return b(bVar);
                    }
                    if (f(bVar)) {
                        return a(bVar);
                    }
                    return k(bVar);
                } else if (l0.b(bVar.a(), LinkType.SHOW_SHOW)) {
                    return e(bVar);
                } else {
                    if (h(bVar)) {
                        return b(bVar);
                    }
                    if (g(bVar)) {
                        return d(bVar);
                    }
                    return k(bVar);
                }
            } else if (f(bVar)) {
                return a(bVar);
            } else {
                if (h(bVar)) {
                    return b(bVar);
                }
                if (g(bVar)) {
                    return d(bVar);
                }
                return k(bVar);
            }
        } else if (kxd.i(bVar.k())) {
            return e(bVar);
        } else {
            return k(bVar);
        }
    }

    private static Set<kef> k(b bVar) {
        return z42.l(kef.q(bVar.k().uri()));
    }
}
