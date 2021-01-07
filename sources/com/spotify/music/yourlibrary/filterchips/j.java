package com.spotify.music.yourlibrary.filterchips;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import androidx.core.content.a;
import com.spotify.encore.foundation.R;
import com.spotify.music.C0707R;

public final class j {
    static LinearLayout a(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, nud.g(48.0f, context.getResources())));
        linearLayout.setClipChildren(false);
        c(linearLayout, "filter_chips_container_transition");
        return linearLayout;
    }

    static CheckBox b(ViewGroup viewGroup, String str, String str2) {
        Context context = viewGroup.getContext();
        CheckBox checkBox = (CheckBox) LayoutInflater.from(context).inflate(C0707R.layout.filter_chip_item, viewGroup, false);
        checkBox.setText(str);
        checkBox.setTag(str2);
        c(checkBox, str2);
        checkBox.setBackground(new u(a.d(context, C0707R.drawable.filter_chip_selector), a.b(context, R.color.black_30)));
        return checkBox;
    }

    static void c(View view, String str) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setTransitionName(str);
        }
    }
}
