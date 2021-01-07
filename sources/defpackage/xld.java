package defpackage;

import android.media.MediaPlayer;
import com.google.common.base.Optional;
import com.spotify.player.controls.c;
import com.spotify.player.controls.d;
import com.spotify.player.model.PlayerState;
import io.reactivex.a;
import io.reactivex.e;
import io.reactivex.g;
import io.reactivex.internal.operators.completable.b;
import io.reactivex.internal.operators.completable.i;
import io.reactivex.y;
import io.reactivex.z;
import java.io.IOException;

/* renamed from: xld  reason: default package */
public class xld {
    private final vld a;
    private final y b;
    private final zld c;
    private final t92 d;
    private final g<PlayerState> e;
    private final d f;
    private final cqe g;

    public xld(vld vld, y yVar, zld zld, g<PlayerState> gVar, d dVar, t92 t92, cqe cqe) {
        this.a = vld;
        this.b = yVar;
        this.c = zld;
        this.d = t92;
        this.e = gVar;
        this.f = dVar;
        this.g = cqe;
    }

    private static boolean b(PlayerState playerState) {
        return playerState.isPlaying() && playerState.isPaused() && playerState.track().isPresent() && kxd.i(playerState.track().get());
    }

    private static boolean c(PlayerState playerState) {
        return playerState.isPlaying() && !playerState.isPaused() && playerState.track().isPresent() && kxd.i(playerState.track().get());
    }

    public a a(String str) {
        return this.e.E().t(new tld(this, str)).G(this.b);
    }

    public e d(String str, PlayerState playerState) {
        a aVar;
        e eVar = b.a;
        if (c(playerState)) {
            long constrainToRange = rw.constrainToRange(playerState.position(this.g.d()).or((Optional<Long>) 0L).longValue() - 5000, 0, playerState.duration().or((Optional<Long>) 0L).longValue());
            z<zwd> a2 = this.f.a(c.c());
            a2.getClass();
            z<zwd> a3 = this.f.a(c.g(constrainToRange));
            a3.getClass();
            aVar = a.k(new i(a2), new i(a3));
        } else if (b(playerState)) {
            aVar = eVar;
        } else {
            aVar = a.u(new rld(this));
        }
        if (c(playerState)) {
            z<zwd> a4 = this.f.a(c.e());
            a4.getClass();
            eVar = new i(a4);
        } else if (!b(playerState)) {
            eVar = a.u(new nld(this));
        }
        return aVar.d(a.m(new qld(this, str))).B().d(eVar);
    }

    public void e(String str, io.reactivex.b bVar) {
        try {
            this.a.getClass();
            MediaPlayer mediaPlayer = new MediaPlayer();
            mediaPlayer.setDataSource(str);
            mediaPlayer.setOnErrorListener(pld.a);
            mediaPlayer.setOnCompletionListener(new sld(bVar));
            bVar.e(new mld(mediaPlayer));
            mediaPlayer.prepare();
            mediaPlayer.start();
        } catch (IOException e2) {
            bVar.f(e2);
        }
    }

    public /* synthetic */ void f() {
        this.d.b(200, 0.01f);
    }

    public /* synthetic */ void g() {
        this.d.a(200);
    }

    public a h(String str) {
        return a.m(new qld(this, str)).G(this.b);
    }

    public a i(String str) {
        return this.c.a(str).A(old.a).t(new uld(this));
    }
}
