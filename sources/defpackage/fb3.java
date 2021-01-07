package defpackage;

import android.os.Parcelable;
import io.reactivex.functions.a;

/* renamed from: fb3  reason: default package */
public final /* synthetic */ class fb3 implements a {
    public final /* synthetic */ kb3 a;
    public final /* synthetic */ Parcelable b;
    public final /* synthetic */ String c;

    public /* synthetic */ fb3(kb3 kb3, Parcelable parcelable, String str) {
        this.a = kb3;
        this.b = parcelable;
        this.c = str;
    }

    @Override // io.reactivex.functions.a
    public final void run() {
        this.a.f(this.b, this.c);
    }
}
