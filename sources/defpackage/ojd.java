package defpackage;

import com.spotify.mobile.android.storylines.model.StorylinesCardContent;
import io.reactivex.functions.g;

/* renamed from: ojd  reason: default package */
public final /* synthetic */ class ojd implements g {
    public final /* synthetic */ qjd a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    public /* synthetic */ ojd(qjd qjd, String str, String str2) {
        this.a = qjd;
        this.b = str;
        this.c = str2;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.d(this.b, this.c, (StorylinesCardContent) obj);
    }
}
