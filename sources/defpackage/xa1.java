package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.spotify.mobile.android.util.Assertion;
import java.util.Arrays;

/* renamed from: xa1  reason: default package */
public class xa1 implements Parcelable {
    public static final Parcelable.Creator<xa1> CREATOR = new a();
    private final String[] a;

    /* renamed from: xa1$a */
    static class a implements Parcelable.Creator<xa1> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public xa1 createFromParcel(Parcel parcel) {
            return new xa1(parcel, null);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public xa1[] newArray(int i) {
            return new xa1[i];
        }
    }

    public xa1(String str) {
        int i = 0;
        if (str == null || str.isEmpty()) {
            this.a = new String[0];
            return;
        }
        this.a = str.split(";");
        while (true) {
            String[] strArr = this.a;
            if (i < strArr.length) {
                strArr[i] = strArr[i].trim();
                i++;
            } else {
                return;
            }
        }
    }

    public int a() {
        if (!c()) {
            return -1;
        }
        String[] strArr = this.a;
        if (strArr.length < 2) {
            return -1;
        }
        try {
            return Integer.parseInt(strArr[1]);
        } catch (NumberFormatException e) {
            StringBuilder V0 = je.V0("Failed to parse retry number of '");
            V0.append(toString());
            V0.append('\'');
            Assertion.i(V0.toString(), e);
            return -1;
        }
    }

    public boolean b() {
        String[] strArr = this.a;
        return strArr.length == 3 && "opt-in-trial".equals(strArr[0]);
    }

    public boolean c() {
        String[] strArr = this.a;
        if (strArr.length == 2 && "creditcard_funds".equals(strArr[0])) {
            return true;
        }
        String[] strArr2 = this.a;
        if (strArr2.length == 2 && "creditcard_refused".equals(strArr2[0])) {
            return true;
        }
        String[] strArr3 = this.a;
        if (strArr3.length == 2 && "paypal_refused".equals(strArr3[0])) {
            return true;
        }
        return false;
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
        if (!(obj instanceof xa1)) {
            return false;
        }
        return Arrays.equals(this.a, ((xa1) obj).a);
    }

    @Override // java.lang.Object
    public int hashCode() {
        return Arrays.hashCode(this.a);
    }

    @Override // java.lang.Object
    public String toString() {
        return TextUtils.join(";", this.a);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringArray(this.a);
    }

    xa1(Parcel parcel, a aVar) {
        this.a = parcel.createStringArray();
    }
}
