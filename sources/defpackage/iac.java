package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.n;

/* renamed from: iac  reason: default package */
public final /* synthetic */ class iac implements n {
    public static final /* synthetic */ iac a = new iac();

    private /* synthetic */ iac() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        return ((PlayerState) obj).playOrigin().featureClasses().contains("social_play");
    }
}
