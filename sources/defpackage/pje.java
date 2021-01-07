package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* access modifiers changed from: package-private */
/* renamed from: pje  reason: default package */
public final class pje extends kje {
    public static final Parcelable.Creator<pje> CREATOR = new a();
    private static final pme s = new pme();

    /* renamed from: pje$a */
    static class a implements Parcelable.Creator<pje> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX WARNING: Removed duplicated region for block: B:10:0x0043  */
        /* JADX WARNING: Removed duplicated region for block: B:11:0x0045  */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x004c  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x004e  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0055  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0057  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x005e  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0060  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0067  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0069  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x0070  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x0072  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x0079  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x007b  */
        @Override // android.os.Parcelable.Creator
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public defpackage.pje createFromParcel(android.os.Parcel r12) {
            /*
                r11 = this;
                pje r9 = new pje
                defpackage.pje.p()
                java.lang.String r0 = r12.readString()
                r0.getClass()
                java.lang.String r1 = r12.readString()
                r1.getClass()
                r2 = 0
                java.lang.Class<tje$b> r3 = defpackage.tje.b.class
                java.lang.String r3 = r3.getCanonicalName()
                boolean r3 = r0.equals(r3)
                if (r3 == 0) goto L_0x0025
                tje r0 = defpackage.tje.d(r1)
                goto L_0x0035
            L_0x0025:
                java.lang.Class<tje$a> r1 = defpackage.tje.a.class
                java.lang.String r1 = r1.getCanonicalName()
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x0037
                tje r0 = defpackage.tje.a()
            L_0x0035:
                r1 = r0
                goto L_0x0038
            L_0x0037:
                r1 = r2
            L_0x0038:
                r1.getClass()
                int r0 = r12.readInt()
                r2 = 0
                r3 = 1
                if (r0 != r3) goto L_0x0045
                r4 = 1
                goto L_0x0046
            L_0x0045:
                r4 = 0
            L_0x0046:
                int r0 = r12.readInt()
                if (r0 != r3) goto L_0x004e
                r5 = 1
                goto L_0x004f
            L_0x004e:
                r5 = 0
            L_0x004f:
                int r0 = r12.readInt()
                if (r0 != r3) goto L_0x0057
                r6 = 1
                goto L_0x0058
            L_0x0057:
                r6 = 0
            L_0x0058:
                int r0 = r12.readInt()
                if (r0 != r3) goto L_0x0060
                r7 = 1
                goto L_0x0061
            L_0x0060:
                r7 = 0
            L_0x0061:
                int r0 = r12.readInt()
                if (r0 != r3) goto L_0x0069
                r8 = 1
                goto L_0x006a
            L_0x0069:
                r8 = 0
            L_0x006a:
                int r0 = r12.readInt()
                if (r0 != r3) goto L_0x0072
                r10 = 1
                goto L_0x0073
            L_0x0072:
                r10 = 0
            L_0x0073:
                int r12 = r12.readInt()
                if (r12 != r3) goto L_0x007b
                r12 = 1
                goto L_0x007c
            L_0x007b:
                r12 = 0
            L_0x007c:
                r0 = r9
                r2 = r4
                r3 = r5
                r4 = r6
                r5 = r7
                r6 = r8
                r7 = r10
                r8 = r12
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.pje.a.createFromParcel(android.os.Parcel):java.lang.Object");
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public pje[] newArray(int i) {
            return new pje[i];
        }
    }

    pje(tje tje, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        super(tje, z, z2, z3, z4, z5, z6, z7);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        g().c(new zle(parcel), new ame(parcel));
        parcel.writeInt(c() ? 1 : 0);
        parcel.writeInt(i() ? 1 : 0);
        parcel.writeInt(h() ? 1 : 0);
        parcel.writeInt(j() ? 1 : 0);
        parcel.writeInt(b() ? 1 : 0);
        parcel.writeInt(e() ? 1 : 0);
        parcel.writeInt(a() ? 1 : 0);
    }
}
