package com.spotify.mobile.android.share.menu.preview.domain;

import com.spotify.mobile.android.share.menu.preview.domain.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.d;
import kotlin.jvm.internal.h;
import kotlin.sequences.e;

public final class SharePreviewMenuModel {
    private final a a;
    private final List<b> b;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.spotify.mobile.android.share.menu.preview.domain.b> */
    /* JADX WARN: Multi-variable type inference failed */
    public SharePreviewMenuModel(a aVar, List<? extends b> list) {
        h.e(aVar, "destinationListState");
        h.e(list, "payloadStateList");
        this.a = aVar;
        this.b = list;
    }

    public static SharePreviewMenuModel a(SharePreviewMenuModel sharePreviewMenuModel, a aVar, List list, int i) {
        if ((i & 1) != 0) {
            aVar = sharePreviewMenuModel.a;
        }
        if ((i & 2) != 0) {
            list = sharePreviewMenuModel.b;
        }
        h.e(aVar, "destinationListState");
        h.e(list, "payloadStateList");
        return new SharePreviewMenuModel(aVar, list);
    }

    public final a b() {
        return this.a;
    }

    public final List<b> c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SharePreviewMenuModel)) {
            return false;
        }
        SharePreviewMenuModel sharePreviewMenuModel = (SharePreviewMenuModel) obj;
        return h.a(this.a, sharePreviewMenuModel.a) && h.a(this.b, sharePreviewMenuModel.b);
    }

    public int hashCode() {
        a aVar = this.a;
        int i = 0;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        List<b> list = this.b;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("SharePreviewMenuModel(destinationListState=");
        V0.append(this.a);
        V0.append(", payloadStateList=");
        return je.L0(V0, this.b, ")");
    }

    public SharePreviewMenuModel(int i) {
        e<Object> d = kotlin.sequences.h.d(kotlin.sequences.h.b(AnonymousClass1.a), i);
        h.e(d, "$this$toList");
        h.e(d, "$this$toMutableList");
        ArrayList arrayList = new ArrayList();
        h.e(d, "$this$toCollection");
        h.e(arrayList, "destination");
        for (Object obj : d) {
            arrayList.add(obj);
        }
        List<b> B = d.B(arrayList);
        a.c cVar = a.c.a;
        h.e(cVar, "destinationListState");
        h.e(B, "payloadStateList");
        this.a = cVar;
        this.b = B;
    }
}
