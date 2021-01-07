package com.spotify.music.nowplaying.drivingmode.presenter.pivot;

import android.content.res.Resources;
import android.text.TextUtils;
import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.mobile.android.util.x;
import com.spotify.music.C0707R;
import com.spotify.music.nowplaying.core.navcontext.j;
import com.spotify.music.nowplaying.drivingmode.presenter.pivot.i0;
import com.spotify.player.model.PlayerState;
import com.spotify.playlist.endpoints.d;
import com.spotify.playlist.endpoints.policy.playlist.DecorationPolicy;
import com.spotify.playlist.endpoints.policy.playlist.HeaderPolicy;
import com.spotify.playlist.endpoints.policy.playlist.ListPolicy;
import com.spotify.playlist.endpoints.policy.playlist.Policy;
import com.spotify.playlist.models.p;
import io.reactivex.s;
import io.reactivex.z;

public class o0 {
    private final j a;
    private final Resources b;
    private final boolean c;
    private final k0 d;
    private final d e;
    private final d.b f;
    private final hna g;
    private final boolean h;

    public o0(j jVar, Resources resources, boolean z, k0 k0Var, d dVar, HeaderPolicy headerPolicy, ina ina, boolean z2) {
        this.a = jVar;
        this.b = resources;
        this.c = z;
        this.d = k0Var;
        this.e = dVar;
        hna b2 = ina.create();
        this.g = b2;
        b2.g(true);
        this.h = z2;
        ListPolicy.a builder = ListPolicy.builder();
        builder.d(ImmutableMap.of());
        builder.b(ImmutableMap.of());
        builder.c(ImmutableMap.of());
        builder.g(ImmutableMap.of());
        ListPolicy e2 = builder.e();
        DecorationPolicy.a builder2 = DecorationPolicy.builder();
        builder2.b(headerPolicy);
        builder2.c(e2);
        DecorationPolicy a2 = builder2.a();
        Policy.a builder3 = Policy.builder();
        builder3.b(a2);
        Policy a3 = builder3.a();
        d.b.a b3 = d.b.b();
        b3.i(new qxd(0, 0));
        b3.g(a3);
        this.f = b3.b();
    }

    private s<r0> a(String str, String str2) {
        i0.b bVar = new i0.b();
        bVar.d(str2);
        i0.b bVar2 = bVar;
        bVar2.c(g(str, null));
        i0.b bVar3 = bVar2;
        bVar3.b(this.d.a(null, str));
        return s.i0(bVar3.a());
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0019  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.spotify.music.nowplaying.drivingmode.presenter.pivot.PivotSubtitleIcon g(java.lang.String r4, com.spotify.playlist.models.j r5) {
        /*
            r3 = this;
            boolean r0 = r3.c
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0007
            goto L_0x0016
        L_0x0007:
            if (r5 == 0) goto L_0x0016
            com.spotify.playlist.models.offline.a r0 = r5.k()
            r0.getClass()
            boolean r0 = r0 instanceof com.spotify.playlist.models.offline.a.C0377a
            if (r0 == 0) goto L_0x0016
            r0 = 1
            goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            if (r0 == 0) goto L_0x001c
            com.spotify.music.nowplaying.drivingmode.presenter.pivot.PivotSubtitleIcon r4 = com.spotify.music.nowplaying.drivingmode.presenter.pivot.PivotSubtitleIcon.DOWNLOADED
            return r4
        L_0x001c:
            if (r4 != 0) goto L_0x001f
            goto L_0x002e
        L_0x001f:
            com.spotify.music.nowplaying.drivingmode.presenter.pivot.k0 r0 = r3.d
            boolean r4 = r0.a(r5, r4)
            if (r4 != 0) goto L_0x002c
            boolean r4 = r3.c
            if (r4 != 0) goto L_0x002c
            goto L_0x002d
        L_0x002c:
            r1 = 0
        L_0x002d:
            r2 = r1
        L_0x002e:
            if (r2 == 0) goto L_0x0033
            com.spotify.music.nowplaying.drivingmode.presenter.pivot.PivotSubtitleIcon r4 = com.spotify.music.nowplaying.drivingmode.presenter.pivot.PivotSubtitleIcon.SHUFFLE
            return r4
        L_0x0033:
            com.spotify.music.nowplaying.drivingmode.presenter.pivot.PivotSubtitleIcon r4 = com.spotify.music.nowplaying.drivingmode.presenter.pivot.PivotSubtitleIcon.NONE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.nowplaying.drivingmode.presenter.pivot.o0.g(java.lang.String, com.spotify.playlist.models.j):com.spotify.music.nowplaying.drivingmode.presenter.pivot.PivotSubtitleIcon");
    }

    public z<String> b(String str) {
        return this.g.e(null, str).A(new y(str)).E(new a0(str));
    }

    public s<r0> c(String str) {
        String str2;
        String str3;
        if (!this.h) {
            i0.b bVar = new i0.b();
            bVar.d("");
            i0.b bVar2 = bVar;
            bVar2.c(PivotSubtitleIcon.NONE);
            i0.b bVar3 = bVar2;
            bVar3.b(false);
            return s.i0(bVar3.a());
        }
        LinkType q = l0.z(str).q();
        if (x.i(l0.z(str))) {
            if (q.ordinal() != 101) {
                str3 = this.b.getString(C0707R.string.radio_title);
            } else {
                str3 = this.b.getString(C0707R.string.driving_made_for_you);
            }
            return a(str, str3);
        } else if (q == LinkType.PLAYLIST_V2 || q == LinkType.PROFILE_PLAYLIST) {
            return this.e.a(str, this.f).j0(a.a).j0(new z(this, str));
        } else {
            if (x.e(q)) {
                str2 = this.b.getString(C0707R.string.collection_title_your_library);
            } else {
                int ordinal = q.ordinal();
                if (ordinal == 6) {
                    str2 = this.b.getString(C0707R.string.album_title_default);
                } else if (ordinal != 14) {
                    if (ordinal != 231) {
                        if (ordinal == 237 || ordinal == 246) {
                            str2 = this.b.getString(C0707R.string.driving_podcast_subtitle);
                        } else if (ordinal != 273) {
                            str2 = this.b.getString(C0707R.string.driving_fallback_suggested_music);
                        }
                    }
                    str2 = this.b.getString(C0707R.string.driving_track_subtitle);
                } else {
                    str2 = this.b.getString(C0707R.string.artist_default_title);
                }
            }
            return a(str, str2);
        }
    }

    public String d(PlayerState playerState) {
        String str;
        PlayerTrack b2 = ixd.b(playerState.track().get());
        if (fvb.A(b2) || PlayerTrackUtil.isSuggestedTrack(b2)) {
            str = playerState.contextMetadata().get("context_description");
        } else {
            str = this.a.a(playerState).c(this.b);
        }
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        LinkType q = l0.z(playerState.contextUri()).q();
        if (!fvb.A(b2)) {
            if (q == LinkType.TRACK) {
                return b2.metadata().get("title");
            }
            if (q == LinkType.ARTIST) {
                return b2.metadata().get("artist_name");
            }
            if (q == LinkType.ALBUM) {
                return b2.metadata().get("album_title");
            }
            if (q == LinkType.GENRE_RADIO) {
                return this.b.getString(C0707R.string.driving_genre_radio_fallback_title);
            }
        }
        return this.b.getString(C0707R.string.driving_fallback_suggested_music);
    }

    public boolean e(String str) {
        return l0.z(str).q() == LinkType.COLLECTION_PODCASTS_EPISODES || l0.z(str).q() == LinkType.COLLECTION_PODCASTS_DOWNLOADS;
    }

    public r0 f(String str, com.spotify.playlist.models.j jVar) {
        i0.b bVar = new i0.b();
        StringBuilder sb = new StringBuilder(50);
        p i = jVar.i();
        p m = jVar.m();
        if (i != null && !TextUtils.isEmpty(i.f())) {
            sb.append(this.b.getString(C0707R.string.driving_made_for_you));
        } else if (m != null && !TextUtils.isEmpty(m.a())) {
            sb.append(this.b.getString(C0707R.string.driving_playlist_owner_subtitle, m.a()));
        }
        bVar.d(sb.toString());
        bVar.c(g(str, jVar));
        bVar.b(this.d.a(jVar, str));
        return bVar.a();
    }
}
