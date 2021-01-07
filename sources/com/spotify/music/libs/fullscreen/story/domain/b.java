package com.spotify.music.libs.fullscreen.story.domain;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public abstract class b implements Parcelable {

    public static final class a extends b {
        public static final Parcelable.Creator CREATOR = new C0288a();
        private final String a;
        private final String b;
        private final String c;
        private final int f;

        /* renamed from: com.spotify.music.libs.fullscreen.story.domain.b$a$a  reason: collision with other inner class name */
        public static class C0288a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                h.e(parcel, "in");
                return new a(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new a[i];
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, String str3, int i) {
            super(null);
            je.x(str, "trackUri", str2, "previewUri", str3, "imageUri");
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.f = i;
        }

        public final int a() {
            return this.f;
        }

        public final String b() {
            return this.b;
        }

        public final String c() {
            return this.a;
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
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return h.a(this.a, aVar.a) && h.a(this.b, aVar.b) && h.a(this.c, aVar.c) && this.f == aVar.f;
        }

        public final String getImageUri() {
            return this.c;
        }

        @Override // java.lang.Object
        public int hashCode() {
            String str = this.a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.c;
            if (str3 != null) {
                i = str3.hashCode();
            }
            return ((hashCode2 + i) * 31) + this.f;
        }

        @Override // java.lang.Object
        public String toString() {
            StringBuilder V0 = je.V0("TrackChapter(trackUri=");
            V0.append(this.a);
            V0.append(", previewUri=");
            V0.append(this.b);
            V0.append(", imageUri=");
            V0.append(this.c);
            V0.append(", backgroundColor=");
            return je.B0(V0, this.f, ")");
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            h.e(parcel, "parcel");
            parcel.writeString(this.a);
            parcel.writeString(this.b);
            parcel.writeString(this.c);
            parcel.writeInt(this.f);
        }
    }

    /* renamed from: com.spotify.music.libs.fullscreen.story.domain.b$b  reason: collision with other inner class name */
    public static final class C0289b extends b {
        public static final Parcelable.Creator CREATOR = new a();
        private final String a;

        /* renamed from: com.spotify.music.libs.fullscreen.story.domain.b$b$a */
        public static class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                h.e(parcel, "in");
                return new C0289b(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new C0289b[i];
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0289b(String str) {
            super(null);
            h.e(str, "sourceId");
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // java.lang.Object
        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof C0289b) && h.a(this.a, ((C0289b) obj).a);
            }
            return true;
        }

        @Override // java.lang.Object
        public int hashCode() {
            String str = this.a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        @Override // java.lang.Object
        public String toString() {
            return je.I0(je.V0("VideoChapter(sourceId="), this.a, ")");
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            h.e(parcel, "parcel");
            parcel.writeString(this.a);
        }
    }

    private b() {
    }

    public b(f fVar) {
    }
}
