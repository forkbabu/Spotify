package defpackage;

import com.spotify.base.java.logging.Logger;

/* renamed from: m70  reason: default package */
public class m70 {
    private final jz1 a;
    private final o70 b;

    m70(jz1 jz1, o70 o70) {
        this.a = jz1;
        this.b = o70;
    }

    public void a() {
        o91 o91;
        jz1 jz1 = this.a;
        String str = "";
        if (this.b.b()) {
            boolean f = this.b.f();
            boolean i = this.b.i();
            boolean g = this.b.g();
            boolean e = this.b.e();
            boolean h = this.b.h();
            boolean d = this.b.d();
            boolean z = false;
            Logger.b("Accessibility settings: isCaptioningEnabled=%s isTouchExplorationEnabled=%s hasAudioCues=%s isDisplayModified=%s hasSwitchControl=%s hasMenu=%s", Boolean.valueOf(f), Boolean.valueOf(i), Boolean.valueOf(e), Boolean.valueOf(g), Boolean.valueOf(h), Boolean.valueOf(d));
            boolean z2 = h || e || i || f || g || d;
            String str2 = "yes";
            String str3 = z2 ? str2 : str;
            if (i || h) {
                z = true;
            }
            String str4 = z ? str2 : "no";
            if (g) {
                str = str2;
            }
            if (!e) {
                str2 = "no";
            }
            o91 = new o91(str3, str4, str, str2);
        } else {
            o91 = new o91(str, str, str, str);
        }
        jz1.a(o91);
    }
}
