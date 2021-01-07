package com.spotify.music.features.tasteonboarding.artistsearch.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;
import java.util.List;

/* access modifiers changed from: package-private */
public final class AutoValue_ArtistSearchResponse extends C$AutoValue_ArtistSearchResponse {
    public static final Parcelable.Creator<AutoValue_ArtistSearchResponse> CREATOR = new a();

    static class a implements Parcelable.Creator<AutoValue_ArtistSearchResponse> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_ArtistSearchResponse createFromParcel(Parcel parcel) {
            return new AutoValue_ArtistSearchResponse(parcel.readArrayList(ArtistSearchResponse.class.getClassLoader()), parcel.readInt() == 0 ? parcel.readString() : null);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_ArtistSearchResponse[] newArray(int i) {
            return new AutoValue_ArtistSearchResponse[i];
        }
    }

    AutoValue_ArtistSearchResponse(List<TasteOnboardingItem> list, String str) {
        super(list, str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(results());
        if (nextPage() == null) {
            parcel.writeInt(1);
            return;
        }
        parcel.writeInt(0);
        parcel.writeString(nextPage());
    }
}
