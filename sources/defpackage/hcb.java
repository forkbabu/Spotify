package defpackage;

import com.spotify.mobile.android.service.plugininterfaces.d;
import io.reactivex.a;
import io.reactivex.disposables.b;
import io.reactivex.y;

/* renamed from: hcb  reason: default package */
public class hcb implements d {
    private final gcb a;
    private final y b;
    private b c;

    hcb(gcb gcb, y yVar) {
        this.a = gcb;
        this.b = yVar;
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void d() {
        gcb gcb = this.a;
        gcb.getClass();
        this.c = a.x(new ecb(gcb)).G(this.b).B().subscribe();
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void g() {
        this.c.dispose();
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public String name() {
        return "DeviceIdentifierLogger";
    }
}
