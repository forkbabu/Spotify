package com.spotify.music.features.search.mobius;

import com.google.common.base.MoreObjects;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.libs.search.offline.model.OfflineEntity;
import com.spotify.libs.search.offline.model.OfflineEpisode;
import com.spotify.libs.search.offline.model.OfflineTrack;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueRow;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueSectionHeader;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class o0 {
    private final hta a;

    public o0(hta hta) {
        this.a = hta;
    }

    private static s81 a(String str, int i, String str2, String str3, x81 x81, String str4) {
        o81 a2 = b71.a(str2, str3);
        return z81.c().s(str).n(HubsGlueRow.NORMAL).t(z81.f().g(x81)).z(z81.h().a(str3).d(str4).build()).f("longClick", a2).f("rightAccessoryClick", a2).f("click", t.a(str2, i, "offline-results")).x(z81.g(str2)).v(HubsImmutableComponentBundle.create().toBuilder().p("section_id", "offline-results").d()).l();
    }

    private static <T extends OfflineEntity> List<s81> b(List<T> list, gta gta) {
        ArrayList arrayList = new ArrayList(list.size() + 1);
        arrayList.add(z81.c().n(HubsGlueSectionHeader.SECTION_HEADER).z(z81.h().a(gta.b()).build()).l());
        return arrayList;
    }

    private static x81 c(String str, SpotifyIconV2 spotifyIconV2) {
        if (!MoreObjects.isNullOrEmpty(str)) {
            return h71.c(z81.e().g(str).c(), str);
        }
        return z81.e().e(spotifyIconV2).c();
    }

    public List<s81> d(List<OfflineEpisode> list) {
        if (list.isEmpty()) {
            return Collections.emptyList();
        }
        List<s81> b = b(list, this.a.b());
        for (int i = 0; i < list.size(); i++) {
            OfflineEpisode offlineEpisode = list.get(i);
            ((ArrayList) b).add(a(je.p0("offline-results-", i), i, offlineEpisode.uri(), offlineEpisode.name(), c(offlineEpisode.imageUri().orNull(), SpotifyIconV2.PLAY), this.a.b().c()));
        }
        return b;
    }

    public List<s81> e(List<OfflineTrack> list) {
        if (list.isEmpty()) {
            return Collections.emptyList();
        }
        List<s81> b = b(list, this.a.a());
        for (int i = 0; i < list.size(); i++) {
            OfflineTrack offlineTrack = list.get(i);
            String p0 = je.p0("offline-results-", i);
            StringBuilder sb = new StringBuilder();
            sb.append(offlineTrack.artistNames());
            if (offlineTrack.album().isPresent()) {
                sb.append(" • ");
                sb.append(offlineTrack.album().get().name());
            }
            ((ArrayList) b).add(a(p0, i, offlineTrack.uri(), offlineTrack.name(), c(offlineTrack.album().isPresent() ? offlineTrack.album().get().imageUri().orNull() : null, SpotifyIconV2.TRACK), sb.toString()));
        }
        return b;
    }
}
