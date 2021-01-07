package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: e61  reason: default package */
public interface e61 {

    /* renamed from: e61$a */
    public static class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C0590a();
        public final Parcelable a;
        public final Parcelable b;

        /* renamed from: e61$a$a  reason: collision with other inner class name */
        static class C0590a implements Parcelable.Creator<a> {
            C0590a() {
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public a createFromParcel(Parcel parcel) {
                return new a(parcel.readParcelable(a.class.getClassLoader()), parcel.readParcelable(a.class.getClassLoader()));
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public a[] newArray(int i) {
                return new a[i];
            }
        }

        public a(Parcelable parcelable, Parcelable parcelable2) {
            this.a = parcelable;
            this.b = parcelable2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.a, i);
            parcel.writeParcelable(this.b, i);
        }
    }

    void C(RecyclerView.e<?> eVar);

    View b();

    Parcelable e();

    void f(Parcelable parcelable);

    void h(int... iArr);

    void i(RecyclerView.e<?> eVar);

    void k(q61 q61);

    void n(int... iArr);

    void s(b91 b91);

    boolean w();
}
