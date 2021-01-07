package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.util.f0;
import com.google.android.exoplayer2.util.g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class p implements k {
    private final Context a;
    private final List<a0> b = new ArrayList();
    private final k c;
    private k d;
    private k e;
    private k f;
    private k g;
    private k h;
    private k i;
    private k j;
    private k k;

    public p(Context context, k kVar) {
        this.a = context.getApplicationContext();
        kVar.getClass();
        this.c = kVar;
    }

    private void d(k kVar) {
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            kVar.b(this.b.get(i2));
        }
    }

    @Override // com.google.android.exoplayer2.upstream.k
    public long a(m mVar) {
        boolean z = true;
        g.m(this.k == null);
        String scheme = mVar.a.getScheme();
        Uri uri = mVar.a;
        int i2 = f0.a;
        String scheme2 = uri.getScheme();
        if (!TextUtils.isEmpty(scheme2) && !"file".equals(scheme2)) {
            z = false;
        }
        if (z) {
            String path = mVar.a.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.d == null) {
                    FileDataSource fileDataSource = new FileDataSource();
                    this.d = fileDataSource;
                    d(fileDataSource);
                }
                this.k = this.d;
            } else {
                if (this.e == null) {
                    AssetDataSource assetDataSource = new AssetDataSource(this.a);
                    this.e = assetDataSource;
                    d(assetDataSource);
                }
                this.k = this.e;
            }
        } else if ("asset".equals(scheme)) {
            if (this.e == null) {
                AssetDataSource assetDataSource2 = new AssetDataSource(this.a);
                this.e = assetDataSource2;
                d(assetDataSource2);
            }
            this.k = this.e;
        } else if ("content".equals(scheme)) {
            if (this.f == null) {
                ContentDataSource contentDataSource = new ContentDataSource(this.a);
                this.f = contentDataSource;
                d(contentDataSource);
            }
            this.k = this.f;
        } else if ("rtmp".equals(scheme)) {
            if (this.g == null) {
                try {
                    k kVar = (k) Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                    this.g = kVar;
                    d(kVar);
                } catch (ClassNotFoundException unused) {
                } catch (Exception e2) {
                    throw new RuntimeException("Error instantiating RTMP extension", e2);
                }
                if (this.g == null) {
                    this.g = this.c;
                }
            }
            this.k = this.g;
        } else if ("udp".equals(scheme)) {
            if (this.h == null) {
                UdpDataSource udpDataSource = new UdpDataSource();
                this.h = udpDataSource;
                d(udpDataSource);
            }
            this.k = this.h;
        } else if ("data".equals(scheme)) {
            if (this.i == null) {
                h hVar = new h();
                this.i = hVar;
                d(hVar);
            }
            this.k = this.i;
        } else if ("rawresource".equals(scheme)) {
            if (this.j == null) {
                RawResourceDataSource rawResourceDataSource = new RawResourceDataSource(this.a);
                this.j = rawResourceDataSource;
                d(rawResourceDataSource);
            }
            this.k = this.j;
        } else {
            this.k = this.c;
        }
        return this.k.a(mVar);
    }

    @Override // com.google.android.exoplayer2.upstream.k
    public void b(a0 a0Var) {
        this.c.b(a0Var);
        this.b.add(a0Var);
        k kVar = this.d;
        if (kVar != null) {
            kVar.b(a0Var);
        }
        k kVar2 = this.e;
        if (kVar2 != null) {
            kVar2.b(a0Var);
        }
        k kVar3 = this.f;
        if (kVar3 != null) {
            kVar3.b(a0Var);
        }
        k kVar4 = this.g;
        if (kVar4 != null) {
            kVar4.b(a0Var);
        }
        k kVar5 = this.h;
        if (kVar5 != null) {
            kVar5.b(a0Var);
        }
        k kVar6 = this.i;
        if (kVar6 != null) {
            kVar6.b(a0Var);
        }
        k kVar7 = this.j;
        if (kVar7 != null) {
            kVar7.b(a0Var);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.k
    public Map<String, List<String>> c() {
        k kVar = this.k;
        return kVar == null ? Collections.emptyMap() : kVar.c();
    }

    @Override // com.google.android.exoplayer2.upstream.k
    public void close() {
        k kVar = this.k;
        if (kVar != null) {
            try {
                kVar.close();
            } finally {
                this.k = null;
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.k
    public Uri getUri() {
        k kVar = this.k;
        if (kVar == null) {
            return null;
        }
        return kVar.getUri();
    }

    @Override // com.google.android.exoplayer2.upstream.k
    public int read(byte[] bArr, int i2, int i3) {
        k kVar = this.k;
        kVar.getClass();
        return kVar.read(bArr, i2, i3);
    }
}
