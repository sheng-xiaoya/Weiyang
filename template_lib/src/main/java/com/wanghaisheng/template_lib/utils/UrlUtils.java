package com.wanghaisheng.template_lib.utils;

import android.graphics.Bitmap;
import android.support.v7.graphics.Palette;

import com.apkfuns.logutils.LogUtils;

import java.text.DecimalFormat;

public class UrlUtils {
    public static String handleUrl(String url, int index) {
//        String.format("%s%s%s",url.substring(0, 33),new DecimalFormat("00").format(index),".jpg");
        return url.substring(0, 33) + new DecimalFormat("00").format(index) + ".jpg";
    }

    public static String url2groupid(String url) {
        return url.split("/")[3];
    }

    public static String makeUrl(String type, String count) {
        String url;
        String page = "";
        if (type.equals("")) {
            page = "page/";
            if (count.equals("")) {
                page = "";
            }
        } else {
            page = "/page/";
            if (count.equals("")) {
                page = "";
            }
        }
        LogUtils.e("http://www.mzitu.com/" + type + page + count);
        return type + page + count;
    }

    public static int getPaletteColor(Bitmap bitmap) {
        int color = -12417291;
        Palette p = Palette.from(bitmap).generate();
        Palette.Swatch vibrant =
                p.getVibrantSwatch();
        Palette.Swatch vibrantdark =
                p.getDarkVibrantSwatch();
        Palette.Swatch vibrantlight =
                p.getLightVibrantSwatch();
        Palette.Swatch Muted =
                p.getMutedSwatch();
        Palette.Swatch Muteddark =
                p.getDarkMutedSwatch();
        Palette.Swatch Mutedlight =
                p.getLightMutedSwatch();

        if (vibrant != null) {
            color = vibrant.getRgb();
        } else if (vibrantdark != null) {
            color = vibrantdark.getRgb();
        } else if (vibrantlight != null) {
            color = vibrantlight.getRgb();
        } else if (Muted != null) {
            color = Muted.getRgb();
        } else if (Muteddark != null) {
            color = Muteddark.getRgb();
        } else if (Mutedlight != null) {
            color = Mutedlight.getRgb();
        }
        return color;
    }



}