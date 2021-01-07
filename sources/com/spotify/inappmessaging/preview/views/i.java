package com.spotify.inappmessaging.preview.views;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.Toast;
import com.google.common.base.MoreObjects;
import com.spotify.mobius.g;
import com.spotify.mobius.h;
import com.spotify.music.C0707R;

public class i extends FrameLayout implements g<hq0, gq0> {
    private ProgressBar a = ((ProgressBar) q4.G(this, C0707R.id.progress_circular));
    private Button b = ((Button) q4.G(this, C0707R.id.preview_button));
    private PreviewSubmissionView c = ((PreviewSubmissionView) q4.G(this, C0707R.id.in_app_messaging_preview_submission_view));

    /* access modifiers changed from: package-private */
    public class a implements h<hq0> {
        private eq0 a;
        final /* synthetic */ da2 b;

        a(da2 da2) {
            this.b = da2;
        }

        @Override // com.spotify.mobius.h, defpackage.da2
        public void accept(Object obj) {
            hq0 hq0 = (hq0) obj;
            if (!hq0.b().equals(this.a)) {
                hq0.b().a(new c(this), new d(this), new e(this));
                this.a = hq0.b();
            }
            if (!MoreObjects.isNullOrEmpty(hq0.c())) {
                Toast.makeText(i.this.getContext(), hq0.c(), 1).show();
                this.b.accept(gq0.b());
            }
        }

        @Override // com.spotify.mobius.h, defpackage.w92
        public void dispose() {
        }
    }

    public i(Context context) {
        super(context);
        FrameLayout.inflate(getContext(), C0707R.layout.preview_tool, this);
    }

    static void a(i iVar) {
        iVar.b.setVisibility(8);
        iVar.c.setVisibility(8);
        iVar.a.setVisibility(0);
        iVar.c.a();
    }

    static void b(i iVar) {
        iVar.a.setVisibility(8);
        iVar.b.setVisibility(8);
        iVar.c.setVisibility(0);
        iVar.c.c();
    }

    static void c(i iVar) {
        iVar.a.setVisibility(8);
        iVar.c.setVisibility(8);
        iVar.b.setVisibility(0);
        iVar.c.a();
    }

    public /* synthetic */ void d(da2 da2, View view) {
        da2.accept(gq0.h(this.c.getTriggerType(), this.c.getCreativeId()));
    }

    @Override // com.spotify.mobius.g
    public h<hq0> t(da2<gq0> da2) {
        this.b.setOnClickListener(new h(da2));
        this.c.setSubmitAction(new f(this, da2));
        this.c.setCancelAction(new g(da2));
        return new a(da2);
    }
}
