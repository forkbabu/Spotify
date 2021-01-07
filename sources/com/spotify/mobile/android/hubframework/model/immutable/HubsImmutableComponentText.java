package com.spotify.mobile.android.hubframework.model.immutable;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.w81;
import java.util.Arrays;
import kotlin.d;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public class HubsImmutableComponentText implements w81, Parcelable {
    public static final Parcelable.Creator<HubsImmutableComponentText> CREATOR = new a();
    public static final b Companion = new b(null);
    private static final HubsImmutableComponentText EMPTY = new HubsImmutableComponentText(null, null, null, null);
    private final d hashCode$delegate = kotlin.a.b(new HubsImmutableComponentText$hashCode$2(this));
    private final c impl;

    public static final class a implements Parcelable.Creator<HubsImmutableComponentText> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public HubsImmutableComponentText createFromParcel(Parcel parcel) {
            h.e(parcel, "in");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            HubsImmutableComponentText.Companion.getClass();
            return new HubsImmutableComponentText(readString, readString2, readString3, readString4);
        }

        @Override // android.os.Parcelable.Creator
        public HubsImmutableComponentText[] newArray(int i) {
            return new HubsImmutableComponentText[i];
        }
    }

    public static final class b {
        public b(f fVar) {
        }

        public final w81.a a() {
            return HubsImmutableComponentText.EMPTY.toBuilder();
        }

        public final HubsImmutableComponentText b(w81 w81) {
            h.e(w81, "other");
            if (w81 instanceof HubsImmutableComponentText) {
                return (HubsImmutableComponentText) w81;
            }
            return new HubsImmutableComponentText(w81.title(), w81.subtitle(), w81.accessory(), w81.description());
        }
    }

    public final class c implements w81.a {
        private final String a;
        private final String b;
        private final String c;
        private final String d;

        public c(String str, String str2, String str3, String str4) {
            HubsImmutableComponentText.this = r1;
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
        }

        @Override // defpackage.w81.a
        public w81.a a(String str) {
            if (rw.equal(this.a, str)) {
                return this;
            }
            f fVar = new f(this);
            fVar.a(str);
            return fVar;
        }

        public final String b() {
            return this.c;
        }

        @Override // defpackage.w81.a
        public w81 build() {
            return HubsImmutableComponentText.this;
        }

        @Override // defpackage.w81.a
        public w81.a c(String str) {
            if (rw.equal(this.d, str)) {
                return this;
            }
            f fVar = new f(this);
            fVar.c(str);
            return fVar;
        }

        @Override // defpackage.w81.a
        public w81.a d(String str) {
            if (rw.equal(this.b, str)) {
                return this;
            }
            f fVar = new f(this);
            fVar.d(str);
            return fVar;
        }

        @Override // defpackage.w81.a
        public w81.a e(String str) {
            if (rw.equal(this.c, str)) {
                return this;
            }
            f fVar = new f(this);
            fVar.e(str);
            return fVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (!rw.equal(this.a, cVar.a) || !rw.equal(this.b, cVar.b) || !rw.equal(this.c, cVar.c) || !rw.equal(this.d, cVar.d)) {
                return false;
            }
            return true;
        }

        public final String f() {
            return this.d;
        }

        public final String g() {
            return this.b;
        }

        public final String h() {
            return this.a;
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
        }
    }

    protected HubsImmutableComponentText(String str, String str2, String str3, String str4) {
        this.impl = new c(str, str2, str3, str4);
    }

    public static final w81.a builder() {
        return Companion.a();
    }

    public static final HubsImmutableComponentText create(String str, String str2, String str3, String str4) {
        Companion.getClass();
        return new HubsImmutableComponentText(str, str2, str3, str4);
    }

    public static final HubsImmutableComponentText empty() {
        Companion.getClass();
        return EMPTY;
    }

    public static final HubsImmutableComponentText fromNullable(w81 w81) {
        b bVar = Companion;
        bVar.getClass();
        if (w81 != null) {
            return bVar.b(w81);
        }
        return EMPTY;
    }

    private final int getHashCode() {
        return ((Number) this.hashCode$delegate.getValue()).intValue();
    }

    public static final HubsImmutableComponentText immutable(w81 w81) {
        return Companion.b(w81);
    }

    @Override // defpackage.w81
    public String accessory() {
        return this.impl.b();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // defpackage.w81
    public String description() {
        return this.impl.f();
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HubsImmutableComponentText)) {
            return false;
        }
        return rw.equal(this.impl, ((HubsImmutableComponentText) obj).impl);
    }

    @Override // java.lang.Object
    public int hashCode() {
        return getHashCode();
    }

    @Override // defpackage.w81
    public String subtitle() {
        return this.impl.g();
    }

    @Override // defpackage.w81
    public String title() {
        return this.impl.h();
    }

    @Override // defpackage.w81
    public w81.a toBuilder() {
        return this.impl;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        h.e(parcel, "parcel");
        parcel.writeString(this.impl.h());
        parcel.writeString(this.impl.g());
        parcel.writeString(this.impl.b());
        parcel.writeString(this.impl.f());
    }
}
