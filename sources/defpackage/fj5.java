package defpackage;

import com.spotify.mobile.android.service.plugininterfaces.d;

/* renamed from: fj5  reason: default package */
public class fj5 implements d {
    private final hha a;

    fj5(hha hha) {
        this.a = hha;
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void d() {
        this.a.k(false);
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void g() {
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public String name() {
        return "HomePreferenceManager";
    }
}
