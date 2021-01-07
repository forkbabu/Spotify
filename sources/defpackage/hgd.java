package defpackage;

import com.spotify.music.spotlets.scannables.model.IdModel;
import io.reactivex.z;

/* renamed from: hgd  reason: default package */
public interface hgd {
    @zqf("scannable-id/id/{pathUri}?format=json")
    z<IdModel> a(@mrf("pathUri") String str);
}
