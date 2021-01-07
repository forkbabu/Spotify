package com.spotify.music.libs.collection.model;

import com.adjust.sdk.Constants;
import com.spotify.mobile.android.util.SortOption;
import com.spotify.music.libs.collection.util.UriBuilder;
import java.util.Locale;

public class e {
    private final String a;
    private Boolean b;
    private SortOption c;
    private boolean d;
    private boolean e;
    private Integer f;
    private Integer g;
    private boolean h;
    private String i;

    protected e(String str) {
        this.a = str;
    }

    public static e a(String str) {
        return new e(str);
    }

    public UriBuilder b() {
        UriBuilder uriBuilder = new UriBuilder("sp://core-collection/unstable/<username>/list/albums/all");
        uriBuilder.x(Constants.ONE_SECOND);
        uriBuilder.y(this.a);
        uriBuilder.u(this.c);
        uriBuilder.h(this.e);
        uriBuilder.c(this.d);
        uriBuilder.g(false);
        uriBuilder.t(this.f, this.g);
        uriBuilder.n(this.h);
        uriBuilder.w(this.i);
        uriBuilder.s(false);
        uriBuilder.o(UriBuilder.Format.PROTOBUF);
        Boolean bool = this.b;
        if (bool != null) {
            uriBuilder.a(String.format(Locale.US, "saved eq %s", bool));
        }
        return uriBuilder;
    }

    public String c() {
        return this.a;
    }

    public void d(boolean z, boolean z2, boolean z3) {
        this.e = z;
        this.d = z2;
        this.h = z3;
    }

    public void e(boolean z) {
        this.b = Boolean.valueOf(z);
    }

    public void f(Integer num, Integer num2) {
        this.f = num;
        this.g = num2;
    }

    public void g(SortOption sortOption) {
        this.c = sortOption;
    }

    public void h(ane ane) {
        this.c = z42.E(ane);
    }

    public void i(String str) {
        this.i = str;
    }

    public String toString() {
        StringBuilder V0 = je.V0("AlbumsDataLoaderModel{ Username='");
        je.A(V0, this.a, '\'', ", IsAlbumSaved=");
        V0.append(this.b);
        V0.append(", SortOption=");
        V0.append(this.c);
        V0.append(", AvailableOfflineOnly=");
        V0.append(this.d);
        V0.append(", InCollectionOnly=");
        V0.append(this.e);
        V0.append(", RangeStart=");
        V0.append(this.f);
        V0.append(", RangeLength=");
        V0.append(this.g);
        V0.append(", UnheardOnly=");
        V0.append(this.h);
        V0.append(", Filter='");
        V0.append(this.i);
        V0.append('\'');
        V0.append(", FullAlbumsOnly=");
        V0.append(false);
        V0.append(", WithGroups=");
        V0.append(false);
        V0.append('}');
        return V0.toString();
    }
}
