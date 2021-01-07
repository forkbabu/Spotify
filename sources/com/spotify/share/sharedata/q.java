package com.spotify.share.sharedata;

import android.graphics.Bitmap;
import android.os.Parcelable;
import com.google.common.base.Optional;
import com.spotify.share.sharedata.c;
import java.util.Map;

public abstract class q implements u<l8e>, Parcelable {

    public interface a {
        a a(Map<String, String> map);

        a b(v vVar);

        q build();
    }

    public static a i(String str, Bitmap bitmap) {
        c.b bVar = new c.b();
        bVar.e(str);
        c.b bVar2 = bVar;
        bVar2.c(l8e.a(bitmap));
        return bVar2;
    }

    public static Parcelable.Creator<j> j() {
        return j.CREATOR;
    }

    public static q k(t tVar, Bitmap bitmap, Optional<Bitmap> optional) {
        d dVar = (d) tVar;
        String g = dVar.g();
        c.b bVar = new c.b();
        bVar.e(g);
        bVar.c(l8e.a(bitmap));
        if (dVar.a() != null) {
            bVar.d(dVar.a());
        }
        if (dVar.e() != null) {
            bVar.f(dVar.e());
        }
        if (dVar.f() != null) {
            bVar.a(dVar.f());
        }
        if (optional.isPresent()) {
            bVar.g(l8e.a(optional.get()));
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

    public abstract l8e h();

    public abstract a l();
}
