package com.spotify.music.features.tasteonboarding.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.music.features.tasteonboarding.model.TasteOnboardingImage;
import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;
import java.util.ArrayList;
import java.util.List;

/* access modifiers changed from: package-private */
public final class AutoValue_TasteOnboardingItem extends C$AutoValue_TasteOnboardingItem {
    public static final Parcelable.Creator<AutoValue_TasteOnboardingItem> CREATOR = new a();
    private static final TasteOnboardingItem.a LIST_TYPE_ADAPTER = new TasteOnboardingItem.a();
    private static final TasteOnboardingImage.a LIST_TYPE_ADAPTER_ = new TasteOnboardingImage.a();

    static class a implements Parcelable.Creator<AutoValue_TasteOnboardingItem> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_TasteOnboardingItem createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readInt() == 0 ? parcel.readString() : null;
            TasteOnboardingItem.a aVar = AutoValue_TasteOnboardingItem.LIST_TYPE_ADAPTER;
            aVar.getClass();
            ArrayList createTypedArrayList = parcel.createTypedArrayList(aVar);
            TasteOnboardingImage.a aVar2 = AutoValue_TasteOnboardingItem.LIST_TYPE_ADAPTER_;
            aVar2.getClass();
            ArrayList createTypedArrayList2 = parcel.createTypedArrayList(aVar2);
            d dVar = (d) parcel.readParcelable(TasteOnboardingItem.class.getClassLoader());
            String readString4 = parcel.readInt() == 0 ? parcel.readString() : null;
            String readString5 = parcel.readInt() == 0 ? parcel.readString() : null;
            boolean z = true;
            boolean z2 = parcel.readInt() == 1;
            boolean z3 = parcel.readInt() == 1;
            boolean z4 = parcel.readInt() == 1;
            if (parcel.readInt() != 1) {
                z = false;
            }
            return new AutoValue_TasteOnboardingItem(readString, readString2, readString3, createTypedArrayList, createTypedArrayList2, dVar, readString4, readString5, z2, z3, z4, z, parcel.readInt() == 0 ? parcel.readString() : null);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_TasteOnboardingItem[] newArray(int i) {
            return new AutoValue_TasteOnboardingItem[i];
        }
    }

    AutoValue_TasteOnboardingItem(String str, String str2, String str3, List<TasteOnboardingItem> list, List<TasteOnboardingImage> list2, d dVar, String str4, String str5, boolean z, boolean z2, boolean z3, boolean z4, String str6) {
        super(str, str2, str3, list, list2, dVar, str4, str5, z, z2, z3, z4, str6);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(id());
        parcel.writeString(name());
        if (image() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(image());
        }
        TasteOnboardingItem.a aVar = LIST_TYPE_ADAPTER;
        List<TasteOnboardingItem> relatedItems = relatedItems();
        aVar.getClass();
        parcel.writeTypedList(relatedItems);
        TasteOnboardingImage.a aVar2 = LIST_TYPE_ADAPTER_;
        List<TasteOnboardingImage> imagesWithSize = imagesWithSize();
        aVar2.getClass();
        parcel.writeTypedList(imagesWithSize);
        parcel.writeParcelable(logging(), i);
        if (moreUri() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(moreUri());
        }
        if (relatedMedia() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(relatedMedia());
        }
        parcel.writeInt(isArtist() ? 1 : 0);
        parcel.writeInt(isPodcast() ? 1 : 0);
        parcel.writeInt(isLiked() ? 1 : 0);
        parcel.writeInt(isExpanded() ? 1 : 0);
        if (color() == null) {
            parcel.writeInt(1);
            return;
        }
        parcel.writeInt(0);
        parcel.writeString(color());
    }
}
