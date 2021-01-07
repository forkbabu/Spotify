package defpackage;

import android.os.Parcel;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;

/* renamed from: gt  reason: default package */
public abstract class gt extends qs implements ht {
    public gt() {
        super("com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks");
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.qs
    public final boolean C3(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            G0((Status) ss.a(parcel, Status.CREATOR), (Credential) ss.a(parcel, Credential.CREATOR));
        } else if (i == 2) {
            O1((Status) ss.a(parcel, Status.CREATOR));
        } else if (i != 3) {
            return false;
        } else {
            Status status = (Status) ss.a(parcel, Status.CREATOR);
            parcel.readString();
            throw new UnsupportedOperationException();
        }
        parcel2.writeNoException();
        return true;
    }
}
