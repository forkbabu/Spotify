package defpackage;

import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.C0707R;
import io.reactivex.z;
import java.util.ArrayList;
import java.util.List;

/* renamed from: d2d  reason: default package */
public class d2d implements c2d {
    private final List<o8e> a;
    private final f3e b;
    private final q7e c;
    private final List<LinkType> d;
    private final r2e e;

    d2d(List<o8e> list, f3e f3e, q7e q7e, List<LinkType> list2, r2e r2e) {
        this.a = list;
        this.b = f3e;
        this.c = q7e;
        this.d = list2;
        this.e = r2e;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public List<o8e> c(List<o8e> list, List<Integer> list2, pzc pzc) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        LinkType q = l0.z(pzc.k().g()).q();
        boolean z2 = true;
        boolean contains = (pzc.i().isPresent() || pzc.j().isPresent()) ? true : this.d.contains(q);
        if (pzc.l().isPresent()) {
            z = true;
        } else {
            z = f2d.a.contains(q);
        }
        o8e o8e = null;
        o8e o8e2 = null;
        for (o8e o8e3 : list) {
            if (o8e3.id() == C0707R.id.share_app_facebook_stories && e(o8e3, contains, z, list2)) {
                o8e = o8e3;
            } else if (o8e3.id() == C0707R.id.share_app_facebook_feed && e(o8e3, contains, z, list2)) {
                o8e2 = o8e3;
            }
        }
        boolean z3 = o8e != null;
        if (o8e2 == null) {
            z2 = false;
        }
        for (o8e o8e4 : list) {
            if ((z3 && o8e4 == o8e) || (z2 && o8e4 == o8e2)) {
                arrayList.add(o8e4);
            } else if (!(o8e4 == o8e || o8e4 == o8e2 || !e(o8e4, contains, z, list2))) {
                arrayList.add(o8e4);
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003a, code lost:
        if (r5.contains(r3) == false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004b, code lost:
        if (r5.contains(r3) == false) goto L_0x004e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0058 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean e(defpackage.o8e r5, boolean r6, boolean r7, java.util.List<java.lang.Integer> r8) {
        /*
            r4 = this;
            f3e r0 = r4.b
            boolean r0 = r0.a(r5)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0014
            q7e r0 = r4.c
            boolean r0 = r0.a(r5)
            if (r0 == 0) goto L_0x0014
            r0 = 1
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            int r3 = r5.id()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r8 = r8.contains(r3)
            com.spotify.share.sharedata.ShareCapability r3 = com.spotify.share.sharedata.ShareCapability.LINK
            java.util.List r5 = r5.b()
            if (r6 == 0) goto L_0x002c
            if (r7 == 0) goto L_0x002c
            goto L_0x0050
        L_0x002c:
            if (r6 == 0) goto L_0x003d
            com.spotify.share.sharedata.ShareCapability r6 = com.spotify.share.sharedata.ShareCapability.IMAGE_STORY
            boolean r6 = r5.contains(r6)
            if (r6 != 0) goto L_0x0050
            boolean r5 = r5.contains(r3)
            if (r5 == 0) goto L_0x004e
            goto L_0x0050
        L_0x003d:
            if (r7 == 0) goto L_0x0052
            com.spotify.share.sharedata.ShareCapability r6 = com.spotify.share.sharedata.ShareCapability.MESSAGE
            boolean r6 = r5.contains(r6)
            if (r6 != 0) goto L_0x0050
            boolean r5 = r5.contains(r3)
            if (r5 == 0) goto L_0x004e
            goto L_0x0050
        L_0x004e:
            r5 = 0
            goto L_0x0056
        L_0x0050:
            r5 = 1
            goto L_0x0056
        L_0x0052:
            boolean r5 = r5.contains(r3)
        L_0x0056:
            if (r0 == 0) goto L_0x005d
            if (r8 != 0) goto L_0x005d
            if (r5 == 0) goto L_0x005d
            goto L_0x005e
        L_0x005d:
            r1 = 0
        L_0x005e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d2d.e(o8e, boolean, boolean, java.util.List):boolean");
    }

    @Override // defpackage.c2d
    public z<List<o8e>> a(String str, List<Integer> list, pzc pzc) {
        return this.e.b(str).A(new z1d(this, list, pzc));
    }

    @Override // defpackage.c2d
    public List<o8e> b(List<Integer> list, pzc pzc) {
        return c(this.a, list, pzc);
    }
}
