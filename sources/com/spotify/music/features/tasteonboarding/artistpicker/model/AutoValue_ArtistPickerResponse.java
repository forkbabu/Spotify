package com.spotify.music.features.tasteonboarding.artistpicker.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.music.features.tasteonboarding.artistpicker.rendertype.PickerViewType;
import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;
import java.util.List;

final class AutoValue_ArtistPickerResponse extends C$AutoValue_ArtistPickerResponse {
    public static final Parcelable.Creator<AutoValue_ArtistPickerResponse> CREATOR = new a();
    private static final TasteOnboardingItem.a LIST_TYPE_ADAPTER = new TasteOnboardingItem.a();

    static class a implements Parcelable.Creator<AutoValue_ArtistPickerResponse> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_ArtistPickerResponse createFromParcel(Parcel parcel) {
            TasteOnboardingItem.a aVar = AutoValue_ArtistPickerResponse.LIST_TYPE_ADAPTER;
            aVar.getClass();
            return new AutoValue_ArtistPickerResponse(parcel.createTypedArrayList(aVar), (PickerViewType) Enum.valueOf(PickerViewType.class, parcel.readString()));
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_ArtistPickerResponse[] newArray(int i) {
            return new AutoValue_ArtistPickerResponse[i];
        }
    }

    AutoValue_ArtistPickerResponse(List<TasteOnboardingItem> list, PickerViewType pickerViewType) {
        super(list, pickerViewType);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        TasteOnboardingItem.a aVar = LIST_TYPE_ADAPTER;
        List<TasteOnboardingItem> items = items();
        aVar.getClass();
        parcel.writeTypedList(items);
        parcel.writeString(renderType().name());
    }
}
