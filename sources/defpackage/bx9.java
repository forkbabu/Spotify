package defpackage;

import com.spotify.mobile.android.observablestates.headset.HeadsetPluggedStatus;
import com.spotify.mobile.android.service.plugininterfaces.b;
import io.reactivex.s;
import io.reactivex.y;

/* renamed from: bx9  reason: default package */
public class bx9 implements b {
    private final y a;
    private final zw9 b;
    private final s<HeadsetPluggedStatus> c;
    private final s<na1> f;
    private io.reactivex.disposables.b n;
    private io.reactivex.disposables.b o;

    public bx9(y yVar, zw9 zw9, s<HeadsetPluggedStatus> sVar, s<na1> sVar2) {
        this.a = yVar;
        this.b = zw9;
        this.c = sVar;
        this.f = sVar2;
    }

    public static void b(bx9 bx9, boolean z) {
        bx9.b.q(z);
    }

    public static void d(bx9 bx9, boolean z) {
        bx9.b.n(z);
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.b
    public void a() {
        this.o = this.c.j0(hw9.a).o0(this.a).subscribe(new fw9(this));
        this.n = this.f.j0(lw9.a).o0(this.a).subscribe(new gw9(this));
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.b
    public void c() {
        this.n.dispose();
        this.o.dispose();
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.b
    public String name() {
        return "CrashlyticsCrash";
    }
}
