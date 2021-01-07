package com.spotify.music.libs.fullscreen.story.domain;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.player.model.ContextTrack;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.h;

public final class p implements Parcelable {
    public static final Parcelable.Creator CREATOR = new a();
    private final String a;
    private final String b;
    private final String c;
    private final String f;
    private final e n;
    private final List<c> o;

    public static class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            h.e(parcel, "in");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            e eVar = (e) e.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            while (readInt != 0) {
                arrayList.add((c) c.CREATOR.createFromParcel(parcel));
                readInt--;
            }
            return new p(readString, readString2, readString3, readString4, eVar, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new p[i];
        }
    }

    public p(String str, String str2, String str3, String str4, e eVar, List<c> list) {
        h.e(str, "id");
        h.e(str2, "title");
        h.e(str3, ContextTrack.Metadata.KEY_SUBTITLE);
        h.e(str4, "imageUri");
        h.e(eVar, "contextMenu");
        h.e(list, "chapters");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.f = str4;
        this.n = eVar;
        this.o = list;
    }

    public static p a(p pVar, String str, String str2, String str3, String str4, e eVar, List list, int i) {
        e eVar2 = null;
        String str5 = (i & 1) != 0 ? pVar.a : null;
        String str6 = (i & 2) != 0 ? pVar.b : null;
        String str7 = (i & 4) != 0 ? pVar.c : null;
        String str8 = (i & 8) != 0 ? pVar.f : null;
        if ((i & 16) != 0) {
            eVar2 = pVar.n;
        }
        if ((i & 32) != 0) {
            list = pVar.o;
        }
        pVar.getClass();
        h.e(str5, "id");
        h.e(str6, "title");
        h.e(str7, ContextTrack.Metadata.KEY_SUBTITLE);
        h.e(str8, "imageUri");
        h.e(eVar2, "contextMenu");
        h.e(list, "chapters");
        return new p(str5, str6, str7, str8, eVar2, list);
    }

    public final List<c> b() {
        return this.o;
    }

    public final e c() {
        return this.n;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String e() {
        return this.c;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return h.a(this.a, pVar.a) && h.a(this.b, pVar.b) && h.a(this.c, pVar.c) && h.a(this.f, pVar.f) && h.a(this.n, pVar.n) && h.a(this.o, pVar.o);
    }

    public final String f() {
        return this.b;
    }

    public final p g(e eVar) {
        h.e(eVar, "newContextMenu");
        return new p(this.a, this.b, this.c, this.f, eVar, this.o);
    }

    public final String getImageUri() {
        return this.f;
    }

    @Override // java.lang.Object
    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        e eVar = this.n;
        int hashCode5 = (hashCode4 + (eVar != null ? eVar.hashCode() : 0)) * 31;
        List<c> list = this.o;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode5 + i;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("StoryModel(id=");
        V0.append(this.a);
        V0.append(", title=");
        V0.append(this.b);
        V0.append(", subtitle=");
        V0.append(this.c);
        V0.append(", imageUri=");
        V0.append(this.f);
        V0.append(", contextMenu=");
        V0.append(this.n);
        V0.append(", chapters=");
        return je.L0(V0, this.o, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        h.e(parcel, "parcel");
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.f);
        this.n.writeToParcel(parcel, 0);
        List<c> list = this.o;
        parcel.writeInt(list.size());
        for (c cVar : list) {
            cVar.writeToParcel(parcel, 0);
        }
    }
}
