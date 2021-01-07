package com.spotify.share.sharedata;

import android.graphics.Bitmap;
import android.os.Parcelable;
import com.spotify.share.sharedata.a;
import java.util.List;
import java.util.Map;

public abstract class o implements u<k8e>, Parcelable {

    public interface a {
        a b(v vVar);

        o build();
    }

    public static Parcelable.Creator<h> i() {
        return h.CREATOR;
    }

    public static o j(t tVar, List<String> list, Bitmap bitmap) {
        d dVar = (d) tVar;
        String g = dVar.g();
        a.b bVar = new a.b();
        bVar.d(g);
        bVar.a(k8e.a(list));
        bVar.g(l8e.a(bitmap));
        if (dVar.a() != null) {
            bVar.c(dVar.a());
        }
        if (dVar.e() != null) {
            bVar.e(dVar.e());
        }
        if (dVar.f() != null) {
            bVar.f(dVar.f());
        }
        bVar.b(dVar.c());
        return bVar.build();
    }

    @Override // com.spotify.share.sharedata.t
    public abstract String a();

    @Override // com.spotify.share.sharedata.u
    public abstract l8e b();

    @Override // com.spotify.share.sharedata.t
    public abstract v c();

    @Override // com.spotify.share.sharedata.t
    public abstract String e();

    @Override // com.spotify.share.sharedata.t
    public abstract Map<String, String> f();

    @Override // com.spotify.share.sharedata.t
    public abstract String g();

    public abstract k8e h();

    public abstract a k();
}
