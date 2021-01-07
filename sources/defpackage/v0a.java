package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.l;
import java.util.Collections;

/* renamed from: v0a  reason: default package */
public final /* synthetic */ class v0a implements l {
    public static final /* synthetic */ v0a a = new v0a();

    private /* synthetic */ v0a() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Throwable th = (Throwable) obj;
        Logger.e(th, "Assisted Curation Recs Loader: failed to parse recs: %s", th.getMessage());
        return Collections.emptyList();
    }
}
