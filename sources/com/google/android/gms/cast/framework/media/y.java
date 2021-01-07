package com.google.android.gms.cast.framework.media;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.TextView;
import com.google.android.gms.cast.MediaTrack;
import com.google.android.gms.common.util.e;
import com.spotify.music.C0707R;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public final class y extends ArrayAdapter<MediaTrack> implements View.OnClickListener {
    private final Context a;
    private int b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y(Context context, List<MediaTrack> list, int i) {
        super(context, (int) C0707R.layout.cast_tracks_chooser_dialog_row_layout, list == null ? new ArrayList<>() : list);
        this.b = -1;
        this.a = context;
        this.b = i;
    }

    public final MediaTrack a() {
        int i = this.b;
        if (i < 0 || i >= getCount()) {
            return null;
        }
        return (MediaTrack) getItem(this.b);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        a0 a0Var;
        String str;
        Locale locale;
        if (view == null) {
            view = ((LayoutInflater) this.a.getSystemService("layout_inflater")).inflate(C0707R.layout.cast_tracks_chooser_dialog_row_layout, viewGroup, false);
            a0Var = new a0(this, (TextView) view.findViewById(C0707R.id.text), (RadioButton) view.findViewById(C0707R.id.radio));
            view.setTag(a0Var);
        } else {
            a0Var = (a0) view.getTag();
        }
        Locale locale2 = null;
        if (a0Var == null) {
            return null;
        }
        a0Var.b.setTag(Integer.valueOf(i));
        a0Var.b.setChecked(this.b == i);
        view.setOnClickListener(this);
        MediaTrack mediaTrack = (MediaTrack) getItem(i);
        String name = mediaTrack.getName();
        if (TextUtils.isEmpty(name)) {
            if (mediaTrack.o2() == 2) {
                str = this.a.getString(C0707R.string.cast_tracks_chooser_dialog_closed_captions);
            } else {
                if (!TextUtils.isEmpty(mediaTrack.Q1())) {
                    if (mediaTrack.Q1() != null) {
                        if (e.b()) {
                            locale2 = Locale.forLanguageTag(mediaTrack.Q1());
                        } else {
                            String[] split = mediaTrack.Q1().split("-");
                            if (split.length == 1) {
                                locale = new Locale(split[0]);
                            } else {
                                locale = new Locale(split[0], split[1]);
                            }
                            locale2 = locale;
                        }
                    }
                    String displayLanguage = locale2.getDisplayLanguage();
                    if (!TextUtils.isEmpty(displayLanguage)) {
                        str = displayLanguage;
                    }
                }
                name = this.a.getString(C0707R.string.cast_tracks_chooser_dialog_default_track_name, Integer.valueOf(i + 1));
            }
            a0Var.a.setText(str);
            return view;
        }
        str = name;
        a0Var.a.setText(str);
        return view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.b = ((Integer) ((a0) view.getTag()).b.getTag()).intValue();
        notifyDataSetChanged();
    }
}
