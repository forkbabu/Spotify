package defpackage;

import android.support.v4.media.RatingCompat;
import com.spotify.player.model.PlayerState;
import io.reactivex.functions.l;

/* renamed from: yw8  reason: default package */
public final /* synthetic */ class yw8 implements l {
    public final /* synthetic */ zx8 a;
    public final /* synthetic */ RatingCompat b;

    public /* synthetic */ yw8(zx8 zx8, RatingCompat ratingCompat) {
        this.a = zx8;
        this.b = ratingCompat;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.a(this.b, (PlayerState) obj);
    }
}
