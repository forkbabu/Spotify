package com.spotify.music.features.blendinvitation.api;

import io.reactivex.z;

public interface b {
    @irf("blend-invitation/v1/generate")
    z<InvitationUrl> a();
}
