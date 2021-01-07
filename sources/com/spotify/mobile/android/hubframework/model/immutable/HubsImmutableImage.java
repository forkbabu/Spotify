package com.spotify.mobile.android.hubframework.model.immutable;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.x81;
import java.io.Serializable;
import java.util.Arrays;
import kotlin.d;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public class HubsImmutableImage implements x81, Parcelable {
    public static final Parcelable.Creator<HubsImmutableImage> CREATOR = new a();
    public static final b Companion;
    private static final HubsImmutableImage EMPTY;
    private final d hashCode$delegate = kotlin.a.b(new HubsImmutableImage$hashCode$2(this));
    private final c impl;

    public static final class a implements Parcelable.Creator<HubsImmutableImage> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public HubsImmutableImage createFromParcel(Parcel parcel) {
            h.e(parcel, "in");
            return HubsImmutableImage.Companion.a(parcel.readString(), parcel.readString(), (HubsImmutableComponentBundle) gf0.n(parcel, HubsImmutableComponentBundle.CREATOR));
        }

        @Override // android.os.Parcelable.Creator
        public HubsImmutableImage[] newArray(int i) {
            return new HubsImmutableImage[i];
        }
    }

    public static final class b {
        public b(f fVar) {
        }

        public final HubsImmutableImage a(String str, String str2, p81 p81) {
            return new HubsImmutableImage(str, str2, HubsImmutableComponentBundle.Companion.c(p81));
        }

        public final HubsImmutableImage b(x81 x81) {
            h.e(x81, "other");
            if (x81 instanceof HubsImmutableImage) {
                return (HubsImmutableImage) x81;
            }
            return a(x81.uri(), x81.placeholder(), x81.custom());
        }
    }

    public final class c extends x81.a {
        private final String a;
        private final String b;
        private final HubsImmutableComponentBundle c;
        final /* synthetic */ HubsImmutableImage d;

        public c(HubsImmutableImage hubsImmutableImage, String str, String str2, HubsImmutableComponentBundle hubsImmutableComponentBundle) {
            h.e(hubsImmutableComponentBundle, "custom");
            this.d = hubsImmutableImage;
            this.a = str;
            this.b = str2;
            this.c = hubsImmutableComponentBundle;
        }

        @Override // defpackage.x81.a
        public x81.a a(p81 p81) {
            h.e(p81, "custom");
            if (p81.keySet().isEmpty()) {
                return this;
            }
            g gVar = new g(this);
            gVar.a(p81);
            return gVar;
        }

        @Override // defpackage.x81.a
        public x81.a b(String str, Serializable serializable) {
            h.e(str, "key");
            if (f91.a(this.c, str, serializable)) {
                return this;
            }
            g gVar = new g(this);
            gVar.b(str, serializable);
            return gVar;
        }

        @Override // defpackage.x81.a
        public x81 c() {
            return this.d;
        }

        @Override // defpackage.x81.a
        public x81.a d(p81 p81) {
            if (c.f(this.c, p81)) {
                return this;
            }
            g gVar = new g(this);
            gVar.d(p81);
            return gVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (!rw.equal(this.a, cVar.a) || !rw.equal(this.b, cVar.b) || !rw.equal(this.c, cVar.c)) {
                return false;
            }
            return true;
        }

        @Override // defpackage.x81.a
        public x81.a f(String str) {
            if (rw.equal(this.b, str)) {
                return this;
            }
            g gVar = new g(this);
            gVar.f(str);
            return gVar;
        }

        @Override // defpackage.x81.a
        public x81.a g(String str) {
            if (rw.equal(this.a, str)) {
                return this;
            }
            g gVar = new g(this);
            gVar.g(str);
            return gVar;
        }

        public final HubsImmutableComponentBundle h() {
            return this.c;
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
        }

        public final String i() {
            return this.b;
        }

        public final String j() {
            return this.a;
        }
    }

    static {
        b bVar = new b(null);
        Companion = bVar;
        EMPTY = bVar.a(null, null, null);
    }

    protected HubsImmutableImage(String str, String str2, HubsImmutableComponentBundle hubsImmutableComponentBundle) {
        h.e(hubsImmutableComponentBundle, "custom");
        this.impl = new c(this, str, str2, hubsImmutableComponentBundle);
    }

    public static final x81.a builder() {
        Companion.getClass();
        return EMPTY.toBuilder();
    }

    public static final HubsImmutableImage create(String str, String str2, p81 p81) {
        return Companion.a(str, str2, p81);
    }

    private final int getHashCode() {
        return ((Number) this.hashCode$delegate.getValue()).intValue();
    }

    public static final HubsImmutableImage immutable(x81 x81) {
        return Companion.b(x81);
    }

    @Override // defpackage.x81
    public p81 custom() {
        return this.impl.h();
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
        if (!(obj instanceof HubsImmutableImage)) {
            return false;
        }
        return rw.equal(this.impl, ((HubsImmutableImage) obj).impl);
    }

    @Override // java.lang.Object
    public int hashCode() {
        return getHashCode();
    }

    @Override // defpackage.x81
    public String placeholder() {
        return this.impl.i();
    }

    @Override // defpackage.x81
    public x81.a toBuilder() {
        return this.impl;
    }

    @Override // defpackage.x81
    public String uri() {
        return this.impl.j();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        h.e(parcel, "parcel");
        parcel.writeString(this.impl.j());
        parcel.writeString(this.impl.i());
        HubsImmutableComponentBundle hubsImmutableComponentBundle = null;
        if (!c.f(this.impl.h(), null)) {
            hubsImmutableComponentBundle = this.impl.h();
        }
        gf0.v(parcel, hubsImmutableComponentBundle, i);
    }
}
