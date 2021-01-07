package defpackage;

import com.spotify.music.features.profile.proto.ArtistlistResponse$ArtistList;
import com.spotify.music.features.profile.proto.PlaylistlistResponse$PlaylistList;
import com.spotify.music.features.profile.proto.ProfilelistResponse$SmallProfileList;
import com.spotify.music.features.profile.proto.ProfilemodelRequest$Profile;
import io.reactivex.z;
import retrofit2.v;

/* renamed from: vo7  reason: default package */
public interface vo7 {
    @erf({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @zqf("user-profile-view/v3/profile/{username}/following")
    z<v<ProfilelistResponse$SmallProfileList>> a(@mrf("username") String str);

    @erf({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @zqf("user-profile-view/v3/profile/{username}/artists")
    z<v<ArtistlistResponse$ArtistList>> b(@mrf("username") String str);

    @erf({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @zqf("user-profile-view/v3/profile/{username}/followers")
    z<v<ProfilelistResponse$SmallProfileList>> c(@mrf("username") String str);

    @erf({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @zqf("user-profile-view/v3/profile/{username}/playlists")
    z<v<PlaylistlistResponse$PlaylistList>> d(@mrf("username") String str);

    @erf({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @zqf("user-profile-view/v3/profile/{username}")
    z<v<ProfilemodelRequest$Profile>> e(@mrf("username") String str);
}
