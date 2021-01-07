package defpackage;

import com.spotify.music.libs.profile.proto.ProfilesResponse$GetProfilesResponse;
import io.reactivex.functions.n;

/* renamed from: xpa  reason: default package */
public final /* synthetic */ class xpa implements n {
    public static final /* synthetic */ xpa a = new xpa();

    private /* synthetic */ xpa() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        return ((ProfilesResponse$GetProfilesResponse) obj).i() > 0;
    }
}
