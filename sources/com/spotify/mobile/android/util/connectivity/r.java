package com.spotify.mobile.android.util.connectivity;

import android.app.Application;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.spotify.base.java.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class r {
    public static ConnectionType a(Context context) {
        if (Build.VERSION.SDK_INT >= 23) {
            return c((ConnectivityManager) context.getSystemService("connectivity"));
        }
        return d((ConnectivityManager) context.getSystemService("connectivity"), (TelephonyManager) context.getSystemService("phone"));
    }

    private static ConnectionType b(NetworkInfo networkInfo, TelephonyManager telephonyManager) {
        ConnectionType connectionType = ConnectionType.CONNECTION_TYPE_3G;
        int type = networkInfo.getType();
        switch (type) {
            case 0:
            case 2:
            case 3:
            case 4:
            case 5:
                return telephonyManager != null ? e(telephonyManager.getNetworkType()) : connectionType;
            case 1:
            case 13:
                return ConnectionType.CONNECTION_TYPE_WLAN;
            case 6:
            case 7:
            case 17:
                return connectionType;
            case 8:
            case 10:
            case 12:
            case 14:
            case 15:
            default:
                if (ConnectivityManager.isNetworkTypeValid(type)) {
                    Logger.b("Unknown connectivity type: (%d)%s", Integer.valueOf(type), networkInfo.getTypeName());
                } else {
                    Logger.b("Invalid connectivity type returned by getType: %d", Integer.valueOf(type));
                }
                return ConnectionType.CONNECTION_TYPE_UNKNOWN;
            case 9:
                return ConnectionType.CONNECTION_TYPE_ETHERNET;
            case 11:
                return ConnectionType.CONNECTION_TYPE_GPRS;
            case 16:
                return ConnectionType.CONNECTION_TYPE_COMPANION_PROXY;
        }
    }

    public static ConnectionType c(ConnectivityManager connectivityManager) {
        ConnectionType connectionType = ConnectionType.CONNECTION_TYPE_NONE;
        if (connectivityManager == null) {
            return connectionType;
        }
        ArrayList arrayList = new ArrayList();
        for (Network network : connectivityManager.getAllNetworks()) {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
            if (f(networkCapabilities)) {
                arrayList.add(networkCapabilities);
            }
        }
        if (arrayList.isEmpty()) {
            return connectionType;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            NetworkCapabilities networkCapabilities2 = (NetworkCapabilities) it.next();
            ConnectionType connectionType2 = ConnectionType.CONNECTION_TYPE_3G;
            if (!f(networkCapabilities2)) {
                connectionType2 = connectionType;
            } else if (networkCapabilities2.hasTransport(3)) {
                connectionType2 = ConnectionType.CONNECTION_TYPE_ETHERNET;
            } else if (networkCapabilities2.hasTransport(1)) {
                connectionType2 = ConnectionType.CONNECTION_TYPE_WLAN;
            } else if (networkCapabilities2.hasTransport(0)) {
                int linkDownstreamBandwidthKbps = networkCapabilities2.getLinkDownstreamBandwidthKbps();
                if (linkDownstreamBandwidthKbps > 10000) {
                    connectionType2 = ConnectionType.CONNECTION_TYPE_4G;
                } else if (linkDownstreamBandwidthKbps <= 100) {
                    connectionType2 = linkDownstreamBandwidthKbps > 50 ? ConnectionType.CONNECTION_TYPE_EDGE : ConnectionType.CONNECTION_TYPE_GPRS;
                }
            } else {
                Logger.b("Treat unknown TransportInfo as 3G: %s", networkCapabilities2.toString());
            }
            arrayList2.add(connectionType2);
        }
        Collections.sort(arrayList2, Collections.reverseOrder());
        return (ConnectionType) arrayList2.get(0);
    }

    static ConnectionType d(ConnectivityManager connectivityManager, TelephonyManager telephonyManager) {
        ConnectionType connectionType = ConnectionType.CONNECTION_TYPE_NONE;
        if (connectivityManager == null) {
            return connectionType;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            return b(activeNetworkInfo, telephonyManager);
        }
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 21) {
            for (Network network : connectivityManager.getAllNetworks()) {
                NetworkInfo networkInfo = connectivityManager.getNetworkInfo(network);
                if (networkInfo != null && networkInfo.isConnected()) {
                    arrayList.add(networkInfo);
                }
            }
        } else {
            NetworkInfo[] allNetworkInfo = connectivityManager.getAllNetworkInfo();
            for (NetworkInfo networkInfo2 : allNetworkInfo) {
                if (networkInfo2 != null && networkInfo2.isConnected()) {
                    arrayList.add(networkInfo2);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(b((NetworkInfo) it.next(), telephonyManager));
            }
            Collections.sort(arrayList2, Collections.reverseOrder());
            return (ConnectionType) arrayList2.get(0);
        } else if (Build.VERSION.SDK_INT < 21) {
            return connectionType;
        } else {
            ArrayList arrayList3 = new ArrayList();
            for (Network network2 : connectivityManager.getAllNetworks()) {
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network2);
                if (g(networkCapabilities)) {
                    arrayList3.add(networkCapabilities);
                }
            }
            if (arrayList3.isEmpty()) {
                return connectionType;
            }
            ArrayList arrayList4 = new ArrayList();
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                NetworkCapabilities networkCapabilities2 = (NetworkCapabilities) it2.next();
                ConnectionType connectionType2 = ConnectionType.CONNECTION_TYPE_3G;
                if (!g(networkCapabilities2)) {
                    connectionType2 = connectionType;
                } else if (networkCapabilities2.hasTransport(3)) {
                    connectionType2 = ConnectionType.CONNECTION_TYPE_ETHERNET;
                } else if (networkCapabilities2.hasTransport(1)) {
                    connectionType2 = ConnectionType.CONNECTION_TYPE_WLAN;
                } else if (!networkCapabilities2.hasTransport(0)) {
                    Logger.b("Treat unknown TransportInfo as 3G: %s", networkCapabilities2.toString());
                } else if (telephonyManager != null) {
                    connectionType2 = e(telephonyManager.getNetworkType());
                }
                arrayList4.add(connectionType2);
            }
            Collections.sort(arrayList4, Collections.reverseOrder());
            return (ConnectionType) arrayList4.get(0);
        }
    }

    private static ConnectionType e(int i) {
        ConnectionType connectionType = ConnectionType.CONNECTION_TYPE_3G;
        switch (i) {
            case 0:
                Logger.b("Unknown mobile connection type for network %d", Integer.valueOf(i));
                return ConnectionType.CONNECTION_TYPE_UNKNOWN;
            case 1:
            case 4:
            case 11:
                return ConnectionType.CONNECTION_TYPE_GPRS;
            case 2:
                return ConnectionType.CONNECTION_TYPE_EDGE;
            case 3:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
                return connectionType;
            case 13:
                return ConnectionType.CONNECTION_TYPE_4G;
            default:
                Logger.b("Treat unknown mobile connection type '%d' as 3G", Integer.valueOf(i));
                return connectionType;
        }
    }

    private static boolean f(NetworkCapabilities networkCapabilities) {
        return networkCapabilities != null && networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(13) && networkCapabilities.hasCapability(16);
    }

    private static boolean g(NetworkCapabilities networkCapabilities) {
        return networkCapabilities != null && networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(13);
    }

    public static g0 h(Application application, y yVar) {
        return new g0(yVar, new b0(application.getApplicationContext()), new i0(application.getApplicationContext()));
    }
}
