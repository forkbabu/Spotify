package defpackage;

import com.spotify.mobile.android.storylines.model.StorylinesCardContent;
import com.spotify.mobile.android.storylines.model.StorylinesUris;
import io.reactivex.z;

/* renamed from: ajd  reason: default package */
public interface ajd {
    @zqf("artist-storylines-view/v0/storylines/entity/{entityUri}/size/default")
    z<StorylinesCardContent> a(@mrf("entityUri") String str);

    @zqf("artist-storylines-view/v0/storylines/entities")
    z<StorylinesUris> b();
}
