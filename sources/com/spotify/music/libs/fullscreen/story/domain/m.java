package com.spotify.music.libs.fullscreen.story.domain;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.h;

public final class m implements Parcelable {
    public static final Parcelable.Creator CREATOR = new a();
    public static final m r = new m(FullscreenStoryViewState.LOADING, -1, "", null, 0, 0, null, true);
    private final FullscreenStoryViewState a;
    private final int b;
    private final String c;
    private final p f;
    private final long n;
    private final long o;
    private final Boolean p;
    private final boolean q;

    public static class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Boolean bool;
            h.e(parcel, "in");
            FullscreenStoryViewState fullscreenStoryViewState = (FullscreenStoryViewState) Enum.valueOf(FullscreenStoryViewState.class, parcel.readString());
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            p pVar = parcel.readInt() != 0 ? (p) p.CREATOR.createFromParcel(parcel) : null;
            long readLong = parcel.readLong();
            long readLong2 = parcel.readLong();
            boolean z = true;
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            } else {
                bool = null;
            }
            if (parcel.readInt() == 0) {
                z = false;
            }
            return new m(fullscreenStoryViewState, readInt, readString, pVar, readLong, readLong2, bool, z);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new m[i];
        }
    }

    public m(FullscreenStoryViewState fullscreenStoryViewState, int i, String str, p pVar, long j, long j2, Boolean bool, boolean z) {
        h.e(fullscreenStoryViewState, "viewState");
        h.e(str, "playlistUri");
        this.a = fullscreenStoryViewState;
        this.b = i;
        this.c = str;
        this.f = pVar;
        this.n = j;
        this.o = j2;
        this.p = bool;
        this.q = z;
    }

    public static m b(m mVar, FullscreenStoryViewState fullscreenStoryViewState, int i, String str, p pVar, long j, long j2, Boolean bool, boolean z, int i2) {
        FullscreenStoryViewState fullscreenStoryViewState2 = (i2 & 1) != 0 ? mVar.a : fullscreenStoryViewState;
        int i3 = (i2 & 2) != 0 ? mVar.b : i;
        String str2 = (i2 & 4) != 0 ? mVar.c : str;
        p pVar2 = (i2 & 8) != 0 ? mVar.f : pVar;
        long j3 = (i2 & 16) != 0 ? mVar.n : j;
        long j4 = (i2 & 32) != 0 ? mVar.o : j2;
        Boolean bool2 = (i2 & 64) != 0 ? mVar.p : bool;
        boolean z2 = (i2 & 128) != 0 ? mVar.q : z;
        mVar.getClass();
        h.e(fullscreenStoryViewState2, "viewState");
        h.e(str2, "playlistUri");
        return new m(fullscreenStoryViewState2, i3, str2, pVar2, j3, j4, bool2, z2);
    }

    public final Boolean a() {
        return this.p;
    }

    public final int c() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final long e() {
        return this.o;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return h.a(this.a, mVar.a) && this.b == mVar.b && h.a(this.c, mVar.c) && h.a(this.f, mVar.f) && this.n == mVar.n && this.o == mVar.o && h.a(this.p, mVar.p) && this.q == mVar.q;
    }

    public final long f() {
        return this.n;
    }

    public final boolean g() {
        return this.q;
    }

    public final p h() {
        return this.f;
    }

    @Override // java.lang.Object
    public int hashCode() {
        FullscreenStoryViewState fullscreenStoryViewState = this.a;
        int i = 0;
        int hashCode = (((fullscreenStoryViewState != null ? fullscreenStoryViewState.hashCode() : 0) * 31) + this.b) * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        p pVar = this.f;
        int hashCode3 = (((((hashCode2 + (pVar != null ? pVar.hashCode() : 0)) * 31) + e.a(this.n)) * 31) + e.a(this.o)) * 31;
        Boolean bool = this.p;
        if (bool != null) {
            i = bool.hashCode();
        }
        int i2 = (hashCode3 + i) * 31;
        boolean z = this.q;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        return i2 + i3;
    }

    public final FullscreenStoryViewState i() {
        return this.a;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("FullscreenStoryModel(viewState=");
        V0.append(this.a);
        V0.append(", currentChapter=");
        V0.append(this.b);
        V0.append(", playlistUri=");
        V0.append(this.c);
        V0.append(", story=");
        V0.append(this.f);
        V0.append(", currentChapterPositionMs=");
        V0.append(this.n);
        V0.append(", currentChapterDurationMs=");
        V0.append(this.o);
        V0.append(", contextPlayerInitialState=");
        V0.append(this.p);
        V0.append(", showStoryInfo=");
        return je.P0(V0, this.q, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        h.e(parcel, "parcel");
        parcel.writeString(this.a.name());
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
        p pVar = this.f;
        if (pVar != null) {
            parcel.writeInt(1);
            pVar.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeLong(this.n);
        parcel.writeLong(this.o);
        Boolean bool = this.p;
        if (bool != null) {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeInt(this.q ? 1 : 0);
    }
}
