package com.yalantis.ucrop.compress;

import com.yalantis.ucrop.entity.Compress;

import java.util.ArrayList;

/**
 * 压缩照片
 * <p/>
 * Author luck
 * Date 2017-01-05 下午1:44:26
 */
public interface CompressInterface {
    void compress();

    /**
     * 压缩结果监听器
     */
    interface CompressListener {
        /**
         * 压缩成功
         *
         * @param images 已经压缩图片
         */
        void onCompressSuccess(ArrayList<Compress> images);

        /**
         * 压缩失败
         *
         * @param images 压缩失败的图片
         * @param msg    失败的原因
         */
        void onCompressError(ArrayList<Compress> images, String msg);
    }
}
