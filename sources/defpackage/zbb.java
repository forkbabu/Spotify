package defpackage;

import com.spotify.music.limitedofflineendpoints.api.UserMixDataSource;
import io.reactivex.functions.l;
import retrofit2.HttpException;

/* renamed from: zbb  reason: default package */
public final /* synthetic */ class zbb implements l {
    public final /* synthetic */ acb a;

    public /* synthetic */ zbb(acb acb) {
        this.a = acb;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Throwable th = (Throwable) obj;
        this.a.getClass();
        UserMixDataSource.TrackState trackState = UserMixDataSource.TrackState.ERROR;
        return (!(th instanceof HttpException) || ((HttpException) th).a() != 403) ? trackState : UserMixDataSource.TrackState.DENIED;
    }
}
