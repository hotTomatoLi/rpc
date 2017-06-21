package com.xxx.rpc.common.util;

import com.dyuproject.protostuff.LinkedBuffer;
import com.dyuproject.protostuff.ProtostuffIOUtil;
import com.dyuproject.protostuff.Schema;
import com.dyuproject.protostuff.runtime.RuntimeSchema;
import com.xxx.rpc.common.model.Book;
import org.junit.Test;
import org.objenesis.Objenesis;
import org.objenesis.ObjenesisStd;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 序列化工具类测试类（基于 Protostuff 实现）
 *
 * @author huangyong
 * @since 1.0.0
 */
public class SerializationUtilTest {


   @Test
   public void testSerialization(){
       Book book = new Book();
       book.setIsbn("9787");
       book.setBookName("书名");

       byte[] result = SerializationUtil.serialize(book);
       System.out.println(result.toString());

       Book decodeRresult = SerializationUtil.deserialize(result, Book.class);
       System.out.println(decodeRresult.getIsbn());
       System.out.println(decodeRresult.getBookName());

   }
}
