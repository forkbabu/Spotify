package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.a;
import java.util.Map;

public final class p extends a {
    public static final Parcelable.Creator<p> CREATOR = new q();
    Bundle a;
    private Map<String, String> b;

    public p(Bundle bundle) {
        this.a = bundle;
    }

    public final Map<String, String> I1() {
        if (this.b == null) {
            Bundle bundle = this.a;
            m1 m1Var = new m1();
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        m1Var.put(str, str2);
                    }
                }
            }
            this.b = m1Var;
        }
        return this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelReader.a(parcel);
        SafeParcelReader.E(parcel, 2, this.a, false);
        SafeParcelReader.m(parcel, a2);
    }
}
