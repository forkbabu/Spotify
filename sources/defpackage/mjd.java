package defpackage;

import com.spotify.mobile.android.storylines.model.StorylinesCardContent;
import io.reactivex.functions.g;

/* renamed from: mjd  reason: default package */
public final /* synthetic */ class mjd implements g {
    public final /* synthetic */ qjd a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ StorylinesCardContent f;

    public /* synthetic */ mjd(qjd qjd, String str, String str2, StorylinesCardContent storylinesCardContent) {
        this.a = qjd;
        this.b = str;
        this.c = str2;
        this.f = storylinesCardContent;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.g(this.b, this.c, this.f, (StorylinesCardContent) obj);
    }
}
