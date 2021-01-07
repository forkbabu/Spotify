package defpackage;

import com.google.common.base.Function;
import com.spotify.mobile.android.util.l0;

/* renamed from: ze7  reason: default package */
public final /* synthetic */ class ze7 implements Function {
    public final /* synthetic */ kf7 a;

    public /* synthetic */ ze7(kf7 kf7) {
        this.a = kf7;
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        boolean z;
        kf7 kf7 = this.a;
        String str = (String) obj;
        int ordinal = l0.z(str).q().ordinal();
        if (ordinal == 237 || ordinal == 273) {
            z = str.equals(kf7.b());
        } else {
            z = str.equals(kf7.a());
        }
        return Boolean.valueOf(z);
    }
}
