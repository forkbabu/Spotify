package com.spotify.music.features.login;

import com.spotify.libs.otp.session.d;
import com.spotify.music.features.phonenumbersignup.instrumentation.InstrumentationInputField;
import com.spotify.music.features.phonenumbersignup.instrumentation.InstrumentationScreen;
import com.spotify.music.features.phonenumbersignup.instrumentation.a;
import com.spotify.music.features.phonenumbersignup.instrumentation.b;
import com.spotify.music.spotlets.tracker.identifier.ClickIdentifier;
import com.spotify.music.spotlets.tracker.identifier.DialogIdentifier;
import com.spotify.music.spotlets.tracker.identifier.ErrorTypeIdentifier;
import com.spotify.music.spotlets.tracker.identifier.EventIdentifier;
import com.spotify.music.spotlets.tracker.identifier.InputFieldIdentifier;
import com.spotify.music.spotlets.tracker.identifier.ScreenIdentifier;

public class k1 implements b {
    private final xhd a;
    private final a b = new a(this);

    public k1(xhd xhd) {
        xhd.getClass();
        this.a = xhd;
    }

    private static ScreenIdentifier A(InstrumentationScreen instrumentationScreen) {
        int ordinal = instrumentationScreen.ordinal();
        if (ordinal == 0) {
            return ScreenIdentifier.LOGIN;
        }
        if (ordinal == 1) {
            return ScreenIdentifier.SIGN_UP_STEP_TWO;
        }
        if (ordinal == 2) {
            return ScreenIdentifier.SIGN_UP_STEP_THREE;
        }
        if (ordinal == 3) {
            return ScreenIdentifier.PHONE_NUMBER_CONTINUE_WITH_EMAIL;
        }
        if (ordinal == 4) {
            return ScreenIdentifier.PHONE_NUMBER_PHONE_NUMBER;
        }
        if (ordinal == 5) {
            return ScreenIdentifier.PHONE_NUMBER_OTP;
        }
        throw new IllegalStateException("unknown screen");
    }

    @Override // com.spotify.libs.otp.ui.l0.d
    public void a() {
        this.a.g(ScreenIdentifier.PHONE_NUMBER_OTP, ClickIdentifier.EDIT_PHONE_NUMBER_BUTTON);
    }

    @Override // com.spotify.libs.otp.ui.l0.d
    public void b(String str) {
        this.b.a(InstrumentationInputField.OTP, InstrumentationScreen.PHONE_NUMBER_OTP);
    }

    @Override // com.spotify.libs.otp.ui.h0.b
    public void c(d.a aVar) {
        this.a.d(ScreenIdentifier.PHONE_NUMBER_PHONE_NUMBER, EventIdentifier.OTP_REQUEST_SUCCESS);
    }

    @Override // com.spotify.libs.otp.ui.l0.b
    public void d(Throwable th) {
        this.a.d(ScreenIdentifier.PHONE_NUMBER_OTP, EventIdentifier.OTP_VALIDATION_FAILURE);
    }

    @Override // com.spotify.libs.otp.ui.h0.b
    public void e(Throwable th) {
        this.a.d(ScreenIdentifier.PHONE_NUMBER_PHONE_NUMBER, EventIdentifier.OTP_REQUEST_FAILURE);
    }

    @Override // com.spotify.libs.otp.ui.l0.b
    public void f() {
        this.a.d(ScreenIdentifier.PHONE_NUMBER_OTP, EventIdentifier.OTP_VALIDATION_SUCCESS);
    }

    @Override // com.spotify.music.features.phonenumbersignup.instrumentation.b
    public void g() {
        this.a.f(ScreenIdentifier.PHONE_NUMBER_OTP, DialogIdentifier.PHONE_NUMBER_TOO_MANY_TRIES);
    }

    @Override // com.spotify.music.features.phonenumbersignup.instrumentation.b
    public void h() {
        this.a.f(ScreenIdentifier.PHONE_NUMBER_OTP, DialogIdentifier.PHONE_NUMBER_TRY_AGAIN_LATER);
    }

    @Override // com.spotify.libs.otp.ui.j0.c
    public void i() {
        this.a.g(ScreenIdentifier.PHONE_NUMBER_PHONE_NUMBER, ClickIdentifier.SHOW_CALLING_CODES_BUTTON);
    }

    @Override // com.spotify.music.features.phonenumbersignup.instrumentation.b
    public void j() {
        this.a.f(ScreenIdentifier.PHONE_NUMBER_PHONE_NUMBER, DialogIdentifier.PHONE_NUMBER_INVALID_NUMBER);
    }

    @Override // com.spotify.music.features.phonenumbersignup.instrumentation.b
    public void k(InstrumentationScreen instrumentationScreen, String str) {
        this.a.n(A(instrumentationScreen), ErrorTypeIdentifier.NO_CONNECTION, null, null);
    }

    @Override // com.spotify.music.features.phonenumbersignup.instrumentation.b
    public void l(InstrumentationScreen instrumentationScreen) {
        this.a.p(A(instrumentationScreen));
    }

    @Override // com.spotify.music.features.phonenumbersignup.instrumentation.b
    public void m(InstrumentationScreen instrumentationScreen) {
        this.a.l(A(instrumentationScreen));
    }

    @Override // com.spotify.libs.otp.ui.l0.b
    public void n() {
    }

    @Override // com.spotify.libs.otp.ui.l0.b
    public void o() {
        this.a.f(ScreenIdentifier.PHONE_NUMBER_OTP, DialogIdentifier.PHONE_NUMBER_RESEND_TOO_EARLY);
    }

    @Override // com.spotify.libs.otp.ui.l0.d
    public void p() {
        this.a.g(ScreenIdentifier.PHONE_NUMBER_OTP, ClickIdentifier.RESEND_SMS_BUTTON);
    }

    @Override // com.spotify.libs.otp.ui.j0.c
    public void q() {
        this.a.g(ScreenIdentifier.PHONE_NUMBER_PHONE_NUMBER, ClickIdentifier.REQUEST_OTP_BUTTON);
    }

    @Override // com.spotify.libs.otp.ui.j0.c
    public void r(String str) {
        this.a.j(ScreenIdentifier.PHONE_NUMBER_PHONE_NUMBER, InputFieldIdentifier.CALLING_CODE);
    }

    @Override // com.spotify.libs.otp.ui.j0.c, com.spotify.libs.otp.ui.l0.d
    public void reset() {
        this.b.b();
    }

    @Override // com.spotify.libs.otp.ui.l0.d
    public void s() {
        this.a.g(ScreenIdentifier.PHONE_NUMBER_OTP, ClickIdentifier.VALIDATE_OTP_BUTTON);
    }

    @Override // com.spotify.music.features.phonenumbersignup.instrumentation.b
    public void t() {
        this.a.a(ScreenIdentifier.PHONE_NUMBER_OTP, ErrorTypeIdentifier.NO_CONNECTION, null);
    }

    @Override // com.spotify.music.features.phonenumbersignup.instrumentation.b
    public void u(InstrumentationScreen instrumentationScreen) {
        this.a.d(A(instrumentationScreen), EventIdentifier.OTP_SESSION_EXPIRED);
        this.a.f(A(instrumentationScreen), DialogIdentifier.PHONE_NUMBER_TIMEOUT);
    }

    @Override // com.spotify.music.features.phonenumbersignup.instrumentation.b
    public void v(InstrumentationScreen instrumentationScreen) {
        this.a.f(A(instrumentationScreen), DialogIdentifier.PHONE_NUMBER_ERROR);
    }

    @Override // com.spotify.music.features.phonenumbersignup.instrumentation.b
    public void w(InstrumentationScreen instrumentationScreen, InstrumentationInputField instrumentationInputField) {
        InputFieldIdentifier inputFieldIdentifier;
        xhd xhd = this.a;
        ScreenIdentifier A = A(instrumentationScreen);
        int ordinal = instrumentationInputField.ordinal();
        if (ordinal == 0) {
            inputFieldIdentifier = InputFieldIdentifier.EMAIL;
        } else if (ordinal == 1) {
            inputFieldIdentifier = InputFieldIdentifier.AGE;
        } else if (ordinal == 2) {
            inputFieldIdentifier = InputFieldIdentifier.GENDER;
        } else if (ordinal == 3) {
            inputFieldIdentifier = InputFieldIdentifier.PHONE_NUMBER;
        } else if (ordinal == 4) {
            inputFieldIdentifier = InputFieldIdentifier.OTP;
        } else if (ordinal == 5) {
            inputFieldIdentifier = InputFieldIdentifier.DISPLAY_NAME;
        } else {
            throw new IllegalStateException("unknown input field");
        }
        xhd.j(A, inputFieldIdentifier);
    }

    @Override // com.spotify.libs.otp.ui.l0.b
    public void x(d.a aVar) {
        this.a.d(ScreenIdentifier.PHONE_NUMBER_OTP, EventIdentifier.OTP_REQUEST_SUCCESS);
    }

    @Override // com.spotify.libs.otp.ui.l0.b
    public void y(Throwable th) {
        this.a.d(ScreenIdentifier.PHONE_NUMBER_OTP, EventIdentifier.OTP_REQUEST_FAILURE);
    }

    @Override // com.spotify.libs.otp.ui.j0.c
    public void z(String str) {
        this.b.a(InstrumentationInputField.PHONE_NUMBER, InstrumentationScreen.PHONE_NUMBER_PHONE_NUMBER);
    }
}
