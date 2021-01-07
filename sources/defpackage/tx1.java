package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.mobile.android.storytelling.common.PauseState;
import defpackage.px1;
import kotlin.jvm.internal.h;

/* renamed from: tx1  reason: default package */
public final class tx1 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new a();
    private final px1 a;
    private final int b;
    private final PauseState c;
    private final boolean f;

    /* renamed from: tx1$a */
    public static class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            h.e(parcel, "in");
            return new tx1((px1) parcel.readParcelable(tx1.class.getClassLoader()), parcel.readInt(), (PauseState) Enum.valueOf(PauseState.class, parcel.readString()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new tx1[i];
        }
    }

    public tx1() {
        this(null, 0, null, false, 15);
    }

    public tx1(px1 px1, int i, PauseState pauseState, boolean z) {
        h.e(px1, "storiesLoadStatus");
        h.e(pauseState, "pauseState");
        this.a = px1;
        this.b = i;
        this.c = pauseState;
        this.f = z;
    }

    public static tx1 a(tx1 tx1, px1 px1, int i, PauseState pauseState, boolean z, int i2) {
        if ((i2 & 1) != 0) {
            px1 = tx1.a;
        }
        if ((i2 & 2) != 0) {
            i = tx1.b;
        }
        if ((i2 & 4) != 0) {
            pauseState = tx1.c;
        }
        if ((i2 & 8) != 0) {
            z = tx1.f;
        }
        tx1.getClass();
        h.e(px1, "storiesLoadStatus");
        h.e(pauseState, "pauseState");
        return new tx1(px1, i, pauseState, z);
    }

    public final int b() {
        return this.b;
    }

    public final boolean c() {
        return this.f;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final PauseState e() {
        return this.c;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tx1)) {
            return false;
        }
        tx1 tx1 = (tx1) obj;
        return h.a(this.a, tx1.a) && this.b == tx1.b && h.a(this.c, tx1.c) && this.f == tx1.f;
    }

    public final px1 f() {
        return this.a;
    }

    @Override // java.lang.Object
    public int hashCode() {
        px1 px1 = this.a;
        int i = 0;
        int hashCode = (((px1 != null ? px1.hashCode() : 0) * 31) + this.b) * 31;
        PauseState pauseState = this.c;
        if (pauseState != null) {
            i = pauseState.hashCode();
        }
        int i2 = (hashCode + i) * 31;
        boolean z = this.f;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        return i2 + i3;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("StorytellingContainerModel(storiesLoadStatus=");
        V0.append(this.a);
        V0.append(", currentStoryIndex=");
        V0.append(this.b);
        V0.append(", pauseState=");
        V0.append(this.c);
        V0.append(", muted=");
        return je.P0(V0, this.f, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        h.e(parcel, "parcel");
        parcel.writeParcelable(this.a, i);
        parcel.writeInt(this.b);
        parcel.writeString(this.c.name());
        parcel.writeInt(this.f ? 1 : 0);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tx1(px1 px1, int i, PauseState pauseState, boolean z, int i2) {
        this((i2 & 1) != 0 ? px1.b.a : null, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? PauseState.RESUMED : pauseState, (i2 & 8) != 0 ? false : z);
    }
}
