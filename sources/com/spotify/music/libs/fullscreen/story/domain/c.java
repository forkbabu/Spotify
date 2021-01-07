package com.spotify.music.libs.fullscreen.story.domain;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.h;

public final class c implements Parcelable {
    public static final Parcelable.Creator CREATOR = new a();
    private final OverlayModel a;
    private final b b;

    public static class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            h.e(parcel, "in");
            return new c(parcel.readInt() != 0 ? (OverlayModel) OverlayModel.CREATOR.createFromParcel(parcel) : null, (b) parcel.readParcelable(c.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new c[i];
        }
    }

    public c(OverlayModel overlayModel, b bVar) {
        h.e(bVar, "chapter");
        this.a = overlayModel;
        this.b = bVar;
    }

    public static c a(c cVar, OverlayModel overlayModel, b bVar, int i) {
        if ((i & 1) != 0) {
            overlayModel = cVar.a;
        }
        b bVar2 = (i & 2) != 0 ? cVar.b : null;
        h.e(bVar2, "chapter");
        return new c(overlayModel, bVar2);
    }

    public final b b() {
        return this.b;
    }

    public final OverlayModel c() {
        return this.a;
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
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return h.a(this.a, cVar.a) && h.a(this.b, cVar.b);
    }

    @Override // java.lang.Object
    public int hashCode() {
        OverlayModel overlayModel = this.a;
        int i = 0;
        int hashCode = (overlayModel != null ? overlayModel.hashCode() : 0) * 31;
        b bVar = this.b;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return hashCode + i;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("ChapterModel(overlay=");
        V0.append(this.a);
        V0.append(", chapter=");
        V0.append(this.b);
        V0.append(")");
        return V0.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        h.e(parcel, "parcel");
        OverlayModel overlayModel = this.a;
        if (overlayModel != null) {
            parcel.writeInt(1);
            overlayModel.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeParcelable(this.b, i);
    }
}
