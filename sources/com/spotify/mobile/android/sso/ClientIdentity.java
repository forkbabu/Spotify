package com.spotify.mobile.android.sso;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.hash.Hashing;
import com.spotify.base.java.logging.Logger;
import java.util.Arrays;
import java.util.Locale;

public class ClientIdentity implements Parcelable {
    public static final Parcelable.Creator<ClientIdentity> CREATOR = new a();
    private final String a;
    private final String b;

    public static class ValidationException extends Exception {
        private static final long serialVersionUID = 0;

        public ValidationException(String str) {
            super(str);
        }

        public ValidationException(Throwable th) {
            super(th);
        }
    }

    static class a implements Parcelable.Creator<ClientIdentity> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public ClientIdentity createFromParcel(Parcel parcel) {
            return new ClientIdentity(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public ClientIdentity[] newArray(int i) {
            return new ClientIdentity[i];
        }
    }

    public ClientIdentity(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    private static String a(Signature signature) {
        return Hashing.sha1().hashBytes(signature.toByteArray()).toString().toUpperCase(Locale.US);
    }

    public static ClientIdentity b(Context context, int i) {
        String[] packagesForUid = context.getPackageManager().getPackagesForUid(i);
        if (packagesForUid == null || packagesForUid.length == 0) {
            throw new ValidationException("Can't find packages for caller id");
        }
        String str = packagesForUid[0];
        return new ClientIdentity(str, a(e(context, str)));
    }

    public static ClientIdentity c(Context context, String str) {
        String a2 = a(e(context, str));
        Logger.b("Fingerprint: %s", a2);
        return new ClientIdentity(str, a2);
    }

    private static Signature e(Context context, String str) {
        try {
            Signature[] signatureArr = context.getPackageManager().getPackageInfo(str, 64).signatures;
            if (signatureArr.length == 1) {
                return signatureArr[0];
            }
            throw new ValidationException("Multiple certificates found");
        } catch (PackageManager.NameNotFoundException e) {
            throw new ValidationException(e);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClientIdentity)) {
            return false;
        }
        ClientIdentity clientIdentity = (ClientIdentity) obj;
        if (!rw.equal(this.a, clientIdentity.a) || !rw.equal(this.b, clientIdentity.b)) {
            return false;
        }
        return true;
    }

    public String f() {
        return this.a;
    }

    public String g() {
        return this.b;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }

    protected ClientIdentity(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
    }
}
