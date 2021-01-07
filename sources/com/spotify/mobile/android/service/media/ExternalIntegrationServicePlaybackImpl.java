package com.spotify.mobile.android.service.media;

import android.text.TextUtils;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.rx.w;
import com.spotify.mobile.android.service.media.RestrictedMediaAction;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.connection.l;
import com.spotify.music.libs.viewuri.c;
import com.spotify.music.podcast.speedcontrol.SpeedControlInteractor;
import com.spotify.player.model.Context;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.Suppressions;
import com.spotify.player.model.command.PauseCommand;
import com.spotify.player.model.command.PlayCommand;
import com.spotify.player.model.command.ResumeCommand;
import com.spotify.player.model.command.SeekToCommand;
import com.spotify.player.model.command.SkipToNextTrackCommand;
import com.spotify.player.model.command.SkipToPrevTrackCommand;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PlayerOptionOverrides;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.player.model.command.options.SkipToPrevTrackOptions;
import com.spotify.player.options.RepeatMode;
import com.spotify.player.options.d;
import com.spotify.player.play.f;
import com.spotify.playlist.endpoints.d;
import com.spotify.playlist.endpoints.policy.playlist.DecorationPolicy;
import com.spotify.playlist.endpoints.policy.playlist.HeaderPolicy;
import com.spotify.playlist.endpoints.policy.playlist.Policy;
import com.spotify.playlist.formatlisttype.FormatListType;
import com.spotify.playlist.models.j;
import com.spotify.playlist.models.k;
import defpackage.zwd;
import io.reactivex.d0;
import io.reactivex.g;
import io.reactivex.processors.BehaviorProcessor;
import io.reactivex.s;
import io.reactivex.z;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class ExternalIntegrationServicePlaybackImpl implements k2 {
    private static final Optional<LoggingParams> p = Optional.absent();
    private static final Pattern q = Pattern.compile(",\\s*");
    public static final /* synthetic */ int r = 0;
    private final SpeedControlInteractor a;
    private final u1 b = new a();
    private final io.reactivex.disposables.a c = new io.reactivex.disposables.a();
    private final BehaviorProcessor<RestrictedMediaAction> d = BehaviorProcessor.r0();
    private final f e;
    private final d f;
    private final com.spotify.player.controls.d g;
    private final g<PlayerState> h;
    private final com.spotify.playlist.endpoints.d i;
    private final com.spotify.playlist.formatlisttype.a j;
    private final l k;
    private final w l;
    private final s<String> m;
    private final cqe n;
    private final PlayOrigin o;

    /* access modifiers changed from: private */
    public enum ShuffleOverride {
        NO_OVERRIDE,
        FORCE_ENABLE_SHUFFLE,
        FORCE_DISABLE_SHUFFLE
    }

    static final class a implements u1 {
        a() {
        }

        @Override // com.spotify.mobile.android.service.media.u1
        public void onActionForbidden(List<String> list) {
            Logger.d("Action forbidden, reasons: %s", Arrays.toString(list.toArray()));
        }

        @Override // com.spotify.mobile.android.service.media.u1
        public void onActionSuccess() {
        }
    }

    public ExternalIntegrationServicePlaybackImpl(f fVar, d dVar, com.spotify.player.controls.d dVar2, g<PlayerState> gVar, com.spotify.playlist.endpoints.d dVar3, com.spotify.playlist.formatlisttype.a aVar, SpeedControlInteractor speedControlInteractor, l lVar, w wVar, s<String> sVar, ifd ifd, yn0 yn0, c cVar, cqe cqe) {
        this.e = fVar;
        this.f = dVar;
        this.g = dVar2;
        this.h = gVar;
        this.k = lVar;
        this.l = wVar;
        this.m = sVar;
        this.i = dVar3;
        this.j = aVar;
        this.a = speedControlInteractor;
        this.n = cqe;
        this.o = PlayOrigin.builder(ifd.getName()).referrerIdentifier(yn0.getName()).viewUri(cVar.toString()).build();
    }

    private z<zwd> H(Context context, PreparePlayOptions preparePlayOptions, k kVar, PlayOrigin playOrigin, LoggingParams loggingParams) {
        return this.l.a("streaming-rules").N0(1).j0(i0.a).B0().A(new b0(this, preparePlayOptions, kVar, context)).s(new g0(this, context, playOrigin, loggingParams));
    }

    private static Optional<List<String>> u(zwd zwd) {
        zwd.getClass();
        if (zwd instanceof zwd.a) {
            return Optional.of(Arrays.asList(q.split(((zwd.a) zwd).c())));
        }
        return Optional.absent();
    }

    private static boolean v(k kVar, com.spotify.playlist.formatlisttype.a aVar) {
        j j2 = kVar == null ? null : kVar.j();
        if (j2 == null || aVar.a(j2.g()) != FormatListType.b) {
            return false;
        }
        return true;
    }

    private static boolean w(com.spotify.playlist.formatlisttype.a aVar, k kVar, Context context) {
        Boolean v;
        if (((kVar == null || (v = kVar.j().v()) == null || !v.booleanValue()) ? false : true) || x(context) || v(kVar, aVar)) {
            return true;
        }
        return false;
    }

    private static boolean x(Context context) {
        return l0.c(context.uri(), LinkType.SHOW_SHOW, LinkType.SHOW_EPISODE);
    }

    public PreparePlayOptions A(PreparePlayOptions preparePlayOptions, k kVar, Context context, Boolean bool) {
        PlayerOptionOverrides playerOptionOverrides;
        PlayerOptionOverrides playerOptionOverrides2;
        boolean booleanValue = bool.booleanValue();
        ShuffleOverride shuffleOverride = ShuffleOverride.NO_OVERRIDE;
        ShuffleOverride shuffleOverride2 = ShuffleOverride.FORCE_ENABLE_SHUFFLE;
        PreparePlayOptions.Builder builder = preparePlayOptions != null ? preparePlayOptions.toBuilder() : PreparePlayOptions.builder();
        com.spotify.playlist.formatlisttype.a aVar = this.j;
        Boolean valueOf = Boolean.valueOf(booleanValue);
        ShuffleOverride shuffleOverride3 = ShuffleOverride.FORCE_DISABLE_SHUFFLE;
        if (valueOf.booleanValue()) {
            if (!x(context) && !v(kVar, aVar)) {
                shuffleOverride3 = shuffleOverride;
            }
        } else if (!w(aVar, kVar, context)) {
            shuffleOverride3 = shuffleOverride2;
        }
        if (shuffleOverride3 != shuffleOverride) {
            boolean z = shuffleOverride3 == shuffleOverride2;
            if (preparePlayOptions == null) {
                playerOptionOverrides = null;
            } else {
                playerOptionOverrides = preparePlayOptions.playerOptionsOverride().orNull();
            }
            if (playerOptionOverrides == null) {
                playerOptionOverrides2 = PlayerOptionOverrides.builder().shufflingContext(Boolean.valueOf(z)).build();
            } else {
                playerOptionOverrides2 = playerOptionOverrides.toBuilder().shufflingContext(Boolean.valueOf(z)).build();
            }
            builder.playerOptionsOverride(playerOptionOverrides2);
        }
        boolean w = w(this.j, kVar, context);
        if (!booleanValue && w) {
            builder.suppressions(Suppressions.create(Collections.singleton("mft")));
        }
        return builder.build();
    }

    public /* synthetic */ d0 B(Context context, PlayOrigin playOrigin, LoggingParams loggingParams, PreparePlayOptions preparePlayOptions) {
        return this.e.a(PlayCommand.builder(context, playOrigin).options(preparePlayOptions).loggingParams(loggingParams).build());
    }

    public d0 C(Map map, PreparePlayOptions preparePlayOptions, PlayOrigin playOrigin, LoggingParams loggingParams, u3 u3Var) {
        HashMap hashMap;
        S s = u3Var.b;
        F f2 = u3Var.a;
        f2.getClass();
        F f3 = f2;
        Context.Builder builder = Context.builder(f3);
        Context.Builder url = builder.url("context://" + ((String) f3));
        if (map == null) {
            hashMap = new HashMap(2);
        }
        if (s != null) {
            String g2 = s.j().g();
            if (!TextUtils.isEmpty(g2)) {
                hashMap.put("format_list_type", g2);
            }
        } else {
            LinkType q2 = l0.z(f3).q();
            if (q2 == LinkType.COLLECTION_TRACKS) {
                hashMap.put("sorting.criteria", String.format("%s DESC", "added_at"));
            } else if (q2 == LinkType.SHOW_SHOW) {
                hashMap.put("sorting.criteria", String.format("%s ASC", "added_at"));
            } else if (q2 == LinkType.COLLECTION_ALBUM) {
                hashMap.put("sorting.criteria", String.format("%s, %s ASC", "album_disc_number", "album_track_number"));
            }
        }
        return H(url.metadata(hashMap).build(), preparePlayOptions, s, playOrigin, loggingParams);
    }

    public d0 D(PreparePlayOptions preparePlayOptions, PlayOrigin playOrigin, LoggingParams loggingParams, String str, Map map, Optional optional) {
        z<R> zVar;
        if (optional.isPresent()) {
            return H((Context) optional.get(), preparePlayOptions, null, playOrigin, loggingParams);
        }
        ImmutableMap.Builder builder = ImmutableMap.builder();
        Boolean bool = Boolean.TRUE;
        builder.mo51put("link", bool);
        builder.mo51put("formatListAttributes", bool);
        builder.mo51put("formatListType", bool);
        builder.mo51put("containsTracks", bool);
        builder.mo51put("containsEpisodes", bool);
        builder.mo51put("containsAudioEpisodes", bool);
        builder.mo51put("isOnDemandInFree", bool);
        ImmutableMap build = builder.build();
        HeaderPolicy.a builder2 = HeaderPolicy.builder();
        builder2.a(build);
        HeaderPolicy b2 = builder2.b();
        DecorationPolicy.a builder3 = DecorationPolicy.builder();
        builder3.b(b2);
        DecorationPolicy a2 = builder3.a();
        Policy.a builder4 = Policy.builder();
        builder4.b(a2);
        Policy a3 = builder4.a();
        d.b.a b3 = d.b.b();
        b3.i(new qxd(0, 0));
        b3.g(a3);
        d.b b4 = b3.b();
        if (l0.z(str).q() == LinkType.COLLECTION_TRACKS) {
            zVar = this.m.j0(a0.a).N0(1).B0();
        } else {
            zVar = z.z(str);
        }
        return zVar.s(new y(this, b4)).s(new z(this, map, preparePlayOptions, playOrigin, loggingParams));
    }

    public void E(zwd zwd) {
        Optional<List<String>> u = u(zwd);
        if (u.isPresent()) {
            this.d.onNext(new RestrictedMediaAction(RestrictedMediaAction.Type.SKIP_PREVIOUS, u.get()));
        }
    }

    public /* synthetic */ Long F(long j2, PlayerState playerState) {
        long longValue = playerState.position(this.n.d()).or((Optional<Long>) 0L).longValue() + j2;
        if (j2 > 0) {
            return Long.valueOf(Math.min(playerState.duration().or((Optional<Long>) 0L).longValue(), longValue));
        }
        return Long.valueOf(Math.max(0L, longValue));
    }

    public void G(zwd zwd) {
        Optional<List<String>> u = u(zwd);
        if (u.isPresent()) {
            this.d.onNext(new RestrictedMediaAction(RestrictedMediaAction.Type.SEEK, u.get()));
        }
    }

    @Override // com.spotify.mobile.android.service.media.i2
    public s<Integer> a() {
        return this.a.c();
    }

    @Override // com.spotify.mobile.android.service.media.i2
    public void b() {
        this.c.b(this.f.setRepeatMode(RepeatMode.CONTEXT).subscribe());
    }

    @Override // com.spotify.mobile.android.service.media.i2
    public void c() {
        this.c.b(this.f.setRepeatMode(RepeatMode.NONE).subscribe());
    }

    @Override // com.spotify.mobile.android.service.media.k2
    public void d() {
        this.c.f();
    }

    @Override // com.spotify.mobile.android.service.media.i2
    public z<zwd> e(Optional<LoggingParams> optional) {
        com.spotify.player.controls.c cVar;
        if (optional.isPresent()) {
            cVar = com.spotify.player.controls.c.j(SkipToNextTrackCommand.builder().loggingParams(optional.get()).build());
        } else {
            cVar = com.spotify.player.controls.c.i();
        }
        return this.g.a(cVar).p(new j0(this));
    }

    @Override // com.spotify.mobile.android.service.media.i2
    public z<zwd> f(ContextTrack contextTrack) {
        return this.g.a(com.spotify.player.controls.c.l(SkipToPrevTrackCommand.builder().track(contextTrack).build()));
    }

    @Override // com.spotify.mobile.android.service.media.i2
    public g<RestrictedMediaAction> g() {
        return this.d;
    }

    @Override // com.spotify.mobile.android.service.media.i2
    public void h(h2 h2Var) {
        this.c.b(p(h2Var).n(sl1.b(h2Var.a().or((Optional<u1>) this.b))).subscribe());
    }

    @Override // com.spotify.mobile.android.service.media.i2
    public void i() {
        this.c.b(this.f.a(true).subscribe());
    }

    @Override // com.spotify.mobile.android.service.media.i2
    public z<zwd> j(ContextTrack contextTrack) {
        return this.g.a(com.spotify.player.controls.c.j(SkipToNextTrackCommand.builder().track(contextTrack).build()));
    }

    @Override // com.spotify.mobile.android.service.media.i2
    public z<zwd> k(Optional<LoggingParams> optional, boolean z) {
        SkipToPrevTrackCommand.Builder options = SkipToPrevTrackCommand.builder().options(SkipToPrevTrackOptions.builder().allowSeeking(Boolean.valueOf(z)).build());
        if (optional.isPresent()) {
            options.loggingParams(optional.get());
        }
        return this.g.a(com.spotify.player.controls.c.l(options.build())).p(new l0(this));
    }

    @Override // com.spotify.mobile.android.service.media.i2
    public z<zwd> l(long j2, Optional<LoggingParams> optional) {
        return this.h.h0(1).a0().A(new h0(this, j2)).s(new f0(this, optional));
    }

    @Override // com.spotify.mobile.android.service.media.i2
    public void m(u1 u1Var) {
        io.reactivex.disposables.a aVar = this.c;
        z<zwd> r2 = r(LoggingParams.EMPTY);
        if (u1Var == null) {
            u1Var = this.b;
        }
        aVar.b(r2.n(sl1.b(u1Var)).subscribe());
    }

    @Override // com.spotify.mobile.android.service.media.i2
    public void n(int i2) {
        this.c.b(this.a.d(i2).subscribe(n0.a, m0.a));
    }

    @Override // com.spotify.mobile.android.service.media.i2
    public void next() {
        this.c.b(e(p).subscribe());
    }

    @Override // com.spotify.mobile.android.service.media.i2
    public void o() {
        this.c.b(this.f.setRepeatMode(RepeatMode.TRACK).subscribe());
    }

    @Override // com.spotify.mobile.android.service.media.i2
    public z<zwd> p(h2 h2Var) {
        if (h2Var.d().isPresent()) {
            return H(h2Var.d().get(), h2Var.h().orNull(), null, h2Var.g().or((Optional<PlayOrigin>) this.o), h2Var.e().or((Optional<LoggingParams>) LoggingParams.EMPTY));
        }
        if (h2Var.i().isEmpty()) {
            Logger.n("playUri should be called with a valid context-uri. Issuing a 'resume()'command instead", new Object[0]);
            return r(h2Var.e().or((Optional<LoggingParams>) LoggingParams.EMPTY));
        }
        String i2 = h2Var.i();
        PreparePlayOptions orNull = h2Var.h().orNull();
        return this.k.b().N0(1).B0().A(new x(i2, orNull)).s(new e0(this, orNull, h2Var.g().or((Optional<PlayOrigin>) this.o), h2Var.e().or((Optional<LoggingParams>) LoggingParams.EMPTY), i2, h2Var.f().orNull()));
    }

    @Override // com.spotify.mobile.android.service.media.i2
    public void pause() {
        this.c.b(s(p).subscribe());
    }

    @Override // com.spotify.mobile.android.service.media.i2
    public void previous() {
        this.c.b(k(p, true).subscribe());
    }

    @Override // com.spotify.mobile.android.service.media.i2
    public void q() {
        this.c.b(this.f.a(false).subscribe());
    }

    @Override // com.spotify.mobile.android.service.media.i2
    public z<zwd> r(LoggingParams loggingParams) {
        return this.g.a(com.spotify.player.controls.c.f(ResumeCommand.builder().loggingParams(loggingParams).build()));
    }

    @Override // com.spotify.mobile.android.service.media.i2
    public z<zwd> s(Optional<LoggingParams> optional) {
        com.spotify.player.controls.c cVar;
        if (optional.isPresent()) {
            cVar = com.spotify.player.controls.c.d(PauseCommand.builder().loggingParams(optional.get()).build());
        } else {
            cVar = com.spotify.player.controls.c.c();
        }
        return this.g.a(cVar);
    }

    @Override // com.spotify.mobile.android.service.media.i2
    public z<zwd> t(long j2, Optional<LoggingParams> optional) {
        com.spotify.player.controls.c cVar;
        if (optional.isPresent()) {
            cVar = com.spotify.player.controls.c.h(SeekToCommand.builder(j2).loggingParams(optional.get()).build());
        } else {
            cVar = com.spotify.player.controls.c.g(j2);
        }
        return this.g.a(cVar).p(new k0(this));
    }

    public /* synthetic */ d0 y(d.b bVar, String str) {
        return this.i.d(str, bVar).A(new c0(str)).E(new d0(str));
    }

    public void z(zwd zwd) {
        Optional<List<String>> u = u(zwd);
        if (u.isPresent()) {
            this.d.onNext(new RestrictedMediaAction(RestrictedMediaAction.Type.SKIP_NEXT, u.get()));
        }
    }
}
