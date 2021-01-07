package com.spotify.music.features.premiumdestination;

import android.content.Context;
import com.google.common.base.MoreObjects;
import com.spotify.http.u;
import com.spotify.mobile.android.ui.activity.upsell.model.Offer;
import io.reactivex.d0;
import io.reactivex.s;
import io.reactivex.y;
import io.reactivex.z;
import java.util.concurrent.TimeUnit;

public class j {
    private final Context a;
    private final s<Offer> b;
    private final ji7 c;
    private final y d;
    private final s<Offer> e;
    private final String f;
    private final String g;
    private final String h;
    private final mi7 i;
    private final u j;
    private final String k;
    private final boolean l;
    private final String m;
    private final String n;
    private final String o;
    private final String p;
    private final String q;
    private final String r;
    private final String s;
    private final String t;
    private final String u;
    private final String v;

    public j(Context context, s<Offer> sVar, ji7 ji7, y yVar, s<Offer> sVar2, String str, String str2, String str3, String str4, String str5, String str6, mi7 mi7, u uVar, String str7, boolean z, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        this.a = context;
        this.b = sVar;
        this.c = ji7;
        this.d = yVar;
        this.e = sVar2;
        this.f = str;
        this.g = str2;
        this.q = str3;
        this.r = str4;
        this.s = str5;
        this.h = str6;
        this.i = mi7;
        this.j = uVar;
        this.k = str7;
        this.l = z;
        this.m = str8;
        this.n = str9;
        this.o = str10;
        this.p = str11;
        this.t = str12;
        this.u = str13;
        this.v = str14;
    }

    public z<String> a(String str) {
        String str2;
        String str3;
        String str4 = MoreObjects.isNullOrEmpty(this.k) ? "premium-destination-hubs" : this.k;
        String str5 = this.q;
        String str6 = this.r;
        String str7 = this.h;
        if (str7 == null) {
            str7 = this.s;
        }
        String str8 = this.u;
        if (!this.i.c()) {
            return this.b.T0(2, TimeUnit.SECONDS, this.d).p0(this.e).B0().A(a.a).s(new b(this));
        }
        String str9 = "samsung-mobile-preload";
        if (this.l) {
            str2 = "samsung";
            str3 = str9;
        } else {
            str9 = str5;
            str3 = str6;
            str2 = str8;
        }
        return ((vh7) this.j.c(vh7.class)).a(str4, this.f, this.g, str9, str3, str7, this.m, this.n, this.o, str, this.p, this.t, str2, this.v);
    }

    public d0 b(Integer num) {
        ji7 ji7 = this.c;
        Context context = this.a;
        int intValue = num.intValue();
        ji7.getClass();
        return z.y(new k0(context, intValue));
    }
}
