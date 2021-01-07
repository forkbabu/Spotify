package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobius.e0;
import defpackage.km7;
import defpackage.lm7;
import kotlin.jvm.internal.h;

/* renamed from: wl7  reason: default package */
public final /* synthetic */ class wl7 implements nmf {
    public final /* synthetic */ mm7 a;

    public /* synthetic */ wl7(mm7 mm7) {
        this.a = mm7;
    }

    /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x004a: APUT  
      (r6v3 km7[])
      (0 ??[int, short, byte, char])
      (wrap: km7$i : 0x0046: CONSTRUCTOR  (r4v4 km7$i) = (r2v0 java.lang.String), (r3v1 com.google.common.base.Optional), (r0v1 com.google.common.base.Optional) call: km7.i.<init>(java.lang.String, com.google.common.base.Optional, com.google.common.base.Optional):void type: CONSTRUCTOR)
     */
    @Override // defpackage.nmf
    public final Object invoke(Object obj) {
        Optional optional;
        Optional optional2;
        mm7 mm7 = this.a;
        lm7.t tVar = (lm7.t) obj;
        mm7 s = mm7.s(true);
        km7[] km7Arr = new km7[1];
        String p = mm7.p();
        if (mm7.f()) {
            optional = Optional.of(mm7.e());
        } else {
            optional = Optional.absent();
        }
        if (mm7.h()) {
            optional2 = Optional.of(mm7.j());
        } else {
            optional2 = Optional.absent();
        }
        h.e(p, "username");
        h.e(optional, "displayName");
        h.e(optional2, "imageUri");
        km7Arr[0] = new km7.i(p, optional, optional2);
        return e0.g(s, z42.l(km7Arr));
    }
}
