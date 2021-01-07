package androidx.media;

import android.os.Bundle;
import androidx.media.b;

class r implements Runnable {
    final /* synthetic */ b.m a;
    final /* synthetic */ String b;
    final /* synthetic */ Bundle c;
    final /* synthetic */ p f;
    final /* synthetic */ b.l n;

    r(b.l lVar, b.m mVar, String str, Bundle bundle, p pVar) {
        this.n = lVar;
        this.a = mVar;
        this.b = str;
        this.c = bundle;
        this.f = pVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (b.this.f.get(((b.n) this.a).a()) == null) {
            StringBuilder V0 = je.V0("sendCustomAction for callback that isn't registered action=");
            V0.append(this.b);
            V0.append(", extras=");
            V0.append(this.c);
            V0.toString();
            return;
        }
        b bVar = b.this;
        String str = this.b;
        Bundle bundle = this.c;
        e eVar = new e(bVar, str, this.f);
        bVar.d(eVar);
        if (!eVar.c()) {
            throw new IllegalStateException("onCustomAction must call detach() or sendResult() or sendError() before returning for action=" + str + " extras=" + bundle);
        }
    }
}
