package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.mobile.android.util.ui.t;
import com.spotify.music.C0707R;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* renamed from: s42  reason: default package */
public class s42 extends t<View> {
    private final Calendar d;
    private final TextView e;
    private final TextView f;

    public s42(Context context, Calendar calendar) {
        super(LayoutInflater.from(context).inflate(C0707R.layout.calendar_view, (ViewGroup) null));
        View findViewById = a().findViewById(C0707R.id.month);
        findViewById.getClass();
        this.e = (TextView) findViewById;
        View findViewById2 = a().findViewById(C0707R.id.day);
        findViewById2.getClass();
        this.f = (TextView) findViewById2;
        calendar.getClass();
        this.d = calendar;
    }

    public static s42 b(ImageView imageView, cqe cqe) {
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof s42) {
            return (s42) drawable;
        }
        s42 s42 = new s42(imageView.getContext(), cqe.e());
        imageView.setImageDrawable(s42);
        return s42;
    }

    public void c(String str, int i) {
        String valueOf = String.valueOf(i);
        this.e.setText(str);
        this.f.setText(valueOf);
    }

    public void d(Date date, Locale locale) {
        if (date != null) {
            this.d.setTime(date);
            c(this.d.getDisplayName(2, 1, locale).toUpperCase(locale), this.d.get(5));
            return;
        }
        this.e.setText("");
        this.f.setText("");
    }
}
