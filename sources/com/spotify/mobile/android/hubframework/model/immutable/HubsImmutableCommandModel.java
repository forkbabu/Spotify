package com.spotify.mobile.android.hubframework.model.immutable;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableMap;
import defpackage.o81;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;
import kotlin.d;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public class HubsImmutableCommandModel implements o81, Parcelable {
    public static final Parcelable.Creator<HubsImmutableCommandModel> CREATOR = new a();
    public static final Companion Companion;
    private static final HubsImmutableCommandModel EMPTY;
    private final HubsImmutableComponentBundle data;
    private final d hashCode$delegate = kotlin.a.b(new HubsImmutableCommandModel$hashCode$2(this));
    private final b impl;
    private final String name;

    public static final class Companion {
        public Companion(f fVar) {
        }

        public final ImmutableMap<String, HubsImmutableCommandModel> a(Map<String, ? extends o81> map) {
            return i.a(map, HubsImmutableCommandModel.class, HubsImmutableCommandModel$Companion$asImmutableCommandMap$1.a);
        }

        public final HubsImmutableCommandModel b(String str, p81 p81) {
            h.e(str, "name");
            return new HubsImmutableCommandModel(str, HubsImmutableComponentBundle.Companion.c(p81));
        }

        public final HubsImmutableCommandModel c(o81 o81) {
            h.e(o81, "other");
            if (o81 instanceof HubsImmutableCommandModel) {
                return (HubsImmutableCommandModel) o81;
            }
            return b(o81.name(), o81.data());
        }
    }

    public static final class a implements Parcelable.Creator<HubsImmutableCommandModel> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public HubsImmutableCommandModel createFromParcel(Parcel parcel) {
            h.e(parcel, "in");
            String readString = parcel.readString();
            h.c(readString);
            h.d(readString, "`in`.readString()!!");
            return HubsImmutableCommandModel.Companion.b(readString, (HubsImmutableComponentBundle) gf0.n(parcel, HubsImmutableComponentBundle.CREATOR));
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public HubsImmutableCommandModel[] newArray(int i) {
            return new HubsImmutableCommandModel[i];
        }
    }

    /* access modifiers changed from: private */
    public final class b extends o81.a {
        private final String a;
        private final HubsImmutableComponentBundle b;
        final /* synthetic */ HubsImmutableCommandModel c;

        public b(HubsImmutableCommandModel hubsImmutableCommandModel, String str, HubsImmutableComponentBundle hubsImmutableComponentBundle) {
            h.e(str, "name");
            h.e(hubsImmutableComponentBundle, "data");
            this.c = hubsImmutableCommandModel;
            this.a = str;
            this.b = hubsImmutableComponentBundle;
        }

        @Override // defpackage.o81.a
        public o81.a a(p81 p81) {
            h.e(p81, "custom");
            if (p81.keySet().isEmpty()) {
                return this;
            }
            a aVar = new a(this);
            aVar.a(p81);
            return aVar;
        }

        @Override // defpackage.o81.a
        public o81.a b(String str, Serializable serializable) {
            h.e(str, "key");
            if (f91.a(this.b, str, serializable)) {
                return this;
            }
            a aVar = new a(this);
            aVar.b(str, serializable);
            return aVar;
        }

        @Override // defpackage.o81.a
        public o81 c() {
            return this.c;
        }

        @Override // defpackage.o81.a
        public o81.a d(p81 p81) {
            if (c.f(this.b, p81)) {
                return this;
            }
            a aVar = new a(this);
            aVar.d(p81);
            return aVar;
        }

        @Override // defpackage.o81.a
        public o81.a e(String str) {
            h.e(str, "name");
            if (rw.equal(this.a, str)) {
                return this;
            }
            a aVar = new a(this);
            aVar.e(str);
            return aVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (!rw.equal(this.a, bVar.a) || !rw.equal(this.b, bVar.b)) {
                return false;
            }
            return true;
        }

        public final HubsImmutableComponentBundle f() {
            return this.b;
        }

        public final String g() {
            return this.a;
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{this.a, this.b});
        }
    }

    static {
        Companion companion = new Companion(null);
        Companion = companion;
        EMPTY = companion.b("", null);
    }

    protected HubsImmutableCommandModel(String str, HubsImmutableComponentBundle hubsImmutableComponentBundle) {
        h.e(str, "name");
        h.e(hubsImmutableComponentBundle, "data");
        this.name = str;
        this.data = hubsImmutableComponentBundle;
        this.impl = new b(this, str, hubsImmutableComponentBundle);
    }

    public static final ImmutableMap<String, HubsImmutableCommandModel> asImmutableCommandMap(Map<String, ? extends o81> map) {
        return Companion.a(map);
    }

    public static final o81.a builder() {
        Companion.getClass();
        return EMPTY.toBuilder();
    }

    public static final HubsImmutableCommandModel create(String str, p81 p81) {
        return Companion.b(str, p81);
    }

    public static final HubsImmutableCommandModel empty() {
        Companion.getClass();
        return EMPTY;
    }

    private final int getHashCode() {
        return ((Number) this.hashCode$delegate.getValue()).intValue();
    }

    private static /* synthetic */ void getHashCode$annotations() {
    }

    private static /* synthetic */ void getImpl$annotations() {
    }

    public static final HubsImmutableCommandModel immutable(o81 o81) {
        return Companion.c(o81);
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
        if (!(obj instanceof HubsImmutableCommandModel)) {
            return false;
        }
        return rw.equal(this.impl, ((HubsImmutableCommandModel) obj).impl);
    }

    public final HubsImmutableComponentBundle getData() {
        return this.data;
    }

    public final String getName() {
        return this.name;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return getHashCode();
    }

    @Override // defpackage.o81
    public String name() {
        return this.impl.g();
    }

    @Override // defpackage.o81
    public o81.a toBuilder() {
        return this.impl;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        h.e(parcel, "dest");
        parcel.writeString(this.impl.g());
        HubsImmutableComponentBundle hubsImmutableComponentBundle = null;
        if (!c.f(this.impl.f(), null)) {
            hubsImmutableComponentBundle = this.impl.f();
        }
        gf0.v(parcel, hubsImmutableComponentBundle, i);
    }

    @Override // defpackage.o81
    public HubsImmutableComponentBundle data() {
        return this.impl.f();
    }
}
