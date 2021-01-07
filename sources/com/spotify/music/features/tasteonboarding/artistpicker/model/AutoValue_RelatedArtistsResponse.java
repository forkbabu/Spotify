package com.spotify.music.features.tasteonboarding.artistpicker.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;
import java.util.List;

/* access modifiers changed from: package-private */
public final class AutoValue_RelatedArtistsResponse extends C$AutoValue_RelatedArtistsResponse {
    public static final Parcelable.Creator<AutoValue_RelatedArtistsResponse> CREATOR = new a();
    private static final TasteOnboardingItem.a LIST_TYPE_ADAPTER = new TasteOnboardingItem.a();

    static class a implements Parcelable.Creator<AutoValue_RelatedArtistsResponse> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_RelatedArtistsResponse createFromParcel(Parcel parcel) {
            TasteOnboardingItem.a aVar = AutoValue_RelatedArtistsResponse.LIST_TYPE_ADAPTER;
            aVar.getClass();
            return new AutoValue_RelatedArtistsResponse(parcel.createTypedArrayList(aVar));
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_RelatedArtistsResponse[] newArray(int i) {
            return new AutoValue_RelatedArtistsResponse[i];
        }
    }

    AutoValue_RelatedArtistsResponse(List<TasteOnboardingItem> list) {
        super(list);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        TasteOnboardingItem.a aVar = LIST_TYPE_ADAPTER;
        List<TasteOnboardingItem> relatedArtists = relatedArtists();
        aVar.getClass();
        parcel.writeTypedList(relatedArtists);
    }
}
