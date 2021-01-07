package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.p0;

/* renamed from: mt  reason: default package */
public class mt extends Binder implements IInterface {
    protected mt(String str) {
        attachInterface(this, str);
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean z;
        if (i > 16777215) {
            z = super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
            z = false;
        }
        if (z) {
            return true;
        }
        cv cvVar = (cv) this;
        switch (i) {
            case 3:
                ConnectionResult connectionResult = (ConnectionResult) ot.a(parcel, ConnectionResult.CREATOR);
                zu zuVar = (zu) ot.a(parcel, zu.CREATOR);
                break;
            case 4:
                Status status = (Status) ot.a(parcel, Status.CREATOR);
                break;
            case 5:
            default:
                return false;
            case 6:
                Status status2 = (Status) ot.a(parcel, Status.CREATOR);
                break;
            case 7:
                Status status3 = (Status) ot.a(parcel, Status.CREATOR);
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) ot.a(parcel, GoogleSignInAccount.CREATOR);
                break;
            case 8:
                ((p0) cvVar).G3((jv) ot.a(parcel, jv.CREATOR));
                break;
            case 9:
                hv hvVar = (hv) ot.a(parcel, hv.CREATOR);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
