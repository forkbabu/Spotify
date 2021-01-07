package com.spotify.mobile.android.hubframework.model.immutable;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;
import defpackage.a91;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.d;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public class HubsImmutableTarget implements a91, Parcelable {
    public static final Parcelable.Creator<HubsImmutableTarget> CREATOR = new a();
    public static final b Companion;
    private static final HubsImmutableTarget EMPTY;
    private final d hashCode$delegate = kotlin.a.b(new HubsImmutableTarget$hashCode$2(this));
    private final c impl;

    public static final class a implements Parcelable.Creator<HubsImmutableTarget> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public HubsImmutableTarget createFromParcel(Parcel parcel) {
            ImmutableList immutableList;
            String str;
            h.e(parcel, "in");
            String readString = parcel.readString();
            h.e(parcel, "parcel");
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            if (createStringArrayList != null) {
                immutableList = ImmutableList.copyOf((Collection) createStringArrayList);
                str = "ImmutableList.copyOf(strings)";
            } else {
                immutableList = ImmutableList.of();
                str = "ImmutableList.of()";
            }
            h.d(immutableList, str);
            return HubsImmutableTarget.Companion.a(readString, immutableList);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public HubsImmutableTarget[] newArray(int i) {
            return new HubsImmutableTarget[i];
        }
    }

    public static final class b {
        public b(f fVar) {
        }

        public final HubsImmutableTarget a(String str, List<String> list) {
            return new HubsImmutableTarget(str, f91.b(list));
        }

        public final HubsImmutableTarget b(a91 a91) {
            h.e(a91, "other");
            if (a91 instanceof HubsImmutableTarget) {
                return (HubsImmutableTarget) a91;
            }
            return a(a91.uri(), a91.actions());
        }
    }

    /* access modifiers changed from: private */
    public final class c implements a91.a {
        private final String a;
        private final ImmutableList<String> b;

        public c(HubsImmutableTarget hubsImmutableTarget, String str, ImmutableList<String> immutableList) {
            h.e(immutableList, "actions");
            this.a = str;
            this.b = immutableList;
        }

        public final ImmutableList<String> a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (!rw.equal(this.a, cVar.a) || !rw.equal(this.b, cVar.b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{this.a, this.b});
        }
    }

    static {
        b bVar = new b(null);
        Companion = bVar;
        EMPTY = bVar.a(null, ImmutableList.of());
    }

    protected HubsImmutableTarget(String str, ImmutableList<String> immutableList) {
        h.e(immutableList, "actions");
        this.impl = new c(this, str, immutableList);
    }

    public static final a91.a builder() {
        Companion.getClass();
        return EMPTY.toBuilder();
    }

    public static final HubsImmutableTarget create(String str, List<String> list) {
        return Companion.a(str, list);
    }

    public static final HubsImmutableTarget create(String str, String... strArr) {
        b bVar = Companion;
        bVar.getClass();
        h.e(strArr, "actions");
        return bVar.a(str, kotlin.collections.d.c(strArr));
    }

    private final int getHashCode() {
        return ((Number) this.hashCode$delegate.getValue()).intValue();
    }

    public static final HubsImmutableTarget immutable(a91 a91) {
        return Companion.b(a91);
    }

    public static final HubsImmutableTarget immutableOrNull(a91 a91) {
        b bVar = Companion;
        bVar.getClass();
        if (a91 != null) {
            return bVar.b(a91);
        }
        return null;
    }

    @Override // defpackage.a91
    public List<String> actions() {
        return this.impl.a();
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
        if (!(obj instanceof HubsImmutableTarget)) {
            return false;
        }
        return rw.equal(this.impl, ((HubsImmutableTarget) obj).impl);
    }

    @Override // java.lang.Object
    public int hashCode() {
        return getHashCode();
    }

    public a91.a toBuilder() {
        return this.impl;
    }

    @Override // defpackage.a91
    public String uri() {
        return this.impl.b();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        h.e(parcel, "dest");
        parcel.writeString(this.impl.b());
        ImmutableList<String> a2 = this.impl.a();
        h.e(parcel, "dest");
        h.e(a2, "strings");
        if (a2.isEmpty()) {
            a2 = null;
        }
        parcel.writeStringList(a2);
    }
}
