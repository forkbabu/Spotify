package defpackage;

import android.media.AudioDeviceInfo;
import android.os.Build;
import com.google.common.collect.ImmutableMap;
import defpackage.ote;

/* renamed from: jte  reason: default package */
public final class jte {
    private static final b d;
    private final mte a;
    private final String b;
    private final String c;

    /* renamed from: jte$b */
    interface b {
        String a(AudioDeviceInfo audioDeviceInfo);
    }

    /* renamed from: jte$c */
    private static final class c implements b {
        c(a aVar) {
        }

        @Override // defpackage.jte.b
        public String a(AudioDeviceInfo audioDeviceInfo) {
            return "unknown";
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: jte$d */
    public static class d implements b {
        private static final ImmutableMap<Integer, String> a;

        static {
            ImmutableMap.Builder builder = new ImmutableMap.Builder();
            builder.mo51put(0, "unknown");
            builder.mo51put(1, "builtin-earpiece");
            builder.mo51put(2, "builtin-speaker");
            builder.mo51put(3, "wired_headset");
            builder.mo51put(4, "wired-headphones");
            builder.mo51put(7, "bluetooth-sco");
            builder.mo51put(8, "bluetooth-a2dp");
            builder.mo51put(9, "hdmi");
            builder.mo51put(13, "dock");
            builder.mo51put(12, "usb-accessory");
            builder.mo51put(11, "usb-device");
            builder.mo51put(18, "telephony");
            builder.mo51put(5, "line-analog");
            builder.mo51put(10, "hdmi-arc");
            builder.mo51put(6, "line-digital");
            builder.mo51put(14, "fm");
            builder.mo51put(19, "aux-line");
            builder.mo51put(20, "ip");
            builder.mo51put(15, "builtin-mic");
            builder.mo51put(16, "fm-tuner");
            builder.mo51put(17, "tv-tuner");
            a = builder.build();
        }

        d(a aVar) {
        }

        @Override // defpackage.jte.b
        public String a(AudioDeviceInfo audioDeviceInfo) {
            int type = audioDeviceInfo.getType();
            ImmutableMap<Integer, String> immutableMap = a;
            return immutableMap.containsKey(Integer.valueOf(type)) ? immutableMap.get(Integer.valueOf(type)) : "unknown";
        }
    }

    /* renamed from: jte$e */
    private static class e extends d {
        private static final ImmutableMap<Integer, String> b;

        static {
            ImmutableMap.Builder builder = new ImmutableMap.Builder();
            builder.mo51put(21, "bus");
            b = builder.build();
        }

        e(a aVar) {
            super(null);
        }

        @Override // defpackage.jte.d, defpackage.jte.b
        public String a(AudioDeviceInfo audioDeviceInfo) {
            int type = audioDeviceInfo.getType();
            ImmutableMap<Integer, String> immutableMap = b;
            if (immutableMap.containsKey(Integer.valueOf(type))) {
                return immutableMap.get(Integer.valueOf(type));
            }
            return super.a(audioDeviceInfo);
        }
    }

    /* renamed from: jte$f */
    private static final class f extends e {
        private static final ImmutableMap<Integer, String> c;

        static {
            ImmutableMap.Builder builder = new ImmutableMap.Builder();
            builder.mo51put(22, "usb-headset");
            c = builder.build();
        }

        f(a aVar) {
            super(null);
        }

        @Override // defpackage.jte.e, defpackage.jte.d, defpackage.jte.b
        public String a(AudioDeviceInfo audioDeviceInfo) {
            int type = audioDeviceInfo.getType();
            ImmutableMap<Integer, String> immutableMap = c;
            if (immutableMap.containsKey(Integer.valueOf(type))) {
                return immutableMap.get(Integer.valueOf(type));
            }
            return super.a(audioDeviceInfo);
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            d = new f(null);
        } else if (i >= 24) {
            d = new e(null);
        } else if (i >= 23) {
            d = new d(null);
        } else {
            d = new c(null);
        }
    }

    public jte(String str, String str2, mte mte) {
        this.b = str;
        this.c = str2;
        this.a = mte;
    }

    public void a(AudioDeviceInfo audioDeviceInfo) {
        if (audioDeviceInfo != null) {
            String a2 = d.a(audioDeviceInfo);
            mte mte = this.a;
            ote.a a3 = ote.a();
            a3.b(this.b);
            a3.a(this.c);
            a3.c(a2);
            mte.a(a3.build());
        }
    }
}
