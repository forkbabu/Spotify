package com.spotify.music.features.playlistentity.story.header;

import com.spotify.stories.v1.header.proto.GetStoryHeaderResponse;
import io.reactivex.z;

public interface g0 {
    @erf({"Accept: application/protobuf"})
    @zqf("stories-view/v1/stories/header")
    z<GetStoryHeaderResponse> a(@nrf("uri") String str);
}
