package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.n;

/* renamed from: a8c  reason: default package */
public final /* synthetic */ class a8c implements n {
    public static final /* synthetic */ a8c a = new a8c();

    private /* synthetic */ a8c() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        return ((PlayerState) obj).track().isPresent();
    }
}
