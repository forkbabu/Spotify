package com.spotify.android.glue.patterns.contextmenu.glue;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import com.spotify.android.glue.patterns.contextmenu.model.ContextMenuViewModel;
import com.spotify.android.goldenpath.a;
import com.spotify.music.C0707R;
import com.squareup.picasso.Picasso;

public class l implements va0 {
    private final j a;
    private final k b;
    private final o c;
    private final Context d;

    public l(Context context, ua0 ua0, Picasso picasso, xa0 xa0) {
        this.d = context;
        this.c = new o(context, ua0);
        m mVar = new m(context, picasso, context.getString(C0707R.string.context_menu_show_more));
        this.a = new j(context, ua0, xa0);
        this.b = new k(context, ua0, mVar, xa0);
    }

    @Override // defpackage.va0
    public void a(ContextMenuViewModel contextMenuViewModel) {
        if (contextMenuViewModel.u()) {
            this.c.v();
            return;
        }
        this.a.d(contextMenuViewModel.q());
        this.b.f(contextMenuViewModel);
        this.c.t(this.a, this.b);
    }

    @Override // defpackage.va0
    public void b() {
        this.c.p();
    }

    public void c(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = this.d.getString(C0707R.string.accessibility_context_menu_show_message);
        } else {
            str2 = this.d.getString(C0707R.string.accessibility_context_menu_show_message_with_context, str);
        }
        e().announceForAccessibility(str2);
    }

    public Dialog d() {
        Dialog dialog = new Dialog(this.d, C0707R.style.res_2132083485_theme_contextmenu);
        dialog.setContentView(e());
        if (Build.VERSION.SDK_INT < 21) {
            a.a(dialog);
        } else if (dialog.getWindow() != null) {
            Window window = dialog.getWindow();
            if (this.a.b() == 0) {
                window.addFlags(Integer.MIN_VALUE);
                window.setStatusBarColor(androidx.core.content.a.b(this.d, 17170445));
            }
            window.getDecorView().setSystemUiVisibility(1280);
        }
        return dialog;
    }

    public View e() {
        return this.c.q();
    }
}
