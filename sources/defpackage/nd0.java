package defpackage;

import android.media.AudioRecord;
import io.reactivex.functions.g;

/* renamed from: nd0  reason: default package */
public final /* synthetic */ class nd0 implements g {
    public final /* synthetic */ ud0 a;

    public /* synthetic */ nd0(ud0 ud0) {
        this.a = ud0;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.m((AudioRecord) obj);
    }
}
