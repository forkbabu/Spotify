package com.spotify.music.features.settings.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.spotify.encore.foundation.R;

/* access modifiers changed from: package-private */
public class v2 extends ArrayAdapter<String> {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public v2(android.content.Context r3, java.lang.String[] r4) {
        /*
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r4.length
            r0.<init>(r1)
            java.util.List r4 = java.util.Arrays.asList(r4)
            r0.addAll(r4)
            java.lang.String r4 = ""
            r0.add(r4)
            r4 = 17367043(0x1090003, float:2.5162934E-38)
            r2.<init>(r3, r4, r0)
            r3 = 17367049(0x1090009, float:2.516295E-38)
            r2.setDropDownViewResource(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.features.settings.adapter.v2.<init>(android.content.Context, java.lang.String[]):void");
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public int getCount() {
        return super.getCount() - 1;
    }

    @Override // android.widget.ArrayAdapter, android.widget.SpinnerAdapter, android.widget.BaseAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) super.getDropDownView(i, view, viewGroup);
        textView.setTypeface(i2.e(viewGroup.getContext(), R.font.encore_font_circular_book));
        return textView;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) super.getView(i, view, viewGroup);
        textView.setTypeface(i2.e(viewGroup.getContext(), R.font.encore_font_circular_book));
        return textView;
    }
}
