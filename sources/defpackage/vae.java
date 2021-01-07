package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* access modifiers changed from: package-private */
/* renamed from: vae  reason: default package */
public final class vae extends nae {
    public static final Parcelable.Creator<vae> CREATOR = new a();
    private static final mme p = new mme();

    /* renamed from: vae$a */
    static class a implements Parcelable.Creator<vae> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0096  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0098  */
        @Override // android.os.Parcelable.Creator
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public defpackage.vae createFromParcel(android.os.Parcel r9) {
            /*
                r8 = this;
                vae r6 = new vae
                int r1 = r9.readInt()
                int r2 = r9.readInt()
                int r3 = r9.readInt()
                defpackage.vae.j()
                java.lang.String r0 = r9.readString()
                r0.getClass()
                java.lang.String r4 = r9.readString()
                r4.getClass()
                r5 = 0
                java.lang.Class<uae$b> r7 = defpackage.uae.b.class
                java.lang.String r7 = r7.getCanonicalName()
                boolean r7 = r0.equals(r7)
                if (r7 == 0) goto L_0x0031
                uae r0 = defpackage.uae.c()
                goto L_0x0089
            L_0x0031:
                java.lang.Class<uae$d> r7 = defpackage.uae.d.class
                java.lang.String r7 = r7.getCanonicalName()
                boolean r7 = r0.equals(r7)
                if (r7 == 0) goto L_0x0042
                uae r0 = defpackage.uae.e()
                goto L_0x0089
            L_0x0042:
                java.lang.Class<uae$a> r7 = defpackage.uae.a.class
                java.lang.String r7 = r7.getCanonicalName()
                boolean r7 = r0.equals(r7)
                if (r7 == 0) goto L_0x0079
                java.lang.Class<wae$a> r0 = defpackage.wae.a.class
                java.lang.String r0 = r0.getCanonicalName()
                boolean r0 = r4.equals(r0)
                if (r0 == 0) goto L_0x005f
                wae r0 = defpackage.wae.a()
                goto L_0x0074
            L_0x005f:
                java.lang.Class<wae$b> r0 = defpackage.wae.b.class
                java.lang.String r0 = r0.getCanonicalName()
                boolean r0 = r4.equals(r0)
                if (r0 == 0) goto L_0x0070
                wae r0 = defpackage.wae.c()
                goto L_0x0074
            L_0x0070:
                wae r0 = defpackage.wae.d()
            L_0x0074:
                uae r0 = defpackage.uae.a(r0)
                goto L_0x0089
            L_0x0079:
                java.lang.Class<uae$c> r4 = defpackage.uae.c.class
                java.lang.String r4 = r4.getCanonicalName()
                boolean r0 = r0.equals(r4)
                if (r0 == 0) goto L_0x008b
                uae r0 = defpackage.uae.d()
            L_0x0089:
                r4 = r0
                goto L_0x008c
            L_0x008b:
                r4 = r5
            L_0x008c:
                r4.getClass()
                int r9 = r9.readInt()
                r0 = 1
                if (r9 != r0) goto L_0x0098
                r5 = 1
                goto L_0x009a
            L_0x0098:
                r9 = 0
                r5 = 0
            L_0x009a:
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.vae.a.createFromParcel(android.os.Parcel):java.lang.Object");
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public vae[] newArray(int i) {
            return new vae[i];
        }
    }

    vae(int i, int i2, int i3, uae uae, boolean z) {
        super(i, i2, i3, uae, z);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(b());
        parcel.writeInt(c());
        parcel.writeInt(e());
        a().b(new mle(parcel), new ole(parcel), new lle(parcel), new nle(parcel));
        parcel.writeInt(f() ? 1 : 0);
    }
}
