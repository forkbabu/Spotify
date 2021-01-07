package com.spotify.music.homething.settings.view;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.androidx.fragment.app.LifecycleListenableFragment;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.ui.fragments.r;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.music.C0707R;
import com.spotify.music.homething.settings.adapter.HomethingSettingsAdapter;
import com.spotify.music.homething.settings.view.e;
import defpackage.bt9;
import java.util.List;

public class HomethingSettingsFragment extends LifecycleListenableFragment implements s, bt9 {
    bt9.a h0;
    HomethingSettingsAdapter i0;
    private Spinner j0;
    private TextView k0;
    private TextView l0;
    private TextView m0;
    private View n0;
    private View o0;
    private e p0;
    private View q0;

    class a implements AdapterView.OnItemSelectedListener {
        a() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            HomethingSettingsFragment.this.h0.b((us9) adapterView.getAdapter().getItem(i));
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        return context.getString(C0707R.string.homething);
    }

    public void K4() {
        this.i0.Y();
    }

    public void L4() {
        this.q0.setVisibility(8);
    }

    public void M4() {
        this.n0.setVisibility(8);
    }

    public void N4(List<us9> list) {
        String str;
        int i = 0;
        if (list.size() > 1) {
            if (l3()) {
                us9 us9 = (us9) this.j0.getSelectedItem();
                us9[] us9Arr = new us9[list.size()];
                list.toArray(us9Arr);
                f fVar = new f(this, F2(), C0707R.layout.device_picker, us9Arr, us9Arr);
                AdapterView.OnItemSelectedListener onItemSelectedListener = this.j0.getOnItemSelectedListener();
                this.j0.setOnItemSelectedListener(null);
                this.j0.setAdapter((SpinnerAdapter) fVar);
                if (us9 != null) {
                    String b = us9.b();
                    while (true) {
                        if (i >= list.size()) {
                            break;
                        } else if (b.equals(list.get(i).b())) {
                            this.j0.setSelection(i);
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                this.j0.setOnItemSelectedListener(onItemSelectedListener);
            }
        } else if (list.size() == 1) {
            us9 us92 = list.get(0);
            if (!TextUtils.isEmpty(us92.a())) {
                str = us92.a();
            } else {
                str = us92.d();
            }
            this.l0.setText(str);
            this.l0.setVisibility(0);
            this.o0.setVisibility(8);
            this.h0.b(us92);
        }
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void O3() {
        super.O3();
        this.h0.a(this);
    }

    public void O4(List<ft9> list) {
        this.i0.b0(list);
    }

    public void P4() {
        this.k0.setText(C0707R.string.something_went_wrong_settings_fetch);
        this.k0.setVisibility(0);
        this.o0.setVisibility(4);
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void Q3(View view, Bundle bundle) {
        super.Q3(view, bundle);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(F2());
        RecyclerView recyclerView = (RecyclerView) view.findViewById(C0707R.id.recycler_view);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(this.i0);
        this.k0 = (TextView) view.findViewById(C0707R.id.error_view);
        this.l0 = (TextView) view.findViewById(C0707R.id.single_text_title);
        this.m0 = (TextView) view.findViewById(C0707R.id.serial);
        this.n0 = view.findViewById(C0707R.id.serial_container);
        this.o0 = view.findViewById(C0707R.id.spinner_container);
        Spinner spinner = (Spinner) view.findViewById(C0707R.id.device_spinner);
        this.j0 = spinner;
        spinner.setOnItemSelectedListener(new a());
        View findViewById = view.findViewById(C0707R.id.button_remove);
        this.q0 = findViewById;
        findViewById.setOnClickListener(new d(this));
    }

    public void Q4() {
        this.k0.setText(C0707R.string.no_devices_available);
        this.k0.setVisibility(0);
        this.o0.setVisibility(4);
    }

    public void R4() {
        this.q0.setVisibility(0);
    }

    public void S4(e.a aVar) {
        this.p0.a(aVar);
    }

    public void T4(String str) {
        this.m0.setText(str);
        this.n0.setVisibility(0);
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public /* synthetic */ Fragment e() {
        return r.a(this);
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String i0() {
        return "homething-fragment";
    }

    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        dagger.android.support.a.a(this);
        super.p3(context);
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void s3(Bundle bundle) {
        super.s3(bundle);
        this.p0 = new e(F2());
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.HOMETHING_SETTINGS, null);
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C0707R.layout.homething_settings_fragment, viewGroup, false);
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        return kfd.r0;
    }
}
