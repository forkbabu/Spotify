package defpackage;

import com.google.common.base.Optional;
import com.spotify.remoteconfig.sa;
import com.spotify.share.sharedata.ShareCapability;
import com.spotify.share.sharedata.o;
import com.spotify.share.sharedata.q;
import com.spotify.share.sharedata.r;
import com.spotify.share.sharedata.s;
import com.spotify.share.sharedata.t;
import com.spotify.share.sharedata.u;
import com.spotify.share.sharedata.w;
import defpackage.pzc;
import defpackage.xzc;
import io.reactivex.z;
import kotlin.jvm.internal.h;

/* renamed from: yzc  reason: default package */
public final class yzc implements xzc {
    private final ShareCapability[] a = {ShareCapability.VIDEO_STORY, ShareCapability.IMAGE_STORY, ShareCapability.GRADIENT_STORY, ShareCapability.MESSAGE};
    private final sa b;
    private final b0d c;
    private final uzc d;
    private final qzc e;

    /* renamed from: yzc$a */
    public static final class a implements xzc.a {
        private final sa a;
        private final b0d b;
        private final uzc c;

        public a(sa saVar, b0d b0d, uzc uzc) {
            h.e(saVar, "shareProperties");
            h.e(b0d, "storyShareDataProvider");
            h.e(uzc, "messageShareDataProvider");
            this.a = saVar;
            this.b = b0d;
            this.c = uzc;
        }

        @Override // defpackage.xzc.a
        public xzc a(qzc qzc) {
            return new yzc(this.a, this.b, this.c, qzc);
        }
    }

    public yzc(sa saVar, b0d b0d, uzc uzc, qzc qzc) {
        h.e(saVar, "shareProperties");
        h.e(b0d, "storyShareDataProvider");
        h.e(uzc, "messageShareDataProvider");
        this.b = saVar;
        this.c = b0d;
        this.d = uzc;
        this.e = qzc;
    }

    /* access modifiers changed from: private */
    public final pzc d(pzc pzc, r rVar) {
        pzc.a a2 = pzc.a(pzc.f(), pzc.h(), pzc.g(), rVar);
        Optional<o> i = pzc.i();
        h.d(i, "gradientStoryShareData()");
        if (i.isPresent()) {
            o.a k = pzc.i().get().k();
            k.b(rVar.c());
            a2.b(k.build());
        }
        Optional<q> j = pzc.j();
        h.d(j, "imageStoryShareData()");
        if (j.isPresent()) {
            q.a l = pzc.j().get().l();
            l.b(rVar.c());
            a2.a(l.build());
        }
        Optional<w> m = pzc.m();
        h.d(m, "videoStoryShareData()");
        if (m.isPresent()) {
            w.a k2 = pzc.m().get().k();
            k2.b(rVar.c());
            a2.d(k2.build());
        }
        Optional<s> l2 = pzc.l();
        h.d(l2, "messageShareData()");
        if (l2.isPresent()) {
            s.a l3 = pzc.l().get().l();
            l3.b(rVar.c());
            a2.c(l3.build());
        }
        pzc build = a2.build();
        h.d(build, "builder.build()");
        return build;
    }

    /* access modifiers changed from: private */
    public final z<? extends t> e(o8e o8e, pzc pzc) {
        z<s> zVar;
        if (o8e.b().contains(ShareCapability.GRADIENT_STORY) || o8e.b().contains(ShareCapability.IMAGE_STORY)) {
            z<u<?>> a2 = this.c.a(o8e, pzc.k());
            h.d(a2, "storyShareDataProvider.g…MenuData.linkShareData())");
            return a2;
        }
        if (o8e.b().contains(ShareCapability.MESSAGE)) {
            zVar = this.d.a(pzc);
        } else {
            zVar = z.z(pzc.k());
        }
        h.d(zVar, "if (destination.isMessag…inkShareData())\n        }");
        return zVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0189 A[SYNTHETIC] */
    @Override // defpackage.xzc
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public io.reactivex.z<? extends com.spotify.share.sharedata.t> a(defpackage.o8e r10, defpackage.pzc r11) {
        /*
        // Method dump skipped, instructions count: 417
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yzc.a(o8e, pzc):io.reactivex.z");
    }
}
