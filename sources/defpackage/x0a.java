package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.libs.assistedcuration.model.RecsResponse;
import io.reactivex.functions.l;
import java.util.Collections;

/* renamed from: x0a  reason: default package */
public final /* synthetic */ class x0a implements l {
    public static final /* synthetic */ x0a a = new x0a();

    private /* synthetic */ x0a() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Throwable th = (Throwable) obj;
        Logger.e(th, "Assisted Curation Recs Loader: failed to load recs: %s", th.getMessage());
        return RecsResponse.create(Collections.emptyList());
    }
}
