package com.spotify.music.homething.settings.view;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.spotify.music.C0707R;

class f extends ArrayAdapter<us9> {
    final /* synthetic */ us9[] a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    f(HomethingSettingsFragment homethingSettingsFragment, Context context, int i, us9[] us9Arr, us9[] us9Arr2) {
        super(context, i, us9Arr);
        this.a = us9Arr2;
    }

    private View a(int i, ViewGroup viewGroup) {
        TextView textView = (TextView) je.G(viewGroup, C0707R.layout.device_picker, viewGroup, false);
        String a2 = this.a[i].a();
        if (TextUtils.isEmpty(a2)) {
            a2 = this.a[i].d();
        }
        textView.setText(a2);
        return textView;
    }

    @Override // android.widget.ArrayAdapter, android.widget.SpinnerAdapter, android.widget.BaseAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        return a(i, viewGroup);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        return a(i, viewGroup);
    }
}
