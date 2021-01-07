package defpackage;

import com.google.protobuf.InvalidProtocolBufferException;
import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.router.Response;
import com.spotify.music.libs.profile.proto.ProfilesResponse$GetProfilesResponse;
import io.reactivex.functions.l;
import io.reactivex.s;

/* renamed from: aqa  reason: default package */
public final /* synthetic */ class aqa implements l {
    public static final /* synthetic */ aqa a = new aqa();

    private /* synthetic */ aqa() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        try {
            return s.i0(ProfilesResponse$GetProfilesResponse.l(((Response) obj).getBody()));
        } catch (InvalidProtocolBufferException e) {
            Logger.d("profile: failed to parse protobuf", new Object[0]);
            return s.P(e);
        }
    }
}
