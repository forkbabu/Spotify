package com.spotify.mobile.android.service.media.browser;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.common.base.Function;
import com.google.common.base.MoreObjects;
import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableList;
import com.spotify.image.provider.MediaUriUtil;
import com.spotify.libs.album.AlbumCover;
import com.spotify.libs.album.c;
import com.spotify.mediaitem.PlayOriginReferrer;
import com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem;
import com.spotify.mobile.android.service.media.browser.loaders.browse.b;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.C0707R;
import com.spotify.music.artist.model.ArtistModel;
import com.spotify.music.artist.model.Image;
import com.spotify.music.artist.model.Release;
import com.spotify.playlist.models.Covers;
import com.spotify.playlist.models.Episode;
import com.spotify.playlist.models.a;
import com.spotify.playlist.models.f;
import com.spotify.playlist.models.j;
import com.spotify.playlist.models.offline.a;
import com.spotify.playlist.models.p;
import com.spotify.playlist.models.q;
import java.util.concurrent.TimeUnit;

public class o {
    private final Context a;
    private final c4e b;

    public o(Context context, c4e c4e) {
        this.a = context;
        this.b = c4e;
    }

    public static String j(String str) {
        l0 z = l0.z(str);
        return z.q() == LinkType.PROFILE_PLAYLIST ? l0.A(z.i()).B() : str;
    }

    public MediaBrowserItem a(a aVar, boolean z, PlayOriginReferrer playOriginReferrer) {
        String d = aVar.d();
        if (MoreObjects.isNullOrEmpty(d)) {
            d = aVar.getUri();
        }
        if (MoreObjects.isNullOrEmpty(d)) {
            return null;
        }
        String g = aVar.g();
        String f = aVar.c().f();
        Uri parse = Uri.parse(q.c(aVar.e(), Covers.Size.NORMAL));
        com.spotify.playlist.models.offline.a i = aVar.i();
        i.getClass();
        boolean z2 = i instanceof a.C0377a;
        MediaBrowserItem.ActionType actionType = z ? MediaBrowserItem.ActionType.BROWSABLE : MediaBrowserItem.ActionType.PLAYABLE;
        b bVar = new b(d);
        bVar.r(g);
        bVar.q(f);
        bVar.j(parse);
        bVar.c(actionType);
        bVar.d(z2);
        com.spotify.mediaitem.a aVar2 = new com.spotify.mediaitem.a();
        aVar2.o(playOriginReferrer);
        if (z) {
            aVar2.f(1);
        }
        bVar.i(aVar2.b());
        return bVar.a();
    }

    public MediaBrowserItem b(c cVar, String str, AlbumCover albumCover) {
        String join = TextUtils.join(", ", Collections2.filter(Collections2.transform((Iterable) cVar.a(), (Function) e.a), b.a));
        com.spotify.mediaitem.a aVar = new com.spotify.mediaitem.a();
        aVar.h(cVar.b());
        Bundle b2 = aVar.b();
        b bVar = new b(cVar.d());
        bVar.c(MediaBrowserItem.ActionType.PLAYABLE);
        bVar.r(cVar.c());
        bVar.q(join);
        bVar.j(albumCover != null ? Uri.parse(albumCover.getUri()) : Uri.EMPTY);
        bVar.g(str);
        bVar.f(Uri.parse(this.b.a(cVar.d())));
        bVar.h(cVar.e());
        bVar.i(b2);
        return bVar.a();
    }

    public MediaBrowserItem c(com.spotify.playlist.models.b bVar, boolean z, PlayOriginReferrer playOriginReferrer) {
        String uri = bVar.getUri();
        String str = null;
        if (MoreObjects.isNullOrEmpty(uri)) {
            return null;
        }
        int g = bVar.g();
        String c = bVar.c();
        if (g > 0 && !TextUtils.isEmpty(c)) {
            uri = c;
        }
        String f = bVar.f();
        if (g > 0) {
            str = this.a.getResources().getQuantityString(C0707R.plurals.mobile_artist_tracks_count, g, Integer.valueOf(g));
        }
        Uri parse = Uri.parse(q.c(bVar.d(), Covers.Size.NORMAL));
        com.spotify.playlist.models.offline.a h = bVar.h();
        h.getClass();
        boolean z2 = h instanceof a.C0377a;
        MediaBrowserItem.ActionType actionType = z ? MediaBrowserItem.ActionType.BROWSABLE : MediaBrowserItem.ActionType.PLAYABLE;
        com.spotify.mediaitem.a aVar = new com.spotify.mediaitem.a();
        aVar.f(1);
        aVar.e(2);
        aVar.o(playOriginReferrer);
        Bundle b2 = aVar.b();
        b bVar2 = new b(uri);
        bVar2.r(f);
        bVar2.q(str);
        bVar2.j(parse);
        bVar2.s(MediaUriUtil.Transformation.CIRCULAR);
        bVar2.c(actionType);
        bVar2.d(z2);
        bVar2.i(b2);
        return bVar2.a();
    }

    public MediaBrowserItem d(ArtistModel.Track track, String str, String str2) {
        Image image;
        String str3 = track.uri;
        if (MoreObjects.isNullOrEmpty(str3)) {
            return null;
        }
        com.spotify.mediaitem.a aVar = new com.spotify.mediaitem.a();
        aVar.i(str2);
        Bundle b2 = aVar.b();
        b bVar = new b(str3);
        bVar.c(MediaBrowserItem.ActionType.PLAYABLE);
        bVar.r(track.name);
        Release release = track.release;
        bVar.q(release != null ? release.name : "");
        bVar.g(str);
        bVar.f(Uri.parse(this.b.a(str3)));
        bVar.h(track.explicit);
        Release release2 = track.release;
        bVar.j((release2 == null || (image = release2.cover) == null) ? Uri.EMPTY : Uri.parse(image.uri));
        bVar.i(b2);
        return bVar.a();
    }

    public MediaBrowserItem e(Episode episode, String str, sg0<Episode, String> sg0, PlayOriginReferrer playOriginReferrer) {
        MediaBrowserItem.CompletionState completionState;
        if (episode.E()) {
            completionState = MediaBrowserItem.CompletionState.FULLY_PLAYED;
        } else if (episode.x() == null || episode.x().intValue() >= episode.j()) {
            completionState = MediaBrowserItem.CompletionState.NOT_PLAYED;
        } else {
            completionState = MediaBrowserItem.CompletionState.PARTIALLY_PLAYED;
        }
        com.spotify.mediaitem.a aVar = new com.spotify.mediaitem.a();
        aVar.o(playOriginReferrer);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        aVar.h(timeUnit.toMillis((long) episode.j()));
        aVar.r(episode.x() != null ? timeUnit.toMillis((long) episode.x().intValue()) : -1);
        Bundle b2 = aVar.b();
        b bVar = new b(episode.getUri());
        bVar.i(b2);
        bVar.c(MediaBrowserItem.ActionType.PLAYABLE);
        bVar.r(episode.n());
        bVar.q(sg0.apply(episode));
        com.spotify.playlist.models.offline.a o = episode.o();
        o.getClass();
        bVar.d(o instanceof a.C0377a);
        bVar.g(str);
        bVar.f(Uri.parse(episode.getUri()));
        bVar.j(Uri.parse(q.c(episode.c(), Covers.Size.NORMAL)));
        bVar.s(MediaUriUtil.Transformation.ROUNDED_CORNER);
        bVar.e(completionState);
        return bVar.a();
    }

    public MediaBrowserItem f(f fVar) {
        String c = fVar.c();
        String f = fVar.f();
        int e = fVar.e();
        StringBuilder sb = new StringBuilder(64);
        sb.append(this.a.getResources().getQuantityString(C0707R.plurals.playlist_playlist_count, e, Integer.valueOf(e)));
        int d = fVar.d();
        if (d > 0) {
            sb.append(", ");
            sb.append(this.a.getResources().getQuantityString(C0707R.plurals.playlist_folder_count, d, Integer.valueOf(d)));
        }
        b bVar = new b(Uri.parse(f));
        bVar.r(c);
        bVar.q(sb.toString());
        bVar.c(MediaBrowserItem.ActionType.BROWSABLE);
        bVar.j(gf0.g(this.a, C0707R.drawable.ic_eis_playlists));
        bVar.d(true);
        com.spotify.mediaitem.a aVar = new com.spotify.mediaitem.a();
        aVar.f(1);
        bVar.i(aVar.b());
        return bVar.a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b2, code lost:
        if (r12.a(r0).or((com.google.common.base.Optional<java.lang.Boolean>) java.lang.Boolean.FALSE).booleanValue() != false) goto L_0x00b9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00bf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem g(defpackage.s81 r8, java.lang.String r9, boolean r10, boolean r11, defpackage.vxd r12, com.spotify.music.libs.external_integration.instrumentation.e r13, com.spotify.mediaitem.PlayOriginReferrer r14) {
        /*
            r7 = this;
            java.lang.String r0 = com.spotify.mobile.android.service.media.browser.s.d(r8)
            java.lang.String r0 = j(r0)
            r1 = 0
            if (r0 != 0) goto L_0x000c
            return r1
        L_0x000c:
            w81 r2 = r8.text()
            java.lang.String r2 = r2.title()
            if (r2 != 0) goto L_0x0017
            return r1
        L_0x0017:
            com.spotify.mobile.android.util.l0 r1 = com.spotify.mobile.android.util.l0.z(r0)
            com.spotify.mobile.android.util.LinkType r1 = r1.q()
            com.spotify.mobile.android.util.LinkType r3 = com.spotify.mobile.android.util.LinkType.SHOW_EPISODE
            if (r1 == r3) goto L_0x003b
            com.spotify.mobile.android.util.LinkType r3 = com.spotify.mobile.android.util.LinkType.SHOW_SHOW
            if (r1 != r3) goto L_0x0028
            goto L_0x003b
        L_0x0028:
            com.spotify.mobile.android.util.LinkType r3 = com.spotify.mobile.android.util.LinkType.ARTIST
            if (r1 == r3) goto L_0x0038
            com.spotify.mobile.android.util.LinkType r3 = com.spotify.mobile.android.util.LinkType.ARTIST_RADIO
            if (r1 == r3) goto L_0x0038
            com.spotify.mobile.android.util.LinkType r3 = com.spotify.mobile.android.util.LinkType.ARTIST_ALBUMS
            if (r1 != r3) goto L_0x0035
            goto L_0x0038
        L_0x0035:
            com.spotify.image.provider.MediaUriUtil$Transformation r3 = com.spotify.image.provider.MediaUriUtil.Transformation.NONE
            goto L_0x003d
        L_0x0038:
            com.spotify.image.provider.MediaUriUtil$Transformation r3 = com.spotify.image.provider.MediaUriUtil.Transformation.CIRCULAR
            goto L_0x003d
        L_0x003b:
            com.spotify.image.provider.MediaUriUtil$Transformation r3 = com.spotify.image.provider.MediaUriUtil.Transformation.ROUNDED_CORNER
        L_0x003d:
            java.lang.String r8 = com.spotify.mobile.android.service.media.browser.s.c(r8)
            if (r8 == 0) goto L_0x0048
            android.net.Uri r8 = android.net.Uri.parse(r8)
            goto L_0x004a
        L_0x0048:
            android.net.Uri r8 = android.net.Uri.EMPTY
        L_0x004a:
            com.spotify.mediaitem.a r4 = new com.spotify.mediaitem.a
            r4.<init>()
            r4.i(r9)
            if (r13 == 0) goto L_0x0081
            android.os.Bundle r9 = new android.os.Bundle
            r9.<init>()
            com.spotify.music.libs.external_integration.instrumentation.Page r5 = r13.c()
            java.lang.String r5 = r5.name()
            java.lang.String r6 = "com.spotify.eis.ubi.page"
            r9.putString(r6, r5)
            java.lang.String r5 = r13.b()
            java.lang.String r6 = "com.spotify.eis.ubi.id"
            r9.putString(r6, r5)
            java.lang.Integer r13 = r13.d()
            if (r13 == 0) goto L_0x007e
            int r13 = r13.intValue()
            java.lang.String r5 = "com.spotify.eis.ubi.position"
            r9.putInt(r5, r13)
        L_0x007e:
            r4.a(r9)
        L_0x0081:
            r4.o(r14)
            int r9 = r1.ordinal()
            r13 = 34
            r14 = 0
            r1 = 1
            if (r9 == r13) goto L_0x00b5
            r13 = 185(0xb9, float:2.59E-43)
            if (r9 == r13) goto L_0x009b
            r10 = 246(0xf6, float:3.45E-43)
            if (r9 == r10) goto L_0x0097
            goto L_0x00ba
        L_0x0097:
            r4.f(r1)
            goto L_0x00b9
        L_0x009b:
            r4.f(r1)
            if (r10 == 0) goto L_0x00ba
            if (r11 != 0) goto L_0x00b9
            com.google.common.base.Optional r9 = r12.a(r0)
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
            java.lang.Object r9 = r9.or(r10)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x00ba
            goto L_0x00b9
        L_0x00b5:
            r9 = 2
            r4.e(r9)
        L_0x00b9:
            r14 = 1
        L_0x00ba:
            if (r14 == 0) goto L_0x00bf
            com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem$ActionType r9 = com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem.ActionType.BROWSABLE
            goto L_0x00c1
        L_0x00bf:
            com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem$ActionType r9 = com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem.ActionType.PLAYABLE
        L_0x00c1:
            com.spotify.mobile.android.service.media.browser.loaders.browse.b r10 = new com.spotify.mobile.android.service.media.browser.loaders.browse.b
            r10.<init>(r0)
            r10.r(r2)
            r10.j(r8)
            r10.s(r3)
            r10.c(r9)
            android.os.Bundle r8 = r4.b()
            r10.i(r8)
            com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem r8 = r10.a()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.service.media.browser.o.g(s81, java.lang.String, boolean, boolean, vxd, com.spotify.music.libs.external_integration.instrumentation.e, com.spotify.mediaitem.PlayOriginReferrer):com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem");
    }

    public MediaBrowserItem h(j jVar, boolean z, PlayOriginReferrer playOriginReferrer) {
        String j = jVar.j();
        String B = l0.A(l0.z(jVar.getUri()).i()).B();
        int o = jVar.o();
        Uri parse = Uri.parse(q.c(jVar.c(), Covers.Size.NORMAL));
        p m = jVar.m();
        StringBuilder sb = new StringBuilder(64);
        String a2 = m != null ? m.a() : "";
        if (!jVar.w() && !MoreObjects.isNullOrEmpty(a2)) {
            sb.append(String.format(this.a.getString(C0707R.string.playlist_by_owner), a2));
            sb.append(" • ");
        }
        sb.append(this.a.getResources().getQuantityString(C0707R.plurals.playlist_track_count, o, Integer.valueOf(o)));
        com.spotify.playlist.models.offline.a k = jVar.k();
        k.getClass();
        boolean z2 = k instanceof a.C0377a;
        MediaBrowserItem.ActionType actionType = z ? MediaBrowserItem.ActionType.BROWSABLE : MediaBrowserItem.ActionType.PLAYABLE;
        b bVar = new b(B);
        bVar.r(j);
        bVar.c(actionType);
        bVar.q(sb.toString());
        bVar.j(parse);
        bVar.d(z2);
        com.spotify.mediaitem.a aVar = new com.spotify.mediaitem.a();
        aVar.o(playOriginReferrer);
        if (z) {
            aVar.f(1);
        }
        bVar.i(aVar.b());
        return bVar.a();
    }

    public MediaBrowserItem i(com.spotify.playlist.models.o oVar, String str) {
        com.spotify.mediaitem.a aVar = new com.spotify.mediaitem.a();
        aVar.h(TimeUnit.SECONDS.toMillis((long) oVar.getLength()));
        Bundle b2 = aVar.b();
        b bVar = new b(oVar.getUri());
        bVar.c(MediaBrowserItem.ActionType.PLAYABLE);
        bVar.r(oVar.getName());
        ImmutableList<com.spotify.playlist.models.b> artists = oVar.getArtists();
        bVar.q(artists != null ? TextUtils.join(", ", Collections2.filter(Collections2.transform((Iterable) artists, (Function) d.a), c.a)) : null);
        com.spotify.playlist.models.offline.a offlineState = oVar.getOfflineState();
        offlineState.getClass();
        bVar.d(offlineState instanceof a.C0377a);
        bVar.g(str);
        bVar.f(Uri.parse(this.b.a(oVar.getUri())));
        bVar.j(Uri.parse(oVar.getAlbum().e().d()));
        bVar.h(oVar.isExplicit());
        bVar.k(oVar.getIs19plus());
        bVar.i(b2);
        return bVar.a();
    }
}
