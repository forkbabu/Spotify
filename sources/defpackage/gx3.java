package defpackage;

import com.spotify.music.features.album.offline.model.OfflineTrack;
import com.spotify.music.features.album.offline.model.TracksOfflineState;
import com.spotify.playlist.models.offline.a;
import io.reactivex.functions.l;
import java.util.ArrayList;
import java.util.List;

/* renamed from: gx3  reason: default package */
public final /* synthetic */ class gx3 implements l {
    public static final /* synthetic */ gx3 a = new gx3();

    private /* synthetic */ gx3() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        int i = ly3.c;
        List<OfflineTrack> tracks = ((TracksOfflineState) obj).getTracks();
        ArrayList arrayList = new ArrayList(tracks.size());
        for (OfflineTrack offlineTrack : tracks) {
            a offlineState = offlineTrack.getOfflineState();
            offlineState.getClass();
            if (offlineState instanceof a.C0377a) {
                arrayList.add(offlineTrack.getUri());
            }
        }
        return arrayList;
    }
}
