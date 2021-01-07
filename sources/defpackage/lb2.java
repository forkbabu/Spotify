package defpackage;

import android.content.Intent;

/* renamed from: lb2  reason: default package */
class lb2 implements fb2 {
    private final vla a;
    private s3<Boolean> b = qa2.a;

    lb2(vla vla) {
        this.a = vla;
    }

    @Override // defpackage.fb2
    public void a(s3<Boolean> s3Var) {
        this.b = s3Var;
    }

    @Override // defpackage.fb2
    public void b(Intent intent) {
        if ("com.google.android.apps.maps.NAVIGATING".equals(intent.getStringExtra("com.spotify.music.external.banner.MAPS"))) {
            this.b.accept(Boolean.TRUE);
            this.a.c("google_maps");
        }
    }

    @Override // defpackage.fb2
    public void onStop() {
    }
}
