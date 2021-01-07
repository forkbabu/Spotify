package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.spotify.base.java.logging.Logger;
import com.spotify.mediaitem.a;
import com.spotify.mobile.android.service.media.browser.BrowserParams;
import com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem;
import com.spotify.mobile.android.service.media.browser.loaders.browse.b;
import com.spotify.mobile.android.service.media.browser.o;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.C0707R;
import com.spotify.music.artist.model.ArtistModel;
import com.spotify.music.artist.model.Release;
import com.spotify.music.artist.model.ReleaseType;
import com.spotify.music.artist.model.Releases;
import io.reactivex.s;
import io.reactivex.z;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: zg1  reason: default package */
public class zg1 implements qh1 {
    private final Context a;
    private final xj2 b;
    private final x9a c;
    private final o d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final String i;

    public zg1(Context context, xj2 xj2, x9a x9a, o oVar) {
        this.a = context;
        this.b = xj2;
        this.c = x9a;
        this.d = oVar;
        this.e = context.getString(C0707R.string.artist_popular_tracks);
        this.f = context.getString(C0707R.string.artist_releases_albums);
        this.g = context.getString(C0707R.string.artist_releases_singles);
        this.h = context.getString(C0707R.string.artist_releases_appears_on);
        this.i = context.getString(C0707R.string.artist_releases_compilations);
    }

    private void c(List<MediaBrowserItem> list, Releases releases, ReleaseType releaseType, String str) {
        MediaBrowserItem mediaBrowserItem;
        if (releases.hasReleasesOfType(releaseType)) {
            for (Release release : releases.getReleasesWithTotalCount(releaseType).releases) {
                this.d.getClass();
                if (release.cover == null) {
                    mediaBrowserItem = null;
                } else {
                    a aVar = new a();
                    aVar.f(1);
                    aVar.i(str);
                    Bundle b2 = aVar.b();
                    b bVar = new b(release.uri);
                    bVar.c(MediaBrowserItem.ActionType.BROWSABLE);
                    bVar.r(release.name);
                    bVar.q(String.valueOf(release.year));
                    bVar.j(Uri.parse(release.cover.uri));
                    bVar.i(b2);
                    mediaBrowserItem = bVar.a();
                }
                list.add(mediaBrowserItem);
            }
        }
    }

    @Override // defpackage.qh1
    public /* synthetic */ z a(BrowserParams browserParams, Map map) {
        return ph1.a(this, browserParams, map);
    }

    @Override // defpackage.qh1
    public z<List<MediaBrowserItem>> b(BrowserParams browserParams) {
        s<R> sVar;
        l0 z = l0.z(browserParams.h());
        String G = z.G();
        if (G == null) {
            return z.q(new IllegalArgumentException());
        }
        Logger.b("loadItems(): artistUri: %s, contextUri: %s", G, z.B());
        s<ArtistModel> a2 = this.b.a(G);
        if (z.q() == LinkType.COLLECTION_ARTIST) {
            sVar = this.c.b(G).c().j0(gf1.a);
        } else {
            sVar = s.i0(0);
        }
        return s.d1(a2, sVar, new hf1(this, G, z, browserParams)).N0(1).B0();
    }

    public List d(String str, l0 l0Var, BrowserParams browserParams, ArtistModel artistModel, Integer num) {
        int intValue = num.intValue();
        boolean q = BrowserParams.q(browserParams.j());
        ArrayList arrayList = new ArrayList(25);
        if (q) {
            arrayList.add(com.spotify.mobile.android.service.media.browser.s.a(this.a, str));
        }
        if (intValue > 0) {
            String B = l0Var.B();
            String str2 = artistModel.info.name;
            a aVar = new a();
            aVar.f(1);
            Bundle b2 = aVar.b();
            b bVar = new b(B);
            bVar.c(MediaBrowserItem.ActionType.PLAYABLE);
            bVar.r(this.a.getString(C0707R.string.collection_liked_songs_title));
            bVar.j(Uri.parse("https://misc.scdn.co/liked-songs/liked-songs-300.png"));
            bVar.q(this.a.getResources().getQuantityString(C0707R.plurals.artist_saved_songs_subtitle, intValue, Integer.valueOf(intValue), str2));
            bVar.i(b2);
            arrayList.add(bVar.a());
        }
        for (ArtistModel.Track track : artistModel.topTracks) {
            arrayList.add(this.d.d(track, str, this.e));
        }
        Releases releases = artistModel.releases;
        c(arrayList, releases, ReleaseType.ALBUMS, this.f);
        c(arrayList, releases, ReleaseType.SINGLES, this.g);
        c(arrayList, releases, ReleaseType.APPEARS_ON, this.h);
        c(arrayList, releases, ReleaseType.COMPILATIONS, this.i);
        return arrayList;
    }
}
