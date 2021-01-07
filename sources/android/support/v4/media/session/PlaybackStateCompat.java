package android.support.v4.media.session;

import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a();
    final int a;
    final long b;
    final long c;
    final float f;
    final long n;
    final int o;
    final CharSequence p;
    final long q;
    List<CustomAction> r;
    final long s;
    final Bundle t;
    private PlaybackState u;

    static class a implements Parcelable.Creator<PlaybackStateCompat> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public PlaybackStateCompat[] newArray(int i) {
            return new PlaybackStateCompat[i];
        }
    }

    PlaybackStateCompat(int i, long j, long j2, float f2, long j3, int i2, CharSequence charSequence, long j4, List<CustomAction> list, long j5, Bundle bundle) {
        this.a = i;
        this.b = j;
        this.c = j2;
        this.f = f2;
        this.n = j3;
        this.o = i2;
        this.p = charSequence;
        this.q = j4;
        this.r = new ArrayList(list);
        this.s = j5;
        this.t = bundle;
    }

    public static PlaybackStateCompat a(Object obj) {
        ArrayList arrayList;
        Bundle bundle = null;
        if (obj == null || Build.VERSION.SDK_INT < 21) {
            return null;
        }
        PlaybackState playbackState = (PlaybackState) obj;
        List<PlaybackState.CustomAction> customActions = playbackState.getCustomActions();
        if (customActions != null) {
            ArrayList arrayList2 = new ArrayList(customActions.size());
            for (PlaybackState.CustomAction customAction : customActions) {
                arrayList2.add(CustomAction.a(customAction));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        if (Build.VERSION.SDK_INT >= 22) {
            bundle = playbackState.getExtras();
        }
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(playbackState.getState(), playbackState.getPosition(), playbackState.getBufferedPosition(), playbackState.getPlaybackSpeed(), playbackState.getActions(), 0, playbackState.getErrorMessage(), playbackState.getLastPositionUpdateTime(), arrayList, playbackState.getActiveQueueItemId(), bundle);
        playbackStateCompat.u = playbackState;
        return playbackStateCompat;
    }

    public long b() {
        return this.n;
    }

    public Bundle c() {
        return this.t;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Object e() {
        if (this.u == null && Build.VERSION.SDK_INT >= 21) {
            PlaybackState.Builder builder = new PlaybackState.Builder();
            builder.setState(this.a, this.b, this.f, this.q);
            builder.setBufferedPosition(this.c);
            builder.setActions(this.n);
            builder.setErrorMessage(this.p);
            for (CustomAction customAction : this.r) {
                builder.addCustomAction((PlaybackState.CustomAction) customAction.b());
            }
            builder.setActiveQueueItemId(this.s);
            if (Build.VERSION.SDK_INT >= 22) {
                builder.setExtras(this.t);
            }
            this.u = builder.build();
        }
        return this.u;
    }

    public int f() {
        return this.a;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder sb = new StringBuilder("PlaybackState {");
        sb.append("state=");
        sb.append(this.a);
        sb.append(", position=");
        sb.append(this.b);
        sb.append(", buffered position=");
        sb.append(this.c);
        sb.append(", speed=");
        sb.append(this.f);
        sb.append(", updated=");
        sb.append(this.q);
        sb.append(", actions=");
        sb.append(this.n);
        sb.append(", error code=");
        sb.append(this.o);
        sb.append(", error message=");
        sb.append(this.p);
        sb.append(", custom actions=");
        sb.append(this.r);
        sb.append(", active item id=");
        return je.E0(sb, this.s, "}");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeLong(this.b);
        parcel.writeFloat(this.f);
        parcel.writeLong(this.q);
        parcel.writeLong(this.c);
        parcel.writeLong(this.n);
        TextUtils.writeToParcel(this.p, parcel, i);
        parcel.writeTypedList(this.r);
        parcel.writeLong(this.s);
        parcel.writeBundle(this.t);
        parcel.writeInt(this.o);
    }

    public static final class b {
        private final List<CustomAction> a;
        private int b;
        private long c;
        private long d;
        private float e;
        private long f;
        private int g;
        private CharSequence h;
        private long i;
        private long j;
        private Bundle k;

        public b() {
            this.a = new ArrayList();
            this.j = -1;
        }

        public b a(CustomAction customAction) {
            if (customAction != null) {
                this.a.add(customAction);
                return this;
            }
            throw new IllegalArgumentException("You may not add a null CustomAction to PlaybackStateCompat");
        }

        public PlaybackStateCompat b() {
            return new PlaybackStateCompat(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.a, this.j, this.k);
        }

        public b c(long j2) {
            this.f = j2;
            return this;
        }

        public b d(long j2) {
            this.j = j2;
            return this;
        }

        public b e(int i2, CharSequence charSequence) {
            this.g = i2;
            this.h = charSequence;
            return this;
        }

        public b f(Bundle bundle) {
            this.k = bundle;
            return this;
        }

        public b g(int i2, long j2, float f2) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.b = i2;
            this.c = j2;
            this.i = elapsedRealtime;
            this.e = f2;
            return this;
        }

        public b h(int i2, long j2, float f2, long j3) {
            this.b = i2;
            this.c = j2;
            this.i = j3;
            this.e = f2;
            return this;
        }

        public b(PlaybackStateCompat playbackStateCompat) {
            ArrayList arrayList = new ArrayList();
            this.a = arrayList;
            this.j = -1;
            this.b = playbackStateCompat.a;
            this.c = playbackStateCompat.b;
            this.e = playbackStateCompat.f;
            this.i = playbackStateCompat.q;
            this.d = playbackStateCompat.c;
            this.f = playbackStateCompat.n;
            this.g = playbackStateCompat.o;
            this.h = playbackStateCompat.p;
            List<CustomAction> list = playbackStateCompat.r;
            if (list != null) {
                arrayList.addAll(list);
            }
            this.j = playbackStateCompat.s;
            this.k = playbackStateCompat.t;
        }
    }

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new a();
        private final String a;
        private final CharSequence b;
        private final int c;
        private final Bundle f;
        private PlaybackState.CustomAction n;

        static class a implements Parcelable.Creator<CustomAction> {
            a() {
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public CustomAction[] newArray(int i) {
                return new CustomAction[i];
            }
        }

        public static final class b {
            private final String a;
            private final CharSequence b;
            private final int c;
            private Bundle d;

            public b(String str, CharSequence charSequence, int i) {
                if (TextUtils.isEmpty(str)) {
                    throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                } else if (TextUtils.isEmpty(charSequence)) {
                    throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                } else if (i != 0) {
                    this.a = str;
                    this.b = charSequence;
                    this.c = i;
                } else {
                    throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                }
            }

            public CustomAction a() {
                return new CustomAction(this.a, this.b, this.c, this.d);
            }

            public b b(Bundle bundle) {
                this.d = bundle;
                return this;
            }
        }

        CustomAction(String str, CharSequence charSequence, int i, Bundle bundle) {
            this.a = str;
            this.b = charSequence;
            this.c = i;
            this.f = bundle;
        }

        public static CustomAction a(Object obj) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            PlaybackState.CustomAction customAction = (PlaybackState.CustomAction) obj;
            CustomAction customAction2 = new CustomAction(customAction.getAction(), customAction.getName(), customAction.getIcon(), customAction.getExtras());
            customAction2.n = customAction;
            return customAction2;
        }

        public Object b() {
            PlaybackState.CustomAction customAction = this.n;
            if (customAction != null || Build.VERSION.SDK_INT < 21) {
                return customAction;
            }
            PlaybackState.CustomAction.Builder builder = new PlaybackState.CustomAction.Builder(this.a, this.b, this.c);
            builder.setExtras(this.f);
            return builder.build();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // java.lang.Object
        public String toString() {
            StringBuilder V0 = je.V0("Action:mName='");
            V0.append((Object) this.b);
            V0.append(", mIcon=");
            V0.append(this.c);
            V0.append(", mExtras=");
            V0.append(this.f);
            return V0.toString();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.a);
            TextUtils.writeToParcel(this.b, parcel, i);
            parcel.writeInt(this.c);
            parcel.writeBundle(this.f);
        }

        CustomAction(Parcel parcel) {
            this.a = parcel.readString();
            this.b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.c = parcel.readInt();
            this.f = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }
    }

    PlaybackStateCompat(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readLong();
        this.f = parcel.readFloat();
        this.q = parcel.readLong();
        this.c = parcel.readLong();
        this.n = parcel.readLong();
        this.p = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.r = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.s = parcel.readLong();
        this.t = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.o = parcel.readInt();
    }
}
