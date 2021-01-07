package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import androidx.annotation.RecentlyNonNull;
import com.google.android.exoplayer2.util.g;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.internal.p0;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.f;
import com.google.android.gms.common.internal.k0;

/* renamed from: yu  reason: default package */
public class yu extends f<fv> implements qv {
    private final boolean L;
    private final c M;
    private final Bundle N;
    private final Integer O;

    public yu(@RecentlyNonNull Context context, @RecentlyNonNull Looper looper, boolean z, @RecentlyNonNull c cVar, @RecentlyNonNull Bundle bundle, @RecentlyNonNull c.a aVar, @RecentlyNonNull c.b bVar) {
        super(context, looper, 44, cVar, aVar, bVar);
        this.L = z;
        this.M = cVar;
        this.N = bundle;
        this.O = cVar.k();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.b
    @RecentlyNonNull
    public String A() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.b
    @RecentlyNonNull
    public String B() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // com.google.android.gms.common.internal.b, com.google.android.gms.common.api.a.f
    public boolean f() {
        return this.L;
    }

    @Override // defpackage.qv
    public final void g() {
        c(new b.d());
    }

    @Override // com.google.android.gms.common.internal.b, com.google.android.gms.common.api.a.f
    public int l() {
        return 12451000;
    }

    @Override // defpackage.qv
    public final void o(dv dvVar) {
        g.k(dvVar, "Expecting a valid ISignInCallbacks");
        try {
            Account c = this.M.c();
            GoogleSignInAccount googleSignInAccount = null;
            if ("<<default account>>".equals(c.name)) {
                googleSignInAccount = com.google.android.gms.auth.api.signin.internal.c.b(v()).c();
            }
            Integer num = this.O;
            g.l(num);
            ((fv) z()).w1(new iv(new k0(c, num.intValue(), googleSignInAccount)), dvVar);
        } catch (RemoteException unused) {
            try {
                ((p0) dvVar).G3(new jv());
            } catch (RemoteException unused2) {
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.b
    @RecentlyNonNull
    public /* synthetic */ IInterface q(@RecentlyNonNull IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        if (queryLocalInterface instanceof fv) {
            return (fv) queryLocalInterface;
        }
        return new ev(iBinder);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.b
    @RecentlyNonNull
    public Bundle w() {
        if (!v().getPackageName().equals(this.M.f())) {
            this.N.putString("com.google.android.gms.signin.internal.realClientPackageName", this.M.f());
        }
        return this.N;
    }
}
