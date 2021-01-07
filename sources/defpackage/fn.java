package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.util.f0;
import com.google.android.exoplayer2.util.g;
import defpackage.um;

/* renamed from: fn  reason: default package */
public final class fn implements um.b {
    public static final Parcelable.Creator<fn> CREATOR = new a();
    public final int a;
    public final String b;
    public final String c;
    public final String f;
    public final boolean n;
    public final int o;

    /* renamed from: fn$a */
    static class a implements Parcelable.Creator<fn> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public fn createFromParcel(Parcel parcel) {
            return new fn(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public fn[] newArray(int i) {
            return new fn[i];
        }
    }

    public fn(int i, String str, String str2, String str3, boolean z, int i2) {
        g.a(i2 == -1 || i2 > 0);
        this.a = i;
        this.b = str;
        this.c = str2;
        this.f = str3;
        this.n = z;
        this.o = i2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.fn a(java.util.Map<java.lang.String, java.util.List<java.lang.String>> r12) {
        /*
            java.lang.String r0 = "icy-br"
            java.lang.Object r0 = r12.get(r0)
            java.util.List r0 = (java.util.List) r0
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0021
            java.lang.Object r0 = r0.get(r3)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0021 }
            int r0 = r0 * 1000
            if (r0 <= 0) goto L_0x001d
            r4 = 1
            goto L_0x001f
        L_0x001d:
            r0 = -1
            r4 = 0
        L_0x001f:
            r6 = r0
            goto L_0x0023
        L_0x0021:
            r4 = 0
            r6 = -1
        L_0x0023:
            java.lang.String r0 = "icy-genre"
            java.lang.Object r0 = r12.get(r0)
            java.util.List r0 = (java.util.List) r0
            r5 = 0
            if (r0 == 0) goto L_0x0037
            java.lang.Object r0 = r0.get(r3)
            java.lang.String r0 = (java.lang.String) r0
            r7 = r0
            r4 = 1
            goto L_0x0038
        L_0x0037:
            r7 = r5
        L_0x0038:
            java.lang.String r0 = "icy-name"
            java.lang.Object r0 = r12.get(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x004b
            java.lang.Object r0 = r0.get(r3)
            java.lang.String r0 = (java.lang.String) r0
            r8 = r0
            r4 = 1
            goto L_0x004c
        L_0x004b:
            r8 = r5
        L_0x004c:
            java.lang.String r0 = "icy-url"
            java.lang.Object r0 = r12.get(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x005f
            java.lang.Object r0 = r0.get(r3)
            java.lang.String r0 = (java.lang.String) r0
            r9 = r0
            r4 = 1
            goto L_0x0060
        L_0x005f:
            r9 = r5
        L_0x0060:
            java.lang.String r0 = "icy-pub"
            java.lang.Object r0 = r12.get(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x0079
            java.lang.Object r0 = r0.get(r3)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r4 = "1"
            boolean r0 = r0.equals(r4)
            r10 = r0
            r4 = 1
            goto L_0x007a
        L_0x0079:
            r10 = 0
        L_0x007a:
            java.lang.String r0 = "icy-metaint"
            java.lang.Object r12 = r12.get(r0)
            java.util.List r12 = (java.util.List) r12
            if (r12 == 0) goto L_0x0096
            java.lang.Object r12 = r12.get(r3)
            java.lang.String r12 = (java.lang.String) r12
            int r12 = java.lang.Integer.parseInt(r12)     // Catch:{ NumberFormatException -> 0x0096 }
            if (r12 <= 0) goto L_0x0092
            r1 = r12
            goto L_0x0093
        L_0x0092:
            r2 = r4
        L_0x0093:
            r11 = r1
            r4 = r2
            goto L_0x0097
        L_0x0096:
            r11 = -1
        L_0x0097:
            if (r4 == 0) goto L_0x009f
            fn r12 = new fn
            r5 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11)
        L_0x009f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fn.a(java.util.Map):fn");
    }

    @Override // defpackage.um.b
    public /* synthetic */ d0 O() {
        return vm.b(this);
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
        if (obj == null || fn.class != obj.getClass()) {
            return false;
        }
        fn fnVar = (fn) obj;
        if (this.a != fnVar.a || !f0.a(this.b, fnVar.b) || !f0.a(this.c, fnVar.c) || !f0.a(this.f, fnVar.f) || this.n != fnVar.n || this.o != fnVar.o) {
            return false;
        }
        return true;
    }

    @Override // defpackage.um.b
    public /* synthetic */ byte[] f2() {
        return vm.a(this);
    }

    @Override // java.lang.Object
    public int hashCode() {
        int i = (527 + this.a) * 31;
        String str = this.b;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return ((((hashCode2 + i2) * 31) + (this.n ? 1 : 0)) * 31) + this.o;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("IcyHeaders: name=\"");
        V0.append(this.c);
        V0.append("\", genre=\"");
        V0.append(this.b);
        V0.append("\", bitrate=");
        V0.append(this.a);
        V0.append(", metadataInterval=");
        V0.append(this.o);
        return V0.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.f);
        boolean z = this.n;
        int i2 = f0.a;
        parcel.writeInt(z ? 1 : 0);
        parcel.writeInt(this.o);
    }

    fn(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.f = parcel.readString();
        int i = f0.a;
        this.n = parcel.readInt() != 0;
        this.o = parcel.readInt();
    }
}
