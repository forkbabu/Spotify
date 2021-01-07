package defpackage;

import com.google.common.base.MoreObjects;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.libs.search.offline.model.OfflineEntity;
import com.spotify.libs.search.offline.model.OfflineEpisode;
import com.spotify.libs.search.offline.model.OfflinePlaylist;
import com.spotify.libs.search.offline.model.OfflineTrack;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueRow;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueSectionHeader;
import com.spotify.ubi.specification.factories.q3;
import defpackage.s81;
import defpackage.wsa;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: cta  reason: default package */
public class cta implements bta {
    private final hta a;
    private final hsa<OfflineEntity> b;
    private final q3 c;

    public cta(hta hta, hsa<OfflineEntity> hsa, q3 q3Var) {
        this.a = hta;
        this.b = hsa;
        this.c = q3Var;
    }

    private s81.a d(String str, String str2, String str3, x81 x81, String str4, int i) {
        o81 a2 = b71.a(str2, str3);
        s81.a x = z81.c().s(str).n(HubsGlueRow.NORMAL).t(z81.f().g(x81)).z(z81.h().a(str3).d(str4).build()).f("longClick", a2).f("rightAccessoryClick", a2).x(z81.g(str2));
        wsa.a a3 = wsa.a();
        a3.e(this.c.c().d().b(Integer.valueOf(i), str2).a());
        a3.a(i);
        a3.b(str2);
        a3.d("offline-results");
        return x.v(pqa.a(a3.build()));
    }

    private s81 e(s81.a aVar, OfflineEntity offlineEntity) {
        for (dsa dsa : this.b.a(offlineEntity)) {
            aVar = dsa.a(aVar);
        }
        return aVar.l();
    }

    private static <T extends OfflineEntity> List<s81> f(List<T> list, gta gta) {
        ArrayList arrayList = new ArrayList(list.size() + 1);
        arrayList.add(z81.c().n(HubsGlueSectionHeader.SECTION_HEADER).z(z81.h().a(gta.b()).build()).l());
        return arrayList;
    }

    private static String g(int i) {
        return je.p0("offline-results-", i);
    }

    private static x81 h(String str, SpotifyIconV2 spotifyIconV2) {
        if (!MoreObjects.isNullOrEmpty(str)) {
            return h71.c(z81.e().g(str).c(), str);
        }
        return z81.e().e(spotifyIconV2).c();
    }

    @Override // defpackage.bta
    public List<s81> a(List<OfflinePlaylist> list, int i) {
        if (list.isEmpty()) {
            return Collections.emptyList();
        }
        List<s81> f = f(list, this.a.c());
        for (int i2 = 0; i2 < list.size(); i2++) {
            OfflinePlaylist offlinePlaylist = list.get(i2);
            int i3 = i + i2;
            ArrayList arrayList = (ArrayList) f;
            arrayList.add(d(g(i3), offlinePlaylist.uri(), offlinePlaylist.name(), z81.e().e(SpotifyIconV2.PLAYLIST).c(), this.a.c().c(), i3).l());
        }
        return f;
    }

    @Override // defpackage.bta
    public List<s81> b(List<OfflineEpisode> list, int i) {
        if (list.isEmpty()) {
            return Collections.emptyList();
        }
        List<s81> f = f(list, this.a.b());
        for (int i2 = 0; i2 < list.size(); i2++) {
            OfflineEpisode offlineEpisode = list.get(i2);
            int i3 = i + i2;
            ((ArrayList) f).add(e(d(g(i3), offlineEpisode.uri(), offlineEpisode.name(), h(offlineEpisode.imageUri().orNull(), SpotifyIconV2.PLAY), this.a.b().c(), i3), list.get(i2)));
        }
        return f;
    }

    @Override // defpackage.bta
    public List<s81> c(List<OfflineTrack> list, int i) {
        if (list.isEmpty()) {
            return Collections.emptyList();
        }
        List<s81> f = f(list, this.a.a());
        for (int i2 = 0; i2 < list.size(); i2++) {
            OfflineTrack offlineTrack = list.get(i2);
            int i3 = i + i2;
            String g = g(i3);
            StringBuilder sb = new StringBuilder(offlineTrack.artistNames());
            if (offlineTrack.album().isPresent()) {
                sb.append(" • ");
                sb.append(offlineTrack.album().get().name());
            }
            ((ArrayList) f).add(e(d(g, offlineTrack.uri(), offlineTrack.name(), h(offlineTrack.album().isPresent() ? offlineTrack.album().get().imageUri().orNull() : null, SpotifyIconV2.TRACK), sb.toString(), i3), list.get(i2)));
        }
        return f;
    }
}
