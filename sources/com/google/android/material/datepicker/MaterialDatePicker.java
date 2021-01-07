package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.x;
import com.google.android.material.datepicker.a;
import com.google.android.material.internal.CheckableImageButton;
import com.spotify.music.C0707R;
import java.util.Iterator;
import java.util.LinkedHashSet;

public final class MaterialDatePicker<S> extends DialogFragment {
    public static final /* synthetic */ int L0 = 0;
    private PickerFragment<S> A0;
    private a B0;
    private MaterialCalendar<S> C0;
    private int D0;
    private CharSequence E0;
    private boolean F0;
    private int G0;
    private TextView H0;
    private CheckableImageButton I0;
    private yx J0;
    private Button K0;
    private final LinkedHashSet<n<? super S>> u0 = new LinkedHashSet<>();
    private final LinkedHashSet<View.OnClickListener> v0 = new LinkedHashSet<>();
    private final LinkedHashSet<DialogInterface.OnCancelListener> w0 = new LinkedHashSet<>();
    private final LinkedHashSet<DialogInterface.OnDismissListener> x0 = new LinkedHashSet<>();
    private int y0;
    private d<S> z0;

    class a implements View.OnClickListener {
        a() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: com.google.android.material.datepicker.n */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = MaterialDatePicker.this.u0.iterator();
            while (it.hasNext()) {
                ((n) it.next()).a(MaterialDatePicker.this.j5());
            }
            MaterialDatePicker.this.M4();
        }
    }

    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = MaterialDatePicker.this.v0.iterator();
            while (it.hasNext()) {
                ((View.OnClickListener) it.next()).onClick(view);
            }
            MaterialDatePicker.this.M4();
        }
    }

    /* access modifiers changed from: package-private */
    public class c extends s<S> {
        c() {
        }

        @Override // com.google.android.material.datepicker.s
        public void a(S s) {
            MaterialDatePicker.this.m5();
            MaterialDatePicker.this.K0.setEnabled(MaterialDatePicker.this.z0.P1());
        }
    }

    private static int i5(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(C0707R.dimen.mtrl_calendar_content_padding);
        int i = o.k().n;
        int dimensionPixelSize = resources.getDimensionPixelSize(C0707R.dimen.mtrl_calendar_day_width) * i;
        return ((i - 1) * resources.getDimensionPixelOffset(C0707R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    static boolean k5(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(rw.t(context, C0707R.attr.materialCalendarStyle, MaterialCalendar.class.getCanonicalName()), new int[]{16843277});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }

    /* access modifiers changed from: private */
    public void l5() {
        PickerFragment<S> pickerFragment;
        d<S> dVar = this.z0;
        Context l4 = l4();
        int i = this.y0;
        if (i == 0) {
            i = this.z0.q0(l4);
        }
        a aVar = this.B0;
        MaterialCalendar<S> materialCalendar = new MaterialCalendar<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i);
        bundle.putParcelable("GRID_SELECTOR_KEY", dVar);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        bundle.putParcelable("CURRENT_MONTH_KEY", aVar.j());
        materialCalendar.r4(bundle);
        this.C0 = materialCalendar;
        if (this.I0.isChecked()) {
            d<S> dVar2 = this.z0;
            a aVar2 = this.B0;
            pickerFragment = new MaterialTextInputPicker<>();
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("DATE_SELECTOR_KEY", dVar2);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar2);
            pickerFragment.r4(bundle2);
        } else {
            pickerFragment = this.C0;
        }
        this.A0 = pickerFragment;
        m5();
        x i2 = E2().i();
        i2.q(C0707R.id.mtrl_calendar_frame, this.A0, null);
        i2.k();
        PickerFragment<S> pickerFragment2 = this.A0;
        pickerFragment2.g0.add(new c());
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void m5() {
        String b1 = this.z0.b1(F2());
        this.H0.setContentDescription(String.format(V2(C0707R.string.mtrl_picker_announce_current_selection), b1));
        this.H0.setText(b1);
    }

    /* access modifiers changed from: private */
    public void n5(CheckableImageButton checkableImageButton) {
        String str;
        if (this.I0.isChecked()) {
            str = checkableImageButton.getContext().getString(C0707R.string.mtrl_picker_toggle_to_calendar_input_mode);
        } else {
            str = checkableImageButton.getContext().getString(C0707R.string.mtrl_picker_toggle_to_text_input_mode);
        }
        this.I0.setContentDescription(str);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void N3(Bundle bundle) {
        super.N3(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.y0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.z0);
        a.b bVar = new a.b(this.B0);
        if (this.C0.T4() != null) {
            bVar.b(this.C0.T4().p);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar.a());
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.D0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.E0);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void O3() {
        super.O3();
        Window window = S4().getWindow();
        if (this.F0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.J0);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = R2().getDimensionPixelOffset(C0707R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.J0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new dx(S4(), rect));
        }
        l5();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void P3() {
        this.A0.g0.clear();
        super.P3();
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog R4(Bundle bundle) {
        Context l4 = l4();
        Context l42 = l4();
        int i = this.y0;
        if (i == 0) {
            i = this.z0.q0(l42);
        }
        Dialog dialog = new Dialog(l4, i);
        Context context = dialog.getContext();
        this.F0 = k5(context);
        int t = rw.t(context, C0707R.attr.colorSurface, MaterialDatePicker.class.getCanonicalName());
        yx yxVar = new yx(context, null, C0707R.attr.materialCalendarStyle, C0707R.style.Widget_MaterialComponents_MaterialCalendar);
        this.J0 = yxVar;
        yxVar.C(context);
        this.J0.H(ColorStateList.valueOf(t));
        this.J0.G(q4.k(dialog.getWindow().getDecorView()));
        return dialog;
    }

    public final S j5() {
        return this.z0.Z1();
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.w0.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.x0.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) a3();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void s3(Bundle bundle) {
        super.s3(bundle);
        if (bundle == null) {
            bundle = D2();
        }
        this.y0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.z0 = (d) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.B0 = (a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.D0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.E0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.G0 = bundle.getInt("INPUT_MODE_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public final View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.F0 ? C0707R.layout.mtrl_picker_fullscreen : C0707R.layout.mtrl_picker_dialog, viewGroup);
        Context context = inflate.getContext();
        if (this.F0) {
            inflate.findViewById(C0707R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(i5(context), -2));
        } else {
            View findViewById = inflate.findViewById(C0707R.id.mtrl_calendar_main_pane);
            View findViewById2 = inflate.findViewById(C0707R.id.mtrl_calendar_frame);
            findViewById.setLayoutParams(new LinearLayout.LayoutParams(i5(context), -1));
            Resources resources = l4().getResources();
            int dimensionPixelOffset = resources.getDimensionPixelOffset(C0707R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(C0707R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(C0707R.dimen.mtrl_calendar_navigation_height);
            int dimensionPixelSize = resources.getDimensionPixelSize(C0707R.dimen.mtrl_calendar_days_of_week_height);
            int i = p.n;
            findViewById2.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(C0707R.dimen.mtrl_calendar_month_vertical_padding) * (i - 1)) + (resources.getDimensionPixelSize(C0707R.dimen.mtrl_calendar_day_height) * i) + resources.getDimensionPixelOffset(C0707R.dimen.mtrl_calendar_bottom_padding));
        }
        TextView textView = (TextView) inflate.findViewById(C0707R.id.mtrl_picker_header_selection_text);
        this.H0 = textView;
        q4.K(textView, 1);
        this.I0 = (CheckableImageButton) inflate.findViewById(C0707R.id.mtrl_picker_header_toggle);
        TextView textView2 = (TextView) inflate.findViewById(C0707R.id.mtrl_picker_title_text);
        CharSequence charSequence = this.E0;
        if (charSequence != null) {
            textView2.setText(charSequence);
        } else {
            textView2.setText(this.D0);
        }
        this.I0.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.I0;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, i0.b(context, C0707R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], i0.b(context, C0707R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.I0.setChecked(this.G0 != 0);
        q4.I(this.I0, null);
        n5(this.I0);
        this.I0.setOnClickListener(new m(this));
        this.K0 = (Button) inflate.findViewById(C0707R.id.confirm_button);
        if (this.z0.P1()) {
            this.K0.setEnabled(true);
        } else {
            this.K0.setEnabled(false);
        }
        this.K0.setTag("CONFIRM_BUTTON_TAG");
        this.K0.setOnClickListener(new a());
        Button button = (Button) inflate.findViewById(C0707R.id.cancel_button);
        button.setTag("CANCEL_BUTTON_TAG");
        button.setOnClickListener(new b());
        return inflate;
    }
}
