package defpackage;

import com.spotify.accountrecovery.api.models.MagicLinkRequestBody;
import com.spotify.accountrecovery.api.models.SetPasswordRequestBody;
import io.reactivex.z;
import retrofit2.v;

/* renamed from: k70  reason: default package */
public interface k70 {
    @erf({"No-Webgate-Authentication: true"})
    @irf("accountrecovery/v3/magiclink/")
    z<v<String>> a(@uqf MagicLinkRequestBody magicLinkRequestBody);

    @jrf("accountrecovery/v2/password/")
    z<v<String>> b(@uqf SetPasswordRequestBody setPasswordRequestBody);
}
