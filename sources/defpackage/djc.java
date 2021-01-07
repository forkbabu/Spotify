package defpackage;

import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableSet;
import com.spotify.mobile.android.cosmos.player.v2.LegacyPlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptions;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptionsSkipTo;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.options.PlayerOptionOverrides;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.player.model.command.options.SkipToTrack;
import com.spotify.playlist.endpoints.d;
import com.spotify.rxjava2.p;
import io.reactivex.y;
import java.util.Collections;

@Deprecated
/* renamed from: djc  reason: default package */
public class djc implements cjc {
    private final Player a;
    private final PlayOrigin b;
    private final y c;
    private final hjc d;
    private final d e;
    private final ijc f;
    private final p g = new p();

    public djc(hjc hjc, d dVar, ijc ijc, Player player, PlayOrigin playOrigin, y yVar) {
        this.d = hjc;
        this.e = dVar;
        this.f = ijc;
        this.a = player;
        this.b = playOrigin;
        this.c = yVar;
    }

    private static PlayOptions c(PlayOptionsSkipTo playOptionsSkipTo, long j) {
        PlayOptions.Builder suppressions = new PlayOptions.Builder().skipTo(playOptionsSkipTo).suppressions("mft");
        Boolean bool = Boolean.FALSE;
        PlayOptions.Builder playerOptionsOverride = suppressions.playerOptionsOverride(bool, bool, bool);
        if (d(j)) {
            playerOptionsOverride.seekTo(Long.valueOf(j));
        }
        return playerOptionsOverride.build();
    }

    private static boolean d(long j) {
        return j >= 0;
    }

    @Override // defpackage.cjc
    public void a(String str, String str2, String str3) {
        b(str, str2, -1, str3);
    }

    @Override // defpackage.cjc
    public void b(String str, String str2, long j, String str3) {
        PlayerTrack track;
        LegacyPlayerState lastPlayerState = this.a.getLastPlayerState();
        boolean z = true;
        if (!(lastPlayerState != null && lastPlayerState.isPlaying() && (track = lastPlayerState.track()) != null && track.uri().equals(str2)) || !d(j)) {
            String m2 = this.d.m2();
            if (!MoreObjects.isNullOrEmpty(m2)) {
                d.b Q1 = this.d.Q1();
                LinkType q = l0.z(m2).q();
                if (Q1 == null || !(q == LinkType.PROFILE_PLAYLIST || q == LinkType.PLAYLIST_V2)) {
                    PlayOptionsSkipTo playOptionsSkipTo = new PlayOptionsSkipTo(null, 0, this.d.T1(), null, 0);
                    this.a.play(PlayerContext.createFromContextUrl(m2, "context://" + m2), c(playOptionsSkipTo, j));
                    return;
                }
                SkipToTrack build = SkipToTrack.builder().trackUid(this.d.T1()).build();
                p pVar = this.g;
                d dVar = this.e;
                PreparePlayOptions.Builder suppressions = PreparePlayOptions.builder().skipTo(build).suppressions(ImmutableSet.of("mft"));
                PlayerOptionOverrides.Builder builder = PlayerOptionOverrides.builder();
                Boolean bool = Boolean.FALSE;
                PreparePlayOptions.Builder playerOptionsOverride = suppressions.playerOptionsOverride(builder.repeatingContext(bool).shufflingContext(bool).repeatingTrack(bool).build());
                if (d(j)) {
                    playerOptionsOverride.seekTo(Long.valueOf(j));
                }
                pVar.b(dVar.c(m2, Q1, playerOptionsOverride.build(), this.b, Collections.emptyMap(), "interaction ID not set in podcast episode entity", "page instance ID not set in podcast episode entity").subscribe(vic.a, sic.a));
                return;
            }
            this.g.b(this.f.a(str, str2).B(this.c).subscribe(new tic(this, str2, j), new uic(str2)));
            return;
        }
        this.a.seekTo(j);
        LegacyPlayerState lastPlayerState2 = this.a.getLastPlayerState();
        if (lastPlayerState2 != null && !lastPlayerState2.isPaused()) {
            z = false;
        }
        if (z) {
            this.a.resume();
        }
    }

    public /* synthetic */ void e(String str, long j, PlayerContext playerContext) {
        this.a.play(playerContext, c(new PlayOptionsSkipTo(null, 0, null, str, 0), j));
    }

    @Override // defpackage.cjc
    public void onPause() {
        this.a.pause();
    }

    @Override // defpackage.cjc
    public void onStart() {
    }

    @Override // defpackage.cjc
    public void onStop() {
        this.g.a();
    }
}
