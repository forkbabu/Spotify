package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.waze.model.WazeTransportDrivingDirection;
import com.spotify.player.model.ContextTrack;
import com.waze.sdk.WazeSDKManager;
import com.waze.sdk.f;
import defpackage.o92;
import java.lang.ref.WeakReference;

/* renamed from: p92  reason: default package */
public class p92 implements o92 {
    private static final WazeSDKManager.Waze_Message[] f = WazeSDKManager.Waze_Message.values();
    private final Context a;
    private final i92 b;
    private boolean c;
    private o92.a d;
    private a e;

    /* renamed from: p92$a */
    static class a extends Handler {
        private final WeakReference<o92.a> a;

        public a(o92.a aVar) {
            this.a = new WeakReference<>(aVar);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            o92.a aVar = this.a.get();
            if (aVar == null) {
                Assertion.g("Weak reference has been lost, can't handle messages");
                return;
            }
            WazeSDKManager.Waze_Message waze_Message = p92.f[message.what];
            switch (waze_Message.ordinal()) {
                case 0:
                    aVar.g();
                    return;
                case 1:
                    String string = message.getData().getString("DISTANCE_METERS");
                    String string2 = message.getData().getString("DISTANCE_DISPLAY");
                    Logger.b("Distance: %s, Distance display: %s", string, string2);
                    aVar.f(string, string2);
                    return;
                case 2:
                    String string3 = message.getData().getString("ETA_MINUTES");
                    Logger.b("ETA=%s", string3);
                    aVar.i(string3);
                    return;
                case 3:
                    String string4 = message.getData().getString("INSTRUCTION");
                    try {
                        int parseInt = Integer.parseInt(string4);
                        Logger.b("Inst=%d", Integer.valueOf(parseInt));
                        WazeTransportDrivingDirection wazeTransportDrivingDirection = WazeTransportDrivingDirection.NONE;
                        if (parseInt >= 0 && parseInt < WazeTransportDrivingDirection.F.size()) {
                            aVar.a(WazeTransportDrivingDirection.F.get(parseInt));
                            return;
                        }
                        return;
                    } catch (NumberFormatException e) {
                        Logger.e(e, "Couldn't parse instruction %s", string4);
                        return;
                    }
                case 4:
                    boolean parseBoolean = Boolean.parseBoolean(message.getData().getString("STATUS"));
                    Logger.b("Conn=%b", Boolean.valueOf(parseBoolean));
                    aVar.h(parseBoolean);
                    return;
                case 5:
                default:
                    Logger.d("Unknown %s => %s", waze_Message, message);
                    return;
                case 6:
                    String string5 = message.getData().getString("INSTRUCTION_EXIT");
                    try {
                        int parseInt2 = Integer.parseInt(string5);
                        Logger.b("Exit=%d", Integer.valueOf(parseInt2));
                        aVar.d(parseInt2);
                        return;
                    } catch (NumberFormatException e2) {
                        Logger.e(e2, "Couldn't parse instruction exit %s", string5);
                        return;
                    }
                case 7:
                    boolean parseBoolean2 = Boolean.parseBoolean(message.getData().getString("LEFT_LANE"));
                    Logger.b("UKStyle: %b", Boolean.valueOf(parseBoolean2));
                    aVar.c(parseBoolean2);
                    return;
                case 8:
                    String string6 = message.getData().getString("ETA_DISTANCE");
                    Logger.b("ETADistance=%s", string6);
                    aVar.e(string6);
                    return;
                case 9:
                    boolean parseBoolean3 = Boolean.parseBoolean(message.getData().getString("IS_NAVIGATING"));
                    Logger.b("IsNavigating: %b", Boolean.valueOf(parseBoolean3));
                    aVar.b(parseBoolean3);
                    return;
            }
        }
    }

    public p92(Context context, i92 i92) {
        this.a = context;
        this.b = i92;
    }

    @Override // defpackage.o92
    public void a() {
        if (!this.c) {
            Assertion.g("Trying to open Waze before WazeSdkWrapper has been started!");
            return;
        }
        Logger.b("open", new Object[0]);
        if (!ig0.b()) {
            WazeSDKManager.p().r();
        }
    }

    @Override // defpackage.o92
    public boolean b() {
        return this.c;
    }

    @Override // defpackage.o92
    public void c(o92.a aVar) {
        if (this.c) {
            Assertion.g("WazeSdkWrapper has already been started!");
            return;
        }
        Logger.b("start", new Object[0]);
        this.c = true;
        this.d = aVar;
        this.e = new a(this.d);
        Messenger messenger = new Messenger(this.e);
        if (!ig0.b()) {
            f.b bVar = new f.b();
            bVar.b(this.b.a(this.a));
            WazeSDKManager.p().q(this.a, messenger, bVar.a());
        }
    }

    @Override // defpackage.o92
    public void stop() {
        if (!this.c) {
            Assertion.g("Trying to stop WazeSdkWrapper which hasn't been started yet!");
            return;
        }
        Logger.b(ContextTrack.TrackAction.STOP, new Object[0]);
        if (!ig0.b()) {
            WazeSDKManager.p().t();
        }
        this.d = null;
        this.e = null;
        this.c = false;
    }
}
