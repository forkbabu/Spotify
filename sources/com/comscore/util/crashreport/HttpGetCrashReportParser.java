package com.comscore.util.crashreport;

import com.adjust.sdk.Constants;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

public class HttpGetCrashReportParser implements CrashReportParser {
    private final String a = " | ";
    private final String b = "ns_ap_uxc";

    private String a(String str) {
        try {
            return URLEncoder.encode(str, Constants.ENCODING);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return "";
        }
    }

    private String b(String str) {
        try {
            return URLDecoder.decode(str, Constants.ENCODING);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return "";
        }
    }

    @Override // com.comscore.util.crashreport.CrashReportParser
    public String reportToString(CrashReport crashReport) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : crashReport.getExtras().entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key != null) {
                if (value == null) {
                    value = "";
                }
                sb.append("&");
                sb.append(key);
                sb.append("=");
                sb.append(a(value));
            }
        }
        String message = crashReport.getMessage();
        if (crashReport.getStackTrace() != null) {
            StringBuilder Z0 = je.Z0(message, " | ");
            Z0.append(crashReport.getStackTrace());
            message = Z0.toString();
        }
        sb.append("&");
        sb.append("ns_ap_uxc");
        sb.append("=");
        sb.append(a(message));
        return (sb.length() <= 0 || sb.charAt(0) != '&') ? sb.toString() : sb.substring(1);
    }

    @Override // com.comscore.util.crashreport.CrashReportParser
    public CrashReport stringToReport(String str) {
        String str2;
        HashMap hashMap = new HashMap();
        String[] split = str.split("\\&", -1);
        for (String str3 : split) {
            int indexOf = str3.indexOf("=");
            hashMap.put(str3.substring(0, indexOf), b(str3.substring(indexOf + 1, str3.length())));
        }
        String str4 = (String) hashMap.get("ns_ap_uxc");
        hashMap.remove("ns_ap_uxc");
        String str5 = "";
        if (str4 != null) {
            int indexOf2 = str4.indexOf(" | ");
            if (indexOf2 >= 0) {
                String substring = str4.substring(0, indexOf2);
                String substring2 = str4.substring(indexOf2 + 3, str4.length());
                str4 = substring;
                str5 = substring2;
            }
            str2 = str5;
            str5 = str4;
        } else {
            str2 = str5;
        }
        return new CrashReport(str5, str2, hashMap);
    }
}
