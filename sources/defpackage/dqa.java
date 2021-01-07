package defpackage;

import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.android.CosmosException;
import com.spotify.cosmos.router.Response;
import com.spotify.music.libs.profile.proto.ChangeDisplaynameRequest$ChangeDisplayNameRequest;
import com.spotify.music.libs.profile.proto.IdentityV3$Image;
import com.spotify.music.libs.profile.proto.IdentityV3$UserProfile;
import com.spotify.music.libs.profile.proto.ProfilesRequest$GetProfilesRequest;
import io.reactivex.a;
import io.reactivex.d0;
import io.reactivex.internal.operators.completable.i;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.z;
import java.util.Locale;

/* renamed from: dqa  reason: default package */
public class dqa implements bqa {
    private final cqa a;

    public dqa(cqa cqa) {
        this.a = cqa;
    }

    private static Optional<CosmosException> c(int i) {
        if (i >= 200 && i <= 299) {
            return Optional.absent();
        }
        Logger.d("profile: core-profile responded with %d", Integer.valueOf(i));
        return Optional.of(new CosmosException(String.format(Locale.getDefault(), "Failed with status code %d", Integer.valueOf(i))));
    }

    public static String d(IdentityV3$UserProfile identityV3$UserProfile) {
        String str = null;
        int i = 0;
        for (int i2 = 0; i2 < identityV3$UserProfile.m(); i2++) {
            IdentityV3$Image l = identityV3$UserProfile.l(i2);
            int i3 = l.i() * l.h();
            if (i3 > i) {
                str = l.l();
                i = i3;
            }
        }
        return str;
    }

    static /* synthetic */ d0 e(Response response) {
        Optional<CosmosException> c = c(response.getStatus());
        if (c.isPresent()) {
            return z.q(c.get());
        }
        return z.z(response);
    }

    static /* synthetic */ v f(Response response) {
        Optional<CosmosException> c = c(response.getStatus());
        if (c.isPresent()) {
            return s.P(c.get());
        }
        return s.i0(response);
    }

    @Override // defpackage.bqa
    public s<IdentityV3$UserProfile> a(String str) {
        ProfilesRequest$GetProfilesRequest.a i = ProfilesRequest$GetProfilesRequest.i();
        i.m(str);
        return s.b1(s.b1(s.b1(this.a.a((ProfilesRequest$GetProfilesRequest) i.build()).w(ypa.a)).w(aqa.a)).Q(xpa.a).j0(vpa.a));
    }

    @Override // defpackage.bqa
    public a b(String str, String str2) {
        ChangeDisplaynameRequest$ChangeDisplayNameRequest.a l = ChangeDisplaynameRequest$ChangeDisplayNameRequest.l();
        l.n(str);
        l.m(str2);
        return new i(this.a.b((ChangeDisplaynameRequest$ChangeDisplayNameRequest) l.build()).f(zpa.a));
    }
}
