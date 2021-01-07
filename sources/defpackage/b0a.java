package defpackage;

import com.spotify.music.libs.assistedcuration.model.RecsRequest;
import com.spotify.music.libs.assistedcuration.model.RecsResponse;
import io.reactivex.z;

/* renamed from: b0a  reason: default package */
public interface b0a {
    @irf("playlistextender/ft/v2/assist-curation")
    z<RecsResponse> a(@uqf RecsRequest recsRequest);
}
