package com.spotify.share.sharedata;

import android.os.Parcelable;
import com.spotify.share.sharedata.f;

public abstract class v implements Parcelable {

    public interface a {
        a a(String str);

        a b(String str);

        v build();

        a c(String str);

        a d(String str);

        a e(String str);
    }

    public static a a() {
        return new f.a();
    }

    public abstract String b();

    public abstract String c();

    public abstract String e();

    public abstract String f();

    public abstract String g();
}
