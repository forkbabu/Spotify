package com.spotify.libs.otp.session;

import android.os.Parcelable;
import com.spotify.libs.otp.session.d;
import io.reactivex.functions.g;

public final /* synthetic */ class b implements g {
    public final /* synthetic */ d a;
    public final /* synthetic */ Parcelable b;
    public final /* synthetic */ long c;

    public /* synthetic */ b(d dVar, Parcelable parcelable, long j) {
        this.a = dVar;
        this.b = parcelable;
        this.c = j;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.j(this.b, this.c, (d.a) obj);
    }
}
