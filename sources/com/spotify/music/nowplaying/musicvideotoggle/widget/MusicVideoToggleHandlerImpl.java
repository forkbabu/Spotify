package com.spotify.music.nowplaying.musicvideotoggle.widget;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.UnmodifiableListIterator;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.player.controls.c;
import com.spotify.player.controls.d;
import com.spotify.player.model.Context;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.command.PlayCommand;
import com.spotify.player.model.command.SkipToPrevTrackCommand;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.player.model.command.options.SkipToPrevTrackOptions;
import com.spotify.player.model.command.options.SkipToTrack;
import com.spotify.player.play.f;
import com.spotify.rxjava2.q;
import io.reactivex.g;
import io.reactivex.subjects.PublishSubject;
import io.reactivex.z;
import java.util.ArrayList;
import java.util.Collection;

public class MusicVideoToggleHandlerImpl implements e {
    private final f a;
    private final q b = new q();
    private final d c;
    private final g<PlayerState> d;
    private final szb e;
    private PlayerState f = PlayerState.EMPTY;
    private final cqe g;
    private final PublishSubject<Boolean> h = PublishSubject.h1();
    private boolean i;

    /* access modifiers changed from: private */
    public enum PlayerSkip {
        NEXT,
        PREVIOUS,
        NONE
    }

    public MusicVideoToggleHandlerImpl(szb szb, g<PlayerState> gVar, f fVar, d dVar, cqe cqe) {
        this.e = szb;
        this.a = fVar;
        this.c = dVar;
        this.g = cqe;
        this.d = gVar;
    }

    private PlayCommand e(PlayerSkip playerSkip) {
        String str;
        if (playerSkip == PlayerSkip.NEXT && !this.f.nextTracks().isEmpty()) {
            str = this.f.nextTracks().get(0).uri();
        } else if (playerSkip != PlayerSkip.PREVIOUS || this.f.prevTracks().isEmpty()) {
            str = this.f.track().isPresent() ? this.e.c(this.f.track().get().uri()) : null;
        } else {
            str = this.f.prevTracks().get(this.f.prevTracks().size() - 1).uri();
        }
        if (str != null && Boolean.valueOf(str.startsWith("spotify:episode")).booleanValue()) {
            str = this.e.c(str);
        }
        if (str == null) {
            return null;
        }
        ImmutableMap.Builder builder = ImmutableMap.builder();
        builder.mo51put(PlayerContext.Metadata.IS_MUSIC_VIDEO_CONTEXT, "false");
        return PlayCommand.builder(Context.fromUri(this.f.contextUri()).toBuilder().metadata(builder.build()).build(), this.f.playOrigin()).options(PreparePlayOptions.builder().skipTo(SkipToTrack.fromUri(str)).build()).build();
    }

    private static ImmutableList<String> f(ImmutableList<ContextTrack> immutableList) {
        ArrayList arrayList = new ArrayList(immutableList.size());
        UnmodifiableListIterator<ContextTrack> listIterator = immutableList.listIterator();
        while (listIterator.hasNext()) {
            arrayList.add(listIterator.next().uri());
        }
        return ImmutableList.copyOf((Collection) arrayList);
    }

    public static void g(MusicVideoToggleHandlerImpl musicVideoToggleHandlerImpl, PlayerState playerState) {
        musicVideoToggleHandlerImpl.f = playerState;
        if ("true".equals(playerState.contextMetadata().get(PlayerContext.Metadata.IS_MUSIC_VIDEO_CONTEXT))) {
            Optional<Long> position = playerState.position(playerState.timestamp());
            Optional<Long> duration = playerState.duration();
            if ((position.isPresent() || duration.isPresent()) && position.get().longValue() >= duration.get().longValue()) {
                musicVideoToggleHandlerImpl.h.onNext(Boolean.TRUE);
            }
        }
    }

    private z<zwd> i() {
        return this.c.a(c.l(SkipToPrevTrackCommand.builder().options(SkipToPrevTrackOptions.builder().allowSeeking(Boolean.TRUE).build()).build()));
    }

    private void j(PlayerSkip playerSkip) {
        PlayCommand e2 = e(playerSkip);
        if (e2 != null) {
            this.b.a(this.a.a(e2).p(new d(this)).subscribe());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0031, code lost:
        if ((r0.isPresent() && r0.get().longValue() > 2000) != false) goto L_0x0033;
     */
    @Override // com.spotify.music.nowplaying.musicvideotoggle.widget.e
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(boolean r6) {
        /*
            r5 = this;
            com.spotify.player.model.PlayerState r0 = r5.f
            java.lang.Boolean r0 = defpackage.iyb.h(r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0033
            com.spotify.player.model.PlayerState r0 = r5.f
            cqe r1 = r5.g
            long r1 = r1.d()
            com.google.common.base.Optional r0 = r0.position(r1)
            boolean r1 = r0.isPresent()
            if (r1 == 0) goto L_0x0030
            java.lang.Object r0 = r0.get()
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            r2 = 2000(0x7d0, double:9.88E-321)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x0030
            r0 = 1
            goto L_0x0031
        L_0x0030:
            r0 = 0
        L_0x0031:
            if (r0 == 0) goto L_0x0035
        L_0x0033:
            if (r6 == 0) goto L_0x0055
        L_0x0035:
            com.spotify.player.model.PlayerState r6 = r5.f
            com.google.common.collect.ImmutableList r6 = r6.prevTracks()
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L_0x004f
            com.spotify.rxjava2.q r6 = r5.b
            io.reactivex.z r0 = r5.i()
            io.reactivex.disposables.b r0 = r0.subscribe()
            r6.a(r0)
            goto L_0x0062
        L_0x004f:
            com.spotify.music.nowplaying.musicvideotoggle.widget.MusicVideoToggleHandlerImpl$PlayerSkip r6 = com.spotify.music.nowplaying.musicvideotoggle.widget.MusicVideoToggleHandlerImpl.PlayerSkip.PREVIOUS
            r5.j(r6)
            goto L_0x0062
        L_0x0055:
            com.spotify.rxjava2.q r6 = r5.b
            io.reactivex.z r0 = r5.i()
            io.reactivex.disposables.b r0 = r0.subscribe()
            r6.a(r0)
        L_0x0062:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.nowplaying.musicvideotoggle.widget.MusicVideoToggleHandlerImpl.a(boolean):void");
    }

    @Override // com.spotify.music.nowplaying.musicvideotoggle.widget.e
    public void b() {
        String b2;
        if (iyb.h(this.f).booleanValue()) {
            PlayCommand e2 = e(PlayerSkip.NONE);
            if (e2 != null) {
                this.b.a(this.a.a(e2).subscribe());
            }
        } else if (this.f.track().isPresent() && (b2 = this.e.b(this.f.track().get().uri())) != null) {
            ImmutableList<String> f2 = f(this.f.prevTracks());
            ImmutableList<String> f3 = f(this.f.nextTracks());
            ArrayList arrayList = new ArrayList(f2);
            arrayList.add(b2);
            arrayList.addAll(f3);
            ImmutableMap.Builder builder = ImmutableMap.builder();
            builder.mo51put(PlayerContext.Metadata.IS_MUSIC_VIDEO_CONTEXT, "true");
            this.b.a(this.a.a(PlayCommand.builder(Context.fromTrackUris(this.f.contextUri(), ImmutableList.copyOf((Collection) arrayList)).toBuilder().metadata(builder.build()).build(), PlayOrigin.create(kfd.u1.getName())).options(PreparePlayOptions.builder().skipTo(SkipToTrack.fromUri(b2)).build()).build()).subscribe());
        }
    }

    @Override // com.spotify.music.nowplaying.musicvideotoggle.widget.e
    public void c() {
        if (!this.i) {
            this.b.a(this.d.subscribe(new c(this)));
            this.b.a(this.h.E().subscribe(new b(this)));
            this.i = true;
        }
    }

    @Override // com.spotify.music.nowplaying.musicvideotoggle.widget.e
    public void clear() {
        this.b.c();
        this.i = false;
    }

    @Override // com.spotify.music.nowplaying.musicvideotoggle.widget.e
    public void d() {
        if (iyb.h(this.f).booleanValue()) {
            j(PlayerSkip.NEXT);
        } else {
            this.b.a(this.c.a(c.i()).subscribe());
        }
    }

    public /* synthetic */ void h(zwd zwd) {
        this.h.onNext(Boolean.FALSE);
    }
}
