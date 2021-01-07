package defpackage;

import android.os.Parcel;

/* renamed from: bg0  reason: default package */
final class bg0 implements xf0<String> {
    bg0() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, android.os.Parcel, int] */
    @Override // defpackage.xf0
    public void a(String str, Parcel parcel, int i) {
        String str2 = str;
        str2.getClass();
        parcel.writeString(str2);
    }
}
