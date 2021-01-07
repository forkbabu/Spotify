package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.f;
import com.spotify.music.C0707R;

/* renamed from: jl9  reason: default package */
public class jl9 {
    private final Context a;
    private final yec b;
    private final uk9 c;

    public jl9(Context context, yec yec, uk9 uk9) {
        this.a = context;
        this.b = yec;
        this.c = uk9;
    }

    public void a(String str, DialogInterface dialogInterface, int i) {
        this.c.f(str);
        this.b.a(str);
    }

    public /* synthetic */ void b(String str, DialogInterface dialogInterface, int i) {
        this.c.g(str);
    }

    public void c(String str) {
        xk9 xk9 = new xk9(this, str);
        yk9 yk9 = new yk9(this, str);
        View inflate = LayoutInflater.from(this.a).inflate(C0707R.layout.free_tier_precuration_alert_dialog, (ViewGroup) null);
        f.a aVar = new f.a(this.a, C0707R.style.res_2132083498_theme_glue_dialog);
        aVar.o(inflate);
        aVar.k(C0707R.string.free_tier_precuration_education_dialog_positive_button_text, xk9);
        aVar.h(C0707R.string.free_tier_precuration_education_dialog_negative_button_text, yk9);
        aVar.a().show();
    }
}
