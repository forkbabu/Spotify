package defpackage;

import io.reactivex.z;
import okhttp3.e0;
import retrofit2.v;

/* renamed from: q1d  reason: default package */
public interface q1d {
    @zqf("publish/canvas/{link}")
    z<v<e0>> a(@mrf("link") String str);

    @zqf("publish/v1/preview/{link}")
    z<v<e0>> b(@mrf("link") String str);

    @zqf("publish/{service}/{link}")
    z<v<e0>> c(@mrf("service") String str, @mrf("link") String str2);
}
