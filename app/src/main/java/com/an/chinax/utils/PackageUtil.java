package com.an.chinax.utils;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

public class PackageUtil {
    public static boolean isPackage(Context context, String packageName){
        try {
            PackageManager pm = context.getPackageManager();
            PackageInfo pi = pm.getPackageInfo(packageName.trim(), PackageManager.GET_META_DATA);
            ApplicationInfo appInfo = pi.applicationInfo;
            // 패키지가 있을 경우.
//            Log.d(TAG,"Enabled value = " + appInfo.enabled);
            return true;
        }
        catch (PackageManager.NameNotFoundException e)
        {
//            Log.d(TAG,"패키지가 설치 되어 있지 않습니다.");
            return false;
        }
    }
}
