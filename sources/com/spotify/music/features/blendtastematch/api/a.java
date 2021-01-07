package com.spotify.music.features.blendtastematch.api;

import io.reactivex.z;
import retrofit2.v;

public interface a {
    @jrf("blend-invitation/v1/join/{invitationToken}")
    z<Join> a(@mrf("invitationToken") String str);

    @zqf("blend-invitation/v1/taste-match/{invitationToken}")
    z<v<TasteMatch>> b(@mrf("invitationToken") String str);
}
