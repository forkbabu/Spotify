package defpackage;

import com.spotify.music.features.entityselector.proto.EntitySelector$CarePackageTracksResponse;
import io.reactivex.z;

/* renamed from: h05  reason: default package */
public interface h05 {
    @zqf("/care-package/v1/track-plays")
    z<EntitySelector$CarePackageTracksResponse> a();
}
