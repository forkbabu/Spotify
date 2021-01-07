package androidx.navigation;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.UUID;

final class i implements Parcelable {
    public static final Parcelable.Creator<i> CREATOR = new a();
    private final UUID a;
    private final int b;
    private final Bundle c;
    private final Bundle f;

    class a implements Parcelable.Creator<i> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public i createFromParcel(Parcel parcel) {
            return new i(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public i[] newArray(int i) {
            return new i[i];
        }
    }

    i(h hVar) {
        this.a = hVar.o;
        this.b = hVar.b().k();
        this.c = hVar.a();
        Bundle bundle = new Bundle();
        this.f = bundle;
        hVar.g(bundle);
    }

    /* access modifiers changed from: package-private */
    public Bundle a() {
        return this.c;
    }

    /* access modifiers changed from: package-private */
    public int b() {
        return this.b;
    }

    /* access modifiers changed from: package-private */
    public Bundle c() {
        return this.f;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public UUID e() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a.toString());
        parcel.writeInt(this.b);
        parcel.writeBundle(this.c);
        parcel.writeBundle(this.f);
    }

    i(Parcel parcel) {
        this.a = UUID.fromString(parcel.readString());
        this.b = parcel.readInt();
        this.c = parcel.readBundle(i.class.getClassLoader());
        this.f = parcel.readBundle(i.class.getClassLoader());
    }
}
