package com.waze.sdk;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

class e extends Handler {
    private final g a;

    e(g gVar) {
        this.a = gVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i;
        Bundle data = message.getData();
        boolean h = this.a.h();
        int i2 = 0;
        String.format("Get message from Waze, msg=%s, data=%s, listen to navigation data? %s", Integer.valueOf(message.what), data, Boolean.valueOf(h));
        int i3 = message.what;
        if (i3 == 502) {
            if (data != null) {
                i2 = data.getInt("reason");
            }
            this.a.f(i2);
        } else if (i3 != 702) {
            if (i3 != 709) {
                if (i3 != 710) {
                    switch (i3) {
                        case 704:
                            if (h) {
                                this.a.l(data.getInt("exitNumber"));
                                return;
                            }
                            return;
                        case 705:
                            if (h) {
                                this.a.i(data.getString("distanceString"), data.getInt("distanceMeters"));
                                return;
                            }
                            return;
                        case 706:
                            if (h) {
                                this.a.o(data.getBoolean("isLeftHandTraffic"));
                                return;
                            }
                            return;
                        default:
                            return;
                    }
                } else if (h) {
                    this.a.k(data.getBoolean("isNavigating"));
                }
            } else if (h) {
                this.a.n(data.getString("streetName"));
            }
        } else if (h && (i = data.getInt("instruction")) >= 0) {
            WazeSdkConstants$WazeInstructions.values();
            if (i < 21) {
                this.a.j(WazeSdkConstants$WazeInstructions.values()[i]);
            }
        }
    }
}
