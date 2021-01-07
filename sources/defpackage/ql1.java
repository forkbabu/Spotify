package defpackage;

import android.text.TextUtils;
import com.spotify.mobile.android.service.media.search.WebApiSearchModel;
import com.spotify.mobile.android.service.media.search.WebApiSearchResults;
import defpackage.gl1;
import defpackage.ml1;
import defpackage.nl1;
import defpackage.ol1;
import io.reactivex.functions.l;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ql1  reason: default package */
public class ql1 implements l<WebApiSearchResults, ml1> {
    private static String a(List<WebApiSearchModel.Artist> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return TextUtils.join(", ", list);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public ml1 apply(WebApiSearchResults webApiSearchResults) {
        gl1 gl1;
        WebApiSearchResults webApiSearchResults2 = webApiSearchResults;
        ml1.a c = ml1.c();
        if (webApiSearchResults2 != null) {
            WebApiSearchModel.Response results = webApiSearchResults2.getResults();
            if (results.hasPlaylists()) {
                WebApiSearchModel.Playlists playlists = results.getPlaylists();
                ArrayList arrayList = new ArrayList(playlists.getItems().size());
                for (WebApiSearchModel.PlaylistItem playlistItem : playlists.getItems()) {
                    WebApiSearchModel.Image image = playlistItem.getImage();
                    nl1.a a = nl1.a();
                    a.d(playlistItem.getName());
                    a.e(playlistItem.getUri());
                    a.c(image == null ? null : image.getUrl());
                    arrayList.add(a.a());
                }
                c.e(arrayList);
            }
            if (results.hasAlbums()) {
                WebApiSearchModel.Albums albums = results.getAlbums();
                ArrayList arrayList2 = new ArrayList(albums.getItems().size());
                for (WebApiSearchModel.AlbumItem albumItem : albums.getItems()) {
                    WebApiSearchModel.Image image2 = albumItem.getImage();
                    gl1.a b = gl1.b();
                    b.e(albumItem.getName());
                    b.f(albumItem.getUri());
                    b.d(image2 == null ? null : image2.getUrl());
                    b.a(a(albumItem.getArtists()));
                    arrayList2.add(b.b());
                }
                c.a(arrayList2);
            }
            if (results.hasArtists()) {
                WebApiSearchModel.Artists artists = results.getArtists();
                ArrayList arrayList3 = new ArrayList(artists.getItems().size());
                for (WebApiSearchModel.ArtistItem artistItem : artists.getItems()) {
                    WebApiSearchModel.Image image3 = artistItem.getImage();
                    nl1.a a2 = nl1.a();
                    a2.d(artistItem.getName());
                    a2.e(artistItem.getUri());
                    a2.c(image3 == null ? null : image3.getUrl());
                    arrayList3.add(a2.a());
                }
                c.b(arrayList3);
            }
            if (results.hasEpisodes()) {
                WebApiSearchModel.Episodes episodes = results.getEpisodes();
                ArrayList arrayList4 = new ArrayList(episodes.getItems().size());
                for (WebApiSearchModel.EpisodeItem episodeItem : episodes.getItems()) {
                    if (episodeItem != null) {
                        WebApiSearchModel.Image image4 = episodeItem.getImage();
                        nl1.a a3 = nl1.a();
                        a3.d(episodeItem.getName());
                        a3.e(episodeItem.getUri());
                        a3.b(Boolean.valueOf(episodeItem.isExplicit()));
                        a3.c(image4 == null ? null : image4.getUrl());
                        arrayList4.add(a3.a());
                    }
                }
                c.d(arrayList4);
            }
            if (results.hasTracks()) {
                WebApiSearchModel.Tracks tracks = results.getTracks();
                ArrayList arrayList5 = new ArrayList(tracks.getItems().size());
                for (WebApiSearchModel.TrackItem trackItem : tracks.getItems()) {
                    WebApiSearchModel.Album album = trackItem.getAlbum();
                    WebApiSearchModel.Image image5 = album == null ? null : album.getImage();
                    ol1.a c2 = ol1.c();
                    c2.f(trackItem.getName());
                    c2.g(trackItem.getUri());
                    c2.d(Boolean.valueOf(trackItem.isExplicit()));
                    c2.b(a(trackItem.getArtists()));
                    if (album == null) {
                        gl1 = null;
                    } else {
                        WebApiSearchModel.Image image6 = album.getImage();
                        gl1.a b2 = gl1.b();
                        b2.e(album.getName());
                        b2.f(album.getUri());
                        b2.d(image6 == null ? null : image6.getUrl());
                        gl1 = b2.b();
                    }
                    c2.a(gl1);
                    c2.e(image5 == null ? null : image5.getUrl());
                    arrayList5.add(c2.c());
                }
                c.f(arrayList5);
            }
        }
        return c.c();
    }
}
