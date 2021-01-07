package defpackage;

import com.spotify.mobile.android.spotlets.bixbyhomecards.models.RecommendedPlaylistsResponse;
import io.reactivex.functions.l;

/* renamed from: vs1  reason: default package */
public final /* synthetic */ class vs1 implements l {
    public final /* synthetic */ bt1 a;

    public /* synthetic */ vs1(bt1 bt1) {
        this.a = bt1;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return bt1.b(this.a, (RecommendedPlaylistsResponse) obj);
    }
}
