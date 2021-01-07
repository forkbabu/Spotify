package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.inappmessaging.ActionType;

/* renamed from: bp0  reason: default package */
final class bp0 extends yo0 {
    public static final Parcelable.Creator<bp0> CREATOR = new a();

    /* renamed from: bp0$a */
    static class a implements Parcelable.Creator<bp0> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public bp0 createFromParcel(Parcel parcel) {
            ActionType actionType = (ActionType) Enum.valueOf(ActionType.class, parcel.readString());
            String str = null;
            String readString = parcel.readInt() == 0 ? parcel.readString() : null;
            if (parcel.readInt() == 0) {
                str = parcel.readString();
            }
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            return new bp0(actionType, readString, str, z);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public bp0[] newArray(int i) {
            return new bp0[i];
        }
    }

    bp0(ActionType actionType, String str, String str2, boolean z) {
        super(actionType, str, str2, z);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(b().name());
        if (e() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(e());
        }
        if (c() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(c());
        }
        parcel.writeInt(f() ? 1 : 0);
    }
}
