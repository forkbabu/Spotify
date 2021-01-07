package com.spotify.music.features.employeepodcasts.view;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.ui.fragments.r;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.music.C0707R;
import dagger.android.support.a;
import kotlin.jvm.internal.h;

public final class EmployeePodcastsFragment extends Fragment implements s {
    public c g0;
    public e h0;

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        h.e(context, "context");
        String string = context.getString(C0707R.string.employee_podcasts_settings_title);
        h.d(string, "context.getString(R.stri…_podcasts_settings_title)");
        return string;
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public /* synthetic */ Fragment e() {
        return r.a(this);
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String i0() {
        return "employee-podcasts";
    }

    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        h.e(context, "context");
        a.a(this);
        super.p3(context);
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.DEBUG, null);
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.e(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(C0707R.layout.fragment_employee_podcasts_settings, viewGroup, false);
        e eVar = this.h0;
        if (eVar != null) {
            eVar.getClass();
            if (inflate != null) {
                a aVar = new a(inflate);
                c cVar = this.g0;
                if (cVar != null) {
                    cVar.b(aVar).d();
                    h.d(inflate, "rootView");
                    return inflate;
                }
                h.k("employeePodcastsPresenterFactory");
                throw null;
            }
            throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", 1));
        }
        h.k("employeePodcastsViewBinderFactory");
        throw null;
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        return kfd.V;
    }
}
