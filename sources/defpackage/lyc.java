package defpackage;

import io.reactivex.z;
import retrofit2.v;

/* renamed from: lyc  reason: default package */
public interface lyc {
    @erf({"Content-Type: application/jwt"})
    @zqf("external-user-accounts/v1/partner-userid-token/{partnerId}")
    z<v<String>> a(@mrf("partnerId") String str);
}
