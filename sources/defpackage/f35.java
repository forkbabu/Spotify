package defpackage;

import com.spotify.music.features.followfeed.network.DismissRequest;
import io.reactivex.a;
import io.reactivex.z;

/* renamed from: f35  reason: default package */
public interface f35 {
    @irf("feed-follow-recommendations/v1/dismiss")
    a a(@uqf DismissRequest dismissRequest);

    @zqf("feed-service/v1/has-new-items")
    z<m35> b(@nrf("beforeItemId") String str);

    @zqf("feed-service/v1/feed?format=json")
    z<k35> c(@nrf("afterItemId") String str);
}
