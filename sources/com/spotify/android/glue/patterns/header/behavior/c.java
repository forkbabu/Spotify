package com.spotify.android.glue.patterns.header.behavior;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.core.os.f;
import androidx.core.os.g;

final class c extends View.BaseSavedState {
    public static final Parcelable.Creator<c> CREATOR = f.a(new a());
    private float a;
    private boolean b;

    static class a implements g<c> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // androidx.core.os.g
        public c createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new c(parcel, null);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // androidx.core.os.g
        public c[] newArray(int i) {
            return new c[i];
        }
    }

    c(Parcel parcel, a aVar) {
        super(parcel);
        this.a = parcel.readFloat();
        this.b = parcel.readInt() != 0;
    }

    public static c a(Parcelable parcelable, int i, float f, boolean z) {
        c cVar = new c(parcelable);
        cVar.a = nud.c(0.0f, 1.0f, Math.abs(((float) i) / f));
        cVar.b = z;
        return cVar;
    }

    public float b() {
        if (this.b) {
            return 1.0f;
        }
        return this.a;
    }

    public boolean c() {
        return this.b;
    }

    @Override // android.view.View.BaseSavedState, android.os.Parcelable, android.view.AbsSavedState
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeFloat(this.a);
        parcel.writeInt(this.b ? 1 : 0);
    }

    private c(Parcelable parcelable) {
        super(parcelable);
    }
}
