package com.spotify.share.sharedata;

import android.os.Parcelable;
import com.spotify.share.sharedata.e;
import java.util.Map;

public abstract class s implements t, Parcelable {

    public interface a {
        a a(Map<String, String> map);

        a b(v vVar);

        s build();
    }

    public static a h(String str, String str2) {
        e.b bVar = new e.b();
        bVar.d(str);
        e.b bVar2 = bVar;
        bVar2.f(str2);
        return bVar2;
    }

    public static Parcelable.Creator<l> i() {
        return l.CREATOR;
    }

    public static s j(t tVar, String str) {
        d dVar = (d) tVar;
        String g = dVar.g();
        e.b bVar = new e.b();
        bVar.d(g);
        bVar.f(str);
        if (dVar.a() != null) {
            bVar.c(dVar.a());
        }
        if (dVar.e() != null) {
            bVar.e(dVar.e());
        }
        if (dVar.f() != null) {
            bVar.a(dVar.f());
        }
        bVar.b(dVar.c());
        bVar.f(str);
        return bVar.build();
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

    public abstract String k();

    public abstract a l();
}
