package com.spotify.glue.dialogs;

import android.app.Dialog;
import android.content.Context;
import android.view.View;

/* access modifiers changed from: package-private */
public class j implements d {
    private final l a;
    private final c b;

    public j(Context context, int i, f fVar) {
        c cVar = new c(context, i, fVar.c());
        this.b = cVar;
        l lVar = new l(cVar);
        this.a = lVar;
        lVar.a(fVar);
        cVar.d(fVar.a, new b(this));
        cVar.b(fVar.b, new a(this));
    }

    @Override // com.spotify.glue.dialogs.d
    public void a() {
        this.a.e();
    }

    @Override // com.spotify.glue.dialogs.d
    public Dialog b() {
        return this.b;
    }

    public /* synthetic */ void c(View view) {
        this.a.d();
    }

    public /* synthetic */ void d(View view) {
        this.a.c();
    }

    @Override // com.spotify.glue.dialogs.d
    public void dismiss() {
        this.a.b();
    }
}
