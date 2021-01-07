package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.nowplaying.drivingmode.view.playercontrols.DrivingPlayerControlsView;
import com.spotify.player.model.PlayerState;
import com.spotify.playlist.formatlisttype.FormatListType;
import com.spotify.playlist.formatlisttype.a;
import com.spotify.rxjava2.p;
import io.reactivex.g;

/* renamed from: zub  reason: default package */
public class zub {
    private final g<PlayerState> a;
    private final a b;
    private final p c = new p();
    private com.spotify.music.nowplaying.drivingmode.view.playercontrols.a d;

    public zub(g<PlayerState> gVar, a aVar) {
        this.a = gVar;
        this.b = aVar;
    }

    public static void a(zub zub, PlayerState playerState) {
        zub.getClass();
        PlayerTrack b2 = ixd.b(playerState.track().get());
        if (fvb.A(b2)) {
            ((DrivingPlayerControlsView) zub.d).b();
            return;
        }
        LinkType q = l0.z(b2.uri()).q();
        LinkType linkType = LinkType.SHOW_EPISODE;
        boolean z = true;
        if (q == linkType && PlayerTrackUtil.isVideo(b2)) {
            if (zub.b.a(playerState.contextMetadata().get("format_list_type")) != FormatListType.s) {
                z = false;
            }
            if (z) {
                ((DrivingPlayerControlsView) zub.d).c();
            } else {
                ((DrivingPlayerControlsView) zub.d).d();
            }
        } else {
            if (l0.z(b2.uri()).q() != linkType || PlayerTrackUtil.isVideo(b2)) {
                z = false;
            }
            if (z) {
                ((DrivingPlayerControlsView) zub.d).d();
            } else {
                ((DrivingPlayerControlsView) zub.d).c();
            }
        }
    }

    public void b(com.spotify.music.nowplaying.drivingmode.view.playercontrols.a aVar) {
        this.d = aVar;
        this.c.b(this.a.subscribe(new oub(this)));
    }

    public void c() {
        this.c.a();
    }
}
