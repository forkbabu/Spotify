package com.spotify.share.sharedata;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcelable;
import com.google.common.base.Optional;
import com.spotify.share.sharedata.g;
import java.util.Map;

public abstract class w implements u<n8e>, Parcelable {

    public interface a {
        a b(v vVar);

        w build();
    }

    public static Parcelable.Creator<n> i() {
        return n.CREATOR;
    }

    public static w j(t tVar, Uri uri, Optional<Bitmap> optional) {
        d dVar = (d) tVar;
        String g = dVar.g();
        g.b bVar = new g.b();
        bVar.d(g);
        bVar.a(n8e.a(uri));
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
        bVar.g(l8e.a(optional.get()));
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

    public abstract n8e h();

    public abstract a k();
}
