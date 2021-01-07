package com.spotify.mobile.android.util;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.spotify.android.paste.app.b;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.C0707R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@Deprecated
public class o0 {
    private final Map<Integer, WeakReference<Toast>> a = new HashMap(8);
    private final Context b;

    public o0(Context context) {
        this.b = context;
    }

    private void e(int i, int i2, Object... objArr) {
        Toast toast;
        if (objArr.length > 0) {
            Context context = this.b;
            toast = Toast.makeText(context, context.getString(i, objArr), i2);
        } else {
            toast = Toast.makeText(this.b, i, i2);
        }
        toast.show();
    }

    public synchronized void a(SpotifyIconV2 spotifyIconV2, int i, int i2) {
        b(spotifyIconV2, this.b.getString(i), i, i2);
    }

    public synchronized void b(SpotifyIconV2 spotifyIconV2, String str, int i, int i2) {
        synchronized (this.a) {
            Iterator<Map.Entry<Integer, WeakReference<Toast>>> it = this.a.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<Integer, WeakReference<Toast>> next = it.next();
                Toast toast = next.getValue().get();
                if (toast == null) {
                    it.remove();
                } else if (next.getKey().intValue() == i) {
                    toast.cancel();
                    it.remove();
                }
            }
        }
        LayoutInflater from = LayoutInflater.from(new ContextThemeWrapper(this.b, (int) C0707R.style.res_2132083497_theme_glue));
        from.setFactory(new b());
        View inflate = from.inflate(C0707R.layout.toast, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(C0707R.id.title);
        textView.setText(str);
        Context context = this.b;
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, new SpotifyIconDrawable(context, spotifyIconV2, (float) context.getResources().getDimensionPixelSize(C0707R.dimen.icon_toast)), (Drawable) null, (Drawable) null);
        Toast toast2 = new Toast(this.b.getApplicationContext());
        toast2.setView(inflate);
        toast2.setGravity(17, 0, 0);
        toast2.setDuration(i2);
        toast2.show();
        synchronized (this.a) {
            this.a.put(Integer.valueOf(i), new WeakReference<>(toast2));
        }
    }

    public void c(int i, Object... objArr) {
        e(i, 1, objArr);
    }

    public void d(int i, Object... objArr) {
        e(i, 0, objArr);
    }
}
