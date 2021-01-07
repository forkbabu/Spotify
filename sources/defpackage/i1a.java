package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.music.libs.assistedcuration.model.e;
import java.util.List;

/* renamed from: i1a  reason: default package */
public abstract class i1a implements Parcelable {
    public static final Parcelable.Creator<i1a> a = new a();

    /* renamed from: i1a$a */
    static class a implements Parcelable.Creator<i1a> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public i1a createFromParcel(Parcel parcel) {
            return h1a.CREATOR.createFromParcel(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public i1a[] newArray(int i) {
            return h1a.CREATOR.newArray(i);
        }
    }

    public abstract List<e> a();

    public abstract String getName();
}
