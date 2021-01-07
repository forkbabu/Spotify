package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.jvm.internal.h;
import kotlin.sequences.e;

/* renamed from: v4  reason: default package */
public final class v4 implements e<View> {
    final /* synthetic */ ViewGroup a;

    v4(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    @Override // kotlin.sequences.e
    public Iterator<View> iterator() {
        ViewGroup viewGroup = this.a;
        h.f(viewGroup, "$this$iterator");
        return new w4(viewGroup);
    }
}
