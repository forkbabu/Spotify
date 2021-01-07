package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.homething.settings.view.HomethingSettingsFragment;
import defpackage.pt9;
import io.reactivex.functions.g;

/* renamed from: gt9  reason: default package */
public final /* synthetic */ class gt9 implements g {
    public final /* synthetic */ pt9.a a;

    public /* synthetic */ gt9(pt9.a aVar) {
        this.a = aVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        pt9.a aVar = this.a;
        aVar.getClass();
        Logger.e((Throwable) obj, "Failed to delete device", new Object[0]);
        ((HomethingSettingsFragment) pt9.this.g).P4();
    }
}
