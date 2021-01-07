package com.google.android.gms.internal.cast;

import android.widget.TextView;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.framework.media.h;
import com.google.android.gms.cast.j;
import java.util.ArrayList;
import java.util.List;

public final class e0 extends vq {
    private final TextView b;
    private final List<String> c;

    public e0(TextView textView, List<String> list) {
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        this.b = textView;
        arrayList.addAll(list);
    }

    @Override // defpackage.vq
    public final void c() {
        MediaInfo t2;
        j Q1;
        h b2 = b();
        if (!(b2 == null || !b2.m() || (t2 = b2.i().t2()) == null || (Q1 = t2.Q1()) == null)) {
            for (String str : this.c) {
                if (Q1.I1(str)) {
                    this.b.setText(Q1.q2(str));
                    return;
                }
            }
            this.b.setText("");
        }
    }
}
