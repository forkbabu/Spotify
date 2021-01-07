package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.spotify.encore.consumer.elements.contextmenu.ContextMenuButton;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.music.premiummini.k;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

/* renamed from: hxc  reason: default package */
public final class hxc implements gxc {
    private final k a;
    private final SpSharedPreferences<Object> b;
    private final lxc c;

    public hxc(k kVar, SpSharedPreferences<Object> spSharedPreferences, lxc lxc) {
        h.e(kVar, "premiumMiniProperties");
        h.e(spSharedPreferences, "userPreferences");
        h.e(lxc, "tooltip");
        this.a = kVar;
        this.b = spSharedPreferences;
        this.c = lxc;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gxc
    public void a(View view) {
        h.e(view, "trackRowView");
        if (this.a.a() && (!this.b.d(ixc.b(), false))) {
            ContextMenuButton contextMenuButton = null;
            if (!(view instanceof ViewGroup)) {
                view = null;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup != null) {
                jnf e = knf.e(0, viewGroup.getChildCount());
                ArrayList arrayList = new ArrayList(d.e(e, 10));
                Iterator<Integer> it = e.iterator();
                while (((inf) it).hasNext()) {
                    arrayList.add(viewGroup.getChildAt(((kotlin.collections.k) it).a()));
                }
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    if (((View) next) instanceof ContextMenuButton) {
                        contextMenuButton = next;
                        break;
                    }
                }
                contextMenuButton = contextMenuButton;
            }
            if (contextMenuButton != null) {
                this.c.a(contextMenuButton);
                SpSharedPreferences.a<Object> b2 = this.b.b();
                b2.a(ixc.b(), true);
                b2.i();
            }
        }
    }

    @Override // defpackage.gxc
    public void b(View view) {
        h.e(view, "anchorView");
        if (this.a.a() && (!this.b.d(ixc.a(), false))) {
            SpSharedPreferences.a<Object> b2 = this.b.b();
            b2.a(ixc.a(), true);
            b2.i();
            this.c.a(view);
        }
    }
}
