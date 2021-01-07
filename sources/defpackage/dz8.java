package defpackage;

import android.content.Intent;
import android.net.Uri;
import com.spotify.intentrouter.m;
import defpackage.glb;
import kotlin.jvm.internal.h;

/* renamed from: dz8  reason: default package */
final class dz8 implements m<glb.c> {
    public static final dz8 a = new dz8();

    private dz8() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.spotify.intentrouter.m
    public boolean a(glb.c cVar) {
        glb.c cVar2 = cVar;
        h.e(cVar2, "input");
        Intent a2 = cVar2.a();
        h.d(a2, "input.intent()");
        Uri data = a2.getData();
        if (data == null) {
            return false;
        }
        if (!(h.a("spotify.com", data.getHost()) || h.a("www.spotify.com", data.getHost()))) {
            return false;
        }
        if ((data.getPathSegments().size() >= 1 && h.a(data.getPathSegments().get(0), "wrapped")) || (data.getPathSegments().size() >= 2 && h.a(data.getPathSegments().get(1), "wrapped"))) {
            return true;
        }
        return false;
    }

    @Override // com.spotify.intentrouter.m
    public String description() {
        return "Matches urls in the form https://www.spotify.com/*/wrapped/*";
    }
}
