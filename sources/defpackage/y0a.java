package defpackage;

import com.spotify.music.libs.assistedcuration.model.RecsResponse;
import com.spotify.music.libs.assistedcuration.model.e;
import io.reactivex.functions.l;

/* renamed from: y0a  reason: default package */
public final /* synthetic */ class y0a implements l {
    public static final /* synthetic */ y0a a = new y0a();

    private /* synthetic */ y0a() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return e.b(((RecsResponse) obj).getRecommendedTracks());
    }
}
