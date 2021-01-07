package defpackage;

/* renamed from: esb  reason: default package */
public class esb {
    private final csb a;
    private boolean b;

    public esb(csb csb) {
        this.a = csb;
    }

    public boolean a() {
        if (this.b) {
            return false;
        }
        this.b = true;
        return this.a.E2();
    }
}
