package com.spotify.music.features.yourlibrary.musicpages.item;

import android.content.Context;
import com.google.common.base.Joiner;
import com.google.common.base.MoreObjects;
import com.google.common.hash.HashFunction;
import com.google.common.hash.Hashing;
import com.spotify.mobile.android.util.x;
import com.spotify.music.C0707R;
import com.spotify.music.features.yourlibrary.musicpages.e1;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import com.spotify.music.features.yourlibrary.musicpages.item.a;
import com.spotify.music.features.yourlibrary.musicpages.item.b;
import com.spotify.music.features.yourlibrary.musicpages.item.d;
import com.spotify.music.libs.assistedcuration.model.RecsTrack;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.playlist.formatlisttype.FormatListType;
import com.spotify.playlist.models.Covers;
import com.spotify.playlist.models.PlayabilityRestriction;
import com.spotify.playlist.models.f;
import com.spotify.playlist.models.j;
import com.spotify.playlist.models.o;
import com.spotify.playlist.models.offline.a;
import com.spotify.playlist.models.p;
import com.spotify.playlist.models.q;
import java.util.Date;
import java.util.List;

public class m {
    private final Context a;
    private final HashFunction b = Hashing.goodFastHash(64);
    private final boolean c;
    private final boolean d;
    private final boolean e;

    public m(Context context, e1 e1Var) {
        this.a = context;
        this.c = e1Var.q();
        this.d = e1Var.q();
        this.e = e1Var.g();
    }

    private long s(CharSequence charSequence) {
        return this.b.hashUnencodedChars(charSequence).asLong();
    }

    public MusicItem a() {
        MusicItem.b c2 = MusicItem.c();
        MusicItem.Type type = MusicItem.Type.BANNED_ARTISTS;
        c2.q(s(type.toString()));
        c2.p(type);
        c2.r(ViewUris.y1.toString());
        c2.o(this.a.getString(C0707R.string.your_library_music_pages_row_banned_artists_title));
        c2.m(this.a.getString(C0707R.string.your_library_music_pages_row_banned_artists_subtitle));
        return c2.b();
    }

    public MusicItem b() {
        MusicItem.b c2 = MusicItem.c();
        MusicItem.Type type = MusicItem.Type.BANNED_TRACKS;
        c2.q(s(type.toString()));
        c2.p(type);
        c2.r(ViewUris.y1.toString());
        c2.o(this.a.getString(C0707R.string.your_library_music_pages_row_banned_tracks_title));
        c2.m(this.a.getString(C0707R.string.your_library_music_pages_row_banned_tracks_subtitle));
        return c2.b();
    }

    public MusicItem c() {
        MusicItem.b c2 = MusicItem.c();
        MusicItem.Type type = MusicItem.Type.ADD_ARTISTS_BUTTON;
        c2.q(s(type.toString()));
        c2.r(ViewUris.R.toString());
        c2.p(type);
        c2.o(this.a.getString(C0707R.string.your_library_music_pages_button_add_artists));
        return c2.b();
    }

    public MusicItem d(a aVar, String str) {
        MusicItem.b c2 = MusicItem.c();
        MusicItem.Type type = MusicItem.Type.DOWNLOAD_TOGGLE;
        c2.q(s(type.toString()));
        c2.p(type);
        c2.k(aVar);
        c2.r(str);
        return c2.b();
    }

    public MusicItem e(List<va9> list) {
        MusicItem.b c2 = MusicItem.c();
        MusicItem.Type type = MusicItem.Type.FILTER_INDICATOR;
        c2.q(s(type.toString()));
        c2.p(type);
        b.a aVar = new b.a();
        aVar.a(list);
        c2.c(aVar.b());
        return c2.b();
    }

    public MusicItem f() {
        MusicItem.b c2 = MusicItem.c();
        MusicItem.Type type = MusicItem.Type.FILTER_INFO;
        c2.q(s(type.toString()));
        c2.p(type);
        c2.o(this.a.getString(C0707R.string.your_library_music_pages_row_filter_info_title));
        if (!this.e) {
            c2.m(this.a.getString(C0707R.string.your_library_music_pages_row_filter_info_clear_filter_button_label));
        }
        return c2.b();
    }

    public MusicItem g(List<fb9> list) {
        MusicItem.b c2 = MusicItem.c();
        MusicItem.Type type = MusicItem.Type.FILTER_TAGS;
        c2.q(s(type.toString()));
        c2.p(type);
        c2.d(list);
        return c2.b();
    }

    public MusicItem h(String str) {
        MusicItem.b c2 = MusicItem.c();
        MusicItem.Type type = MusicItem.Type.CREATE_PLAYLIST_BUTTON;
        c2.q(s(type.toString()));
        c2.p(type);
        if (str == null) {
            str = "";
        }
        c2.r(str);
        c2.o(this.a.getString(C0707R.string.your_library_music_pages_button_create_playlist));
        return c2.b();
    }

    public MusicItem i(com.spotify.playlist.models.a aVar, boolean z, int i, boolean z2) {
        return MusicItem.e(s(aVar.getUri()), aVar.g(), aVar.c().f(), aVar.getUri(), aVar.getUri(), q.c(aVar.e(), Covers.Size.NORMAL), aVar.b(), i, z, aVar.k(), z2, aVar.i(), aVar.f());
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0049  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.spotify.music.features.yourlibrary.musicpages.item.MusicItem j(com.spotify.playlist.models.b r25, int r26, boolean r27, boolean r28) {
        /*
            r24 = this;
            r0 = r24
            int r1 = r25.g()
            java.lang.String r2 = r25.getUri()
            r3 = r27 ^ 1
            r4 = 1
            java.lang.String r5 = ""
            if (r1 <= 0) goto L_0x003d
            boolean r6 = r0.d
            if (r6 == 0) goto L_0x002b
            android.content.Context r5 = r0.a
            android.content.res.Resources r5 = r5.getResources()
            r6 = 2131886161(0x7f120051, float:1.9406893E38)
            java.lang.Object[] r7 = new java.lang.Object[r4]
            r8 = 0
            java.lang.Integer r9 = java.lang.Integer.valueOf(r1)
            r7[r8] = r9
            java.lang.String r5 = r5.getQuantityString(r6, r1, r7)
        L_0x002b:
            boolean r1 = r0.c
            if (r1 == 0) goto L_0x003d
            java.lang.String r1 = r25.c()
            boolean r6 = com.google.common.base.MoreObjects.isNullOrEmpty(r1)
            if (r6 != 0) goto L_0x003d
            r14 = r1
            r12 = r5
            r7 = 1
            goto L_0x0040
        L_0x003d:
            r14 = r2
            r7 = r3
            r12 = r5
        L_0x0040:
            boolean r1 = r12.isEmpty()
            if (r1 == 0) goto L_0x0049
            com.spotify.music.features.yourlibrary.musicpages.item.MusicItem$Type r1 = com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.Type.ARTIST
            goto L_0x004b
        L_0x0049:
            com.spotify.music.features.yourlibrary.musicpages.item.MusicItem$Type r1 = com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.Type.ARTIST_TWO_LINES
        L_0x004b:
            r6 = r1
            java.lang.String r1 = r25.getUri()
            long r4 = r0.s(r1)
            boolean r8 = r25.j()
            java.lang.String r11 = r25.f()
            java.lang.String r13 = r25.getUri()
            com.spotify.playlist.models.Covers r1 = r25.d()
            com.spotify.playlist.models.Covers$Size r2 = com.spotify.playlist.models.Covers.Size.NORMAL
            java.lang.String r15 = com.spotify.playlist.models.q.c(r1, r2)
            int r16 = r25.b()
            com.spotify.playlist.models.offline.a r19 = r25.h()
            java.lang.String r1 = r25.e()
            com.spotify.music.features.yourlibrary.musicpages.item.MusicItem r2 = com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.a
            fg9 r1 = defpackage.fg9.c(r1)
            com.spotify.music.features.yourlibrary.musicpages.item.i r2 = new com.spotify.music.features.yourlibrary.musicpages.item.i
            r3 = r2
            java.lang.String r21 = r1.d()
            java.util.Date r22 = r1.b()
            r18 = 0
            r20 = 0
            r23 = 0
            r9 = r28
            r10 = r27
            r17 = r26
            r3.<init>(r4, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.features.yourlibrary.musicpages.item.m.j(com.spotify.playlist.models.b, int, boolean, boolean):com.spotify.music.features.yourlibrary.musicpages.item.MusicItem");
    }

    public MusicItem k(f fVar, int i) {
        String str;
        int e2 = fVar.e();
        int d2 = fVar.d();
        if (e2 > 0 && d2 > 0) {
            str = this.a.getString(C0707R.string.your_library_music_pages_row_folder_combined_subtitle, this.a.getResources().getQuantityString(C0707R.plurals.your_library_music_pages_row_folder_subtitle, e2, Integer.valueOf(e2)), this.a.getResources().getQuantityString(C0707R.plurals.your_library_music_pages_row_folder_folders_count_subtitle, d2, Integer.valueOf(d2)));
        } else if (d2 > 0) {
            str = this.a.getResources().getQuantityString(C0707R.plurals.your_library_music_pages_row_folder_folders_count_subtitle, d2, Integer.valueOf(d2));
        } else {
            str = this.a.getResources().getQuantityString(C0707R.plurals.your_library_music_pages_row_folder_subtitle, e2, Integer.valueOf(e2));
        }
        String f = fVar.f();
        fg9 c2 = fg9.c(fVar.b());
        long s = s(f);
        String c3 = fVar.c();
        int a2 = fVar.a();
        Date b2 = c2.b();
        String d3 = c2.d();
        MusicItem musicItem = MusicItem.a;
        return new i(s, MusicItem.Type.FOLDER, true, false, false, false, c3, str, f, f, "", a2, i, null, null, null, d3, b2, null);
    }

    public MusicItem l(j jVar, boolean z, int i) {
        String string;
        fg9 c2 = fg9.c(jVar.h());
        long s = s(jVar.getUri());
        boolean t = jVar.t();
        String j = jVar.j();
        if (jVar.g() == null || !FormatListType.q.d(jVar.g())) {
            p i2 = jVar.i();
            String a2 = i2 != null ? i2.a() : null;
            if (!MoreObjects.isNullOrEmpty(a2)) {
                string = this.a.getString(C0707R.string.personalized_sets_subtitle_made_for, a2);
            } else {
                p m = jVar.m();
                if (m == null) {
                    string = "";
                } else {
                    string = this.a.getString(C0707R.string.your_library_music_pages_row_playlist_subtitle, m.a());
                }
            }
        } else {
            string = this.a.getResources().getQuantityString(C0707R.plurals.your_library_music_pages_row_favorite_songs_subtitle, jVar.o(), Integer.valueOf(jVar.o()));
        }
        String uri = jVar.getUri();
        String uri2 = jVar.getUri();
        String c3 = q.c(jVar.c(), Covers.Size.NORMAL);
        int b2 = jVar.b();
        boolean z2 = z || (jVar.v() != null && jVar.v().booleanValue());
        a k = jVar.k();
        Date b3 = c2.b();
        String d2 = c2.d();
        MusicItem musicItem = MusicItem.a;
        return new i(s, MusicItem.Type.PLAYLIST, true, t, false, false, j, string, uri, uri2, c3, b2, i, Boolean.valueOf(z2), k, null, d2, b3, null);
    }

    public MusicItem m(o oVar, String str, boolean z, boolean z2, boolean z3, int i) {
        MusicItem.Type type = z ? MusicItem.Type.TRACK : MusicItem.Type.TRACK_SHUFFLE_ONLY;
        String d2 = x.d(oVar);
        fg9 c2 = fg9.c(oVar.getGroupLabel());
        long s = s(oVar.getUri());
        String name = oVar.getName();
        String uri = oVar.getUri();
        String uri2 = oVar.getUri();
        String e2 = q.e(oVar, Covers.Size.NORMAL);
        int addTime = oVar.getAddTime();
        a offlineState = oVar.getOfflineState();
        boolean isInCollection = oVar.isInCollection();
        boolean isBanned = oVar.isBanned();
        boolean isExplicit = oVar.isExplicit();
        boolean is19plus = oVar.getIs19plus();
        PlayabilityRestriction playabilityRestriction = oVar.getPlayabilityRestriction();
        boolean isCurrentlyPlayable = oVar.isCurrentlyPlayable();
        boolean isLocal = oVar.isLocal();
        String previewId = oVar.getPreviewId();
        String d3 = c2.d();
        Date b2 = c2.b();
        MusicItem musicItem = MusicItem.a;
        return new i(s, type, true, false, false, false, name, d2, uri, uri2, e2, addTime, i, null, offlineState, new l(isInCollection, isBanned, z2, z3, isExplicit, is19plus, playabilityRestriction, isCurrentlyPlayable, false, isLocal, previewId, str), d3, b2, null);
    }

    public MusicItem n(com.spotify.playlist.models.a aVar, boolean z, int i, boolean z2) {
        return MusicItem.e(s(aVar.getUri()), aVar.g(), aVar.c().f(), aVar.getUri(), aVar.getUri(), q.c(aVar.e(), Covers.Size.NORMAL), aVar.b(), i, z, aVar.k(), z2, aVar.i(), null);
    }

    public MusicItem o(RecsTrack recsTrack, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i) {
        MusicItem musicItem = MusicItem.a;
        a.b bVar = new a.b();
        bVar.g(-1);
        bVar.q(s(recsTrack.uri() + ":recommended"));
        bVar.p(z ? MusicItem.Type.TRACK_SHUFFLE_ONLY : MusicItem.Type.TRACK);
        bVar.o(recsTrack.name());
        bVar.m(Joiner.on(", ").join(recsTrack.artistNames()));
        bVar.r(recsTrack.uri());
        bVar.n(recsTrack.uri());
        bVar.f(recsTrack.image());
        bVar.a(0);
        bVar.j(null);
        d.b bVar2 = new d.b();
        bVar2.m(str);
        bVar2.g(z2);
        bVar2.a(z3);
        bVar2.d(z4);
        bVar2.c(z5);
        bVar2.f(recsTrack.isExplicit());
        bVar2.h(false);
        bVar2.j(PlayabilityRestriction.UNKNOWN);
        bVar2.e(z6);
        bVar2.l(true);
        bVar2.k(recsTrack.previewId());
        bVar2.i(false);
        bVar.c(bVar2.b());
        bVar.g(i);
        bVar.h(true);
        bVar.e(false);
        bVar.l(false);
        bVar.i(false);
        return bVar.b();
    }

    public MusicItem p(String str, int i, boolean z, com.spotify.playlist.models.offline.a aVar, boolean z2) {
        String str2;
        boolean z3 = true;
        boolean z4 = i == 0;
        MusicItem.Type type = z4 ? MusicItem.Type.LIKED_SONGS_EMPTY : MusicItem.Type.LIKED_SONGS;
        if (z) {
            str2 = "";
        } else if (z4) {
            str2 = this.a.getString(C0707R.string.your_library_music_pages_row_favorite_songs_empty_subtitle);
        } else {
            str2 = this.a.getResources().getQuantityString(C0707R.plurals.your_library_music_pages_row_favorite_songs_subtitle, i, Integer.valueOf(i));
        }
        MusicItem.b c2 = MusicItem.c();
        c2.q(s(type.toString()));
        c2.p(type);
        if (!z2 && !z4) {
            z3 = false;
        }
        c2.j(Boolean.valueOf(z3));
        c2.n(str);
        c2.o(this.a.getString(C0707R.string.your_library_music_pages_liked_songs_title));
        c2.m(str2);
        c2.k(aVar);
        return c2.b();
    }

    public MusicItem q(String str, String str2, String str3, boolean z, boolean z2, String str4) {
        MusicItem.b c2 = MusicItem.c();
        StringBuilder sb = new StringBuilder();
        MusicItem.Type type = MusicItem.Type.SECTION_HEADER_CUSTOM;
        sb.append(type);
        sb.append(str);
        c2.q(s(sb.toString()));
        c2.p(type);
        c2.o(str2);
        c2.m(str3);
        MusicItem.f.a a2 = MusicItem.f.a();
        a2.c(z);
        a2.e(z2);
        a2.d(str4);
        c2.c(a2.a());
        return c2.b();
    }

    public MusicItem r(String str, String str2, String str3, String str4, String str5, String str6) {
        MusicItem.b c2 = MusicItem.c();
        StringBuilder sb = new StringBuilder();
        MusicItem.Type type = MusicItem.Type.SECTION_HEADER_WITH_BUTTON;
        sb.append(type);
        sb.append(str);
        c2.q(s(sb.toString()));
        c2.p(type);
        c2.o(str2);
        MusicItem.f.a a2 = MusicItem.f.a();
        a2.b(str3);
        a2.h(str4);
        a2.g(str5);
        a2.f(str6);
        c2.c(a2.a());
        return c2.b();
    }

    public MusicItem t(String str, int i) {
        String str2;
        if (i == 0) {
            str2 = this.a.getString(C0707R.string.your_library_music_pages_row_your_episodes_subtitle_empty);
        } else {
            str2 = this.a.getResources().getQuantityString(C0707R.plurals.your_library_music_pages_row_your_episodes_subtitle, i, Integer.valueOf(i));
        }
        MusicItem.b c2 = MusicItem.c();
        MusicItem.Type type = MusicItem.Type.YOUR_EPISODES;
        c2.q(s(type.toString()));
        c2.p(type);
        c2.n(str);
        c2.o(this.a.getString(C0707R.string.your_episodes_title));
        c2.m(str2);
        return c2.b();
    }
}
