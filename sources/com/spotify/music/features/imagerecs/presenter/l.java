package com.spotify.music.features.imagerecs.presenter;

import android.app.Activity;
import android.content.Intent;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.t;
import com.spotify.music.C0707R;
import com.spotify.music.features.imagerecs.model.ImageRecsEntity;
import com.spotify.music.features.imagerecs.model.UserIntention;
import com.spotify.music.features.imagerecs.view.ImageRecsActivity;
import defpackage.zwd;
import io.reactivex.disposables.a;
import io.reactivex.y;
import io.reactivex.z;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class l implements k {
    private final t a;
    private final yl5 b;
    private final o c;
    private final File d;
    private final tl5 e;
    private final vl5 f;
    private final ul5 g;
    private final y h;
    private final y i;
    private final a j = new a();
    private byte[] k;
    private UserIntention l = UserIntention.NO_ONGOING;
    private ImageRecsActivity m;

    public l(ul5 ul5, t tVar, yl5 yl5, o oVar, vl5 vl5, y yVar, y yVar2, File file, tl5 tl5) {
        this.g = ul5;
        this.a = tVar;
        this.b = yl5;
        this.c = oVar;
        this.f = vl5;
        this.h = yVar;
        this.i = yVar2;
        this.d = file;
        this.e = tl5;
    }

    private void a(Activity activity) {
        this.e.a(1, "pick-image");
        Intent intent = new Intent("android.intent.action.PICK");
        intent.setType("image/jpg");
        activity.startActivityForResult(intent, 2);
    }

    private void b(Activity activity) {
        this.e.a(0, "take-image");
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        intent.setFlags(3);
        intent.putExtra("output", this.b.a(this.d, this.a, "fileprovider"));
        activity.startActivityForResult(intent, 1);
    }

    private void c() {
        a aVar = this.j;
        z<R> s = this.c.a().s(new c(this));
        o oVar = this.c;
        oVar.getClass();
        z<R> s2 = s.s(new h(oVar));
        vl5 vl5 = this.f;
        vl5.getClass();
        aVar.b(s2.s(new i(vl5)).H(this.i).B(this.h).subscribe(new a(this), new d(this)));
    }

    public static z d(l lVar, ImageRecsEntity imageRecsEntity) {
        o oVar = lVar.c;
        String url = imageRecsEntity.getUrl();
        byte[] bArr = lVar.k;
        oVar.getClass();
        return z.g(new f(oVar, bArr, url)).I(5, TimeUnit.SECONDS).A(new b(imageRecsEntity));
    }

    public void e(zwd zwd) {
        zwd.getClass();
        if (zwd instanceof zwd.b) {
            File file = this.d;
            if (file != null && file.exists()) {
                Logger.l("File deletion result was: %b", Boolean.valueOf(this.d.delete()));
            }
            this.e.a(2, "image-recs-success");
            this.j.f();
            this.m.finish();
            return;
        }
        this.j.f();
        this.m.W0(C0707R.string.onboarding_error_message_no_track);
    }

    public void f(Throwable th) {
        Logger.l("Image Upload failed: %s", th.getLocalizedMessage());
        this.j.f();
        this.m.W0(C0707R.string.onboarding_error_message);
    }

    public void g(int i2, int i3, Intent intent) {
        if ((i2 == 1 || i2 == 2) && i3 == -1) {
            this.m.X0();
            if (i2 == 1) {
                try {
                    File file = this.d;
                    this.k = file != null ? sl5.e(file) : new byte[0];
                } catch (IOException e2) {
                    Logger.l("scaling image failed %s", e2.getLocalizedMessage());
                    return;
                }
            } else {
                this.k = sl5.d(intent.getData(), this.d, this.m);
            }
            c();
        }
    }

    public void h(Intent intent) {
        int ordinal = this.l.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                Assertion.g("Whoops!");
            } else if (!this.g.b("android.permission.READ_EXTERNAL_STORAGE")) {
                a(this.m);
            } else {
                this.m.a1();
            }
        } else if (!this.g.b("android.permission.CAMERA")) {
            b(this.m);
        } else {
            this.m.U0();
        }
    }

    public void i() {
        if (this.j.h() == 0) {
            this.m.V0();
        }
    }

    public void j() {
        this.j.f();
    }

    public void k(ImageRecsActivity imageRecsActivity) {
        this.m = imageRecsActivity;
    }

    public void l() {
        this.m = null;
    }

    public void m() {
        this.l = UserIntention.PICK_PICTURE;
        if (this.g.b("android.permission.READ_EXTERNAL_STORAGE")) {
            this.g.a("android.permission.READ_EXTERNAL_STORAGE");
        } else {
            a(this.m);
        }
    }

    public void n() {
        this.l = UserIntention.TAKE_PICTURE;
        if (this.g.b("android.permission.CAMERA")) {
            this.g.a("android.permission.CAMERA");
        } else {
            b(this.m);
        }
    }
}
