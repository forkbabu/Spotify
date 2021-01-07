package com.spotify.mobile.android.util;

import com.spotify.base.java.logging.Logger;
import java.util.ArrayList;
import java.util.Locale;

public final class Assertion {
    private static final Assertion b = new Assertion(new m0());
    private a a;

    public static class Note extends RecoverableAssertionError {
        private static final long serialVersionUID = 1;

        public Note(String str) {
            super(str);
        }

        public Note(String str, Throwable th) {
            super(str, th);
        }
    }

    public interface a {
        void a(Throwable th);

        void b(AssertionError assertionError);

        void c(RecoverableAssertionError recoverableAssertionError);

        void d(Note note);
    }

    private Assertion(a aVar) {
        this.a = aVar;
    }

    public static void a(Object obj, Object obj2) {
        if (!rw.equal(obj, obj2)) {
            s("The two objects (" + obj + ", " + obj2 + ") are not equal.");
        }
    }

    @Deprecated
    public static void b(String str, boolean z) {
        if (z) {
            p(Logger.f("%s", str));
        }
    }

    public static void c(CharSequence charSequence, String str, Object... objArr) {
        if (charSequence == null) {
            p("chars is null");
        } else if (charSequence.length() <= 0) {
            p(String.format(Locale.US, str, objArr));
        }
    }

    public static void d(Object obj, Object obj2) {
        if (obj != null ? obj.equals(obj2) : obj2 == null) {
            p("The two objects(" + obj + ", " + obj2 + ") are equal.");
        }
    }

    public static void e(Object obj) {
        if (obj == null) {
            p("Object failed null check");
        }
    }

    public static void f(Object obj, String str, Object... objArr) {
        if (obj == null) {
            p(String.format(Locale.US, str, objArr));
        }
    }

    public static void g(String str) {
        s(str);
    }

    public static void h(String str, String str2) {
        r(new RecoverableAssertionError(Logger.f("%s", str), str2));
    }

    public static void i(String str, Throwable th) {
        r(new RecoverableAssertionError(str, th));
    }

    @Deprecated
    public static void j(String str, boolean z) {
        if (!z) {
            p(Logger.f("%s", str));
        }
    }

    public static void k(boolean z, String str, Object... objArr) {
        if (!z) {
            p(Logger.f(str, objArr));
        }
    }

    @Deprecated
    public static void l(boolean z, String str) {
        if (!z) {
            s(str);
        }
    }

    public static void m(boolean z, String str, Object... objArr) {
        if (!z) {
            s(String.format(Locale.US, str, objArr));
        }
    }

    public static void n() {
        q(new AssertionError());
    }

    public static void o(Exception exc) {
        Logger.e(exc, "[no message]", new Object[0]);
        q(new AssertionError(exc));
    }

    public static void p(String str) {
        Logger.d("%s", str);
        q(new AssertionError(Logger.f("%s", str)));
    }

    private static void q(AssertionError assertionError) {
        u(assertionError);
        b.a.b(assertionError);
    }

    private static void r(RecoverableAssertionError recoverableAssertionError) {
        u(recoverableAssertionError);
        b.a.c(recoverableAssertionError);
    }

    private static void s(String str) {
        r(new RecoverableAssertionError(Logger.f("%s", str)));
    }

    public static void t(Throwable th) {
        b.a.a(th);
    }

    private static void u(Throwable th) {
        ArrayList arrayList = new ArrayList();
        StackTraceElement[] stackTrace = th.getStackTrace();
        for (StackTraceElement stackTraceElement : stackTrace) {
            if (!Assertion.class.getCanonicalName().equals(stackTraceElement.getClassName())) {
                arrayList.add(stackTraceElement);
            }
        }
        th.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
    }

    public static void v(String str) {
        Note note = new Note(str);
        u(note);
        b.a.d(note);
    }

    public static void w(String str, Throwable th) {
        Note note = new Note(str, th);
        u(note);
        b.a.d(note);
    }

    public static void x(a aVar) {
        b.a = aVar;
    }

    public static class RecoverableAssertionError extends RuntimeException {
        private static final long serialVersionUID = 1;
        private final String mDetails;

        public RecoverableAssertionError(String str) {
            super(str);
            this.mDetails = null;
        }

        public String a() {
            return this.mDetails;
        }

        public RecoverableAssertionError(String str, String str2) {
            super(str);
            this.mDetails = str2;
        }

        public RecoverableAssertionError(String str, Throwable th) {
            super(str, th);
            this.mDetails = null;
        }
    }
}
