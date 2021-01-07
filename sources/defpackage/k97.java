package defpackage;

import com.google.common.collect.ImmutableList;
import com.spotify.music.features.podcast.episode.t0;
import com.spotify.paste.widgets.b;
import com.spotify.player.controls.c;
import com.spotify.player.controls.d;
import com.spotify.player.model.Context;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.player.play.f;
import io.reactivex.g;
import io.reactivex.z;

/* renamed from: k97  reason: default package */
public class k97 implements j97 {
    private final g<PlayerState> a;
    private final d b;
    private final lxd c;
    private final f d;

    /* access modifiers changed from: private */
    /* renamed from: k97$a */
    public static class a {
        final String a;
        final boolean b;

        private a(String str, boolean z, String str2) {
            this.b = z;
            this.a = str2;
        }

        static a a(PlayerState playerState) {
            String e = b.e(playerState);
            return new a(e, !e.isEmpty() && playerState.isPlaying() && !playerState.isPaused(), t0.a(playerState));
        }
    }

    public k97(g<PlayerState> gVar, lxd lxd, f fVar, d dVar) {
        this.c = lxd;
        this.a = gVar;
        this.b = dVar;
        this.d = fVar;
    }

    @Override // defpackage.j97
    public g<zwd> a(String str, long j) {
        return this.a.h0(1).O(e97.a).F(new g97(this, str, j));
    }

    public tpf b(String str, long j, a aVar) {
        z<zwd> zVar;
        lxd lxd = this.c;
        f fVar = this.d;
        d dVar = this.b;
        if (!str.equals(aVar.a)) {
            zVar = fVar.a(lxd.a(Context.fromTrackUris(str, ImmutableList.of(str))).options(PreparePlayOptions.builder().seekTo(Long.valueOf(j)).build()).build());
        } else if (aVar.b) {
            zVar = dVar.a(c.g(j));
        } else {
            zVar = dVar.a(c.g(j)).s(new f97(dVar));
        }
        return zVar.N();
    }
}
