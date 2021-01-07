package com.spotify.mobile.android.service.session;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.mobile.android.service.session.SessionState;

/* access modifiers changed from: package-private */
public final class AutoValue_SessionState extends C$AutoValue_SessionState {
    public static final Parcelable.Creator<AutoValue_SessionState> CREATOR = new a();
    private static final SessionState.b PAYMENT_STATE_ADAPTER = new SessionState.b();

    static class a implements Parcelable.Creator<AutoValue_SessionState> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_SessionState createFromParcel(Parcel parcel) {
            return new AutoValue_SessionState(parcel.readString(), parcel.readString(), parcel.readInt() == 1, parcel.readInt() == 1, parcel.readInt() == 1, parcel.readInt(), parcel.readString(), parcel.readInt() == 1, parcel.readInt() == 1, parcel.readInt() == 1, (xa1) AutoValue_SessionState.PAYMENT_STATE_ADAPTER.a(parcel), parcel.readString());
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_SessionState[] newArray(int i) {
            return new AutoValue_SessionState[i];
        }
    }

    AutoValue_SessionState(String str, String str2, boolean z, boolean z2, boolean z3, int i, String str3, boolean z4, boolean z5, boolean z6, xa1 xa1, String str4) {
        super(str, str2, z, z2, z3, i, str3, z4, z5, z6, xa1, str4);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(currentUser());
        parcel.writeString(currentUserName());
        parcel.writeInt(loggedIn() ? 1 : 0);
        parcel.writeInt(loggingIn() ? 1 : 0);
        parcel.writeInt(loggingOut() ? 1 : 0);
        parcel.writeInt(currentAccountType());
        parcel.writeString(countryCode());
        parcel.writeInt(connected() ? 1 : 0);
        parcel.writeInt(canConnect() ? 1 : 0);
        parcel.writeInt(canStream() ? 1 : 0);
        SessionState.b bVar = PAYMENT_STATE_ADAPTER;
        xa1 paymentState = paymentState();
        bVar.getClass();
        gf0.v(parcel, paymentState, 0);
        parcel.writeString(productType());
    }
}
