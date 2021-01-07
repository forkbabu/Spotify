package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: h50  reason: default package */
public class h50 extends j50 {
    Logger a;

    public h50(String str) {
        this.a = Logger.getLogger(str);
    }

    @Override // defpackage.j50
    public void b(String str) {
        this.a.log(Level.FINE, str);
    }

    @Override // defpackage.j50
    public void c(String str) {
        this.a.log(Level.SEVERE, str);
    }

    @Override // defpackage.j50
    public void d(String str) {
        this.a.log(Level.WARNING, str);
    }
}
