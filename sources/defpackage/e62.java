package defpackage;

import com.spotify.mobile.android.service.plugininterfaces.d;

/* renamed from: e62  reason: default package */
public class e62 implements d {
    private final wlf<c62> a;
    private c62 b;

    public e62(wlf<c62> wlf) {
        this.a = wlf;
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void d() {
        c62 c62 = this.a.get();
        this.b = c62;
        c62.c();
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void g() {
        c62 c62 = this.b;
        if (c62 != null) {
            c62.d();
            this.b = null;
        }
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public String name() {
        return "PlaybackErrorNotifier";
    }
}
