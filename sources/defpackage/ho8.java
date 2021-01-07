package defpackage;

import android.os.Build;
import com.spotify.music.features.tasteonboarding.artistpicker.model.ArtistPickerResponse;
import com.spotify.music.features.tasteonboarding.f;
import io.reactivex.s;
import io.reactivex.z;

/* renamed from: ho8  reason: default package */
public class ho8 {
    private final lo8 a;
    private final f b;
    private final boolean c;

    public ho8(lo8 lo8, boolean z, f fVar) {
        this.a = lo8;
        this.c = z;
        this.b = fVar;
    }

    public s<ArtistPickerResponse> a() {
        z<ArtistPickerResponse> zVar;
        String c2 = this.b.c();
        if (this.c) {
            zVar = this.a.b(Build.MANUFACTURER, Build.MODEL, c2, "true");
        } else {
            zVar = this.a.c(Build.MANUFACTURER, Build.MODEL, c2, "true");
        }
        return zVar.P().q(new m1e()).N0(1);
    }

    public z<ArtistPickerResponse> b(String str) {
        return this.a.d(str);
    }
}
