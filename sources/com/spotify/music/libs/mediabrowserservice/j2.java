package com.spotify.music.libs.mediabrowserservice;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat;
import android.text.TextUtils;
import com.spotify.android.flags.c;
import com.spotify.mediaitem.a;
import com.spotify.mobile.android.service.media.v1;
import com.spotify.music.C0707R;
import io.reactivex.g;
import io.reactivex.internal.operators.observable.v;
import io.reactivex.s;
import io.reactivex.y;
import io.reactivex.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class j2 {
    private final v1 a;
    private final String b;
    private final Context c;
    private final g<c> d;
    private final y e;
    private final y f;
    private final b3 g;
    private final d3 h;

    public j2(v1 v1Var, String str, Context context, g<c> gVar, y yVar, y yVar2, b3 b3Var, d3 d3Var) {
        this.a = v1Var;
        this.b = str;
        this.c = context;
        this.d = gVar;
        this.e = yVar;
        this.f = yVar2;
        this.g = b3Var;
        this.h = d3Var;
    }

    public List a(int i, u3 u3Var) {
        F f2 = u3Var.a;
        f2.getClass();
        S s = u3Var.b;
        s.getClass();
        S s2 = s;
        ArrayList arrayList = new ArrayList(10);
        boolean C = z42.C(f2);
        int i2 = (!s2.i() || !C) ? 0 : 1;
        if (s2.g()) {
            i2++;
        }
        if (s2.e()) {
            i2++;
        }
        if (s2.f()) {
            i2++;
        }
        if (s2.h()) {
            i2++;
        }
        if (i2 != 0) {
            if (i <= 0) {
                i = 10 / i2;
            }
            if (s2.i() && C) {
                a aVar = new a();
                aVar.i(this.c.getString(C0707R.string.collection_start_songs_title));
                Bundle b2 = aVar.b();
                List<ol1> k = s2.k();
                k.getClass();
                if (k.size() > i) {
                    b3 b3Var = this.g;
                    List<ol1> k2 = s2.k();
                    k2.getClass();
                    arrayList.addAll(Arrays.asList(b3Var.c(k2.subList(0, i), b2)));
                } else {
                    b3 b3Var2 = this.g;
                    List<ol1> k3 = s2.k();
                    k3.getClass();
                    arrayList.addAll(Arrays.asList(b3Var2.c(k3, b2)));
                }
            }
            if (s2.f()) {
                a aVar2 = new a();
                aVar2.i(this.c.getString(C0707R.string.collection_start_artists_title));
                Bundle b3 = aVar2.b();
                List<nl1> b4 = s2.b();
                b4.getClass();
                if (b4.size() > i) {
                    b3 b3Var3 = this.g;
                    List<nl1> b5 = s2.b();
                    b5.getClass();
                    arrayList.addAll(Arrays.asList(b3Var3.b(b5.subList(0, i), b3)));
                } else {
                    b3 b3Var4 = this.g;
                    List<nl1> b6 = s2.b();
                    b6.getClass();
                    arrayList.addAll(Arrays.asList(b3Var4.b(b6, b3)));
                }
            }
            if (s2.e()) {
                a aVar3 = new a();
                aVar3.i(this.c.getString(C0707R.string.collection_start_albums_title));
                Bundle b7 = aVar3.b();
                List<gl1> a2 = s2.a();
                a2.getClass();
                if (a2.size() > i) {
                    b3 b3Var5 = this.g;
                    List<gl1> a3 = s2.a();
                    a3.getClass();
                    arrayList.addAll(Arrays.asList(b3Var5.a(a3.subList(0, i), b7)));
                } else {
                    b3 b3Var6 = this.g;
                    List<gl1> a4 = s2.a();
                    a4.getClass();
                    arrayList.addAll(Arrays.asList(b3Var6.a(a4, b7)));
                }
            }
            if (s2.g()) {
                a aVar4 = new a();
                aVar4.i(this.c.getString(C0707R.string.collection_start_shows_title_podcasts_only));
                Bundle b8 = aVar4.b();
                List<nl1> d2 = s2.d();
                d2.getClass();
                if (d2.size() > i) {
                    b3 b3Var7 = this.g;
                    List<nl1> d3 = s2.d();
                    d3.getClass();
                    arrayList.addAll(Arrays.asList(b3Var7.b(d3.subList(0, i), b8)));
                } else {
                    b3 b3Var8 = this.g;
                    List<nl1> d4 = s2.d();
                    d4.getClass();
                    arrayList.addAll(Arrays.asList(b3Var8.b(d4, b8)));
                }
            }
            if (s2.h()) {
                a aVar5 = new a();
                aVar5.i(this.c.getString(C0707R.string.collection_start_playlists_title));
                Bundle b9 = aVar5.b();
                List<nl1> j = s2.j();
                j.getClass();
                if (j.size() > i) {
                    b3 b3Var9 = this.g;
                    List<nl1> j2 = s2.j();
                    j2.getClass();
                    arrayList.addAll(Arrays.asList(b3Var9.b(j2.subList(0, i), b9)));
                } else {
                    b3 b3Var10 = this.g;
                    List<nl1> j3 = s2.j();
                    j3.getClass();
                    arrayList.addAll(Arrays.asList(b3Var10.b(j3, b9)));
                }
            }
        }
        if (arrayList.isEmpty()) {
            return r1.p;
        }
        return this.h.a(arrayList, this.b);
    }

    public s<List<MediaBrowserCompat.MediaItem>> b(String str, int i) {
        z<ml1> zVar;
        v vVar = new v(this.d.C(g1.a));
        if (TextUtils.isEmpty(str)) {
            zVar = z.q(new Exception("Search query can't be empty"));
        } else {
            zVar = this.a.c3().a(str, 0, 50, new Bundle());
        }
        return s.n(vVar, zVar.P(), f1.a).N0(1).j0(new c0(this, i)).r0(b0.a).I0(this.e).o0(this.f);
    }
}
