package defpackage;

import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableSet;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.player.controls.c;
import com.spotify.player.controls.d;
import com.spotify.player.model.Context;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.command.PlayCommand;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PlayerOptionOverrides;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.player.model.command.options.SkipToTrack;
import com.spotify.player.play.f;
import com.spotify.playlist.endpoints.d;
import com.spotify.rxjava2.p;
import io.reactivex.a;
import io.reactivex.e;
import io.reactivex.g;
import io.reactivex.internal.operators.completable.i;
import io.reactivex.y;
import io.reactivex.z;
import java.util.Collections;

/* renamed from: fjc  reason: default package */
public class fjc implements cjc {
    private final f a;
    private final PlayOrigin b;
    private final y c;
    private final d d;
    private final lxd e;
    private final hjc f;
    private final com.spotify.playlist.endpoints.d g;
    private final jjc h;
    private final p i = new p();
    private final p j = new p();
    private final g<PlayerState> k;
    private final bre l;
    private PlayerState m = PlayerState.EMPTY;

    public fjc(hjc hjc, com.spotify.playlist.endpoints.d dVar, jjc jjc, f fVar, PlayOrigin playOrigin, y yVar, g<PlayerState> gVar, d dVar2, lxd lxd, bre bre) {
        this.f = hjc;
        this.g = dVar;
        this.h = jjc;
        this.a = fVar;
        this.b = playOrigin;
        this.c = yVar;
        this.d = dVar2;
        this.e = lxd;
        this.k = gVar.Q(yVar);
        this.l = bre;
    }

    private static PreparePlayOptions c(SkipToTrack skipToTrack, long j2) {
        PreparePlayOptions.Builder suppressions = PreparePlayOptions.builder().skipTo(skipToTrack).suppressions(ImmutableSet.of("mft"));
        PlayerOptionOverrides.Builder builder = PlayerOptionOverrides.builder();
        Boolean bool = Boolean.FALSE;
        PreparePlayOptions.Builder playerOptionsOverride = suppressions.playerOptionsOverride(builder.repeatingContext(bool).shufflingContext(bool).repeatingTrack(bool).build());
        if (j2 >= 0) {
            playerOptionsOverride.seekTo(Long.valueOf(j2));
        }
        return playerOptionsOverride.build();
    }

    public static void d(fjc fjc, PlayerState playerState) {
        fjc.m = playerState;
    }

    private LoggingParams f(String str) {
        return LoggingParams.builder().interactionId(str).pageInstanceId(this.l.get()).build();
    }

    @Override // defpackage.cjc
    public void a(String str, String str2, String str3) {
        b(str, str2, -1, str3);
    }

    @Override // defpackage.cjc
    public void b(String str, String str2, long j2, String str3) {
        a aVar;
        if (this.m.isPlaying()) {
            Optional<ContextTrack> track = this.m.track();
            boolean z = false;
            if (track.isPresent() && track.get().uri().equals(str2)) {
                if (j2 >= 0) {
                    z = true;
                }
                if (z) {
                    z<zwd> a2 = this.d.a(c.g(j2));
                    if (this.m.isPaused()) {
                        a2 = a2.s(new zic(this.d.a(c.e())));
                    }
                    if (a2 != null) {
                        aVar = new i(a2);
                        this.i.b(aVar.q(new xic(str2, j2)).subscribe());
                    }
                    throw new NullPointerException("single is null");
                }
            }
        }
        String m2 = this.f.m2();
        if (!MoreObjects.isNullOrEmpty(m2)) {
            d.b Q1 = this.f.Q1();
            LinkType q = l0.z(m2).q();
            if (Q1 == null || !(q == LinkType.PROFILE_PLAYLIST || q == LinkType.PLAYLIST_V2)) {
                SkipToTrack build = SkipToTrack.builder().pageIndex(0L).trackUid(this.f.T1()).trackIndex(0L).build();
                PlayCommand.Builder options = this.e.a(Context.fromUri(m2)).options(c(build, j2));
                if (!MoreObjects.isNullOrEmpty(str3)) {
                    options.loggingParams(f(str3));
                }
                z<zwd> a3 = this.a.a(options.build());
                a3.getClass();
                aVar = new i(a3);
            } else {
                aVar = this.g.c(m2, Q1, c(SkipToTrack.builder().trackUid(this.f.T1()).build(), j2), this.b, Collections.emptyMap(), "interaction ID not set in podcast episode entity", "page instance ID not set in podcast episode entity");
            }
        } else {
            aVar = this.h.a(str, str2).B(this.c).t(new wic(this, str2, j2, str3));
        }
        this.i.b(aVar.q(new xic(str2, j2)).subscribe());
    }

    public e e(String str, long j2, String str2, Context context) {
        PlayCommand.Builder options = this.e.a(context).options(c(SkipToTrack.builder().pageIndex(0L).trackUri(str).trackIndex(0L).build(), j2));
        if (!MoreObjects.isNullOrEmpty(str2)) {
            options.loggingParams(f(str2));
        }
        z<zwd> a2 = this.a.a(options.build());
        a2.getClass();
        return new i(a2);
    }

    @Override // defpackage.cjc
    public void onPause() {
        z<zwd> a2 = this.d.a(c.c());
        if (a2 != null) {
            this.i.b(new i(a2).subscribe());
            return;
        }
        throw new NullPointerException("single is null");
    }

    @Override // defpackage.cjc
    public void onStart() {
        this.j.b(this.k.subscribe(new yic(this)));
    }

    @Override // defpackage.cjc
    public void onStop() {
        this.i.a();
        this.j.a();
    }
}
