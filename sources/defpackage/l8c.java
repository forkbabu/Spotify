package defpackage;

import com.spotify.music.offline.OfflineErrorResponse;
import io.reactivex.functions.l;

/* renamed from: l8c  reason: default package */
public final /* synthetic */ class l8c implements l {
    public static final /* synthetic */ l8c a = new l8c();

    private /* synthetic */ l8c() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return ((OfflineErrorResponse) obj).toOfflineError();
    }
}
