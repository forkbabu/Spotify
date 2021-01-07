package defpackage;

import com.spotify.http.u;
import com.spotify.music.features.eventshub.locationsearch.model.LocationsHolder;
import com.spotify.music.features.eventshub.model.ArtistConcertsModel;
import com.spotify.music.features.eventshub.model.ConcertEntityModel;
import com.spotify.music.features.eventshub.model.EventsHubModel;
import io.reactivex.z;
import retrofit2.v;

/* renamed from: p05  reason: default package */
public class p05 {
    private final r05 a;

    public p05(u uVar) {
        this.a = (r05) uVar.c(r05.class);
    }

    public z<ConcertEntityModel> a(String str) {
        return this.a.d(str);
    }

    public z<v<EventsHubModel>> b(int i) {
        Integer num;
        r05 r05 = this.a;
        if (i == -1) {
            num = null;
        } else {
            num = Integer.valueOf(i);
        }
        return r05.c(num);
    }

    public z<ArtistConcertsModel> c(String str, int i, boolean z) {
        Integer num;
        r05 r05 = this.a;
        if (i == -1) {
            num = null;
        } else {
            num = Integer.valueOf(i);
        }
        return r05.b(str, num, z);
    }

    public z<v<LocationsHolder>> d(String str) {
        return this.a.a(str);
    }
}
