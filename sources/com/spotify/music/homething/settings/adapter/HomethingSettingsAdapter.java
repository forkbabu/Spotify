package com.spotify.music.homething.settings.adapter;

import android.content.Context;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.appcompat.widget.SwitchCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import com.spotify.music.C0707R;
import defpackage.bt9;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HomethingSettingsAdapter extends RecyclerView.e<RecyclerView.b0> {
    private static final int o = Type.BOOLEAN.d();
    private static final int p = Type.TEXT_FIELD.d();
    private static final int q = Type.ENUM.d();
    public static final /* synthetic */ int r = 0;
    private final bt9.a c;
    private List<ft9> f = Collections.emptyList();
    private final Map<String, TextWatcher> n = new HashMap();

    public enum Type {
        BOOLEAN("boolean", 0),
        TEXT_FIELD("textfield", 1),
        ENUM("enum", 2);
        
        public static final Type[] f;
        private final int mIntType;
        private final String mType;

        static {
            Type type;
            Type type2;
            Type type3;
            f = new Type[]{type, type2, type3};
        }

        private Type(String str, int i) {
            this.mType = str;
            this.mIntType = i;
        }

        public static boolean h(String str) {
            for (Type type : f) {
                if (type.mType.equals(str)) {
                    return true;
                }
            }
            return false;
        }

        public final int d() {
            return this.mIntType;
        }

        public final String g() {
            return this.mType;
        }
    }

    public HomethingSettingsAdapter(bt9.a aVar) {
        this.c = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void K(RecyclerView.b0 b0Var, int i) {
        ft9 ft9 = this.f.get(i);
        if (w(i) == p) {
            View view = b0Var.a;
            int i2 = e90.i;
            x90 x90 = (x90) l70.o(view, x90.class);
            EditText editText = (EditText) x90.W1();
            TextWatcher textWatcher = this.n.get(ft9.key());
            if (textWatcher != null) {
                editText.removeTextChangedListener(textWatcher);
            }
            x90.setTitle(ft9.title());
            x90.setSubtitle(ft9.description());
            if (!editText.getText().toString().equals(ft9.value())) {
                editText.setText(ft9.value());
            }
            f fVar = new f(this, ft9);
            editText.addTextChangedListener(fVar);
            this.n.put(ft9.key(), fVar);
        } else if (w(i) == o) {
            View view2 = b0Var.a;
            int i3 = e90.i;
            x90 x902 = (x90) l70.o(view2, x90.class);
            SwitchCompat switchCompat = (SwitchCompat) x902.W1();
            x902.setTitle(ft9.title());
            x902.setSubtitle(ft9.description());
            switchCompat.setOnCheckedChangeListener(null);
            switchCompat.setChecked(Boolean.valueOf(ft9.value()).booleanValue());
            switchCompat.setOnCheckedChangeListener(new a(this, ft9));
        } else if (w(i) == q) {
            View view3 = b0Var.a;
            int i4 = e90.i;
            x90 x903 = (x90) l70.o(view3, x90.class);
            Spinner spinner = (Spinner) x903.W1();
            x903.setTitle(ft9.title());
            x903.setSubtitle(ft9.description());
            List<et9> enumValues = ft9.enumValues();
            enumValues.getClass();
            d dVar = new d(this, spinner.getContext(), C0707R.layout.dropdown_setting, enumValues);
            spinner.setOnItemSelectedListener(null);
            spinner.setAdapter((SpinnerAdapter) dVar);
            int i5 = 0;
            while (true) {
                if (i5 >= enumValues.size()) {
                    break;
                } else if (enumValues.get(i5).value().equals(ft9.value())) {
                    spinner.setSelection(i5, false);
                    break;
                } else {
                    i5++;
                }
            }
            spinner.setOnItemSelectedListener(new e(this, ft9, enumValues));
        } else {
            throw new IllegalArgumentException("Unknown view type when binding ViewHolder");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public RecyclerView.b0 M(ViewGroup viewGroup, int i) {
        if (i == p) {
            Context context = viewGroup.getContext();
            x90 g = e90.d().g(context, viewGroup);
            EditText editText = new EditText(context, null, C0707R.attr.pasteDefaultsEditTextStyle);
            editText.setMaxWidth(nud.g(180.0f, context.getResources()));
            g.z0(editText);
            g.getSubtitleView().setSingleLine(false);
            return h90.h0(g);
        } else if (i == o) {
            Context context2 = viewGroup.getContext();
            x90 g2 = e90.d().g(context2, viewGroup);
            SwitchCompat switchCompat = new SwitchCompat(context2, null);
            g2.z0(switchCompat);
            g2.getSubtitleView().setSingleLine(false);
            g2.getView().setOnClickListener(new b(switchCompat));
            return h90.h0(g2);
        } else if (i == q) {
            Context context3 = viewGroup.getContext();
            x90 g3 = e90.d().g(context3, viewGroup);
            g3.z0(new Spinner(context3, null, C0707R.attr.spinnerStyle));
            g3.getSubtitleView().setSingleLine(false);
            return h90.h0(g3);
        } else {
            throw new IllegalArgumentException("Unknown view type");
        }
    }

    public void Y() {
        this.f = Collections.emptyList();
        z();
    }

    public /* synthetic */ void Z(ft9 ft9, CompoundButton compoundButton, boolean z) {
        this.c.c(ft9, String.valueOf(z));
    }

    public void b0(List<ft9> list) {
        this.f = Collections2.newArrayList(Collections2.filter((Collection) list, (Predicate) c.a));
        z();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int u() {
        return this.f.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int w(int i) {
        String type = this.f.get(i).type();
        if (type.equals(Type.TEXT_FIELD.g())) {
            return p;
        }
        if (type.equals(Type.BOOLEAN.g())) {
            return o;
        }
        if (type.equals(Type.ENUM.g())) {
            return q;
        }
        throw new IllegalArgumentException(je.x0("This type of setting is unknown: ", type));
    }
}
