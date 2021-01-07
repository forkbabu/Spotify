package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.inappmessaging.FormatType;
import com.spotify.inappmessaging.TriggerType;

/* access modifiers changed from: package-private */
/* renamed from: dp0  reason: default package */
public final class dp0 extends ap0 {
    public static final Parcelable.Creator<dp0> CREATOR = new a();

    /* renamed from: dp0$a */
    static class a implements Parcelable.Creator<dp0> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public dp0 createFromParcel(Parcel parcel) {
            return new dp0((TriggerType) Enum.valueOf(TriggerType.class, parcel.readString()), parcel.readString(), (FormatType) Enum.valueOf(FormatType.class, parcel.readString()));
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public dp0[] newArray(int i) {
            return new dp0[i];
        }
    }

    dp0(TriggerType triggerType, String str, FormatType formatType) {
        super(triggerType, str, formatType);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(e().name());
        parcel.writeString(c());
        parcel.writeString(b().name());
    }
}
