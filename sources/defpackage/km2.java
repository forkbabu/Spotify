package defpackage;

import com.google.common.base.MoreObjects;
import com.google.protobuf.u;
import com.spotify.messages.CanvasLoad;
import com.spotify.music.canvas.model.b;

/* renamed from: km2  reason: default package */
public class km2 {
    private final gl0<u> a;

    public km2(gl0<u> gl0) {
        this.a = gl0;
    }

    private void d(b bVar, String str, String str2, String str3) {
        CanvasLoad.b o = CanvasLoad.o();
        o.n(bVar.e());
        o.o(bVar.h());
        o.p(str);
        o.q("NPV");
        if (!MoreObjects.isNullOrEmpty(str2)) {
            o.m("error_reason", str2);
        }
        if (!MoreObjects.isNullOrEmpty(str3)) {
            o.m("error_detail", str3);
        }
        this.a.c(o.build());
    }

    public void a(b bVar) {
        d(bVar, "downloaded", null, null);
    }

    public void b(b bVar) {
        d(bVar, "downloading", null, null);
    }

    public void c(b bVar, String str, String str2) {
        d(bVar, "failure", str, str2);
    }
}
