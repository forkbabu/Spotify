package com.facebook.share.widget;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.f0;
import com.facebook.internal.g;
import com.facebook.internal.h;
import com.facebook.internal.i;
import com.facebook.internal.z;
import com.facebook.k;
import com.facebook.share.internal.CameraEffectFeature;
import com.facebook.share.internal.OpenGraphActionDialogFeature;
import com.facebook.share.internal.ShareDialogFeature;
import com.facebook.share.internal.ShareStoryFeature;
import com.facebook.share.internal.x;
import com.facebook.share.model.l;
import com.facebook.share.model.o;
import com.facebook.share.model.p;
import com.facebook.share.model.q;
import com.facebook.share.model.s;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public final class ShareDialog extends i<com.facebook.share.model.d, com.facebook.share.b> {
    private static final int g = CallbackManagerImpl.RequestCodeOffset.Share.d();
    private boolean f = true;

    public enum Mode {
        AUTOMATIC,
        NATIVE,
        WEB,
        FEED
    }

    /* access modifiers changed from: private */
    public class b extends i<com.facebook.share.model.d, com.facebook.share.b>.a {
        b(a aVar) {
            super(ShareDialog.this);
        }

        @Override // com.facebook.internal.i.a
        public boolean a(Object obj, boolean z) {
            com.facebook.share.model.d dVar = (com.facebook.share.model.d) obj;
            return (dVar instanceof com.facebook.share.model.c) && ShareDialog.l(dVar.getClass());
        }

        @Override // com.facebook.internal.i.a
        public com.facebook.internal.a b(Object obj) {
            com.facebook.share.model.d dVar = (com.facebook.share.model.d) obj;
            com.facebook.share.internal.c.I(dVar);
            com.facebook.internal.a c = ShareDialog.this.c();
            h.d(c, new e(this, c, dVar, ShareDialog.this.t()), ShareDialog.s(dVar.getClass()));
            return c;
        }

        @Override // com.facebook.internal.i.a
        public Object c() {
            return Mode.NATIVE;
        }
    }

    private class c extends i<com.facebook.share.model.d, com.facebook.share.b>.a {
        c(a aVar) {
            super(ShareDialog.this);
        }

        @Override // com.facebook.internal.i.a
        public boolean a(Object obj, boolean z) {
            com.facebook.share.model.d dVar = (com.facebook.share.model.d) obj;
            return (dVar instanceof com.facebook.share.model.f) || (dVar instanceof x);
        }

        @Override // com.facebook.internal.i.a
        public com.facebook.internal.a b(Object obj) {
            Bundle bundle;
            com.facebook.share.model.d dVar = (com.facebook.share.model.d) obj;
            ShareDialog shareDialog = ShareDialog.this;
            ShareDialog.n(shareDialog, shareDialog.d(), dVar, Mode.FEED);
            com.facebook.internal.a c = ShareDialog.this.c();
            if (dVar instanceof com.facebook.share.model.f) {
                com.facebook.share.model.f fVar = (com.facebook.share.model.f) dVar;
                com.facebook.share.internal.c.K(fVar);
                bundle = new Bundle();
                f0.L(bundle, "name", fVar.i());
                f0.L(bundle, "description", fVar.h());
                f0.L(bundle, "link", f0.t(fVar.a()));
                f0.L(bundle, "picture", f0.t(fVar.j()));
                f0.L(bundle, "quote", fVar.k());
                if (fVar.g() != null) {
                    f0.L(bundle, "hashtag", fVar.g().a());
                }
            } else {
                x xVar = (x) dVar;
                bundle = new Bundle();
                f0.L(bundle, "to", xVar.n());
                f0.L(bundle, "link", xVar.h());
                f0.L(bundle, "picture", xVar.m());
                f0.L(bundle, "source", xVar.l());
                f0.L(bundle, "name", xVar.k());
                f0.L(bundle, "caption", xVar.i());
                f0.L(bundle, "description", xVar.j());
            }
            h.f(c, "feed", bundle);
            return c;
        }

        @Override // com.facebook.internal.i.a
        public Object c() {
            return Mode.FEED;
        }
    }

    /* access modifiers changed from: private */
    public class d extends i<com.facebook.share.model.d, com.facebook.share.b>.a {
        d(a aVar) {
            super(ShareDialog.this);
        }

        @Override // com.facebook.internal.i.a
        public boolean a(Object obj, boolean z) {
            boolean z2;
            com.facebook.share.model.d dVar = (com.facebook.share.model.d) obj;
            if (dVar == null || (dVar instanceof com.facebook.share.model.c) || (dVar instanceof q)) {
                return false;
            }
            if (!z) {
                z2 = dVar.g() != null ? h.a(ShareDialogFeature.HASHTAG) : true;
                if ((dVar instanceof com.facebook.share.model.f) && !f0.C(((com.facebook.share.model.f) dVar).k())) {
                    z2 &= h.a(ShareDialogFeature.LINK_SHARE_QUOTES);
                }
            } else {
                z2 = true;
            }
            if (!z2 || !ShareDialog.l(dVar.getClass())) {
                return false;
            }
            return true;
        }

        @Override // com.facebook.internal.i.a
        public com.facebook.internal.a b(Object obj) {
            com.facebook.share.model.d dVar = (com.facebook.share.model.d) obj;
            ShareDialog shareDialog = ShareDialog.this;
            ShareDialog.n(shareDialog, shareDialog.d(), dVar, Mode.NATIVE);
            com.facebook.share.internal.c.I(dVar);
            com.facebook.internal.a c = ShareDialog.this.c();
            h.d(c, new f(this, c, dVar, ShareDialog.this.t()), ShareDialog.s(dVar.getClass()));
            return c;
        }

        @Override // com.facebook.internal.i.a
        public Object c() {
            return Mode.NATIVE;
        }
    }

    /* access modifiers changed from: private */
    public class e extends i<com.facebook.share.model.d, com.facebook.share.b>.a {
        e(a aVar) {
            super(ShareDialog.this);
        }

        @Override // com.facebook.internal.i.a
        public boolean a(Object obj, boolean z) {
            com.facebook.share.model.d dVar = (com.facebook.share.model.d) obj;
            return (dVar instanceof q) && ShareDialog.l(dVar.getClass());
        }

        @Override // com.facebook.internal.i.a
        public com.facebook.internal.a b(Object obj) {
            com.facebook.share.model.d dVar = (com.facebook.share.model.d) obj;
            com.facebook.share.internal.c.J(dVar);
            com.facebook.internal.a c = ShareDialog.this.c();
            h.d(c, new g(this, c, dVar, ShareDialog.this.t()), ShareDialog.s(dVar.getClass()));
            return c;
        }

        @Override // com.facebook.internal.i.a
        public Object c() {
            return Mode.NATIVE;
        }
    }

    private class f extends i<com.facebook.share.model.d, com.facebook.share.b>.a {
        f(a aVar) {
            super(ShareDialog.this);
        }

        @Override // com.facebook.internal.i.a
        public boolean a(Object obj, boolean z) {
            com.facebook.share.model.d dVar = (com.facebook.share.model.d) obj;
            return dVar != null && ShareDialog.p(dVar);
        }

        @Override // com.facebook.internal.i.a
        public com.facebook.internal.a b(Object obj) {
            Bundle bundle;
            com.facebook.share.model.d dVar = (com.facebook.share.model.d) obj;
            ShareDialog shareDialog = ShareDialog.this;
            ShareDialog.n(shareDialog, shareDialog.d(), dVar, Mode.WEB);
            com.facebook.internal.a c = ShareDialog.this.c();
            com.facebook.share.internal.c.K(dVar);
            boolean z = dVar instanceof com.facebook.share.model.f;
            String str = null;
            if (z) {
                bundle = com.facebook.share.internal.c.i((com.facebook.share.model.f) dVar);
            } else if (dVar instanceof p) {
                p pVar = (p) dVar;
                UUID b = c.b();
                p.b bVar = new p.b();
                if (pVar != null) {
                    bVar = (p.b) bVar.g(pVar);
                    bVar.k(pVar.h());
                }
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (int i = 0; i < pVar.h().size(); i++) {
                    o oVar = pVar.h().get(i);
                    Bitmap c2 = oVar.c();
                    if (c2 != null) {
                        z.b c3 = z.c(b, c2);
                        o.b j = new o.b().j(oVar);
                        j.l(Uri.parse(c3.g()));
                        j.k(null);
                        oVar = j.g();
                        arrayList2.add(c3);
                    }
                    arrayList.add(oVar);
                }
                bVar.m(arrayList);
                z.a(arrayList2);
                bundle = com.facebook.share.internal.c.k(bVar.l());
            } else {
                bundle = com.facebook.share.internal.c.j((l) dVar);
            }
            if (z || (dVar instanceof p)) {
                str = "share";
            } else if (dVar instanceof l) {
                str = "share_open_graph";
            }
            h.f(c, str, bundle);
            return c;
        }

        @Override // com.facebook.internal.i.a
        public Object c() {
            return Mode.WEB;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ShareDialog(android.app.Activity r2) {
        /*
            r1 = this;
            int r0 = com.facebook.share.widget.ShareDialog.g
            r1.<init>(r2, r0)
            r2 = 1
            r1.f = r2
            com.facebook.share.internal.c.z(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.share.widget.ShareDialog.<init>(android.app.Activity):void");
    }

    static boolean l(Class cls) {
        g s = s(cls);
        return s != null && h.a(s);
    }

    static void n(ShareDialog shareDialog, Context context, com.facebook.share.model.d dVar, Mode mode) {
        if (shareDialog.f) {
            mode = Mode.AUTOMATIC;
        }
        int ordinal = mode.ordinal();
        String str = "unknown";
        String str2 = ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? str : "web" : "native" : "automatic";
        g s = s(dVar.getClass());
        if (s == ShareDialogFeature.SHARE_DIALOG) {
            str = "status";
        } else if (s == ShareDialogFeature.PHOTOS) {
            str = "photo";
        } else if (s == ShareDialogFeature.VIDEO) {
            str = "video";
        } else if (s == OpenGraphActionDialogFeature.OG_ACTION_DIALOG) {
            str = "open_graph";
        }
        new com.facebook.appevents.i(context).g("fb_share_dialog_show", je.F("fb_share_dialog_show", str2, "fb_share_dialog_content_type", str));
    }

    static boolean p(com.facebook.share.model.d dVar) {
        if (r(dVar.getClass())) {
            if (dVar instanceof l) {
                try {
                    com.facebook.share.internal.c.E((l) dVar);
                } catch (Exception unused) {
                    boolean z = k.n;
                }
            }
            return true;
        }
        return false;
    }

    public static boolean q(Class<? extends com.facebook.share.model.d> cls) {
        if (r(cls)) {
            return true;
        }
        g s = s(cls);
        if (s != null && h.a(s)) {
            return true;
        }
        return false;
    }

    private static boolean r(Class<? extends com.facebook.share.model.d> cls) {
        return com.facebook.share.model.f.class.isAssignableFrom(cls) || l.class.isAssignableFrom(cls) || (p.class.isAssignableFrom(cls) && com.facebook.a.p());
    }

    /* access modifiers changed from: private */
    public static g s(Class<? extends com.facebook.share.model.d> cls) {
        if (com.facebook.share.model.f.class.isAssignableFrom(cls)) {
            return ShareDialogFeature.SHARE_DIALOG;
        }
        if (p.class.isAssignableFrom(cls)) {
            return ShareDialogFeature.PHOTOS;
        }
        if (s.class.isAssignableFrom(cls)) {
            return ShareDialogFeature.VIDEO;
        }
        if (l.class.isAssignableFrom(cls)) {
            return OpenGraphActionDialogFeature.OG_ACTION_DIALOG;
        }
        if (com.facebook.share.model.g.class.isAssignableFrom(cls)) {
            return ShareDialogFeature.MULTIMEDIA;
        }
        if (com.facebook.share.model.c.class.isAssignableFrom(cls)) {
            return CameraEffectFeature.SHARE_CAMERA_EFFECT;
        }
        if (q.class.isAssignableFrom(cls)) {
            return ShareStoryFeature.SHARE_STORY_ASSET;
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
    public List<i<com.facebook.share.model.d, com.facebook.share.b>.a> e() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new d(null));
        arrayList.add(new c(null));
        arrayList.add(new f(null));
        arrayList.add(new b(null));
        arrayList.add(new e(null));
        return arrayList;
    }

    public boolean t() {
        return false;
    }

    ShareDialog(Activity activity, int i) {
        super(activity, i);
        com.facebook.share.internal.c.z(i);
    }

    ShareDialog(Fragment fragment, int i) {
        super(new com.facebook.internal.q(fragment), i);
        com.facebook.share.internal.c.z(i);
    }

    ShareDialog(android.app.Fragment fragment, int i) {
        super(new com.facebook.internal.q(fragment), i);
        com.facebook.share.internal.c.z(i);
    }
}
