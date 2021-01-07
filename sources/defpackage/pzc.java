package defpackage;

import android.net.Uri;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.common.base.Optional;
import com.spotify.share.sharedata.o;
import com.spotify.share.sharedata.q;
import com.spotify.share.sharedata.r;
import com.spotify.share.sharedata.s;
import com.spotify.share.sharedata.w;
import defpackage.syc;

/* renamed from: pzc  reason: default package */
public abstract class pzc implements Parcelable {

    /* renamed from: pzc$a */
    public interface a {
        a a(q qVar);

        a b(o oVar);

        pzc build();

        a c(s sVar);

        a d(w wVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: pzc$b */
    public static class b extends e<o> {
        b() {
        }

        public Parcelable.Creator<? extends o> a() {
            return o.i();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: pzc$c */
    public static class c extends e<q> {
        c() {
        }

        public Parcelable.Creator<? extends q> a() {
            return q.j();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: pzc$d */
    public static class d extends e<s> {
        d() {
        }

        public Parcelable.Creator<? extends s> a() {
            return s.i();
        }
    }

    /* renamed from: pzc$e */
    static abstract class e<T extends Parcelable> {
        e() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: pzc$f */
    public static class f extends e<w> {
        f() {
        }

        public Parcelable.Creator<? extends w> a() {
            return w.i();
        }
    }

    public static a a(Uri uri, String str, String str2, r rVar) {
        syc.a aVar = new syc.a();
        aVar.e(uri);
        syc.a aVar2 = aVar;
        aVar2.g(str);
        syc.a aVar3 = aVar2;
        aVar3.f(str2);
        syc.a aVar4 = aVar3;
        aVar4.h(rVar);
        return aVar4;
    }

    public static a b(Uri uri, String str, String str2, String str3) {
        r build = r.h(str3).build();
        syc.a aVar = new syc.a();
        aVar.e(uri);
        syc.a aVar2 = aVar;
        aVar2.g(str);
        syc.a aVar3 = aVar2;
        aVar3.f(str2);
        syc.a aVar4 = aVar3;
        aVar4.h(build);
        return aVar4;
    }

    public static a c(String str, String str2, String str3, r rVar) {
        Uri parse = !TextUtils.isEmpty(str) ? Uri.parse(str) : Uri.EMPTY;
        syc.a aVar = new syc.a();
        aVar.e(parse);
        syc.a aVar2 = aVar;
        aVar2.g(str2);
        syc.a aVar3 = aVar2;
        aVar3.f(str3);
        syc.a aVar4 = aVar3;
        aVar4.h(rVar);
        return aVar4;
    }

    public static a e(String str, String str2, String str3, String str4) {
        Uri parse = !TextUtils.isEmpty(str) ? Uri.parse(str) : Uri.EMPTY;
        r build = r.h(str4).build();
        syc.a aVar = new syc.a();
        aVar.e(parse);
        syc.a aVar2 = aVar;
        aVar2.g(str2);
        syc.a aVar3 = aVar2;
        aVar3.f(str3);
        syc.a aVar4 = aVar3;
        aVar4.h(build);
        return aVar4;
    }

    public abstract Uri f();

    public abstract String g();

    public abstract String h();

    public abstract Optional<o> i();

    public abstract Optional<q> j();

    public abstract r k();

    public abstract Optional<s> l();

    public abstract Optional<w> m();
}
