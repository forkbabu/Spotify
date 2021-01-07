package defpackage;

import android.os.Parcelable;

/* renamed from: rj3  reason: default package */
public final /* synthetic */ class rj3 implements Runnable {
    public final /* synthetic */ yj3 a;
    public final /* synthetic */ Parcelable b;

    public /* synthetic */ rj3(yj3 yj3, Parcelable parcelable) {
        this.a = yj3;
        this.b = parcelable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.m(this.b);
    }
}
