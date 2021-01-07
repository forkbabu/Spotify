package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.mobile.android.storytelling.common.PauseState;
import kotlin.jvm.internal.h;

/* renamed from: yy1  reason: default package */
public final class yy1 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new a();
    private final int a;
    private final wy1 b;
    private final PauseState c;

    /* renamed from: yy1$a */
    public static class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            h.e(parcel, "in");
            return new yy1(parcel.readInt(), (wy1) parcel.readParcelable(yy1.class.getClassLoader()), (PauseState) Enum.valueOf(PauseState.class, parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new yy1[i];
        }
    }

    public yy1(int i, wy1 wy1, PauseState pauseState) {
        h.e(wy1, "storyLoadStatus");
        h.e(pauseState, "pauseState");
        this.a = i;
        this.b = wy1;
        this.c = pauseState;
    }

    public static yy1 a(yy1 yy1, int i, wy1 wy1, PauseState pauseState, int i2) {
        if ((i2 & 1) != 0) {
            i = yy1.a;
        }
        if ((i2 & 2) != 0) {
            wy1 = yy1.b;
        }
        if ((i2 & 4) != 0) {
            pauseState = yy1.c;
        }
        h.e(wy1, "storyLoadStatus");
        h.e(pauseState, "pauseState");
        return new yy1(i, wy1, pauseState);
    }

    public final PauseState b() {
        return this.c;
    }

    public final int c() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final wy1 e() {
        return this.b;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yy1)) {
            return false;
        }
        yy1 yy1 = (yy1) obj;
        return this.a == yy1.a && h.a(this.b, yy1.b) && h.a(this.c, yy1.c);
    }

    @Override // java.lang.Object
    public int hashCode() {
        int i = this.a * 31;
        wy1 wy1 = this.b;
        int i2 = 0;
        int hashCode = (i + (wy1 != null ? wy1.hashCode() : 0)) * 31;
        PauseState pauseState = this.c;
        if (pauseState != null) {
            i2 = pauseState.hashCode();
        }
        return hashCode + i2;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("StoryModel(storyIndex=");
        V0.append(this.a);
        V0.append(", storyLoadStatus=");
        V0.append(this.b);
        V0.append(", pauseState=");
        V0.append(this.c);
        V0.append(")");
        return V0.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        h.e(parcel, "parcel");
        parcel.writeInt(this.a);
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c.name());
    }
}
