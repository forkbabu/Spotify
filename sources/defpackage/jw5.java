package defpackage;

import com.spotify.libs.otp.ui.i0;
import com.spotify.libs.otp.ui.j0;
import com.spotify.mobile.android.util.ui.k;
import com.spotify.music.features.phonenumbersignup.c;
import com.spotify.music.features.phonenumbersignup.view.PhoneNumberSignupFragment;
import io.reactivex.y;

/* renamed from: jw5  reason: default package */
public final class jw5 implements fjf<i0<c>> {
    private final wlf<PhoneNumberSignupFragment> a;
    private final wlf<k> b;
    private final wlf<wq0> c;
    private final wlf<y> d;
    private final wlf<y> e;
    private final wlf<j0.c> f;
    private final wlf<j0.b<c>> g;

    public jw5(wlf<PhoneNumberSignupFragment> wlf, wlf<k> wlf2, wlf<wq0> wlf3, wlf<y> wlf4, wlf<y> wlf5, wlf<j0.c> wlf6, wlf<j0.b<c>> wlf7) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
    }

    @Override // defpackage.wlf
    public Object get() {
        PhoneNumberSignupFragment phoneNumberSignupFragment = this.a.get();
        return new yka(phoneNumberSignupFragment.l4(), phoneNumberSignupFragment, this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get());
    }
}
