package defpackage;

import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.ubi.specification.factories.y1;
import defpackage.uy5;
import kotlin.jvm.internal.h;

/* renamed from: rz5  reason: default package */
public final class rz5 implements uy5.a, a06, b06, yz5, zz5 {
    private final y1 a = new y1("", ViewUris.U1.toString());
    private final ere b;

    public rz5(ere ere) {
        h.e(ere, "logger");
        this.b = ere;
    }

    @Override // defpackage.zz5
    public void a(String str, String str2) {
        h.e(str, "deviceId");
        h.e(str2, AppProtocol.TrackData.TYPE_TRACK);
        this.b.a(this.a.b(str).c().a(15000));
    }

    @Override // defpackage.a06
    public void b(String str, String str2) {
        h.e(str, "deviceId");
        h.e(str2, AppProtocol.TrackData.TYPE_TRACK);
        this.b.a(this.a.b(str).d().a(str2));
    }

    @Override // defpackage.b06
    public void c(String str, String str2) {
        h.e(str, "deviceId");
        h.e(str2, AppProtocol.TrackData.TYPE_TRACK);
        this.b.a(this.a.b(str).e().a(str2));
    }

    @Override // defpackage.uy5.a
    public boolean d(String str) {
        h.e(str, "mode");
        return h.a(str, "podcast");
    }

    @Override // defpackage.yz5
    public void e(String str, String str2) {
        h.e(str, "deviceId");
        h.e(str2, AppProtocol.TrackData.TYPE_TRACK);
        this.b.a(this.a.b(str).b().a(str2));
    }

    @Override // defpackage.zz5
    public void f(String str, String str2) {
        h.e(str, "deviceId");
        h.e(str2, AppProtocol.TrackData.TYPE_TRACK);
        this.b.a(this.a.b(str).c().a(-15000));
    }

    @Override // defpackage.yz5
    public void g(String str, String str2) {
        h.e(str, "deviceId");
        h.e(str2, AppProtocol.TrackData.TYPE_TRACK);
        this.b.a(this.a.b(str).b().b(str2));
    }
}
