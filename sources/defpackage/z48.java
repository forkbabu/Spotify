package defpackage;

import com.spotify.cosmos.router.Response;
import io.reactivex.z;

/* renamed from: z48  reason: default package */
public interface z48 {
    @jrf("crowd-statements-api/v0/report-not-explicit/{trackUri}")
    z<Response> a(@mrf("trackUri") String str, @nrf("context") String str2);

    @jrf("crowd-statements-api/v0/report-explicit/{trackUri}")
    z<Response> b(@mrf("trackUri") String str, @nrf("context") String str2);
}
