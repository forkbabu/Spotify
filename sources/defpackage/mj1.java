package defpackage;

import com.spotify.mobile.android.service.media.browser.loaders.browse.model.a;
import com.spotify.mobile.android.service.media.browser.loaders.browse.model.b;
import com.spotify.mobile.android.service.media.browser.loaders.browse.model.c;
import com.spotify.mobile.android.service.media.browser.s;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import java.util.ArrayList;
import java.util.List;

/* renamed from: mj1  reason: default package */
public class mj1 {
    mj1() {
    }

    private static xj1 a(s81 s81, s81 s812) {
        String d = s.d(s81);
        String title = s81.text().title();
        String subtitle = s81.text().subtitle();
        String title2 = s812 != null ? s812.text().title() : null;
        String description = s81.text().description();
        if (d == null) {
            d = "";
        }
        return new xj1("", title, subtitle, title2, description, d, s.c(s81), 0);
    }

    private static boolean b(String str) {
        if (str == null || l0.c(str, LinkType.RADIO_ROOT, LinkType.RADIO_ALBUM, LinkType.RADIO_ARTIST, LinkType.RADIO_GENRE, LinkType.RADIO_PLAYLIST, LinkType.RADIO_TRACK, LinkType.STATION, LinkType.ALBUM_RADIO, LinkType.ARTIST_RADIO, LinkType.COLLECTION_RADIO, LinkType.GENRE_RADIO, LinkType.PLAYLIST_RADIO, LinkType.TRACK_RADIO, LinkType.USER_PLAYLIST_RADIO, LinkType.STATION_CLUSTER)) {
            return false;
        }
        return true;
    }

    public List<b> c(b91 b91) {
        List<? extends s81> body = b91.body();
        if (body.size() != 1 || ((s81) body.get(0)).children().isEmpty()) {
            ArrayList arrayList = new ArrayList(b91.body().size());
            for (s81 s81 : body) {
                if (!s81.children().isEmpty()) {
                    ArrayList arrayList2 = new ArrayList(s81.children().size());
                    for (s81 s812 : s81.children()) {
                        if (b(s.d(s812))) {
                            arrayList2.add(a(s812, s81));
                        }
                    }
                    arrayList.add(new c(s81.id(), s81.text().title(), arrayList2));
                } else if (b(s.d(s81))) {
                    arrayList.add(new a(s81.id(), s81.text().title(), a(s81, null)));
                }
            }
            return arrayList;
        }
        s81 s813 = (s81) body.get(0);
        ArrayList arrayList3 = new ArrayList(s813.children().size());
        for (s81 s814 : s813.children()) {
            if (b(s.d(s814))) {
                arrayList3.add(new a(s814.id(), s814.text().title(), a(s814, null)));
            }
        }
        return arrayList3;
    }

    public List<b> d(b91 b91) {
        ArrayList arrayList = new ArrayList(b91.body().size());
        String str = "";
        for (s81 s81 : b91.body()) {
            if (s81.componentId().id().endsWith("Header")) {
                str = s81.text().title();
            } else if (!s81.children().isEmpty()) {
                ArrayList arrayList2 = new ArrayList(s81.children().size());
                for (s81 s812 : s81.children()) {
                    if (b(s.d(s812))) {
                        arrayList2.add(a(s812, s81));
                    }
                }
                arrayList.add(new c(s81.id(), str, arrayList2));
            } else if (b(s.d(s81))) {
                arrayList.add(new a(s81.id(), s81.text().title(), a(s81, null)));
            }
        }
        return arrayList;
    }
}
