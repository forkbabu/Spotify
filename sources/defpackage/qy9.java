package defpackage;

import com.spotify.music.libs.ageverification.model.AgeVerificationDialogModel;
import io.reactivex.z;

/* renamed from: qy9  reason: default package */
public interface qy9 {
    @zqf("age-verification/v1/dialog/{entityURI}")
    z<AgeVerificationDialogModel> a(@mrf("entityURI") String str, @nrf("staging") boolean z);
}
