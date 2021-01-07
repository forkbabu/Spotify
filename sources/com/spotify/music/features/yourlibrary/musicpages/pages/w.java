package com.spotify.music.features.yourlibrary.musicpages.pages;

import android.content.Context;
import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;
import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.C0707R;
import com.spotify.music.features.yourlibrary.musicpages.filterandsort.b1;
import com.spotify.music.features.yourlibrary.musicpages.pages.u;
import com.spotify.music.features.yourlibrary.musicpages.pages.v;
import com.spotify.music.libs.viewuri.ViewUris;

public class w {
    private static final ImmutableMap<MusicPageId, v> d;
    private final Context a;
    private final b1 b;
    private final ImmutableMap<MusicPageId, Supplier<u>> c;

    static {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        MusicPageId musicPageId = MusicPageId.PLAYLISTS;
        v.a b2 = v.b();
        b2.a(ImmutableList.of(LinkType.COLLECTION_ROOTLIST));
        b2.e(Optional.of(ViewUris.n1));
        b2.d(PageIdentifiers.YOURLIBRARY_PLAYLISTS);
        b2.c(kfd.z);
        builder.mo51put(musicPageId, b2.b());
        MusicPageId musicPageId2 = MusicPageId.ARTISTS;
        v.a b3 = v.b();
        b3.a(ImmutableList.of(LinkType.COLLECTION_ARTIST_OVERVIEW));
        b3.e(Optional.of(ViewUris.p1));
        b3.d(PageIdentifiers.YOURLIBRARY_ARTISTS);
        b3.c(kfd.y);
        builder.mo51put(musicPageId2, b3.b());
        MusicPageId musicPageId3 = MusicPageId.ALBUMS;
        v.a b4 = v.b();
        b4.a(ImmutableList.of(LinkType.COLLECTION_ALBUM_OVERVIEW));
        b4.e(Optional.of(ViewUris.q1));
        b4.d(PageIdentifiers.YOURLIBRARY_ALBUMS);
        b4.c(kfd.w);
        builder.mo51put(musicPageId3, b4.b());
        MusicPageId musicPageId4 = MusicPageId.SONGS;
        v.a b5 = v.b();
        b5.a(ImmutableList.of(LinkType.COLLECTION_TRACKS));
        b5.e(Optional.of(ViewUris.t1));
        b5.d(PageIdentifiers.COLLECTION_SONGS);
        b5.c(kfd.B);
        builder.mo51put(musicPageId4, b5.b());
        MusicPageId musicPageId5 = MusicPageId.FOLDER;
        v.a b6 = v.b();
        b6.a(ImmutableList.of(LinkType.COLLECTION_PLAYLIST_FOLDER));
        b6.f(Optional.of(ViewUris.O0));
        b6.d(PageIdentifiers.PLAYLIST_FOLDER);
        b6.c(kfd.M0);
        builder.mo51put(musicPageId5, b6.b());
        d = builder.build();
    }

    public w(Context context, b1 b1Var) {
        this.a = context;
        this.b = b1Var;
        ImmutableMap.Builder builder = ImmutableMap.builder();
        builder.mo51put(MusicPageId.PLAYLISTS, MoreObjects.memoize(new k(this)));
        builder.mo51put(MusicPageId.ARTISTS, MoreObjects.memoize(new h(this)));
        builder.mo51put(MusicPageId.ALBUMS, MoreObjects.memoize(new i(this)));
        builder.mo51put(MusicPageId.SONGS, MoreObjects.memoize(new j(this)));
        builder.mo51put(MusicPageId.FOLDER, MoreObjects.memoize(new g(this)));
        this.c = builder.build();
    }

    public static ImmutableMap<MusicPageId, v> a() {
        return d;
    }

    public u b(MusicPageId musicPageId) {
        Supplier<u> supplier = this.c.get(musicPageId);
        supplier.getClass();
        return supplier.get();
    }

    public v c(MusicPageId musicPageId) {
        v vVar = d.get(musicPageId);
        vVar.getClass();
        return vVar;
    }

    public u d() {
        u.a a2 = u.a();
        a2.k(MusicPageId.PLAYLISTS);
        a2.s(Optional.of("spotify:playlists"));
        a2.r(this.a.getString(C0707R.string.your_library_music_pages_page_playlists_title));
        a2.e(EmptyPageAction.CREATE_PLAYLIST);
        a2.d(this.a.getString(C0707R.string.your_library_music_pages_button_create_playlist));
        a2.g(this.a.getString(C0707R.string.your_library_music_pages_create_playlist_prompt_description_title));
        a2.f(this.a.getString(C0707R.string.your_library_music_pages_create_playlist_prompt_description_subtitle));
        a2.h(this.b.m());
        a2.c(qpd.b(z42.E(this.b.i())));
        this.b.getClass();
        a2.b(ImmutableMap.of("available_offline_only", Boolean.FALSE));
        return a2.a();
    }

    public u e() {
        u.a a2 = u.a();
        a2.k(MusicPageId.ARTISTS);
        a2.s(Optional.of("spotify:collection:artists"));
        a2.r(this.a.getString(C0707R.string.your_library_music_pages_page_artists_title));
        a2.g(this.a.getString(C0707R.string.your_library_music_pages_page_artists_empty_title));
        a2.f(this.a.getString(C0707R.string.your_library_music_pages_page_artists_empty_subtitle));
        a2.d(this.a.getString(C0707R.string.your_library_music_pages_page_artists_empty_button));
        a2.e(EmptyPageAction.ADD_ARTISTS);
        a2.h(this.b.l());
        a2.c(qpd.b(z42.E(this.b.h())));
        this.b.getClass();
        a2.b(ImmutableMap.of("available_offline_only", Boolean.FALSE));
        return a2.a();
    }

    public u f() {
        u.a a2 = u.a();
        a2.k(MusicPageId.ALBUMS);
        a2.s(Optional.of("spotify:collection:albums"));
        a2.r(this.a.getString(C0707R.string.your_library_music_pages_page_albums_title));
        a2.g(this.a.getString(C0707R.string.your_library_music_pages_page_albums_empty_title));
        a2.h(this.b.k());
        a2.c(qpd.b(z42.E(this.b.g())));
        this.b.getClass();
        a2.b(ImmutableMap.of("available_offline_only", Boolean.FALSE));
        return a2.a();
    }

    public u g() {
        u.a a2 = u.a();
        a2.k(MusicPageId.SONGS);
        a2.s(Optional.of("spotify:collection:tracks"));
        a2.r(this.a.getString(C0707R.string.your_library_music_pages_liked_songs_title));
        a2.g(this.a.getString(C0707R.string.your_library_music_pages_page_songs_empty_title));
        a2.h(this.b.n());
        a2.c(qpd.b(z42.E(this.b.j())));
        this.b.getClass();
        a2.b(ImmutableMap.of("available_offline_only", Boolean.FALSE));
        a2.l(PageAction.SHUFFLE_PLAY);
        a2.m(this.a.getString(C0707R.string.header_shuffle_play));
        a2.q(this.b.o().booleanValue());
        return a2.a();
    }

    public u h() {
        u.a a2 = u.a();
        a2.k(MusicPageId.FOLDER);
        a2.s(Optional.absent());
        a2.r("");
        a2.h(this.b.m());
        a2.c(qpd.b(z42.E(this.b.i())));
        this.b.getClass();
        a2.b(ImmutableMap.of("available_offline_only", Boolean.FALSE));
        a2.e(EmptyPageAction.CREATE_PLAYLIST);
        a2.d(this.a.getString(C0707R.string.your_library_music_pages_button_create_playlist));
        a2.g(this.a.getString(C0707R.string.your_library_music_pages_folder_create_playlist_prompt_description_title));
        a2.f(this.a.getString(C0707R.string.your_library_music_pages_folder_create_playlist_prompt_description_subtitle));
        a2.o(false);
        a2.n(false);
        a2.p(false);
        a2.q(false);
        return a2.a();
    }
}
