package defpackage;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.foundation.R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import defpackage.ds9;
import java.util.ArrayList;
import java.util.List;

/* renamed from: cs9  reason: default package */
public class cs9 extends RecyclerView.e<a> {
    private final ds9.a c;
    private List<BluetoothDevice> f = new ArrayList();

    /* renamed from: cs9$a */
    static class a extends RecyclerView.b0 {
        TextView C;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public a(android.view.ViewGroup r3) {
            /*
                r2 = this;
                r0 = 2131624168(0x7f0e00e8, float:1.8875508E38)
                r1 = 0
                android.view.View r3 = defpackage.je.G(r3, r0, r3, r1)
                r2.<init>(r3)
                r0 = 2131428173(0x7f0b034d, float:1.8477983E38)
                android.view.View r3 = r3.findViewById(r0)
                android.widget.TextView r3 = (android.widget.TextView) r3
                r2.C = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.cs9.a.<init>(android.view.ViewGroup):void");
        }
    }

    public cs9(ds9.a aVar) {
        this.c = aVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$b0, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void K(a aVar, int i) {
        a aVar2 = aVar;
        BluetoothDevice bluetoothDevice = this.f.get(i);
        aVar2.a.setOnClickListener(new bs9(this, bluetoothDevice));
        aVar2.C.setText(bluetoothDevice.getName());
        TextView textView = aVar2.C;
        Context context = textView.getContext();
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, SpotifyIconV2.CHEVRON_RIGHT, (float) nud.g(24.0f, context.getResources()));
        spotifyIconDrawable.r(androidx.core.content.a.b(context, R.color.white));
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, spotifyIconDrawable, (Drawable) null);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$b0' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public a M(ViewGroup viewGroup, int i) {
        return new a(viewGroup);
    }

    public void X(BluetoothDevice bluetoothDevice) {
        this.f.add(bluetoothDevice);
        C(this.f.size() - 1);
    }

    public /* synthetic */ void Y(BluetoothDevice bluetoothDevice, View view) {
        this.c.d(bluetoothDevice);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int u() {
        return this.f.size();
    }
}
