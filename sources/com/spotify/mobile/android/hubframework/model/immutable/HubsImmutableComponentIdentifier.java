package com.spotify.mobile.android.hubframework.model.immutable;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.d;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public class HubsImmutableComponentIdentifier implements q81, Parcelable {
    public static final Parcelable.Creator<HubsImmutableComponentIdentifier> CREATOR = new a();
    public static final b Companion;
    private static final HubsImmutableComponentIdentifier UNKNOWN;
    private final String category;
    private final d hashCode$delegate = kotlin.a.b(new HubsImmutableComponentIdentifier$hashCode$2(this));
    private final String id;

    public static final class a implements Parcelable.Creator<HubsImmutableComponentIdentifier> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public HubsImmutableComponentIdentifier createFromParcel(Parcel parcel) {
            h.e(parcel, "in");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            b bVar = HubsImmutableComponentIdentifier.Companion;
            h.c(readString);
            h.c(readString2);
            return bVar.a(readString, readString2);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public HubsImmutableComponentIdentifier[] newArray(int i) {
            return new HubsImmutableComponentIdentifier[i];
        }
    }

    public static final class b {
        public b(f fVar) {
        }

        public final HubsImmutableComponentIdentifier a(String str, String str2) {
            h.e(str, "id");
            h.e(str2, "category");
            return new HubsImmutableComponentIdentifier(str, str2);
        }

        public final HubsImmutableComponentIdentifier b(q81 q81) {
            if (q81 == null) {
                return HubsImmutableComponentIdentifier.UNKNOWN;
            }
            h.e(q81, "other");
            if (q81 instanceof HubsImmutableComponentIdentifier) {
                return (HubsImmutableComponentIdentifier) q81;
            }
            return a(q81.id(), q81.category());
        }
    }

    static {
        b bVar = new b(null);
        Companion = bVar;
        UNKNOWN = bVar.a("", "");
    }

    public HubsImmutableComponentIdentifier(String str, String str2) {
        h.e(str, "id");
        h.e(str2, "category");
        this.id = str;
        this.category = str2;
    }

    public static final HubsImmutableComponentIdentifier create(String str, String str2) {
        return Companion.a(str, str2);
    }

    public static final HubsImmutableComponentIdentifier fromNullable(q81 q81) {
        return Companion.b(q81);
    }

    private final int getHashCode() {
        return ((Number) this.hashCode$delegate.getValue()).intValue();
    }

    private static /* synthetic */ void getHashCode$annotations() {
    }

    public static final HubsImmutableComponentIdentifier unknown() {
        Companion.getClass();
        return UNKNOWN;
    }

    @Override // defpackage.q81
    public String category() {
        return this.category;
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
        if (!(obj instanceof HubsImmutableComponentIdentifier)) {
            return false;
        }
        HubsImmutableComponentIdentifier hubsImmutableComponentIdentifier = (HubsImmutableComponentIdentifier) obj;
        if (!rw.equal(this.id, hubsImmutableComponentIdentifier.id) || !rw.equal(this.category, hubsImmutableComponentIdentifier.category)) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return getHashCode();
    }

    @Override // defpackage.q81
    public String id() {
        return this.id;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        h.e(parcel, "dest");
        parcel.writeString(this.id);
        parcel.writeString(this.category);
    }
}
