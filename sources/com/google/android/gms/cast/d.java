package com.google.android.gms.cast;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class d extends a {
    public static final Parcelable.Creator<d> CREATOR = new k1();
    private String a;
    private String b;
    private List<String> c;
    private String f;
    private Uri n;
    private String o;
    private String p;

    /* JADX WARN: Incorrect args count in method signature: (Ljava/lang/String;Ljava/lang/String;Ljava/util/List<Lhr;>;Ljava/util/List<Ljava/lang/String;>;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V */
    d(String str, String str2, List list, String str3, Uri uri, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.f = str3;
        this.n = uri;
        this.o = str4;
        this.p = str5;
    }

    public String I1() {
        return this.a;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return com.google.android.gms.cast.internal.a.d(this.a, dVar.a) && com.google.android.gms.cast.internal.a.d(this.b, dVar.b) && com.google.android.gms.cast.internal.a.d(this.c, dVar.c) && com.google.android.gms.cast.internal.a.d(this.f, dVar.f) && com.google.android.gms.cast.internal.a.d(this.n, dVar.n) && com.google.android.gms.cast.internal.a.d(this.o, dVar.o) && com.google.android.gms.cast.internal.a.d(this.p, dVar.p);
    }

    @Override // java.lang.Object
    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.f, this.n, this.o});
    }

    @Override // java.lang.Object
    public String toString() {
        String str = this.a;
        String str2 = this.b;
        List<String> list = this.c;
        int size = list == null ? 0 : list.size();
        String str3 = this.f;
        String valueOf = String.valueOf(this.n);
        String str4 = this.o;
        String str5 = this.p;
        StringBuilder U0 = je.U0(je.N0(str5, je.N0(str4, valueOf.length() + je.N0(str3, je.N0(str2, je.N0(str, 118))))), "applicationId: ", str, ", name: ", str2);
        U0.append(", namespaces.count: ");
        U0.append(size);
        U0.append(", senderAppIdentifier: ");
        U0.append(str3);
        U0.append(", senderAppLaunchUrl: ");
        U0.append(valueOf);
        U0.append(", iconUrl: ");
        U0.append(str4);
        return je.I0(U0, ", type: ", str5);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelReader.a(parcel);
        SafeParcelReader.T(parcel, 2, this.a, false);
        SafeParcelReader.T(parcel, 3, this.b, false);
        SafeParcelReader.X(parcel, 4, null, false);
        SafeParcelReader.V(parcel, 5, Collections.unmodifiableList(this.c), false);
        SafeParcelReader.T(parcel, 6, this.f, false);
        SafeParcelReader.S(parcel, 7, this.n, i, false);
        SafeParcelReader.T(parcel, 8, this.o, false);
        SafeParcelReader.T(parcel, 9, this.p, false);
        SafeParcelReader.m(parcel, a2);
    }

    private d() {
        this.c = new ArrayList();
    }
}
