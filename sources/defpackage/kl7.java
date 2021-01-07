package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.List;

/* renamed from: kl7  reason: default package */
public class kl7 extends BaseAdapter {
    private final List<kn7> a;
    private final Context b;

    public kl7(List<kn7> list, Context context) {
        this.a = list;
        this.b = context;
    }

    public kn7 a(int i) {
        return this.a.get(i);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.a.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        return this.a.get(i);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return (long) i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(this.b).inflate(17367043, viewGroup, false);
            TextView textView = (TextView) view.findViewById(16908308);
            kn7 kn7 = this.a.get(i);
            textView.setText(kn7.d());
            if (kn7.b()) {
                textView.setTextColor(-16777216);
            } else {
                textView.setTextColor(-7829368);
                textView.setEnabled(false);
                textView.setOnClickListener(null);
            }
        }
        return view;
    }
}
