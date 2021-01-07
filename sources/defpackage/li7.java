package defpackage;

import com.spotify.mobile.android.service.session.e;
import io.reactivex.functions.l;

/* renamed from: li7  reason: default package */
public final /* synthetic */ class li7 implements l {
    public final /* synthetic */ mi7 a;
    public final /* synthetic */ ozd b;
    public final /* synthetic */ String c;

    public /* synthetic */ li7(mi7 mi7, ozd ozd, String str) {
        this.a = mi7;
        this.b = ozd;
        this.c = str;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.d(this.b, this.c, (e) obj);
    }
}
