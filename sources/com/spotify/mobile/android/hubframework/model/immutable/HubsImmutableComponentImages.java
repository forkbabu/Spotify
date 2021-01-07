package com.spotify.mobile.android.hubframework.model.immutable;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableMap;
import defpackage.r81;
import java.util.Arrays;
import java.util.Map;
import kotlin.d;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public class HubsImmutableComponentImages implements r81, Parcelable {
    public static final Parcelable.Creator<HubsImmutableComponentImages> CREATOR = new a();
    public static final b Companion;
    private static final HubsImmutableComponentImages EMPTY;
    private final d hashCode$delegate = kotlin.a.b(new HubsImmutableComponentImages$hashCode$2(this));
    private final c impl;

    public static final class a implements Parcelable.Creator<HubsImmutableComponentImages> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public HubsImmutableComponentImages createFromParcel(Parcel parcel) {
            h.e(parcel, "in");
            Parcelable.Creator<HubsImmutableImage> creator = HubsImmutableImage.CREATOR;
            ImmutableMap k = gf0.k(parcel, creator);
            String readString = parcel.readString();
            return HubsImmutableComponentImages.Companion.b((HubsImmutableImage) gf0.n(parcel, creator), (HubsImmutableImage) gf0.n(parcel, creator), k, readString);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public HubsImmutableComponentImages[] newArray(int i) {
            return new HubsImmutableComponentImages[i];
        }
    }

    public static final class b {
        public b(f fVar) {
        }

        public final r81.a a() {
            return HubsImmutableComponentImages.EMPTY.toBuilder();
        }

        public final HubsImmutableComponentImages b(x81 x81, x81 x812, Map<String, ? extends x81> map, String str) {
            HubsImmutableImage hubsImmutableImage = null;
            HubsImmutableImage b = x81 != null ? HubsImmutableImage.Companion.b(x81) : null;
            if (x812 != null) {
                hubsImmutableImage = HubsImmutableImage.Companion.b(x812);
            }
            ImmutableMap copyOf = ImmutableMap.copyOf(i.a(map, HubsImmutableImage.class, HubsImmutableComponentImages$Companion$immutableImageMap$1.a));
            h.d(copyOf, "ImmutableMap.copyOf(immutableImageMap(custom))");
            return new HubsImmutableComponentImages(b, hubsImmutableImage, copyOf, str);
        }

        public final HubsImmutableComponentImages c(r81 r81) {
            h.e(r81, "other");
            if (r81 instanceof HubsImmutableComponentImages) {
                return (HubsImmutableComponentImages) r81;
            }
            return b(r81.main(), r81.background(), r81.custom(), r81.icon());
        }
    }

    /* access modifiers changed from: private */
    public final class c extends r81.a {
        private final HubsImmutableImage a;
        private final HubsImmutableImage b;
        private final ImmutableMap<String, HubsImmutableImage> c;
        private final String d;
        final /* synthetic */ HubsImmutableComponentImages e;

        public c(HubsImmutableComponentImages hubsImmutableComponentImages, HubsImmutableImage hubsImmutableImage, HubsImmutableImage hubsImmutableImage2, ImmutableMap<String, HubsImmutableImage> immutableMap, String str) {
            h.e(immutableMap, "custom");
            this.e = hubsImmutableComponentImages;
            this.a = hubsImmutableImage;
            this.b = hubsImmutableImage2;
            this.c = immutableMap;
            this.d = str;
        }

        @Override // defpackage.r81.a
        public r81.a a(x81 x81) {
            if (rw.equal(this.b, x81)) {
                return this;
            }
            d dVar = new d(this);
            dVar.a(x81);
            return dVar;
        }

        @Override // defpackage.r81.a
        public r81 b() {
            return this.e;
        }

        @Override // defpackage.r81.a
        public r81.a c(Map<String, ? extends x81> map) {
            h.e(map, "images");
            if (c.h(this.c, map)) {
                return this;
            }
            d dVar = new d(this);
            dVar.c(map);
            return dVar;
        }

        @Override // defpackage.r81.a
        public r81.a e(String str) {
            if (rw.equal(this.d, str)) {
                return this;
            }
            d dVar = new d(this);
            dVar.e(str);
            return dVar;
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

        @Override // defpackage.r81.a
        public r81.a g(x81 x81) {
            if (rw.equal(this.a, x81)) {
                return this;
            }
            d dVar = new d(this);
            dVar.g(x81);
            return dVar;
        }

        public final HubsImmutableImage h() {
            return this.b;
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
        }

        public final ImmutableMap<String, HubsImmutableImage> i() {
            return this.c;
        }

        public final String j() {
            return this.d;
        }

        public final HubsImmutableImage k() {
            return this.a;
        }
    }

    static {
        b bVar = new b(null);
        Companion = bVar;
        EMPTY = bVar.b(null, null, null, null);
    }

    protected HubsImmutableComponentImages(HubsImmutableImage hubsImmutableImage, HubsImmutableImage hubsImmutableImage2, ImmutableMap<String, HubsImmutableImage> immutableMap, String str) {
        h.e(immutableMap, "custom");
        this.impl = new c(this, hubsImmutableImage, hubsImmutableImage2, immutableMap, str);
    }

    public static final r81.a builder() {
        return Companion.a();
    }

    public static final HubsImmutableComponentImages create(x81 x81, x81 x812, Map<String, ? extends x81> map, String str) {
        return Companion.b(x81, x812, map, str);
    }

    public static final HubsImmutableComponentImages empty() {
        Companion.getClass();
        return EMPTY;
    }

    public static final HubsImmutableComponentImages fromNullable(r81 r81) {
        b bVar = Companion;
        bVar.getClass();
        if (r81 != null) {
            return bVar.c(r81);
        }
        return EMPTY;
    }

    private final int getHashCode() {
        return ((Number) this.hashCode$delegate.getValue()).intValue();
    }

    public static final HubsImmutableComponentImages immutable(r81 r81) {
        return Companion.c(r81);
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
        if (!(obj instanceof HubsImmutableComponentImages)) {
            return false;
        }
        return rw.equal(this.impl, ((HubsImmutableComponentImages) obj).impl);
    }

    @Override // java.lang.Object
    public int hashCode() {
        return getHashCode();
    }

    @Override // defpackage.r81
    public String icon() {
        return this.impl.j();
    }

    @Override // defpackage.r81
    public r81.a toBuilder() {
        return this.impl;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        h.e(parcel, "parcel");
        gf0.v(parcel, this.impl.k(), i);
        gf0.v(parcel, this.impl.h(), i);
        gf0.r(parcel, this.impl.i(), zf0.c(), zf0.a(), i);
        parcel.writeString(this.impl.j());
    }

    @Override // defpackage.r81
    public HubsImmutableImage background() {
        return this.impl.h();
    }

    @Override // defpackage.r81
    public ImmutableMap<String, HubsImmutableImage> custom() {
        return this.impl.i();
    }

    @Override // defpackage.r81
    public HubsImmutableImage main() {
        return this.impl.k();
    }
}
