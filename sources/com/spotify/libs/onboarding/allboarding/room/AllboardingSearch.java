package com.spotify.libs.onboarding.allboarding.room;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import kotlin.jvm.internal.h;

@Keep
public final class AllboardingSearch implements Parcelable {
    public static final Parcelable.Creator CREATOR = new a();
    private final String initialText;
    private final String placeholder;
    private final String url;

    public static class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            h.e(parcel, "in");
            return new AllboardingSearch(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AllboardingSearch[i];
        }
    }

    public AllboardingSearch(String str, String str2, String str3) {
        je.x(str, "url", str2, "placeholder", str3, "initialText");
        this.url = str;
        this.placeholder = str2;
        this.initialText = str3;
    }

    public static /* synthetic */ AllboardingSearch copy$default(AllboardingSearch allboardingSearch, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = allboardingSearch.url;
        }
        if ((i & 2) != 0) {
            str2 = allboardingSearch.placeholder;
        }
        if ((i & 4) != 0) {
            str3 = allboardingSearch.initialText;
        }
        return allboardingSearch.copy(str, str2, str3);
    }

    public final String component1() {
        return this.url;
    }

    public final String component2() {
        return this.placeholder;
    }

    public final String component3() {
        return this.initialText;
    }

    public final AllboardingSearch copy(String str, String str2, String str3) {
        h.e(str, "url");
        h.e(str2, "placeholder");
        h.e(str3, "initialText");
        return new AllboardingSearch(str, str2, str3);
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
        if (!(obj instanceof AllboardingSearch)) {
            return false;
        }
        AllboardingSearch allboardingSearch = (AllboardingSearch) obj;
        return h.a(this.url, allboardingSearch.url) && h.a(this.placeholder, allboardingSearch.placeholder) && h.a(this.initialText, allboardingSearch.initialText);
    }

    public final String getInitialText() {
        return this.initialText;
    }

    public final String getPlaceholder() {
        return this.placeholder;
    }

    public final String getUrl() {
        return this.url;
    }

    @Override // java.lang.Object
    public int hashCode() {
        String str = this.url;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.placeholder;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.initialText;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("AllboardingSearch(url=");
        V0.append(this.url);
        V0.append(", placeholder=");
        V0.append(this.placeholder);
        V0.append(", initialText=");
        return je.I0(V0, this.initialText, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        h.e(parcel, "parcel");
        parcel.writeString(this.url);
        parcel.writeString(this.placeholder);
        parcel.writeString(this.initialText);
    }
}
