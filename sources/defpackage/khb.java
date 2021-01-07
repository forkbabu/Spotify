package defpackage;

import android.content.Context;
import android.view.View;
import com.spotify.mobile.android.ui.contextmenu.ContextMenuFragment;
import com.spotify.mobile.android.ui.contextmenu.r3;
import com.spotify.music.libs.viewuri.c;
import com.spotify.music.marketingformats.constants.MarketingFormatsCustomKey;
import defpackage.jhb;
import kotlin.jvm.internal.h;

/* renamed from: khb  reason: default package */
final class khb implements View.OnClickListener {
    final /* synthetic */ jhb a;
    final /* synthetic */ jhb.b b;
    final /* synthetic */ p81 c;

    khb(jhb jhb, jhb.b bVar, p81 p81) {
        this.a = jhb;
        this.b = bVar;
        this.c = p81;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        h.e(view, "v");
        Context context = view.getContext();
        jhb.b bVar = this.b;
        String string = this.c.string(MarketingFormatsCustomKey.KEY_CONTEXT_URI.d());
        if (string != null) {
            c a2 = c.a(string);
            int i = ContextMenuFragment.J0;
            h.e(bVar, "menuModel");
            h.d(context, "context");
            h.d(context, "context");
            ContextMenuFragment.f5(r3.f(new ohb(context, new phb(context, this.a.t, bVar.e(), bVar.d(), bVar.f(), bVar.a(), bVar.c(), bVar.b(), this.a.u))), (androidx.fragment.app.c) context, a2);
            return;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }
}
