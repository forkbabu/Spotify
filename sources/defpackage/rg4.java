package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.e61;

/* renamed from: rg4  reason: default package */
public class rg4 {

    /* renamed from: rg4$a */
    static class a extends e61.a {
        public static final Parcelable.Creator<a> CREATOR = new C0678a();
        public final Parcelable c;
        public final boolean f;

        /* renamed from: rg4$a$a  reason: collision with other inner class name */
        static class C0678a implements Parcelable.Creator<a> {
            C0678a() {
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public a createFromParcel(Parcel parcel) {
                e61.a createFromParcel = e61.a.CREATOR.createFromParcel(parcel);
                return new a(createFromParcel.a, createFromParcel.b, parcel.readParcelable(a.class.getClassLoader()), parcel.readInt() != 0);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public a[] newArray(int i) {
                return new a[i];
            }
        }

        a(Parcelable parcelable, Parcelable parcelable2, Parcelable parcelable3, boolean z) {
            super(parcelable, parcelable2);
            this.c = parcelable3;
            this.f = z;
        }

        @Override // defpackage.e61.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.a, i);
            parcel.writeParcelable(this.b, i);
            parcel.writeParcelable(this.c, i);
            parcel.writeInt(this.f ? 1 : 0);
        }
    }
}
