package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;
import com.spotify.music.C0707R;
import com.spotify.music.features.notificationsettings.combined.e;
import com.spotify.music.features.notificationsettings.common.Channel;

/* renamed from: ps5  reason: default package */
public final class ps5 implements rs5, CompoundButton.OnCheckedChangeListener {
    public static final Parcelable.Creator<ps5> CREATOR = new a();
    private final String a;
    private final Channel b;
    private boolean c;

    /* renamed from: ps5$a */
    static class a implements Parcelable.Creator<ps5> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public ps5 createFromParcel(Parcel parcel) {
            return new ps5(parcel, null);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public ps5[] newArray(int i) {
            return new ps5[i];
        }
    }

    private ps5(String str, Channel channel, boolean z) {
        this.a = str;
        this.b = channel;
        this.c = z;
    }

    public static ps5 a(String str, Channel channel, boolean z) {
        return new ps5(str, channel, z);
    }

    public Channel b() {
        return this.b;
    }

    public String c() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void e(boolean z) {
        this.c = z;
    }

    @Override // defpackage.rs5
    public int getType() {
        return 2;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.c = z;
        ((e) compoundButton.getTag()).a(this.a, this.b, z);
    }

    @Override // defpackage.rs5
    public View u0(Context context, e eVar, View view, ViewGroup viewGroup, int i) {
        String str;
        int i2 = e90.i;
        t90 t90 = (t90) l70.p(view, t90.class);
        if (t90 == null) {
            t90 = e90.d().f(context, viewGroup);
            t90.z0(new SwitchCompat(context, null));
        }
        int ordinal = this.b.ordinal();
        if (ordinal == 0) {
            str = context.getString(C0707R.string.notification_settings_channel_push);
        } else if (ordinal == 1) {
            str = context.getString(C0707R.string.notification_settings_channel_email);
        } else {
            StringBuilder V0 = je.V0("Unrecognized channel ");
            V0.append(this.b);
            throw new IllegalStateException(V0.toString());
        }
        t90.setText(str);
        ((SwitchCompat) t90.W1()).setOnCheckedChangeListener(null);
        ((SwitchCompat) t90.W1()).setChecked(this.c);
        ((SwitchCompat) t90.W1()).setOnCheckedChangeListener(this);
        t90.W1().setTag(eVar);
        t90.getView().setTag(t90.W1());
        return t90.getView();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b.name());
        parcel.writeInt(this.c ? 1 : 0);
    }

    ps5(Parcel parcel, a aVar) {
        this.a = parcel.readString();
        this.b = Channel.valueOf(parcel.readString());
        this.c = parcel.readInt() != 0;
    }
}
