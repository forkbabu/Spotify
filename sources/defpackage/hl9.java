package defpackage;

import com.spotify.mobile.android.util.l0;
import com.spotify.player.model.PlayerState;
import io.reactivex.functions.n;

/* renamed from: hl9  reason: default package */
public final /* synthetic */ class hl9 implements n {
    public static final /* synthetic */ hl9 a = new hl9();

    private /* synthetic */ hl9() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        int ordinal = l0.z(((PlayerState) obj).contextUri()).q().ordinal();
        return ordinal == 180 || ordinal == 185 || ordinal == 210 || ordinal == 272;
    }
}
