package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.q0;
import com.google.android.gms.internal.measurement.v;
import java.util.List;

public abstract class r3 extends q0 implements s3 {
    public r3() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.q0
    public final boolean C3(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean z = false;
        switch (i) {
            case 1:
                ((g5) this).d1((r) v.a(parcel, r.CREATOR), (fa) v.a(parcel, fa.CREATOR));
                parcel2.writeNoException();
                break;
            case 2:
                ((g5) this).U((y9) v.a(parcel, y9.CREATOR), (fa) v.a(parcel, fa.CREATOR));
                parcel2.writeNoException();
                break;
            case 3:
            case 8:
            default:
                return false;
            case 4:
                ((g5) this).J0((fa) v.a(parcel, fa.CREATOR));
                parcel2.writeNoException();
                break;
            case 5:
                ((g5) this).F3((r) v.a(parcel, r.CREATOR), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                break;
            case 6:
                ((g5) this).Z0((fa) v.a(parcel, fa.CREATOR));
                parcel2.writeNoException();
                break;
            case 7:
                fa faVar = (fa) v.a(parcel, fa.CREATOR);
                if (parcel.readInt() != 0) {
                    z = true;
                }
                List<y9> E3 = ((g5) this).E3(faVar, z);
                parcel2.writeNoException();
                parcel2.writeTypedList(E3);
                break;
            case 9:
                byte[] c1 = ((g5) this).c1((r) v.a(parcel, r.CREATOR), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeByteArray(c1);
                break;
            case 10:
                ((g5) this).z0(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                break;
            case 11:
                String p2 = ((g5) this).p2((fa) v.a(parcel, fa.CREATOR));
                parcel2.writeNoException();
                parcel2.writeString(p2);
                break;
            case 12:
                ((g5) this).J((oa) v.a(parcel, oa.CREATOR), (fa) v.a(parcel, fa.CREATOR));
                parcel2.writeNoException();
                break;
            case 13:
                ((g5) this).H3((oa) v.a(parcel, oa.CREATOR));
                parcel2.writeNoException();
                break;
            case 14:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                int i3 = v.b;
                if (parcel.readInt() != 0) {
                    z = true;
                }
                List<y9> O2 = ((g5) this).O2(readString, readString2, z, (fa) v.a(parcel, fa.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(O2);
                break;
            case 15:
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                int i4 = v.b;
                if (parcel.readInt() != 0) {
                    z = true;
                }
                List<y9> Y = ((g5) this).Y(readString3, readString4, readString5, z);
                parcel2.writeNoException();
                parcel2.writeTypedList(Y);
                break;
            case 16:
                List<oa> D0 = ((g5) this).D0(parcel.readString(), parcel.readString(), (fa) v.a(parcel, fa.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(D0);
                break;
            case 17:
                List<oa> B0 = ((g5) this).B0(parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeTypedList(B0);
                break;
            case 18:
                ((g5) this).E2((fa) v.a(parcel, fa.CREATOR));
                parcel2.writeNoException();
                break;
            case 19:
                ((g5) this).x1((Bundle) v.a(parcel, Bundle.CREATOR), (fa) v.a(parcel, fa.CREATOR));
                parcel2.writeNoException();
                break;
            case 20:
                ((g5) this).P1((fa) v.a(parcel, fa.CREATOR));
                parcel2.writeNoException();
                break;
        }
        return true;
    }
}
