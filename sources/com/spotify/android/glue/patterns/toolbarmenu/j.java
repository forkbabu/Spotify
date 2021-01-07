package com.spotify.android.glue.patterns.toolbarmenu;

import com.spotify.mobile.android.shortcut.ShortcutInstallerService;
import com.spotify.music.libs.viewuri.c;

public final /* synthetic */ class j implements Runnable {
    public final /* synthetic */ a0 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String f;
    public final /* synthetic */ c n;
    public final /* synthetic */ w o;

    public /* synthetic */ j(a0 a0Var, String str, String str2, String str3, c cVar, w wVar) {
        this.a = a0Var;
        this.b = str;
        this.c = str2;
        this.f = str3;
        this.n = cVar;
        this.o = wVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a0 a0Var = this.a;
        String str = this.b;
        String str2 = this.c;
        String str3 = this.f;
        c cVar = this.n;
        w wVar = this.o;
        ShortcutInstallerService.a(((u) a0Var).getContext(), str, str2, str3, cVar);
        wVar.a();
    }
}
