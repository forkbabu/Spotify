package com.spotify.share.sharedata;

import android.graphics.Bitmap;
import android.os.Parcelable;
import com.spotify.share.sharedata.b;
import java.util.Map;

public abstract class p implements t, Parcelable {

    public interface a {
        a a(Map<String, String> map);

        p build();

        a setText(String str);
    }

    public static a i(String str, Bitmap bitmap) {
        b.a aVar = new b.a();
        aVar.d(str);
        b.a aVar2 = aVar;
        aVar2.b(bitmap);
        return aVar2;
    }

    public static p j(t tVar, Bitmap bitmap) {
        d dVar = (d) tVar;
        String g = dVar.g();
        b.a aVar = new b.a();
        aVar.d(g);
        aVar.b(bitmap);
        if (dVar.a() != null) {
            aVar.c(dVar.a());
        }
        if (dVar.e() != null) {
            aVar.e(dVar.e());
        }
        Map<String, String> f = dVar.f();
        if (f != null) {
            aVar.a(f);
        }
        aVar.f(dVar.c());
        if (tVar instanceof s) {
            aVar.setText(((s) tVar).k());
        }
        return aVar.build();
    }

    @Override // com.spotify.share.sharedata.t
    public abstract String a();

    @Override // com.spotify.share.sharedata.t
    public abstract v c();

    @Override // com.spotify.share.sharedata.t
    public abstract String e();

    @Override // com.spotify.share.sharedata.t
    public abstract Map<String, String> f();

    @Override // com.spotify.share.sharedata.t
    public abstract String g();

    public abstract Bitmap h();

    public abstract String k();
}
