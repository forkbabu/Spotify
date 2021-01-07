package defpackage;

import android.content.res.Resources;
import android.os.Bundle;
import com.google.common.base.MoreObjects;
import com.spotify.base.java.logging.Logger;
import com.spotify.encore.mobile.snackbar.SnackbarConfiguration;
import com.spotify.libs.callingcode.json.CallingCode;
import com.spotify.libs.otp.session.d;
import com.spotify.libs.otp.ui.c0;
import com.spotify.libs.otp.ui.e0;
import com.spotify.libs.otp.ui.h0;
import com.spotify.libs.otp.ui.k0;
import com.spotify.libs.otp.ui.l0;
import com.spotify.loginflow.navigation.Destination;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ui.k;
import com.spotify.mobile.android.util.ui.m;
import com.spotify.music.C0707R;
import com.spotify.music.features.phonenumbersignup.PhoneNumberSignupState;
import com.spotify.music.features.phonenumbersignup.c;
import com.spotify.music.features.phonenumbersignup.d;
import com.spotify.music.features.phonenumbersignup.e;
import com.spotify.music.features.phonenumbersignup.f;
import com.spotify.music.features.phonenumbersignup.instrumentation.InstrumentationScreen;
import com.spotify.signup.api.services.model.SignupConfigurationResponse;
import io.reactivex.s;
import io.reactivex.y;
import java.util.ArrayList;
import java.util.List;

/* renamed from: fx5  reason: default package */
public class fx5 implements h0.d, l0.c<f>, d {
    private static final Character x = 8206;
    public static final /* synthetic */ int y = 0;
    private final Resources a;
    private final com.spotify.loginflow.navigation.d b;
    private final y c;
    private final y d;
    private final com.spotify.music.features.phonenumbersignup.instrumentation.b e;
    private final com.spotify.music.features.phonenumbersignup.datasource.d f;
    private final com.spotify.libs.otp.session.d<c> g;
    private final e h;
    private final h0<c> i;
    private final l0<c, f> j;
    private final e0[] k;
    private final c0 l;
    private final s<SignupConfigurationResponse> m;
    private final wq0 n;
    private final br0 o;
    private e0 p;
    private InstrumentationScreen q;
    private io.reactivex.disposables.a r = new io.reactivex.disposables.a();
    private SignupConfigurationResponse s;
    private PhoneNumberSignupState t = PhoneNumberSignupState.REQUEST_OTP;
    private PhoneNumberSignupState u;
    private com.spotify.glue.dialogs.d v;
    private final com.spotify.libs.otp.session.f w = new a();

    /* renamed from: fx5$a */
    class a extends com.spotify.libs.otp.session.f {
        a() {
        }

        @Override // com.spotify.libs.otp.session.d.c
        public void b() {
            if (fx5.this.v != null) {
                fx5.this.v.dismiss();
                fx5.this.v = null;
            }
            if (fx5.this.q != null) {
                fx5.this.e.u(fx5.this.q);
            }
            fx5.this.l.e(new pw5(this));
        }
    }

    /* renamed from: fx5$b */
    private class b extends m {
        b(a aVar) {
        }

        @Override // com.spotify.mobile.android.util.ui.m, com.spotify.mobile.android.util.ui.l
        public void b1(Bundle bundle) {
            int i;
            fx5.this.g.a(fx5.this.w);
            PhoneNumberSignupState phoneNumberSignupState = null;
            if (bundle != null && (i = bundle.getInt("state-ordinal", -1)) >= 0) {
                phoneNumberSignupState = PhoneNumberSignupState.c[i];
            }
            if (phoneNumberSignupState != null) {
                fx5.this.t = phoneNumberSignupState;
            }
        }

        @Override // com.spotify.mobile.android.util.ui.m, com.spotify.mobile.android.util.ui.l
        public void c(Bundle bundle) {
            bundle.putInt("state-ordinal", fx5.this.u == null ? -1 : fx5.this.u.ordinal());
        }

        @Override // com.spotify.mobile.android.util.ui.m, com.spotify.mobile.android.util.ui.l
        public void onDestroy() {
            if (fx5.this.p != null) {
                fx5.this.p.b(true);
                fx5.this.p = null;
                fx5.this.u = null;
            }
            fx5.this.g.t(fx5.this.w);
        }

        @Override // com.spotify.mobile.android.util.ui.m, com.spotify.mobile.android.util.ui.l
        public void onStart() {
            fx5.this.r.f();
            fx5.this.r = new io.reactivex.disposables.a();
            fx5.this.O();
            if (fx5.this.u == null) {
                fx5.q(fx5.this);
            }
        }

        @Override // com.spotify.mobile.android.util.ui.m, com.spotify.mobile.android.util.ui.l
        public void onStop() {
            fx5.this.r.f();
        }
    }

    public fx5(Resources resources, com.spotify.loginflow.navigation.d dVar, k kVar, y yVar, y yVar2, s<SignupConfigurationResponse> sVar, com.spotify.music.features.phonenumbersignup.instrumentation.b bVar, com.spotify.music.features.phonenumbersignup.datasource.d dVar2, com.spotify.libs.otp.session.d<c> dVar3, e eVar, h0<c> h0Var, l0<c, f> l0Var, c0 c0Var, wq0 wq0, br0 br0) {
        resources.getClass();
        this.a = resources;
        this.b = dVar;
        yVar.getClass();
        this.c = yVar;
        yVar2.getClass();
        this.d = yVar2;
        this.m = sVar;
        bVar.getClass();
        this.e = bVar;
        dVar2.getClass();
        this.f = dVar2;
        dVar3.getClass();
        this.g = dVar3;
        eVar.getClass();
        this.h = eVar;
        h0Var.getClass();
        this.i = h0Var;
        l0Var.getClass();
        this.j = l0Var;
        this.k = new e0[]{h0Var, l0Var};
        c0Var.getClass();
        this.l = c0Var;
        wq0.getClass();
        this.n = wq0;
        br0.getClass();
        this.o = br0;
        h0Var.i(this);
        l0Var.o(this);
        kVar.y0(new b(null));
        new xka(dVar3).E2(kVar);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void O() {
        this.r.b(this.m.o0(this.d).subscribe(new bx5(this), new cx5(this)));
    }

    /* access modifiers changed from: private */
    /* renamed from: P */
    public void M() {
        this.g.c();
        Q(PhoneNumberSignupState.REQUEST_OTP);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x007e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void Q(com.spotify.music.features.phonenumbersignup.PhoneNumberSignupState r5) {
        /*
            r4 = this;
            com.spotify.music.features.phonenumbersignup.PhoneNumberSignupState r0 = r4.u
            if (r0 != r5) goto L_0x0005
            return
        L_0x0005:
            com.spotify.music.features.phonenumbersignup.PhoneNumberSignupState r0 = com.spotify.music.features.phonenumbersignup.PhoneNumberSignupState.VALIDATE_OTP
            if (r5 != r0) goto L_0x0015
            com.spotify.libs.otp.session.d<com.spotify.music.features.phonenumbersignup.c> r0 = r4.g
            boolean r0 = r0.h()
            if (r0 != 0) goto L_0x0015
            r4.M()
            return
        L_0x0015:
            int r0 = r5.ordinal()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x002b
            if (r0 == r2) goto L_0x0027
            java.lang.String r0 = "unsupported state"
            com.google.common.base.MoreObjects.checkState(r1, r0)
            java.lang.String r0 = ""
            goto L_0x0034
        L_0x0027:
            r0 = 2132018509(0x7f14054d, float:1.9675327E38)
            goto L_0x002e
        L_0x002b:
            r0 = 2132018508(0x7f14054c, float:1.9675325E38)
        L_0x002e:
            android.content.res.Resources r3 = r4.a
            java.lang.String r0 = r3.getString(r0)
        L_0x0034:
            com.spotify.music.features.phonenumbersignup.e r3 = r4.h
            r3.q0(r0)
            com.spotify.music.features.phonenumbersignup.PhoneNumberSignupState r0 = r4.u
            if (r0 == 0) goto L_0x0049
            int r0 = r5.ordinal()
            com.spotify.music.features.phonenumbersignup.PhoneNumberSignupState r3 = r4.u
            int r3 = r3.ordinal()
            if (r0 <= r3) goto L_0x004a
        L_0x0049:
            r1 = 1
        L_0x004a:
            r4.u = r5
            com.spotify.libs.otp.ui.e0 r0 = r4.p
            if (r0 == 0) goto L_0x0056
            r0.b(r1)
            r0 = 0
            r4.p = r0
        L_0x0056:
            int r0 = r5.ordinal()
            java.lang.String r3 = "no presenter for state"
            if (r0 == 0) goto L_0x0069
            if (r0 != r2) goto L_0x0063
            com.spotify.music.features.phonenumbersignup.instrumentation.InstrumentationScreen r0 = com.spotify.music.features.phonenumbersignup.instrumentation.InstrumentationScreen.PHONE_NUMBER_OTP
            goto L_0x006b
        L_0x0063:
            java.lang.AssertionError r5 = new java.lang.AssertionError
            r5.<init>(r3)
            throw r5
        L_0x0069:
            com.spotify.music.features.phonenumbersignup.instrumentation.InstrumentationScreen r0 = com.spotify.music.features.phonenumbersignup.instrumentation.InstrumentationScreen.PHONE_NUMBER_PHONE_NUMBER
        L_0x006b:
            r4.q = r0
            int r5 = r5.ordinal()
            if (r5 == 0) goto L_0x007e
            if (r5 != r2) goto L_0x0078
            com.spotify.libs.otp.ui.l0<com.spotify.music.features.phonenumbersignup.c, com.spotify.music.features.phonenumbersignup.f> r5 = r4.j
            goto L_0x0080
        L_0x0078:
            java.lang.AssertionError r5 = new java.lang.AssertionError
            r5.<init>(r3)
            throw r5
        L_0x007e:
            com.spotify.libs.otp.ui.h0<com.spotify.music.features.phonenumbersignup.c> r5 = r4.i
        L_0x0080:
            r4.p = r5
            r5.a(r1)
            com.spotify.music.features.phonenumbersignup.instrumentation.b r5 = r4.e
            com.spotify.music.features.phonenumbersignup.instrumentation.InstrumentationScreen r0 = r4.q
            r0.getClass()
            r5.m(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fx5.Q(com.spotify.music.features.phonenumbersignup.PhoneNumberSignupState):void");
    }

    private void R() {
        MoreObjects.checkState(!this.g.h());
        this.l.b(new qw5(this));
        com.spotify.music.features.phonenumbersignup.instrumentation.b bVar = this.e;
        InstrumentationScreen instrumentationScreen = this.q;
        instrumentationScreen.getClass();
        bVar.v(instrumentationScreen);
    }

    private void S() {
        MoreObjects.checkState(this.g.h());
        int e2 = this.g.e();
        this.j.l(e2);
        this.j.m(this.a.getQuantityString(C0707R.plurals.otp_description, e2, Integer.valueOf(e2), x + this.g.d()), this.a.getString(C0707R.string.otp_mismatch));
    }

    static void q(fx5 fx5) {
        if (fx5.g.h()) {
            fx5.S();
        }
        fx5.t.getClass();
        MoreObjects.checkState(fx5.u == null);
        fx5.Q(fx5.t);
        fx5.t = null;
    }

    public void A(Throwable th) {
        Assertion.w("Could not load signup configuration", th);
        boolean z = true;
        MoreObjects.checkState(!this.g.h());
        if (this.s != null) {
            z = false;
        }
        MoreObjects.checkState(z);
        this.l.b(new ww5(this));
        com.spotify.music.features.phonenumbersignup.instrumentation.b bVar = this.e;
        InstrumentationScreen instrumentationScreen = this.q;
        instrumentationScreen.getClass();
        bVar.v(instrumentationScreen);
    }

    public /* synthetic */ void B() {
        this.r.f();
        O();
        M();
    }

    public /* synthetic */ void C() {
        this.v = null;
    }

    public void D(f.a aVar) {
        this.h.k2(false);
        com.spotify.music.features.phonenumbersignup.instrumentation.b bVar = this.e;
        InstrumentationScreen instrumentationScreen = this.q;
        instrumentationScreen.getClass();
        bVar.l(instrumentationScreen);
        this.b.b(Destination.d.a);
    }

    public /* synthetic */ void E(f.b bVar) {
        this.h.O1(bVar.d());
        M();
    }

    public /* synthetic */ void F(d.a aVar) {
        S();
        this.h.j0(SnackbarConfiguration.builder((int) C0707R.string.snack_resend_success).build());
    }

    public /* synthetic */ void G() {
        this.v = this.l.h(new tw5(this), 30);
    }

    public /* synthetic */ void H(Throwable th) {
        R();
    }

    public /* synthetic */ void I(List list) {
        this.n.c(list);
    }

    @Override // com.spotify.libs.otp.ui.l0.c
    public void a() {
        M();
    }

    @Override // com.spotify.music.features.phonenumbersignup.d
    public void b() {
        for (e0 e0Var : this.k) {
            e0Var.c(this.h);
        }
    }

    @Override // com.spotify.libs.otp.ui.h0.d
    public void c(d.a aVar) {
        MoreObjects.checkState(this.u == PhoneNumberSignupState.REQUEST_OTP);
        S();
        Q(PhoneNumberSignupState.VALIDATE_OTP);
    }

    @Override // com.spotify.libs.otp.ui.l0.c
    public void d(Throwable th) {
        Logger.e(th, "Phone number sign-up: OTP validation error", new Object[0]);
        this.g.c();
        if (this.f.Z0(th)) {
            MoreObjects.checkState(!this.g.h());
            this.l.f(new ow5(this));
            this.e.g();
            return;
        }
        if (this.f.J(th)) {
            com.spotify.music.features.phonenumbersignup.instrumentation.b bVar = this.e;
            InstrumentationScreen instrumentationScreen = this.q;
            instrumentationScreen.getClass();
            bVar.k(instrumentationScreen, null);
        }
        R();
    }

    @Override // com.spotify.libs.otp.ui.h0.d
    public void e(Throwable th) {
        Logger.e(th, "Phone number sign-up: OTP request error", new Object[0]);
        if (this.f.s2(th)) {
            this.g.c();
            MoreObjects.checkState(!this.g.h());
            this.l.c(new ex5(this));
            this.e.j();
        } else if (this.f.z1(th)) {
            this.g.c();
            MoreObjects.checkState(!this.g.h());
            this.l.g(new zw5(this));
            this.e.h();
        } else if (this.f.I0(th)) {
            this.g.c();
            MoreObjects.checkState(!this.g.h());
            this.l.d(new dx5(this));
            this.e.t();
        } else {
            R();
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object] */
    @Override // com.spotify.libs.otp.ui.l0.c
    public void f(String str, f fVar) {
        f fVar2 = fVar;
        MoreObjects.checkState(this.u == PhoneNumberSignupState.VALIDATE_OTP);
        this.g.c();
        fVar2.b(new vw5(this), new sw5(this));
    }

    @Override // com.spotify.libs.otp.ui.l0.c
    public void g(k0 k0Var) {
        MoreObjects.checkState(this.u == PhoneNumberSignupState.VALIDATE_OTP);
        MoreObjects.checkState(this.g.h());
        k0Var.d(new uw5(this), new xw5(this), new rw5(this), 30);
    }

    @Override // com.spotify.music.features.phonenumbersignup.d
    public boolean h() {
        this.u.getClass();
        if (this.u.ordinal() != 1) {
            return false;
        }
        this.g.b();
        M();
        return true;
    }

    public void z(SignupConfigurationResponse signupConfigurationResponse) {
        this.s = signupConfigurationResponse;
        SignupConfigurationResponse.CallingCode[] callingCodeArr = signupConfigurationResponse.allowedCallingCodes;
        if (callingCodeArr != null) {
            wq0 wq0 = this.n;
            ArrayList arrayList = new ArrayList(callingCodeArr.length);
            for (SignupConfigurationResponse.CallingCode callingCode : callingCodeArr) {
                arrayList.add(CallingCode.e(callingCode.countryCode, callingCode.callingCode));
            }
            wq0.c(arrayList);
        } else {
            this.r.b(this.o.a().H(this.c).B(this.d).subscribe(new yw5(this), ax5.a));
        }
        Logger.b("Signup configuration loaded", new Object[0]);
    }
}
