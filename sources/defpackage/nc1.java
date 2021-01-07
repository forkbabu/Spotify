package defpackage;

import com.spotify.core.orbit.OrbitSessionInterface;

/* renamed from: nc1  reason: default package */
public class nc1 implements lc1 {
    private final OrbitSessionInterface a;

    /* renamed from: nc1$a */
    public static class a implements mc1 {
        @Override // defpackage.mc1
        public lc1 a(OrbitSessionInterface orbitSessionInterface) {
            return new nc1(orbitSessionInterface);
        }
    }

    nc1(OrbitSessionInterface orbitSessionInterface) {
        orbitSessionInterface.getClass();
        this.a = orbitSessionInterface;
    }

    @Override // defpackage.lc1
    public void log(String str) {
        this.a.log(str);
    }
}
