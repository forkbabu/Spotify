package defpackage;

import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import com.coremedia.iso.boxes.FreeSpaceBox;
import com.spotify.rxjava2.p;
import io.reactivex.g;
import io.reactivex.internal.functions.a;
import io.reactivex.internal.operators.flowable.FlowableBuffer;
import io.reactivex.internal.util.ArrayListSupplier;
import java.util.List;

/* renamed from: ti2  reason: default package */
class ti2 implements ni2 {
    private final g<ShortcutInfo> a;
    private final ShortcutManager b;
    private final int c;
    private final p d = new p();

    ti2(g<ShortcutInfo> gVar, ShortcutManager shortcutManager, int i) {
        this.a = gVar;
        this.b = shortcutManager;
        this.c = i;
    }

    @Override // defpackage.ni2
    public void a() {
        this.d.a();
        this.b.removeAllDynamicShortcuts();
    }

    public /* synthetic */ void b(List list) {
        this.b.removeAllDynamicShortcuts();
        this.b.setDynamicShortcuts(list);
    }

    @Override // defpackage.ni2
    public void start() {
        p pVar = this.d;
        g<ShortcutInfo> gVar = this.a;
        int i = this.c;
        gVar.getClass();
        ArrayListSupplier arrayListSupplier = ArrayListSupplier.INSTANCE;
        a.d(i, "count");
        a.d(1, FreeSpaceBox.TYPE);
        pVar.b(new FlowableBuffer(gVar, i, 1, arrayListSupplier).subscribe(new di2(this), ei2.a));
    }

    @Override // defpackage.ni2
    public void stop() {
        this.d.a();
    }
}
