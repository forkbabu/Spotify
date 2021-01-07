package defpackage;

import com.google.android.exoplayer2.d0;
import defpackage.um;

/* renamed from: vn  reason: default package */
public abstract class vn implements um.b {
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
        StringBuilder V0 = je.V0("SCTE-35 splice command: type=");
        V0.append(getClass().getSimpleName());
        return V0.toString();
    }
}
