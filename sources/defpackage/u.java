package defpackage;

import android.graphics.Rect;
import android.support.wearable.complications.ComplicationData;
import android.text.Layout;

/* renamed from: u  reason: default package */
public class u {
    private final Rect a = new Rect();
    private ComplicationData b;

    public void a(Rect rect) {
        rect.set(this.a);
    }

    public ComplicationData b() {
        return this.b;
    }

    public void c(Rect rect) {
        rect.setEmpty();
    }

    public void d(Rect rect) {
        rect.setEmpty();
    }

    public Layout.Alignment e() {
        return Layout.Alignment.ALIGN_CENTER;
    }

    public void f(Rect rect) {
        rect.setEmpty();
    }

    public int g() {
        return 17;
    }

    public Layout.Alignment h() {
        return Layout.Alignment.ALIGN_CENTER;
    }

    public void i(Rect rect) {
        rect.setEmpty();
    }

    public int j() {
        return 17;
    }

    public void k(Rect rect) {
        rect.setEmpty();
    }

    public Layout.Alignment l() {
        return Layout.Alignment.ALIGN_CENTER;
    }

    public void m(Rect rect) {
        rect.setEmpty();
    }

    public int n() {
        return 17;
    }

    public Layout.Alignment o() {
        return Layout.Alignment.ALIGN_CENTER;
    }

    public void p(Rect rect) {
        rect.setEmpty();
    }

    public int q() {
        return 17;
    }

    public void r(Rect rect) {
        rect.setEmpty();
    }

    public void s(ComplicationData complicationData) {
        this.b = complicationData;
    }

    public void t(int i) {
        this.a.bottom = i;
    }

    public void u(int i) {
        this.a.right = i;
    }

    public void v(int i, int i2, ComplicationData complicationData) {
        u(i);
        t(i2);
        s(complicationData);
    }
}
