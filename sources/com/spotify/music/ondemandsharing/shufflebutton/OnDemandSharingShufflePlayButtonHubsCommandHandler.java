package com.spotify.music.ondemandsharing.shufflebutton;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.m;
import androidx.lifecycle.n;
import androidx.lifecycle.w;
import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.player.controls.c;
import com.spotify.player.controls.d;
import com.spotify.player.model.Context;
import com.spotify.player.model.ContextPage;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.command.PlayCommand;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.player.play.f;
import com.spotify.rxjava2.q;
import io.reactivex.g;
import java.util.List;
import java.util.Map;

public class OnDemandSharingShufflePlayButtonHubsCommandHandler implements a71 {
    public static final /* synthetic */ int o = 0;
    private final f a;
    private final PlayOrigin b;
    private final d c;
    private final q f = new q();
    private PlayerState n = PlayerState.EMPTY;

    public OnDemandSharingShufflePlayButtonHubsCommandHandler(final g<PlayerState> gVar, f fVar, PlayOrigin playOrigin, d dVar, n nVar) {
        fVar.getClass();
        this.a = fVar;
        this.b = playOrigin.toBuilder().featureClasses(ImmutableSet.of("social_play")).build();
        dVar.getClass();
        this.c = dVar;
        nVar.A().a(new m() {
            /* class com.spotify.music.ondemandsharing.shufflebutton.OnDemandSharingShufflePlayButtonHubsCommandHandler.AnonymousClass1 */

            @w(Lifecycle.Event.ON_PAUSE)
            public void onPause() {
                OnDemandSharingShufflePlayButtonHubsCommandHandler.this.f.c();
            }

            @w(Lifecycle.Event.ON_RESUME)
            public void onResume() {
                OnDemandSharingShufflePlayButtonHubsCommandHandler.this.f.a(gVar.subscribe(new a(this)));
            }
        });
    }

    @Override // defpackage.a71
    public void b(o81 o81, n61 n61) {
        String string = o81.data().string("uri");
        if (string != null) {
            PlayerState playerState = this.n;
            boolean z = true;
            if (playerState.contextUri().equals(string) && playerState.isPlaying() && !playerState.isPaused()) {
                this.f.a(this.c.a(c.c()).subscribe());
                return;
            }
            PlayerState playerState2 = this.n;
            if (!playerState2.contextUri().equals(string) || !playerState2.isPaused() || !playerState2.isPlaying()) {
                z = false;
            }
            if (z) {
                this.f.a(this.c.a(c.e()).subscribe());
                return;
            }
            Context a2 = f51.a(o81.data());
            if (a2 != null) {
                this.f.a(this.a.a(PlayCommand.builder(a2.toBuilder().metadata((Map<String, String>) ImmutableMap.builder().putAll(Collections2.filterEntries(a2.metadata(), b.a)).mo51put(PlayerTrack.Metadata.MFT_UNPLAYABLE_POLICY, "replace").build()).pages(ImmutableList.of(ContextPage.builder().tracks((List<ContextTrack>) ImmutableList.of(ContextTrack.builder(a2.uri()).metadata(ImmutableMap.of(ContextTrack.Metadata.KEY_PROVIDER, "social_ondemand")).build())).build())).build(), this.b).options(PreparePlayOptions.builder().suppressions(ImmutableSet.of("mft/inject_random_tracks")).build()).build()).subscribe());
            }
        }
    }
}
