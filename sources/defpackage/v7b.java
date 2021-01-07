package defpackage;

import io.reactivex.functions.l;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: v7b  reason: default package */
public class v7b implements l<b91, b91> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public b91 apply(b91 b91) {
        b91 b912 = b91;
        if (!b912.custom().boolValue("isLastPage", false) || b912.custom().get("see-all-results") == null) {
            return b912;
        }
        s81[] s81Arr = (s81[]) b912.custom().get("see-all-results");
        ArrayList arrayList = new ArrayList(s81Arr.length);
        arrayList.addAll(Arrays.asList(s81Arr));
        return b912.toBuilder().a(arrayList).g();
    }
}
