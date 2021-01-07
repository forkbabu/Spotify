package com.spotify.music.podcastinteractivity.qna.overlay;

import com.spotify.music.libs.profile.proto.IdentityV3$UserProfile;
import com.spotify.podcastinteractivity.qna.model.proto.Prompt;
import com.spotify.podcastinteractivity.qna.model.proto.Response;
import com.spotify.podcastinteractivity.qna.model.proto.ShowMetadata;

public interface b {
    void C1();

    void F1();

    void M1(Response response);

    void S1(ShowMetadata showMetadata);

    void a2();

    void o0(String str);

    void t1(IdentityV3$UserProfile identityV3$UserProfile);

    void v(Prompt prompt);

    void v1(boolean z);
}
