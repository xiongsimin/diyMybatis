package com.lagou.io;

import java.io.InputStream;

/**
 * @author xiongsm
 */
public class Resources {
    /**
     * 根据配置文件的路径，将配置文件加载成字节输入流，存在内存中
     * @param path
     * @return
     */
    public static InputStream getResourceAsSteam(String path){
        InputStream resourceAsStream =Resources.class.getClassLoader().getResourceAsStream(path);
        return resourceAsStream;
    }
}
