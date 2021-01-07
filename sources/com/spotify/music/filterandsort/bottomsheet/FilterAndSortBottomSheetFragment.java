package com.spotify.music.filterandsort.bottomsheet;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.widget.c;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.spotify.base.java.logging.Logger;
import com.spotify.encore.foundation.R;
import com.spotify.music.C0707R;
import defpackage.di9;
import defpackage.mi9;
import defpackage.ni9;
import java.util.List;

public class FilterAndSortBottomSheetFragment extends BottomSheetDialogFragment implements e {
    private a A0;
    pi9 B0;
    private twd v0;
    private ni9 w0;
    private ni9.b x0;
    private mi9 y0;
    private mi9.b z0;

    public interface a {
        void J(ane ane, int i);

        void X0(di9.b bVar, int i);

        void c0();
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog R4(Bundle bundle) {
        Dialog R4 = super.R4(bundle);
        R4.setOnShowListener(new c(this, R4));
        return R4;
    }

    public void b5(di9.b bVar, int i) {
        a aVar = this.A0;
        if (aVar == null) {
            Logger.b("No interaction listener available for filter and sorting no information sent to calling component", new Object[0]);
        } else {
            aVar.X0(bVar, i);
        }
        M4();
    }

    public void c5(ane ane, int i) {
        a aVar = this.A0;
        if (aVar == null) {
            Logger.b("No interaction listener available for filter and sorting no information sent to calling component", new Object[0]);
        } else {
            aVar.J(ane, i);
        }
        M4();
    }

    public void d5(a aVar) {
        this.A0 = aVar;
    }

    public void e5(List<di9.b> list) {
        this.y0.Y(list);
        this.v0.l0(2, 1);
    }

    public void f5(List<ni9.c> list) {
        this.w0.Y(list);
        this.v0.l0(0, 1);
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        a aVar = this.A0;
        if (aVar != null) {
            aVar.c0();
        }
        this.A0 = null;
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void p3(Context context) {
        dagger.android.support.a.a(this);
        super.p3(context);
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = layoutInflater.getContext();
        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(C0707R.layout.fragment_sort_and_filter_bottom_sheet, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) frameLayout.findViewById(C0707R.id.recycler_view);
        this.v0 = new twd(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.setAdapter(this.v0);
        ia0 d = e90.e().d(context, null);
        String V2 = V2(C0707R.string.filter_title);
        Bundle D2 = D2();
        if (D2 != null) {
            V2 = D2.getString("BottomSheetDialogFragment.filterTitle", V2);
        }
        d.setTitle(V2);
        TextView titleView = d.getTitleView();
        int i = R.style.TextAppearance_Encore_MestoBold;
        c.n(titleView, i);
        Resources resources = context.getResources();
        int i2 = R.color.gray_70;
        titleView.setTextColor(resources.getColor(i2));
        this.v0.Z(new v02(d.getView(), true), 2);
        a aVar = new a(this);
        this.z0 = aVar;
        mi9 mi9 = new mi9(aVar);
        this.y0 = mi9;
        this.v0.Z(mi9, 3);
        ia0 d2 = e90.e().d(context, null);
        String V22 = V2(C0707R.string.sort_by_title);
        Bundle D22 = D2();
        if (D22 != null) {
            V22 = D22.getString("BottomSheetDialogFragment.sortTitle", V22);
        }
        d2.setTitle(V22);
        TextView titleView2 = d2.getTitleView();
        c.n(titleView2, i);
        titleView2.setTextColor(context.getResources().getColor(i2));
        this.v0.Z(new v02(d2.getView(), true), 0);
        b bVar = new b(this);
        this.x0 = bVar;
        ni9 ni9 = new ni9(bVar);
        this.w0 = ni9;
        this.v0.Z(ni9, 1);
        this.v0.i0(0, 1, 2);
        Bundle D23 = D2();
        if (D23 != null) {
            di9 di9 = (di9) D23.getParcelable("BottomSheetDialogFragment.filterAndSortConfiguration");
            ane ane = (ane) D23.getParcelable("BottomSheetDialogFragment.activeSortOrder");
            if (di9 != null) {
                this.B0.d(di9, ane);
            }
        }
        return frameLayout;
    }
}
