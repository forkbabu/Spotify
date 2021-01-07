package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.u;
import com.google.android.material.button.MaterialButton;
import com.spotify.music.C0707R;

public final class MaterialCalendar<S> extends PickerFragment<S> {
    public static final /* synthetic */ int r0 = 0;
    private int h0;
    private d<S> i0;
    private a j0;
    private o k0;
    private CalendarSelector l0;
    private c m0;
    private RecyclerView n0;
    private RecyclerView o0;
    private View p0;
    private View q0;

    /* access modifiers changed from: package-private */
    public enum CalendarSelector {
        DAY,
        YEAR
    }

    /* access modifiers changed from: package-private */
    public class a implements Runnable {
        final /* synthetic */ int a;

        a(int i) {
            this.a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            MaterialCalendar.this.o0.N0(this.a);
        }
    }

    class b extends z3 {
        b(MaterialCalendar materialCalendar) {
        }

        @Override // defpackage.z3
        public void onInitializeAccessibilityNodeInfo(View view, d5 d5Var) {
            super.onInitializeAccessibilityNodeInfo(view, d5Var);
            d5Var.T(null);
        }
    }

    class c extends t {
        final /* synthetic */ int Q;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(Context context, int i, boolean z, int i2) {
            super(context, i, z);
            this.Q = i2;
        }

        /* access modifiers changed from: protected */
        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public void M1(RecyclerView.y yVar, int[] iArr) {
            if (this.Q == 0) {
                iArr[0] = MaterialCalendar.this.o0.getWidth();
                iArr[1] = MaterialCalendar.this.o0.getWidth();
                return;
            }
            iArr[0] = MaterialCalendar.this.o0.getHeight();
            iArr[1] = MaterialCalendar.this.o0.getHeight();
        }
    }

    class d implements e {
        d() {
        }
    }

    /* access modifiers changed from: package-private */
    public interface e {
    }

    private void W4(int i) {
        this.o0.post(new a(i));
    }

    @Override // androidx.fragment.app.Fragment
    public void N3(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.h0);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.i0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.j0);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.k0);
    }

    /* access modifiers changed from: package-private */
    public a R4() {
        return this.j0;
    }

    /* access modifiers changed from: package-private */
    public c S4() {
        return this.m0;
    }

    /* access modifiers changed from: package-private */
    public o T4() {
        return this.k0;
    }

    public d<S> U4() {
        return this.i0;
    }

    /* access modifiers changed from: package-private */
    public LinearLayoutManager V4() {
        return (LinearLayoutManager) this.o0.getLayoutManager();
    }

    /* access modifiers changed from: package-private */
    public void X4(o oVar) {
        r rVar = (r) this.o0.getAdapter();
        int b0 = rVar.b0(oVar);
        int b02 = b0 - rVar.b0(this.k0);
        boolean z = true;
        boolean z2 = Math.abs(b02) > 3;
        if (b02 <= 0) {
            z = false;
        }
        this.k0 = oVar;
        if (z2 && z) {
            this.o0.I0(b0 - 3);
            W4(b0);
        } else if (z2) {
            this.o0.I0(b0 + 3);
            W4(b0);
        } else {
            W4(b0);
        }
    }

    /* access modifiers changed from: package-private */
    public void Y4(CalendarSelector calendarSelector) {
        this.l0 = calendarSelector;
        if (calendarSelector == CalendarSelector.YEAR) {
            this.n0.getLayoutManager().v1(((x) this.n0.getAdapter()).Y(this.k0.f));
            this.p0.setVisibility(0);
            this.q0.setVisibility(8);
        } else if (calendarSelector == CalendarSelector.DAY) {
            this.p0.setVisibility(8);
            this.q0.setVisibility(0);
            X4(this.k0);
        }
    }

    /* access modifiers changed from: package-private */
    public void Z4() {
        CalendarSelector calendarSelector = CalendarSelector.DAY;
        CalendarSelector calendarSelector2 = this.l0;
        CalendarSelector calendarSelector3 = CalendarSelector.YEAR;
        if (calendarSelector2 == calendarSelector3) {
            Y4(calendarSelector);
        } else if (calendarSelector2 == calendarSelector) {
            Y4(calendarSelector3);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void s3(Bundle bundle) {
        super.s3(bundle);
        if (bundle == null) {
            bundle = D2();
        }
        this.h0 = bundle.getInt("THEME_RES_ID_KEY");
        this.i0 = (d) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.j0 = (a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.k0 = (o) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int i2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(F2(), this.h0);
        this.m0 = new c(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        o k = this.j0.k();
        if (MaterialDatePicker.k5(contextThemeWrapper)) {
            i2 = C0707R.layout.mtrl_calendar_vertical;
            i = 1;
        } else {
            i2 = C0707R.layout.mtrl_calendar_horizontal;
            i = 0;
        }
        View inflate = cloneInContext.inflate(i2, viewGroup, false);
        GridView gridView = (GridView) inflate.findViewById(C0707R.id.mtrl_calendar_days_of_week);
        q4.I(gridView, new b(this));
        gridView.setAdapter((ListAdapter) new f());
        gridView.setNumColumns(k.n);
        gridView.setEnabled(false);
        this.o0 = (RecyclerView) inflate.findViewById(C0707R.id.mtrl_calendar_months);
        this.o0.setLayoutManager(new c(F2(), i, false, i));
        this.o0.setTag("MONTHS_VIEW_GROUP_TAG");
        r rVar = new r(contextThemeWrapper, this.i0, this.j0, new d());
        this.o0.setAdapter(rVar);
        int integer = contextThemeWrapper.getResources().getInteger(C0707R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C0707R.id.mtrl_calendar_year_selector_frame);
        this.n0 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.n0.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.n0.setAdapter(new x(this));
            this.n0.k(new g(this), -1);
        }
        if (inflate.findViewById(C0707R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(C0707R.id.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            q4.I(materialButton, new h(this));
            MaterialButton materialButton2 = (MaterialButton) inflate.findViewById(C0707R.id.month_navigation_previous);
            materialButton2.setTag("NAVIGATION_PREV_TAG");
            MaterialButton materialButton3 = (MaterialButton) inflate.findViewById(C0707R.id.month_navigation_next);
            materialButton3.setTag("NAVIGATION_NEXT_TAG");
            this.p0 = inflate.findViewById(C0707R.id.mtrl_calendar_year_selector_frame);
            this.q0 = inflate.findViewById(C0707R.id.mtrl_calendar_day_selector_frame);
            Y4(CalendarSelector.DAY);
            materialButton.setText(this.k0.n());
            this.o0.n(new i(this, rVar, materialButton));
            materialButton.setOnClickListener(new j(this));
            materialButton3.setOnClickListener(new k(this, rVar));
            materialButton2.setOnClickListener(new l(this, rVar));
        }
        if (!MaterialDatePicker.k5(contextThemeWrapper)) {
            new u().a(this.o0);
        }
        this.o0.I0(rVar.b0(this.k0));
        return inflate;
    }
}
