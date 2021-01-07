package defpackage;

import android.content.Context;
import com.spotify.share.sharedata.t;
import com.spotify.share.util.m;

/* renamed from: d8e  reason: default package */
public class d8e {
    private final r4e a;
    private final m b;
    private final String c;
    private final String d;
    private final Context e;
    private final String f;

    public d8e(Context context, r4e r4e, m mVar, String str, String str2, String str3) {
        this.b = mVar;
        this.a = r4e;
        this.c = str;
        this.d = str2;
        this.e = context;
        this.f = str3;
    }

    public void a(t tVar, int i, String str, String str2) {
        b(tVar.g(), i, this.b.b(tVar), str, null);
    }

    public void b(String str, int i, String str2, String str3, String str4) {
        this.a.a(str, this.e.getString(i), str2, str3, this.c, this.d, str4, "", this.f);
    }

    public String c() {
        return this.f;
    }

    public String d() {
        return this.d;
    }

    public String e() {
        return this.c;
    }
}
