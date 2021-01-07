package com.spotify.music.homecomponents.dialogs.showmore;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.h;

public final class a implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C0276a();
    private final i a;
    private final g b;
    private final h c;

    /* renamed from: com.spotify.music.homecomponents.dialogs.showmore.a$a  reason: collision with other inner class name */
    public static class C0276a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            h.e(parcel, "in");
            return new a((i) i.CREATOR.createFromParcel(parcel), (g) g.CREATOR.createFromParcel(parcel), (h) h.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new a[i];
        }
    }

    public a() {
        this(null, null, null, 7);
    }

    public a(i iVar, g gVar, h hVar) {
        h.e(iVar, "headerData");
        h.e(gVar, "contentList");
        h.e(hVar, "footerData");
        this.a = iVar;
        this.b = gVar;
        this.c = hVar;
    }

    public final g a() {
        return this.b;
    }

    public final h b() {
        return this.c;
    }

    public final i c() {
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
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return h.a(this.a, aVar.a) && h.a(this.b, aVar.b) && h.a(this.c, aVar.c);
    }

    @Override // java.lang.Object
    public int hashCode() {
        i iVar = this.a;
        int i = 0;
        int hashCode = (iVar != null ? iVar.hashCode() : 0) * 31;
        g gVar = this.b;
        int hashCode2 = (hashCode + (gVar != null ? gVar.hashCode() : 0)) * 31;
        h hVar = this.c;
        if (hVar != null) {
            i = hVar.hashCode();
        }
        return hashCode2 + i;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("ShowMoreBottomSheetData(headerData=");
        V0.append(this.a);
        V0.append(", contentList=");
        V0.append(this.b);
        V0.append(", footerData=");
        V0.append(this.c);
        V0.append(")");
        return V0.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        h.e(parcel, "parcel");
        this.a.writeToParcel(parcel, 0);
        this.b.writeToParcel(parcel, 0);
        this.c.writeToParcel(parcel, 0);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(i iVar, g gVar, h hVar, int i) {
        this((i & 1) != 0 ? new i(null, null, null, null, 15) : null, (i & 2) != 0 ? new g(null, 1) : null, (i & 4) != 0 ? new h(null, 1) : null);
    }
}
