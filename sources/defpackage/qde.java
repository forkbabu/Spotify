package defpackage;

import com.spotify.mobius.e0;
import defpackage.iee;
import defpackage.lee;

/* renamed from: qde  reason: default package */
public final /* synthetic */ class qde implements ti0 {
    public final /* synthetic */ kee a;

    public /* synthetic */ qde(kee kee) {
        this.a = kee;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        kee kee = this.a;
        lee y = ((iee.b) obj).y();
        if (y instanceof lee.a) {
            return (e0) ((lee.a) y).a().map(new dce(kee), new jde(kee), new ice(kee));
        }
        if (y instanceof lee.c) {
            return (e0) ((lee.c) y).a().map(new tce(kee), new cde(kee), new zce(kee));
        }
        if (y instanceof lee.b) {
            return (e0) ((lee.b) y).a().map(new fce(kee), new sde(kee));
        }
        throw new IllegalStateException("Unhandled Signup Status Type");
    }
}
