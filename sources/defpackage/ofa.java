package defpackage;

import com.spotify.player.controls.c;
import com.spotify.player.controls.d;
import com.spotify.player.model.PlayerState;
import com.spotify.remoteconfig.f8;
import com.spotify.rxjava2.q;
import io.reactivex.functions.g;
import io.reactivex.y;
import kotlin.jvm.internal.h;

/* renamed from: ofa  reason: default package */
public final class ofa implements nfa {
    private final q a;
    private PlayerState b;
    private PlayerState c;
    private final d d;
    private final vd3 e;
    private final y f;

    /* renamed from: ofa$a */
    static final class a<T> implements g<PlayerState> {
        final /* synthetic */ ofa a;

        a(ofa ofa) {
            this.a = ofa;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(PlayerState playerState) {
            this.a.b = playerState;
        }
    }

    public ofa(d dVar, vd3 vd3, y yVar, f8 f8Var, io.reactivex.g<PlayerState> gVar) {
        h.e(dVar, "playerControls");
        h.e(vd3, "trackRowInteractionListener");
        h.e(yVar, "ioScheduler");
        h.e(f8Var, "trackPreviewProperties");
        h.e(gVar, "playerState");
        this.d = dVar;
        this.e = vd3;
        this.f = yVar;
        q qVar = new q();
        this.a = qVar;
        PlayerState playerState = PlayerState.EMPTY;
        this.b = playerState;
        this.c = playerState;
        if (f8Var.b()) {
            qVar.a(gVar.subscribe(new a(this)));
        }
    }

    @Override // defpackage.nfa
    public PlayerState a() {
        PlayerState playerState = this.c;
        h.d(playerState, "previousPlayerState");
        return playerState;
    }

    @Override // defpackage.nfa
    public void b() {
        this.a.a(this.d.a(c.e()).H(this.f).subscribe());
    }

    @Override // defpackage.nfa
    public void c() {
        this.c = this.b;
    }

    @Override // defpackage.nfa
    public void clear() {
        this.a.c();
    }

    @Override // defpackage.nfa
    public void d(s81 s81) {
        h.e(s81, "hubsComponentModel");
        this.e.c(s81);
    }
}
