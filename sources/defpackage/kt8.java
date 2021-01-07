package defpackage;

import kotlin.jvm.internal.h;

/* renamed from: kt8  reason: default package */
public final class kt8 implements jt8 {
    private final b61 a;
    private final rt8 b;
    private final String c;

    public kt8(b61 b61, rt8 rt8, String str) {
        h.e(b61, "hubsPresenter");
        h.e(rt8, "titleUpdater");
        h.e(str, "pageTitle");
        this.a = b61;
        this.b = rt8;
        this.c = str;
    }

    @Override // defpackage.jt8
    public void a(b91 b91) {
        String str;
        w81 text;
        h.e(b91, "viewModel");
        this.a.k(b91);
        rt8 rt8 = this.b;
        s81 header = b91.header();
        String title = (header == null || (text = header.text()) == null) ? null : text.title();
        if (title != null) {
            str = this.c + ' ' + title;
        } else {
            str = this.c;
        }
        rt8.setTitle(str);
    }
}
