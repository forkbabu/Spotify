package defpackage;

import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.decoder.Mode;
import com.google.zxing.qrcode.decoder.a;

/* renamed from: q30  reason: default package */
public final class q30 {
    private Mode a;
    private ErrorCorrectionLevel b;
    private a c;
    private int d = -1;
    private m30 e;

    public m30 a() {
        return this.e;
    }

    public void b(ErrorCorrectionLevel errorCorrectionLevel) {
        this.b = errorCorrectionLevel;
    }

    public void c(int i) {
        this.d = i;
    }

    public void d(m30 m30) {
        this.e = m30;
    }

    public void e(Mode mode) {
        this.a = mode;
    }

    public void f(a aVar) {
        this.c = aVar;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(200);
        sb.append("<<\n");
        sb.append(" mode: ");
        sb.append(this.a);
        sb.append("\n ecLevel: ");
        sb.append(this.b);
        sb.append("\n version: ");
        sb.append(this.c);
        sb.append("\n maskPattern: ");
        sb.append(this.d);
        if (this.e == null) {
            sb.append("\n matrix: null\n");
        } else {
            sb.append("\n matrix:\n");
            sb.append(this.e);
        }
        sb.append(">>\n");
        return sb.toString();
    }
}
