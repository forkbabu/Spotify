package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.wearable.b;

/* renamed from: xv  reason: default package */
public final class xv extends a {
    public static final Parcelable.Creator<xv> CREATOR = new yv();
    private final zv a;
    private final int b;
    private final int c;
    private final int f;

    public xv(zv zvVar, int i, int i2, int i3) {
        this.a = zvVar;
        this.b = i;
        this.c = i2;
        this.f = i3;
    }

    public final void I1(b bVar) {
        int i = this.b;
        if (i == 1) {
            bVar.c(this.a);
        } else if (i == 2) {
            bVar.a(this.a, this.c, this.f);
        } else if (i == 3) {
            bVar.d(this.a, this.c, this.f);
        } else if (i == 4) {
            bVar.b(this.a, this.c, this.f);
        }
    }

    @Override // java.lang.Object
    public final String toString() {
        String valueOf = String.valueOf(this.a);
        int i = this.b;
        String num = i != 1 ? i != 2 ? i != 3 ? i != 4 ? Integer.toString(i) : "OUTPUT_CLOSED" : "INPUT_CLOSED" : "CHANNEL_CLOSED" : "CHANNEL_OPENED";
        int i2 = this.c;
        String num2 = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? Integer.toString(i2) : "CLOSE_REASON_LOCAL_CLOSE" : "CLOSE_REASON_REMOTE_CLOSE" : "CLOSE_REASON_DISCONNECTED" : "CLOSE_REASON_NORMAL";
        int i3 = this.f;
        StringBuilder U0 = je.U0(je.N0(num2, je.N0(num, valueOf.length() + 81)), "ChannelEventParcelable[, channel=", valueOf, ", type=", num);
        U0.append(", closeReason=");
        U0.append(num2);
        U0.append(", appErrorCode=");
        U0.append(i3);
        U0.append("]");
        return U0.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelReader.a(parcel);
        SafeParcelReader.S(parcel, 2, this.a, i, false);
        SafeParcelReader.M(parcel, 3, this.b);
        SafeParcelReader.M(parcel, 4, this.c);
        SafeParcelReader.M(parcel, 5, this.f);
        SafeParcelReader.m(parcel, a2);
    }
}
