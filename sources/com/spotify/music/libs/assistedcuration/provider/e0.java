package com.spotify.music.libs.assistedcuration.provider;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.music.libs.assistedcuration.b;

/* access modifiers changed from: package-private */
public class e0 extends x<e0> {
    public static final Parcelable.Creator<e0> CREATOR = new a();
    private final i1a o;

    static class a implements Parcelable.Creator<e0> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public e0 createFromParcel(Parcel parcel) {
            return new e0(parcel, (a) null);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public e0[] newArray(int i) {
            return new e0[i];
        }
    }

    e0(i1a i1a, b bVar) {
        super(i1a.a(), bVar);
        this.o = i1a;
    }

    /* access modifiers changed from: package-private */
    public i1a k() {
        return this.o;
    }

    @Override // com.spotify.music.libs.assistedcuration.provider.x, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        gf0.v(parcel, this.o, i);
    }

    e0(Parcel parcel, a aVar) {
        super(parcel);
        i1a i1a = (i1a) gf0.n(parcel, i1a.a);
        if (i1a != null) {
            this.o = i1a;
            return;
        }
        throw new IllegalStateException("Non-null value `genre` not found in parcel.");
    }
}
