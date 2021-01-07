package defpackage;

import com.spotify.music.C0707R;
import com.spotify.music.libs.ageverification.AgeVerificationDialogViewModel;
import com.spotify.music.libs.ageverification.j;
import com.spotify.music.libs.ageverification.k;
import com.spotify.music.libs.ageverification.l;
import com.spotify.music.libs.ageverification.m;
import com.spotify.music.libs.ageverification.model.AgeVerificationDialogModel;
import com.spotify.music.libs.debugtools.flags.DebugFlag;
import com.spotify.music.navigation.t;
import com.spotify.music.slate.model.u;
import com.squareup.picasso.Picasso;
import io.reactivex.disposables.a;
import io.reactivex.y;

/* renamed from: ty9  reason: default package */
public class ty9 implements j {
    protected final a a = new a();
    private final qy9 b;
    private final y c;
    private final t d;
    private final Picasso e;
    private final m f;
    protected AgeVerificationDialogViewModel g;
    private k h;
    private l i;

    public ty9(qy9 qy9, y yVar, t tVar, Picasso picasso, m mVar) {
        this.b = qy9;
        this.c = yVar;
        this.d = tVar;
        this.e = picasso;
        this.f = mVar;
    }

    public static void c(ty9 ty9, AgeVerificationDialogModel ageVerificationDialogModel) {
        if (ty9.g.i() == AgeVerificationDialogViewModel.State.RETRYING) {
            ty9.d.d(ageVerificationDialogModel.getProviderURL());
            l lVar = ty9.i;
            lVar.getClass();
            lVar.w();
            return;
        }
        AgeVerificationDialogViewModel.a k = ty9.g.k();
        k.j(AgeVerificationDialogViewModel.State.LOADED);
        k.a(ageVerificationDialogModel.getColor());
        k.g(u.b(C0707R.string.age_verification_dialog_verify_button));
        k.e(u.b(C0707R.string.age_verification_dialog_cancel_button));
        k.h(ageVerificationDialogModel.getProviderURL());
        k.i(false);
        ty9.g = k.c();
        k kVar = ty9.h;
        kVar.getClass();
        kVar.a(ty9.g);
    }

    /* access modifiers changed from: protected */
    public void a(String str) {
        a aVar = this.a;
        qy9 qy9 = this.b;
        DebugFlag debugFlag = DebugFlag.AGE_VERIFICATION_STAGING;
        aVar.b(qy9.a(str, false).B(this.c).subscribe(new sy9(this), new ry9(this)));
    }

    public void b(Throwable th) {
        AgeVerificationDialogViewModel.a k = this.g.k();
        k.j(AgeVerificationDialogViewModel.State.FAILED);
        k.b(u.b(C0707R.string.age_verification_dialog_connectivity_error_description));
        k.g(u.b(C0707R.string.age_verification_dialog_try_again_button));
        k.e(u.b(C0707R.string.age_verification_dialog_cancel_button));
        k.i(false);
        this.g = k.c();
        k kVar = this.h;
        kVar.getClass();
        kVar.a(this.g);
        this.f.a(this.g.e());
    }

    public void d() {
        this.a.dispose();
    }

    public void e() {
        if (this.g.i() == AgeVerificationDialogViewModel.State.FAILED) {
            this.f.h(this.g.e());
        } else {
            this.f.f(this.g.e());
        }
        l lVar = this.i;
        lVar.getClass();
        lVar.h();
    }

    public void f() {
        if (this.g.i() == AgeVerificationDialogViewModel.State.FAILED) {
            this.f.g(this.g.e());
        } else {
            this.f.e(this.g.e());
        }
        l lVar = this.i;
        lVar.getClass();
        lVar.h();
    }

    public void g() {
        if (this.g.i() == AgeVerificationDialogViewModel.State.FAILED) {
            AgeVerificationDialogViewModel.a k = this.g.k();
            k.j(AgeVerificationDialogViewModel.State.RETRYING);
            k.b(u.b(C0707R.string.age_verification_dialog_connectivity_error_description));
            k.g(u.c(""));
            k.e(u.b(C0707R.string.age_verification_dialog_cancel_button));
            k.i(true);
            this.g = k.c();
            k kVar = this.h;
            kVar.getClass();
            kVar.a(this.g);
            this.f.d(this.g.e());
            a(this.g.e());
        } else if (this.g.i() == AgeVerificationDialogViewModel.State.LOADED) {
            this.f.c(this.g.e());
            String g2 = this.g.g();
            g2.getClass();
            this.d.d(g2);
            l lVar = this.i;
            lVar.getClass();
            lVar.w();
        }
    }

    public void h(k kVar, l lVar, String str, String str2, int i2) {
        this.i = lVar;
        AgeVerificationDialogViewModel.State state = AgeVerificationDialogViewModel.State.INITIAL;
        AgeVerificationDialogViewModel.a aVar = new AgeVerificationDialogViewModel.a(state, "", null, 0, null, null, null, null, null, false);
        aVar.j(state);
        aVar.f(str);
        aVar.d(str2);
        aVar.a(i2);
        aVar.k(u.b(C0707R.string.age_verification_dialog_title));
        aVar.b(u.b(C0707R.string.age_verification_dialog_description));
        aVar.g(u.c(""));
        aVar.i(true);
        AgeVerificationDialogViewModel c2 = aVar.c();
        this.g = c2;
        this.h = kVar;
        ((bz9) kVar).c(this, new zy9(c2, this.e));
        this.f.b(str);
        a(this.g.e());
    }
}
