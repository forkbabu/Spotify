package com.spotify.music.features.yourlibraryx.domain;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.h;

public final class j implements Parcelable {
    public static final Parcelable.Creator CREATOR = new a();
    private final YourLibraryXSortOption a;
    private final List<YourLibraryXSortOption> b;

    public static class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            h.e(parcel, "in");
            YourLibraryXSortOption yourLibraryXSortOption = (YourLibraryXSortOption) Enum.valueOf(YourLibraryXSortOption.class, parcel.readString());
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            while (readInt != 0) {
                arrayList.add((YourLibraryXSortOption) Enum.valueOf(YourLibraryXSortOption.class, parcel.readString()));
                readInt--;
            }
            return new j(yourLibraryXSortOption, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new j[i];
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.spotify.music.features.yourlibraryx.domain.YourLibraryXSortOption> */
    /* JADX WARN: Multi-variable type inference failed */
    public j(YourLibraryXSortOption yourLibraryXSortOption, List<? extends YourLibraryXSortOption> list) {
        h.e(yourLibraryXSortOption, "activeSortOption");
        h.e(list, "availableSortOptions");
        this.a = yourLibraryXSortOption;
        this.b = list;
    }

    public final YourLibraryXSortOption a() {
        return this.a;
    }

    public final List<YourLibraryXSortOption> b() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return h.a(this.a, jVar.a) && h.a(this.b, jVar.b);
    }

    @Override // java.lang.Object
    public int hashCode() {
        YourLibraryXSortOption yourLibraryXSortOption = this.a;
        int i = 0;
        int hashCode = (yourLibraryXSortOption != null ? yourLibraryXSortOption.hashCode() : 0) * 31;
        List<YourLibraryXSortOption> list = this.b;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("YourLibraryXSortOptionPickerData(activeSortOption=");
        V0.append(this.a);
        V0.append(", availableSortOptions=");
        return je.L0(V0, this.b, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        h.e(parcel, "parcel");
        parcel.writeString(this.a.name());
        List<YourLibraryXSortOption> list = this.b;
        parcel.writeInt(list.size());
        for (YourLibraryXSortOption yourLibraryXSortOption : list) {
            parcel.writeString(yourLibraryXSortOption.name());
        }
    }
}
