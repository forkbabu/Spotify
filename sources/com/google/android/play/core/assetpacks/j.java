package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import com.google.android.play.core.internal.h0;
import com.google.android.play.core.tasks.m;
import java.util.List;

class j<T> extends h0 {
    final m<T> a;
    final /* synthetic */ o b;

    j(o oVar, m<T> mVar) {
        this.b = oVar;
        this.a = mVar;
    }

    j(o oVar, m mVar, byte[] bArr) {
        this.b = oVar;
        this.a = mVar;
    }

    @Override // com.google.android.play.core.internal.i0
    public void A(List<Bundle> list) {
        this.b.c.b();
        o.f.f("onGetSessionStates", new Object[0]);
    }

    @Override // com.google.android.play.core.internal.i0
    public final void D(int i) {
        this.b.c.b();
        o.f.f("onCancelDownload(%d)", Integer.valueOf(i));
    }

    @Override // com.google.android.play.core.internal.i0
    public void F0(Bundle bundle, Bundle bundle2) {
        this.b.c.b();
        o.f.f("onGetChunkFileDescriptor", new Object[0]);
    }

    @Override // com.google.android.play.core.internal.i0
    public final void R2(int i) {
        this.b.c.b();
        o.f.f("onGetSession(%d)", Integer.valueOf(i));
    }

    @Override // com.google.android.play.core.internal.i0
    public void T2(Bundle bundle, Bundle bundle2) {
        this.b.c.b();
        o.f.f("onRequestDownloadInfo()", new Object[0]);
    }

    @Override // com.google.android.play.core.internal.i0
    public void e() {
        this.b.c.b();
        o.f.f("onCancelDownloads()", new Object[0]);
    }

    @Override // com.google.android.play.core.internal.i0
    public void e3(int i, Bundle bundle) {
        this.b.c.b();
        o.f.f("onStartDownload(%d)", Integer.valueOf(i));
    }

    @Override // com.google.android.play.core.internal.i0
    public void f3(Bundle bundle) {
        this.b.c.b();
        o.f.f("onNotifySessionFailed(%d)", Integer.valueOf(bundle.getInt("session_id")));
    }

    @Override // com.google.android.play.core.internal.i0
    public void g2() {
        this.b.c.b();
        o.f.f("onRemoveModule()", new Object[0]);
    }

    @Override // com.google.android.play.core.internal.i0
    public void j(Bundle bundle) {
        this.b.c.b();
        int i = bundle.getInt("error_code");
        o.f.e("onError(%d)", Integer.valueOf(i));
        this.a.d(new AssetPackException(i));
    }

    @Override // com.google.android.play.core.internal.i0
    public void p0(Bundle bundle) {
        this.b.c.b();
        o.f.f("onNotifyModuleCompleted(%s, sessionId=%d)", bundle.getString("module_name"), Integer.valueOf(bundle.getInt("session_id")));
    }

    @Override // com.google.android.play.core.internal.i0
    public void t(Bundle bundle, Bundle bundle2) {
        this.b.d.b();
        o.f.f("onKeepAlive(%b)", Boolean.valueOf(bundle.getBoolean("keep_alive")));
    }

    @Override // com.google.android.play.core.internal.i0
    public void u(Bundle bundle) {
        this.b.c.b();
        o.f.f("onNotifyChunkTransferred(%s, %s, %d, session=%d)", bundle.getString("module_name"), bundle.getString("slice_id"), Integer.valueOf(bundle.getInt("chunk_number")), Integer.valueOf(bundle.getInt("session_id")));
    }

    j(o oVar, m mVar, char[] cArr) {
        this.b = oVar;
        this.a = mVar;
    }

    j(o oVar, m mVar, int[] iArr) {
        this.b = oVar;
        this.a = mVar;
    }
}
