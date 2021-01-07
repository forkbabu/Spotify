package defpackage;

import com.spotify.cosmos.android.cosmonaut.CosmosService;
import com.spotify.cosmos.android.cosmonaut.annotations.Body;
import com.spotify.cosmos.android.cosmonaut.annotations.POST;
import com.spotify.cosmos.android.cosmonaut.annotations.SUB;
import com.spotify.cosmos.router.Response;
import com.spotify.music.libs.profile.proto.ChangeDisplaynameRequest$ChangeDisplayNameRequest;
import com.spotify.music.libs.profile.proto.ProfilesRequest$GetProfilesRequest;
import io.reactivex.s;
import io.reactivex.z;

@CosmosService
/* renamed from: cqa  reason: default package */
public interface cqa {
    @SUB("sp://core-profile/v1/profiles?responseFormat=protobuf")
    s<Response> a(@Body ProfilesRequest$GetProfilesRequest profilesRequest$GetProfilesRequest);

    @POST("sp://core-profile/v1/change_display_name?responseFormat=protobuf")
    z<Response> b(@Body ChangeDisplaynameRequest$ChangeDisplayNameRequest changeDisplaynameRequest$ChangeDisplayNameRequest);
}
