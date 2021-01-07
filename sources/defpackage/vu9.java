package defpackage;

import com.spotify.imageresolve.w;
import com.spotify.mobile.android.service.plugininterfaces.c;
import com.spotify.mobile.android.service.plugininterfaces.d;
import com.spotify.remoteconfig.tj;

/* renamed from: vu9  reason: default package */
public class vu9 implements d, c {
    private final w a;
    private tj b;

    public vu9(w wVar, tj tjVar) {
        this.a = wVar;
        this.b = tjVar;
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.c
    public void b() {
        this.b = tj.a();
        this.a.c();
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void d() {
        if (this.b.c()) {
            this.a.d();
        }
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void g() {
        this.a.e();
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public String name() {
        return "ImageResolve";
    }
}
