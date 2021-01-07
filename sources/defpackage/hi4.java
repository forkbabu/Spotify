package defpackage;

import com.spotify.carepackage.proto.CarePackage$CarePackagePlaylistResponse;
import io.reactivex.z;

/* renamed from: hi4  reason: default package */
public interface hi4 {
    @jrf("/care-package/v1/add-playlist-to-library")
    z<CarePackage$CarePackagePlaylistResponse> a(@nrf("playlistUri") String str);

    @zqf("/care-package/v1/playlist")
    z<CarePackage$CarePackagePlaylistResponse> b(@nrf("campaignId") String str);
}
