package com.spotify.share.sharedata;

import android.os.Parcelable;
import com.spotify.share.sharedata.d;
import java.util.Map;

public abstract class r implements t, Parcelable {

    public interface a {
        a a(Map<String, String> map);

        a b(v vVar);

        r build();

        a c(String str);

        a d(String str);
    }

    public static a h(String str) {
        d.a aVar = new d.a();
        aVar.e(str);
        return aVar;
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
}
