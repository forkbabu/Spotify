package com.spotify.music.features.yourlibraryx.domain;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.h;

public abstract class b implements Parcelable {

    public static final class a extends b {
        public static final Parcelable.Creator CREATOR = new C0268a();
        private final List<b> a;

        /* renamed from: com.spotify.music.features.yourlibraryx.domain.b$a$a  reason: collision with other inner class name */
        public static class C0268a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                h.e(parcel, "in");
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                while (readInt != 0) {
                    arrayList.add((b) parcel.readParcelable(a.class.getClassLoader()));
                    readInt--;
                }
                return new a(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new a[i];
            }
        }

        public a() {
            this(EmptyList.a);
        }

        public final List<b> a() {
            return this.a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // java.lang.Object
        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof a) && h.a(this.a, ((a) obj).a);
            }
            return true;
        }

        @Override // java.lang.Object
        public int hashCode() {
            List<b> list = this.a;
            if (list != null) {
                return list.hashCode();
            }
            return 0;
        }

        @Override // java.lang.Object
        public String toString() {
            return je.L0(je.V0("Albums(subfilters="), this.a, ")");
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            h.e(parcel, "parcel");
            List<b> list = this.a;
            parcel.writeInt(list.size());
            for (b bVar : list) {
                parcel.writeParcelable(bVar, i);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.spotify.music.features.yourlibraryx.domain.b> */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(List<? extends b> list) {
            super(null);
            h.e(list, "subfilters");
            this.a = list;
        }
    }

    /* renamed from: com.spotify.music.features.yourlibraryx.domain.b$b  reason: collision with other inner class name */
    public static final class C0269b extends b {
        public static final Parcelable.Creator CREATOR = new a();
        private final List<b> a;

        /* renamed from: com.spotify.music.features.yourlibraryx.domain.b$b$a */
        public static class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                h.e(parcel, "in");
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                while (readInt != 0) {
                    arrayList.add((b) parcel.readParcelable(C0269b.class.getClassLoader()));
                    readInt--;
                }
                return new C0269b(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new C0269b[i];
            }
        }

        public C0269b() {
            this(EmptyList.a);
        }

        public final List<b> a() {
            return this.a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // java.lang.Object
        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof C0269b) && h.a(this.a, ((C0269b) obj).a);
            }
            return true;
        }

        @Override // java.lang.Object
        public int hashCode() {
            List<b> list = this.a;
            if (list != null) {
                return list.hashCode();
            }
            return 0;
        }

        @Override // java.lang.Object
        public String toString() {
            return je.L0(je.V0("Artists(subfilters="), this.a, ")");
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            h.e(parcel, "parcel");
            List<b> list = this.a;
            parcel.writeInt(list.size());
            for (b bVar : list) {
                parcel.writeParcelable(bVar, i);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.spotify.music.features.yourlibraryx.domain.b> */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0269b(List<? extends b> list) {
            super(null);
            h.e(list, "subfilters");
            this.a = list;
        }
    }

    public static final class c extends b {
        public static final Parcelable.Creator CREATOR = new a();
        public static final c a = new c();

        public static class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                h.e(parcel, "in");
                if (parcel.readInt() != 0) {
                    return c.a;
                }
                return null;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new c[i];
            }
        }

        private c() {
            super(null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            h.e(parcel, "parcel");
            parcel.writeInt(1);
        }
    }

    public static final class d extends b {
        public static final Parcelable.Creator CREATOR = new a();
        public static final d a = new d();

        public static class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                h.e(parcel, "in");
                if (parcel.readInt() != 0) {
                    return d.a;
                }
                return null;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new d[i];
            }
        }

        private d() {
            super(null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            h.e(parcel, "parcel");
            parcel.writeInt(1);
        }
    }

    public static final class e extends b {
        public static final Parcelable.Creator CREATOR = new a();
        private final List<b> a;

        public static class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                h.e(parcel, "in");
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                while (readInt != 0) {
                    arrayList.add((b) parcel.readParcelable(e.class.getClassLoader()));
                    readInt--;
                }
                return new e(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new e[i];
            }
        }

        public e() {
            this(EmptyList.a);
        }

        public final List<b> a() {
            return this.a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // java.lang.Object
        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof e) && h.a(this.a, ((e) obj).a);
            }
            return true;
        }

        @Override // java.lang.Object
        public int hashCode() {
            List<b> list = this.a;
            if (list != null) {
                return list.hashCode();
            }
            return 0;
        }

        @Override // java.lang.Object
        public String toString() {
            return je.L0(je.V0("Playlists(subfilters="), this.a, ")");
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            h.e(parcel, "parcel");
            List<b> list = this.a;
            parcel.writeInt(list.size());
            for (b bVar : list) {
                parcel.writeParcelable(bVar, i);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.spotify.music.features.yourlibraryx.domain.b> */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(List<? extends b> list) {
            super(null);
            h.e(list, "subfilters");
            this.a = list;
        }
    }

    public static final class f extends b {
        public static final Parcelable.Creator CREATOR = new a();
        private final List<b> a;

        public static class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                h.e(parcel, "in");
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                while (readInt != 0) {
                    arrayList.add((b) parcel.readParcelable(f.class.getClassLoader()));
                    readInt--;
                }
                return new f(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new f[i];
            }
        }

        public f() {
            this(EmptyList.a);
        }

        public final List<b> a() {
            return this.a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // java.lang.Object
        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof f) && h.a(this.a, ((f) obj).a);
            }
            return true;
        }

        @Override // java.lang.Object
        public int hashCode() {
            List<b> list = this.a;
            if (list != null) {
                return list.hashCode();
            }
            return 0;
        }

        @Override // java.lang.Object
        public String toString() {
            return je.L0(je.V0("Podcasts(subfilters="), this.a, ")");
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            h.e(parcel, "parcel");
            List<b> list = this.a;
            parcel.writeInt(list.size());
            for (b bVar : list) {
                parcel.writeParcelable(bVar, i);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.spotify.music.features.yourlibraryx.domain.b> */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(List<? extends b> list) {
            super(null);
            h.e(list, "subfilters");
            this.a = list;
        }
    }

    private b() {
    }

    public b(kotlin.jvm.internal.f fVar) {
    }
}
