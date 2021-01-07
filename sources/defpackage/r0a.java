package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.libs.assistedcuration.model.GenreResponse;
import io.reactivex.functions.l;
import java.util.Collections;

/* renamed from: r0a  reason: default package */
public final /* synthetic */ class r0a implements l {
    public static final /* synthetic */ r0a a = new r0a();

    private /* synthetic */ r0a() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Throwable th = (Throwable) obj;
        Logger.e(th, "Assisted Curation Genres Loader: failed to load genres: %s", th.getMessage());
        return new GenreResponse(Collections.emptyList());
    }
}
