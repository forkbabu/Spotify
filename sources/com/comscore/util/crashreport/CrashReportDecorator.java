package com.comscore.util.crashreport;

import com.adjust.sdk.Constants;
import com.comscore.Analytics;
import com.comscore.PublisherConfiguration;
import com.comscore.util.jni.JniComScoreHelper;
import com.comscore.util.setup.PlatformSetup;
import com.comscore.util.setup.Setup;
import com.spotify.player.model.ContextTrack;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Formatter;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class CrashReportDecorator {
    private static final String a = "21193409";
    private static final String b = "9bfbb83ee80ccdee95e73bc93dacd62f";
    private JniComScoreHelper c;
    private long d;
    private String e = null;

    /* access modifiers changed from: private */
    public class a {
        String a;
        boolean b;
        int c;
        int d;
        int e;

        a() {
        }

        a(String str) {
            String trim = str.trim();
            int indexOf = trim.indexOf(32);
            if (indexOf < 0) {
                this.b = false;
                return;
            }
            String substring = trim.substring(0, indexOf);
            this.a = substring;
            String replace = substring.replace(" ", "");
            this.a = replace;
            if (replace.length() == 0) {
                this.b = false;
                return;
            }
            String trim2 = trim.substring(indexOf + 1, trim.length()).trim();
            int indexOf2 = trim2.indexOf(32);
            if (indexOf2 < 0) {
                this.b = false;
                return;
            }
            String substring2 = trim2.substring(0, indexOf2);
            if (substring2.length() != 2) {
                this.b = false;
                return;
            }
            String substring3 = substring2.substring(0, 1);
            String substring4 = substring2.substring(1, 2);
            this.c = Integer.valueOf(substring3).intValue();
            this.d = Integer.valueOf(substring4).intValue();
            String trim3 = trim2.substring(2, trim2.length()).trim();
            int indexOf3 = trim3.indexOf(32);
            if (indexOf3 >= 0) {
                this.b = "true".equals(trim3.substring(0, indexOf3));
                this.e = Integer.valueOf(trim3.substring(indexOf3 + 1, trim3.length()).trim()).intValue();
            }
        }
    }

    public CrashReportDecorator(JniComScoreHelper jniComScoreHelper) {
        this.c = jniComScoreHelper;
        this.d = System.currentTimeMillis();
    }

    private String a() {
        List<PublisherConfiguration> publisherConfigurations = Analytics.getConfiguration().getPublisherConfigurations();
        return (publisherConfigurations == null || publisherConfigurations.size() == 0) ? a : publisherConfigurations.get(0).getPublisherId();
    }

    private String a(byte[] bArr) {
        Formatter formatter = new Formatter();
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            formatter.format("%02x", Byte.valueOf(bArr[i]));
        }
        String formatter2 = formatter.toString();
        formatter.close();
        return formatter2;
    }

    private String b() {
        List<PublisherConfiguration> publisherConfigurations = Analytics.getConfiguration().getPublisherConfigurations();
        if (publisherConfigurations == null || publisherConfigurations.size() == 0) {
            return b;
        }
        int i = 0;
        PublisherConfiguration publisherConfiguration = publisherConfigurations.get(0);
        String[] deviceIds = this.c.getDeviceIds();
        a aVar = null;
        if (deviceIds != null) {
            int length = deviceIds.length;
            while (true) {
                if (i >= length) {
                    break;
                }
                a aVar2 = new a(deviceIds[i]);
                if (aVar2.b) {
                    aVar = aVar2;
                    break;
                }
                i++;
            }
        }
        if (aVar == null) {
            aVar = c();
        }
        StringBuilder V0 = je.V0("zutphen2011comScore@");
        V0.append(publisherConfiguration.getPublisherId());
        StringBuilder Z0 = je.Z0(md5(je.I0(new StringBuilder(), aVar.a, md5(V0.toString()))), "-cs");
        Z0.append(aVar.c);
        Z0.append(aVar.d);
        return Z0.toString();
    }

    private a c() {
        if (this.e == null) {
            this.e = UUID.randomUUID().toString();
        }
        a aVar = new a();
        aVar.a = this.e;
        aVar.c = 7;
        aVar.c = 2;
        return aVar;
    }

    public void fillCrashReport(CrashReport crashReport) {
        Map<String, String> extras = crashReport.getExtras();
        extras.put("c1", "22");
        extras.put("c2", a());
        String applicationName = this.c.getApplicationName();
        if (applicationName == null) {
            applicationName = "";
        }
        extras.put("ns_ap_an", applicationName);
        String osName = this.c.getOsName();
        if (osName == null) {
            osName = "";
        }
        extras.put("ns_ap_pn", osName);
        String runtimeVersion = this.c.getRuntimeVersion();
        if (runtimeVersion == null) {
            runtimeVersion = "";
        }
        extras.put("ns_ap_pv", runtimeVersion);
        extras.put("c12", b());
        extras.put("name", "Application");
        extras.put("ns_ap_ev", "log");
        String deviceModel = this.c.getDeviceModel();
        if (deviceModel == null) {
            deviceModel = "";
        }
        extras.put("ns_ap_device", deviceModel);
        extras.put("ns_ap_id", String.valueOf(this.d));
        String applicationId = this.c.getApplicationId();
        if (applicationId == null) {
            applicationId = "";
        }
        extras.put("ns_ap_bi", applicationId);
        String runtimeName = this.c.getRuntimeName();
        if (runtimeName == null) {
            runtimeName = "";
        }
        extras.put("ns_ap_pfm", runtimeName);
        String osVersion = this.c.getOsVersion();
        if (osVersion == null) {
            osVersion = "";
        }
        extras.put("ns_ap_pfv", osVersion);
        String applicationVersion = this.c.getApplicationVersion();
        if (applicationVersion == null) {
            applicationVersion = "";
        }
        extras.put("ns_ap_ver", applicationVersion);
        PlatformSetup platformSetup = Setup.getPlatformSetup();
        String javaCodeVersion = platformSetup == null ? "" : platformSetup.getJavaCodeVersion();
        if (javaCodeVersion == null) {
            javaCodeVersion = "";
        }
        extras.put("ns_ap_sv", javaCodeVersion);
        extras.put("ns_ap_bv", "");
        extras.put("ns_ap_smv", "");
        extras.put("ns_type", ContextTrack.Metadata.KEY_HIDDEN);
        extras.put("ns_nc", "1");
        extras.put("ns_ap_ar", this.c.getArchitecture());
        extras.put("ns_ap_cfg", "");
        extras.put("ns_ap_env", "");
        extras.put("ns_ap_ais", "");
        extras.put("ns_ap_i7", "");
    }

    /* access modifiers changed from: protected */
    public String md5(String str) {
        byte[] bytes = str.getBytes();
        try {
            MessageDigest instance = MessageDigest.getInstance(Constants.MD5);
            instance.reset();
            instance.update(bytes);
            byte[] digest = instance.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b2 : digest) {
                String hexString = Integer.toHexString(b2 & 255);
                if (hexString.length() == 1) {
                    sb.append('0');
                }
                sb.append(hexString);
            }
            return ((Object) sb) + "";
        } catch (Exception unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public String sha1(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance(Constants.SHA1);
            instance.reset();
            instance.update(str.getBytes(Constants.ENCODING));
            return a(instance.digest());
        } catch (NoSuchAlgorithmException e2) {
            e2.printStackTrace();
        } catch (UnsupportedEncodingException e3) {
            e3.printStackTrace();
        }
        return "";
    }
}
