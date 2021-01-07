package defpackage;

/* renamed from: f10  reason: default package */
public class f10 {
    public final String a;
    public final String b;
    public final StackTraceElement[] c;
    public final f10 d;

    public f10(Throwable th, e10 e10) {
        this.a = th.getLocalizedMessage();
        this.b = th.getClass().getName();
        this.c = e10.a(th.getStackTrace());
        Throwable cause = th.getCause();
        this.d = cause != null ? new f10(cause, e10) : null;
    }
}
