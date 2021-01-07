package com.spotify.mobile.android.util;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

@Deprecated
public class SortOption implements Parcelable, Serializable {
    public static final Parcelable.Creator<SortOption> CREATOR = new a();
    private static final long serialVersionUID = -2805295673093531891L;
    private final boolean mIsReversible;
    private final String mKey;
    private final int mResourceId;
    private boolean mReversed;
    private SortOption mSecondarySortOption;

    static class a implements Parcelable.Creator<SortOption> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public SortOption createFromParcel(Parcel parcel) {
            return new SortOption(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public SortOption[] newArray(int i) {
            return new SortOption[i];
        }
    }

    public SortOption(String str) {
        this.mKey = str;
        this.mResourceId = 0;
        this.mIsReversible = false;
        this.mReversed = false;
    }

    public String a() {
        return this.mKey;
    }

    public String b() {
        boolean z = this.mReversed;
        StringBuilder sb = new StringBuilder();
        sb.append(this.mKey);
        sb.append((!this.mIsReversible || !z) ? "" : " REVERSE");
        return sb.toString();
    }

    public int c() {
        return this.mResourceId;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public SortOption e() {
        return this.mSecondarySortOption;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if ((obj instanceof SortOption) && ((SortOption) obj).mKey.equals(this.mKey)) {
            return true;
        }
        return false;
    }

    public boolean f() {
        if (!this.mIsReversible) {
            return false;
        }
        return this.mReversed;
    }

    public boolean g() {
        return this.mIsReversible;
    }

    public SortOption h(boolean z, boolean z2) {
        SortOption sortOption;
        if (z2 && (sortOption = this.mSecondarySortOption) != null) {
            sortOption.h(z, true);
        }
        if (!this.mIsReversible) {
            return this;
        }
        this.mReversed = z;
        return this;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return this.mKey.hashCode();
    }

    public SortOption i(SortOption sortOption) {
        this.mSecondarySortOption = sortOption;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mKey);
        parcel.writeInt(this.mResourceId);
        parcel.writeInt(this.mIsReversible ? 1 : 0);
        parcel.writeInt(this.mReversed ? 1 : 0);
        gf0.v(parcel, this.mSecondarySortOption, 0);
    }

    public SortOption(String str, int i) {
        this.mKey = str;
        this.mResourceId = i;
        this.mIsReversible = true;
        this.mReversed = false;
    }

    public SortOption(String str, int i, boolean z) {
        this.mKey = str;
        this.mResourceId = i;
        this.mIsReversible = z;
        this.mReversed = false;
    }

    public SortOption(String str, boolean z) {
        this.mKey = str;
        this.mResourceId = 0;
        this.mIsReversible = z;
        this.mReversed = false;
    }

    public SortOption(SortOption sortOption) {
        this.mKey = sortOption.mKey;
        this.mResourceId = sortOption.mResourceId;
        this.mIsReversible = sortOption.mIsReversible;
        this.mReversed = sortOption.f();
        SortOption sortOption2 = sortOption.mSecondarySortOption;
        if (sortOption2 != null) {
            this.mSecondarySortOption = new SortOption(sortOption2);
        }
    }

    protected SortOption(Parcel parcel) {
        this.mKey = parcel.readString();
        this.mResourceId = parcel.readInt();
        boolean z = true;
        this.mIsReversible = parcel.readInt() != 0;
        this.mReversed = parcel.readInt() == 0 ? false : z;
        this.mSecondarySortOption = (SortOption) gf0.n(parcel, CREATOR);
    }
}
