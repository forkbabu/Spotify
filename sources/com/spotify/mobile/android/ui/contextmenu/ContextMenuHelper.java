package com.spotify.mobile.android.ui.contextmenu;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.m;
import androidx.lifecycle.w;
import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.spotify.android.glue.patterns.contextmenu.model.ContextMenuViewModel;
import com.spotify.android.glue.patterns.contextmenu.model.c;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.foundation.R;
import com.spotify.encore.mobile.snackbar.SnackbarConfiguration;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.recentlyplayed.RecentlyPlayedService;
import com.spotify.mobile.android.shortcut.ShortcutInstallerService;
import com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.mobile.android.video.i0;
import com.spotify.music.C0707R;
import com.spotify.music.features.addtoplaylist.d;
import com.spotify.music.features.editplaylist.g;
import com.spotify.music.follow.j;
import com.spotify.music.libs.collection.util.AlbumCollectionState;
import com.spotify.music.libs.viewartistscontextmenu.ui.ViewArtistsContextMenuDialogFragment;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;
import com.spotify.music.playlist.service.b;
import com.spotify.music.sleeptimer.n;
import com.spotify.music.sleeptimer.s;
import com.spotify.music.spotlets.offline.util.OffliningLogger;
import com.spotify.music.spotlets.offline.util.e;
import com.spotify.music.spotlets.radio.formatlist.RadioFormatListService;
import com.spotify.music.ubi.interactions.InteractionAction;
import com.spotify.music.z0;
import com.spotify.playlist.models.Covers;
import com.spotify.playlist.models.offline.a;
import com.spotify.playlist.models.q;
import com.spotify.share.sharedata.r;
import com.spotify.ubi.specification.factories.s0;
import defpackage.ij9;
import defpackage.t8a;
import io.reactivex.disposables.a;
import io.reactivex.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.f;

public class ContextMenuHelper implements m {
    private final OffliningLogger A;
    private final g B;
    private final d C;
    private final com.spotify.music.features.renameplaylist.d D;
    private final xec E;
    private final vxc F;
    private final t8b G;
    private final kzc H;
    private final t8a I;
    protected final a J = new a();
    private final ih0 K;
    private final ere L;
    private final bre M;
    private final ij9.b N;
    private final z0 O;
    private final b P;
    private final com.spotify.music.libs.yourlibraryx.pin.a Q;
    private final r9b a;
    private final SnackbarManager b;
    private final jz1 c;
    private final fm9 f;
    private final com.spotify.music.follow.m n;
    private final n o;
    private final cqe p;
    private final nsb q;
    private final vka r;
    private final Activity s;
    private final com.spotify.music.navigation.b t;
    private final ajf<caa> u;
    private final ifd v;
    private final c w;
    private final ContextMenuViewModel x;
    private final s3 y;
    private final com.spotify.android.flags.c z;

    public enum ItemType {
        AUDIO_PODCAST,
        VIDEO_PODCAST,
        TRACK_OR_ALBUM_OR_EPISODE
    }

    ContextMenuHelper(r9b r9b, g22 g22, SnackbarManager snackbarManager, jz1 jz1, fm9 fm9, com.spotify.music.follow.m mVar, n nVar, cqe cqe, nsb nsb, vka vka, Activity activity, com.spotify.music.navigation.b bVar, d dVar, g gVar, com.spotify.music.features.renameplaylist.d dVar2, xec xec, vxc vxc, t8b t8b, ajf<caa> ajf, kzc kzc, e eVar, t8a.a aVar, ih0 ih0, ere ere, bre bre, ifd ifd, ij9.b bVar2, c cVar, z0 z0Var, b.a aVar2, ContextMenuViewModel contextMenuViewModel, s3 s3Var, com.spotify.android.flags.c cVar2, com.spotify.music.libs.yourlibraryx.pin.a aVar3) {
        this.a = r9b;
        this.b = snackbarManager;
        this.c = jz1;
        this.f = fm9;
        this.n = mVar;
        this.o = nVar;
        this.p = cqe;
        this.q = nsb;
        this.r = vka;
        this.s = activity;
        this.u = ajf;
        this.t = bVar;
        this.v = ifd;
        this.w = cVar;
        this.x = contextMenuViewModel;
        this.y = s3Var;
        this.z = cVar2;
        this.A = eVar.b(cVar);
        this.B = gVar;
        this.C = dVar;
        this.D = dVar2;
        this.E = xec;
        this.F = vxc;
        this.G = t8b;
        this.H = kzc;
        this.I = aVar.a(cVar);
        this.K = ih0;
        this.M = bre;
        this.L = ere;
        this.N = bVar2;
        this.O = z0Var;
        this.P = aVar2.a(activity);
        this.Q = aVar3;
    }

    private void B(String str, com.spotify.android.glue.patterns.contextmenu.model.e eVar, com.spotify.android.glue.patterns.contextmenu.model.d dVar) {
        SpotifyIconV2 spotifyIconV2 = SpotifyIconV2.DOWNLOAD;
        int i = R.color.green_light;
        Activity activity = this.s;
        a(C0707R.id.context_menu_download, C0707R.string.context_menu_undownload, l70.j(activity, spotifyIconV2, androidx.core.content.a.b(activity, i))).n(new i0(this, ContextMenuEvent.UNDOWNLOAD, str, false, eVar), dVar);
    }

    private com.spotify.android.glue.patterns.contextmenu.model.b a(int i, int i2, Drawable drawable) {
        return this.x.b(i, this.s.getText(i2), drawable);
    }

    private com.spotify.android.glue.patterns.contextmenu.model.b b(int i, int i2, SpotifyIconV2 spotifyIconV2) {
        return this.x.b(i, this.s.getText(i2), l70.i(this.s, spotifyIconV2));
    }

    private void o1(ContextMenuEvent contextMenuEvent, String str, InteractionAction interactionAction) {
        m91 m91;
        this.y.a(contextMenuEvent);
        if (interactionAction != null) {
            m91 = new ga1(null, this.v.toString(), this.w.toString(), "context-menu", -1, str, "hit", contextMenuEvent.toString(), (double) this.p.d(), interactionAction.d());
        } else {
            m91 = new fa1(null, this.v.toString(), this.w.toString(), "context-menu", -1, str, "hit", contextMenuEvent.toString(), (double) this.p.d());
        }
        this.c.a(m91);
    }

    private void q1(int i) {
        r1(SnackbarConfiguration.builder(i));
    }

    private void r1(SnackbarConfiguration.Builder builder) {
        SnackbarConfiguration build = builder.build();
        if (this.b.isAttached()) {
            this.b.show(build);
        } else {
            this.b.showOnNextAttach(build);
        }
    }

    private void s(String str, com.spotify.android.glue.patterns.contextmenu.model.e eVar, com.spotify.android.glue.patterns.contextmenu.model.d dVar) {
        SpotifyIconV2 spotifyIconV2 = SpotifyIconV2.DOWNLOAD;
        int i = R.color.gray_50;
        Activity activity = this.s;
        a(C0707R.id.context_menu_download, C0707R.string.context_menu_download, l70.j(activity, spotifyIconV2, androidx.core.content.a.b(activity, i))).n(new i0(this, ContextMenuEvent.DOWNLOAD, str, true, eVar), dVar);
    }

    private void s1(String str) {
        r1(SnackbarConfiguration.builder(str));
    }

    private void t1(int i, int i2, View.OnClickListener onClickListener) {
        r1(SnackbarConfiguration.builder(i).actionText(this.s.getString(i2)).onClickListener(onClickListener));
    }

    public void A(PlayerTrack playerTrack, s0 s0Var) {
        b(C0707R.id.context_menu_queue_track_or_album, C0707R.string.context_menu_add_to_queue, SpotifyIconV2.ADD_TO_QUEUE).o(new k(this, s0Var, playerTrack));
    }

    public /* synthetic */ void A0(String str, boolean z2, boolean z3, com.spotify.android.glue.patterns.contextmenu.model.b bVar) {
        this.n.e(str, z2);
        o1(z2 ? ContextMenuEvent.FOLLOW : ContextMenuEvent.UNFOLLOW, str, null);
        if (z2) {
            t1(C0707R.string.toast_liked_artist, C0707R.string.player_toastie_undo, new j1(this, z3, str));
        } else {
            t1(C0707R.string.toast_ok_got_it, C0707R.string.player_toastie_undo, new c1(this, str));
        }
    }

    public /* synthetic */ void B0(String str, com.spotify.android.glue.patterns.contextmenu.model.b bVar) {
        this.J.b(this.Q.b(str).subscribe());
    }

    public void C(String str, s0 s0Var) {
        b(C0707R.id.context_menu_remove_from_your_episodes, C0707R.string.context_menu_remove_from_your_episodes, SpotifyIconV2.BLOCK).n(new m1(this, str, C0707R.string.snackbar_removed_from_your_episodes, C0707R.string.snackbar_removed_from_your_episodes_error), new a0(s0Var, str));
    }

    public /* synthetic */ void C0(String str, com.spotify.android.glue.patterns.contextmenu.model.b bVar) {
        o1(ContextMenuEvent.SHOW_PROMO_DISCLOSURE, str, null);
        this.F.a();
    }

    public void D(String str, String str2, LinkType linkType, s0 s0Var) {
        if (!(linkType == LinkType.TRACK || linkType == LinkType.SHOW_EPISODE || linkType == LinkType.SHOW_EPISODE_TIMESTAMP)) {
            Assertion.p("Unsupported link type " + linkType);
        }
        SpotifyIconV2 spotifyIconV2 = SpotifyIconV2.BLOCK;
        int i = R.color.gray_50;
        Activity activity = this.s;
        a(C0707R.id.context_menu_remove_item_from_playlist, C0707R.string.context_menu_remove_item_from_playlist, l70.j(activity, spotifyIconV2, androidx.core.content.a.b(activity, i))).n(new w(this, str, str2), new s(s0Var, str2));
    }

    public /* synthetic */ void D0(s0 s0Var, String str, com.spotify.android.glue.patterns.contextmenu.model.b bVar) {
        nqe a2 = s0Var.c().a(str);
        this.L.a(a2);
        o1(ContextMenuEvent.ADD_TO_QUEUE, str, null);
        com.spotify.music.promodisclosure.impl.e.a(this.s, str, this.M, a2);
    }

    public void E(String str, String str2, s0 s0Var) {
        int i;
        l0 z2 = l0.z(str2);
        int ordinal = z2.q().ordinal();
        if (ordinal == 64) {
            i = C0707R.string.context_menu_delete_folder;
        } else if (ordinal == 185 || ordinal == 210 || ordinal == 272) {
            i = C0707R.string.context_menu_delete_playlist;
        } else {
            StringBuilder V0 = je.V0("Trying to add 'Remove Playlist or Folder' for other link type: ");
            V0.append(z2.q());
            Assertion.p(V0.toString());
            i = -1;
        }
        Assertion.j("Unsupported uri type.", i > -1);
        b(C0707R.id.context_menu_delete_playlist, i, SpotifyIconV2.X).n(new x1(this, str2, str), new l0(s0Var, str2));
    }

    public /* synthetic */ void E0(s0 s0Var, PlayerTrack playerTrack, com.spotify.android.glue.patterns.contextmenu.model.b bVar) {
        nqe a2 = s0Var.c().a(playerTrack.uri());
        this.L.a(a2);
        o1(ContextMenuEvent.ADD_TO_QUEUE, playerTrack.uri(), null);
        com.spotify.music.promodisclosure.impl.e.b(this.s, Collections.singletonList(playerTrack), this.M, a2, true);
    }

    public void F(String str, String str2, s0 s0Var) {
        b(C0707R.id.context_menu_rename_playlist, C0707R.string.context_menu_rename_playlist, SpotifyIconV2.EDIT).n(new p1(this, str, str2), new o1(s0Var, str));
    }

    public /* synthetic */ void F0(String str, com.spotify.android.glue.patterns.contextmenu.model.b bVar) {
        o1(ContextMenuEvent.START_RADIO, str, null);
        Activity activity = this.s;
        activity.startService(RadioFormatListService.e(activity, str));
    }

    public void G(String str, c cVar, s0 s0Var) {
        a(C0707R.id.menu_item_report, C0707R.string.context_menu_report, l70.i(this.s, SpotifyIconV2.FLAG)).n(new r2(this, cVar, str), new w2(s0Var, str));
    }

    public /* synthetic */ void G0(String str, int i, int i2, com.spotify.android.glue.patterns.contextmenu.model.b bVar) {
        this.J.b(this.K.c(ImmutableList.of(str)).subscribe(new c2(this, i), new y1(this, i2)));
    }

    public void H(int i, String str, s0 s0Var) {
        this.x.c(C0707R.id.menu_item_report_abuse, this.s.getResources().getString(C0707R.string.context_menu_report_abuse), l70.i(this.s, SpotifyIconV2.REPORT_ABUSE), i).n(new f1(this, str), new u0(s0Var, str));
    }

    public void H0(String str, String str2, com.spotify.android.glue.patterns.contextmenu.model.b bVar) {
        o1(ContextMenuEvent.REMOVE, str, null);
        ((com.spotify.music.playlist.service.c) this.P).c(str, str2);
        z<String> I2 = this.u.get().a(str, LinkType.COLLECTION_ROOTLIST).I(200, TimeUnit.MILLISECONDS);
        disposeSubscriptions();
        this.J.b(I2.subscribe(new p2(this, C0707R.string.snackbar_removed_from_playlist), new d1(this, C0707R.string.snackbar_removed_from_playlist_fallback)));
    }

    public void I(AlbumCollectionState albumCollectionState, boolean z2, String str, String str2, ItemType itemType, s0 s0Var) {
        AlbumCollectionState albumCollectionState2 = AlbumCollectionState.PARTIALLY;
        LinkType q2 = l0.z(str).q();
        LinkType linkType = LinkType.TRACK;
        boolean z3 = false;
        if (q2 == linkType || q2 == LinkType.SHOW_EPISODE || q2 == LinkType.ALBUM || q2 == LinkType.COLLECTION_ALBUM) {
            String str3 = "Uri is of type " + q2 + " but itemType is not track, album or episode.";
            if (itemType == ItemType.TRACK_OR_ALBUM_OR_EPISODE) {
                z3 = true;
            }
            Assertion.j(str3, z3);
        } else if (q2 == LinkType.SHOW_SHOW) {
            String str4 = "Uri is of type " + q2 + " but itemType is not video or audio podcast.";
            if (itemType == ItemType.VIDEO_PODCAST || itemType == ItemType.AUDIO_PODCAST) {
                z3 = true;
            }
            Assertion.j(str4, z3);
        } else {
            Assertion.p("Unsupported link type " + q2);
        }
        if (q2 == linkType || q2 == LinkType.SHOW_SHOW || q2 == LinkType.SHOW_EPISODE) {
            Assertion.d(albumCollectionState2, albumCollectionState);
        }
        int ordinal = albumCollectionState.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            if (albumCollectionState == albumCollectionState2) {
                SpotifyIconV2 spotifyIconV2 = SpotifyIconV2.HEART;
                int i = R.color.gray_50;
                Activity activity = this.s;
                a(C0707R.id.context_menu_add_full_album_to_collection, C0707R.string.free_tier_context_menu_like, l70.j(activity, spotifyIconV2, androidx.core.content.a.b(activity, i))).n(new p(this, str, str2), new u2(s0Var, str));
            }
            if (z2) {
                SpotifyIconV2 spotifyIconV22 = SpotifyIconV2.HEART_ACTIVE;
                int i2 = R.color.green;
                Activity activity2 = this.s;
                a(C0707R.id.context_menu_remove_from_collection, C0707R.string.free_tier_context_menu_unlike, l70.j(activity2, spotifyIconV22, androidx.core.content.a.b(activity2, i2))).n(new m2(this, str), new w0(s0Var, str));
            }
        } else if (ordinal == 2) {
            SpotifyIconV2 spotifyIconV23 = SpotifyIconV2.HEART;
            int i3 = R.color.gray_50;
            Activity activity3 = this.s;
            a(C0707R.id.context_menu_add_to_collection, C0707R.string.free_tier_context_menu_like, l70.j(activity3, spotifyIconV23, androidx.core.content.a.b(activity3, i3))).n(new t2(this, str, str2), new q1(s0Var, str));
        }
    }

    public /* synthetic */ void I0(String str, String str2, com.spotify.android.glue.patterns.contextmenu.model.b bVar) {
        o1(ContextMenuEvent.REMOVE, str, null);
        this.E.a(str2, str);
    }

    public void J(AlbumCollectionState albumCollectionState, String str, String str2, s0 s0Var) {
        LinkType q2 = l0.z(str).q();
        if (!(LinkType.SHOW_SHOW == q2 || LinkType.SHOW_EPISODE == q2)) {
            Assertion.p(String.format("Unsupported link type %s", q2));
        }
        int ordinal = albumCollectionState.ordinal();
        if (ordinal == 0) {
            SpotifyIconV2 spotifyIconV2 = SpotifyIconV2.X;
            int i = R.color.green;
            Activity activity = this.s;
            a(C0707R.id.context_menu_remove_from_collection, C0707R.string.context_menu_unfollow_in_collection, l70.j(activity, spotifyIconV2, androidx.core.content.a.b(activity, i))).n(new b3(this, str), new h1(s0Var, str));
        } else if (ordinal != 2) {
            Assertion.p(String.format("Unsupported state type %s", albumCollectionState));
        } else {
            SpotifyIconV2 spotifyIconV22 = SpotifyIconV2.PLUS;
            int i2 = R.color.gray_50;
            Activity activity2 = this.s;
            a(C0707R.id.context_menu_add_to_collection, C0707R.string.context_menu_follow_in_collection, l70.j(activity2, spotifyIconV22, androidx.core.content.a.b(activity2, i2))).n(new u1(this, str, str2), new c0(s0Var, str));
        }
    }

    public /* synthetic */ void J0(String str, String str2, com.spotify.android.glue.patterns.contextmenu.model.b bVar) {
        o1(ContextMenuEvent.RENAME, str, null);
        this.D.a(str, str2);
    }

    public void K(boolean z2, boolean z3, String str, String str2, s0 s0Var) {
        I(z2 ? AlbumCollectionState.YES : AlbumCollectionState.NO, z3, str, str2, ItemType.TRACK_OR_ALBUM_OR_EPISODE, s0Var);
    }

    public /* synthetic */ void K0(c cVar, String str, com.spotify.android.glue.patterns.contextmenu.model.b bVar) {
        this.r.a(cVar, str);
    }

    public void L(String str, String str2, String str3, String str4, Uri uri, s0 s0Var) {
        if (this.s instanceof androidx.fragment.app.c) {
            b(C0707R.id.context_menu_share, C0707R.string.context_menu_share, SpotifyIconV2.SHARE_ANDROID).n(new r(this, str3, str4, uri, str, str2), new h3(s0Var));
        }
    }

    public /* synthetic */ void L0(String str, com.spotify.android.glue.patterns.contextmenu.model.b bVar) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        this.t.b(intent);
    }

    public void M(String str, s0 s0Var) {
        a(C0707R.id.menu_item_show_credits, C0707R.string.context_menu_show_credits, l70.i(this.s, SpotifyIconV2.FOLLOW)).n(new b1(this, str), new t(s0Var));
    }

    public /* synthetic */ void M0(String str, String str2, com.spotify.android.glue.patterns.contextmenu.model.b bVar) {
        o1(ContextMenuEvent.ADD_TO_COLLECTION, str, com.spotify.music.ubi.interactions.a.a(str));
        this.I.a(str, str2, true);
    }

    public void N(s0 s0Var) {
        b(C0707R.id.menu_item_show_lyrics, C0707R.string.lyrics_context_menu_show_lyrics, SpotifyIconV2.LYRICS).n(new d2(this), new r1(s0Var));
    }

    public /* synthetic */ void N0(String str, String str2, com.spotify.android.glue.patterns.contextmenu.model.b bVar) {
        o1(ContextMenuEvent.COMPLETE_ALBUM_IN_COLLECTION, str, com.spotify.music.ubi.interactions.a.a(str));
        this.I.a(str, str2, true);
    }

    public void O(String str, s0 s0Var) {
        b4d b4d = new b4d(this.o, this.s);
        LinkType q2 = l0.z(str).q();
        this.x.b(C0707R.id.menu_item_sleep_timer, b4d.b(q2), b4d.a()).n(new s1(this, str, q2), new f2(s0Var));
    }

    public /* synthetic */ void O0(String str, com.spotify.android.glue.patterns.contextmenu.model.b bVar) {
        o1(ContextMenuEvent.REMOVE_FROM_COLLECTION, str, com.spotify.music.ubi.interactions.a.b(str));
        this.I.f(str, true);
    }

    public void P(s0 s0Var, String... strArr) {
        MoreObjects.checkArgument(strArr.length > 0);
        if (!this.f.a(this.z)) {
            com.spotify.android.glue.patterns.contextmenu.model.b b2 = b(C0707R.id.menu_item_start_station, agd.g(l0.z(strArr[0])), SpotifyIconV2.RADIO);
            String str = strArr[0];
            b2.n(new u(this, str), new g0(s0Var, str));
        }
    }

    public /* synthetic */ void P0(String str, String str2, com.spotify.android.glue.patterns.contextmenu.model.b bVar) {
        o1(ContextMenuEvent.ADD_TO_COLLECTION, str, com.spotify.music.ubi.interactions.a.a(str));
        this.I.a(str, str2, true);
    }

    public void Q(String str, boolean z2, String str2, s0 s0Var) {
        a(C0707R.id.context_menu_subscribe, z2 ? C0707R.string.context_menu_unsubscribe : C0707R.string.context_menu_subscribe, l70.i(this.s, z2 ? SpotifyIconV2.X : SpotifyIconV2.PLUS)).n(new z2(this, z2, str, str2), new v0(z2, s0Var, str));
    }

    public /* synthetic */ void Q0(String str, com.spotify.android.glue.patterns.contextmenu.model.b bVar) {
        o1(ContextMenuEvent.REMOVE_FROM_COLLECTION, str, com.spotify.music.ubi.interactions.a.b(str));
        this.I.f(str, true);
    }

    public void R(String str, Map<String, CollectionStateProvider.a> map, s0 s0Var) {
        Drawable drawable;
        if (!map.isEmpty()) {
            ArrayList arrayList = new ArrayList(0);
            ArrayList arrayList2 = new ArrayList(0);
            for (Map.Entry<String, CollectionStateProvider.a> entry : map.entrySet()) {
                if (entry.getValue().b()) {
                    arrayList.add(entry.getKey());
                } else {
                    arrayList2.add(entry.getKey());
                }
            }
            boolean isEmpty = arrayList2.isEmpty();
            if (isEmpty) {
                SpotifyIconV2 spotifyIconV2 = SpotifyIconV2.HEART_ACTIVE;
                int i = R.color.green;
                Activity activity = this.s;
                drawable = l70.j(activity, spotifyIconV2, androidx.core.content.a.b(activity, i));
            } else {
                SpotifyIconV2 spotifyIconV22 = SpotifyIconV2.HEART;
                int i2 = R.color.gray_50;
                Activity activity2 = this.s;
                drawable = l70.j(activity2, spotifyIconV22, androidx.core.content.a.b(activity2, i2));
            }
            a(C0707R.id.context_menu_add_all_album_tracks_to_collection, isEmpty ? C0707R.string.context_menu_remove_all_album_tracks_from_collection : C0707R.string.context_menu_add_all_album_tracks_to_collection, drawable).n(new d3(this, isEmpty, str, arrayList, arrayList2), isEmpty ? new p0(s0Var, str) : new g2(s0Var, str));
        }
    }

    public /* synthetic */ void R0(String str, String str2, Uri uri, String str3, String str4, com.spotify.android.glue.patterns.contextmenu.model.b bVar) {
        jzc b2 = this.H.b((androidx.fragment.app.c) this.s, this.w, this.N);
        r.a h = r.h(str);
        h.c(str2);
        b2.c(pzc.a(uri, str3, str4, h.build()).build(), new s0d(this.y), C0707R.string.integration_id_context_menu);
    }

    public void S(String str, boolean z2, s0 s0Var) {
        b(C0707R.id.context_menu_toggle_collaborative, z2 ? C0707R.string.context_menu_uncollaborative : C0707R.string.context_menu_collaborative, SpotifyIconV2.COLLABORATIVE_PLAYLIST).n(new w1(this, z2, str), new g3(z2, s0Var, str));
    }

    public /* synthetic */ void S0(String str, com.spotify.android.glue.patterns.contextmenu.model.b bVar) {
        o1(ContextMenuEvent.SHOW_CREDITS, str, null);
        this.t.b(this.G.a(this.s, str));
    }

    public void T(String str, boolean z2, s0 s0Var) {
        b(C0707R.id.context_menu_toggle_published, z2 ? C0707R.string.context_menu_unpublish : C0707R.string.context_menu_publish, z2 ? SpotifyIconV2.LOCKED : SpotifyIconV2.PUBLIC).n(new o2(this, z2, str), new i1(z2, s0Var, str));
    }

    public /* synthetic */ void T0(com.spotify.android.glue.patterns.contextmenu.model.b bVar) {
        o1(ContextMenuEvent.SHOW_LYRICS, null, null);
    }

    public void U(s0 s0Var) {
        ContextMenuViewModel contextMenuViewModel = this.x;
        CharSequence text = this.s.getText(C0707R.string.context_menu_go_to_queue);
        SpotifyIconV2 spotifyIconV2 = SpotifyIconV2.QUEUE;
        int i = R.color.white;
        Activity activity = this.s;
        contextMenuViewModel.e(C0707R.id.context_menu_go_to_queue, text, ImmutableList.of(l70.j(activity, spotifyIconV2, androidx.core.content.a.b(activity, i)))).h(new e1(this), new t1(s0Var));
    }

    public void U0(String str, LinkType linkType, com.spotify.android.glue.patterns.contextmenu.model.b bVar) {
        o1(ContextMenuEvent.OPEN_SLEEP_TIMER_MENU, str, null);
        Activity activity = this.s;
        int i = ContextMenuFragment.J0;
        ContextMenuFragment.f5(f1(str, linkType, null), (androidx.fragment.app.c) activity, null);
    }

    public void V0(boolean z2, String str, String str2, com.spotify.android.glue.patterns.contextmenu.model.b bVar) {
        o1(z2 ? ContextMenuEvent.REMOVE : ContextMenuEvent.SUBSCRIBE, str, z2 ? InteractionAction.UNLIKE : InteractionAction.LIKE);
        if (!z2) {
            b bVar2 = this.P;
            str.getClass();
            ((com.spotify.music.playlist.service.c) bVar2).a(str);
        } else {
            b bVar3 = this.P;
            str.getClass();
            ((com.spotify.music.playlist.service.c) bVar3).d(str);
        }
        s1(this.s.getString(!z2 ? C0707R.string.snackbar_following_entity : C0707R.string.snackbar_unfollowing_entity, new Object[]{str2}));
    }

    public void W(boolean z2, ImmutableList<Drawable> immutableList, c.a aVar) {
        com.spotify.android.glue.patterns.contextmenu.model.c e = this.x.e(C0707R.id.context_menu_repeat, this.s.getText(C0707R.string.context_menu_repeat), immutableList);
        e.g(z2);
        e.j(false);
        e.i(aVar);
    }

    public /* synthetic */ void W0(boolean z2, String str, List list, List list2, com.spotify.android.glue.patterns.contextmenu.model.b bVar) {
        if (z2) {
            o1(ContextMenuEvent.REMOVE_FROM_COLLECTION, str, com.spotify.music.ubi.interactions.a.a(str));
            this.I.d((String[]) list.toArray(new String[0]), true);
            return;
        }
        o1(ContextMenuEvent.ADD_TO_COLLECTION, str, com.spotify.music.ubi.interactions.a.a(str));
        this.I.c((String[]) list2.toArray(new String[0]), str, true);
    }

    public void X(boolean z2, ImmutableList<Drawable> immutableList, c.a aVar) {
        com.spotify.android.glue.patterns.contextmenu.model.c e = this.x.e(C0707R.id.context_menu_shuffle, this.s.getText(C0707R.string.context_menu_shuffle), immutableList);
        e.g(z2);
        e.j(false);
        e.i(aVar);
    }

    public /* synthetic */ void X0(boolean z2, String str, com.spotify.android.glue.patterns.contextmenu.model.b bVar) {
        o1(z2 ? ContextMenuEvent.UNSET_COLLABORATIVE : ContextMenuEvent.SET_COLLABORATIVE, str, null);
        boolean z3 = !z2;
        ((com.spotify.music.playlist.service.c) this.P).e(str, z3);
        q1(z3 ? C0707R.string.snackbar_now_collaborative : C0707R.string.snackbar_now_uncollaborative);
    }

    public void Y(String str) {
        int i;
        l0 z2 = l0.z(str);
        int ordinal = z2.q().ordinal();
        if (ordinal == 6) {
            i = C0707R.string.context_menu_unpin_album;
        } else if (ordinal == 14) {
            i = C0707R.string.context_menu_unpin_artist;
        } else if (ordinal == 185) {
            i = C0707R.string.context_menu_unpin_playlist;
        } else if (ordinal == 246) {
            i = C0707R.string.context_menu_unpin_show;
        } else {
            StringBuilder a1 = je.a1("No title available for ", str, ", ");
            a1.append(z2.q());
            throw new IllegalArgumentException(a1.toString());
        }
        this.x.b(C0707R.id.context_menu_unpin_from_your_library, this.s.getString(i), oi0.b(this.s)).o(new j2(this, str));
    }

    public /* synthetic */ void Y0(boolean z2, String str, com.spotify.android.glue.patterns.contextmenu.model.b bVar) {
        boolean z3 = !z2;
        o1(z2 ? ContextMenuEvent.UNSET_PUBLISHED : ContextMenuEvent.SET_PUBLISHED, str, null);
        ((com.spotify.music.playlist.service.c) this.P).f(str, z3);
        q1(z3 ? C0707R.string.snackbar_published : C0707R.string.snackbar_unpublished);
    }

    public void Z(List<i0> list, Optional<i0> optional, s0 s0Var) {
        Activity activity = this.s;
        if (activity instanceof androidx.fragment.app.c) {
            androidx.fragment.app.c cVar = (androidx.fragment.app.c) activity;
            com.spotify.android.glue.patterns.contextmenu.model.b c2 = this.x.c(C0707R.id.context_menu_video_subtitles, this.a.c(cVar), l70.i(this.s, SpotifyIconV2.SUBTITLES), 0);
            c2.n(new v(this, optional, cVar), new f3(s0Var));
            c2.m(!list.isEmpty());
        }
    }

    public /* synthetic */ void Z0(com.spotify.android.glue.patterns.contextmenu.model.c cVar) {
        o1(ContextMenuEvent.BROWSE_QUEUE, ViewUris.i0.toString(), null);
        this.q.c();
    }

    public /* synthetic */ void a1(String str, com.spotify.android.glue.patterns.contextmenu.model.b bVar) {
        this.J.b(this.Q.c(str).subscribe());
    }

    public /* synthetic */ void b0(String str, String str2, String str3, com.spotify.android.glue.patterns.contextmenu.model.b bVar) {
        o1(ContextMenuEvent.INSTALL_SHORTCUT, str, null);
        ShortcutInstallerService.a(this.s, str, str2, str3, this.w);
    }

    public /* synthetic */ void b1(androidx.fragment.app.c cVar, Optional optional) {
        ContextMenuFragment.f5(this.a.b(this.s, optional), cVar, null);
    }

    public void c(String str, String str2, String str3, s0 s0Var) {
        b(C0707R.id.menu_item_add_to_home_screen, C0707R.string.options_menu_add_to_home_screen, SpotifyIconV2.DEVICE_MOBILE).n(new e2(this, str, str2, str3), new d0(s0Var, str));
    }

    public /* synthetic */ void c0(String str, String str2, String str3, com.spotify.android.glue.patterns.contextmenu.model.b bVar) {
        o1(ContextMenuEvent.ADD_TO_PLAYLIST, str, null);
        this.C.a(Collections.singletonList(str), str2, str3);
    }

    public /* synthetic */ void c1(String str, String str2) {
        o1(ContextMenuEvent.BROWSE_ARTIST, str, null);
        com.spotify.music.navigation.b bVar = this.t;
        z0.b b2 = this.O.b(this.s, str);
        b2.c(str2);
        bVar.b(b2.a());
    }

    public void d(String str, String str2, String str3, s0 s0Var) {
        b(C0707R.id.context_menu_add_to_playlist, C0707R.string.context_menu_add_to_other_playlist, SpotifyIconV2.ADD_TO_PLAYLIST).n(new t0(this, str, str2, str3), new e0(s0Var));
    }

    public /* synthetic */ void d1(int i) {
        s1(this.s.getString(i));
    }

    /* access modifiers changed from: package-private */
    @w(Lifecycle.Event.ON_PAUSE)
    public void disposeSubscriptions() {
        this.J.dispose();
    }

    public void e(String str, String str2, String str3, s0 s0Var) {
        b(C0707R.id.context_menu_add_to_playlist, C0707R.string.context_menu_add_to_playlist, SpotifyIconV2.ADD_TO_PLAYLIST).n(new t0(this, str, str2, str3), new e0(s0Var));
    }

    public /* synthetic */ void e1(int i, Throwable th) {
        q1(i);
    }

    public void f(j jVar, boolean z2, s0 s0Var) {
        Drawable drawable;
        String e = jVar.e();
        j c2 = this.n.c(e);
        if (c2 == null) {
            this.n.g(jVar);
            c2 = jVar;
        }
        boolean f2 = c2.f();
        boolean g = c2.g();
        boolean z3 = !f2;
        if (!z2) {
            if (f2) {
                SpotifyIconV2 spotifyIconV2 = SpotifyIconV2.BLOCK;
                int i = R.color.red;
                Activity activity = this.s;
                drawable = l70.j(activity, spotifyIconV2, androidx.core.content.a.b(activity, i));
            } else {
                SpotifyIconV2 spotifyIconV22 = SpotifyIconV2.BLOCK;
                int i2 = R.color.gray_50;
                Activity activity2 = this.s;
                drawable = l70.j(activity2, spotifyIconV22, androidx.core.content.a.b(activity2, i2));
            }
        } else if (f2) {
            SpotifyIconV2 spotifyIconV23 = SpotifyIconV2.BAN;
            int i3 = R.color.red;
            Activity activity3 = this.s;
            drawable = l70.j(activity3, spotifyIconV23, androidx.core.content.a.b(activity3, i3));
        } else {
            SpotifyIconV2 spotifyIconV24 = SpotifyIconV2.BAN;
            int i4 = R.color.gray_50;
            Activity activity4 = this.s;
            drawable = l70.j(activity4, spotifyIconV24, androidx.core.content.a.b(activity4, i4));
        }
        a(C0707R.id.options_menu_ban_or_unban, f2 ? C0707R.string.context_menu_unban_artist : C0707R.string.context_menu_ban_artist, drawable).n(new f0(this, e, z3, g), z3 ? new l1(s0Var, jVar) : new l(s0Var, jVar));
    }

    public /* synthetic */ void f0(String str, boolean z2, boolean z3, com.spotify.android.glue.patterns.contextmenu.model.b bVar) {
        this.n.f(str, z2);
        o1(z2 ? ContextMenuEvent.BAN : ContextMenuEvent.UNBAN, str, null);
        if (z2) {
            t1(C0707R.string.toast_banned_artist, C0707R.string.player_toastie_undo, new c3(this, z3, str));
        } else {
            t1(C0707R.string.toast_ok_got_it, C0707R.string.player_toastie_undo, new a3(this, str));
        }
    }

    public r3 f1(String str, LinkType linkType, Object obj) {
        n nVar = this.o;
        return new c4d(new e4d(this.s, new d4d(nVar, this.b, str, new s(this.c, this.p)), nVar, linkType, str)).a();
    }

    public void g(boolean z2, String str, String str2, boolean z3, s0 s0Var) {
        int i;
        Drawable drawable;
        t7a t7a = new t7a(this.s, this.w);
        if (!z3) {
            i = z2 ? C0707R.string.context_menu_unhide_song : C0707R.string.context_menu_hide_song;
            if (z2) {
                SpotifyIconV2 spotifyIconV2 = SpotifyIconV2.BLOCK;
                int i2 = R.color.red;
                Activity activity = this.s;
                drawable = l70.j(activity, spotifyIconV2, androidx.core.content.a.b(activity, i2));
            } else {
                SpotifyIconV2 spotifyIconV22 = SpotifyIconV2.BLOCK;
                int i3 = R.color.gray_50;
                Activity activity2 = this.s;
                drawable = l70.j(activity2, spotifyIconV22, androidx.core.content.a.b(activity2, i3));
            }
        } else {
            i = z2 ? C0707R.string.context_menu_unban : C0707R.string.context_menu_ban;
            if (z2) {
                SpotifyIconV2 spotifyIconV23 = SpotifyIconV2.BAN;
                int i4 = R.color.red;
                Activity activity3 = this.s;
                drawable = l70.j(activity3, spotifyIconV23, androidx.core.content.a.b(activity3, i4));
            } else {
                SpotifyIconV2 spotifyIconV24 = SpotifyIconV2.BAN;
                int i5 = R.color.gray_50;
                Activity activity4 = this.s;
                drawable = l70.j(activity4, spotifyIconV24, androidx.core.content.a.b(activity4, i5));
            }
        }
        a(C0707R.id.options_menu_ban_or_unban, i, drawable).n(new k0(this, z2, t7a, str, str2), new x0(z2, s0Var, str));
    }

    public /* synthetic */ void g0(boolean z2, s7a s7a, String str, String str2, com.spotify.android.glue.patterns.contextmenu.model.b bVar) {
        if (z2) {
            s7a.b(str, str2, false);
        } else {
            s7a.a(str, str2, true);
        }
        o1(z2 ? ContextMenuEvent.UNBAN : ContextMenuEvent.BAN, str, null);
    }

    public /* synthetic */ void g1(boolean z2, String str, View view) {
        if (z2) {
            this.n.e(str, true);
        } else {
            this.n.f(str, false);
        }
        this.b.dismiss();
    }

    public void h(String str, String str2, s0 s0Var) {
        b(C0707R.id.context_menu_browse_album, C0707R.string.context_menu_browse_album, SpotifyIconV2.ALBUM).n(new z0(this, str, str2), new g1(s0Var, str));
    }

    public void h1(String str, View view) {
        this.n.f(str, true);
        this.b.dismiss();
        this.y.a(ContextMenuEvent.BAN);
    }

    public void i(String str, String str2, s0 s0Var) {
        b(C0707R.id.context_menu_browse_artist, C0707R.string.context_menu_browse_artist, SpotifyIconV2.ARTIST).n(new k2(this, str, str2), new y0(s0Var, str));
    }

    public /* synthetic */ void i0(String str, String str2, com.spotify.android.glue.patterns.contextmenu.model.b bVar) {
        o1(ContextMenuEvent.BROWSE_ALBUM, str, null);
        com.spotify.music.navigation.b bVar2 = this.t;
        z0.b b2 = this.O.b(this.s, str);
        b2.c(str2);
        bVar2.b(b2.a());
    }

    public /* synthetic */ void i1(boolean z2, String str, View view) {
        if (z2) {
            this.n.f(str, true);
        } else {
            this.n.e(str, false);
        }
        this.b.dismiss();
    }

    public void j(List<com.spotify.playlist.models.b> list, s0 s0Var) {
        if (list.size() > 1) {
            b(C0707R.id.context_menu_browse_artist, C0707R.string.context_menu_browse_artists, SpotifyIconV2.ARTIST).n(new k1(this, list), new y(s0Var));
            return;
        }
        com.spotify.playlist.models.b bVar = list.get(0);
        bVar.getClass();
        com.spotify.playlist.models.b bVar2 = bVar;
        String uri = bVar2.getUri();
        b(C0707R.id.context_menu_browse_artist, C0707R.string.context_menu_browse_artist, SpotifyIconV2.ARTIST).n(new k2(this, uri, bVar2.f()), new y0(s0Var, uri));
    }

    public /* synthetic */ void j0(String str, String str2, com.spotify.android.glue.patterns.contextmenu.model.b bVar) {
        o1(ContextMenuEvent.BROWSE_ARTIST, str, null);
        com.spotify.music.navigation.b bVar2 = this.t;
        z0.b b2 = this.O.b(this.s, str);
        b2.c(str2);
        bVar2.b(b2.a());
    }

    public /* synthetic */ void j1(String str, View view) {
        this.n.e(str, true);
        this.b.dismiss();
    }

    public void k(String str, String str2, s0 s0Var) {
        b(C0707R.id.context_menu_browse_show, C0707R.string.context_menu_browse_episode, SpotifyIconV2.PODCASTS).n(new v1(this, str, str2), new m0(s0Var, str));
    }

    public void k0(List list, com.spotify.android.glue.patterns.contextmenu.model.b bVar) {
        z1 z1Var = new z1(this);
        ViewArtistsContextMenuDialogFragment.a aVar = new ViewArtistsContextMenuDialogFragment.a();
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.spotify.playlist.models.b bVar2 = (com.spotify.playlist.models.b) it.next();
            arrayList.add(new mab(bVar2.f(), bVar2.getUri(), q.c(bVar2.d(), Covers.Size.NORMAL)));
        }
        aVar.e(arrayList);
        aVar.d(this.s.getString(C0707R.string.context_menu_artists_list_title));
        aVar.c(z1Var);
        aVar.b(C0707R.id.context_menu_browse_artist);
        aVar.a().Y4(((androidx.fragment.app.c) this.s).v0(), "ViewArtistsContextMenuDialogFragment");
    }

    public /* synthetic */ void k1(int i, String str) {
        s1(this.s.getString(i, new Object[]{str}));
    }

    public void l(String str, String str2, s0 s0Var) {
        b(C0707R.id.context_menu_browse_album, C0707R.string.context_menu_browse_full_album, SpotifyIconV2.ALBUM).n(new z0(this, str, str2), new g1(s0Var, str));
    }

    public /* synthetic */ void l0(String str, String str2, com.spotify.android.glue.patterns.contextmenu.model.b bVar) {
        o1(ContextMenuEvent.BROWSE_EPISODE, str, null);
        com.spotify.music.navigation.b bVar2 = this.t;
        z0.b b2 = this.O.b(this.s, str);
        b2.c(str2);
        bVar2.b(b2.a());
    }

    public /* synthetic */ void l1(int i, Throwable th) {
        q1(i);
    }

    public void m(String str, String str2, ShowType showType, s0 s0Var) {
        int ordinal = showType.ordinal();
        b(C0707R.id.context_menu_browse_show, ordinal != 1 ? ordinal != 2 ? C0707R.string.context_menu_browse_show : C0707R.string.context_menu_browse_show_music_and_talk : C0707R.string.context_menu_browse_show_video, SpotifyIconV2.PODCASTS).n(new q2(this, str, str2), new q(s0Var, str));
    }

    public /* synthetic */ void m0(String str, String str2, com.spotify.android.glue.patterns.contextmenu.model.b bVar) {
        o1(ContextMenuEvent.BROWSE_SHOW, str, null);
        com.spotify.music.navigation.b bVar2 = this.t;
        z0.b b2 = this.O.b(this.s, str);
        b2.c(str2);
        bVar2.b(b2.a());
    }

    public /* synthetic */ void m1(ContextMenuEvent contextMenuEvent, String str, boolean z2, com.spotify.android.glue.patterns.contextmenu.model.e eVar, com.spotify.android.glue.patterns.contextmenu.model.b bVar) {
        o1(contextMenuEvent, str, null);
        this.A.a(str, OffliningLogger.SourceElement.CONTEXT_MENU, z2);
        eVar.a(bVar);
    }

    public /* synthetic */ void n0(boolean z2, String str, com.spotify.music.libs.collection.played.a aVar, o32 o32, com.spotify.android.glue.patterns.contextmenu.model.b bVar) {
        boolean z3 = !z2;
        o1(z2 ? ContextMenuEvent.MARK_AS_UNPLAYED : ContextMenuEvent.MARK_AS_PLAYED, str, null);
        if (z3) {
            aVar.a(str);
        } else {
            aVar.b(str);
        }
        o32.a(z3);
    }

    public /* synthetic */ void n1(String str, com.spotify.android.glue.patterns.contextmenu.model.e eVar, com.spotify.android.glue.patterns.contextmenu.model.b bVar) {
        if (LinkType.SHOW_EPISODE != l0.z(str).q()) {
            q1(C0707R.string.toast_undownload);
        }
        eVar.a(bVar);
    }

    public void o(String str, boolean z2, o32 o32, s0 s0Var) {
        str.getClass();
        Activity activity = this.s;
        com.spotify.music.libs.collection.played.b bVar = new com.spotify.music.libs.collection.played.b(new com.spotify.music.libs.collection.played.d(activity));
        SpotifyIconV2 spotifyIconV2 = SpotifyIconV2.CHECK;
        Drawable i = l70.i(activity, spotifyIconV2);
        int i2 = C0707R.string.context_menu_mark_as_played;
        if (z2) {
            i = l70.j(this.s, spotifyIconV2, androidx.core.content.a.b(this.s, C0707R.color.cat_accessory_green));
            i2 = C0707R.string.context_menu_mark_as_unplayed;
        }
        a(C0707R.id.menu_item_mark_as_played, i2, i).n(new j(this, z2, str, bVar, o32), new x(z2, s0Var, str));
    }

    public /* synthetic */ f p0(String str, com.spotify.android.glue.patterns.contextmenu.model.e eVar, com.spotify.android.glue.patterns.contextmenu.model.d dVar, a.d dVar2) {
        s(str, eVar, dVar);
        return f.a;
    }

    public void p1(boolean z2) {
        this.x.E(z2);
    }

    public void q(String str, com.spotify.playlist.models.offline.a aVar, com.spotify.android.glue.patterns.contextmenu.model.e eVar, com.spotify.android.glue.patterns.contextmenu.model.e eVar2, s0 s0Var) {
        n2 n2Var = new n2(s0Var, str);
        a2 a2Var = new a2(s0Var, str);
        aVar.b(new m(this, str, eVar, n2Var), new n0(this, str, eVar2, a2Var), new b2(this, str, eVar2, a2Var), new l2(this, str, eVar2, a2Var), new n(this, str, eVar, n2Var), new o(this, str, eVar, n2Var), new x2(this, str, eVar, n2Var), new r0(this, str, eVar, n2Var));
    }

    public /* synthetic */ f q0(String str, com.spotify.android.glue.patterns.contextmenu.model.e eVar, com.spotify.android.glue.patterns.contextmenu.model.d dVar, a.g gVar) {
        s(str, eVar, dVar);
        return f.a;
    }

    public void r(String str, com.spotify.playlist.models.offline.a aVar, s0 s0Var) {
        n8a n8a = new n8a(this.s);
        q(str, aVar, new i2(n8a, str), new v2(this, str, new a1(n8a, str)), s0Var);
    }

    public /* synthetic */ f r0(String str, com.spotify.android.glue.patterns.contextmenu.model.e eVar, com.spotify.android.glue.patterns.contextmenu.model.d dVar, a.f fVar) {
        s(str, eVar, dVar);
        return f.a;
    }

    public /* synthetic */ f s0(String str, com.spotify.android.glue.patterns.contextmenu.model.e eVar, com.spotify.android.glue.patterns.contextmenu.model.d dVar, a.h hVar) {
        B(str, eVar, dVar);
        return f.a;
    }

    public void t(String str, s0 s0Var) {
        b(C0707R.id.context_menu_edit_playlist, C0707R.string.context_menu_edit_playlist, SpotifyIconV2.EDIT).n(new q0(this, str), new o0(s0Var));
    }

    public /* synthetic */ f t0(String str, com.spotify.android.glue.patterns.contextmenu.model.e eVar, com.spotify.android.glue.patterns.contextmenu.model.d dVar, a.b bVar) {
        B(str, eVar, dVar);
        return f.a;
    }

    public void u(String str, s0 s0Var) {
        b(C0707R.id.context_menu_go_to_queue, C0707R.string.context_menu_go_to_queue, SpotifyIconV2.QUEUE).n(new s2(this, str), new z(s0Var, str));
    }

    public /* synthetic */ f u0(String str, com.spotify.android.glue.patterns.contextmenu.model.e eVar, com.spotify.android.glue.patterns.contextmenu.model.d dVar, a.C0377a aVar) {
        B(str, eVar, dVar);
        return f.a;
    }

    public void v(String str, s0 s0Var) {
        str.getClass();
        b(C0707R.id.menu_item_hide_from_recently_played, C0707R.string.context_menu_hide_from_recently_played, SpotifyIconV2.BLOCK).n(new h(this, str), new y2(s0Var, str));
    }

    public /* synthetic */ f v0(String str, com.spotify.android.glue.patterns.contextmenu.model.e eVar, com.spotify.android.glue.patterns.contextmenu.model.d dVar, a.c cVar) {
        s(str, eVar, dVar);
        return f.a;
    }

    public void w(j jVar, s0 s0Var) {
        Drawable drawable;
        int i;
        String e = jVar.e();
        j c2 = this.n.c(e);
        if (c2 == null) {
            this.n.g(jVar);
            c2 = jVar;
        }
        boolean f2 = c2.f();
        boolean g = c2.g();
        boolean z2 = !g;
        boolean y2 = z42.y(this.z);
        if (g) {
            i = y2 ? C0707R.string.context_menu_unfollow_in_collection : C0707R.string.free_tier_context_menu_unfollow;
            if (y2) {
                drawable = l70.i(this.s, SpotifyIconV2.X);
            } else {
                SpotifyIconV2 spotifyIconV2 = SpotifyIconV2.FOLLOW;
                int i2 = R.color.green;
                Activity activity = this.s;
                drawable = l70.j(activity, spotifyIconV2, androidx.core.content.a.b(activity, i2));
            }
        } else {
            i = C0707R.string.context_menu_follow_in_collection;
            drawable = l70.i(this.s, SpotifyIconV2.FOLLOW);
        }
        a(C0707R.id.options_menu_like_or_unlike, i, drawable).n(new n1(this, e, z2, f2), z2 ? new h2(s0Var, jVar) : new b0(s0Var, jVar));
    }

    public /* synthetic */ f w0(String str, com.spotify.android.glue.patterns.contextmenu.model.e eVar, com.spotify.android.glue.patterns.contextmenu.model.d dVar, a.e eVar2) {
        s(str, eVar, dVar);
        return f.a;
    }

    public void x(String str) {
        int i;
        l0 z2 = l0.z(str);
        int ordinal = z2.q().ordinal();
        if (ordinal == 6) {
            i = C0707R.string.context_menu_pin_album;
        } else if (ordinal == 14) {
            i = C0707R.string.context_menu_pin_artist;
        } else if (ordinal == 185) {
            i = C0707R.string.context_menu_pin_playlist;
        } else if (ordinal == 246) {
            i = C0707R.string.context_menu_pin_show;
        } else {
            StringBuilder a1 = je.a1("No title available for ", str, ", ");
            a1.append(z2.q());
            throw new IllegalArgumentException(a1.toString());
        }
        this.x.b(C0707R.id.context_menu_pin_to_your_library, this.s.getString(i), oi0.a(this.s)).o(new j0(this, str));
    }

    public /* synthetic */ void x0(String str, com.spotify.android.glue.patterns.contextmenu.model.b bVar) {
        o1(ContextMenuEvent.EDIT, str, null);
        this.B.a(str);
    }

    public void y(String str) {
        a(C0707R.id.menu_item_show_promo_disclosure, C0707R.string.context_menu_show_promo_disclosure, l70.i(this.s, SpotifyIconV2.INFO)).o(new h0(this, str));
    }

    public /* synthetic */ void y0(String str, com.spotify.android.glue.patterns.contextmenu.model.b bVar) {
        o1(ContextMenuEvent.BROWSE_QUEUE, str, null);
        this.q.c();
    }

    public void z(String str, s0 s0Var) {
        b(C0707R.id.context_menu_queue_track_or_album, C0707R.string.context_menu_add_to_queue, SpotifyIconV2.ADD_TO_QUEUE).o(new e3(this, s0Var, str));
    }

    public void z0(String str, com.spotify.android.glue.patterns.contextmenu.model.b bVar) {
        o1(ContextMenuEvent.HIDE_FROM_RECENTLY_PLAYED, str, null);
        Activity activity = this.s;
        int i = RecentlyPlayedService.b;
        String[] strArr = {str};
        Intent intent = new Intent(activity, RecentlyPlayedService.class);
        intent.putExtra("uris", strArr);
        intent.setAction("com.spotify.mobile.android.recentlyplayed.service.RecentlyPlayedService.action.HIDE");
        activity.startService(intent);
    }
}
