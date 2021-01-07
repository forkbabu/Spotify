package defpackage;

import com.google.common.base.Optional;
import com.spotify.player.model.ContextTrack;
import io.reactivex.functions.l;
import io.reactivex.g;

/* renamed from: up1  reason: default package */
public final /* synthetic */ class up1 implements l {
    public static final /* synthetic */ up1 a = new up1();

    private /* synthetic */ up1() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Optional optional = (Optional) obj;
        if (optional.isPresent()) {
            return g.N(Boolean.valueOf(kxd.f((ContextTrack) optional.get())));
        }
        return g.N(Boolean.FALSE);
    }
}
