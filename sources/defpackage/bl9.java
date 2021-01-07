package defpackage;

import com.spotify.music.freetiercommon.models.RemainingSkips;
import io.reactivex.functions.n;

/* renamed from: bl9  reason: default package */
public final /* synthetic */ class bl9 implements n {
    public static final /* synthetic */ bl9 a = new bl9();

    private /* synthetic */ bl9() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        RemainingSkips remainingSkips = (RemainingSkips) obj;
        return 3 == remainingSkips.getRemainingSkips() || remainingSkips.getRemainingSkips() == 0;
    }
}
