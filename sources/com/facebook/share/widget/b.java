package com.facebook.share.widget;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.g;
import com.facebook.internal.h;
import com.facebook.internal.i;
import com.facebook.internal.q;
import com.facebook.share.internal.MessageDialogFeature;
import com.facebook.share.internal.c;
import com.facebook.share.model.ShareMessengerGenericTemplateContent;
import com.facebook.share.model.ShareMessengerMediaTemplateContent;
import com.facebook.share.model.d;
import com.facebook.share.model.f;
import com.facebook.share.model.j;
import java.util.ArrayList;
import java.util.List;

@Deprecated
public final class b extends i<d, com.facebook.share.b> {
    private static final int f = CallbackManagerImpl.RequestCodeOffset.Message.d();

    /* access modifiers changed from: private */
    /* renamed from: com.facebook.share.widget.b$b  reason: collision with other inner class name */
    public class C0079b extends i<d, com.facebook.share.b>.a {
        C0079b(a aVar) {
            super(b.this);
        }

        @Override // com.facebook.internal.i.a
        public boolean a(Object obj, boolean z) {
            d dVar = (d) obj;
            return dVar != null && b.m(dVar.getClass());
        }

        @Override // com.facebook.internal.i.a
        public com.facebook.internal.a b(Object obj) {
            d dVar = (d) obj;
            c.H(dVar);
            com.facebook.internal.a c = b.this.c();
            boolean o = b.this.o();
            b.k(b.this.d(), dVar, c);
            h.d(c, new c(this, c, dVar, o), b.n(dVar.getClass()));
            return c;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b(android.app.Activity r2) {
        /*
            r1 = this;
            int r0 = com.facebook.share.widget.b.f
            r1.<init>(r2, r0)
            com.facebook.share.internal.c.z(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.share.widget.b.<init>(android.app.Activity):void");
    }

    static void k(Context context, d dVar, com.facebook.internal.a aVar) {
        String str;
        g n = n(dVar.getClass());
        if (n == MessageDialogFeature.MESSAGE_DIALOG) {
            str = "status";
        } else if (n == MessageDialogFeature.MESSENGER_GENERIC_TEMPLATE) {
            str = "GenericTemplate";
        } else if (n == MessageDialogFeature.MESSENGER_MEDIA_TEMPLATE) {
            str = "MediaTemplate";
        } else {
            str = n == MessageDialogFeature.MESSENGER_OPEN_GRAPH_MUSIC_TEMPLATE ? "OpenGraphMusicTemplate" : "unknown";
        }
        com.facebook.appevents.i iVar = new com.facebook.appevents.i(context);
        Bundle E = je.E("fb_share_dialog_content_type", str);
        E.putString("fb_share_dialog_content_uuid", aVar.b().toString());
        E.putString("fb_share_dialog_content_page_id", dVar.b());
        iVar.g("fb_messenger_share_dialog_show", E);
    }

    public static boolean m(Class<? extends d> cls) {
        g n = n(cls);
        return n != null && h.a(n);
    }

    /* access modifiers changed from: private */
    public static g n(Class<? extends d> cls) {
        if (f.class.isAssignableFrom(cls)) {
            return MessageDialogFeature.MESSAGE_DIALOG;
        }
        if (ShareMessengerGenericTemplateContent.class.isAssignableFrom(cls)) {
            return MessageDialogFeature.MESSENGER_GENERIC_TEMPLATE;
        }
        if (j.class.isAssignableFrom(cls)) {
            return MessageDialogFeature.MESSENGER_OPEN_GRAPH_MUSIC_TEMPLATE;
        }
        if (ShareMessengerMediaTemplateContent.class.isAssignableFrom(cls)) {
            return MessageDialogFeature.MESSENGER_MEDIA_TEMPLATE;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    @Override // com.facebook.internal.i
    public com.facebook.internal.a c() {
        return new com.facebook.internal.a(f());
    }

    /* access modifiers changed from: protected */
    @Override // com.facebook.internal.i
    public List<i<d, com.facebook.share.b>.a> e() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C0079b(null));
        return arrayList;
    }

    public boolean o() {
        return false;
    }

    b(Activity activity, int i) {
        super(activity, i);
        c.z(i);
    }

    b(Fragment fragment, int i) {
        super(new q(fragment), i);
        c.z(i);
    }

    b(android.app.Fragment fragment, int i) {
        super(new q(fragment), i);
        c.z(i);
    }
}
