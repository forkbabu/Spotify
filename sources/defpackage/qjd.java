package defpackage;

import android.util.LruCache;
import com.spotify.mobile.android.storylines.model.StorylinesCardContent;
import io.reactivex.disposables.b;
import io.reactivex.functions.a;
import io.reactivex.internal.functions.Functions;
import io.reactivex.s;

/* renamed from: qjd  reason: default package */
public class qjd {
    private final ajd a;
    private final LruCache<String, StorylinesCardContent> b = new LruCache<>(10);
    private final fjd c;

    public qjd(ajd ajd, fjd fjd) {
        this.a = ajd;
        this.c = fjd;
    }

    public boolean a(String str) {
        return this.b.get(str) != null;
    }

    public s<StorylinesCardContent> b(String str, String str2) {
        a aVar = Functions.c;
        StorylinesCardContent storylinesCardContent = this.b.get(str);
        if (storylinesCardContent == null) {
            return this.a.a(str).P().M(new njd(this, str2, str), aVar).N(new ojd(this, str, str2)).L(new kjd(this, str2, str));
        }
        return s.i0(storylinesCardContent).M(new ljd(this, str2, str), aVar).N(new mjd(this, str2, str, storylinesCardContent)).L(new jjd(this, str2, str));
    }

    public /* synthetic */ void c(String str, String str2, b bVar) {
        this.c.k(str, str2);
    }

    public /* synthetic */ void d(String str, String str2, StorylinesCardContent storylinesCardContent) {
        this.b.put(str, storylinesCardContent);
        this.c.j(str2, str, storylinesCardContent.getStorylineGid());
    }

    public /* synthetic */ void e(String str, String str2, Throwable th) {
        this.c.i(str, str2, th.getMessage());
    }

    public /* synthetic */ void f(String str, String str2, b bVar) {
        this.c.k(str, str2);
    }

    public /* synthetic */ void g(String str, String str2, StorylinesCardContent storylinesCardContent, StorylinesCardContent storylinesCardContent2) {
        this.c.h(str, str2, storylinesCardContent.getStorylineGid());
    }

    public /* synthetic */ void h(String str, String str2, Throwable th) {
        this.c.g(str, str2, th.getMessage());
    }
}
