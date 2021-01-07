package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.l;
import java.util.Collections;

/* renamed from: s0a  reason: default package */
public final /* synthetic */ class s0a implements l {
    public static final /* synthetic */ s0a a = new s0a();

    private /* synthetic */ s0a() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Throwable th = (Throwable) obj;
        Logger.e(th, "Assisted Curation Genres Loader: failed to parse genres: %s", th.getMessage());
        return Collections.emptyList();
    }
}
