package defpackage;

import android.os.Parcelable;

/* renamed from: z1a  reason: default package */
public final /* synthetic */ class z1a implements Runnable {
    public final /* synthetic */ b2a a;
    public final /* synthetic */ Parcelable b;

    public /* synthetic */ z1a(b2a b2a, Parcelable parcelable) {
        this.a = b2a;
        this.b = parcelable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.u(this.b);
    }
}
