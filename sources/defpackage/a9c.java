package defpackage;

import com.spotify.music.limitedofflineendpoints.api.UserMixDataSource;
import io.reactivex.f;
import io.reactivex.functions.g;

/* renamed from: a9c  reason: default package */
public final /* synthetic */ class a9c implements g {
    public final /* synthetic */ d9c a;
    public final /* synthetic */ String b;
    public final /* synthetic */ f c;

    public /* synthetic */ a9c(d9c d9c, String str, f fVar) {
        this.a = d9c;
        this.b = str;
        this.c = fVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.a(this.b, this.c, (UserMixDataSource.TrackState) obj);
    }
}
