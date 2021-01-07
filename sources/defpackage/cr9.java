package defpackage;

import android.os.Build;
import android.view.View;

/* renamed from: cr9  reason: default package */
public class cr9 {
    private final gr9 a;

    public cr9(gr9 gr9) {
        this.a = gr9;
    }

    public void a(View view, p81 p81) {
        String str;
        view.getClass();
        if (p81 == null) {
            str = "none";
        } else {
            str = p81.string("style", "none");
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1984141450:
                if (str.equals("vertical")) {
                    c = 0;
                    break;
                }
                break;
            case -238453707:
                if (str.equals("diagonal")) {
                    c = 1;
                    break;
                }
                break;
            case 3387192:
                if (str.equals("none")) {
                    c = 3;
                    break;
                }
                break;
            case 1544803905:
                if (str.equals("default")) {
                    c = 2;
                    break;
                }
                break;
        }
        if (c == 0) {
            this.a.e(view, p81, 0);
        } else if (c == 1) {
            this.a.e(view, p81, 1);
        } else if (c != 2) {
            this.a.getClass();
            int i = q4.g;
            int i2 = Build.VERSION.SDK_INT;
            view.setBackground(null);
        } else {
            this.a.d(view);
        }
    }
}
