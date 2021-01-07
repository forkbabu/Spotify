package com.spotify.music.follow;

import com.spotify.cosmos.router.Request;
import com.spotify.music.follow.resolver.RxFollowersCountResolver;
import io.reactivex.z;
import okhttp3.e0;
import retrofit2.v;

public interface o {
    @irf("socialgraph/v2/counts?format=json")
    z<RxFollowersCountResolver.Counts> a(@uqf p pVar);

    @brf(hasBody = true, method = Request.DELETE, path = "socialgraph/v2/following?format=json")
    z<v<e0>> b(@uqf p pVar);

    @irf("socialgraph/v2/dismissed?format=json")
    z<v<e0>> c(@uqf p pVar);

    @irf("socialgraph/v2/following?format=json")
    z<v<e0>> d(@uqf p pVar);

    @brf(hasBody = true, method = Request.DELETE, path = "socialgraph/v2/dismissed?format=json")
    z<v<e0>> e(@uqf p pVar);
}
