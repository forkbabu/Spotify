package defpackage;

import com.spotify.music.podcastinteractivity.proto.ClientPollResponse;
import com.spotify.music.podcastinteractivity.proto.ClientPollsForEntityResponse;
import com.spotify.music.podcastinteractivity.proto.PollVoteRequest;
import io.reactivex.z;

/* renamed from: stc  reason: default package */
public interface stc {
    @irf("podcast-creator-interactivity/v1/submit-poll-vote")
    z<ClientPollResponse> a(@uqf PollVoteRequest pollVoteRequest);

    @zqf("podcast-creator-interactivity/v1/polls/{entity-uri}")
    z<ClientPollsForEntityResponse> b(@mrf("entity-uri") String str);
}
