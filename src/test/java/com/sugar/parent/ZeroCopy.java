package com.sugar.parent;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Scanner;

/**
 * @author: chensj
 * @Date: 2020/7/1 3:43 下午
 */
public class ZeroCopy {
    public static void main(String[] args) throws Exception{
        File file = new File("/Users/chenshujia/Downloads/疯人院.txt");
        long length = file.length();
        byte[] ds = new byte[(int)length];
        MappedByteBuffer map = new RandomAccessFile(file,"rw").getChannel().map(FileChannel.MapMode.READ_WRITE,0,length);
        map.put((byte)'v');
        map.put((byte)'e');
        map.put((byte)'f');
//        for (int i = 0; i < length; i++) {
//            byte b = map.get(i);
//            ds[i] = b;
//        }
//        Scanner scanner = new Scanner(new ByteArrayInputStream(ds)).useDelimiter(" ");
//        while (scanner.hasNext()){
//            System.out.println(scanner.next()+" ");
//        }
    }
}
