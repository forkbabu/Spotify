package com.spotify.mobile.android.util;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.Assertion;

public final class m0 implements Assertion.a {
    @Override // com.spotify.mobile.android.util.Assertion.a
    public void a(Throwable th) {
        Logger.b("%s", th.getMessage());
        throw th;
    }

    @Override // com.spotify.mobile.android.util.Assertion.a
    public void b(AssertionError assertionError) {
        Logger.e(assertionError, "", new Object[0]);
        throw assertionError;
    }

    @Override // com.spotify.mobile.android.util.Assertion.a
    public void c(Assertion.RecoverableAssertionError recoverableAssertionError) {
        Logger.e(recoverableAssertionError, "", new Object[0]);
        throw recoverableAssertionError;
    }

    @Override // com.spotify.mobile.android.util.Assertion.a
    public void d(Assertion.Note note) {
        Logger.e(note, "", new Object[0]);
    }
}
