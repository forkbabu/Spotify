package defpackage;

import com.google.android.exoplayer2.d0;
import defpackage.um;

/* renamed from: on  reason: default package */
public abstract class on implements um.b {
    public final String a;

    public on(String str) {
        this.a = str;
    }

    @Override // defpackage.um.b
    public /* synthetic */ d0 O() {
        return vm.b(this);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // defpackage.um.b
    public /* synthetic */ byte[] f2() {
        return vm.a(this);
    }

    @Override // java.lang.Object
    public String toString() {
        return this.a;
    }
}
