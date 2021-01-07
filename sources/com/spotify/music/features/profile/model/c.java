package com.spotify.music.features.profile.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;
import com.spotify.music.features.profile.model.e;
import java.util.ArrayList;
import java.util.Collection;

final class c extends a {
    public static final Parcelable.Creator<c> CREATOR = new a();
    private static final e.b f = new e.b();

    static class a implements Parcelable.Creator<c> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public c createFromParcel(Parcel parcel) {
            e.b unused = c.f;
            ArrayList arrayList = new ArrayList();
            parcel.readTypedList(arrayList, new f());
            return new c((LoadingState) Enum.valueOf(LoadingState.class, parcel.readString()), ImmutableList.copyOf((Collection) arrayList));
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public c[] newArray(int i) {
            return new c[i];
        }
    }

    c(LoadingState loadingState, ImmutableList<ProfileListItem> immutableList) {
        super(loadingState, immutableList);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(c().name());
        parcel.writeTypedList(b());
    }
}
