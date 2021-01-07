package defpackage;

import com.spotify.music.limitedofflineendpoints.api.UserMixDataSource;
import io.reactivex.functions.l;

/* renamed from: s1a  reason: default package */
public final /* synthetic */ class s1a implements l {
    public final /* synthetic */ UserMixDataSource a;

    public /* synthetic */ s1a(UserMixDataSource userMixDataSource) {
        this.a = userMixDataSource;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.a((String) obj);
    }
}
