package defpackage;

import io.reactivex.a;
import retrofit2.b;

/* renamed from: lrd  reason: default package */
public interface lrd {
    @zqf("on-demand-sharing/v1/verify/uri/{uri}/share-id/{shareId}")
    a a(@mrf("uri") String str, @mrf("shareId") String str2, @nrf("linkSource") String str3);

    @irf("on-demand-sharing/v1/register/uri/{uri}/share-id/{shareId}")
    b<Void> b(@mrf("uri") String str, @mrf("shareId") String str2);
}
