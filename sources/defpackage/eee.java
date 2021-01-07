package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.login.AuthenticationMetadata;

/* access modifiers changed from: package-private */
/* renamed from: eee  reason: default package */
public final class eee extends mbe {
    public static final Parcelable.Creator<eee> CREATOR = new a();
    private static final rme v = new rme();

    /* renamed from: eee$a */
    static class a implements Parcelable.Creator<eee> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX WARNING: Removed duplicated region for block: B:10:0x008c  */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x0094  */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x009a  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x00ae  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x00bc  */
        @Override // android.os.Parcelable.Creator
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public defpackage.eee createFromParcel(android.os.Parcel r14) {
            /*
                r13 = this;
                eee r12 = new eee
                defpackage.eee.w()
                java.lang.String r0 = r14.readString()
                r0.getClass()
                android.os.Parcelable$Creator r1 = defpackage.fee.g()
                fee$a r1 = (defpackage.fee.a) r1
                java.lang.Object r1 = r1.createFromParcel(r14)
                r1.getClass()
                fee r1 = (defpackage.fee) r1
                java.lang.Class<gee$a> r2 = defpackage.gee.a.class
                java.lang.String r2 = r2.getCanonicalName()
                boolean r2 = r0.equals(r2)
                r3 = 0
                if (r2 == 0) goto L_0x002d
                gee r0 = defpackage.gee.a(r1)
                goto L_0x003d
            L_0x002d:
                java.lang.Class<gee$b> r2 = defpackage.gee.b.class
                java.lang.String r2 = r2.getCanonicalName()
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x003f
                gee r0 = defpackage.gee.b(r1)
            L_0x003d:
                r1 = r0
                goto L_0x0040
            L_0x003f:
                r1 = r3
            L_0x0040:
                r1.getClass()
                java.lang.Class<kee> r0 = defpackage.kee.class
                java.lang.ClassLoader r0 = r0.getClassLoader()
                android.os.Parcelable r0 = r14.readParcelable(r0)
                r2 = r0
                phe r2 = (defpackage.phe) r2
                java.lang.Class<kee> r0 = defpackage.kee.class
                java.lang.ClassLoader r0 = r0.getClassLoader()
                android.os.Parcelable r0 = r14.readParcelable(r0)
                r4 = r0
                pke r4 = (defpackage.pke) r4
                java.lang.Class<kee> r0 = defpackage.kee.class
                java.lang.ClassLoader r0 = r0.getClassLoader()
                android.os.Parcelable r0 = r14.readParcelable(r0)
                r5 = r0
                tae r5 = (defpackage.tae) r5
                java.lang.Class<kee> r0 = defpackage.kee.class
                java.lang.ClassLoader r0 = r0.getClassLoader()
                android.os.Parcelable r0 = r14.readParcelable(r0)
                r6 = r0
                zie r6 = (defpackage.zie) r6
                java.lang.Class<kee> r0 = defpackage.kee.class
                java.lang.ClassLoader r0 = r0.getClassLoader()
                android.os.Parcelable r0 = r14.readParcelable(r0)
                r7 = r0
                sje r7 = (defpackage.sje) r7
                int r0 = r14.readInt()
                r8 = 1
                if (r0 != r8) goto L_0x008c
                goto L_0x008e
            L_0x008c:
                r0 = 0
                r8 = 0
            L_0x008e:
                int r0 = r14.readInt()
                if (r0 != 0) goto L_0x009a
                java.lang.String r0 = r14.readString()
                r9 = r0
                goto L_0x009b
            L_0x009a:
                r9 = r3
            L_0x009b:
                java.lang.Class<kee> r0 = defpackage.kee.class
                java.lang.ClassLoader r0 = r0.getClassLoader()
                android.os.Parcelable r0 = r14.readParcelable(r0)
                r10 = r0
                com.spotify.loginflow.navigation.a r10 = (com.spotify.loginflow.navigation.a) r10
                int r0 = r14.readInt()
                if (r0 != 0) goto L_0x00bc
                java.lang.Class<com.spotify.login.AuthenticationMetadata$AuthSource> r0 = com.spotify.login.AuthenticationMetadata.AuthSource.class
                java.lang.String r3 = r14.readString()
                java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r3)
                com.spotify.login.AuthenticationMetadata$AuthSource r0 = (com.spotify.login.AuthenticationMetadata.AuthSource) r0
                r11 = r0
                goto L_0x00bd
            L_0x00bc:
                r11 = r3
            L_0x00bd:
                int r14 = r14.readInt()
                r0 = r12
                r3 = r4
                r4 = r5
                r5 = r6
                r6 = r7
                r7 = r8
                r8 = r9
                r9 = r10
                r10 = r11
                r11 = r14
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.eee.a.createFromParcel(android.os.Parcel):java.lang.Object");
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public eee[] newArray(int i) {
            return new eee[i];
        }
    }

    eee(gee gee, phe phe, pke pke, tae tae, zie zie, sje sje, boolean z, String str, com.spotify.loginflow.navigation.a aVar, AuthenticationMetadata.AuthSource authSource, int i) {
        super(gee, phe, pke, tae, zie, sje, z, str, aVar, authSource, i);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        n().c(new kme(parcel), new lme(parcel));
        parcel.writeParcelable(c(), i);
        parcel.writeParcelable(l(), i);
        parcel.writeParcelable(a(), i);
        parcel.writeParcelable(f(), i);
        parcel.writeParcelable(j(), i);
        parcel.writeInt(g() ? 1 : 0);
        if (h() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(h());
        }
        parcel.writeParcelable(e(), i);
        if (b() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(b().name());
        }
        parcel.writeInt(k());
    }
}
