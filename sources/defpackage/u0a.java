package defpackage;

import com.spotify.music.libs.assistedcuration.model.RecentlyPlayedTracksResponse;
import io.reactivex.functions.l;
import java.util.Collections;

/* renamed from: u0a  reason: default package */
public final /* synthetic */ class u0a implements l {
    public static final /* synthetic */ u0a a = new u0a();

    private /* synthetic */ u0a() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Throwable th = (Throwable) obj;
        return RecentlyPlayedTracksResponse.create(Collections.emptyList());
    }
}
