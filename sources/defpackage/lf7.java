package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.g;
import io.reactivex.internal.operators.observable.v;
import io.reactivex.s;

/* renamed from: lf7  reason: default package */
public class lf7 {
    private final g<PlayerState> a;

    public lf7(g<PlayerState> gVar) {
        this.a = gVar;
    }

    public s<kf7> a() {
        return new v(this.a.O(hf7.a).s());
    }
}
