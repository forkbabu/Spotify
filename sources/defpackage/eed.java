package defpackage;

import android.graphics.Color;
import com.adjust.sdk.Constants;
import com.google.common.base.Charsets;
import com.google.common.base.Optional;
import com.spotify.mobius.e0;
import defpackage.ied;
import defpackage.jed;

/* renamed from: eed  reason: default package */
public final /* synthetic */ class eed implements ti0 {
    public final /* synthetic */ jed a;

    public /* synthetic */ eed(jed jed) {
        this.a = jed;
    }

    /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x0039: APUT  (r1v1 java.lang.Object[]), (1 ??[boolean, int, float, short, byte, char]), (r2v9 java.lang.String) */
    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        jed jed = this.a;
        int h = ((ied.d) obj).h();
        Object[] objArr = new Object[3];
        boolean z = false;
        objArr[0] = Integer.valueOf(16777215 & h);
        if (((Color.blue(h) * 114) + ((Color.green(h) * 587) + (Color.red(h) * 299))) / Constants.ONE_SECOND >= 128) {
            z = true;
        }
        objArr[1] = z ? "black" : "white";
        StringBuilder V0 = je.V0("spotify:socialsession:");
        V0.append(jed.c());
        objArr[2] = gf0.d(V0.toString(), Charsets.UTF_8);
        String format = String.format("https://scannables.scdn.co/uri/plain/png/%06X/%s/600/%s", objArr);
        jed.a m = jed.m();
        m.h(Optional.of(Integer.valueOf(h)));
        m.i(Optional.of(format));
        return e0.f(m.a());
    }
}
