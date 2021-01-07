package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.features.ads.model.Targetings;
import io.reactivex.observers.a;

/* renamed from: ju3  reason: default package */
public class ju3 extends a<Targetings> {
    @Override // io.reactivex.x, io.reactivex.c
    public void onComplete() {
        Logger.b("Ad Targeting - request for updating targeting information completed", new Object[0]);
    }

    @Override // io.reactivex.x, io.reactivex.c
    public void onError(Throwable th) {
        Logger.b("Ad Targeting - Error in making request to targeting endpoint: %s", th.getMessage());
    }

    @Override // io.reactivex.x
    public void onNext(Object obj) {
        Targetings targetings = (Targetings) obj;
        Logger.b("Ad Targeting - Targeting information posted successfully", new Object[0]);
    }
}
