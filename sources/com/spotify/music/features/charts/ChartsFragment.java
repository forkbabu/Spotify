package com.spotify.music.features.charts;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.music.C0707R;
import com.spotify.music.libs.viewuri.c;
import dagger.android.support.a;
import kotlin.jvm.internal.h;

public final class ChartsFragment extends Fragment implements s, c.a, ToolbarConfig.d {
    public ChartsPresenter g0;
    public i h0;

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        h.e(context, "context");
        String string = k4().getString("title");
        if (string == null) {
            string = "";
        }
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        String string2 = context.getString(C0707R.string.charts_title_charts);
        h.d(string2, "context.getString(R.string.charts_title_charts)");
        return string2;
    }

    @Override // androidx.fragment.app.Fragment
    public void N3(Bundle bundle) {
        h.e(bundle, "outState");
        i iVar = this.h0;
        if (iVar != null) {
            iVar.c(bundle);
        } else {
            h.k("viewBinder");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void O3() {
        super.O3();
        ChartsPresenter chartsPresenter = this.g0;
        if (chartsPresenter != null) {
            i iVar = this.h0;
            if (iVar != null) {
                chartsPresenter.a(iVar);
            } else {
                h.k("viewBinder");
                throw null;
            }
        } else {
            h.k("presenter");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void P3() {
        super.P3();
        ChartsPresenter chartsPresenter = this.g0;
        if (chartsPresenter != null) {
            chartsPresenter.b();
        } else {
            h.k("presenter");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void R3(Bundle bundle) {
        super.R3(bundle);
        i iVar = this.h0;
        if (iVar != null) {
            iVar.d(bundle);
        } else {
            h.k("viewBinder");
            throw null;
        }
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public Fragment e() {
        return this;
    }

    @Override // com.spotify.music.libs.viewuri.c.a
    public c getViewUri() {
        Parcelable parcelable = k4().getParcelable("uri");
        if (parcelable != null) {
            return (c) parcelable;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String i0() {
        String cVar = getViewUri().toString();
        h.d(cVar, "viewUri.toString()");
        return cVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        h.e(context, "context");
        a.a(this);
        super.p3(context);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0079  */
    @Override // defpackage.ij9.b
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.ij9 u0() {
        /*
            r2 = this;
            com.spotify.music.libs.viewuri.c r0 = r2.getViewUri()
            java.lang.String r0 = r0.toString()
            com.spotify.mobile.android.util.l0 r0 = com.spotify.mobile.android.util.l0.z(r0)
            java.lang.String r1 = "link"
            kotlin.jvm.internal.h.d(r0, r1)
            com.spotify.mobile.android.util.LinkType r1 = r0.q()
            if (r1 != 0) goto L_0x0018
            goto L_0x0067
        L_0x0018:
            int r1 = r1.ordinal()
            switch(r1) {
                case 47: goto L_0x0064;
                case 48: goto L_0x0061;
                case 49: goto L_0x005e;
                case 50: goto L_0x0020;
                default: goto L_0x001f;
            }
        L_0x001f:
            goto L_0x0067
        L_0x0020:
            java.lang.String r0 = r0.k()
            if (r0 != 0) goto L_0x0027
            goto L_0x005b
        L_0x0027:
            int r1 = r0.hashCode()
            switch(r1) {
                case -1415163932: goto L_0x0050;
                case -791707519: goto L_0x0045;
                case -690338273: goto L_0x003a;
                case 112216202: goto L_0x002f;
                default: goto L_0x002e;
            }
        L_0x002e:
            goto L_0x005b
        L_0x002f:
            java.lang.String r1 = "viral"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x005b
            com.spotify.instrumentation.PageIdentifiers r0 = com.spotify.instrumentation.PageIdentifiers.CHARTS_VIRAL
            goto L_0x0069
        L_0x003a:
            java.lang.String r1 = "regional"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x005b
            com.spotify.instrumentation.PageIdentifiers r0 = com.spotify.instrumentation.PageIdentifiers.CHARTS_REGIONAL
            goto L_0x0069
        L_0x0045:
            java.lang.String r1 = "weekly"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x005b
            com.spotify.instrumentation.PageIdentifiers r0 = com.spotify.instrumentation.PageIdentifiers.CHARTS_WEEKLY
            goto L_0x0069
        L_0x0050:
            java.lang.String r1 = "albums"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x005b
            com.spotify.instrumentation.PageIdentifiers r0 = com.spotify.instrumentation.PageIdentifiers.CHARTS_ALBUMS
            goto L_0x0069
        L_0x005b:
            com.spotify.instrumentation.PageIdentifiers r0 = com.spotify.instrumentation.PageIdentifiers.CHARTS_UNKNOWN
            goto L_0x0069
        L_0x005e:
            com.spotify.instrumentation.PageIdentifiers r0 = com.spotify.instrumentation.PageIdentifiers.CHARTS_CHART
            goto L_0x0069
        L_0x0061:
            com.spotify.instrumentation.PageIdentifiers r0 = com.spotify.instrumentation.PageIdentifiers.CHARTS
            goto L_0x0069
        L_0x0064:
            com.spotify.instrumentation.PageIdentifiers r0 = com.spotify.instrumentation.PageIdentifiers.CHARTS_ALBUM
            goto L_0x0069
        L_0x0067:
            com.spotify.instrumentation.PageIdentifiers r0 = com.spotify.instrumentation.PageIdentifiers.UNKNOWN
        L_0x0069:
            com.spotify.instrumentation.PageIdentifiers r1 = com.spotify.instrumentation.PageIdentifiers.UNKNOWN
            if (r0 != r1) goto L_0x0079
            java.lang.String r0 = "ChartsFragment"
            ij9 r0 = defpackage.ij9.d(r0)
            java.lang.String r1 = "PageViewObservable.creat…covered(\"ChartsFragment\")"
            kotlin.jvm.internal.h.d(r0, r1)
            return r0
        L_0x0079:
            r1 = 0
            ij9 r0 = defpackage.ij9.b(r0, r1)
            java.lang.String r1 = "PageViewObservable.create(identifier)"
            kotlin.jvm.internal.h.d(r0, r1)
            return r0
            switch-data {47->0x0064, 48->0x0061, 49->0x005e, 50->0x0020, }
            switch-data {-1415163932->0x0050, -791707519->0x0045, -690338273->0x003a, 112216202->0x002f, }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.features.charts.ChartsFragment.u0():ij9");
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.e(layoutInflater, "inflater");
        i iVar = this.h0;
        if (iVar != null) {
            return iVar.b();
        }
        h.k("viewBinder");
        throw null;
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        boolean z = k4().getBoolean("is_root");
        boolean z2 = k4().getBoolean("is_album_chart");
        if (z) {
            ifd ifd = kfd.t;
            h.d(ifd, "FeatureIdentifiers.CHARTS_OVERVIEW");
            return ifd;
        } else if (z2) {
            ifd ifd2 = kfd.s;
            h.d(ifd2, "FeatureIdentifiers.CHARTS_ALBUM");
            return ifd2;
        } else {
            ifd ifd3 = kfd.r;
            h.d(ifd3, "FeatureIdentifiers.CHARTS_BLOCK");
            return ifd3;
        }
    }
}
