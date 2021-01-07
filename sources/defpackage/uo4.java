package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.g;

/* renamed from: uo4  reason: default package */
public final /* synthetic */ class uo4 implements g {
    public final /* synthetic */ fp4 a;

    public /* synthetic */ uo4(fp4 fp4) {
        this.a = fp4;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.o((PlayerState) obj);
    }
}
