package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.h;

/* renamed from: qeb  reason: default package */
public final class qeb implements Parcelable {
    public static final Parcelable.Creator CREATOR = new a();
    private final String a;
    private final reb b;
    private final List<peb> c;
    private final int f;

    /* renamed from: qeb$a */
    public static class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            h.e(parcel, "in");
            String readString = parcel.readString();
            reb reb = (reb) reb.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            while (readInt != 0) {
                arrayList.add((peb) peb.CREATOR.createFromParcel(parcel));
                readInt--;
            }
            return new qeb(readString, reb, arrayList, parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new qeb[i];
        }
    }

    public qeb(String str, reb reb, List<peb> list, int i) {
        h.e(str, "lyrics");
        h.e(reb, "trackInfo");
        h.e(list, "colorPalettes");
        this.a = str;
        this.b = reb;
        this.c = list;
        this.f = i;
    }

    public final int a() {
        return this.f;
    }

    public final List<peb> b() {
        return this.c;
    }

    public final String c() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final reb e() {
        return this.b;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qeb)) {
            return false;
        }
        qeb qeb = (qeb) obj;
        return h.a(this.a, qeb.a) && h.a(this.b, qeb.b) && h.a(this.c, qeb.c) && this.f == qeb.f;
    }

    @Override // java.lang.Object
    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        reb reb = this.b;
        int hashCode2 = (hashCode + (reb != null ? reb.hashCode() : 0)) * 31;
        List<peb> list = this.c;
        if (list != null) {
            i = list.hashCode();
        }
        return ((hashCode2 + i) * 31) + this.f;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("ShareableData(lyrics=");
        V0.append(this.a);
        V0.append(", trackInfo=");
        V0.append(this.b);
        V0.append(", colorPalettes=");
        V0.append(this.c);
        V0.append(", colorIndex=");
        return je.B0(V0, this.f, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        h.e(parcel, "parcel");
        parcel.writeString(this.a);
        this.b.writeToParcel(parcel, 0);
        List<peb> list = this.c;
        parcel.writeInt(list.size());
        for (peb peb : list) {
            peb.writeToParcel(parcel, 0);
        }
        parcel.writeInt(this.f);
    }
}
