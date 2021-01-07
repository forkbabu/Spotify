package com.spotify.mobile.android.util;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.Assertion;

public final class a0 implements Assertion.a {
    private final k0 a;

    public a0(k0 k0Var) {
        this.a = k0Var;
    }

    @Override // com.spotify.mobile.android.util.Assertion.a
    public void a(Throwable th) {
        Logger.b("%s", th.getMessage());
        this.a.a(th);
    }

    @Override // com.spotify.mobile.android.util.Assertion.a
    public void b(AssertionError assertionError) {
        Logger.e(assertionError, "", new Object[0]);
        throw assertionError;
    }

    @Override // com.spotify.mobile.android.util.Assertion.a
    public void c(Assertion.RecoverableAssertionError recoverableAssertionError) {
        Throwable cause = recoverableAssertionError.getCause();
        if (cause != null) {
            Logger.b("%s: %s", recoverableAssertionError.getMessage(), cause.getMessage());
        } else {
            Logger.b("%s", recoverableAssertionError.getMessage());
        }
        String a2 = recoverableAssertionError.a();
        if (a2 != null) {
            Logger.b("Details: %s", a2);
        }
        this.a.a(recoverableAssertionError);
    }

    @Override // com.spotify.mobile.android.util.Assertion.a
    public void d(Assertion.Note note) {
        c(note);
    }
}
