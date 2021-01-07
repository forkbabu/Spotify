package defpackage;

import com.spotify.mobile.android.util.l0;
import com.spotify.music.navigation.t;
import defpackage.z97;

/* renamed from: da7  reason: default package */
public class da7 implements z97.a {
    private final t a;

    public da7(t tVar) {
        this.a = tVar;
    }

    @Override // defpackage.z97.a
    public void a(String str) {
        t tVar = this.a;
        StringBuilder V0 = je.V0("spotify:internal:tracklist:episode:");
        V0.append(l0.z(str).k());
        tVar.d(V0.toString());
    }

    @Override // defpackage.z97.a
    public void b() {
        this.a.d("spotify:premium-destination");
    }
}
