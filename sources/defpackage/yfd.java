package defpackage;

import android.text.TextUtils;
import com.spotify.localization.SpotifyLocale;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.spotlets.radio.model.CreateRadioStationModel;
import com.spotify.music.spotlets.radio.model.RadioStationModel;
import com.spotify.music.spotlets.radio.model.RadioStationTracksModel;
import com.spotify.music.spotlets.radio.model.RadioStationsModel;
import com.spotify.music.spotlets.radio.model.TracksAndRadioStationModel;
import io.reactivex.a;
import io.reactivex.s;
import io.reactivex.z;
import java.util.HashMap;

/* renamed from: yfd  reason: default package */
public class yfd {
    private final tfd a;
    private final ufd b;
    private final rfd c;

    public yfd(tfd tfd, ufd ufd, rfd rfd) {
        this.a = tfd;
        this.b = ufd;
        this.c = rfd;
    }

    private static vn0 d(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        return new vn0("prev_tracks", TextUtils.join(",", agd.f(strArr)));
    }

    private static boolean g(String str) {
        return l0.c(str, LinkType.PROFILE_PLAYLIST, LinkType.RADIO_PLAYLIST);
    }

    public s<TracksAndRadioStationModel> a(CreateRadioStationModel createRadioStationModel, String[] strArr) {
        String str;
        z<TracksAndRadioStationModel> zVar;
        String c2 = SpotifyLocale.c();
        boolean g = g(createRadioStationModel.seeds().get(0));
        if (strArr == null) {
            str = "";
        } else {
            str = TextUtils.join(",", agd.f(strArr));
        }
        if (g) {
            zVar = this.a.b(c2, str);
        } else {
            zVar = this.b.b(c2, str);
        }
        return zVar.P();
    }

    public a b(CreateRadioStationModel createRadioStationModel) {
        if (g(createRadioStationModel.seeds().get(0))) {
            return this.a.a(SpotifyLocale.c(), false, 0, createRadioStationModel);
        }
        return this.b.a(SpotifyLocale.c(), false, 0, createRadioStationModel);
    }

    public s<RadioStationsModel> c() {
        return this.b.e(SpotifyLocale.c()).P();
    }

    public s<RadioStationModel> e(String str, int i, String[] strArr, boolean z, boolean z2) {
        z<RadioStationModel> zVar;
        HashMap hashMap = new HashMap(3);
        vn0 d = d(strArr);
        if (d != null) {
            hashMap.put(d.a(), d.b());
        }
        if (z) {
            hashMap.put("filter-explicit", "1");
        }
        if (z2) {
            hashMap.put("autoplay", "true");
        }
        boolean a2 = ViewUris.t0.a(str);
        boolean g = g(str);
        if (a2) {
            zVar = this.c.b(str, i, hashMap);
        } else if (g) {
            zVar = this.a.d(str, i, hashMap);
        } else {
            zVar = this.b.d(str, i, hashMap);
        }
        return zVar.P();
    }

    public s<RadioStationTracksModel> f(String str, String[] strArr, boolean z) {
        z<RadioStationTracksModel> zVar;
        HashMap hashMap = new HashMap(2);
        vn0 d = d(strArr);
        if (d != null) {
            hashMap.put(d.a(), d.b());
        }
        if (z) {
            hashMap.put("filter-explicit", "1");
        }
        boolean a2 = ViewUris.t0.a(str);
        boolean g = g(str);
        if (a2) {
            zVar = this.c.a(str, hashMap);
        } else if (g) {
            zVar = this.a.c(str, hashMap);
        } else {
            zVar = this.b.c(str, hashMap);
        }
        return zVar.P();
    }
}
