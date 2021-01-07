package com.spotify.music.libs.fullscreen.story.domain;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.h;

public final class e implements Parcelable {
    public static final Parcelable.Creator CREATOR = new a();
    private final List<d> a;

    public static class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            h.e(parcel, "in");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            while (readInt != 0) {
                arrayList.add((d) d.CREATOR.createFromParcel(parcel));
                readInt--;
            }
            return new e(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new e[i];
        }
    }

    public e(List<d> list) {
        h.e(list, "items");
        this.a = list;
    }

    public final List<d> a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof e) && h.a(this.a, ((e) obj).a);
        }
        return true;
    }

    @Override // java.lang.Object
    public int hashCode() {
        List<d> list = this.a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    @Override // java.lang.Object
    public String toString() {
        return je.L0(je.V0("ContextMenu(items="), this.a, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        h.e(parcel, "parcel");
        List<d> list = this.a;
        parcel.writeInt(list.size());
        for (d dVar : list) {
            dVar.writeToParcel(parcel, 0);
        }
    }
}
