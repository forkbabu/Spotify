package com.spotify.music.features.yourlibraryx.domain;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.h;

public final class a implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C0267a();
    private final int a;
    private final SubscriptionType b;
    private final boolean c;
    private final boolean f;

    /* renamed from: com.spotify.music.features.yourlibraryx.domain.a$a  reason: collision with other inner class name */
    public static class C0267a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            h.e(parcel, "in");
            int readInt = parcel.readInt();
            SubscriptionType subscriptionType = (SubscriptionType) Enum.valueOf(SubscriptionType.class, parcel.readString());
            boolean z = true;
            boolean z2 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                z = false;
            }
            return new a(readInt, subscriptionType, z2, z);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new a[i];
        }
    }

    public a(int i, SubscriptionType subscriptionType, boolean z, boolean z2) {
        h.e(subscriptionType, "type");
        this.a = i;
        this.b = subscriptionType;
        this.c = z;
        this.f = z2;
    }

    public final int a() {
        return this.a;
    }

    public final boolean b() {
        return this.c;
    }

    public final boolean c() {
        return this.f;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final SubscriptionType e() {
        return this.b;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && h.a(this.b, aVar.b) && this.c == aVar.c && this.f == aVar.f;
    }

    @Override // java.lang.Object
    public int hashCode() {
        int i = this.a * 31;
        SubscriptionType subscriptionType = this.b;
        int hashCode = (i + (subscriptionType != null ? subscriptionType.hashCode() : 0)) * 31;
        boolean z = this.c;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode + i3) * 31;
        boolean z2 = this.f;
        if (!z2) {
            i2 = z2 ? 1 : 0;
        }
        return i6 + i2;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("SubscriptionContext(id=");
        V0.append(this.a);
        V0.append(", type=");
        V0.append(this.b);
        V0.append(", reset=");
        V0.append(this.c);
        V0.append(", scrollToTop=");
        return je.P0(V0, this.f, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        h.e(parcel, "parcel");
        parcel.writeInt(this.a);
        parcel.writeString(this.b.name());
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i, SubscriptionType subscriptionType, boolean z, boolean z2, int i2) {
        this(i, (i2 & 2) != 0 ? SubscriptionType.NONE : subscriptionType, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? false : z2);
    }
}
