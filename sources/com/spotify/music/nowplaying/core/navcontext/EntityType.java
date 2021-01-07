package com.spotify.music.nowplaying.core.navcontext;

import com.spotify.music.C0707R;
import com.spotify.music.libs.viewuri.ViewUris;
import java.util.HashMap;
import java.util.Map;

public enum EntityType {
    UNKNOWN(0, 0),
    ADVERTISEMENT(C0707R.string.player_radio_advertisement_by, 0),
    ALBUM(C0707R.string.context_type_description_album, 0),
    ARTIST(C0707R.string.context_type_description_artist, 0),
    ACTIVITY(C0707R.string.context_type_description_activity, C0707R.string.activity_feed_nav_title),
    ALBUM_RADIO(C0707R.string.context_type_description_album_radio, 0),
    ARTIST_RADIO(C0707R.string.context_type_description_artist_radio, 0),
    BROWSE(C0707R.string.context_type_description_browse, 0),
    CHARTS(C0707R.string.context_type_description_chart, 0),
    DAILY_MIX(C0707R.string.context_type_description_daily_mix, 0),
    FOLLOW_FEED(C0707R.string.context_type_description_follow_feed, C0707R.string.follow_feed_feature_title),
    GENRE_RADIO(C0707R.string.context_type_description_genre_radio, 0),
    IMAGE_RECS(C0707R.string.context_type_description_image_recs, 0),
    INTERRUPTION(C0707R.string.sas_interruption_title, 0),
    LOCAL_FILES(C0707R.string.context_type_description_collection, C0707R.string.local_files_title),
    NEW_MUSIC_TUESDAY(C0707R.string.context_type_description_album, 0),
    PLAY_QUEUE(C0707R.string.context_type_description_play_queue, 0),
    PLAYLIST(C0707R.string.context_type_description_playlist, 0),
    PLAYLIST_FOLDER(C0707R.string.context_type_description_folder, 0),
    PLAYLIST_RADIO(C0707R.string.context_type_description_playlist_radio, 0),
    PROFILE(C0707R.string.context_type_description_profile, 0),
    RADIO(C0707R.string.context_type_description_radio, 0),
    SEARCH(C0707R.string.context_type_description_search, 0),
    SHOW(C0707R.string.context_type_description_show, 0),
    SHOW_VIDEO(C0707R.string.context_type_description_show_video, 0),
    HOME(C0707R.string.context_type_description_start_page, 0),
    SUGGESTED_TRACK(C0707R.string.context_type_description_suggested_track, 0),
    TRACK(C0707R.string.context_type_description_track, 0),
    TRACK_RADIO(C0707R.string.context_type_description_track_radio, 0),
    YOUR_LIBRARY(C0707R.string.context_type_description_collection_your_library, C0707R.string.collection_liked_songs_title),
    YOUR_LIBRARY_ALBUM(C0707R.string.context_type_description_collection_your_library, 0),
    YOUR_LIBRARY_ARTIST(C0707R.string.context_type_description_collection_your_library, 0),
    YOUR_LIBRARY_TRACKS(C0707R.string.context_type_description_collection_your_library, C0707R.string.collection_liked_songs_title),
    YOUR_LIBRARY_PODCAST_DOWNLOADS(C0707R.string.context_type_description_collection_your_library, C0707R.string.collection_podcasts_tab_downloads),
    YOUR_LIBRARY_PODCAST_EPISODES(C0707R.string.context_type_description_collection_your_library, C0707R.string.collection_podcasts_tab_episodes),
    YOUR_LIBRARY_PODCAST_FOLLOWING(C0707R.string.context_type_description_collection_your_library, C0707R.string.collection_podcasts_tab_shows),
    YOUR_MUSIC(C0707R.string.context_type_description_collection, C0707R.string.collection_start_songs_title),
    YOUR_MUSIC_ALBUM(C0707R.string.context_type_description_collection, 0),
    YOUR_MUSIC_ARTIST(C0707R.string.context_type_description_collection, 0),
    YOUR_MUSIC_TRACKS(C0707R.string.context_type_description_collection, C0707R.string.collection_start_songs_title),
    YOUR_MUSIC_OFFLINED_EPISODES(C0707R.string.context_type_description_collection, C0707R.string.collection_episodes_offlined_title),
    YOUR_MUSIC_UNPLAYED_EPISODES(C0707R.string.context_type_description_collection, C0707R.string.collection_episodes_unheard_title);
    
    private static final Map<String, EntityType> Z;
    private final ksb mSubtitleHolder;
    private final ksb mTitleHolder;

    static {
        EntityType entityType;
        EntityType entityType2;
        EntityType entityType3;
        EntityType entityType4;
        EntityType entityType5;
        EntityType entityType6;
        EntityType entityType7;
        EntityType entityType8;
        EntityType entityType9;
        EntityType entityType10;
        EntityType entityType11;
        EntityType entityType12;
        EntityType entityType13;
        EntityType entityType14;
        EntityType entityType15;
        EntityType entityType16;
        EntityType entityType17;
        EntityType entityType18;
        HashMap hashMap = new HashMap();
        Z = hashMap;
        hashMap.put("album", entityType);
        hashMap.put("com.spotify.feature.album", entityType);
        hashMap.put(kfd.d.getName(), entityType2);
        hashMap.put("com.spotify.feature.artist", entityType2);
        hashMap.put("chart", entityType5);
        hashMap.put("discover-weekly", entityType11);
        hashMap.put("library-collection", entityType16);
        hashMap.put("library-collection-album", entityType17);
        hashMap.put("library-collection-artist", entityType18);
        hashMap.put("library-collection-missing-album", entityType);
        hashMap.put("localfiles", entityType8);
        hashMap.put(kfd.L0.getName(), entityType11);
        hashMap.put("playlistfolder", entityType12);
        hashMap.put("playlists", entityType12);
        hashMap.put("playqueue", entityType10);
        hashMap.put("profile", entityType13);
        hashMap.put("search", entityType14);
        hashMap.put("com.spotify.feature.search", entityType14);
        hashMap.put("com.spotify.feature.profile", entityType13);
        hashMap.put("social-feed", entityType3);
        hashMap.put("com.spotify.feature.browse", entityType4);
        hashMap.put("com.spotify.feature.newmusictuesday", entityType9);
        hashMap.put("com.spotify.feature.chart", entityType5);
        hashMap.put("com.spotify.feature.home", entityType15);
        hashMap.put(kfd.q0.getName(), entityType15);
        hashMap.put(kfd.k1.getName(), entityType11);
        hashMap.put(kfd.d0.getName(), entityType6);
        hashMap.put(kfd.v0.getName(), entityType7);
    }

    private EntityType(int i, int i2) {
        this.mTitleHolder = new lsb(i);
        this.mSubtitleHolder = new lsb(i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0077  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.spotify.music.nowplaying.core.navcontext.EntityType d(com.spotify.player.model.PlayerState r4) {
        /*
        // Method dump skipped, instructions count: 354
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.nowplaying.core.navcontext.EntityType.d(com.spotify.player.model.PlayerState):com.spotify.music.nowplaying.core.navcontext.EntityType");
    }

    static EntityType g(String str) {
        EntityType entityType = UNKNOWN;
        if (ViewUris.P0.a(str)) {
            return ALBUM;
        }
        if (ViewUris.D0.a(str)) {
            return GENRE_RADIO;
        }
        if (ViewUris.A0.a(str)) {
            return ARTIST_RADIO;
        }
        if (ViewUris.B0.a(str)) {
            return ALBUM_RADIO;
        }
        if (ViewUris.C0.a(str)) {
            return TRACK_RADIO;
        }
        if (ViewUris.E0.a(str)) {
            return PLAYLIST_RADIO;
        }
        if (ViewUris.c.b(str)) {
            return RADIO;
        }
        if (ViewUris.y0.a(str)) {
            return GENRE_RADIO;
        }
        if (ViewUris.v0.a(str)) {
            return ARTIST_RADIO;
        }
        if (ViewUris.w0.a(str)) {
            return ALBUM_RADIO;
        }
        if (ViewUris.x0.a(str)) {
            return TRACK_RADIO;
        }
        if (ViewUris.z0.a(str)) {
            return PLAYLIST_RADIO;
        }
        if (ViewUris.t0.a(str)) {
            return DAILY_MIX;
        }
        if (ViewUris.r0.a(str)) {
            return RADIO;
        }
        if (ViewUris.R0.a(str)) {
            return ARTIST;
        }
        if (ViewUris.G0.a(str) || ViewUris.N0.a(str) || ViewUris.M0.a(str)) {
            return PLAYLIST;
        }
        if (ViewUris.O0.a(str)) {
            return PLAYLIST_FOLDER;
        }
        if (ViewUris.o0.a(str)) {
            return SEARCH;
        }
        if (ViewUris.r1.a(str)) {
            return YOUR_MUSIC_ALBUM;
        }
        if (ViewUris.l1.b(str) || ViewUris.m1.a(str)) {
            return YOUR_MUSIC;
        }
        if (ViewUris.s1.a(str)) {
            return YOUR_MUSIC_ARTIST;
        }
        if (ViewUris.t1.b(str)) {
            return YOUR_MUSIC_TRACKS;
        }
        if (ViewUris.w1.b(str)) {
            return YOUR_LIBRARY_PODCAST_DOWNLOADS;
        }
        if (ViewUris.v1.b(str)) {
            return YOUR_LIBRARY_PODCAST_EPISODES;
        }
        if (ViewUris.u1.b(str)) {
            return YOUR_LIBRARY_PODCAST_FOLLOWING;
        }
        if (ViewUris.d.b(str)) {
            return HOME;
        }
        if (ViewUris.e.b(str)) {
            return FOLLOW_FEED;
        }
        if (ViewUris.E2.b(str)) {
            return IMAGE_RECS;
        }
        return entityType;
    }

    public ksb h() {
        return this.mSubtitleHolder;
    }

    public ksb i() {
        return this.mTitleHolder;
    }
}
