package defpackage;

/* renamed from: l8  reason: default package */
public final class l8 {
    private int a;

    l8(int i) {
        this.a = i;
    }

    public int a() {
        return this.a;
    }

    public String toString() {
        StringBuilder V0 = je.V0("DeviceState{ posture=");
        int i = this.a;
        return je.I0(V0, i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? je.q0("Unknown posture value (", i, ")") : "FLIPPED" : "OPENED" : "HALF_OPENED" : "CLOSED" : "UNKNOWN", " }");
    }
}
