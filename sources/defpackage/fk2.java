package defpackage;

import com.spotify.music.behindthelyrics.model.business.TrackAnnotationSet;
import com.spotify.music.behindthelyrics.model.business.TracksAndResources;
import io.reactivex.z;

/* renamed from: fk2  reason: default package */
public interface fk2 {
    @zqf("annotations/v1/genius/enabled-tracks-and-resources")
    z<TracksAndResources> a();

    @zqf("annotations/v1/genius/track/{trackId}")
    z<TrackAnnotationSet> b(@mrf("trackId") String str);
}
