package defpackage;

import com.spotify.podcastinteractivity.qna.model.proto.QAndA;
import com.spotify.podcastinteractivity.qna.model.proto.ResponseRequest;
import com.spotify.podcastinteractivity.qna.model.proto.UserStatus;
import io.reactivex.z;

/* renamed from: jvc  reason: default package */
public interface jvc {
    @irf("podcast-creator-interactivity/v1/q-and-a/episode/{entity-uri}/response")
    z<QAndA> a(@mrf("entity-uri") String str, @uqf ResponseRequest responseRequest);

    @zqf("podcast-creator-interactivity/v1/q-and-a/episode/{entity-uri}")
    z<QAndA> b(@mrf("entity-uri") String str);

    @irf("podcast-creator-interactivity/v1/education")
    z<UserStatus> c();

    @vqf("podcast-creator-interactivity/v1/q-and-a/episode/{episode-uri}/response")
    z<QAndA> d(@mrf("episode-uri") String str);
}
