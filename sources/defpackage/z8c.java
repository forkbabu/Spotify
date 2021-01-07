package defpackage;

import com.spotify.music.limitedofflineendpoints.api.UserMixDataSource;
import io.reactivex.f;
import io.reactivex.functions.g;

/* renamed from: z8c  reason: default package */
public final /* synthetic */ class z8c implements g {
    public final /* synthetic */ d9c a;
    public final /* synthetic */ String b;
    public final /* synthetic */ f c;

    public /* synthetic */ z8c(d9c d9c, String str, f fVar) {
        this.a = d9c;
        this.b = str;
        this.c = fVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.b(this.b, this.c, (UserMixDataSource.TrackState) obj);
    }
}
